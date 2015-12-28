package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public class SMPLCondition extends SMPLStatement {

	ASTExp<CIRExp> conditionExp;
	SMPLSequence consequent, alternative;

	public SMPLCondition(ASTExp<CIRExp> cExp, SMPLSequence cons) {
		conditionExp = cExp;
		consequent = seq;
	}

	public SMPLCondition(ASTExp<CIRExp> cExp, SMPLSequence cons, 
		SMPLSequence alt) {
		conditionExp = cExp;
		consequent = cons;
		alternative = alt;
	}

	public ASTExp<CIRExp> getConditionalExpression() {
		return conditionExp;
	}

	public SMPLSequence getConsequent() {
		return consequent;
	}

	public SMPLSequence getAlternative() {
		return alternative;
	}

	@Override
	public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
		return v.visitSMPLConditional(this, state);
	}

}