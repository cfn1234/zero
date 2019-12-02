package com.zero.test.kafka;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.util.Properties;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.test.kafka
 *
 * @author 17112411 2019/2/20 15:59
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MyProducer {
    //发送消息的topic
    public static final String HASHLEAF_KAFKA_TOPIC = "partopic";
    private final Producer<String, String> producer;

    public MyProducer() {
        Properties props = new Properties();
        //指定代理服务器的地址
        props.put("metadata.broker.list", "192.168.50:9092");

        //配置value的序列化类
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        //配置key的序列化类
        props.put("key.serializer.class", "kafka.serializer.StringEncoder");
        //request.required.acks
        //0, which means that the producer never waits for an acknowledgement from the broker (the same behavior as 0.7). This option provides the lowest latency but the weakest durability guarantees (some data will be lost when a server fails).
        //1, which means that the producer gets an acknowledgement after the leader replica has received the data. This option provides better durability as the client waits until the server acknowledges the request as successful (only messages that were written to the now-dead leader but not yet replicated will be lost).
        //-1, which means that the producer gets an acknowledgement after all in-sync replicas have received the data. This option provides the best durability, we guarantee that no messages will be lost as long as at least one in sync replica remains.
        props.put("request.required.acks", "-1");

        //创建producer 对象
        producer = new Producer<String, String>(new ProducerConfig(props));
    }

    public void produce() {
        int count = 2;
        for (int i = 0; i < count; i++) {
            String key = String.valueOf(i);
            String message = "hashleaf-" + i;
            producer.send(new KeyedMessage<String, String>(HASHLEAF_KAFKA_TOPIC, key, message));
        }

        //发送完成后关闭
        //producer.close();
    }

    public static void main(String[] args) {
        new MyProducer().produce();
    }
}
