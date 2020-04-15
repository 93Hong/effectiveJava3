package com.example.effectivejava.item30;

import org.junit.jupiter.api.Test;

import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-15
 *
 */
class GenericTestTest {

	@Test
	void test_() {

		final UnaryOperator<String> objectUnaryOperator = GenericTest.identityFunction();
		objectUnaryOperator.apply("str");

		Number[] numbers = {1, 2};
		final UnaryOperator<Number> numberUnaryOperator = GenericTest.identityFunction();
		numberUnaryOperator.apply(numbers[0]);

	}

}