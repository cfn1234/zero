package com.zero.thread;

import java.util.concurrent.CyclicBarrier;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread
 *
 * @author 17112411 2018/9/17 19:40
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class thread3 {
    public static final int INIT_NUM = 5;

    public static void main(String[] args) {
        CyclicBarrier cyc = new CyclicBarrier(INIT_NUM, new Runnable() {
            @Override
            public void run() {
                System.out.println("init cyclicBarrier----");
            }
        });

        for (int i = 0; i < 10; i++) {
            new sampleCyclic(cyc).start();
        }
    }

    private static class sampleCyclic extends Thread {
        CyclicBarrier barrier;

        public sampleCyclic(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            System.out.println("start=====");
            try {
                barrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("id" + Thread.currentThread().getId() + "working----");
        }
    }
}
