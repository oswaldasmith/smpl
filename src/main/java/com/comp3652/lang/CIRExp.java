package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public class CIRExp extends ASTExp<CIRExp> {

	protected String id;
	protected String comparator;
	protected ASTExp<AIRExp> arithExp;
	protected BoolExp boolExp;


	public CIRExp(String var, String cmp, ASTExp<AIRExp> exp) {
		this.id = var;
		this.comparator = cmp;
		this.arithExp = exp;
	}


	public String getId() {
		return id;
	}

	public String getComparator() {
		return comparator;
	}

	public ASTExp<AIRExp> getArithExp() {
		return arithExp;
	}

	public BoolExp getBoolExp() { return boolExp; }

	@Override
    public <S, T> T visit(ASTVisitor<CIRExp, S, T> v, S state) throws SMPLException {
        return visit((CIRVisitor<S, T>) v, state);
    }

    public <S, T> T visit(CIRVisitor<S, T> v, S context) throws SMPLException{
    	return v.visitCIRExp(this, context);
    }
}