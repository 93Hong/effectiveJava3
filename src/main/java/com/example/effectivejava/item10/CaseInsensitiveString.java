package com.example.effectivejava.item10;

/**
 *
 * @author 93Hong on 2020-04-11
 *
 */
public class CaseInsensitiveString {
	private final String s;

	public CaseInsensitiveString(String s) {
		this.s = s;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CaseInsensitiveString) {
			return s.equalsIgnoreCase(((CaseInsensitiveString)obj).s);
		}
		if (obj instanceof String) {
			return s.equalsIgnoreCase((String)obj);
		}
		return false;
	}
}
