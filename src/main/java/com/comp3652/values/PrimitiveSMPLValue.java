package com.comp3652.values;

import com.comp3652.lang.AIRExp;
import com.comp3652.lang.ASTExp;
import com.comp3652.lang.SMPLExp;
import com.comp3652.lang.StringExp;

/**
 * Created by carlos on 12/19/15.
 */
<<<<<<< HEAD
public class PrimitiveSMPLValue extends SMPLValue<PrimitiveSMPLValue> {
=======
public class PrimitiveSMPLValue extends SMPLValue<SMPLExp> {
>>>>>>> chadsmpl
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

    public PrimitiveSMPLValue(int size) {
        this.default_value = size;
    }

    public PrimitiveSMPLValue(SMPLExp smplExp) {
        this.default_value =  new Integer(smplExp.toString()).intValue();
    }

    @Override
    public String toString(){
        return new String (String.valueOf(default_value));
    }
}
