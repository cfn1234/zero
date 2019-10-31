package com.zero.thread;

/**
 * <br>
 * 〈功能详细描述〉--测试join
 * test.thread
 *
 * @author 17112411 2018/9/26 2:42
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ThreadJoin {
    public static void main(String[] args) {
        Testjoin t = new Testjoin("a new  Thread");
        t.start();
       /* try {
            //等待被join线程执行完毕，也就是新线程执行完毕主线程才可以继续向下合并执行
            t.join();
        } catch (InterruptedException e) {
        }*/
        for (int i = 0; i < 10; i++) {

            System.out.println("i am main Thread");
        }
    }
}

class Testjoin extends Thread {
    public Testjoin(String s) {
        super(s); // 从父类继承的构造方法，得到线程的名字
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i am" + getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

}
