package com.zero.thread.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread.reentrantLock
 *
 * @author 17112411 2018/10/9 16:57
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ReentrantLockTest implements Runnable {

    public static ReentrantLock lock = new ReentrantLock();
    public static int i = 0;

    @Override
    public void run() {
        for (int j = 0; j < 10000; j++) {
            lock.lock();  // 看这里就可以
            //lock.lock(); ①
            try {
                i++;
            } finally {
                lock.unlock(); // 看这里就可以
                //lock.unlock();②
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockTest test = new ReentrantLockTest();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();
        t2.start();
        // main线程会等待t1和t2都运行完再执行以后的流程
        t1.join();
        t2.join();
        System.err.println(i);
    }
}
