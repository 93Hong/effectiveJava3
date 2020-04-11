package com.example.effectivejava.item10;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point)) {
			return false;
		}
		final Point point = (Point)obj;
		return point.x == x && point.y == y;
	}
}
