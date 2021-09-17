package com.zero.thread.synchronizedtest;

import java.util.concurrent.TimeUnit;

/**
 * 同步锁
 *
 * @author caofengnian
 * @date 2020-05-14
 */
public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		Demo1 demo1 = new Demo1();
		demo1.functionA();
		new Thread(() -> {
			synchronized (demo1) {
				System.out.println("a");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		TimeUnit.MILLISECONDS.sleep(10);
		new Thread(() -> {
			Thread.onSpinWait();
			synchronized (demo1) {
				System.out.println("b");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		TimeUnit.MILLISECONDS.sleep(10);
		new Thread(() -> {
			synchronized (demo1) {
				System.out.println("c");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		TimeUnit.MILLISECONDS.sleep(10);
		new Thread(() -> {
			synchronized (demo1) {
				System.out.println("d");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	public void functionA() {
		System.out.println("iAmFunctionA");
		functionB();
	}

	public synchronized void functionB() {
		System.out.println("iAmFunctionB");
	}

}
