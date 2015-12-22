package com.comp3652.values;

import com.comp3652.lang.*;

public class SMPLPair extends SMPLValue<SMPLPair>{

	protected ASTNode leftValue, rightValue;

	public SMPLPair(ASTNode leftExp, rightExp) {
		leftValue = leftExp;
		rightValue = rightExp;
	}

	public ASTNode getLeft() {
		return left;
	}

	public ASTNode getRight() {
		return right;
	}

	@Override
	public String toString() {
		return "(" + leftValue.toString + ", " + rightValue.toString() + ")";
	}
} 