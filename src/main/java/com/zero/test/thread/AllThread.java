package com.zero.test.thread;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread
 *  线程 synchronized 总结
 * @author 17112411 2018/9/19 11:05
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AllThread implements Runnable {
    private int a = 0;

    @Override
    public void run() {
        synchronized(this) {
            a++;
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
      /* synchronized(this) 是对象锁，只是锁定对象
       AllThread all= new AllThread();
        AllThread all2= new AllThread();
        Thread a= new Thread(all);
        Thread a2= new Thread(all2);*/
      /*
      * 调用相同对象会发生阻塞
      * */
        AllThread all= new AllThread();
        Thread a= new Thread(all);
        Thread a2= new Thread(all);
        a.start();
        a2.start();
        try {
            a.join();
            a2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
