package com.example.effectivejava.item2;

import lombok.Getter;

/**
 *
 * @author 93Hong on 2020-04-10
 *
 */
@Getter
public class BuilderPattern {

	private final String name;
	private final int age;
	private final int height;
	private final boolean hasCar;

	public static class Builder {

		// required
		private final String name;
		private final int age;

		// optional
		private int height = 0;
		private boolean hasCar = false;

		public Builder(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public Builder height(int val) {
			if (val < 0) {
				throw new IllegalArgumentException("wrong height");
			}

			this.height = val;
			return this;
		}

		public Builder hasCar(boolean val) {
			this.hasCar = val;
			return this;
		}

		public BuilderPattern build() {
			return new BuilderPattern(this);
		}
	}

	private BuilderPattern(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.height = builder.height;
		this.hasCar = builder.hasCar;
	}

}
