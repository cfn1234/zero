package com.zero.designates.factory.FactoryMethod;

/**
 * com.zero.designates.factory.abstractfactory
 *
 * @author caofengnian
 * @date 2020-07-31
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
