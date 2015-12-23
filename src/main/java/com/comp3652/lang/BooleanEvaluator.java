package com.comp3652.lang;

import com.comp3652.sys.SMPLEnvironment;
import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/23/15.
 */
public class BooleanEvaluator implements BoolVisitor<SMPLEnvironment<Boolean>,Boolean> {
    //#TODO
    @Override
    public Boolean visitBoolExp(BoolExp boolExp, SMPLEnvironment<Boolean> state) throws SMPLException {
        return null;
    }

    @Override
    public Boolean visitVar(ASTVar<SMPLExp> var, SMPLEnvironment<Boolean> state) throws SMPLException {
        return null;
    }

    @Override
    public Boolean visitUnaryExp(ASTUnaryExp<SMPLExp> exp, SMPLEnvironment<Boolean> state) throws SMPLException {
        return null;
    }

    @Override
    public Boolean visitBinaryExp(ASTBinaryExp<SMPLExp> exp, SMPLEnvironment<Boolean> state) throws SMPLException {
        return null;
    }
}
