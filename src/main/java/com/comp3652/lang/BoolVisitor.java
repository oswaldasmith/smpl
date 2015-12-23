package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/23/15.
 */
public interface BoolVisitor<S,T> extends ASTVisitor<SMPLExp,S,T> {
    T visitBoolExp(BoolExp boolExp, S state)throws SMPLException;
}
