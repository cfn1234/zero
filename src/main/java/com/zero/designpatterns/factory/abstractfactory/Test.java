package com.zero.designpatterns.factory.abstractfactory;

import com.zero.designpatterns.factory.Sender;

/**
 * <br>
 * 〈功能详细描述〉
 * test.designpatterns.abstractFactory
 *
 * @author 17112411 2018/12/26 15:49
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
