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
    "\10\0\1\0\1\14\1\10\1\11\1\12\1\1\22\0\1\14\1\25"+
    "\1\6\1\63\1\5\1\21\1\0\1\13\1\34\1\35\1\16\1\17"+
    "\1\42\1\20\1\66\1\15\1\64\1\64\10\2\1\22\1\43\1\24"+
    "\1\23\1\24\1\55\1\0\6\4\24\3\1\36\1\7\1\37\1\5"+
    "\1\3\1\0\1\26\1\57\1\50\1\30\1\45\1\46\1\3\1\62"+
    "\1\47\2\3\1\44\1\3\1\27\1\31\1\52\1\60\1\32\1\51"+
    "\1\33\1\56\1\61\1\3\1\65\1\54\1\53\1\40\1\0\1\41"+
    "\1\5\6\0\1\11\u1fa2\0\1\11\1\11\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\0\1\1\1\0\1\4"+
    "\1\5\1\6\1\7\1\10\1\11\1\0\1\12\6\3"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\7\3\2\0\1\23\2\0\1\24\1\25\1\0\1\26"+
    "\1\12\3\3\1\12\7\3\1\27\6\3\1\30\1\31"+
    "\1\32\2\0\1\33\2\34\2\0\1\35\3\3\1\36"+
    "\4\3\1\37\2\3\1\40\5\3\1\41\1\42\1\0"+
    "\1\34\1\43\1\44\1\45\1\46\1\47\1\3\1\50"+
    "\1\51\1\52\1\53\1\3\1\54\1\55\4\3\1\56"+
    "\1\57\1\3\1\60\1\61\1\3\1\62\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[121];
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
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\u0181"+
    "\0\u0113\0\u0113\0\u0113\0\u0113\0\u01b8\0\u01ef\0\u01ef\0\u0226"+
    "\0\u025d\0\u0294\0\u02cb\0\u0302\0\u0339\0\u0113\0\u0113\0\u0113"+
    "\0\u0113\0\u0113\0\u0113\0\u0113\0\u0113\0\u0370\0\u03a7\0\u03de"+
    "\0\u0415\0\u044c\0\u0483\0\u04ba\0\u04f1\0\u0528\0\u0113\0\u055f"+
    "\0\u0596\0\u014a\0\u05cd\0\u0604\0\u0113\0\u0113\0\u063b\0\u0672"+
    "\0\u06a9\0\245\0\u06e0\0\u0717\0\u074e\0\u0785\0\u07bc\0\u07f3"+
    "\0\u082a\0\245\0\u0861\0\u0898\0\u08cf\0\u0906\0\u093d\0\u0974"+
    "\0\245\0\u0113\0\u0113\0\u09ab\0\u09e2\0\u0528\0\u0a19\0\u0113"+
    "\0\u0a50\0\u0a87\0\245\0\u0abe\0\u0af5\0\u0b2c\0\245\0\u0b63"+
    "\0\u0b9a\0\u0bd1\0\u0c08\0\245\0\u0c3f\0\u0c76\0\245\0\u0cad"+
    "\0\u0ce4\0\u0d1b\0\u0d52\0\u0d89\0\u09ab\0\u09e2\0\u0dc0\0\u0a50"+
    "\0\u0df7\0\245\0\245\0\245\0\245\0\u0e2e\0\245\0\245"+
    "\0\245\0\245\0\u0e65\0\u0e9c\0\245\0\u0ed3\0\u0f0a\0\u0f41"+
    "\0\u0f78\0\245\0\u0faf\0\u0fe6\0\245\0\245\0\u101d\0\245"+
    "\0\245";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[121];
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
    "\1\0\1\2\1\3\2\4\1\0\1\5\1\0\1\6"+
    "\1\0\1\6\1\7\1\6\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\16\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\4\1\40\1\41"+
    "\1\42\1\43\2\4\1\0\1\4\1\44\3\4\1\45"+
    "\1\3\1\4\1\46\10\0\1\6\60\0\1\3\3\4"+
    "\7\0\5\4\4\0\6\4\10\0\17\4\1\0\1\3"+
    "\2\4\2\0\4\4\7\0\5\4\4\0\6\4\10\0"+
    "\17\4\1\0\3\4\6\5\1\47\1\50\57\5\67\0"+
    "\6\7\1\0\1\51\3\7\1\52\53\7\15\0\1\53"+
    "\1\54\73\0\1\55\66\0\1\56\45\0\4\4\7\0"+
    "\5\4\4\0\1\4\1\57\4\4\10\0\17\4\1\0"+
    "\3\4\2\0\4\4\7\0\5\4\4\0\3\4\1\60"+
    "\2\4\10\0\17\4\1\0\3\4\2\0\4\4\7\0"+
    "\5\4\4\0\6\4\10\0\1\4\1\61\15\4\1\0"+
    "\3\4\2\0\4\4\7\0\5\4\4\0\4\4\1\62"+
    "\1\4\10\0\17\4\1\0\3\4\2\0\4\4\7\0"+
    "\5\4\4\0\6\4\10\0\1\4\1\63\15\4\1\0"+
    "\3\4\2\0\4\4\7\0\5\4\4\0\6\4\10\0"+
    "\16\4\1\64\1\0\3\4\2\0\4\4\7\0\5\4"+
    "\4\0\1\65\5\4\10\0\1\4\1\66\1\4\1\67"+
    "\13\4\1\0\3\4\2\0\4\4\7\0\5\4\4\0"+
    "\6\4\10\0\1\70\13\4\1\71\2\4\1\0\3\4"+
    "\2\0\4\4\7\0\5\4\4\0\6\4\10\0\2\4"+
    "\1\72\14\4\1\0\3\4\2\0\4\4\7\0\5\4"+
    "\4\0\1\73\1\4\1\74\3\4\10\0\17\4\1\0"+
    "\3\4\2\0\4\4\7\0\5\4\4\0\6\4\10\0"+
    "\3\4\1\75\6\4\1\76\4\4\1\0\3\4\2\0"+
    "\4\4\7\0\5\4\4\0\1\77\3\4\1\100\1\4"+
    "\10\0\17\4\1\0\3\4\2\0\4\4\7\0\5\4"+
    "\4\0\6\4\10\0\1\4\1\101\15\4\1\0\3\4"+
    "\33\0\1\102\12\0\1\103\10\0\1\104\5\0\1\105"+
    "\3\0\1\106\61\0\1\106\2\0\1\5\1\0\6\5"+
    "\3\0\54\5\1\7\1\0\6\7\3\0\54\7\1\53"+
    "\1\107\6\53\1\110\56\53\16\111\1\112\50\111\2\0"+
    "\4\4\7\0\5\4\4\0\2\4\1\62\3\4\10\0"+
    "\17\4\1\0\3\4\2\0\4\4\7\0\5\4\4\0"+
    "\5\4\1\62\10\0\17\4\1\0\3\4\2\0\4\4"+
    "\7\0\5\4\4\0\6\4\10\0\2\4\1\113\14\4"+
    "\1\0\3\4\2\0\4\4\7\0\5\4\4\0\1\114"+
    "\5\4\10\0\17\4\1\0\3\4\2\0\4\4\7\0"+
    "\5\4\4\0\6\4\10\0\1\4\1\115\15\4\1\0"+
    "\3\4\2\0\4\4\7\0\5\4\4\0\6\4\10\0"+
    "\7\4\1\116\7\4\1\0\3\4\2\0\4\4\7\0"+
    "\5\4\4\0\5\4\1\117\10\0\17\4\1\0\3\4"+
    "\2\0\4\4\7\0\5\4\4\0\6\4\10\0\5\4"+
    "\1\120\11\4\1\0\3\4\2\0\4\4\7\0\5\4"+
    "\4\0\6\4\10\0\5\4\1\121\11\4\1\0\3\4"+
    "\2\0\4\4\7\0\5\4\4\0\6\4\10\0\12\4"+
    "\1\122\2\4\1\123\1\4\1\0\3\4\2\0\4\4"+
    "\7\0\5\4\4\0\4\4\1\124\1\4\10\0\1\125"+
    "\4\4\1\126\11\4\1\0\3\4\2\0\4\4\7\0"+
    "\5\4\4\0\4\4\1\127\1\4\10\0\17\4\1\0"+
    "\3\4\2\0\4\4\7\0\5\4\4\0\6\4\10\0"+
    "\7\4\1\130\7\4\1\0\3\4\2\0\4\4\7\0"+
    "\5\4\4\0\6\4\10\0\13\4\1\131\3\4\1\0"+
    "\3\4\2\0\4\4\7\0\5\4\4\0\6\4\10\0"+
    "\3\4\1\132\13\4\1\0\3\4\2\0\4\4\7\0"+
    "\5\4\4\0\3\4\1\133\2\4\10\0\3\4\1\134"+
    "\13\4\1\0\3\4\64\0\1\135\4\0\1\136\1\0"+
    "\1\136\21\0\1\136\1\0\1\136\14\0\2\136\1\0"+
    "\1\136\6\0\1\136\4\0\1\136\12\0\1\110\56\0"+
    "\16\111\1\137\65\111\1\140\1\137\50\111\2\0\4\4"+
    "\7\0\5\4\4\0\2\4\1\141\3\4\10\0\17\4"+
    "\1\0\3\4\2\0\4\4\7\0\5\4\4\0\1\4"+
    "\1\142\4\4\10\0\17\4\1\0\3\4\2\0\4\4"+
    "\7\0\5\4\4\0\6\4\10\0\10\4\1\143\6\4"+
    "\1\0\3\4\2\0\4\4\7\0\5\4\4\0\5\4"+
    "\1\144\10\0\17\4\1\0\3\4\2\0\4\4\7\0"+
    "\5\4\4\0\6\4\10\0\1\4\1\145\15\4\1\0"+
    "\3\4\2\0\4\4\7\0\5\4\4\0\1\146\5\4"+
    "\10\0\17\4\1\0\3\4\2\0\4\4\7\0\5\4"+
    "\4\0\6\4\10\0\11\4\1\147\5\4\1\0\3\4"+
    "\2\0\4\4\7\0\5\4\4\0\6\4\10\0\1\150"+
    "\16\4\1\0\3\4\2\0\4\4\7\0\5\4\4\0"+
    "\6\4\10\0\1\4\1\151\15\4\1\0\3\4\2\0"+
    "\4\4\7\0\5\4\4\0\6\4\10\0\1\4\1\152"+
    "\15\4\1\0\3\4\2\0\4\4\7\0\5\4\4\0"+
    "\6\4\10\0\5\4\1\153\11\4\1\0\3\4\2\0"+
    "\4\4\7\0\5\4\4\0\4\4\1\154\1\4\10\0"+
    "\17\4\1\0\3\4\2\0\4\4\7\0\5\4\4\0"+
    "\6\4\10\0\4\4\1\155\12\4\1\0\3\4\2\0"+
    "\4\4\7\0\5\4\4\0\1\4\1\156\4\4\10\0"+
    "\17\4\1\0\3\4\15\111\1\110\1\137\50\111\2\0"+
    "\4\4\7\0\5\4\4\0\6\4\10\0\3\4\1\157"+
    "\13\4\1\0\3\4\2\0\4\4\7\0\5\4\4\0"+
    "\6\4\10\0\1\160\16\4\1\0\3\4\2\0\4\4"+
    "\7\0\5\4\4\0\5\4\1\161\10\0\17\4\1\0"+
    "\3\4\2\0\4\4\7\0\5\4\4\0\6\4\10\0"+
    "\11\4\1\162\5\4\1\0\3\4\2\0\4\4\7\0"+
    "\5\4\4\0\5\4\1\163\10\0\17\4\1\0\3\4"+
    "\2\0\4\4\7\0\5\4\4\0\1\4\1\164\4\4"+
    "\10\0\17\4\1\0\3\4\2\0\4\4\7\0\5\4"+
    "\4\0\6\4\10\0\11\4\1\165\5\4\1\0\3\4"+
    "\2\0\4\4\7\0\5\4\4\0\4\4\1\166\1\4"+
    "\10\0\17\4\1\0\3\4\2\0\4\4\7\0\5\4"+
    "\4\0\6\4\10\0\1\167\16\4\1\0\3\4\2\0"+
    "\4\4\7\0\5\4\4\0\5\4\1\170\10\0\17\4"+
    "\1\0\3\4\2\0\4\4\7\0\5\4\4\0\1\4"+
    "\1\171\4\4\10\0\17\4\1\0\3\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4180];
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
    "\1\0\3\1\1\0\1\11\1\0\1\1\4\11\1\1"+
    "\1\0\7\1\10\11\7\1\2\0\1\11\2\0\2\1"+
    "\1\0\2\11\23\1\2\11\2\0\2\1\1\11\2\0"+
    "\24\1\1\0\32\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[121];
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
    public StringBuilder newLines;
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
    while (i < 186) {
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
            { // INTEGER
	       return new Symbol(sym.INTEGER,
				 new Integer(yytext()));
            }
          case 53: break;
          case 3: 
            { // VARIABLE
	       return new Symbol(sym.VAR, yytext());
            }
          case 54: break;
          case 4: 
            { return new Symbol(sym.DIV);
            }
          case 55: break;
          case 5: 
            { return new Symbol(sym.TIMES);
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
            { return new Symbol(sym.STRING_LITERAL, yytext().substring(1, yylength() - 1));
            }
          case 70: break;
          case 20: 
            { return new Symbol(sym.CHAR, yytext().substring(1, yylength() - 1));
            }
          case 71: break;
          case 21: 
            { 
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
            { // FRACTION
			return new Symbol(sym.FRACTION, new Double(yytext()));
            }
          case 78: break;
          case 28: 
            { char[] ch;
                            ch = yytext().toCharArray();
                            newLines = new StringBuilder();
                            for (char c : ch)
                            {
                                if (c == '\n')
                                {
                                    newLines.append(c);
                                }
                            }
                            return LexerToken.NEW_LINES;
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
