package com.zero.designates.factory.abstractfactory;


import com.zero.designates.factory.Sender;
import com.zero.designates.factory.SmsSender;

/**
 * <br>
 * 〈功能详细描述〉
 * test.designpatterns.abstractFactory
 *
 * @author 17112411 2018/12/26 15:25
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
