package com.zero.test.java8.lambda;

import java.util.function.IntBinaryOperator;

/**
 * @author caofengnian
 * @date 2020-07-22
 */
public class Test {
    public static void main(String[] args) {
        IntBinaryOperator binaryOperator = (int a, int b) -> a + b;
        int result = binaryOperator.applyAsInt(1, 4);
        System.out.println(result);
    }
}
