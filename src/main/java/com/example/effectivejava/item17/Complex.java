package com.example.effectivejava.item17;

/**
 *
 * @author 93Hong on 2020-04-12
 *
 */
public class Complex {
	public static final Complex ZERO = new Complex(0, 0);

	private final double re;
	private final double im;

	private Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	public static Complex valueOf(double re, double im) {
		return new Complex(re, im);
	}

	public double realPart() {
		return re;
	}

	public double imaginaryPart() {
		return im;
	}

	public Complex plus(Complex c) {
		return new Complex(re + c.re, im + c.im);
	}

	public Complex minus(Complex c) {
		return new Complex(re - c.re, im - c.im);
	}

	public Complex times(Complex c) {
		return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
	}

	@Override
	public int hashCode() {
		return 31 * Double.hashCode(re) + Double.hashCode(im);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Complex)) {
			return false;
		}

		final Complex complex = (Complex)obj;
		return Double.compare(complex.re, re) == 0 && Double.compare(complex.im, im) == 0;
	}

	@Override
	public String toString() {
		return re + " " + im;
	}
}
