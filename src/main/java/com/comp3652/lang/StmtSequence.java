package com.comp3652.lang;

import java.util.*;
import com.comp3652.sys.*;

public class StmtSequence extends SMPLExp {

	protected ArrayList<SMPLStatement> sequence;

	public SMPLSequence() {
		sequence = new ArrayList<>();
	}

	public SMPLSequence(List<SMPLSequence> seq) {
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