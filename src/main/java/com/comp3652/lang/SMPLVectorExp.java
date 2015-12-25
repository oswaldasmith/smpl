package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLVectorExp extends ASTExp<SMPLExp> {
    private ArrayList<AIRExp> list;

    public SMPLVectorExp(ArrayList<T> l) {
        this.list = l;
    }

    public SMPLVectorExp(ArrayList<SMPLExp> l) {

    }

}
