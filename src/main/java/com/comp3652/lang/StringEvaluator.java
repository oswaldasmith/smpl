package com.comp3652.lang;

import com.comp3652.sys.SMPLEnvironment;
import com.comp3652.sys.SMPLException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by carlos on 12/24/15.
 */
public class StringEvaluator implements StringVisitor<SMPLEnvironment<String>, String> {

    Map<String, BinOpString> binOpsMap;

    public StringEvaluator() {
        init();
    }

    private void init() {
        binOpsMap = new HashMap<>();
        for (BinOpString op: BinOpString.values()) {
            binOpsMap.put(op.getSymbol(), op);
        }
    }
    @Override
    public String visitStringExp(StringExp stringExp, SMPLEnvironment<String> state) throws SMPLException {
        return new String(stringExp.getString());
    }

    @Override
    public String visitVar(ASTVar<SMPLExp> var, SMPLEnvironment<String> state) throws SMPLException {
        return state.get(var.getId());
    }

    @Override
    public String visitUnaryExp(ASTUnaryExp<SMPLExp> exp, SMPLEnvironment<String> state) throws SMPLException {
        return null;
    }


    @Override
    public String visitBinaryExp(ASTBinaryExp<SMPLExp> exp, SMPLEnvironment<String> state) throws SMPLException {
        String opName = exp.getOperator();
        BinOpString op = binOpsMap.get(opName);
        ASTExp<SMPLExp> leftExp = exp.getExp1();
        ASTExp<SMPLExp> rightExp = exp.getExp2();
        String leftArg = leftExp.visit(this, state);
        String rightArg = rightExp.visit(this, state);
        return op.apply(leftArg, rightArg);
    }
}
