package com.zero.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.test.designpatterns.proxy
 *
 * @author 17112411 2018/12/28 10:59
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(Object object){
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理");
        Object result = method.invoke(object, args);
        return result;
    }
}
