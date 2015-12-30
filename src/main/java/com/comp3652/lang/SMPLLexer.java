/* The following code was generated by JFlex 1.6.1 */

/* Specification for SMPL tokens */

// user customisations
package com.comp3652.lang;

import java_cup.runtime.*;
import java.io.IOException;

// Jlex directives

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>/home/shane/Documents/School/LP/smpl/src/main/jflex/SMPLLexer.flex</tt>
 */
public class SMPLLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\3\1\3\1\2\1\13\1\14\1\1\22\0\1\3\1\25"+
    "\1\12\1\63\1\0\1\21\1\0\1\16\1\34\1\35\1\5\1\17"+
    "\1\42\1\20\1\11\1\4\1\64\1\64\10\6\1\22\1\43\1\24"+
    "\1\23\1\24\1\55\1\0\6\10\24\7\1\36\1\15\1\37\3\0"+
    "\1\26\1\57\1\50\1\30\1\45\1\46\1\7\1\62\1\47\2\7"+
    "\1\44\1\7\1\27\1\31\1\52\1\60\1\32\1\51\1\33\1\56"+
    "\1\61\1\7\1\65\1\54\1\53\1\40\1\0\1\41\7\0\1\13"+
    "\u1fa2\0\1\13\1\13\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\1\4\1\5\3\0\1\6"+
    "\1\7\1\10\1\11\2\12\1\0\6\5\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\7\5\1\0"+
    "\1\23\1\24\1\0\1\25\4\0\1\26\3\5\1\12"+
    "\7\5\1\27\6\5\1\30\1\31\1\32\2\0\2\24"+
    "\2\0\2\33\1\34\1\35\3\5\1\36\4\5\1\37"+
    "\2\5\1\40\5\5\1\41\1\42\1\0\1\24\1\43"+
    "\1\44\1\45\1\46\1\47\1\5\1\50\1\51\1\52"+
    "\1\53\1\5\1\54\1\55\4\5\1\56\1\57\1\5"+
    "\1\60\1\61\1\5\1\62\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\154\0\330\0\u010e\0\u0144"+
    "\0\u017a\0\u01b0\0\154\0\154\0\154\0\u01e6\0\154\0\u021c"+
    "\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4\0\u032a\0\u0360\0\154"+
    "\0\154\0\154\0\154\0\154\0\154\0\154\0\154\0\u0396"+
    "\0\u03cc\0\u0402\0\u0438\0\u046e\0\u04a4\0\u04da\0\u0510\0\154"+
    "\0\u0546\0\u057c\0\u0144\0\u05b2\0\u05e8\0\u061e\0\u0654\0\154"+
    "\0\u068a\0\u06c0\0\u06f6\0\u010e\0\u072c\0\u0762\0\u0798\0\u07ce"+
    "\0\u0804\0\u083a\0\u0870\0\u010e\0\u08a6\0\u08dc\0\u0912\0\u0948"+
    "\0\u097e\0\u09b4\0\u010e\0\154\0\154\0\u09ea\0\u0a20\0\u0a56"+
    "\0\154\0\u0a8c\0\u0ac2\0\u05b2\0\154\0\154\0\u010e\0\u0af8"+
    "\0\u0b2e\0\u0b64\0\u010e\0\u0b9a\0\u0bd0\0\u0c06\0\u0c3c\0\u010e"+
    "\0\u0c72\0\u0ca8\0\u010e\0\u0cde\0\u0d14\0\u0d4a\0\u0d80\0\u0db6"+
    "\0\u09ea\0\u0a20\0\u0dec\0\u0a8c\0\u0e22\0\u010e\0\u010e\0\u010e"+
    "\0\u010e\0\u0e58\0\154\0\u010e\0\u010e\0\u010e\0\u0e8e\0\u0ec4"+
    "\0\u010e\0\u0efa\0\u0f30\0\u0f66\0\u0f9c\0\154\0\u0fd2\0\u1008"+
    "\0\154\0\u010e\0\u103e\0\u010e\0\u010e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\2\2\3\1\4\1\5\1\6\2\7\1\10"+
    "\1\11\1\0\1\3\1\0\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\7\1\42\1\43\1\44"+
    "\1\45\2\7\1\0\1\7\1\46\3\7\1\47\1\6"+
    "\1\7\2\0\1\50\155\0\1\51\1\52\65\0\1\7"+
    "\1\6\3\7\5\0\2\7\4\0\7\7\10\0\11\7"+
    "\1\0\6\7\1\6\1\7\5\0\5\7\5\0\2\7"+
    "\4\0\7\7\10\0\11\7\1\0\10\7\6\0\1\53"+
    "\55\0\1\53\1\0\1\54\1\0\1\55\10\54\1\0"+
    "\1\55\51\54\1\56\1\0\11\56\1\0\1\56\1\57"+
    "\50\56\23\0\1\60\65\0\1\17\47\0\5\7\5\0"+
    "\2\7\4\0\2\7\1\61\4\7\10\0\11\7\1\0"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\4\7\1\62"+
    "\2\7\10\0\11\7\1\0\10\7\5\0\5\7\5\0"+
    "\2\7\4\0\7\7\10\0\1\7\1\63\7\7\1\0"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\5\7\1\64"+
    "\1\7\10\0\11\7\1\0\10\7\5\0\5\7\5\0"+
    "\2\7\4\0\7\7\10\0\1\7\1\65\7\7\1\0"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\7\7\10\0"+
    "\11\7\1\0\4\7\1\66\3\7\5\0\5\7\5\0"+
    "\2\7\4\0\1\7\1\67\5\7\10\0\1\7\1\70"+
    "\1\7\1\71\5\7\1\0\10\7\5\0\5\7\5\0"+
    "\2\7\4\0\7\7\10\0\1\72\10\7\1\0\2\7"+
    "\1\73\5\7\5\0\5\7\5\0\2\7\4\0\7\7"+
    "\10\0\2\7\1\74\6\7\1\0\10\7\5\0\5\7"+
    "\5\0\2\7\4\0\1\7\1\75\1\7\1\76\3\7"+
    "\10\0\11\7\1\0\10\7\5\0\5\7\5\0\2\7"+
    "\4\0\7\7\10\0\3\7\1\77\5\7\1\0\1\100"+
    "\7\7\5\0\5\7\5\0\2\7\4\0\1\7\1\101"+
    "\3\7\1\102\1\7\10\0\11\7\1\0\10\7\5\0"+
    "\5\7\5\0\2\7\4\0\7\7\10\0\1\7\1\103"+
    "\7\7\1\0\10\7\33\0\1\104\12\0\1\105\10\0"+
    "\1\106\5\0\1\107\1\51\1\110\1\111\63\51\5\112"+
    "\1\113\60\112\1\54\2\0\7\54\1\114\2\0\51\54"+
    "\12\0\1\115\71\0\1\116\64\0\1\56\1\116\54\0"+
    "\5\7\5\0\2\7\4\0\3\7\1\64\3\7\10\0"+
    "\11\7\1\0\10\7\5\0\5\7\5\0\2\7\4\0"+
    "\6\7\1\64\10\0\11\7\1\0\10\7\5\0\5\7"+
    "\5\0\2\7\4\0\7\7\10\0\2\7\1\117\6\7"+
    "\1\0\10\7\5\0\5\7\5\0\2\7\4\0\1\7"+
    "\1\120\5\7\10\0\11\7\1\0\10\7\5\0\5\7"+
    "\5\0\2\7\4\0\7\7\10\0\1\7\1\121\7\7"+
    "\1\0\10\7\5\0\5\7\5\0\2\7\4\0\7\7"+
    "\10\0\7\7\1\122\1\7\1\0\10\7\5\0\5\7"+
    "\5\0\2\7\4\0\6\7\1\123\10\0\11\7\1\0"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\7\7\10\0"+
    "\5\7\1\124\3\7\1\0\10\7\5\0\5\7\5\0"+
    "\2\7\4\0\7\7\10\0\5\7\1\125\3\7\1\0"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\7\7\10\0"+
    "\11\7\1\0\1\126\2\7\1\127\4\7\5\0\5\7"+
    "\5\0\2\7\4\0\5\7\1\130\1\7\10\0\1\131"+
    "\4\7\1\132\3\7\1\0\10\7\5\0\5\7\5\0"+
    "\2\7\4\0\5\7\1\133\1\7\10\0\11\7\1\0"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\7\7\10\0"+
    "\7\7\1\134\1\7\1\0\10\7\5\0\5\7\5\0"+
    "\2\7\4\0\7\7\10\0\11\7\1\0\1\7\1\135"+
    "\6\7\5\0\5\7\5\0\2\7\4\0\7\7\10\0"+
    "\3\7\1\136\5\7\1\0\10\7\5\0\5\7\5\0"+
    "\2\7\4\0\4\7\1\137\2\7\10\0\3\7\1\140"+
    "\5\7\1\0\10\7\64\0\1\141\7\0\1\142\1\0"+
    "\1\142\15\0\1\142\1\0\1\142\14\0\2\142\1\0"+
    "\1\142\6\0\1\142\4\0\1\142\3\0\1\111\63\0"+
    "\5\112\1\143\64\112\1\144\1\143\60\112\5\0\5\7"+
    "\5\0\2\7\4\0\3\7\1\145\3\7\10\0\11\7"+
    "\1\0\10\7\5\0\5\7\5\0\2\7\4\0\2\7"+
    "\1\146\4\7\10\0\11\7\1\0\10\7\5\0\5\7"+
    "\5\0\2\7\4\0\7\7\10\0\10\7\1\147\1\0"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\6\7\1\150"+
    "\10\0\11\7\1\0\10\7\5\0\5\7\5\0\2\7"+
    "\4\0\7\7\10\0\1\7\1\151\7\7\1\0\10\7"+
    "\5\0\5\7\5\0\2\7\4\0\1\7\1\152\5\7"+
    "\10\0\11\7\1\0\10\7\5\0\5\7\5\0\2\7"+
    "\4\0\7\7\10\0\11\7\1\153\10\7\5\0\5\7"+
    "\5\0\2\7\4\0\7\7\10\0\1\154\10\7\1\0"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\7\7\10\0"+
    "\1\7\1\155\7\7\1\0\10\7\5\0\5\7\5\0"+
    "\2\7\4\0\7\7\10\0\1\7\1\156\7\7\1\0"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\7\7\10\0"+
    "\5\7\1\157\3\7\1\0\10\7\5\0\5\7\5\0"+
    "\2\7\4\0\5\7\1\160\1\7\10\0\11\7\1\0"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\7\7\10\0"+
    "\4\7\1\161\4\7\1\0\10\7\5\0\5\7\5\0"+
    "\2\7\4\0\2\7\1\162\4\7\10\0\11\7\1\0"+
    "\10\7\4\112\1\111\1\143\60\112\5\0\5\7\5\0"+
    "\2\7\4\0\7\7\10\0\3\7\1\163\5\7\1\0"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\7\7\10\0"+
    "\1\164\10\7\1\0\10\7\5\0\5\7\5\0\2\7"+
    "\4\0\6\7\1\165\10\0\11\7\1\0\10\7\5\0"+
    "\5\7\5\0\2\7\4\0\7\7\10\0\11\7\1\166"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\6\7\1\167"+
    "\10\0\11\7\1\0\10\7\5\0\5\7\5\0\2\7"+
    "\4\0\2\7\1\170\4\7\10\0\11\7\1\0\10\7"+
    "\5\0\5\7\5\0\2\7\4\0\7\7\10\0\11\7"+
    "\1\171\10\7\5\0\5\7\5\0\2\7\4\0\5\7"+
    "\1\172\1\7\10\0\11\7\1\0\10\7\5\0\5\7"+
    "\5\0\2\7\4\0\7\7\10\0\1\173\10\7\1\0"+
    "\10\7\5\0\5\7\5\0\2\7\4\0\6\7\1\174"+
    "\10\0\11\7\1\0\10\7\5\0\5\7\5\0\2\7"+
    "\4\0\2\7\1\175\4\7\10\0\11\7\1\0\10\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4212];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\1\11\1\1\1\11\2\1\3\0\3\11"+
    "\1\1\1\11\1\1\1\0\6\1\10\11\7\1\1\0"+
    "\1\11\1\1\1\0\1\1\4\0\1\11\23\1\2\11"+
    "\2\0\1\1\1\11\2\0\1\1\2\11\24\1\1\0"+
    "\7\1\1\11\12\1\1\11\2\1\1\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public int getChar() {
	return yychar + 1;
    }

    public int getColumn() {
    	return yycolumn + 1;
    }

    public int getLine() {
	return yyline + 1;
    }

    public String getText() {
	return yytext();
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public SMPLLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 180) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          { 	return new Symbol(sym.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /* ignore whitespace */
            }
          case 52: break;
          case 2: 
            { return new Symbol(sym.DIV);
            }
          case 53: break;
          case 3: 
            { return new Symbol(sym.TIMES);
            }
          case 54: break;
          case 4: 
            { // INTEGER
	       return new Symbol(sym.INTEGER,
				 new Integer(yytext()));
            }
          case 55: break;
          case 5: 
            { // VARIABLE
	       return new Symbol(sym.VAR, yytext());
            }
          case 56: break;
          case 6: 
            { return new Symbol(sym.PLUS);
            }
          case 57: break;
          case 7: 
            { return new Symbol(sym.MINUS);
            }
          case 58: break;
          case 8: 
            { return new Symbol(sym.MOD);
            }
          case 59: break;
          case 9: 
            { return new Symbol(sym.COLON);
            }
          case 60: break;
          case 10: 
            { return new Symbol(sym.CMP, yytext());
            }
          case 61: break;
          case 11: 
            { return new Symbol(sym.LPAREN);
            }
          case 62: break;
          case 12: 
            { return new Symbol(sym.RPAREN);
            }
          case 63: break;
          case 13: 
            { return new Symbol(sym.LBRACKET);
            }
          case 64: break;
          case 14: 
            { return new Symbol(sym.RBRACKET);
            }
          case 65: break;
          case 15: 
            { return new Symbol(sym.LBRACE);
            }
          case 66: break;
          case 16: 
            { return new Symbol(sym.RBRACE);
            }
          case 67: break;
          case 17: 
            { return new Symbol(sym.COMMA);
            }
          case 68: break;
          case 18: 
            { return new Symbol(sym.SEMI);
            }
          case 69: break;
          case 19: 
            { //skip newline, but reset char counter
                        yychar = 0;
            }
          case 70: break;
          case 20: 
            { /* comments */
            }
          case 71: break;
          case 21: 
            { // FRACTION
			return new Symbol(sym.FRACTION, new Double(yytext()));
            }
          case 72: break;
          case 22: 
            { return new Symbol(sym.ASSIGN);
            }
          case 73: break;
          case 23: 
            { return new Symbol(sym.IF);
            }
          case 74: break;
          case 24: 
            { return new Symbol(sym.BE);
            }
          case 75: break;
          case 25: 
            { return new Symbol(sym.TRUE, yytext());
            }
          case 76: break;
          case 26: 
            { return new Symbol(sym.FALSE, yytext());
            }
          case 77: break;
          case 27: 
            { return new Symbol(sym.STRING_LITERAL, yytext().substring(1, yylength() - 1));
            }
          case 78: break;
          case 28: 
            { return new Symbol(sym.CHAR, yytext().substring(1, yylength() - 1));
            }
          case 79: break;
          case 29: 
            { return new Symbol(sym.DEF);
            }
          case 80: break;
          case 30: 
            { return new Symbol(sym.LET);
            }
          case 81: break;
          case 31: 
            { return new Symbol(sym.CAR);
            }
          case 82: break;
          case 32: 
            { return new Symbol(sym.CDR);
            }
          case 83: break;
          case 33: 
            { return new Symbol(sym.BIN, Integer.parseInt(yytext().substring(2), 2));
            }
          case 84: break;
          case 34: 
            { return new Symbol(sym.HEX, Integer.parseInt(yytext().substring(2), 16));
            }
          case 85: break;
          case 35: 
            { return new Symbol(sym.READ);
            }
          case 86: break;
          case 36: 
            { return new Symbol(sym.THEN);
            }
          case 87: break;
          case 37: 
            { return new Symbol(sym.LAZY);
            }
          case 88: break;
          case 38: 
            { return new Symbol(sym.LIST);
            }
          case 89: break;
          case 39: 
            { return new Symbol(sym.ELSE);
            }
          case 90: break;
          case 40: 
            { return new Symbol(sym.IFEQUIVALENT);
            }
          case 91: break;
          case 41: 
            { return new Symbol(sym.CALL);
            }
          case 92: break;
          case 42: 
            { return new Symbol(sym.CASE);
            }
          case 93: break;
          case 43: 
            { return new Symbol(sym.SIZE);
            }
          case 94: break;
          case 44: 
            { return new Symbol(sym.PAIR);
            }
          case 95: break;
          case 45: 
            { return new Symbol(sym.PROC);
            }
          case 96: break;
          case 46: 
            { return new Symbol(sym.IFPAIR);
            }
          case 97: break;
          case 47: 
            { return new Symbol(sym.PRINT);
            }
          case 98: break;
          case 48: 
            { return new Symbol(sym.IFEQUAL);
            }
          case 99: break;
          case 49: 
            { return new Symbol(sym.SUBSTRING);
            }
          case 100: break;
          case 50: 
            { return new Symbol(sym.READINT);
            }
          case 101: break;
          case 51: 
            { return new Symbol(sym.PRINTLN);
            }
          case 102: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
