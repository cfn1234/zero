package com.zero.designates.bulider;

/**
 * com.zero.designates.bulider
 *
 * @author caofengnian
 * @date 2020-08-26
 */
public class Client {
    
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
