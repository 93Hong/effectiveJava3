package com.example.effectivejava.item28;

import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author 93Hong on 2020-04-14
 *
 */
public class NoGeneric {
	private final Object[] choiceArray;

	public NoGeneric(Collection choices) {
		this.choiceArray = choices.toArray();
	}

	public Object choose() {
		final ThreadLocalRandom current = ThreadLocalRandom.current();
		return choiceArray[current.nextInt(choiceArray.length)];
	}

}
