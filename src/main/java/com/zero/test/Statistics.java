package com.zero.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

/**
 * com.zero.test
 * java hashtable 数据统计，计数功能
 *
 * @author caofengnian
 * @date 2020-08-20
 */
public class Statistics {
    public static void main(String[] args) {
        List counter = new ArrayList(Arrays.asList(1, 2, 3, 1, 3, "b", "aa", "b", "b"));
        Hashtable ht = new Hashtable();
        // 统计数组中每个元素出现的次数
        for (int i = 0; i < counter.size(); i++) {
            if (ht.containsKey(counter.get(i))) {
                ((Counter) ht.get(counter.get(i))).i++;
            } else {
                ht.put(counter.get(i), new Counter());
            }
        }
        
        // 生成20个30以内的随机数统计出现频次
        for (int i = 0; i < 20; i++) {
            int r = (int) (Math.random() * 30);
            if (ht.containsKey(r)) {
                ((Counter) ht.get(r)).i++;
            } else {
                ht.put(r, new Counter());
            }
        }
        System.out.println(ht);
        
    }
}

class Counter {
    int i = 1;
    
    @Override
    public String toString() {
        return Integer.toString(i);
    }
}