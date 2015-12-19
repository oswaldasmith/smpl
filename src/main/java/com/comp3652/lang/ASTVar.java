package com.comp3652.lang;

import com.comp3652.sys.HPLException;

public class ASTVar<E extends ASTExp<E>> extends ASTExp<E> {
    private final String id;

    public ASTVar(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public <S, T> T visit(ASTVisitor<E, S, T> v, S state) throws HPLException {
        return v.visitVar(this, state);
    }
    
    @Override
    public String toString() {
        return id;
    }
}
