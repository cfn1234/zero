package com.zero.test.designpatterns.proxy;

import java.lang.reflect.Proxy;

/**
 * <br>
 * 〈功能详细描述〉动态代理模式
 * com.zero.test.designpatterns.proxy
 *
 * @author 17112411 2018/12/28 11:06
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Image img = new RealImage("fiel");
        Image proxyImage = (Image) Proxy.newProxyInstance(Image.class.getClassLoader(), new Class[]{Image.class}, new DynamicProxyHandler(img));
        proxyImage.display();
    }
}
