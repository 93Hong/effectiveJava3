package com.example.effectivejava.item28;

import java.util.Collection;

/**
 *
 * @author 93Hong on 2020-04-14
 *
 */
public class WithGeneric<T> {
	private final T[] choiceArray;

	public WithGeneric(Collection<T> collections) {
		this.choiceArray = (T[])collections.toArray();
	}
}
