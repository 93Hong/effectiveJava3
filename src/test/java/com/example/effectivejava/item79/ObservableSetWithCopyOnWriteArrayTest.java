package com.example.effectivejava.item79;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author 93Hong on 2020-05-09
 *
 */
class ObservableSetWithCopyOnWriteArrayTest {

	@Test
	void test() {
		ObservableSetWithCopyOnWriteArray<Integer> set = new ObservableSetWithCopyOnWriteArray<>(new HashSet<>());

		set.addObserver((s, element) -> System.out.println(element));

		for (int i = 0; i < 100; i++) {
			set.add(i);
		}
	}

	@Test
	void test_no_concurrentModificationException() {
		ObservableSetWithCopyOnWriteArray<Integer> set = new ObservableSetWithCopyOnWriteArray<>(new HashSet<>());

		set.addObserver(new SetObserver2<>() {
			@Override
			public void added(ObservableSetWithCopyOnWriteArray<Integer> set, Integer element) {
				System.out.println(element);
				if (element == 23) {
					set.removeObserver(this);
				}
			}
		});

		Assertions.assertDoesNotThrow(() -> {
			for (int i = 0; i < 100; i++) {
				set.add(i);
			}
		});

	}

	@Test
	void test_no_deadlock() {
		ObservableSetWithCopyOnWriteArray<Integer> set = new ObservableSetWithCopyOnWriteArray<>(new HashSet<>());

		set.addObserver(new SetObserver2<>() {
			@Override
			public void added(ObservableSetWithCopyOnWriteArray<Integer> s, Integer element) {
				System.out.println(element);
				if (element == 23) {
					ExecutorService executorService = Executors.newSingleThreadExecutor();
					try {
						executorService.submit(() -> s.removeObserver(this)).get();
					} catch (ExecutionException | InterruptedException ex) {
						throw new AssertionError(ex);
					} finally {
						executorService.shutdown();
					}
				}
			}
		});

		for (int i = 0; i < 100; i++) {
			set.add(i);
		}
	}

}