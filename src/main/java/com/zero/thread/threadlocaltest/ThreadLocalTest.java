package com.zero.thread.threadlocaltest;

/**
 * @author: cfn
 * @date: 2021/11/5 11:39
 * @description: threadLocal测试
 */
public class ThreadLocalTest {

	static ThreadLocal<String> localVar = new ThreadLocal<>();

	static void print(String str) {
		//打印当前线程中本地内存中本地变量的值
		System.out.println(str + " :" + localVar.get());
		//清除本地内存中的本地变量
		localVar.remove();
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			//设置线程1中本地变量的值
			localVar.set("localVar1");
			/*try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/

			localVar.set("localVar10");
			//调用打印方法
			print("thread1");
			//打印本地变量
			System.out.println("after remove : " + localVar.get());
		});
		Thread t2 = new Thread(() -> {
			//设置线程1中本地变量的值
			localVar.set("localVar2");
			//调用打印方法
			print("thread2");
			//打印本地变量
			System.out.println("after remove : " + localVar.get());
		});

		t1.start();
		t2.start();
	}
}
