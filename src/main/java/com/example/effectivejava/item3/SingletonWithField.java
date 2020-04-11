package com.example.effectivejava.item3;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
public class SingletonWithField {

	public static final SingletonWithField INSTANCE = new SingletonWithField();

	private SingletonWithField() {
	}

	public void doSomething() {
		System.out.println("SingletonWithField");
	}
}
