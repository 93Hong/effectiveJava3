package com.example.effectivejava.item79;

/**
 *
 * @author 93Hong on 2020-05-09
 *
 */
@FunctionalInterface
public interface SetObserver<E> {
	void added(ObservableSet<E> set, E element);
}
