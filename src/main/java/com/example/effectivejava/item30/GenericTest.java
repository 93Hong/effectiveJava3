package com.example.effectivejava.item30;

import java.util.function.UnaryOperator;

/**
 *
 * @author 93Hong on 2020-04-15
 *
 */
public class GenericTest {
	private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

	@SuppressWarnings("unchecked")
	public static <T> UnaryOperator<T> identityFunction() {
		return (UnaryOperator<T>)IDENTITY_FN;
	}
}