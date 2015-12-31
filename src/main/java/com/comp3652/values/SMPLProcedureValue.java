package com.comp3652.values;

import com.comp3652.lang.ASTExp;
import com.comp3652.lang.SMPLExp;
import com.comp3652.lang.SMPLStmtDefinition;
import com.comp3652.sys.SMPLContext;

/**
 * Created by carlos on 12/31/15.
 */
public class SMPLProcedureValue extends SMPLValue {
    ASTExp<SMPLExp> body;
    SMPLStmtDefinition list;
    SMPLContext closingEnv;

    public SMPLProcedureValue(ASTExp<SMPLExp> body, SMPLStmtDefinition list, SMPLContext env) {
        this.body = body;
        this.closingEnv = env;
        this.list = list;
    }


}
