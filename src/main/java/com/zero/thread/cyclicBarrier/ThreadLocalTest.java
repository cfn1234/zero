package com.zero.thread.cyclicBarrier;

/**
 * com.zero.thread.cyclicBarrier
 * 测试ThreadLocal
 *
 * @author caofengnian
 * @date 2020-08-17
 */
public class ThreadLocalTest {
    
    public static void main(String[] args) {
        ThreadLocal<String> stringThreadLocal = new InheritableThreadLocal<>();
    }
}
