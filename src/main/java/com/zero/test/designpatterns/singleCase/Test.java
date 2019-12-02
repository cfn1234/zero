package com.zero.test.designpatterns.singleCase;

/**
 * <br>
 * 〈功能详细描述〉--单例模式
 * test.designpatterns.singleCase
 *
 * @author 17112411 2018/12/26 16:33
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton s = Singleton.getInstance();
                System.out.println(s);
            }
        });
        t.start();
    }
}
