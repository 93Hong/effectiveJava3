package com.example.effectivejava.item31;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-15
 *
 */
class Item31StackTest {

	@Test
	void test() {
		final Item31Stack<Number> numberItem31Stack = new Item31Stack<>();
		Iterable<Integer> integers = null;
		numberItem31Stack.pushAll(integers);

		Collection<Object> objects = null;
		numberItem31Stack.popAll(objects);
	}

}