package com.comp3652.values;


public class Pair<S, T> {
	public final S x;
	public final T y;

	public Pair(S x, T y) {
		this.x = x;
		this.y = y;
	}

	public S getFirst() {
		return x;
	}

	public T getSecond() {
		return y;
	}
}