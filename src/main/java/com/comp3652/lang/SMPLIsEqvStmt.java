package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLIsEqvStmt extends SMPLStatement {
    private ASTExp object1, object2;

    public SMPLIsEqvStmt(ASTExp e, ASTExp  e2) {
        this.object1 = e;
        this.object2 = e2;
    }

    public ASTExp getObject1() {
        return object1;
    }

    public ASTExp getObject2() {
        return object2;
    }

    public boolean isEquivalent(){
        return object1.equals(object2);
    }

    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitSMPLIsEqvStmt(this,context);
    }
}
