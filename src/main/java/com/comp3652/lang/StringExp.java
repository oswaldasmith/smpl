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

    public StringExp(String s) {

        for (int i = 0; i < s.length(); i++) {

            int end = -1;

            if (s.charAt(i) == '#' && i + 1 < s.length()) {

                int offset = i + 1;
                String tmp = "";

                if (s.charAt(offset) == 'b') {
                    offset += 1;

                    while (offset < s.length()) {

                        if (s.substring(offset, offset + 1).matches("[0-1]"))
                            tmp += s.substring(offset, offset + 1);
                        else
                            break;

                        offset++;
                    }

                    end = tmp.length();

                    tmp = "" + Integer.parseInt(tmp, 2);

                    if (i != 0)
                        s = s.substring(0, i) + tmp + s.substring(offset);
                    else
                        s = tmp + s.substring(offset);
                } else if (s.charAt(offset) == 'x') {
                    offset += 1;

                    while (offset < s.length()) {

                        if (s.substring(offset, offset + 1).matches("[0-9a-fA-F]"))
                            tmp += s.substring(offset, offset + 1);
                        else
                            break;

                        offset++;
                    }

                    end = tmp.length();

                    tmp = "" + Integer.parseInt(tmp, 16);

                    if (i != 0)
                        s = s.substring(0, i) + tmp + s.substring(offset);
                    else
                        s = tmp + s.substring(offset);
                } else if (s.charAt(offset) == '\\' && s.substring(offset + 1, offset + 5).matches("[0-9a-fA-F]{4}")) {

                    String hex = s.substring(offset + 1, offset + 5);

                    int ascii = Integer.parseInt(hex, 16);


                    String var = Character.toString((char) ascii);

                    if (i != 0)
                        s = s.substring(0, i) + var + s.substring(offset + 5);
                    else
                        s = tmp + s.substring(offset + 5);
                }

            }
        }


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
