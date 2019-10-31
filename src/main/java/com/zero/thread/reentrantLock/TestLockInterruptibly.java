package com.zero.thread.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread.reentrantLock
 *
 * @author 17112411 2018/10/15 9:34
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestLockInterruptibly {

    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        TestLockInterruptibly test = new TestLockInterruptibly();
        MyThread2 thread1 = new MyThread2(test, "A");
        MyThread2 thread2 = new MyThread2(test, "B");
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.interrupt();
    }

    public void insert(Thread thread) throws InterruptedException {
        //注意，如果需要正确中断等待锁的线程，必须将获取锁放在外面，然后将 InterruptedException 抛出
        lock.lockInterruptibly();
        try {
            System.out.println("线程 " + thread.getName() + "得到了锁...");
            long startTime = System.currentTimeMillis();
            for(    ;     ; ) {              // 耗时操作
                if(System.currentTimeMillis() - startTime >= Integer.MAX_VALUE){
                    System.out.println("1111");
                    break;
                }
                //插入数据
            }
        } finally {
            System.out.println(Thread.currentThread().getName() + "执行finally...");
            lock.unlock();
            System.out.println("线程 " + thread.getName() + "释放了锁");
        }
        System.out.println("over");
    }
}

class MyThread2 extends Thread {
    private TestLockInterruptibly test = null;

    public MyThread2(TestLockInterruptibly test, String name) {
        super(name);
        this.test = test;
    }

    @Override
    public void run() {
        try {
            test.insert(Thread.currentThread());
        } catch (InterruptedException e) {
            System.out.println("线程 " + Thread.currentThread().getName() + "被中断...");
        }
    }

}
