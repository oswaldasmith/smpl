package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

/**
 * Created by shane on 12/31/15.
 */
public class SMPLMultipleAssign extends SMPLStatement {
    private ArrayList<String> vars;
    private ASTExp<SMPLExp> exp;

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return null;
    }

    public ASTExp getExp() {
        return exp;
    }

    public ArrayList<String> getVars() {
        return vars;
    }

    @Override
    public String toString() {
        return vars.toString();
    }
}
