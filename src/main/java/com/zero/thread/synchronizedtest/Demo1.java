package com.zero.thread.synchronizedtest;

/**
 * 同步锁
 *
 * @author caofengnian
 * @date 2020-05-14
 */
public class Demo1 {
	
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		demo1.functionA();
	}
	
	public synchronized void functionA() {
		System.out.println("iAmFunctionA");
		functionB();
	}
	
	public synchronized void functionB() {
		System.out.println("iAmFunctionB");
	}
	
}
