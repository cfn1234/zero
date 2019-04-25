package com.zero.test.thread;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread
 *
 * @author 17112411 2018/9/18 14:56
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AccountOperator implements Runnable {
    private Account account;

    public AccountOperator(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (account) {
            account.deposit(500);
            account.withdraw(500);
            System.out.println(Thread.currentThread().getName() + ":" + account.getBalance());
        }
    }
    public static class xx{
        //public static final Object signal = new Object(); // 线程间通信变量
        //将account改为Demo00.signal也能实现线程同步
        public static void main(String args[]){
            Account account = new Account("zhang san", 10000.0f);
            AccountOperator accountOperator = new AccountOperator(account);
            final int THREAD_NUM = 5;
            Thread threads[] = new Thread[THREAD_NUM];
            for (int i = 0; i < THREAD_NUM; i ++) {
                threads[i] = new Thread(accountOperator, "Thread" + i);
                threads[i].start();
            }
        }

    }
}
