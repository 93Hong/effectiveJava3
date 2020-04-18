package com.example.effectivejava.item37;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-18
 *
 */
class PlantTest {

	@Test
	void test() {
		final List<Plant> gardens = Lists.list(new Plant("1", Plant.LifeCycle.ANNUAL), new Plant("2", Plant.LifeCycle.BIENNIAL));

		final EnumMap<Plant.LifeCycle, Set<Plant>> plantByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
		for (Plant.LifeCycle lifeCycle : Plant.LifeCycle.values()) {
			plantByLifeCycle.put(lifeCycle, new HashSet<>());
		}

		for (Plant garden : gardens) {
			plantByLifeCycle.get(garden.lifeCycle).add(garden);
		}
		System.out.println(plantByLifeCycle);

	}

}