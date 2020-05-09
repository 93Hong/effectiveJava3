package com.example.effectivejava.item81;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/**
 *
 * @author 93Hong on 2020-05-09
 *
 */
public class ConcurrentExecutionTime {

	public static long time(Executor executor, int concurrency, Runnable action) throws InterruptedException {
		final CountDownLatch ready = new CountDownLatch(concurrency);
		final CountDownLatch start = new CountDownLatch(1);
		final CountDownLatch done = new CountDownLatch(concurrency);

		for (int i = 0; i < concurrency; i++) {
			executor.execute(() -> {
				ready.countDown();
				try {
					start.await();
					action.run();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				} finally {
					done.countDown();
				}
			});
		}

		ready.await();
		final long startNano = System.nanoTime();
		start.countDown();
		done.await();
		return System.nanoTime() - startNano;
	}

}
