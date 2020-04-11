package com.example.effectivejava.item10;

import java.awt.*;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
public class ColorPoint extends Point {
	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point)) {
			return false;
		}

		// obj == Point
		if (!(obj instanceof ColorPoint)) {
			return obj.equals(this);
		}

		// obj == ColorPoint
		return super.equals(obj) && ((ColorPoint)obj).color == color;
	}
}
