package com.example.effectivejava.item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 93Hong on 2020-05-05
 *
 */
public class EmptyArrayAndList {

	private List<Object> list;

	public List<Object> getList() {
		return list.isEmpty() ? Collections.emptyList() : new ArrayList<>(list);
	}

	public Object[] getArray() {
		return list.toArray(new Object[0]);
	}
}
