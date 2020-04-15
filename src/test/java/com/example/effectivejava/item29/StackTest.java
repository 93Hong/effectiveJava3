package com.example.effectivejava.item29;

import org.junit.jupiter.api.Test;

/**
 *
 * @author 93Hong on 2020-04-15
 *
 */
class StackTest {

	@Test
	void test_() {
		String[] strings = {};
		final Stack<String> stringStack = new Stack<>();
		for (String string : strings) {
			stringStack.push(string);
		}

		while(!stringStack.isEmpty()) {
			System.out.println(stringStack.pop().toUpperCase());
		}
	}

}