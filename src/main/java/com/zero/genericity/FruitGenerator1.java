package com.zero.genericity;

import java.util.Random;

/**
 * com.zero.genericity
 *
 * @author caofengnian
 * @Date 2019-12-16
 */
public class FruitGenerator1 implements Generator<String> {

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}