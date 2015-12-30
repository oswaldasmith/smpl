package com.comp3652.lang;
import com.comp3652.sys.SMPLContext;
import com.comp3652.sys.SMPLException;
import com.comp3652.values.SMPLValue;

public class SMPLProgram extends SMPLStatement {

	protected SMPLStmtSequence statements;
	/**
	 * Creates a new <code>SMPLProgram</code> instance, the Painter
	 * Intermediate Representation of a program.  A program is a sequence
	 * of statements.
	 *
	 * @param stmts the list of statements making up the program.
	 */
	public SMPLProgram (SMPLStmtSequence stmts) {

		statements = stmts;
	}

	public SMPLStmtSequence getSeq() {
		return statements;
	}

	/**
	 * Call the visitSMPLProgram method within <code>v</code> on this
	 * program representation and the given argument.
	 *
	 * @param v a <code>Visitor</code> value
	 * @param state the data to be passed to this program's components
	 * @return the result of visiting this program
	 * @throws SMPLException if an error was encountered while visiting
	 * the statements and sub-expressions of this program
	 */
	@Override
	public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
		return v.visitSMPLProgram(this, state);
	}

	/**
	 * Execute the instructions in this program with respect to a
	 * fresh environment.
	 *
	 * @param interpreter The interpreter to be used to run this program
	 * @return the <code>Painter</code> that results from evaluating
	 * the last statement in the sequence of instructions in this
	 * program.
	 */
	public SMPLValue run(SMPLEvaluator interpreter) {
		try {
			SMPLContext state = interpreter.mkInitialContext();
			visit(interpreter, state);
			return interpreter.getResult();
		} catch (SMPLException hple) {
			System.out.println("Error encountered: " + hple.report());
			return null;
		}
	}
}