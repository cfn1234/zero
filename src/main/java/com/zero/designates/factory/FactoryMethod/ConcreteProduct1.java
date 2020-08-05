package com.zero.designates.factory.FactoryMethod;

/**
 * com.zero.designates.factory.abstractfactory
 * 具体产品1：实现抽象产品中的抽象方法
 *
 * @author caofengnian
 * @date 2020-07-31
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
