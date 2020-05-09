package com.example.effectivejava.item79;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-05-09
 *
 */
class ObservableSetTest {

	@Test
	void test() {
		ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());

		set.addObserver((s, element) -> System.out.println(element));

		for (int i = 0; i < 100; i++) {
			set.add(i);
		}
	}

	@Test
	void test_concurrentModificationException() {
		ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());

		set.addObserver(new SetObserver<>() {
			@Override
			public void added(ObservableSet<Integer> set, Integer element) {
				System.out.println(element);
				if (element == 23) {
					set.removeObserver(this);
				}
			}
		});

		Assertions.assertThrows(ConcurrentModificationException.class, () -> {
			for (int i = 0; i < 100; i++) {
				set.add(i);
			}
		});

	}

	@Test
	void test_deadlock() {
		ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());

		set.addObserver(new SetObserver<>() {
			@Override
			public void added(ObservableSet<Integer> s, Integer element) {
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