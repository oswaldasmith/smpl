package com.comp3652.values;

import com.comp3652.lang.SMPLEvaluator;
import com.comp3652.lang.SMPLStmtSequence;
import com.comp3652.sys.SMPLContext;

/**
 * Created by carlos on 12/28/15.
 */
public class SMPLCompoundValue extends SMPLValue {

    private SMPLEvaluator smplEvaluator;
    private SMPLStmtSequence body;
    private SMPLContext newEnvironment;

    public SMPLCompoundValue(SMPLEvaluator smplEvaluator, SMPLStmtSequence body, SMPLContext newEnvironment) {
        this.smplEvaluator = smplEvaluator;
        this.body = body;
        this.newEnvironment = newEnvironment;
    }
}
