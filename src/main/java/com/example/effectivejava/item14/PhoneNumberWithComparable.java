package com.example.effectivejava.item14;

import java.util.Comparator;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
public class PhoneNumberWithComparable implements Comparable<PhoneNumberWithComparable> {
	private static final Comparator<PhoneNumberWithComparable> COMPARATOR =
		Comparator.comparingInt((PhoneNumberWithComparable value) -> value.areaCode)
			.thenComparingInt(value -> value.prefix)
			.thenComparingInt(value -> value.lineNum);

	private final short areaCode, prefix, lineNum;

	public PhoneNumberWithComparable(int areaCode, int prefix, int lineNum) {
		this.areaCode = rangeCheck(areaCode, 999, "areaCode");
		this.prefix = rangeCheck(prefix, 999, "prefix");
		this.lineNum = rangeCheck(lineNum, 999, "lineNum");
	}

	private static short rangeCheck(int val, int max, String arg) {
		if (val < 0 || val > max) {
			throw new IllegalArgumentException();
		}
		return (short)val;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof PhoneNumberWithComparable)) {
			return false;
		}
		final PhoneNumberWithComparable phoneNumber = (PhoneNumberWithComparable)obj;
		return phoneNumber.lineNum == lineNum && phoneNumber.areaCode == areaCode && phoneNumber.prefix == prefix;
	}

	private int hashCode;

	@Override
	public int hashCode() {
		int result = hashCode;
		if (result == 0) { // caching
			result = Short.hashCode(areaCode);
			result = 31 * result + Short.hashCode(prefix);
			result = 31 * result + Short.hashCode(lineNum);
			hashCode = result;
		}
		return result;
	}

	@Override
	public int compareTo(PhoneNumberWithComparable o) {
		int result = Short.compare(areaCode, o.areaCode);
		if (result == 0) {
			result = Short.compare(prefix, o.prefix);
			if (result == 0) {
				result = Short.compare(lineNum, o.lineNum);
			}
		}
		return result;
	}

	public int compareToWithComparator(PhoneNumberWithComparable o) {
		return COMPARATOR.compare(this, o);
	}
}
