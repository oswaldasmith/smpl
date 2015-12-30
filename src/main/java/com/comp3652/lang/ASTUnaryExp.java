package com.comp3652.lang;


import com.comp3652.sys.SMPLException;

public class ASTUnaryExp<E extends ASTExp<E>> extends ASTExp<E> {

    String operator;
    ASTExp<E> exp;

    public ASTUnaryExp(String op, ASTExp<E> exp) {
        operator = op;
        this.exp = exp;
    }

    public String getOperator() {
        return operator;
    }
    
    public ASTExp<E> getExp() {
        return exp;
    }
    
    
    @Override
    public <S, T> T visit(ASTVisitor<E, S, T> v, S state) throws SMPLException {
        return v.visitUnaryExp(this, state);
    }

}
