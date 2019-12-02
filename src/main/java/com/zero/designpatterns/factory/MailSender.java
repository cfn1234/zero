package com.zero.designpatterns.factory;

/**
 * <br>
 * 〈功能详细描述〉
 * test.designpatterns.factory
 *
 * @author 17112411 2018/12/26 14:17
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
