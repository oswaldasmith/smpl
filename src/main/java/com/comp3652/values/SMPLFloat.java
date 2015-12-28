package com.comp3652.values;

import com.comp3652.lang.AIRExp;

/**
 * Created by carlos on 12/27/15.
 */
public class SMPLFloat extends SMPLValue<AIRExp> {
    private Double value;

    public SMPLFloat(SMPLValue<AIRExp> exps) {
        this.value = new Double(exps.toString());
    }

}
