package com.example.effectivejava.item34;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author 93Hong on 2020-04-18
 *
 */
public enum Operation {
	PLUS("+") {
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		public double apply(double x, double y) {
			return x - y;
		}
	};

	private final String symbol;

	Operation(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}

	public abstract double apply(double x, double y);

	private static final Map<String, Operation> stringToEnum =
		Stream.of(values()).collect(Collectors.toMap(Operation::toString, e -> e));

	public static Optional<Operation> fromString(String symbol) {
		return Optional.ofNullable(stringToEnum.get(symbol));
	}

}
