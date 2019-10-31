package com.zero.thread.reentrantLock;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread.reentrantLock
 *
 * @author 17112411 2018/10/15 11:17
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestReentrantReadWriteLock {
    public static void main(String[] args) {
        final TestReentrantReadWriteLock test = new TestReentrantReadWriteLock();

        new Thread("A") {
            @Override
            public void run() {
                test.get(Thread.currentThread());
            }

            ;
        }.start();

        new Thread("B") {
            @Override
            public void run() {
                test.get(Thread.currentThread());
            }

            ;
        }.start();
    }

    public synchronized void get(Thread thread) {
        long start = System.currentTimeMillis();
        System.out.println("线程" + thread.getName() + "开始读操作...");
        while (System.currentTimeMillis() - start <= 1) {
            System.out.println("线程" + thread.getName() + "正在进行读操作...");
        }
        System.out.println("线程" + thread.getName() + "读操作完毕...");
    }
}
