package com.zero.thread;

import java.util.concurrent.TimeUnit;

/**
 * <br>
 * 〈功能详细描述〉---中断线程
 * test.thread
 *
 * @author 17112411 2018/9/14 9:42
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class InterruputSleepThread3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                //while在try中，通过异常中断就可以退出run循环
                try {
                    while (true) {
                        System.out.println("执行次数"+System.currentTimeMillis());
                        //当前线程处于阻塞状态，异常必须捕捉处理，无法往外抛出
                        TimeUnit.SECONDS.sleep(10);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Interruted When Sleep");
                    boolean interrupt = this.isInterrupted();
                    //中断状态被复位
                    System.out.println("interrupt:"+interrupt);
                }
            }
        };
        t1.start();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("线程启动"+t1.isInterrupted());
        //中断处于阻塞状态的线程
        t1.interrupt();
        /**
         * 输出结果:
         Interruted When Sleep
         interrupt:false
         */
    }
}
