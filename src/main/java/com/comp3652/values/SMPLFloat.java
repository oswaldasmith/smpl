package com.comp3652.values;

import com.comp3652.lang.SMPLExp;

/**
 * Created by carlos on 12/27/15.
 */
public class SMPLFloat extends SMPLValue<SMPLExp> {
    private Double value;

    public SMPLFloat(SMPLValue<SMPLExp> exps) {
        this.value = new Double(exps.toString());
    }

}
