package com.example.effectivejava.item3;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
public class SingletonWithStaticFactory {

	private static final SingletonWithStaticFactory INSTANCE = new SingletonWithStaticFactory();

	private SingletonWithStaticFactory() {
	}

	public static SingletonWithStaticFactory getInstance() {
		return INSTANCE;
	}

	public void doSomething() {
		System.out.println("SingletonWithField");
	}

}
