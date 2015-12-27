package com.comp3652.lang;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLIsEqualStmt extends SMPLFunCall {
    private ASTExp object1, object2;

    public SMPLIsEqualStmt(ASTExp e, ASTExp e2) {
        this.object1 = e;
        this.object2 = e2;
    }

    public ASTExp getObject1() {
        return object1;
    }

    public ASTExp getObject2() {
        return object2;
    }

    public Boolean isEqual() {
        return object1 == object2;
    }
}
