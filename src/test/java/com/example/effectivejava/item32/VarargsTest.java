package com.example.effectivejava.item32;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author 93Hong on 2020-04-15
 *
 */
class VarargsTest {

	@Test
	void test() {

		assertThrows(ClassCastException.class, () -> {
			List<String> a = new ArrayList<>();
			List<String> b = new ArrayList<>();
			Varargs.dangerous(a, b);
		});

	}

	@Test
	void test_pickTwo() {

		assertThrows(ClassCastException.class, () -> {
			// ClassCastException >> String[] = Object[]
			final String[] strings = pickTwo("aa", "bb", "cc");
		});

		final Object[] strings = pickTwo("aa", "bb", "cc");

		Object[] objects = null;
		String[] strings1 = null;
		strings1 = (String[])objects;
		objects = strings1;

	}

	static <T> T[] toArray(T... args) {
		return args;
	}

	static <T> T[] pickTwo(T a, T b, T c) {
		switch (ThreadLocalRandom.current().nextInt(3)) {
			case 0 : return toArray(a, b); // Object[] (a, b) 생성 <- return type T[]의 타입은 컴파일 타임에 결정 (== Object[])
			case 1 : return toArray(a, c);
			case 2 : return toArray(b, c);
		}
		throw new AssertionError();
	}

}