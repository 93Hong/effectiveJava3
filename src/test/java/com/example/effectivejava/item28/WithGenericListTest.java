package com.example.effectivejava.item28;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-15
 *
 */
class WithGenericListTest {

	@Test
	void test() {
		List<Integer> integers = null;
		final WithGenericList<Integer> integerWithGenericList = new WithGenericList<>(integers);
	}

}