package com.example.effectivejava.item50;

import java.util.Date;

/**
 *
 * @author 93Hong on 2020-05-05
 *
 */
public class Period {
	private final Date start;
	private final Date end;

	public Period(Date start, Date end) {
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());

		if (this.start.compareTo(this.end) > 0) {
			throw new IllegalArgumentException();
		}
	}

	public Date getStart() {
		return new Date(start.getTime());
	}

	public Date getEnd() {
		return new Date(end.getTime());
	}
}
