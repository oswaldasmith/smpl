package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

/**
 * Created by carlos on 12/20/15.
 */

public class SMPLVectorExp extends SMPLExp {
    private ArrayList<ASTExp> alist;
    private ASTExp v;


    public SMPLVectorExp(ArrayList<ASTExp> l) {
        this.alist = l;
    }

    public SMPLVectorExp(ASTExp v) {
        this.v = v;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitSMPLVectorExp(this,context);
    }

    public ArrayList<ASTExp> getExplist() {
        return alist;
    }

    public ASTExp getV() {
        return v;
    }
}
