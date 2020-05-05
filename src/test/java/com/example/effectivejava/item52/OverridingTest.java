package com.example.effectivejava.item52;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-05-05
 *
 */
class OverridingTest {

	@Test
	void test_overriding() {
		final List<Wine> wines = List.of(new Wine(), new SparklingWine(), new Champagne());

		wines.stream().map(Wine::name).forEach(System.out::println);
	}

}