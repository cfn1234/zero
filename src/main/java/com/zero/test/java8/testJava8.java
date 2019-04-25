package com.zero.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class testJava8 {
    public static void main(String[] args) {

        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        Object a = null;
        languages.forEach((k) -> {
            System.out.println("Item : " + k );
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });
        System.out.println("Languages which starts with J :");
        Predicate condition = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };
        String Str = new String();
        filter(languages, str ->((String)str).startsWith("J"));

    }

    public static void filter(List names, Predicate condition) {
        for (Object name : names) {
            if (condition.test(name)) {
                System.out.println(name + "xxxxxxx");
            }
        }
    }

    public int add(int x, int y) {
        return x + y;
    }
}