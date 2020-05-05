package com.example.effectivejava.item52;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author 93Hong on 2020-05-05
 *
 */
public class SetList {

	@Test
	void test_overriding() {
		final TreeSet<Integer> treeSet = new TreeSet<>();
		final ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = -3; i < 3; i++) {
			treeSet.add(i);
			arrayList.add(i);
		}

		for (int i = 0; i < 3; i++) {
			treeSet.remove(i);
			arrayList.remove((Integer) i);
		}

		System.out.println(treeSet + " " + arrayList);
	}

	@Test
	void test_overriding2() {
		// Thread constructor
		new Thread(System.out::println).start();

		// ExecutorService submit
		final ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.submit((Runnable)System.out::println);

	}

}
