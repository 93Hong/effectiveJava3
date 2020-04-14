package com.example.effectivejava.item26;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-14
 *
 */
class DoNotUseRowTypeTest<E> {

	@Test
	void test_(E e) {
		final HashSet<?> objects = new HashSet<String>();
		final HashSet<?> objects2 = new HashSet<Integer>();
		final HashSet<?> objects3 = new HashSet<DoNotUseRowTypeTest>();
		final HashSet<?> objects4 = new HashSet<E>();
		objects.add(null);
		//objects.add("string");

	}

}