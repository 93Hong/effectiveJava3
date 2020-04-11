package com.example.effectivejava.item8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
class RoomTest {

	@Test
	void test_AutoCloseable_explicit_close() {
		final Room room = new Room(5);
		room.close();
	}

	@Test
	void test_AutoCloseable_tryWithResource() {
		try(Room room = new Room(5)) {
			System.out.println("hi");
		}
	}

}