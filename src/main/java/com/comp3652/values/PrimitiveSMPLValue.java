package com.comp3652.values;

import com.comp3652.lang.AIRExp;
import com.comp3652.lang.ASTExp;
import com.comp3652.lang.StringExp;

/**
 * Created by carlos on 12/19/15.
 */
public class PrimitiveSMPLValue extends SMPLValue<PrimitiveSMPLValue> {
    protected int default_value;
    protected ASTExp<AIRExp> int_val;
    protected StringExp string_val;

    public PrimitiveSMPLValue(){
        this.default_value = 0;
    }

    public PrimitiveSMPLValue(ASTExp<AIRExp> integer) {
        this.int_val = integer;
    }

    public PrimitiveSMPLValue(StringExp stringExp) {
        this.string_val = stringExp;
    }
}
