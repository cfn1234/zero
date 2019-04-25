package com.zero.test.thread;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread
 *
 * @author 17112411 2018/9/19 11:12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AllThread1 extends Thread{
    private static int a = 0;

    public static synchronized void add() {
        a++;
        System.out.println(a);
    }
    @Override
    public void run(){
        add();
    }

    public static void main(String[] args) {
        AllThread1 xx= new AllThread1();
        AllThread1 xx1= new AllThread1();
        xx.start();
        xx1.start();
    }
}
