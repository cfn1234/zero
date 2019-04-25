package com.zero.test.thread;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread
 *
 * @author 17112411 2018/9/12 17:37
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AccountingSyncClass implements Runnable {
    static int i = 0;

    /**
     * 作用于静态方法,锁是当前class对象,也就是
     * AccountingSyncClass类对应的class对象
     */
    public static synchronized void increase() {
        i++;
    }

    /**
     * 非静态,访问时锁不一样不会发生互斥
     */
    public synchronized void increase4Obj() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
            increase();
            /*对象锁不同
            increase4Obj();*/
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //new新实例
        Thread t1 = new Thread(new AccountingSyncClass());
        //new新实例
        Thread t2 = new Thread(new AccountingSyncClass());
        //启动线程
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
