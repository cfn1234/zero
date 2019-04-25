package com.zero.test.thread;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread
 * 线程synchronized关键字
 *
 * @author 17112411 2018/9/12 11:18
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AccountingSync implements Runnable {
    //共享资源(临界资源)
    static int i = 0;
    /**
     * synchronized 修饰实例方法
     */
    public synchronized void increase(){
        i++;
    }
    @Override
    public void run() {
        for(int j=0;j<1000000;j++){
            increase();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        AccountingSync instance=new AccountingSync();
        Thread t1=new Thread(instance);
        Thread t2=new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
