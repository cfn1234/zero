package com.zero.designates.bulider;

/**
 * com.zero.designates.bulider
 * 具体建造者：实现了抽象建造者接口
 *
 * @author caofengnian
 * @date 2020-08-26
 */
public class ConcreteBuilder extends Builder {
    
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }
    
    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }
    
    @Override
    public void buildPartC() {
        product.setPartC("建造 CPartC");
    }
}
