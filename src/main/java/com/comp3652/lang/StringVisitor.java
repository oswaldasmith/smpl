package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/24/15.
 */
public interface StringVisitor<S,T> extends ASTVisitor<SMPLExp,S,T> {
    T visitStringExp(StringExp stringExp, S state)throws SMPLException;

}
