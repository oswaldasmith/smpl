package com.comp3652.lang;

public interface UnaryOp<E, T> {

    /**
     * @return The symbol representing this operator.
     */
    public String getSymbol();

    /**
     * Apply this operator to an operand.
     * @param arg The operand of the operator.
     * @return The result of the operation on the operand.
     */
    public T apply(E arg);
}