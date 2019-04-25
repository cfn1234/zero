package com.zero.test.designpatterns.factory;

/**
 * <br>
 * 〈功能详细描述〉
 * test.designpatterns.factory
 *
 * @author 17112411 2018/12/26 14:20
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
    }
}
