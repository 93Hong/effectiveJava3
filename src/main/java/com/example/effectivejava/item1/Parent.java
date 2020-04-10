package com.example.effectivejava.item1;

/**
 *
 * @author 93Hong on 2020-04-10
 *
 */
public class Parent {

	private Integer age;

	public static Parent of() {
		return new Child(1);
	}

}
