package com.example.effectivejava.item37;

/**
 *
 * @author 93Hong on 2020-04-18
 *
 */
public class Plant {
	enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }

	final String name;
	final LifeCycle lifeCycle;

	public Plant(String name, LifeCycle lifeCycle) {
		this.name = name;
		this.lifeCycle = lifeCycle;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
