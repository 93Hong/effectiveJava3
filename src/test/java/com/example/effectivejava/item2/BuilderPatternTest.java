package com.example.effectivejava.item2;

import com.example.effectivejava.item2.builderWithHierarchical.NyPizza;
import com.example.effectivejava.item2.builderWithHierarchical.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-10
 *
 */
class BuilderPatternTest {

	@Test
	void test_builderPattern() {

		final BuilderPattern hong = new BuilderPattern.Builder("hong", 28)
			.hasCar(false)
			.build();

		assertNotNull(hong);
		assertEquals(0, hong.getHeight());

	}

	@Test
	void test_builderWithInvariant() {

		assertThrows(IllegalArgumentException.class, () -> {
			final BuilderPattern hong = new BuilderPattern.Builder("hong", 28)
				.height(-1)
				.hasCar(false)
				.build();
		});

	}

	@Test
	void test_() {
		final NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
			.addTopping(Pizza.Topping.ONION)
			.addTopping(Pizza.Topping.HAM)
			.build();



	}
}