package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

/**
 * Created by carlos on 12/20/15.
 */

public class SMPLVectorExp extends SMPLExp {
    private ArrayList<ASTExp<SMPLExp>> v;


    public SMPLVectorExp(ArrayList<ASTExp<SMPLExp>> v) {
        this.v = v;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitSMPLVectorExp(this,context);
    }

    public ArrayList<ASTExp<SMPLExp>> getExplist() {
        return v;
    }

}
