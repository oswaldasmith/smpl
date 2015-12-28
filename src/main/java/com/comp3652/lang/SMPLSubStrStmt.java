package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLSubStrStmt extends SMPLFunCall {

    private String string;
    private int start,end;

    public SMPLSubStrStmt(String s, Integer start, Integer end) {
        this.string = s;
        this.start = start.intValue();
        this.end = end.intValue();
    }

    public String getString() {
        return string;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLSubStrStmt(this,state);
    }
}
