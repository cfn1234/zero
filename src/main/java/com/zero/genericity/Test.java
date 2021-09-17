package com.zero.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * com.zero.genericity
 *
 * @author caofengnian
 * @Date 2019-12-16
 */
public class Test {
	public static void main(String[] args) {

		GenericFruit.Apple apple = new GenericFruit.Apple();
		GenericFruit.Person person = new GenericFruit.Person();
		List<GenericFruit.Apple> list = new ArrayList<>();
		getList(list);
		GenericFruit.GenerateTest<GenericFruit.Fruit> generateTest = new GenericFruit.GenerateTest<>();
		//apple是Fruit的子类，所以这里可以
		generateTest.show_1(apple);
		//编译器会报错，因为泛型类型实参指定的是Fruit，而传入的实参类是Person
		//generateTest.show_1(person);

		//使用这两个方法都可以成功
		generateTest.show_2(apple);
		generateTest.show_2(person);

		//使用这两个方法也都可以成功
		generateTest.show_3(apple);
		generateTest.show_3(person);
	}

	public static <T extends GenericFruit.Fruit> void getList(List<T> list) {
		String a = "Hello";
		// \u000d a="world";
		System.out.println(a);
		// \u000a a="hello world!";
		System.out.println(a);
	}
}