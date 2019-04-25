package com.zero.test.thread.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread.reentrantLock
 *
 * @author 17112411 2018/10/9 19:15
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class LockTest {

    public static void main(String[] args) {
//运用内部类的方法实现runnable
        new Thread(new Runnable() {
            @Override
            public void run() {
//调用out方法中的print方法
                out pOut = new out();
                pOut.print("hello");
            }
//开启一个线程
        }).start();
    }
}

class out {
    //调用lock的实现类renntrantlocak
    Lock lock = new ReentrantLock();

    public void print(String name) {
//给当前的name上锁
        lock.lock();
        try {
//打印name的长度
            for (int i = 0; i < name.length(); i++) {
                System.out.println(name.charAt(i));
            }
            System.out.println();
        } finally {
//解锁
            lock.unlock();
        }
    }
}
