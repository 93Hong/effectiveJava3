package com.example.effectivejava.item1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-10
 *
 */
class StaticFactoryMethodTest {

	@DisplayName("static factory method has name")
	@Test
	void test_hasName() {

		int bitLength = 3;
		Random rnd = new Random();

		final BigInteger bigIntegerWithStaticFactoryMethod = BigInteger.probablePrime(bitLength, rnd);
		final BigInteger bigIntegerWithConstructor = new BigInteger(bitLength, 100, rnd);

	}

	@Test
	void test_noNeedToCreateNewInstance() {

		final Boolean aBoolean = new Boolean(true);
		final Boolean aBoolean1 = new Boolean(true);

		assertFalse(aBoolean == aBoolean1);

		final Boolean aBoolean2 = Boolean.valueOf(true);
		final Boolean aBoolean3 = Boolean.valueOf(true);

		assertTrue(aBoolean2 == aBoolean3);

	}

	@Test
	void test_returnSubtype() {
		final Parent of = Parent.of();
		final Child of1 = (Child)of;

		final Parent parent = new Parent();
		assertThrows(ClassCastException.class, () -> {
			final Child of2 = (Child)parent;
		});

		final Child child = new Child(1);
	}

}