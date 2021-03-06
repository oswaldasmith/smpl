package com.comp3652.lang;

import com.comp3652.sys.SMPLException;
import com.comp3652.values.Pair;
import com.comp3652.values.SMPLPair;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLCarStmt extends SMPLStatement {
    private Pair pair;

    public SMPLCarStmt(SMPLPair p) {
        super();
        this.pair = p.getValue();
    }

    public Object ret(){
        return pair.getFirst();
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitSMPLCarStmt(this,context);
    }

}
