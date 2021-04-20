package com.zero.thread.synchronizedtest;

/**
 * com.zero.thread.synchronizedtest
 *
 * @author caofengnian
 * @date 2020-09-15
 */
public class test2 {

    public static void main(String[] args) throws InterruptedException {
        test2 n = new test2();
        Thread thread = new Thread(() -> {

            try {
                System.out.println(Thread.currentThread().getName());
                n.add();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread1 = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName());
                n.add();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread1.start();
    }

    public synchronized void add() throws InterruptedException {
        System.out.println("111111");
        Thread.sleep(100000);
    }
}

