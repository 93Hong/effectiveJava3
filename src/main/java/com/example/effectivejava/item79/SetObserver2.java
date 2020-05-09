package com.example.effectivejava.item79;

/**
 *
 * @author 93Hong on 2020-05-09
 *
 */
@FunctionalInterface
public interface SetObserver2<E> {
	void added(ObservableSetWithCopyOnWriteArray<E> set, E element);
}
