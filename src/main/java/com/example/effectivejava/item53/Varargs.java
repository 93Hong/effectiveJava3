package com.example.effectivejava.item53;

/**
 *
 * @author 93Hong on 2020-05-05
 *
 */
public class Varargs {

	public static int minOnlyVarargs(int... args) {
		if (args.length == 0) {
			throw new IllegalArgumentException();
		}
		return 0;
	}

	public static int minWithVarargs(int firstArg, int... remainingArgs) {
		int min = firstArg;
		for (int arg : remainingArgs) {
			if (min > arg) {
				min = arg;
			}
		}
		return min;
	}

}
