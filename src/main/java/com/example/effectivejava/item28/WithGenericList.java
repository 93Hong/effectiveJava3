package com.example.effectivejava.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author 93Hong on 2020-04-14
 *
 */
public class WithGenericList<T> {
	private final List<T> choiceList;

	public WithGenericList(Collection<T> choiceList) {
		this.choiceList = new ArrayList<>(choiceList);
	}

	public T choice() {
		final ThreadLocalRandom current = ThreadLocalRandom.current();
		return choiceList.get(current.nextInt(choiceList.size()));
	}
}
