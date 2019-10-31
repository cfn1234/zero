package com.zero.thread;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread
 * 银行账户类 ----指定要给某个对象加锁
 *
 * @author 17112411 2018/9/18 14:55
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Account {

    String name;

    float amount;

    public Account(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }

    //存钱
    public void deposit(float amt) {
        amount += amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //取钱
    public void withdraw(float amt) {
        amount -= amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public float getBalance() {
        return amount;
    }

}
