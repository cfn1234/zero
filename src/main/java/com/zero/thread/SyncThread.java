package com.zero.thread;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread
 *
 * @author 17112411 2018/9/18 11:01
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SyncThread implements Runnable {
    private static int count;

    public SyncThread() {
        count = 0;
    }

    @Override
    public void run() {
        synchronized (SyncThread.class) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCount() {
        return count;
    }
}

class Demo00 {
    public static void main(String args[]) {
//test01
/*		SyncThread s1 = new SyncThread();
		SyncThread s2 = new SyncThread();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);*/
//test02
        SyncThread s = new SyncThread();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();
    }

}
