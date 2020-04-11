package com.example.effectivejava.item10;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
class EqualsTest {

	@Test
	void test_equalsWithSymmetry() {
		final String smallHong = "hong";
		final CaseInsensitiveString bigHong = new CaseInsensitiveString("HONG");

		assertEquals(bigHong, smallHong);
		assertNotEquals(smallHong, bigHong);
	}

	@Test
	void test_equalsWithTransition() {
		final Point point = new Point(1, 2);
		final ColorPoint blueColorPoint = new ColorPoint(1, 2, Color.BLUE);
		final ColorPoint blackColorPoint = new ColorPoint(1, 2, Color.BLACK);

		assertTrue(blackColorPoint.equals(point));
		assertTrue(point.equals(blueColorPoint));
		assertFalse(blackColorPoint.equals(blueColorPoint));
	}

}