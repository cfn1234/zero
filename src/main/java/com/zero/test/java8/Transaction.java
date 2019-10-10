package com.zero.test.java8;

/**
 * com.zero.test.java8
 *
 * @author caofengnian
 * @Date 2019-09-29
 */
public class Transaction {
    private final int id;
    private final Integer value;
    private final Type type;

    public Transaction(int id, Integer value, Type type) {
        this.id = id;
        this.value = value;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public Integer getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        A, B, C, D, GEOCERY
    }
}