package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/23/15.
 */
public class StringExp extends ASTExp<SMPLExp> {

    String string;

    public StringExp(char c) {
        this.string += c;

    }

    public StringExp(String s){

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == '\\' && (index + 1) < s.length()) {
                char controlChar = 0;

                switch (s.charAt(index + 1)) {
                    case '\\':
                        controlChar = '\\';
                        break;

                    case 'n':
                        controlChar = '\n';
                        break;

                    case 't':
                        controlChar = '\t';
                        break;

                    case 'f':
                        controlChar = '\f';
                        break;
                }
                s = s.substring(0, index) + controlChar + s.substring(index + 2);
            }
        }
        this.string = s;
    }

    public <S, T> T visit(StringVisitor<S, T> v, S context) throws SMPLException{
        return v.visitStringExp(this, context);
    }


    @Override
    public <S, T> T visit(ASTVisitor<SMPLExp, S, T> v, S state) throws SMPLException {
        return visit((StringVisitor<S,T>) v,state);
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return string;
    }

}
