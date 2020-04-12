package com.example.effectivejava.item18;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-12
 *
 */
class UseCompositionTest {

	@Test
	void test_unexpectedWithExtends() {
		int expected = 3;

		final ExtendsHashSet<String> strings = new ExtendsHashSet<>();
		strings.addAll(List.of("first", "second", "third"));

		assertNotEquals(strings.getAddCount(), expected);
	}

	@Test
	void test_useComposition() {
		int expected = 3;

		final CompositionHashSet<String> compositionHashSet = new CompositionHashSet<>(new HashSet<>());
		compositionHashSet.addAll(List.of("first", "second", "third"));

		assertEquals(compositionHashSet.getAddCount(), expected);
	}

}