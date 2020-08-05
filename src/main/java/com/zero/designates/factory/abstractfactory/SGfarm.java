package com.zero.designates.factory.abstractfactory;

/**
 * 韶关农场类
 *
 * @author caofengnian
 * @date 2020-08-05
 */
public class SGfarm implements Farm {
    
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }
    
    @Override
    public Plant newPlant() {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}
