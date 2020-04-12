package com.example.effectivejava.item11;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
public class PhoneNumberWithHashCode {
	private final short areaCode, prefix, lineNum;

	public PhoneNumberWithHashCode(int areaCode, int prefix, int lineNum) {
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
		if (!(obj instanceof PhoneNumberWithHashCode)) {
			return false;
		}
		final PhoneNumberWithHashCode phoneNumber = (PhoneNumberWithHashCode)obj;
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
}
