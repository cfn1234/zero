package com.zero.test.jvm;

/**
 * com.zero.test.jvm
 * 测试StackOverflowError异常 栈溢出
 *
 * @author caofengnian
 * @date 2020-08-21
 */
public class StackErrorMock {
    
    private static int index = 1;
    
    public static void main(String[] args) {
        StackErrorMock mock = new StackErrorMock();
        try {
            mock.call();
        } catch (Throwable e) {
            System.out.println("Stack deep : " + index);
            e.printStackTrace();
        }
    }
    
    public void call() {
        index++;
        call();
    }
}
