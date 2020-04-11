package com.example.effectivejava.item10;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
public class PhoneNumber {
	private final short areaCode, prefix, lineNum;

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
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
		if (!(obj instanceof PhoneNumber)) {
			return false;
		}
		final PhoneNumber phoneNumber = (PhoneNumber)obj;
		return phoneNumber.lineNum == lineNum && phoneNumber.areaCode == areaCode && phoneNumber.prefix == prefix;
	}
}
