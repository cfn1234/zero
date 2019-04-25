package com.zero.test.thread.reentrantLock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread.reentrantLock
 *
 * @author 17112411 2018/10/11 9:44
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ReentrantLockTest1 {

    private ArrayList<Integer> arrayList = new ArrayList<>();
    private Lock lock = new ReentrantLock();  // 注意这个地方:lock被声明为成员变量
    public static void main(String[] args) {
        final ReentrantLockTest1 test = new ReentrantLockTest1();

        new Thread("A") {
            @Override
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();

        new Thread("B") {
            @Override
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
    }
    public void insert(Thread thread) {
        lock.lock();
        try {
            System.out.println("线程" + thread.getName() + "得到了锁...");
            for (int i = 0; i < 5; i++) {
                arrayList.add(i);
            }
            System.out.println(arrayList.size());
        } catch (Exception e) {

        } finally {
            System.out.println("线程" + thread.getName() + "释放了锁...");
            lock.unlock();
        }
    }
}
