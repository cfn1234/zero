package com.zero.thread.threadPool;

import java.util.concurrent.*;

/**
 * @author: cfn
 * @date: 2021/9/22 16:42
 * @description:
 */
public class ThreadPoolTest1 {
	public static void main(String[] args) {
		BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);
		ThreadFactory factory = r -> new Thread(r, "test-thread-pool");
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5,
				0L, TimeUnit.SECONDS, queue, factory);
		while (true) {
			executor.submit(() -> {
				try {
					System.out.println(queue.size());
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
	}
}
