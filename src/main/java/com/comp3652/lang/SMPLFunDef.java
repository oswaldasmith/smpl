package com.comp3652.lang;

import com.comp3652.sys.*;
import com.comp3652.values.*;

import java.util.*;

public class SMPLFunDef extends SMPLStatement {

	protected String name;
	protected ArrayList<String> params;
	protected SMPLStmtSequence statements;

	public SMPLFunDef(String fnName, ArrayList<String> nParams, SMPLStmtSequence sequence) {
		name = fnName;
		params = nParams;
		statements = sequence;
	}

	public String getFunctionName() {
		return name;
	}

	public ArrayList<String> getParameters() {
		return params;
	}

	public SMPLStmtSequence getStatements() {
		return statements;
	}

	@Override
	public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
		return v.visitSMPLFunDef(this, state);
	}
}