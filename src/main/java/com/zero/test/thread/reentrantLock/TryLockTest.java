package com.zero.test.thread.reentrantLock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread.reentrantLock
 *
 * @author 17112411 2018/10/11 15:31
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TryLockTest {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    // 注意这个地方：lock 被声明为成员变量
    private Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        final TryLockTest test = new TryLockTest();
        new Thread("A") {
            @Override
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        new Thread("B") {
            @Override
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
    }

    public void insert(Thread thread) {
        if (lock.tryLock()) {     // 使用 tryLock()
            try {
                System.out.println("线程" + thread.getName() + "得到了锁...");
                for (int i = 0; i < 5; i++) {
                    arrayList.add(i);
                }
            } catch (Exception e) {

            } finally {
                System.out.println("线程" + thread.getName() + "释放了锁...");
                lock.unlock();
            }
        } else {
            System.out.println("线程" + thread.getName() + "获取锁失败...");
        }
    }
}
