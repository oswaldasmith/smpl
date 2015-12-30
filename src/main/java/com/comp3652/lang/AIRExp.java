package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * <code>AIRExp</code> is the parent class for all arithmetic
 * expressions.  Since numbers may not be named by HPL variables, no
 * environment is needed to evaluate arithmetic expressions.
 *
 * @author <a href="mailto:newts@uwimona.edu.jm">Daniel Coore</a>
 * @version 1.0
 */
public class AIRExp extends ASTExp<SMPLExp> {

	public AIRExp() {
		super();
	}

	@Override
	public <S, T> T visit(ASTVisitor<SMPLExp, S, T> v, S state) throws SMPLException {
		return visit(v, state);
	}

}
