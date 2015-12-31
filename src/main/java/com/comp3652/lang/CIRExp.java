package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public class CIRExp extends ASTExp<SMPLExp> {

	protected ASTExp<SMPLExp> id;
	protected String comparator;
	protected ASTExp<SMPLExp> smplExp;


	public CIRExp(ASTExp<SMPLExp> var, String cmp, ASTExp<SMPLExp> exp) {
		this.id = var;
		this.comparator = cmp;
		this.smplExp = exp;
	}


	public ASTExp<SMPLExp> getId() {
		return id;
	}

	public String getComparator() {
		return comparator;
	}

	public ASTExp<SMPLExp> getBoolExp() {
		return smplExp;
	}


    public <S, T> T visit(CIRVisitor<S, T> v, S context) throws SMPLException{
    	return v.visitCIRExp(this, context);
    }

	public ASTExp<SMPLExp> getArithExp() {
		return smplExp;
	}

	@Override
	public <S, T> T visit(ASTVisitor<SMPLExp, S, T> v, S state) throws SMPLException {
		return visit((CIRVisitor<S, T>) v, state);
	}
}