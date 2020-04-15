package com.example.effectivejava.item31;

import java.util.Collection;

/**
 *
 * @author 93Hong on 2020-04-15
 *
 */
public class Item31Stack<E> {
	public Item31Stack() {
	}

	public void push(E e) {

	}

	public E pop() {
		return null;
	}

	public boolean isEmpty() {
		return false;
	}

	public void pushAll(Iterable<? extends E> src) {
		for (E e : src) {
			push(e);
		}
	}

	public void popAll(Collection<? super E> dst) {
		while (!isEmpty()) {
			dst.add(pop());
		}
	}
}
