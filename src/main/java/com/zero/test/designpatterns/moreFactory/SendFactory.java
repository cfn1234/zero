package com.zero.test.designpatterns.moreFactory;

import com.zero.test.designpatterns.factory.MailSender;
import com.zero.test.designpatterns.factory.Sender;
import com.zero.test.designpatterns.factory.SmsSender;

/**
 * <br>
 * 〈功能详细描述〉--多个工厂模式
 * test.designpatterns.moreFactory
 *
 * @author 17112411 2018/12/26 14:28
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SendFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
