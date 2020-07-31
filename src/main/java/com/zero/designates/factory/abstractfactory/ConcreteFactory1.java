package com.zero.designates.factory.abstractfactory;

/**
 * com.zero.designates.factory.abstractfactory
 *
 * @author caofengnian
 * @date 2020-07-31
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        return new ConcreteProduct1();
    }
}
