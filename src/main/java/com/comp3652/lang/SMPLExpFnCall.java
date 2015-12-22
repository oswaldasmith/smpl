package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLExpFnCall extends SMPLStatement {

    private  String fn;
    private ArrayList<ASTExp> args;


    public SMPLExpFnCall(String fn, ArrayList<ASTExp> args) {
        this.fn = fn;
        this.args = args;
    }


    @Override
    public <S, T> T visit(SMPLEvaluator v, Object state) throws SMPLException {
        return null;
    }
}
