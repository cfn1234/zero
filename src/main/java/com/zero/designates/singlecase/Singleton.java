package com.zero.designates.singlecase;

/**
 * <br>
 * 〈功能详细描述〉---单例模式
 * test.designpatterns.singleCase
 *
 * @author 17112411 2018/12/26 16:24
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Singleton {
    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    /* 获取实例 */
    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
