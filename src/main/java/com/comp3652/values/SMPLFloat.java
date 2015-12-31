package com.comp3652.values;

import com.comp3652.lang.AIRExpFrac;

/**
 * Created by carlos on 12/27/15.
 */
public class SMPLFloat extends SMPLValue<AIRExpFrac> {
    private Double value;

    public SMPLFloat(AIRExpFrac exps) {
        super(exps);
        this.value = exps.getVal();
    }

    public SMPLFloat(Double exps) {
        super();
        this.value = exps;
    }

    @Override
    public String toString(){
        return "" + value;
    }

}