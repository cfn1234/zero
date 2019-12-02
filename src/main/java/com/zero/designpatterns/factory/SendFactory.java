package com.zero.designpatterns.factory;

/**
 * <br>
 * 〈功能详细描述〉---工厂模式
 * test.designpatterns.factory
 *
 * @author 17112411 2018/12/26 14:19
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
