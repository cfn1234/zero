package com.zero.test.thread;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread
 * 实例化
 * @author 17112411 2018/9/13 9:19
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AccountingSync1 implements  Runnable{
    static AccountingSync1 instance=new AccountingSync1();
    static int i=0;
    @Override
    public void run() {
        //省略其他耗时操作....
        //使用同步代码块对变量i进行同步操作,锁对象为instance
        synchronized(instance){
            for(int j=0;j<1000000;j++){
                i++;
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(instance);
        Thread t2=new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }

}
