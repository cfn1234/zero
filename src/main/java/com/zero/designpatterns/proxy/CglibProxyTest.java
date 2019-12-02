package com.zero.designpatterns.proxy;

/**
 * <br>
 * 〈功能详细描述〉
 * com.zero.test.designpatterns.proxy
 *
 * @author 17112411 2018/12/28 14:47
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        Image img = new RealImage("fiel");
        CglibProxy cglibProxy = new CglibProxy();
        RealImage realImageCglibProxy = (RealImage) cglibProxy.getInstance(img, new Class[]{String.class}, new Object[]{"file"});
        realImageCglibProxy.display();
    }
}
