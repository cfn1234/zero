package com.zero.test.designpatterns.abstractFactory;

import com.zero.test.designpatterns.factory.MailSender;
import com.zero.test.designpatterns.factory.Sender;

/**
 * <br>
 * 〈功能详细描述〉
 * test.designpatterns.abstractFactory
 *
 * @author 17112411 2018/12/26 15:24
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
