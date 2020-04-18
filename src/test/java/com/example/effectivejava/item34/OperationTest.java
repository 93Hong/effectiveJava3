package com.example.effectivejava.item34;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-18
 *
 */
class OperationTest {

	@Test
	void test() {
		double x = 5;
		double y = 2;
		for (Operation operation : Operation.values()) {
			System.out.printf("%f %s %f = %f%n", x, operation, y, operation.apply(x, y));
		}

		final Optional<Operation> optionalOperation = Operation.fromString("+");
		optionalOperation.ifPresent(System.out::println);
	}

}