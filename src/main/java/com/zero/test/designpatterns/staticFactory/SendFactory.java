package com.zero.test.designpatterns.staticFactory;

import com.zero.test.designpatterns.factory.MailSender;
import com.zero.test.designpatterns.factory.Sender;
import com.zero.test.designpatterns.factory.SmsSender;

/**
 * <br>
 * 〈功能详细描述〉---静态工厂
 * test.designpatterns.staticFactory
 *
 * @author 17112411 2018/12/26 14:33
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SendFactory {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
