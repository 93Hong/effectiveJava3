package com.example.effectivejava.item7;

import org.junit.jupiter.api.Test;

import java.util.WeakHashMap;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
class WeakHashMapTest {

	@Test
	void test_weakHashMap() {

		final WeakHashMap<KeyObject, Stack> stringStackWeakHashMap = new WeakHashMap<>();

		KeyObject integerKey = new KeyObject();
		KeyObject longKey = new KeyObject();

		stringStackWeakHashMap.put(integerKey, new Stack(new Integer[]{3, 4}));
		stringStackWeakHashMap.put(longKey, new Stack(new Long[]{3L, 4L}));

		longKey = null;

	}

}