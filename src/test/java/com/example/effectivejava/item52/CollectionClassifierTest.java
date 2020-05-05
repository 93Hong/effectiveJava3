package com.example.effectivejava.item52;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-05-05
 *
 */
class CollectionClassifierTest {

	@Test
	void test_collectionClassifier() {

		Collection<?>[] collections = {
			new HashSet<String>(),
			new ArrayList<String>(),
			new HashMap<String, String>().values()
		};

		for (Collection<?> collection : collections) {
			System.out.println(CollectionClassifier.classify(collection));
		}

	}

}