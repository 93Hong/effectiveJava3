package com.example.effectivejava.item32;

import java.util.List;

/**
 *
 * @author 93Hong on 2020-04-15
 *
 */
public class Varargs {

	static void dangerous(List<String>... stringLists) {
		final List<Integer> integerList = List.of(42);
		Object[] objects = stringLists;
		objects[0] = integerList;
		final String s = stringLists[0].get(0); // throw ClassCastException
	}

}
