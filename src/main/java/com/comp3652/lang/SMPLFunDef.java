package com.comp3652.lang;

<<<<<<< HEAD
import com.comp3652.sys.*;
import com.comp3652.values.*;
=======
>>>>>>> 80d7d2e03577e44ccc1057f550e49055f3194a61
import java.util.*;

public class SMPLFunDef extends SMPLStatement {

	protected String name;
<<<<<<< HEAD
	protected List<String> numericParams;
	protected List<String> vectorParams;
=======
	protected ArrayList<String> params;
	protected SMPLStmtSequence statements;

	public SMPLFunDef() {

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
>>>>>>> 80d7d2e03577e44ccc1057f550e49055f3194a61
}