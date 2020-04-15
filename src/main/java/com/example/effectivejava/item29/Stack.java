package com.example.effectivejava.item29;

import java.util.EmptyStackException;

/**
 *
 * @author 93Hong on 2020-04-15
 *
 */
public class Stack<E> {
	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	@SuppressWarnings("unchecked")
	public Stack() {
		this.elements = (E[])new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public E pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		final E element = elements[--size];
		elements[size] = null;
		return element;
	}

	private void ensureCapacity() {

	}

	public boolean isEmpty() {
		return size == 0;
	}
}
