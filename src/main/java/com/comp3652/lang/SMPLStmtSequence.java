package com.comp3652.lang;

import com.comp3652.sys.*;
import java.util.*;


public class SMPLStmtSequence extends SMPLExp {

	protected ArrayList<SMPLStatement> sequence;

	public SMPLStmtSequence() {
        sequence = new ArrayList<>();
    }

    public SMPLStmtSequence(ArrayList<SMPLStatement> seq) {
        sequence = seq;
    }

    public void addStatement(SMPLStatement stmt) {
        sequence.add(stmt);
    }

    public final ArrayList<SMPLStatement> getStatements() {
        return sequence;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLStmtSequence(this,state);
    }
}