package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public class CIRExp extends ASTExp<CIRExp> {

	protected String id;
	protected String comparator;
	protected ASTExp exp;



	public CIRExp(String var, String cmp, ASTExp exp) {
		this.id = var;
		this.comparator = cmp;
		this.exp = exp;
	}


	public String getId() {
		return id;
	}

	public String getComparator() {
		return comparator;
	}

	public ASTExp getExp() {
		return exp;
	}

	@Override
    public <S, T> T visit(ASTVisitor<CIRExp, S, T> v, S state) throws SMPLException {
        return visit((CIRVisitor<S, T>) v, state);
    }

    public <S, T> T visit(CIRVisitor<S, T> v, S context) throws SMPLException{
    	return v.visitCIRExp(this, context);
    }
}