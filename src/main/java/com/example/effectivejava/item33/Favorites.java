package com.example.effectivejava.item33;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author 93Hong on 2020-04-15
 *
 */
public class Favorites {
	private Map<Class<?>, Object> favorites = new HashMap<>();

	public <T> void putFavorites(Class<T> type, T instance) {
		favorites.put(Objects.requireNonNull(type), type.cast(instance));
	}

	public <T> T getFavorites(Class<T> type) {
		return type.cast(favorites.get(type));
	}

	static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
		Class<?> annotationType;
		try {
			annotationType = Class.forName(annotationTypeName);
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(e);
		}
		return element.getAnnotation(annotationType.asSubclass(Annotation.class));
	}
}
