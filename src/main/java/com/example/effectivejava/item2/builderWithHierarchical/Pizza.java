package com.example.effectivejava.item2.builderWithHierarchical;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author 93Hong on 2020-04-10
 *
 */
public abstract class Pizza {

	public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
	final Set<Topping> toppings;

	abstract static class Builder<T extends Builder<T>> {

		final EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

		public T addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}

		abstract Pizza build();

		protected abstract T self();
	}

	Pizza(Builder<?> builder) {
		toppings = builder.toppings.clone();
	}

}
