package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLVectorExp extends ASTExp<SMPLExp> {
    private ArrayList<ASTExp<SMPLExp>> list;

    public SMPLVectorExp(ArrayList<ASTExp<SMPLExp>> l) {
        this.list = l;
    }

    @Override
    public <S, T> T visit(ASTVisitor<SMPLExp, S, T> v, S state) throws SMPLException {
        return null;
    }
}
