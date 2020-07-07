package com.zero.genericity;

/**
 * java泛型测试
 * com.zero.genericity
 *
 * @author caofengnian
 * @Date 2019-12-16
 */
public class Generic<T> {

    //key这个成员变量的类型为T,T的类型由外部指定
    private final T key;

    public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public static void main(String[] args) {
        //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型

        //传入的实参类型需与泛型的类型参数类型相同，即为Integer.
        Generic<Integer> genericInteger = new Generic<>(123456);
        //传入的实参类型需与泛型的类型参数类型相同，即为String.
        Generic<String> genericString = new Generic<String>("key_vlaue");
        System.out.println("泛型测试,key is " + genericInteger.getKey());
        System.out.println("泛型测试,key is " + genericString.getKey());
        Generic generic = new Generic("111111");
        Generic generic1 = new Generic(4444);
        Generic generic2 = new Generic(55.55);
        Generic generic3 = new Generic(false);

        System.out.println("泛型测试,key is " + generic.getKey());
        System.out.println("泛型测试,key is " + generic1.getKey());
        System.out.println("泛型测试,key is " + generic2.getKey());
        System.out.println("泛型测试,key is " + generic3.getKey());
    }

    public T getKey() { //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }

}