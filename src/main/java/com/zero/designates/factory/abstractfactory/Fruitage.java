package com.zero.designates.factory.abstractfactory;

/**
 * com.zero.designates.factory.abstractfactory
 * 具体产品：水果类
 *
 * @author caofengnian
 * @date 2020-08-05
 */
public class Fruitage implements Plant {
    
    @Override
    public void show() {
        System.out.println("水果类");
    }
}
