package com.example.effectivejava.item3;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
public enum SingletonWithEnum {
	INSTANCE;

	public void doSomething() {
		System.out.println("SingletonWithField");
	}
}
