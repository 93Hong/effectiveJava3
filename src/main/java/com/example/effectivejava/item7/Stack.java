package com.example.effectivejava.item7;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
public class Stack {

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack(Object[] elements) {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		// release useless reference
		elements[size] = null;
		return elements[--size];
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}
}
