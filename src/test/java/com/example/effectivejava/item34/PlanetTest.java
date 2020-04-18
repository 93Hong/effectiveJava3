package com.example.effectivejava.item34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-18
 *
 */
class PlanetTest {

	@Test
	void test_weightTable() {
		double earthWeight = 100;
		final double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet planet : Planet.values()) {
			System.out.printf("%s 에서의 무게는 %f이다.%n", planet, planet.surfaceWeight(mass));
		}
	}

}