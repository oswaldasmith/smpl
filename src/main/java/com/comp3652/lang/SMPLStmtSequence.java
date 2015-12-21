package com.comp3652.lang;

import com.comp3652.sys.*;
import java.util.*;


public class SMPLStmtSequence extends PIRExp {

	protected List<SMPLStatement> sequence;

	public SMPLStmtSequence() {
        sequence = new ArrayList<>();
    }

    public SMPLStmtSequence(ArrayList<PIRStatement> seq) {
        sequence = seq;
    }

    public void addStatement(PIRStatement stmt) {
        sequence.add(stmt);
    }

    public final ArrayList<PIRStatement> getStatements() {
        return sequence;
    }

    @Override
    public <S, T> T visit(HPLVisitor<S, T> v, S state) throws HPLException {
        return v.visitSMPLStmtSequence(this, state);
    }
}