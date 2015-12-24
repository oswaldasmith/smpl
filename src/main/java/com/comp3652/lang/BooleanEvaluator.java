package com.comp3652.lang;

import com.comp3652.sys.SMPLEnvironment;
import com.comp3652.sys.SMPLException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by carlos on 12/23/15.
 */
public class BooleanEvaluator implements BoolVisitor<SMPLEnvironment<Boolean>,Boolean> {


    Map<String, UnOpArith> unOpsMap;
    Map<String, BinOpArith> binOpsMap;

    public BooleanEvaluator() {
        init();
    }

    private void init() {
        unOpsMap = new HashMap<>();
        for (UnOpArith op : UnOpArith.values()) {
            unOpsMap.put(op.getSymbol(), op);
        }

        binOpsMap = new HashMap<>();
        for (BinOpArith op: BinOpArith.values()) {
            binOpsMap.put(op.getSymbol(), op);
        }
    }

    @Override
    public Boolean visitBoolExp(BoolExp boolExp, SMPLEnvironment<Boolean> state) throws SMPLException {
        return new Boolean(boolExp.getVal());
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
