package com.comp3652.lang;


<<<<<<< HEAD
public class SMPLPairExp extends SMPLExp {

	

}
=======
import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLPairExp extends ASTExp<SMPLExp> {

    public SMPLPairExp(SMPLExp e1, SMPLExp e2) {

    }

    public SMPLPairExp(ASTExp<AIRExp> e1, ASTExp<AIRExp> e2) {

    }

    @Override
    public <S, T> T visit(ASTVisitor<SMPLExp, S, T> v, S state) throws SMPLException {
        return null;
    }
}
>>>>>>> chadsmpl
