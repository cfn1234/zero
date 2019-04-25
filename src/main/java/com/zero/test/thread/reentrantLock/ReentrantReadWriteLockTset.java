package com.zero.test.thread.reentrantLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread.reentrantLock
 *
 * @author 17112411 2018/10/16 17:20
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ReentrantReadWriteLockTset {

    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public void get(Thread thread) {
        rwl.readLock().lock(); // 在外面获取锁
        try {
            long start = System.currentTimeMillis();
            System.out.println("线程" + thread.getName() + "开始读操作...");
            while (System.currentTimeMillis() - start <= 1) {
                System.out.println("线程" + thread.getName() + "正在进行读操作...");
            }
            System.out.println("线程" + thread.getName() + "读操作完毕...");
        } finally {
            rwl.readLock().unlock();
        }
    }
}
