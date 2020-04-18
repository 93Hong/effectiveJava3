package com.example.effectivejava.item33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-18
 *
 */
class FavoritesTest {

	@Test
	void test_() {
		final Favorites favorites = new Favorites();
		favorites.putFavorites(Integer.class, 3);
	}

	@Test
	void test_classCastException() {
		final Favorites favorites = new Favorites();

		Assertions.assertThrows(ClassCastException.class
			, () -> favorites.putFavorites((Class)Integer.class, "not Integer"));
	}

}