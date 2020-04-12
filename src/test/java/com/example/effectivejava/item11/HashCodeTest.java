package com.example.effectivejava.item11;

import com.example.effectivejava.item10.PhoneNumber;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-04-12
 *
 */
class HashCodeTest {

	@Test
	void test_overrideEqualsNotHashCode() {

		final PhoneNumber phoneNumber = new PhoneNumber(1, 2, 1);
		final PhoneNumber phoneNumber2 = new PhoneNumber(1, 2, 1);

		assertEquals(phoneNumber, phoneNumber2);

		final HashMap<PhoneNumber, String> hashMap = new HashMap<>();
		hashMap.put(phoneNumber, "giwook");
		assertNull(hashMap.get(phoneNumber2));

	}

	@Test
	void test_overrideEqualsAndHashCode() {

		final PhoneNumberWithHashCode phoneNumberWithHashCode = new PhoneNumberWithHashCode(1, 2, 1);
		final PhoneNumberWithHashCode phoneNumberWithHashCode2 = new PhoneNumberWithHashCode(1, 2, 1);

		assertEquals(phoneNumberWithHashCode, phoneNumberWithHashCode2);

		final HashMap<PhoneNumberWithHashCode, String> hashMap = new HashMap<>();
		hashMap.put(phoneNumberWithHashCode, "giwook");
		assertNotNull(hashMap.get(phoneNumberWithHashCode2));

	}

}