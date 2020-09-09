package com.zero.designates.bulider;

/**
 * com.zero.designates.bulider
 * 指挥者：调用建造者中的方法完成复杂对象的创建
 *
 * @author caofengnian
 * @date 2020-08-26
 */
public class Director {
    
    private final Builder builder;
    
    public Director(Builder builder) {
        this.builder = builder;
    }
    
    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
