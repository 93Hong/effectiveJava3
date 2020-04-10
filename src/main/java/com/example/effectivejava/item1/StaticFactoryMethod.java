package com.example.effectivejava.item1;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author 93Hong on 2020-04-10
 *
 */
public class StaticFactoryMethod {

	public void has_name() {
		int bitLength = 3;
		Random rnd = new Random();

		final BigInteger bigIntegerWithStaticFactoryMethod = BigInteger.probablePrime(bitLength, rnd);
		final BigInteger bigIntegerWithConstructor = new BigInteger(bitLength, 100, rnd);

	}

	public void case_no_need_to_create_new_instance() {



	}

}
