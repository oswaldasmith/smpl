package com.comp3652.lang;

import com.comp3652.sys.*;
import java.util.*;


public class SMPLSequence extends PIRExp {

	protected List<SMPLStatement> sequence;

	public SMPLSequence() {
        sequence = new ArrayList<>();
    }

    public SMPLSequence(ArrayList<SMPLExp> seq) {
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
        return v.visitSMPLSequence(this, state);
    }
}