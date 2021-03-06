package com.comp3652.lang;

import com.comp3652.sys.SMPLEnvironment;
import com.comp3652.sys.SMPLException;

import java.util.HashMap;
import java.util.Map;

public class ArithEvaluator implements AIRVisitor<SMPLEnvironment<Double>, Double> {
    
    Map<String, UnOpArith> unOpsMap;
    Map<String, BinOpArith> binOpsMap;
    
    public ArithEvaluator() {
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
    
    /* Methods specific to Arithmetic expressions */
    @Override
    public Double visitAIRExpInt(AIRExpInt exp, SMPLEnvironment<Double> env) throws SMPLException {
        return exp.getVal();
    }

    @Override
    public Double visitAIRExpFrac(AIRExpFrac exp,
				  SMPLEnvironment<Double> arg) throws SMPLException {
        return exp.getVal();
    }

    @Override
    public Double visitAIRFunCall(SMPLFunCall smplFunCall, SMPLEnvironment<Double> arg) throws SMPLException {
        return null;
    }

    @Override
    public Double visitAIRExp(AIRExp airExp, SMPLEnvironment<Double> context) throws SMPLException {
        return airExp.getVal();
    }


    @Override
    public Double visitVar(ASTVar<SMPLExp> var, SMPLEnvironment<Double> state) throws SMPLException {
        return state.get(var.getId());        
    }

    @Override
    public Double visitUnaryExp(ASTUnaryExp<SMPLExp> exp, SMPLEnvironment<Double> env) throws SMPLException {
        String opName = exp.getOperator();
        UnOpArith op = unOpsMap.get(opName);
        ASTExp<SMPLExp> argExp = exp.getExp();
        double arg = argExp.visit(this, env);
        return op.apply(arg);
    }

    @Override
    public Double visitBinaryExp(ASTBinaryExp<SMPLExp> exp, SMPLEnvironment<Double> env) throws SMPLException {
        String opName = exp.getOperator();
        BinOpArith op = binOpsMap.get(opName);
        ASTExp<SMPLExp> leftExp = exp.getExp1();
        ASTExp<SMPLExp> rightExp = exp.getExp2();
        double leftArg = leftExp.visit(this, env);
        double rightArg = rightExp.visit(this, env);
        return op.apply(leftArg, rightArg);
    }


}
