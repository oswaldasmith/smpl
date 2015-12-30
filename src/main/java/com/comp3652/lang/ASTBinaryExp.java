package com.comp3652.lang;


import com.comp3652.sys.SMPLException;

public class ASTBinaryExp<E extends ASTExp<E>> extends ASTExp<E> {
    
    String operator;
    ASTExp<E> exp1;
    ASTExp<E> exp2;

    public ASTBinaryExp(String operator, ASTExp<E> exp1, ASTExp<E> exp2) {
        this.operator = operator;
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public String getOperator() {
        return operator;
    }

    public ASTExp<E> getExp1() {
        return exp1;
    }

    public ASTExp<E> getExp2() {
        return exp2;
    }

    @Override
    public <S, T> T visit(ASTVisitor<E, S, T> v, S state) throws SMPLException {
        return v.visitBinaryExp(this, state);
    }

}
