package com.example.effectivejava.item38;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

/**
 *
 * @author 93Hong on 2020-04-18
 *
 */
class BasicOperationTest {

	@Test
	void test() {
		final Operation[] enumConstants = BasicOperation.class.getEnumConstants();
		Stream.of(enumConstants).forEach(operation -> System.out.println(operation.toString()));
	}

}