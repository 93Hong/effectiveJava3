package com.example.effectivejava.item79;

import com.example.effectivejava.item18.ForwardingSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author 93Hong on 2020-05-09
 *
 */
public class ObservableSetWithCopyOnWriteArray<E> extends ForwardingSet<E> {
	public ObservableSetWithCopyOnWriteArray(Set<E> s) {
		super(s);
	}

	private final List<SetObserver2<E>> observers = new CopyOnWriteArrayList<>();

	public void addObserver(SetObserver2<E> observer) {
		observers.add(observer);
	}

	public boolean removeObserver(SetObserver2<E> observer) {
		return observers.remove(observer);
	}

	private void notifyElementAdded(E element) {
		for (SetObserver2<E> observer : observers) {
			observer.added(this, element);
		}
	}

	@Override
	public boolean add(E e) {
		final boolean added = super.add(e);
		if (added) {
			notifyElementAdded(e);
		}
		return added;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		boolean result = false;
		for (E element : c) {
			result = result | add(element);
		}
		return result;
	}
}
