package com.zero.designates.factory.abstractfactory;

/**
 * com.zero.designates.factory.abstractfactory
 * 抽象工厂：农场类
 *
 * @author caofengnian
 * @date 2020-08-05
 */
public interface Farm {
    Animal newAnimal();
    
    Plant newPlant();
    
}
