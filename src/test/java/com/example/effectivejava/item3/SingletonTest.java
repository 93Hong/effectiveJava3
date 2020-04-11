package com.example.effectivejava.item3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
class SingletonTest {

	@Test
	void test_SingletonWithField() {

		final SingletonWithField instance = SingletonWithField.INSTANCE;
		final SingletonWithField instance2 = SingletonWithField.INSTANCE;

		assertSame(instance, instance2);

		instance.doSomething();
		instance2.doSomething();
	}

	@Test
	void test_SingletonWithStaticFactory() {

		final SingletonWithStaticFactory instance = SingletonWithStaticFactory.getInstance();
		final SingletonWithStaticFactory instance2 = SingletonWithStaticFactory.getInstance();

		assertSame(instance, instance2);

		instance.doSomething();
		instance2.doSomething();

	}

	@Test
	void test_SingletonWithEnum() {
		final SingletonWithEnum instance = SingletonWithEnum.INSTANCE;
		final SingletonWithEnum instance2 = SingletonWithEnum.INSTANCE;

		assertSame(instance, instance2);

		instance.doSomething();
		instance2.doSomething();

	}


}
