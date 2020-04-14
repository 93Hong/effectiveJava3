package com.example.effectivejava.item20;

import java.util.Map;
import java.util.Objects;

/**
 *
 * @author 93Hong on 2020-04-14
 * hashCode, equals, toString 등 object 의 메서드도 제공함
 *
 */
public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {

	@Override
	public V setValue(V value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Map.Entry)) {
			return false;
		}
		final Map.Entry entry = (Map.Entry)obj;
		return Objects.equals(entry.getKey(), getKey())
			&& Objects.equals(entry.getValue(), getValue());
	}

	@Override
	public String toString() {
		return getKey() + " " + getValue();
	}

}
