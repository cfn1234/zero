package com.zero.designates.factory.FactoryMethod;

/**
 * 抽象工厂测试类
 *
 * @author caofengnian
 * @date 2020-07-31
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory a = new ConcreteFactory1();
        Product product = a.newProduct();
        product.show();
    }
}
