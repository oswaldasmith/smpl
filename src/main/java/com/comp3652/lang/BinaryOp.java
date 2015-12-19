package com.comp3652.lang;

public interface BinaryOp<E, T> {
	public String getSymbol();
	public T apply(E leftArg, E rightArg);
}