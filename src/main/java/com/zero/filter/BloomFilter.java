package com.zero.filter;

import com.google.common.hash.Funnels;
import com.google.common.hash.Hashing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Nullable;
import javax.annotation.PostConstruct;
import java.nio.charset.Charset;
import java.util.List;

/**
 * <br>布隆过滤器
 * 〈功能详细描述〉
 * com.zero.filter
 *
 * @author 17112411 2019/2/13 10:01
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BloomFilter {
    //布隆过滤器的键在Redis中的前缀 利用它可以统计过滤器对Redis的使用情况
    private static String redisKeyPrefix = "bf:";
    /**
     * (自动注入redisTemplet)
     */
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    //预计插入量
    private long expectedInsertions = 1000;
    //可接受的错误率
    private double fpp = 0.001F;
    //bit数组长度
    private long numBits = optimalNumOfBits(expectedInsertions, fpp);
    //hash函数数量
    private int numHashFunctions = optimalNumOfHashFunctions(expectedInsertions, numBits);

    private static String getRedisKey(String where) {
        return redisKeyPrefix + where;
    }

    //利用该初始化方法从Redis连接池中获取一个Redis链接
    @PostConstruct
    public void init() {
    }

    public void setExpectedInsertions(long expectedInsertions) {
        this.expectedInsertions = expectedInsertions;
    }

    public void setFpp(double fpp) {
        this.fpp = fpp;
    }

    public void setRedisKeyPrefix(String redisKeyPrefix) {
        redisKeyPrefix = redisKeyPrefix;
    }

    //计算hash函数个数 方法来自guava
    private int optimalNumOfHashFunctions(long n, long m) {
        return Math.max(1, (int) Math.round((double) m / n * Math.log(2)));
    }

    //计算bit数组长度 方法来自guava
    private long optimalNumOfBits(long n, double p) {
        if (p == 0) {
            p = Double.MIN_VALUE;
        }
        return (long) (-n * Math.log(p) / (Math.log(2) * Math.log(2)));
    }

    /**
     * 判断keys是否存在于集合where中
     */
    public boolean isExist(String where, String key) {
        long[] indexs = getIndexs(key);
        boolean result;
        //这里使用了Redis管道来降低过滤器运行当中访问Redis次数 降低Redis并发量
        List<Object> List = redisTemplate.executePipelined(new RedisCallback<Object>() {
            @Nullable
            @Override
            public Object doInRedis(RedisConnection connection) throws DataAccessException {
                connection.openPipeline();
                for (long index : indexs) {
                    connection.getBit(getRedisKey(where).getBytes(), index);
                }
                return null;
            }
        });
        result = !List.contains(false);
        if (!result) {
            put(where, key);
        }
        return result;
    }

    /**
     * 将key存入redis bitmap
     */
    private void put(String where, String key) {
       /* long[] indexs = getIndexs(key);
        //这里使用了Redis管道来降低过滤器运行当中访问Redis次数 降低Redis并发量
        Pipeline pipeline = jedis.pipelined();
        try {
            for (long index : indexs) {
                pipeline.setbit(getRedisKey(where), index, true);
            }
            pipeline.sync();
        } finally {
            try {
                pipeline.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }

    /**
     * 根据key获取bitmap下标 方法来自guava
     */
    private long[] getIndexs(String key) {
        long hash1 = hash(key);
        long hash2 = hash1 >>> 16;
        long[] result = new long[numHashFunctions];
        for (int i = 0; i < numHashFunctions; i++) {
            long combinedHash = hash1 + i * hash2;
            if (combinedHash < 0) {
                combinedHash = ~combinedHash;
            }
            result[i] = combinedHash % numBits;
        }
        return result;
    }

    /**
     * 获取一个hash值 方法来自guava
     */
    private long hash(String key) {
        Charset charset = Charset.forName("UTF-8");
        return Hashing.murmur3_128().hashObject(key, Funnels.stringFunnel(charset)).asLong();
    }

}
