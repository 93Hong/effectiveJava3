package com.example.effectivejava.item2.builderWithHierarchical;

import java.util.Objects;

/**
 *
 * @author 93Hong on 2020-04-10
 *
 */
public class NyPizza extends Pizza {

	public enum Size{ SMALL, MEDIUM, LARGE }
	private final Size size;

	public static class Builder extends Pizza.Builder<Builder> {
		private final Size size;

		public Builder(Size size) {
			this.size = Objects.requireNonNull(size);
		}

		@Override
		public NyPizza build() {
			return new NyPizza(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}

	private NyPizza(Builder builder) {
		super(builder);
		size = builder.size;
	}
}
