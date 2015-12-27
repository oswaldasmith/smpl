package com.comp3652.lang;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLIsEqvStmt extends SMPLFunCall {
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
}
