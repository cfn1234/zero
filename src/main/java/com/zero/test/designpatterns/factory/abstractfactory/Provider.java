package com.zero.test.designpatterns.factory.abstractfactory;

import com.zero.test.designpatterns.factory.Sender;

/**
 * <br>
 * 〈功能详细描述〉
 * test.designpatterns.abstractFactory
 *
 * @author 17112411 2018/12/26 14:50
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface Provider {
    public Sender produce();
}
