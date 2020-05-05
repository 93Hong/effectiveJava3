package com.example.effectivejava.item52;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 *
 * @author 93Hong on 2020-05-05
 *
 */
public class CollectionClassifier {
	public static String classify(Set<?> set) {
		return "set";
	}

	public static String classify(List<?> list) {
		return "list";
	}

	public static String classify(Collection<?> collection) {
		return "collection";
	}

}
