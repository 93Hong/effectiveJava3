package com.example.effectivejava.item8;

import java.lang.ref.Cleaner;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
public class Room implements AutoCloseable {

	private static final Cleaner cleaner = Cleaner.create();

	private static class State implements Runnable {

		int numJinkPiles;

		State(int numJinkPiles) {
			this.numJinkPiles = numJinkPiles;
		}

		@Override
		public void run() {
			System.out.println("clean room");
			numJinkPiles = 0;
		}
	}

	private final State state;

	private final Cleaner.Cleanable cleanable;

	public Room(int numJunkPiles) {
		state = new State(numJunkPiles);
		cleanable = cleaner.register(this, state);
	}

	@Override
	public void close() {
		cleanable.clean();
	}
}
