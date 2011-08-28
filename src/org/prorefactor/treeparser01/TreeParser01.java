// $ANTLR 2.7.7 (20060906): "expandedtreeparser01.g" -> "TreeParser01.java"$

	package org.prorefactor.treeparser01;

	import org.prorefactor.core.IJPNode;
	import org.prorefactor.treeparser.CQ;
	import org.prorefactor.treeparser.IJPTreeParser;
	
	import java.util.ArrayList;

import antlr.TreeParser;
import antlr.Token;
import antlr.collections.AST;
import antlr.RecognitionException;
import antlr.ANTLRException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.collections.impl.BitSet;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;



public class TreeParser01 extends antlr.TreeParser       implements TreeParser01TokenTypes
, IJPTreeParser {


	// --- The following are required in all tree parsers ---

	// Where did the tree parser leave off parsing -- might give us at least a bit
	// of an idea where things left off if an exception was thrown.
	// See antlr/TreeParser and the generated code.
	public AST get_retTree() {
		return _retTree;
	}

	// Func for grabbing the "state2" attribute from the node at LT(1) 
	private boolean state2(AST node, int match) {
		return ((IJPNode)node).getState2() == match;
	}


	// --- The above are for all tree parsers, below are for TreeParser01 ---


	/** Create a tree parser with a specific action object. */
	public TreeParser01(TP01Action actionObject) {
		action = actionObject;
	}
	
	/** By default, the action object is a new TP01Support. */
	TP01Action action = null; // See initialization block, below.

	// Initialization block
	{
		if (action==null) action = new TP01Support();
	}

	/** Get the action object. getActionObject and getTpSupport are identical. */
	public TP01Action getActionObject() { return action; }

	/** Set the action object.
	 * By default, the support object is a new TP01Support,
	 * but you can configure this to be any TP01Action object.
	 * setTpSupport and setActionObject are identical.
	 */
	public void setActionObject(TP01Action action) { this.action = action; }


	/** This tree parser's stack. I think it is best to keep the stack
	 * in the tree parser grammar for visibility sake, rather than hide
	 * it in the support class. If we move grammar and actions around
	 * within this .g, the effect on the stack should be highly visible.
	 */	
	private ArrayList stack = new ArrayList();
	private void push(Object o) { stack.add(o); }
	private Object pop() { return stack.remove(stack.size()-1); }


public TreeParser01() {
	tokenNames = _tokenNames;
}

	public final void program(AST _t) throws RecognitionException {
		
		AST program_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST p = null;
		
		AST __t2 = _t;
		p = _t==ASTNULL ? null :(AST)_t;
		match(_t,Program_root);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.programRoot(p);
		}
		{
		_loop4:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_0.member(_t.getType()))) {
				blockorstate(_t);
				_t = _retTree;
			}
			else {
				break _loop4;
			}
			
		} while (true);
		}
		AST tmp1_AST_in = (AST)_t;
		match(_t,Program_tail);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.programTail();
		}
		_t = __t2;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void blockorstate(AST _t) throws RecognitionException {
		
		AST blockorstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BLOCK_LABEL:
		{
			labeled_block(_t);
			_t = _retTree;
			break;
		}
		case AATRACE:
		case ACCUMULATE:
		case ALTER:
		case ANALYZE:
		case APPLY:
		case ASSIGN:
		case BELL:
		case BTOS:
		case BUFFERCOMPARE:
		case BUFFERCOPY:
		case CALL:
		case CASE:
		case CHOOSE:
		case CLEAR:
		case CLOSE:
		case COLOR:
		case COMPILE:
		case CONNECT:
		case CREATE:
		case DDE:
		case DECLARE:
		case DEFINE:
		case DELETE_KW:
		case DICTIONARY:
		case DISABLE:
		case DISCONNECT:
		case DISPLAY:
		case DO:
		case DOS:
		case DOWN:
		case DROP:
		case EMPTY:
		case ENABLE:
		case EXPORT:
		case FETCH:
		case FIND:
		case FOR:
		case FORMAT:
		case FUNCTION:
		case GET:
		case GETKEYVALUE:
		case GRANT:
		case HIDE:
		case IF:
		case IMPORT:
		case INPUT:
		case INPUTOUTPUT:
		case INSERT:
		case LEAVE:
		case LOAD:
		case MESSAGE:
		case MPE:
		case NEXT:
		case NEXTPROMPT:
		case ON:
		case OPEN:
		case OS2:
		case OS400:
		case OSAPPEND:
		case OSCOMMAND:
		case OSCOPY:
		case OSCREATEDIR:
		case OSDELETE:
		case OSRENAME:
		case OUTPUT:
		case PAGE:
		case PAUSE:
		case PROCEDURE:
		case PROCESS:
		case PROMPTFOR:
		case PUBLISH:
		case PUT:
		case PUTKEYVALUE:
		case QUIT:
		case RAWTRANSFER:
		case READKEY:
		case RELEASE:
		case REPEAT:
		case REPOSITION:
		case RETURN:
		case REVOKE:
		case RUN:
		case SAVE:
		case SCROLL:
		case SEEK:
		case SELECT:
		case SET:
		case SHOWSTATS:
		case STATUS:
		case STOP:
		case SUBSCRIBE:
		case SYSTEMDIALOG:
		case SYSTEMHELP:
		case TRANSACTIONMODE:
		case TRIGGER:
		case UNDERLINE:
		case UNDO:
		case UNIX:
		case UNLOAD:
		case UNSUBSCRIBE:
		case UP:
		case UPDATE:
		case USE:
		case USING:
		case VALIDATE:
		case VIEW:
		case VMS:
		case WAITFOR:
		case COPYLOB:
		case CLASS:
		case CONSTRUCTOR:
		case INTERFACE:
		case METHOD:
		case THISOBJECT:
		case DESTRUCTOR:
		case CATCH:
		case FINALLY:
		case ROUTINELEVEL:
		case Assign_dynamic_new:
		{
			statement(_t);
			_t = _retTree;
			break;
		}
		case Expr_statement:
		{
			AST __t1431 = _t;
			AST tmp2_AST_in = (AST)_t;
			match(_t,Expr_statement);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOERROR_KW:
			{
				AST tmp3_AST_in = (AST)_t;
				match(_t,NOERROR_KW);
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			state_end(_t);
			_t = _retTree;
			_t = __t1431;
			_t = _t.getNextSibling();
			break;
		}
		case PROPARSEDIRECTIVE:
		{
			AST tmp4_AST_in = (AST)_t;
			match(_t,PROPARSEDIRECTIVE);
			_t = _t.getNextSibling();
			break;
		}
		case PERIOD:
		{
			AST tmp5_AST_in = (AST)_t;
			match(_t,PERIOD);
			_t = _t.getNextSibling();
			break;
		}
		case DOT_COMMENT:
		{
			AST tmp6_AST_in = (AST)_t;
			match(_t,DOT_COMMENT);
			_t = _t.getNextSibling();
			break;
		}
		case ANNOTATION:
		{
			AST __t1433 = _t;
			AST tmp7_AST_in = (AST)_t;
			match(_t,ANNOTATION);
			_t = _t.getFirstChild();
			{
			_loop1435:
			do {
				if (_t==null) _t=ASTNULL;
				if (((_t.getType() >= LEXDATE && _t.getType() <= Last_Token_Number))) {
					AST tmp8_AST_in = (AST)_t;
					if ( _t==null ) throw new MismatchedTokenException();
					_t = _t.getNextSibling();
				}
				else {
					break _loop1435;
				}
				
			} while (true);
			}
			_t = __t1433;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_retTree = _t;
	}
	
	public final void block_for(AST _t) throws RecognitionException {
		
		AST block_for_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST rn1 = null;
		AST rn2 = null;
		
		AST __t6 = _t;
		AST tmp9_AST_in = (AST)_t;
		match(_t,FOR);
		_t = _t.getFirstChild();
		rn1 = _t==ASTNULL ? null : (AST)_t;
		tbl(_t,CQ.BUFFERSYMBOL);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.strongScope(rn1);
		}
		{
		_loop8:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp10_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				rn2 = _t==ASTNULL ? null : (AST)_t;
				tbl(_t,CQ.BUFFERSYMBOL);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
					action.strongScope(rn2);
				}
			}
			else {
				break _loop8;
			}
			
		} while (true);
		}
		_t = __t6;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void tbl(AST _t,
		int contextQualifier
	) throws RecognitionException {
		
		AST tbl_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST id = null;
		
		id = (AST)_t;
		match(_t,RECORD_NAME);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.recordNameNode(id, contextQualifier);
		}
		_retTree = _t;
	}
	
	public final void block_opt(AST _t) throws RecognitionException {
		
		AST block_opt_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Block_iterator:
		{
			AST __t10 = _t;
			AST tmp11_AST_in = (AST)_t;
			match(_t,Block_iterator);
			_t = _t.getFirstChild();
			fld(_t,CQ.UPDATING);
			_t = _retTree;
			AST tmp12_AST_in = (AST)_t;
			match(_t,EQUAL);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			AST tmp13_AST_in = (AST)_t;
			match(_t,TO);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case BY:
			{
				AST tmp14_AST_in = (AST)_t;
				match(_t,BY);
				_t = _t.getNextSibling();
				constant(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t10;
			_t = _t.getNextSibling();
			break;
		}
		case QUERYTUNING:
		{
			querytuningphrase(_t);
			_t = _retTree;
			break;
		}
		case WHILE:
		{
			AST __t12 = _t;
			AST tmp15_AST_in = (AST)_t;
			match(_t,WHILE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t12;
			_t = _t.getNextSibling();
			break;
		}
		case TRANSACTION:
		{
			AST tmp16_AST_in = (AST)_t;
			match(_t,TRANSACTION);
			_t = _t.getNextSibling();
			break;
		}
		case STOPAFTER:
		{
			AST __t13 = _t;
			AST tmp17_AST_in = (AST)_t;
			match(_t,STOPAFTER);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t13;
			_t = _t.getNextSibling();
			break;
		}
		case ON:
		{
			on___phrase(_t);
			_t = _retTree;
			break;
		}
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case BREAK:
		{
			AST tmp18_AST_in = (AST)_t;
			match(_t,BREAK);
			_t = _t.getNextSibling();
			break;
		}
		case BY:
		{
			AST __t14 = _t;
			AST tmp19_AST_in = (AST)_t;
			match(_t,BY);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case DESCENDING:
			{
				AST tmp20_AST_in = (AST)_t;
				match(_t,DESCENDING);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t14;
			_t = _t.getNextSibling();
			break;
		}
		case COLLATE:
		{
			collatephrase(_t);
			_t = _retTree;
			break;
		}
		case GROUP:
		{
			AST __t16 = _t;
			AST tmp21_AST_in = (AST)_t;
			match(_t,GROUP);
			_t = _t.getFirstChild();
			{
			int _cnt20=0;
			_loop20:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==BY)) {
					AST __t18 = _t;
					AST tmp22_AST_in = (AST)_t;
					match(_t,BY);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case DESCENDING:
					{
						AST tmp23_AST_in = (AST)_t;
						match(_t,DESCENDING);
						_t = _t.getNextSibling();
						break;
					}
					case 3:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					_t = __t18;
					_t = _t.getNextSibling();
				}
				else {
					if ( _cnt20>=1 ) { break _loop20; } else {throw new NoViableAltException(_t);}
				}
				
				_cnt20++;
			} while (true);
			}
			_t = __t16;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void fld(AST _t,
		int contextQualifier
	) throws RecognitionException {
		
		AST fld_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST ref = null;
		AST id = null;
		
		AST __t127 = _t;
		ref = _t==ASTNULL ? null :(AST)_t;
		match(_t,Field_ref);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case INPUT:
		{
			AST tmp24_AST_in = (AST)_t;
			match(_t,INPUT);
			_t = _t.getNextSibling();
			break;
		}
		case BROWSE:
		case FRAME:
		case ID:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FRAME:
		{
			frame_ref(_t);
			_t = _retTree;
			break;
		}
		case BROWSE:
		{
			browse_ref(_t);
			_t = _retTree;
			break;
		}
		case ID:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Array_subscript:
		{
			array_subscript(_t);
			_t = _retTree;
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t127;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.field(ref, id, contextQualifier, 0);
		}
		_retTree = _t;
	}
	
	public final void expression(AST _t) throws RecognitionException {
		
		AST expression_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case OR:
		{
			AST __t1623 = _t;
			AST tmp25_AST_in = (AST)_t;
			match(_t,OR);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1623;
			_t = _t.getNextSibling();
			break;
		}
		case AND:
		{
			AST __t1624 = _t;
			AST tmp26_AST_in = (AST)_t;
			match(_t,AND);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1624;
			_t = _t.getNextSibling();
			break;
		}
		case NOT:
		{
			AST __t1625 = _t;
			AST tmp27_AST_in = (AST)_t;
			match(_t,NOT);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1625;
			_t = _t.getNextSibling();
			break;
		}
		case MATCHES:
		{
			AST __t1626 = _t;
			AST tmp28_AST_in = (AST)_t;
			match(_t,MATCHES);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1626;
			_t = _t.getNextSibling();
			break;
		}
		case BEGINS:
		{
			AST __t1627 = _t;
			AST tmp29_AST_in = (AST)_t;
			match(_t,BEGINS);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1627;
			_t = _t.getNextSibling();
			break;
		}
		case CONTAINS:
		{
			AST __t1628 = _t;
			AST tmp30_AST_in = (AST)_t;
			match(_t,CONTAINS);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1628;
			_t = _t.getNextSibling();
			break;
		}
		case EQ:
		{
			AST __t1629 = _t;
			AST tmp31_AST_in = (AST)_t;
			match(_t,EQ);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1629;
			_t = _t.getNextSibling();
			break;
		}
		case NE:
		{
			AST __t1630 = _t;
			AST tmp32_AST_in = (AST)_t;
			match(_t,NE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1630;
			_t = _t.getNextSibling();
			break;
		}
		case GTHAN:
		{
			AST __t1631 = _t;
			AST tmp33_AST_in = (AST)_t;
			match(_t,GTHAN);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1631;
			_t = _t.getNextSibling();
			break;
		}
		case GE:
		{
			AST __t1632 = _t;
			AST tmp34_AST_in = (AST)_t;
			match(_t,GE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1632;
			_t = _t.getNextSibling();
			break;
		}
		case LTHAN:
		{
			AST __t1633 = _t;
			AST tmp35_AST_in = (AST)_t;
			match(_t,LTHAN);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1633;
			_t = _t.getNextSibling();
			break;
		}
		case LE:
		{
			AST __t1634 = _t;
			AST tmp36_AST_in = (AST)_t;
			match(_t,LE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1634;
			_t = _t.getNextSibling();
			break;
		}
		case PLUS:
		{
			AST __t1635 = _t;
			AST tmp37_AST_in = (AST)_t;
			match(_t,PLUS);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1635;
			_t = _t.getNextSibling();
			break;
		}
		case MINUS:
		{
			AST __t1636 = _t;
			AST tmp38_AST_in = (AST)_t;
			match(_t,MINUS);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1636;
			_t = _t.getNextSibling();
			break;
		}
		case MULTIPLY:
		{
			AST __t1637 = _t;
			AST tmp39_AST_in = (AST)_t;
			match(_t,MULTIPLY);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1637;
			_t = _t.getNextSibling();
			break;
		}
		case DIVIDE:
		{
			AST __t1638 = _t;
			AST tmp40_AST_in = (AST)_t;
			match(_t,DIVIDE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1638;
			_t = _t.getNextSibling();
			break;
		}
		case MODULO:
		{
			AST __t1639 = _t;
			AST tmp41_AST_in = (AST)_t;
			match(_t,MODULO);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			expression(_t);
			_t = _retTree;
			_t = __t1639;
			_t = _t.getNextSibling();
			break;
		}
		case UNARY_MINUS:
		{
			AST __t1640 = _t;
			AST tmp42_AST_in = (AST)_t;
			match(_t,UNARY_MINUS);
			_t = _t.getFirstChild();
			exprt(_t);
			_t = _retTree;
			_t = __t1640;
			_t = _t.getNextSibling();
			break;
		}
		case UNARY_PLUS:
		{
			AST __t1641 = _t;
			AST tmp43_AST_in = (AST)_t;
			match(_t,UNARY_PLUS);
			_t = _t.getFirstChild();
			exprt(_t);
			_t = _retTree;
			_t = __t1641;
			_t = _t.getNextSibling();
			break;
		}
		default:
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_1.member(_t.getType()))) {
				exprt(_t);
				_t = _retTree;
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void constant(AST _t) throws RecognitionException {
		
		AST constant_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TRUE_KW:
		{
			AST tmp44_AST_in = (AST)_t;
			match(_t,TRUE_KW);
			_t = _t.getNextSibling();
			break;
		}
		case FALSE_KW:
		{
			AST tmp45_AST_in = (AST)_t;
			match(_t,FALSE_KW);
			_t = _t.getNextSibling();
			break;
		}
		case YES:
		{
			AST tmp46_AST_in = (AST)_t;
			match(_t,YES);
			_t = _t.getNextSibling();
			break;
		}
		case NO:
		{
			AST tmp47_AST_in = (AST)_t;
			match(_t,NO);
			_t = _t.getNextSibling();
			break;
		}
		case UNKNOWNVALUE:
		{
			AST tmp48_AST_in = (AST)_t;
			match(_t,UNKNOWNVALUE);
			_t = _t.getNextSibling();
			break;
		}
		case QSTRING:
		{
			AST tmp49_AST_in = (AST)_t;
			match(_t,QSTRING);
			_t = _t.getNextSibling();
			break;
		}
		case LEXDATE:
		{
			AST tmp50_AST_in = (AST)_t;
			match(_t,LEXDATE);
			_t = _t.getNextSibling();
			break;
		}
		case NUMBER:
		{
			AST tmp51_AST_in = (AST)_t;
			match(_t,NUMBER);
			_t = _t.getNextSibling();
			break;
		}
		case NULL_KW:
		{
			AST tmp52_AST_in = (AST)_t;
			match(_t,NULL_KW);
			_t = _t.getNextSibling();
			break;
		}
		case NOWAIT:
		{
			AST tmp53_AST_in = (AST)_t;
			match(_t,NOWAIT);
			_t = _t.getNextSibling();
			break;
		}
		case SHARELOCK:
		{
			AST tmp54_AST_in = (AST)_t;
			match(_t,SHARELOCK);
			_t = _t.getNextSibling();
			break;
		}
		case EXCLUSIVELOCK:
		{
			AST tmp55_AST_in = (AST)_t;
			match(_t,EXCLUSIVELOCK);
			_t = _t.getNextSibling();
			break;
		}
		case NOLOCK:
		{
			AST tmp56_AST_in = (AST)_t;
			match(_t,NOLOCK);
			_t = _t.getNextSibling();
			break;
		}
		case BIGENDIAN:
		{
			AST tmp57_AST_in = (AST)_t;
			match(_t,BIGENDIAN);
			_t = _t.getNextSibling();
			break;
		}
		case FINDCASESENSITIVE:
		{
			AST tmp58_AST_in = (AST)_t;
			match(_t,FINDCASESENSITIVE);
			_t = _t.getNextSibling();
			break;
		}
		case FINDGLOBAL:
		{
			AST tmp59_AST_in = (AST)_t;
			match(_t,FINDGLOBAL);
			_t = _t.getNextSibling();
			break;
		}
		case FINDNEXTOCCURRENCE:
		{
			AST tmp60_AST_in = (AST)_t;
			match(_t,FINDNEXTOCCURRENCE);
			_t = _t.getNextSibling();
			break;
		}
		case FINDPREVOCCURRENCE:
		{
			AST tmp61_AST_in = (AST)_t;
			match(_t,FINDPREVOCCURRENCE);
			_t = _t.getNextSibling();
			break;
		}
		case FINDSELECT:
		{
			AST tmp62_AST_in = (AST)_t;
			match(_t,FINDSELECT);
			_t = _t.getNextSibling();
			break;
		}
		case FINDWRAPAROUND:
		{
			AST tmp63_AST_in = (AST)_t;
			match(_t,FINDWRAPAROUND);
			_t = _t.getNextSibling();
			break;
		}
		case FUNCTIONCALLTYPE:
		{
			AST tmp64_AST_in = (AST)_t;
			match(_t,FUNCTIONCALLTYPE);
			_t = _t.getNextSibling();
			break;
		}
		case GETATTRCALLTYPE:
		{
			AST tmp65_AST_in = (AST)_t;
			match(_t,GETATTRCALLTYPE);
			_t = _t.getNextSibling();
			break;
		}
		case PROCEDURECALLTYPE:
		{
			AST tmp66_AST_in = (AST)_t;
			match(_t,PROCEDURECALLTYPE);
			_t = _t.getNextSibling();
			break;
		}
		case SETATTRCALLTYPE:
		{
			AST tmp67_AST_in = (AST)_t;
			match(_t,SETATTRCALLTYPE);
			_t = _t.getNextSibling();
			break;
		}
		case HOSTBYTEORDER:
		{
			AST tmp68_AST_in = (AST)_t;
			match(_t,HOSTBYTEORDER);
			_t = _t.getNextSibling();
			break;
		}
		case LITTLEENDIAN:
		{
			AST tmp69_AST_in = (AST)_t;
			match(_t,LITTLEENDIAN);
			_t = _t.getNextSibling();
			break;
		}
		case READAVAILABLE:
		{
			AST tmp70_AST_in = (AST)_t;
			match(_t,READAVAILABLE);
			_t = _t.getNextSibling();
			break;
		}
		case READEXACTNUM:
		{
			AST tmp71_AST_in = (AST)_t;
			match(_t,READEXACTNUM);
			_t = _t.getNextSibling();
			break;
		}
		case ROWUNMODIFIED:
		{
			AST tmp72_AST_in = (AST)_t;
			match(_t,ROWUNMODIFIED);
			_t = _t.getNextSibling();
			break;
		}
		case ROWDELETED:
		{
			AST tmp73_AST_in = (AST)_t;
			match(_t,ROWDELETED);
			_t = _t.getNextSibling();
			break;
		}
		case ROWMODIFIED:
		{
			AST tmp74_AST_in = (AST)_t;
			match(_t,ROWMODIFIED);
			_t = _t.getNextSibling();
			break;
		}
		case ROWCREATED:
		{
			AST tmp75_AST_in = (AST)_t;
			match(_t,ROWCREATED);
			_t = _t.getNextSibling();
			break;
		}
		case SAXCOMPLETE:
		{
			AST tmp76_AST_in = (AST)_t;
			match(_t,SAXCOMPLETE);
			_t = _t.getNextSibling();
			break;
		}
		case SAXPARSERERROR:
		{
			AST tmp77_AST_in = (AST)_t;
			match(_t,SAXPARSERERROR);
			_t = _t.getNextSibling();
			break;
		}
		case SAXRUNNING:
		{
			AST tmp78_AST_in = (AST)_t;
			match(_t,SAXRUNNING);
			_t = _t.getNextSibling();
			break;
		}
		case SAXUNINITIALIZED:
		{
			AST tmp79_AST_in = (AST)_t;
			match(_t,SAXUNINITIALIZED);
			_t = _t.getNextSibling();
			break;
		}
		case SEARCHSELF:
		{
			AST tmp80_AST_in = (AST)_t;
			match(_t,SEARCHSELF);
			_t = _t.getNextSibling();
			break;
		}
		case SEARCHTARGET:
		{
			AST tmp81_AST_in = (AST)_t;
			match(_t,SEARCHTARGET);
			_t = _t.getNextSibling();
			break;
		}
		case WINDOWDELAYEDMINIMIZE:
		{
			AST tmp82_AST_in = (AST)_t;
			match(_t,WINDOWDELAYEDMINIMIZE);
			_t = _t.getNextSibling();
			break;
		}
		case WINDOWMINIMIZED:
		{
			AST tmp83_AST_in = (AST)_t;
			match(_t,WINDOWMINIMIZED);
			_t = _t.getNextSibling();
			break;
		}
		case WINDOWNORMAL:
		{
			AST tmp84_AST_in = (AST)_t;
			match(_t,WINDOWNORMAL);
			_t = _t.getNextSibling();
			break;
		}
		case WINDOWMAXIMIZED:
		{
			AST tmp85_AST_in = (AST)_t;
			match(_t,WINDOWMAXIMIZED);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void querytuningphrase(AST _t) throws RecognitionException {
		
		AST querytuningphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2246 = _t;
		AST tmp86_AST_in = (AST)_t;
		match(_t,QUERYTUNING);
		_t = _t.getFirstChild();
		AST tmp87_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		{
		_loop2253:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ARRAYMESSAGE:
			{
				AST tmp88_AST_in = (AST)_t;
				match(_t,ARRAYMESSAGE);
				_t = _t.getNextSibling();
				break;
			}
			case NOARRAYMESSAGE:
			{
				AST tmp89_AST_in = (AST)_t;
				match(_t,NOARRAYMESSAGE);
				_t = _t.getNextSibling();
				break;
			}
			case BINDWHERE:
			{
				AST tmp90_AST_in = (AST)_t;
				match(_t,BINDWHERE);
				_t = _t.getNextSibling();
				break;
			}
			case NOBINDWHERE:
			{
				AST tmp91_AST_in = (AST)_t;
				match(_t,NOBINDWHERE);
				_t = _t.getNextSibling();
				break;
			}
			case CACHESIZE:
			{
				AST __t2248 = _t;
				AST tmp92_AST_in = (AST)_t;
				match(_t,CACHESIZE);
				_t = _t.getFirstChild();
				AST tmp93_AST_in = (AST)_t;
				match(_t,NUMBER);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case ROW:
				{
					AST tmp94_AST_in = (AST)_t;
					match(_t,ROW);
					_t = _t.getNextSibling();
					break;
				}
				case BYTE:
				{
					AST tmp95_AST_in = (AST)_t;
					match(_t,BYTE);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t2248;
				_t = _t.getNextSibling();
				break;
			}
			case DEBUG:
			{
				AST __t2250 = _t;
				AST tmp96_AST_in = (AST)_t;
				match(_t,DEBUG);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case SQL:
				{
					AST tmp97_AST_in = (AST)_t;
					match(_t,SQL);
					_t = _t.getNextSibling();
					break;
				}
				case EXTENDED:
				{
					AST tmp98_AST_in = (AST)_t;
					match(_t,EXTENDED);
					_t = _t.getNextSibling();
					break;
				}
				case CURSOR:
				{
					AST tmp99_AST_in = (AST)_t;
					match(_t,CURSOR);
					_t = _t.getNextSibling();
					break;
				}
				case DATABIND:
				{
					AST tmp100_AST_in = (AST)_t;
					match(_t,DATABIND);
					_t = _t.getNextSibling();
					break;
				}
				case PERFORMANCE:
				{
					AST tmp101_AST_in = (AST)_t;
					match(_t,PERFORMANCE);
					_t = _t.getNextSibling();
					break;
				}
				case VERBOSE:
				{
					AST tmp102_AST_in = (AST)_t;
					match(_t,VERBOSE);
					_t = _t.getNextSibling();
					break;
				}
				case SUMMARY:
				{
					AST tmp103_AST_in = (AST)_t;
					match(_t,SUMMARY);
					_t = _t.getNextSibling();
					break;
				}
				case NUMBER:
				{
					AST tmp104_AST_in = (AST)_t;
					match(_t,NUMBER);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t2250;
				_t = _t.getNextSibling();
				break;
			}
			case NODEBUG:
			{
				AST tmp105_AST_in = (AST)_t;
				match(_t,NODEBUG);
				_t = _t.getNextSibling();
				break;
			}
			case DEFERLOBFETCH:
			{
				AST tmp106_AST_in = (AST)_t;
				match(_t,DEFERLOBFETCH);
				_t = _t.getNextSibling();
				break;
			}
			case HINT:
			{
				AST __t2252 = _t;
				AST tmp107_AST_in = (AST)_t;
				match(_t,HINT);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2252;
				_t = _t.getNextSibling();
				break;
			}
			case INDEXHINT:
			{
				AST tmp108_AST_in = (AST)_t;
				match(_t,INDEXHINT);
				_t = _t.getNextSibling();
				break;
			}
			case NOINDEXHINT:
			{
				AST tmp109_AST_in = (AST)_t;
				match(_t,NOINDEXHINT);
				_t = _t.getNextSibling();
				break;
			}
			case JOINBYSQLDB:
			{
				AST tmp110_AST_in = (AST)_t;
				match(_t,JOINBYSQLDB);
				_t = _t.getNextSibling();
				break;
			}
			case NOJOINBYSQLDB:
			{
				AST tmp111_AST_in = (AST)_t;
				match(_t,NOJOINBYSQLDB);
				_t = _t.getNextSibling();
				break;
			}
			case LOOKAHEAD:
			{
				AST tmp112_AST_in = (AST)_t;
				match(_t,LOOKAHEAD);
				_t = _t.getNextSibling();
				break;
			}
			case NOLOOKAHEAD:
			{
				AST tmp113_AST_in = (AST)_t;
				match(_t,NOLOOKAHEAD);
				_t = _t.getNextSibling();
				break;
			}
			case ORDEREDJOIN:
			{
				AST tmp114_AST_in = (AST)_t;
				match(_t,ORDEREDJOIN);
				_t = _t.getNextSibling();
				break;
			}
			case REVERSEFROM:
			{
				AST tmp115_AST_in = (AST)_t;
				match(_t,REVERSEFROM);
				_t = _t.getNextSibling();
				break;
			}
			case SEPARATECONNECTION:
			{
				AST tmp116_AST_in = (AST)_t;
				match(_t,SEPARATECONNECTION);
				_t = _t.getNextSibling();
				break;
			}
			case NOSEPARATECONNECTION:
			{
				AST tmp117_AST_in = (AST)_t;
				match(_t,NOSEPARATECONNECTION);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop2253;
			}
			}
		} while (true);
		}
		AST tmp118_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t2246;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void on___phrase(AST _t) throws RecognitionException {
		
		AST on___phrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2122 = _t;
		AST tmp119_AST_in = (AST)_t;
		match(_t,ON);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ENDKEY:
		{
			AST tmp120_AST_in = (AST)_t;
			match(_t,ENDKEY);
			_t = _t.getNextSibling();
			break;
		}
		case ERROR:
		{
			AST tmp121_AST_in = (AST)_t;
			match(_t,ERROR);
			_t = _t.getNextSibling();
			break;
		}
		case STOP:
		{
			AST tmp122_AST_in = (AST)_t;
			match(_t,STOP);
			_t = _t.getNextSibling();
			break;
		}
		case QUIT:
		{
			AST tmp123_AST_in = (AST)_t;
			match(_t,QUIT);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case UNDO:
		{
			AST __t2125 = _t;
			AST tmp124_AST_in = (AST)_t;
			match(_t,UNDO);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case BLOCK_LABEL:
			{
				AST tmp125_AST_in = (AST)_t;
				match(_t,BLOCK_LABEL);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2125;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case COMMA:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case COMMA:
		{
			AST tmp126_AST_in = (AST)_t;
			match(_t,COMMA);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEAVE:
			{
				AST __t2129 = _t;
				AST tmp127_AST_in = (AST)_t;
				match(_t,LEAVE);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case BLOCK_LABEL:
				{
					AST tmp128_AST_in = (AST)_t;
					match(_t,BLOCK_LABEL);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t2129;
				_t = _t.getNextSibling();
				break;
			}
			case NEXT:
			{
				AST __t2131 = _t;
				AST tmp129_AST_in = (AST)_t;
				match(_t,NEXT);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case BLOCK_LABEL:
				{
					AST tmp130_AST_in = (AST)_t;
					match(_t,BLOCK_LABEL);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t2131;
				_t = _t.getNextSibling();
				break;
			}
			case RETRY:
			{
				AST __t2133 = _t;
				AST tmp131_AST_in = (AST)_t;
				match(_t,RETRY);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case BLOCK_LABEL:
				{
					AST tmp132_AST_in = (AST)_t;
					match(_t,BLOCK_LABEL);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t2133;
				_t = _t.getNextSibling();
				break;
			}
			case RETURN:
			{
				AST __t2135 = _t;
				AST tmp133_AST_in = (AST)_t;
				match(_t,RETURN);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_2.member(_t.getType()))) {
					return_options(_t);
					_t = _retTree;
				}
				else if ((_t.getType()==3)) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				_t = __t2135;
				_t = _t.getNextSibling();
				break;
			}
			case THROW:
			{
				AST tmp134_AST_in = (AST)_t;
				match(_t,THROW);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t2122;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void framephrase(AST _t) throws RecognitionException {
		
		AST framephrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t857 = _t;
		AST tmp135_AST_in = (AST)_t;
		match(_t,WITH);
		_t = _t.getFirstChild();
		{
		_loop886:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ACCUMULATE:
			{
				AST __t859 = _t;
				AST tmp136_AST_in = (AST)_t;
				match(_t,ACCUMULATE);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_3.member(_t.getType()))) {
					expression(_t);
					_t = _retTree;
				}
				else if ((_t.getType()==3)) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				_t = __t859;
				_t = _t.getNextSibling();
				break;
			}
			case ATTRSPACE:
			{
				AST tmp137_AST_in = (AST)_t;
				match(_t,ATTRSPACE);
				_t = _t.getNextSibling();
				break;
			}
			case NOATTRSPACE:
			{
				AST tmp138_AST_in = (AST)_t;
				match(_t,NOATTRSPACE);
				_t = _t.getNextSibling();
				break;
			}
			case CANCELBUTTON:
			{
				AST __t861 = _t;
				AST tmp139_AST_in = (AST)_t;
				match(_t,CANCELBUTTON);
				_t = _t.getFirstChild();
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				_t = __t861;
				_t = _t.getNextSibling();
				break;
			}
			case CENTERED:
			{
				AST tmp140_AST_in = (AST)_t;
				match(_t,CENTERED);
				_t = _t.getNextSibling();
				break;
			}
			case COLUMN:
			{
				AST __t862 = _t;
				AST tmp141_AST_in = (AST)_t;
				match(_t,COLUMN);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t862;
				_t = _t.getNextSibling();
				break;
			}
			case CONTEXTHELP:
			{
				AST tmp142_AST_in = (AST)_t;
				match(_t,CONTEXTHELP);
				_t = _t.getNextSibling();
				break;
			}
			case CONTEXTHELPFILE:
			{
				AST tmp143_AST_in = (AST)_t;
				match(_t,CONTEXTHELPFILE);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				break;
			}
			case DEFAULTBUTTON:
			{
				AST __t863 = _t;
				AST tmp144_AST_in = (AST)_t;
				match(_t,DEFAULTBUTTON);
				_t = _t.getFirstChild();
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				_t = __t863;
				_t = _t.getNextSibling();
				break;
			}
			case EXPORT:
			{
				AST tmp145_AST_in = (AST)_t;
				match(_t,EXPORT);
				_t = _t.getNextSibling();
				break;
			}
			case FITLASTCOLUMN:
			{
				AST tmp146_AST_in = (AST)_t;
				match(_t,FITLASTCOLUMN);
				_t = _t.getNextSibling();
				break;
			}
			case FONT:
			{
				AST __t864 = _t;
				AST tmp147_AST_in = (AST)_t;
				match(_t,FONT);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t864;
				_t = _t.getNextSibling();
				break;
			}
			case FONTBASEDLAYOUT:
			{
				AST tmp148_AST_in = (AST)_t;
				match(_t,FONTBASEDLAYOUT);
				_t = _t.getNextSibling();
				break;
			}
			case FRAME:
			{
				frame_ref(_t);
				_t = _retTree;
				break;
			}
			case INHERITBGCOLOR:
			{
				AST tmp149_AST_in = (AST)_t;
				match(_t,INHERITBGCOLOR);
				_t = _t.getNextSibling();
				break;
			}
			case NOINHERITBGCOLOR:
			{
				AST tmp150_AST_in = (AST)_t;
				match(_t,NOINHERITBGCOLOR);
				_t = _t.getNextSibling();
				break;
			}
			case INHERITFGCOLOR:
			{
				AST tmp151_AST_in = (AST)_t;
				match(_t,INHERITFGCOLOR);
				_t = _t.getNextSibling();
				break;
			}
			case NOINHERITFGCOLOR:
			{
				AST tmp152_AST_in = (AST)_t;
				match(_t,NOINHERITFGCOLOR);
				_t = _t.getNextSibling();
				break;
			}
			case LABELFONT:
			{
				AST __t865 = _t;
				AST tmp153_AST_in = (AST)_t;
				match(_t,LABELFONT);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t865;
				_t = _t.getNextSibling();
				break;
			}
			case LABELDCOLOR:
			{
				AST __t866 = _t;
				AST tmp154_AST_in = (AST)_t;
				match(_t,LABELDCOLOR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t866;
				_t = _t.getNextSibling();
				break;
			}
			case LABELFGCOLOR:
			{
				AST __t867 = _t;
				AST tmp155_AST_in = (AST)_t;
				match(_t,LABELFGCOLOR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t867;
				_t = _t.getNextSibling();
				break;
			}
			case LABELBGCOLOR:
			{
				AST __t868 = _t;
				AST tmp156_AST_in = (AST)_t;
				match(_t,LABELBGCOLOR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t868;
				_t = _t.getNextSibling();
				break;
			}
			case MULTIPLE:
			{
				AST tmp157_AST_in = (AST)_t;
				match(_t,MULTIPLE);
				_t = _t.getNextSibling();
				break;
			}
			case SINGLE:
			{
				AST tmp158_AST_in = (AST)_t;
				match(_t,SINGLE);
				_t = _t.getNextSibling();
				break;
			}
			case SEPARATORS:
			{
				AST tmp159_AST_in = (AST)_t;
				match(_t,SEPARATORS);
				_t = _t.getNextSibling();
				break;
			}
			case NOSEPARATORS:
			{
				AST tmp160_AST_in = (AST)_t;
				match(_t,NOSEPARATORS);
				_t = _t.getNextSibling();
				break;
			}
			case NOASSIGN:
			{
				AST tmp161_AST_in = (AST)_t;
				match(_t,NOASSIGN);
				_t = _t.getNextSibling();
				break;
			}
			case NOROWMARKERS:
			{
				AST tmp162_AST_in = (AST)_t;
				match(_t,NOROWMARKERS);
				_t = _t.getNextSibling();
				break;
			}
			case NOSCROLLBARVERTICAL:
			{
				AST tmp163_AST_in = (AST)_t;
				match(_t,NOSCROLLBARVERTICAL);
				_t = _t.getNextSibling();
				break;
			}
			case SCROLLBARVERTICAL:
			{
				AST tmp164_AST_in = (AST)_t;
				match(_t,SCROLLBARVERTICAL);
				_t = _t.getNextSibling();
				break;
			}
			case ROWHEIGHTCHARS:
			{
				AST __t869 = _t;
				AST tmp165_AST_in = (AST)_t;
				match(_t,ROWHEIGHTCHARS);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t869;
				_t = _t.getNextSibling();
				break;
			}
			case ROWHEIGHTPIXELS:
			{
				AST __t870 = _t;
				AST tmp166_AST_in = (AST)_t;
				match(_t,ROWHEIGHTPIXELS);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t870;
				_t = _t.getNextSibling();
				break;
			}
			case EXPANDABLE:
			{
				AST tmp167_AST_in = (AST)_t;
				match(_t,EXPANDABLE);
				_t = _t.getNextSibling();
				break;
			}
			case DROPTARGET:
			{
				AST tmp168_AST_in = (AST)_t;
				match(_t,DROPTARGET);
				_t = _t.getNextSibling();
				break;
			}
			case NOAUTOVALIDATE:
			{
				AST tmp169_AST_in = (AST)_t;
				match(_t,NOAUTOVALIDATE);
				_t = _t.getNextSibling();
				break;
			}
			case NOCOLUMNSCROLLING:
			{
				AST tmp170_AST_in = (AST)_t;
				match(_t,NOCOLUMNSCROLLING);
				_t = _t.getNextSibling();
				break;
			}
			case KEEPTABORDER:
			{
				AST tmp171_AST_in = (AST)_t;
				match(_t,KEEPTABORDER);
				_t = _t.getNextSibling();
				break;
			}
			case NOBOX:
			{
				AST tmp172_AST_in = (AST)_t;
				match(_t,NOBOX);
				_t = _t.getNextSibling();
				break;
			}
			case NOEMPTYSPACE:
			{
				AST tmp173_AST_in = (AST)_t;
				match(_t,NOEMPTYSPACE);
				_t = _t.getNextSibling();
				break;
			}
			case NOHIDE:
			{
				AST tmp174_AST_in = (AST)_t;
				match(_t,NOHIDE);
				_t = _t.getNextSibling();
				break;
			}
			case NOLABELS:
			{
				AST tmp175_AST_in = (AST)_t;
				match(_t,NOLABELS);
				_t = _t.getNextSibling();
				break;
			}
			case USEDICTEXPS:
			{
				AST tmp176_AST_in = (AST)_t;
				match(_t,USEDICTEXPS);
				_t = _t.getNextSibling();
				break;
			}
			case NOVALIDATE:
			{
				AST tmp177_AST_in = (AST)_t;
				match(_t,NOVALIDATE);
				_t = _t.getNextSibling();
				break;
			}
			case NOHELP:
			{
				AST tmp178_AST_in = (AST)_t;
				match(_t,NOHELP);
				_t = _t.getNextSibling();
				break;
			}
			case NOUNDERLINE:
			{
				AST tmp179_AST_in = (AST)_t;
				match(_t,NOUNDERLINE);
				_t = _t.getNextSibling();
				break;
			}
			case OVERLAY:
			{
				AST tmp180_AST_in = (AST)_t;
				match(_t,OVERLAY);
				_t = _t.getNextSibling();
				break;
			}
			case PAGEBOTTOM:
			{
				AST tmp181_AST_in = (AST)_t;
				match(_t,PAGEBOTTOM);
				_t = _t.getNextSibling();
				break;
			}
			case PAGETOP:
			{
				AST tmp182_AST_in = (AST)_t;
				match(_t,PAGETOP);
				_t = _t.getNextSibling();
				break;
			}
			case NOTABSTOP:
			{
				AST tmp183_AST_in = (AST)_t;
				match(_t,NOTABSTOP);
				_t = _t.getNextSibling();
				break;
			}
			case RETAIN:
			{
				AST __t871 = _t;
				AST tmp184_AST_in = (AST)_t;
				match(_t,RETAIN);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t871;
				_t = _t.getNextSibling();
				break;
			}
			case ROW:
			{
				AST __t872 = _t;
				AST tmp185_AST_in = (AST)_t;
				match(_t,ROW);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t872;
				_t = _t.getNextSibling();
				break;
			}
			case SCREENIO:
			{
				AST tmp186_AST_in = (AST)_t;
				match(_t,SCREENIO);
				_t = _t.getNextSibling();
				break;
			}
			case STREAMIO:
			{
				AST tmp187_AST_in = (AST)_t;
				match(_t,STREAMIO);
				_t = _t.getNextSibling();
				break;
			}
			case SCROLL:
			{
				AST __t873 = _t;
				AST tmp188_AST_in = (AST)_t;
				match(_t,SCROLL);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t873;
				_t = _t.getNextSibling();
				break;
			}
			case SCROLLABLE:
			{
				AST tmp189_AST_in = (AST)_t;
				match(_t,SCROLLABLE);
				_t = _t.getNextSibling();
				break;
			}
			case SIDELABELS:
			{
				AST tmp190_AST_in = (AST)_t;
				match(_t,SIDELABELS);
				_t = _t.getNextSibling();
				break;
			}
			case STREAM:
			case STREAMHANDLE:
			{
				stream_name_or_handle(_t);
				_t = _retTree;
				break;
			}
			case THREED:
			{
				AST tmp191_AST_in = (AST)_t;
				match(_t,THREED);
				_t = _t.getNextSibling();
				break;
			}
			case TOOLTIP:
			{
				tooltip_expr(_t);
				_t = _retTree;
				break;
			}
			case TOPONLY:
			{
				AST tmp192_AST_in = (AST)_t;
				match(_t,TOPONLY);
				_t = _t.getNextSibling();
				break;
			}
			case USETEXT:
			{
				AST tmp193_AST_in = (AST)_t;
				match(_t,USETEXT);
				_t = _t.getNextSibling();
				break;
			}
			case V6FRAME:
			{
				AST tmp194_AST_in = (AST)_t;
				match(_t,V6FRAME);
				_t = _t.getNextSibling();
				break;
			}
			case USEREVVIDEO:
			{
				AST tmp195_AST_in = (AST)_t;
				match(_t,USEREVVIDEO);
				_t = _t.getNextSibling();
				break;
			}
			case USEUNDERLINE:
			{
				AST tmp196_AST_in = (AST)_t;
				match(_t,USEUNDERLINE);
				_t = _t.getNextSibling();
				break;
			}
			case VIEWAS:
			{
				AST __t874 = _t;
				AST tmp197_AST_in = (AST)_t;
				match(_t,VIEWAS);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case DIALOGBOX:
				{
					AST __t876 = _t;
					AST tmp198_AST_in = (AST)_t;
					match(_t,DIALOGBOX);
					_t = _t.getFirstChild();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case DIALOGHELP:
					{
						AST tmp199_AST_in = (AST)_t;
						match(_t,DIALOGHELP);
						_t = _t.getNextSibling();
						{
						if (_t==null) _t=ASTNULL;
						if ((_tokenSet_3.member(_t.getType()))) {
							expression(_t);
							_t = _retTree;
						}
						else if ((_t.getType()==3)) {
						}
						else {
							throw new NoViableAltException(_t);
						}
						
						}
						break;
					}
					case 3:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					_t = __t876;
					_t = _t.getNextSibling();
					break;
				}
				case MESSAGELINE:
				{
					AST tmp200_AST_in = (AST)_t;
					match(_t,MESSAGELINE);
					_t = _t.getNextSibling();
					break;
				}
				case STATUSBAR:
				{
					AST tmp201_AST_in = (AST)_t;
					match(_t,STATUSBAR);
					_t = _t.getNextSibling();
					break;
				}
				case TOOLBAR:
				{
					AST __t879 = _t;
					AST tmp202_AST_in = (AST)_t;
					match(_t,TOOLBAR);
					_t = _t.getFirstChild();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case ATTACHMENT:
					{
						AST tmp203_AST_in = (AST)_t;
						match(_t,ATTACHMENT);
						_t = _t.getNextSibling();
						{
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case TOP:
						{
							AST tmp204_AST_in = (AST)_t;
							match(_t,TOP);
							_t = _t.getNextSibling();
							break;
						}
						case BOTTOM:
						{
							AST tmp205_AST_in = (AST)_t;
							match(_t,BOTTOM);
							_t = _t.getNextSibling();
							break;
						}
						case LEFT:
						{
							AST tmp206_AST_in = (AST)_t;
							match(_t,LEFT);
							_t = _t.getNextSibling();
							break;
						}
						case RIGHT:
						{
							AST tmp207_AST_in = (AST)_t;
							match(_t,RIGHT);
							_t = _t.getNextSibling();
							break;
						}
						default:
						{
							throw new NoViableAltException(_t);
						}
						}
						}
						break;
					}
					case 3:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					_t = __t879;
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t874;
				_t = _t.getNextSibling();
				break;
			}
			case WIDTH:
			{
				AST __t882 = _t;
				AST tmp208_AST_in = (AST)_t;
				match(_t,WIDTH);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t882;
				_t = _t.getNextSibling();
				break;
			}
			case IN_KW:
			{
				AST __t883 = _t;
				AST tmp209_AST_in = (AST)_t;
				match(_t,IN_KW);
				_t = _t.getFirstChild();
				AST tmp210_AST_in = (AST)_t;
				match(_t,WINDOW);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				_t = __t883;
				_t = _t.getNextSibling();
				break;
			}
			case BGCOLOR:
			case COLOR:
			case DCOLOR:
			case FGCOLOR:
			case PFCOLOR:
			{
				colorspecification(_t);
				_t = _retTree;
				break;
			}
			case AT:
			{
				atphrase(_t);
				_t = _retTree;
				break;
			}
			case SIZE:
			case SIZECHARS:
			case SIZEPIXELS:
			{
				sizephrase(_t);
				_t = _retTree;
				break;
			}
			case TITLE:
			{
				titlephrase(_t);
				_t = _retTree;
				break;
			}
			case With_columns:
			{
				AST __t884 = _t;
				AST tmp211_AST_in = (AST)_t;
				match(_t,With_columns);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				AST tmp212_AST_in = (AST)_t;
				match(_t,COLUMNS);
				_t = _t.getNextSibling();
				_t = __t884;
				_t = _t.getNextSibling();
				break;
			}
			case With_down:
			{
				AST __t885 = _t;
				AST tmp213_AST_in = (AST)_t;
				match(_t,With_down);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				AST tmp214_AST_in = (AST)_t;
				match(_t,DOWN);
				_t = _t.getNextSibling();
				_t = __t885;
				_t = _t.getNextSibling();
				break;
			}
			case DOWN:
			{
				AST tmp215_AST_in = (AST)_t;
				match(_t,DOWN);
				_t = _t.getNextSibling();
				break;
			}
			case WIDGETID:
			{
				widget_id(_t);
				_t = _retTree;
				break;
			}
			case WITH:
			{
				AST tmp216_AST_in = (AST)_t;
				match(_t,WITH);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop886;
			}
			}
		} while (true);
		}
		_t = __t857;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void collatephrase(AST _t) throws RecognitionException {
		
		AST collatephrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1749 = _t;
		AST tmp217_AST_in = (AST)_t;
		match(_t,COLLATE);
		_t = _t.getFirstChild();
		funargs(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case DESCENDING:
		{
			AST tmp218_AST_in = (AST)_t;
			match(_t,DESCENDING);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1749;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void block_preselect(AST _t) throws RecognitionException {
		
		AST block_preselect_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t22 = _t;
		AST tmp219_AST_in = (AST)_t;
		match(_t,PRESELECT);
		_t = _t.getFirstChild();
		for_record_spec(_t,CQ.INITWEAK);
		_t = _retTree;
		_t = __t22;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void for_record_spec(AST _t,
		int contextQualifier
	) throws RecognitionException {
		
		AST for_record_spec_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST rp1 = null;
		AST rp2 = null;
		
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CURRENT:
		case EACH:
		case FIRST:
		case LAST:
		case NEXT:
		case PREV:
		{
			findwhich(_t);
			_t = _retTree;
			break;
		}
		case RECORD_NAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST __t808 = _t;
		rp1 = _t==ASTNULL ? null :(AST)_t;
		match(_t,RECORD_NAME);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.recordNameNode(rp1, contextQualifier);
		}
		recordphrase(_t);
		_t = _retTree;
		_t = __t808;
		_t = _t.getNextSibling();
		{
		_loop812:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp220_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case CURRENT:
				case EACH:
				case FIRST:
				case LAST:
				case NEXT:
				case PREV:
				{
					findwhich(_t);
					_t = _retTree;
					break;
				}
				case RECORD_NAME:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				AST __t811 = _t;
				rp2 = _t==ASTNULL ? null :(AST)_t;
				match(_t,RECORD_NAME);
				_t = _t.getFirstChild();
				if ( inputState.guessing==0 ) {
					action.recordNameNode(rp2, contextQualifier);
				}
				recordphrase(_t);
				_t = _retTree;
				_t = __t811;
				_t = _t.getNextSibling();
			}
			else {
				break _loop812;
			}
			
		} while (true);
		}
		_retTree = _t;
	}
	
	public final void functioncall(AST _t) throws RecognitionException {
		
		AST functioncall_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST df = null;
		AST sr = null;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ACCUMULATE:
		{
			AST __t24 = _t;
			AST tmp221_AST_in = (AST)_t;
			match(_t,ACCUMULATE);
			_t = _t.getFirstChild();
			accum_what(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==BY)) {
				AST __t26 = _t;
				AST tmp222_AST_in = (AST)_t;
				match(_t,BY);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case DESCENDING:
				{
					AST tmp223_AST_in = (AST)_t;
					match(_t,DESCENDING);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t26;
				_t = _t.getNextSibling();
			}
			else if ((_tokenSet_3.member(_t.getType()))) {
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			expression(_t);
			_t = _retTree;
			_t = __t24;
			_t = _t.getNextSibling();
			break;
		}
		case ADDINTERVAL:
		{
			AST __t28 = _t;
			AST tmp224_AST_in = (AST)_t;
			match(_t,ADDINTERVAL);
			_t = _t.getFirstChild();
			AST tmp225_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			AST tmp226_AST_in = (AST)_t;
			match(_t,COMMA);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			AST tmp227_AST_in = (AST)_t;
			match(_t,COMMA);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			AST tmp228_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t28;
			_t = _t.getNextSibling();
			break;
		}
		case AUDITENABLED:
		{
			AST __t29 = _t;
			AST tmp229_AST_in = (AST)_t;
			match(_t,AUDITENABLED);
			_t = _t.getFirstChild();
			AST tmp230_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_3.member(_t.getType()))) {
				expression(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==RIGHTPAREN)) {
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			AST tmp231_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t29;
			_t = _t.getNextSibling();
			break;
		}
		case CANFIND:
		{
			canfindfunc(_t);
			_t = _retTree;
			break;
		}
		case CAST:
		{
			AST __t31 = _t;
			AST tmp232_AST_in = (AST)_t;
			match(_t,CAST);
			_t = _t.getFirstChild();
			AST tmp233_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			AST tmp234_AST_in = (AST)_t;
			match(_t,COMMA);
			_t = _t.getNextSibling();
			AST tmp235_AST_in = (AST)_t;
			match(_t,TYPE_NAME);
			_t = _t.getNextSibling();
			AST tmp236_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t31;
			_t = _t.getNextSibling();
			break;
		}
		case CURRENTVALUE:
		{
			currentvaluefunc(_t);
			_t = _retTree;
			break;
		}
		case DYNAMICCURRENTVALUE:
		{
			dynamiccurrentvaluefunc(_t);
			_t = _retTree;
			break;
		}
		case DYNAMICFUNCTION:
		{
			AST __t32 = _t;
			df = _t==ASTNULL ? null :(AST)_t;
			match(_t,DYNAMICFUNCTION);
			_t = _t.getFirstChild();
			if ( inputState.guessing==0 ) {
				action.callBegin(df);
			}
			AST tmp237_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case IN_KW:
			{
				AST __t34 = _t;
				AST tmp238_AST_in = (AST)_t;
				match(_t,IN_KW);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t34;
				_t = _t.getNextSibling();
				break;
			}
			case COMMA:
			case RIGHTPAREN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			_loop36:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA)) {
					AST tmp239_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
					parameter(_t);
					_t = _retTree;
				}
				else {
					break _loop36;
				}
				
			} while (true);
			}
			AST tmp240_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOERROR_KW:
			{
				AST tmp241_AST_in = (AST)_t;
				match(_t,NOERROR_KW);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.callEnd();
			}
			_t = __t32;
			_t = _t.getNextSibling();
			break;
		}
		case ENTRY:
		{
			entryfunc(_t);
			_t = _retTree;
			break;
		}
		case ETIME_KW:
		{
			AST __t38 = _t;
			AST tmp242_AST_in = (AST)_t;
			match(_t,ETIME_KW);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				funargs(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t38;
			_t = _t.getNextSibling();
			break;
		}
		case EXTENT:
		{
			AST __t40 = _t;
			AST tmp243_AST_in = (AST)_t;
			match(_t,EXTENT);
			_t = _t.getFirstChild();
			AST tmp244_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			fld(_t,CQ.SYMBOL);
			_t = _retTree;
			AST tmp245_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t40;
			_t = _t.getNextSibling();
			break;
		}
		case FRAMECOL:
		{
			AST __t41 = _t;
			AST tmp246_AST_in = (AST)_t;
			match(_t,FRAMECOL);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				AST tmp247_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				AST tmp248_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				AST tmp249_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t41;
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEDOWN:
		{
			AST __t43 = _t;
			AST tmp250_AST_in = (AST)_t;
			match(_t,FRAMEDOWN);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				AST tmp251_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				AST tmp252_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				AST tmp253_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t43;
			_t = _t.getNextSibling();
			break;
		}
		case FRAMELINE:
		{
			AST __t45 = _t;
			AST tmp254_AST_in = (AST)_t;
			match(_t,FRAMELINE);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				AST tmp255_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				AST tmp256_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				AST tmp257_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t45;
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEROW:
		{
			AST __t47 = _t;
			AST tmp258_AST_in = (AST)_t;
			match(_t,FRAMEROW);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				AST tmp259_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				AST tmp260_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				AST tmp261_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t47;
			_t = _t.getNextSibling();
			break;
		}
		case GETCODEPAGES:
		{
			AST __t49 = _t;
			AST tmp262_AST_in = (AST)_t;
			match(_t,GETCODEPAGES);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				funargs(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t49;
			_t = _t.getNextSibling();
			break;
		}
		case GUID:
		{
			AST __t51 = _t;
			AST tmp263_AST_in = (AST)_t;
			match(_t,GUID);
			_t = _t.getFirstChild();
			AST tmp264_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_3.member(_t.getType()))) {
				expression(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==RIGHTPAREN)) {
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			AST tmp265_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t51;
			_t = _t.getNextSibling();
			break;
		}
		case IF:
		{
			AST __t53 = _t;
			AST tmp266_AST_in = (AST)_t;
			match(_t,IF);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			AST tmp267_AST_in = (AST)_t;
			match(_t,THEN);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			AST tmp268_AST_in = (AST)_t;
			match(_t,ELSE);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t53;
			_t = _t.getNextSibling();
			break;
		}
		case LDBNAME:
		{
			ldbnamefunc(_t);
			_t = _retTree;
			break;
		}
		case LENGTH:
		{
			lengthfunc(_t);
			_t = _retTree;
			break;
		}
		case LINECOUNTER:
		{
			AST __t54 = _t;
			AST tmp269_AST_in = (AST)_t;
			match(_t,LINECOUNTER);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				AST tmp270_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				AST tmp271_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				AST tmp272_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t54;
			_t = _t.getNextSibling();
			break;
		}
		case MTIME:
		{
			AST __t56 = _t;
			AST tmp273_AST_in = (AST)_t;
			match(_t,MTIME);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				funargs(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t56;
			_t = _t.getNextSibling();
			break;
		}
		case NEXTVALUE:
		{
			nextvaluefunc(_t);
			_t = _retTree;
			break;
		}
		case PAGENUMBER:
		{
			AST __t58 = _t;
			AST tmp274_AST_in = (AST)_t;
			match(_t,PAGENUMBER);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				AST tmp275_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				AST tmp276_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				AST tmp277_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t58;
			_t = _t.getNextSibling();
			break;
		}
		case PAGESIZE_KW:
		{
			AST __t60 = _t;
			AST tmp278_AST_in = (AST)_t;
			match(_t,PAGESIZE_KW);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				AST tmp279_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				AST tmp280_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				AST tmp281_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t60;
			_t = _t.getNextSibling();
			break;
		}
		case RAW:
		{
			rawfunc(_t);
			_t = _retTree;
			break;
		}
		case SEEK:
		{
			AST __t62 = _t;
			AST tmp282_AST_in = (AST)_t;
			match(_t,SEEK);
			_t = _t.getFirstChild();
			AST tmp283_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case INPUT:
			{
				AST tmp284_AST_in = (AST)_t;
				match(_t,INPUT);
				_t = _t.getNextSibling();
				break;
			}
			case OUTPUT:
			{
				AST tmp285_AST_in = (AST)_t;
				match(_t,OUTPUT);
				_t = _t.getNextSibling();
				break;
			}
			case ID:
			{
				AST tmp286_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp287_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t62;
			_t = _t.getNextSibling();
			break;
		}
		case SUBSTRING:
		{
			substringfunc(_t);
			_t = _retTree;
			break;
		}
		case SUPER:
		{
			AST __t64 = _t;
			sr = _t==ASTNULL ? null :(AST)_t;
			match(_t,SUPER);
			_t = _t.getFirstChild();
			if ( inputState.guessing==0 ) {
				action.callBegin(sr);
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case Parameter_list:
			{
				parameterlist(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.callEnd();
			}
			_t = __t64;
			_t = _t.getNextSibling();
			break;
		}
		case TIMEZONE:
		{
			AST __t66 = _t;
			AST tmp288_AST_in = (AST)_t;
			match(_t,TIMEZONE);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				funargs(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t66;
			_t = _t.getNextSibling();
			break;
		}
		case TYPEOF:
		{
			AST __t68 = _t;
			AST tmp289_AST_in = (AST)_t;
			match(_t,TYPEOF);
			_t = _t.getFirstChild();
			AST tmp290_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			AST tmp291_AST_in = (AST)_t;
			match(_t,COMMA);
			_t = _t.getNextSibling();
			AST tmp292_AST_in = (AST)_t;
			match(_t,TYPE_NAME);
			_t = _t.getNextSibling();
			AST tmp293_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t68;
			_t = _t.getNextSibling();
			break;
		}
		case USERID:
		{
			AST __t69 = _t;
			AST tmp294_AST_in = (AST)_t;
			match(_t,USERID);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				funargs(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t69;
			_t = _t.getNextSibling();
			break;
		}
		case USER:
		{
			AST __t71 = _t;
			AST tmp295_AST_in = (AST)_t;
			match(_t,USER);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				funargs(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t71;
			_t = _t.getNextSibling();
			break;
		}
		case AVG:
		case COUNT:
		case SUM:
		{
			sqlaggregatefunc(_t);
			_t = _retTree;
			break;
		}
		case AACBIT:
		case AAMSG:
		case ABSOLUTE:
		case ALIAS:
		case ASC:
		case CANDO:
		case CANQUERY:
		case CANSET:
		case CAPS:
		case CHR:
		case CODEPAGECONVERT:
		case COLLATE:
		case COMPARE:
		case CONNECTED:
		case COUNTOF:
		case CURRENTRESULTROW:
		case DATE:
		case DAY:
		case DBCODEPAGE:
		case DBCOLLATION:
		case DBPARAM:
		case DBRESTRICTIONS:
		case DBTASKID:
		case DBTYPE:
		case DBVERSION:
		case DECIMAL:
		case ENCODE:
		case EXP:
		case FILL:
		case FIRST:
		case FIRSTOF:
		case GETBITS:
		case GETBYTE:
		case GETBYTES:
		case GETBYTEORDER:
		case GETCOLLATIONS:
		case GETDOUBLE:
		case GETFLOAT:
		case GETLICENSE:
		case GETLONG:
		case GETPOINTERVALUE:
		case GETSHORT:
		case GETSIZE:
		case GETSTRING:
		case GETUNSIGNEDSHORT:
		case HANDLE:
		case INDEX:
		case INTEGER:
		case ISLEADBYTE:
		case KBLABEL:
		case KEYCODE:
		case KEYFUNCTION:
		case KEYLABEL:
		case KEYWORD:
		case KEYWORDALL:
		case LAST:
		case LASTOF:
		case LC:
		case LEFTTRIM:
		case LIBRARY:
		case LISTEVENTS:
		case LISTQUERYATTRS:
		case LISTSETATTRS:
		case LISTWIDGETS:
		case LOADPICTURE:
		case LOG:
		case LOGICAL:
		case LOOKUP:
		case MAXIMUM:
		case MEMBER:
		case MINIMUM:
		case MONTH:
		case NUMENTRIES:
		case NUMRESULTS:
		case OSGETENV:
		case PDBNAME:
		case PROGRAMNAME:
		case QUERYOFFEND:
		case QUOTER:
		case RINDEX:
		case RANDOM:
		case REPLACE:
		case RGBVALUE:
		case RIGHTTRIM:
		case ROUND:
		case SDBNAME:
		case SEARCH:
		case SETUSERID:
		case SQRT:
		case STRING:
		case SUBSTITUTE:
		case TOROWID:
		case TRIM:
		case TRUNCATE:
		case VALIDEVENT:
		case VALIDHANDLE:
		case WEEKDAY:
		case WIDGETHANDLE:
		case YEAR:
		case DATETIME:
		case DATETIMETZ:
		case DYNAMICNEXTVALUE:
		case INTERVAL:
		case ISCODEPAGEFIXED:
		case ISCOLUMNCODEPAGE:
		case ISODATE:
		case BASE64DECODE:
		case BASE64ENCODE:
		case DECRYPT:
		case ENCRYPT:
		case GENERATEPBEKEY:
		case MD5DIGEST:
		case NORMALIZE:
		case SHA1DIGEST:
		case SSLSERVERNAME:
		case HEXDECODE:
		case HEXENCODE:
		case SETDBCLIENT:
		case VALIDOBJECT:
		case INT64:
		case GETINT64:
		case GETUNSIGNEDLONG:
		case UNBOX:
		case BOX:
		case DBREMOTEHOST:
		case DYNAMICCAST:
		case DYNAMICINVOKE:
		{
			argfunc(_t);
			_t = _retTree;
			break;
		}
		case AACONTROL:
		case AAPCONTROL:
		case AASERIAL:
		case CURRENTLANGUAGE:
		case CURSOR:
		case DATASERVERS:
		case DBNAME:
		case FRAMEDB:
		case FRAMEFIELD:
		case FRAMEFILE:
		case FRAMEINDEX:
		case FRAMENAME:
		case FRAMEVALUE:
		case GOPENDING:
		case ISATTRSPACE:
		case LASTKEY:
		case MACHINECLASS:
		case MESSAGELINES:
		case NUMALIASES:
		case NUMDBS:
		case OPSYS:
		case OSDRIVES:
		case OSERROR:
		case PROCHANDLE:
		case PROCSTATUS:
		case PROGRESS:
		case PROMSGS:
		case PROPATH:
		case PROVERSION:
		case RETRY:
		case RETURNVALUE:
		case SCREENLINES:
		case TERMINAL:
		case TIME:
		case TODAY:
		case TRANSACTION:
		case GATEWAYS:
		case NOW:
		case GENERATEPBESALT:
		case GENERATERANDOMKEY:
		case GENERATEUUID:
		{
			noargfunc(_t);
			_t = _retTree;
			break;
		}
		case AMBIGUOUS:
		case AVAILABLE:
		case CURRENTCHANGED:
		case ERROR:
		case LOCKED:
		case NEW:
		case RECID:
		case RECORDLENGTH:
		case ROWID:
		case DATASOURCEMODIFIED:
		case REJECTED:
		case ROWSTATE:
		{
			recordfunc(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void accum_what(AST _t) throws RecognitionException {
		
		AST accum_what_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AVERAGE:
		{
			AST tmp296_AST_in = (AST)_t;
			match(_t,AVERAGE);
			_t = _t.getNextSibling();
			break;
		}
		case COUNT:
		{
			AST tmp297_AST_in = (AST)_t;
			match(_t,COUNT);
			_t = _t.getNextSibling();
			break;
		}
		case MAXIMUM:
		{
			AST tmp298_AST_in = (AST)_t;
			match(_t,MAXIMUM);
			_t = _t.getNextSibling();
			break;
		}
		case MINIMUM:
		{
			AST tmp299_AST_in = (AST)_t;
			match(_t,MINIMUM);
			_t = _t.getNextSibling();
			break;
		}
		case TOTAL:
		{
			AST tmp300_AST_in = (AST)_t;
			match(_t,TOTAL);
			_t = _t.getNextSibling();
			break;
		}
		case SUBAVERAGE:
		{
			AST tmp301_AST_in = (AST)_t;
			match(_t,SUBAVERAGE);
			_t = _t.getNextSibling();
			break;
		}
		case SUBCOUNT:
		{
			AST tmp302_AST_in = (AST)_t;
			match(_t,SUBCOUNT);
			_t = _t.getNextSibling();
			break;
		}
		case SUBMAXIMUM:
		{
			AST tmp303_AST_in = (AST)_t;
			match(_t,SUBMAXIMUM);
			_t = _t.getNextSibling();
			break;
		}
		case SUBMINIMUM:
		{
			AST tmp304_AST_in = (AST)_t;
			match(_t,SUBMINIMUM);
			_t = _t.getNextSibling();
			break;
		}
		case SUBTOTAL:
		{
			AST tmp305_AST_in = (AST)_t;
			match(_t,SUBTOTAL);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void canfindfunc(AST _t) throws RecognitionException {
		
		AST canfindfunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST cf = null;
		AST r = null;
		
		AST __t221 = _t;
		cf = _t==ASTNULL ? null :(AST)_t;
		match(_t,CANFIND);
		_t = _t.getFirstChild();
		AST tmp306_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CURRENT:
		case EACH:
		case FIRST:
		case LAST:
		case NEXT:
		case PREV:
		{
			findwhich(_t);
			_t = _retTree;
			break;
		}
		case RECORD_NAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST __t223 = _t;
		r = _t==ASTNULL ? null :(AST)_t;
		match(_t,RECORD_NAME);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
				action.canFindBegin(cf, r);
								action.recordNameNode(r, CQ.INIT);
							
		}
		recordphrase(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.canFindEnd(cf);
		}
		_t = __t223;
		_t = _t.getNextSibling();
		AST tmp307_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t221;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void currentvaluefunc(AST _t) throws RecognitionException {
		
		AST currentvaluefunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1904 = _t;
		AST tmp308_AST_in = (AST)_t;
		match(_t,CURRENTVALUE);
		_t = _t.getFirstChild();
		AST tmp309_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		AST tmp310_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case COMMA:
		{
			AST tmp311_AST_in = (AST)_t;
			match(_t,COMMA);
			_t = _t.getNextSibling();
			AST tmp312_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case RIGHTPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp313_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t1904;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void dynamiccurrentvaluefunc(AST _t) throws RecognitionException {
		
		AST dynamiccurrentvaluefunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1974 = _t;
		AST tmp314_AST_in = (AST)_t;
		match(_t,DYNAMICCURRENTVALUE);
		_t = _t.getFirstChild();
		funargs(_t);
		_t = _retTree;
		_t = __t1974;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void parameter(AST _t) throws RecognitionException {
		
		AST parameter_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST bt = null;
		action.paramForCall(_t);
		
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BUFFER:
		{
			AST __t77 = _t;
			AST tmp315_AST_in = (AST)_t;
			match(_t,BUFFER);
			_t = _t.getFirstChild();
			bt = _t==ASTNULL ? null : (AST)_t;
			tbl(_t,CQ.INIT);
			_t = _retTree;
			if ( inputState.guessing==0 ) {
					action.paramProgressType(BUFFER);
									action.paramSymbol(bt);
								
			}
			_t = __t77;
			_t = _t.getNextSibling();
			break;
		}
		case OUTPUT:
		{
			AST __t78 = _t;
			AST tmp316_AST_in = (AST)_t;
			match(_t,OUTPUT);
			_t = _t.getFirstChild();
			parameter_arg(_t);
			_t = _retTree;
			_t = __t78;
			_t = _t.getNextSibling();
			break;
		}
		case INPUTOUTPUT:
		{
			AST __t79 = _t;
			AST tmp317_AST_in = (AST)_t;
			match(_t,INPUTOUTPUT);
			_t = _t.getFirstChild();
			parameter_arg(_t);
			_t = _retTree;
			_t = __t79;
			_t = _t.getNextSibling();
			break;
		}
		case INPUT:
		{
			AST __t80 = _t;
			AST tmp318_AST_in = (AST)_t;
			match(_t,INPUT);
			_t = _t.getFirstChild();
			parameter_arg(_t);
			_t = _retTree;
			_t = __t80;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		if ( inputState.guessing==0 ) {
			action.paramEnd();
		}
		_retTree = _t;
	}
	
	public final void entryfunc(AST _t) throws RecognitionException {
		
		AST entryfunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1990 = _t;
		AST tmp319_AST_in = (AST)_t;
		match(_t,ENTRY);
		_t = _t.getFirstChild();
		funargs(_t);
		_t = _retTree;
		_t = __t1990;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void funargs(AST _t) throws RecognitionException {
		
		AST funargs_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST tmp320_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		_loop1614:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp321_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
			}
			else {
				break _loop1614;
			}
			
		} while (true);
		}
		AST tmp322_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void ldbnamefunc(AST _t) throws RecognitionException {
		
		AST ldbnamefunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t958 = _t;
		AST tmp323_AST_in = (AST)_t;
		match(_t,LDBNAME);
		_t = _t.getFirstChild();
		AST tmp324_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==BUFFER)) {
			AST __t960 = _t;
			AST tmp325_AST_in = (AST)_t;
			match(_t,BUFFER);
			_t = _t.getFirstChild();
			tbl(_t,CQ.BUFFERSYMBOL);
			_t = _retTree;
			_t = __t960;
			_t = _t.getNextSibling();
		}
		else if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		AST tmp326_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t958;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void lengthfunc(AST _t) throws RecognitionException {
		
		AST lengthfunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2100 = _t;
		AST tmp327_AST_in = (AST)_t;
		match(_t,LENGTH);
		_t = _t.getFirstChild();
		funargs(_t);
		_t = _retTree;
		_t = __t2100;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void nextvaluefunc(AST _t) throws RecognitionException {
		
		AST nextvaluefunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2118 = _t;
		AST tmp328_AST_in = (AST)_t;
		match(_t,NEXTVALUE);
		_t = _t.getFirstChild();
		AST tmp329_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		AST tmp330_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		{
		_loop2120:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp331_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				AST tmp332_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
			}
			else {
				break _loop2120;
			}
			
		} while (true);
		}
		AST tmp333_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t2118;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void rawfunc(AST _t) throws RecognitionException {
		
		AST rawfunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2271 = _t;
		AST tmp334_AST_in = (AST)_t;
		match(_t,RAW);
		_t = _t.getFirstChild();
		funargs(_t);
		_t = _retTree;
		_t = __t2271;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void substringfunc(AST _t) throws RecognitionException {
		
		AST substringfunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2378 = _t;
		AST tmp335_AST_in = (AST)_t;
		match(_t,SUBSTRING);
		_t = _t.getFirstChild();
		funargs(_t);
		_t = _retTree;
		_t = __t2378;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void parameterlist(AST _t) throws RecognitionException {
		
		AST parameterlist_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1603 = _t;
		AST tmp336_AST_in = (AST)_t;
		match(_t,Parameter_list);
		_t = _t.getFirstChild();
		parameterlist_noroot(_t);
		_t = _retTree;
		_t = __t1603;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void sqlaggregatefunc(AST _t) throws RecognitionException {
		
		AST sqlaggregatefunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AVG:
		{
			AST __t1416 = _t;
			AST tmp337_AST_in = (AST)_t;
			match(_t,AVG);
			_t = _t.getFirstChild();
			sqlaggregatefunc_arg(_t);
			_t = _retTree;
			_t = __t1416;
			_t = _t.getNextSibling();
			break;
		}
		case COUNT:
		{
			AST __t1417 = _t;
			AST tmp338_AST_in = (AST)_t;
			match(_t,COUNT);
			_t = _t.getFirstChild();
			sqlaggregatefunc_arg(_t);
			_t = _retTree;
			_t = __t1417;
			_t = _t.getNextSibling();
			break;
		}
		case SUM:
		{
			AST __t1418 = _t;
			AST tmp339_AST_in = (AST)_t;
			match(_t,SUM);
			_t = _t.getFirstChild();
			sqlaggregatefunc_arg(_t);
			_t = _retTree;
			_t = __t1418;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void argfunc(AST _t) throws RecognitionException {
		
		AST argfunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AACBIT:
		{
			AST __t1461 = _t;
			AST tmp340_AST_in = (AST)_t;
			match(_t,AACBIT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1461;
			_t = _t.getNextSibling();
			break;
		}
		case AAMSG:
		{
			AST __t1462 = _t;
			AST tmp341_AST_in = (AST)_t;
			match(_t,AAMSG);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1462;
			_t = _t.getNextSibling();
			break;
		}
		case ABSOLUTE:
		{
			AST __t1463 = _t;
			AST tmp342_AST_in = (AST)_t;
			match(_t,ABSOLUTE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1463;
			_t = _t.getNextSibling();
			break;
		}
		case ALIAS:
		{
			AST __t1464 = _t;
			AST tmp343_AST_in = (AST)_t;
			match(_t,ALIAS);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1464;
			_t = _t.getNextSibling();
			break;
		}
		case ASC:
		{
			AST __t1465 = _t;
			AST tmp344_AST_in = (AST)_t;
			match(_t,ASC);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1465;
			_t = _t.getNextSibling();
			break;
		}
		case BASE64DECODE:
		{
			AST __t1466 = _t;
			AST tmp345_AST_in = (AST)_t;
			match(_t,BASE64DECODE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1466;
			_t = _t.getNextSibling();
			break;
		}
		case BASE64ENCODE:
		{
			AST __t1467 = _t;
			AST tmp346_AST_in = (AST)_t;
			match(_t,BASE64ENCODE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1467;
			_t = _t.getNextSibling();
			break;
		}
		case BOX:
		{
			AST __t1468 = _t;
			AST tmp347_AST_in = (AST)_t;
			match(_t,BOX);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1468;
			_t = _t.getNextSibling();
			break;
		}
		case CANDO:
		{
			AST __t1469 = _t;
			AST tmp348_AST_in = (AST)_t;
			match(_t,CANDO);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1469;
			_t = _t.getNextSibling();
			break;
		}
		case CANQUERY:
		{
			AST __t1470 = _t;
			AST tmp349_AST_in = (AST)_t;
			match(_t,CANQUERY);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1470;
			_t = _t.getNextSibling();
			break;
		}
		case CANSET:
		{
			AST __t1471 = _t;
			AST tmp350_AST_in = (AST)_t;
			match(_t,CANSET);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1471;
			_t = _t.getNextSibling();
			break;
		}
		case CAPS:
		{
			AST __t1472 = _t;
			AST tmp351_AST_in = (AST)_t;
			match(_t,CAPS);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1472;
			_t = _t.getNextSibling();
			break;
		}
		case CHR:
		{
			AST __t1473 = _t;
			AST tmp352_AST_in = (AST)_t;
			match(_t,CHR);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1473;
			_t = _t.getNextSibling();
			break;
		}
		case CODEPAGECONVERT:
		{
			AST __t1474 = _t;
			AST tmp353_AST_in = (AST)_t;
			match(_t,CODEPAGECONVERT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1474;
			_t = _t.getNextSibling();
			break;
		}
		case COLLATE:
		{
			AST __t1475 = _t;
			AST tmp354_AST_in = (AST)_t;
			match(_t,COLLATE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1475;
			_t = _t.getNextSibling();
			break;
		}
		case COMPARE:
		{
			AST __t1476 = _t;
			AST tmp355_AST_in = (AST)_t;
			match(_t,COMPARE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1476;
			_t = _t.getNextSibling();
			break;
		}
		case CONNECTED:
		{
			AST __t1477 = _t;
			AST tmp356_AST_in = (AST)_t;
			match(_t,CONNECTED);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1477;
			_t = _t.getNextSibling();
			break;
		}
		case COUNTOF:
		{
			AST __t1478 = _t;
			AST tmp357_AST_in = (AST)_t;
			match(_t,COUNTOF);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1478;
			_t = _t.getNextSibling();
			break;
		}
		case CURRENTRESULTROW:
		{
			AST __t1479 = _t;
			AST tmp358_AST_in = (AST)_t;
			match(_t,CURRENTRESULTROW);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1479;
			_t = _t.getNextSibling();
			break;
		}
		case DATE:
		{
			AST __t1480 = _t;
			AST tmp359_AST_in = (AST)_t;
			match(_t,DATE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1480;
			_t = _t.getNextSibling();
			break;
		}
		case DATETIME:
		{
			AST __t1481 = _t;
			AST tmp360_AST_in = (AST)_t;
			match(_t,DATETIME);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1481;
			_t = _t.getNextSibling();
			break;
		}
		case DATETIMETZ:
		{
			AST __t1482 = _t;
			AST tmp361_AST_in = (AST)_t;
			match(_t,DATETIMETZ);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1482;
			_t = _t.getNextSibling();
			break;
		}
		case DAY:
		{
			AST __t1483 = _t;
			AST tmp362_AST_in = (AST)_t;
			match(_t,DAY);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1483;
			_t = _t.getNextSibling();
			break;
		}
		case DBCODEPAGE:
		{
			AST __t1484 = _t;
			AST tmp363_AST_in = (AST)_t;
			match(_t,DBCODEPAGE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1484;
			_t = _t.getNextSibling();
			break;
		}
		case DBCOLLATION:
		{
			AST __t1485 = _t;
			AST tmp364_AST_in = (AST)_t;
			match(_t,DBCOLLATION);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1485;
			_t = _t.getNextSibling();
			break;
		}
		case DBPARAM:
		{
			AST __t1486 = _t;
			AST tmp365_AST_in = (AST)_t;
			match(_t,DBPARAM);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1486;
			_t = _t.getNextSibling();
			break;
		}
		case DBREMOTEHOST:
		{
			AST __t1487 = _t;
			AST tmp366_AST_in = (AST)_t;
			match(_t,DBREMOTEHOST);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1487;
			_t = _t.getNextSibling();
			break;
		}
		case DBRESTRICTIONS:
		{
			AST __t1488 = _t;
			AST tmp367_AST_in = (AST)_t;
			match(_t,DBRESTRICTIONS);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1488;
			_t = _t.getNextSibling();
			break;
		}
		case DBTASKID:
		{
			AST __t1489 = _t;
			AST tmp368_AST_in = (AST)_t;
			match(_t,DBTASKID);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1489;
			_t = _t.getNextSibling();
			break;
		}
		case DBTYPE:
		{
			AST __t1490 = _t;
			AST tmp369_AST_in = (AST)_t;
			match(_t,DBTYPE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1490;
			_t = _t.getNextSibling();
			break;
		}
		case DBVERSION:
		{
			AST __t1491 = _t;
			AST tmp370_AST_in = (AST)_t;
			match(_t,DBVERSION);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1491;
			_t = _t.getNextSibling();
			break;
		}
		case DECIMAL:
		{
			AST __t1492 = _t;
			AST tmp371_AST_in = (AST)_t;
			match(_t,DECIMAL);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1492;
			_t = _t.getNextSibling();
			break;
		}
		case DECRYPT:
		{
			AST __t1493 = _t;
			AST tmp372_AST_in = (AST)_t;
			match(_t,DECRYPT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1493;
			_t = _t.getNextSibling();
			break;
		}
		case DYNAMICCAST:
		{
			AST __t1494 = _t;
			AST tmp373_AST_in = (AST)_t;
			match(_t,DYNAMICCAST);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1494;
			_t = _t.getNextSibling();
			break;
		}
		case DYNAMICNEXTVALUE:
		{
			AST __t1495 = _t;
			AST tmp374_AST_in = (AST)_t;
			match(_t,DYNAMICNEXTVALUE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1495;
			_t = _t.getNextSibling();
			break;
		}
		case DYNAMICINVOKE:
		{
			AST __t1496 = _t;
			AST tmp375_AST_in = (AST)_t;
			match(_t,DYNAMICINVOKE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1496;
			_t = _t.getNextSibling();
			break;
		}
		case ENCODE:
		{
			AST __t1497 = _t;
			AST tmp376_AST_in = (AST)_t;
			match(_t,ENCODE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1497;
			_t = _t.getNextSibling();
			break;
		}
		case ENCRYPT:
		{
			AST __t1498 = _t;
			AST tmp377_AST_in = (AST)_t;
			match(_t,ENCRYPT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1498;
			_t = _t.getNextSibling();
			break;
		}
		case EXP:
		{
			AST __t1499 = _t;
			AST tmp378_AST_in = (AST)_t;
			match(_t,EXP);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1499;
			_t = _t.getNextSibling();
			break;
		}
		case FILL:
		{
			AST __t1500 = _t;
			AST tmp379_AST_in = (AST)_t;
			match(_t,FILL);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1500;
			_t = _t.getNextSibling();
			break;
		}
		case FIRST:
		{
			AST __t1501 = _t;
			AST tmp380_AST_in = (AST)_t;
			match(_t,FIRST);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1501;
			_t = _t.getNextSibling();
			break;
		}
		case FIRSTOF:
		{
			AST __t1502 = _t;
			AST tmp381_AST_in = (AST)_t;
			match(_t,FIRSTOF);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1502;
			_t = _t.getNextSibling();
			break;
		}
		case GENERATEPBEKEY:
		{
			AST __t1503 = _t;
			AST tmp382_AST_in = (AST)_t;
			match(_t,GENERATEPBEKEY);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1503;
			_t = _t.getNextSibling();
			break;
		}
		case GETBITS:
		{
			AST __t1504 = _t;
			AST tmp383_AST_in = (AST)_t;
			match(_t,GETBITS);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1504;
			_t = _t.getNextSibling();
			break;
		}
		case GETBYTE:
		{
			AST __t1505 = _t;
			AST tmp384_AST_in = (AST)_t;
			match(_t,GETBYTE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1505;
			_t = _t.getNextSibling();
			break;
		}
		case GETBYTEORDER:
		{
			AST __t1506 = _t;
			AST tmp385_AST_in = (AST)_t;
			match(_t,GETBYTEORDER);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1506;
			_t = _t.getNextSibling();
			break;
		}
		case GETBYTES:
		{
			AST __t1507 = _t;
			AST tmp386_AST_in = (AST)_t;
			match(_t,GETBYTES);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1507;
			_t = _t.getNextSibling();
			break;
		}
		case GETCOLLATIONS:
		{
			AST __t1508 = _t;
			AST tmp387_AST_in = (AST)_t;
			match(_t,GETCOLLATIONS);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1508;
			_t = _t.getNextSibling();
			break;
		}
		case GETDOUBLE:
		{
			AST __t1509 = _t;
			AST tmp388_AST_in = (AST)_t;
			match(_t,GETDOUBLE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1509;
			_t = _t.getNextSibling();
			break;
		}
		case GETFLOAT:
		{
			AST __t1510 = _t;
			AST tmp389_AST_in = (AST)_t;
			match(_t,GETFLOAT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1510;
			_t = _t.getNextSibling();
			break;
		}
		case GETINT64:
		{
			AST __t1511 = _t;
			AST tmp390_AST_in = (AST)_t;
			match(_t,GETINT64);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1511;
			_t = _t.getNextSibling();
			break;
		}
		case GETLICENSE:
		{
			AST __t1512 = _t;
			AST tmp391_AST_in = (AST)_t;
			match(_t,GETLICENSE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1512;
			_t = _t.getNextSibling();
			break;
		}
		case GETLONG:
		{
			AST __t1513 = _t;
			AST tmp392_AST_in = (AST)_t;
			match(_t,GETLONG);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1513;
			_t = _t.getNextSibling();
			break;
		}
		case GETPOINTERVALUE:
		{
			AST __t1514 = _t;
			AST tmp393_AST_in = (AST)_t;
			match(_t,GETPOINTERVALUE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1514;
			_t = _t.getNextSibling();
			break;
		}
		case GETSHORT:
		{
			AST __t1515 = _t;
			AST tmp394_AST_in = (AST)_t;
			match(_t,GETSHORT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1515;
			_t = _t.getNextSibling();
			break;
		}
		case GETSIZE:
		{
			AST __t1516 = _t;
			AST tmp395_AST_in = (AST)_t;
			match(_t,GETSIZE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1516;
			_t = _t.getNextSibling();
			break;
		}
		case GETSTRING:
		{
			AST __t1517 = _t;
			AST tmp396_AST_in = (AST)_t;
			match(_t,GETSTRING);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1517;
			_t = _t.getNextSibling();
			break;
		}
		case GETUNSIGNEDLONG:
		{
			AST __t1518 = _t;
			AST tmp397_AST_in = (AST)_t;
			match(_t,GETUNSIGNEDLONG);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1518;
			_t = _t.getNextSibling();
			break;
		}
		case GETUNSIGNEDSHORT:
		{
			AST __t1519 = _t;
			AST tmp398_AST_in = (AST)_t;
			match(_t,GETUNSIGNEDSHORT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1519;
			_t = _t.getNextSibling();
			break;
		}
		case HANDLE:
		{
			AST __t1520 = _t;
			AST tmp399_AST_in = (AST)_t;
			match(_t,HANDLE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1520;
			_t = _t.getNextSibling();
			break;
		}
		case HEXDECODE:
		{
			AST __t1521 = _t;
			AST tmp400_AST_in = (AST)_t;
			match(_t,HEXDECODE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1521;
			_t = _t.getNextSibling();
			break;
		}
		case HEXENCODE:
		{
			AST __t1522 = _t;
			AST tmp401_AST_in = (AST)_t;
			match(_t,HEXENCODE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1522;
			_t = _t.getNextSibling();
			break;
		}
		case INDEX:
		{
			AST __t1523 = _t;
			AST tmp402_AST_in = (AST)_t;
			match(_t,INDEX);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1523;
			_t = _t.getNextSibling();
			break;
		}
		case INT64:
		{
			AST __t1524 = _t;
			AST tmp403_AST_in = (AST)_t;
			match(_t,INT64);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1524;
			_t = _t.getNextSibling();
			break;
		}
		case INTEGER:
		{
			AST __t1525 = _t;
			AST tmp404_AST_in = (AST)_t;
			match(_t,INTEGER);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1525;
			_t = _t.getNextSibling();
			break;
		}
		case INTERVAL:
		{
			AST __t1526 = _t;
			AST tmp405_AST_in = (AST)_t;
			match(_t,INTERVAL);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1526;
			_t = _t.getNextSibling();
			break;
		}
		case ISCODEPAGEFIXED:
		{
			AST __t1527 = _t;
			AST tmp406_AST_in = (AST)_t;
			match(_t,ISCODEPAGEFIXED);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1527;
			_t = _t.getNextSibling();
			break;
		}
		case ISCOLUMNCODEPAGE:
		{
			AST __t1528 = _t;
			AST tmp407_AST_in = (AST)_t;
			match(_t,ISCOLUMNCODEPAGE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1528;
			_t = _t.getNextSibling();
			break;
		}
		case ISLEADBYTE:
		{
			AST __t1529 = _t;
			AST tmp408_AST_in = (AST)_t;
			match(_t,ISLEADBYTE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1529;
			_t = _t.getNextSibling();
			break;
		}
		case ISODATE:
		{
			AST __t1530 = _t;
			AST tmp409_AST_in = (AST)_t;
			match(_t,ISODATE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1530;
			_t = _t.getNextSibling();
			break;
		}
		case KBLABEL:
		{
			AST __t1531 = _t;
			AST tmp410_AST_in = (AST)_t;
			match(_t,KBLABEL);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1531;
			_t = _t.getNextSibling();
			break;
		}
		case KEYCODE:
		{
			AST __t1532 = _t;
			AST tmp411_AST_in = (AST)_t;
			match(_t,KEYCODE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1532;
			_t = _t.getNextSibling();
			break;
		}
		case KEYFUNCTION:
		{
			AST __t1533 = _t;
			AST tmp412_AST_in = (AST)_t;
			match(_t,KEYFUNCTION);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1533;
			_t = _t.getNextSibling();
			break;
		}
		case KEYLABEL:
		{
			AST __t1534 = _t;
			AST tmp413_AST_in = (AST)_t;
			match(_t,KEYLABEL);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1534;
			_t = _t.getNextSibling();
			break;
		}
		case KEYWORD:
		{
			AST __t1535 = _t;
			AST tmp414_AST_in = (AST)_t;
			match(_t,KEYWORD);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1535;
			_t = _t.getNextSibling();
			break;
		}
		case KEYWORDALL:
		{
			AST __t1536 = _t;
			AST tmp415_AST_in = (AST)_t;
			match(_t,KEYWORDALL);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1536;
			_t = _t.getNextSibling();
			break;
		}
		case LAST:
		{
			AST __t1537 = _t;
			AST tmp416_AST_in = (AST)_t;
			match(_t,LAST);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1537;
			_t = _t.getNextSibling();
			break;
		}
		case LASTOF:
		{
			AST __t1538 = _t;
			AST tmp417_AST_in = (AST)_t;
			match(_t,LASTOF);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1538;
			_t = _t.getNextSibling();
			break;
		}
		case LC:
		{
			AST __t1539 = _t;
			AST tmp418_AST_in = (AST)_t;
			match(_t,LC);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1539;
			_t = _t.getNextSibling();
			break;
		}
		case LEFTTRIM:
		{
			AST __t1540 = _t;
			AST tmp419_AST_in = (AST)_t;
			match(_t,LEFTTRIM);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1540;
			_t = _t.getNextSibling();
			break;
		}
		case LIBRARY:
		{
			AST __t1541 = _t;
			AST tmp420_AST_in = (AST)_t;
			match(_t,LIBRARY);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1541;
			_t = _t.getNextSibling();
			break;
		}
		case LISTEVENTS:
		{
			AST __t1542 = _t;
			AST tmp421_AST_in = (AST)_t;
			match(_t,LISTEVENTS);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1542;
			_t = _t.getNextSibling();
			break;
		}
		case LISTQUERYATTRS:
		{
			AST __t1543 = _t;
			AST tmp422_AST_in = (AST)_t;
			match(_t,LISTQUERYATTRS);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1543;
			_t = _t.getNextSibling();
			break;
		}
		case LISTSETATTRS:
		{
			AST __t1544 = _t;
			AST tmp423_AST_in = (AST)_t;
			match(_t,LISTSETATTRS);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1544;
			_t = _t.getNextSibling();
			break;
		}
		case LISTWIDGETS:
		{
			AST __t1545 = _t;
			AST tmp424_AST_in = (AST)_t;
			match(_t,LISTWIDGETS);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1545;
			_t = _t.getNextSibling();
			break;
		}
		case LOADPICTURE:
		{
			AST __t1546 = _t;
			AST tmp425_AST_in = (AST)_t;
			match(_t,LOADPICTURE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1546;
			_t = _t.getNextSibling();
			break;
		}
		case LOG:
		{
			AST __t1547 = _t;
			AST tmp426_AST_in = (AST)_t;
			match(_t,LOG);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1547;
			_t = _t.getNextSibling();
			break;
		}
		case LOGICAL:
		{
			AST __t1548 = _t;
			AST tmp427_AST_in = (AST)_t;
			match(_t,LOGICAL);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1548;
			_t = _t.getNextSibling();
			break;
		}
		case LOOKUP:
		{
			AST __t1549 = _t;
			AST tmp428_AST_in = (AST)_t;
			match(_t,LOOKUP);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1549;
			_t = _t.getNextSibling();
			break;
		}
		case MAXIMUM:
		{
			AST __t1550 = _t;
			AST tmp429_AST_in = (AST)_t;
			match(_t,MAXIMUM);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1550;
			_t = _t.getNextSibling();
			break;
		}
		case MD5DIGEST:
		{
			AST __t1551 = _t;
			AST tmp430_AST_in = (AST)_t;
			match(_t,MD5DIGEST);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1551;
			_t = _t.getNextSibling();
			break;
		}
		case MEMBER:
		{
			AST __t1552 = _t;
			AST tmp431_AST_in = (AST)_t;
			match(_t,MEMBER);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1552;
			_t = _t.getNextSibling();
			break;
		}
		case MINIMUM:
		{
			AST __t1553 = _t;
			AST tmp432_AST_in = (AST)_t;
			match(_t,MINIMUM);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1553;
			_t = _t.getNextSibling();
			break;
		}
		case MONTH:
		{
			AST __t1554 = _t;
			AST tmp433_AST_in = (AST)_t;
			match(_t,MONTH);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1554;
			_t = _t.getNextSibling();
			break;
		}
		case NORMALIZE:
		{
			AST __t1555 = _t;
			AST tmp434_AST_in = (AST)_t;
			match(_t,NORMALIZE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1555;
			_t = _t.getNextSibling();
			break;
		}
		case NUMENTRIES:
		{
			AST __t1556 = _t;
			AST tmp435_AST_in = (AST)_t;
			match(_t,NUMENTRIES);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1556;
			_t = _t.getNextSibling();
			break;
		}
		case NUMRESULTS:
		{
			AST __t1557 = _t;
			AST tmp436_AST_in = (AST)_t;
			match(_t,NUMRESULTS);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1557;
			_t = _t.getNextSibling();
			break;
		}
		case OSGETENV:
		{
			AST __t1558 = _t;
			AST tmp437_AST_in = (AST)_t;
			match(_t,OSGETENV);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1558;
			_t = _t.getNextSibling();
			break;
		}
		case PDBNAME:
		{
			AST __t1559 = _t;
			AST tmp438_AST_in = (AST)_t;
			match(_t,PDBNAME);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1559;
			_t = _t.getNextSibling();
			break;
		}
		case PROGRAMNAME:
		{
			AST __t1560 = _t;
			AST tmp439_AST_in = (AST)_t;
			match(_t,PROGRAMNAME);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1560;
			_t = _t.getNextSibling();
			break;
		}
		case QUERYOFFEND:
		{
			AST __t1561 = _t;
			AST tmp440_AST_in = (AST)_t;
			match(_t,QUERYOFFEND);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1561;
			_t = _t.getNextSibling();
			break;
		}
		case QUOTER:
		{
			AST __t1562 = _t;
			AST tmp441_AST_in = (AST)_t;
			match(_t,QUOTER);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1562;
			_t = _t.getNextSibling();
			break;
		}
		case RINDEX:
		{
			AST __t1563 = _t;
			AST tmp442_AST_in = (AST)_t;
			match(_t,RINDEX);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1563;
			_t = _t.getNextSibling();
			break;
		}
		case RANDOM:
		{
			AST __t1564 = _t;
			AST tmp443_AST_in = (AST)_t;
			match(_t,RANDOM);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1564;
			_t = _t.getNextSibling();
			break;
		}
		case REPLACE:
		{
			AST __t1565 = _t;
			AST tmp444_AST_in = (AST)_t;
			match(_t,REPLACE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1565;
			_t = _t.getNextSibling();
			break;
		}
		case RGBVALUE:
		{
			AST __t1566 = _t;
			AST tmp445_AST_in = (AST)_t;
			match(_t,RGBVALUE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1566;
			_t = _t.getNextSibling();
			break;
		}
		case RIGHTTRIM:
		{
			AST __t1567 = _t;
			AST tmp446_AST_in = (AST)_t;
			match(_t,RIGHTTRIM);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1567;
			_t = _t.getNextSibling();
			break;
		}
		case ROUND:
		{
			AST __t1568 = _t;
			AST tmp447_AST_in = (AST)_t;
			match(_t,ROUND);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1568;
			_t = _t.getNextSibling();
			break;
		}
		case SDBNAME:
		{
			AST __t1569 = _t;
			AST tmp448_AST_in = (AST)_t;
			match(_t,SDBNAME);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1569;
			_t = _t.getNextSibling();
			break;
		}
		case SEARCH:
		{
			AST __t1570 = _t;
			AST tmp449_AST_in = (AST)_t;
			match(_t,SEARCH);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1570;
			_t = _t.getNextSibling();
			break;
		}
		case SETDBCLIENT:
		{
			AST __t1571 = _t;
			AST tmp450_AST_in = (AST)_t;
			match(_t,SETDBCLIENT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1571;
			_t = _t.getNextSibling();
			break;
		}
		case SETUSERID:
		{
			AST __t1572 = _t;
			AST tmp451_AST_in = (AST)_t;
			match(_t,SETUSERID);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1572;
			_t = _t.getNextSibling();
			break;
		}
		case SHA1DIGEST:
		{
			AST __t1573 = _t;
			AST tmp452_AST_in = (AST)_t;
			match(_t,SHA1DIGEST);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1573;
			_t = _t.getNextSibling();
			break;
		}
		case SQRT:
		{
			AST __t1574 = _t;
			AST tmp453_AST_in = (AST)_t;
			match(_t,SQRT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1574;
			_t = _t.getNextSibling();
			break;
		}
		case SSLSERVERNAME:
		{
			AST __t1575 = _t;
			AST tmp454_AST_in = (AST)_t;
			match(_t,SSLSERVERNAME);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1575;
			_t = _t.getNextSibling();
			break;
		}
		case STRING:
		{
			AST __t1576 = _t;
			AST tmp455_AST_in = (AST)_t;
			match(_t,STRING);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1576;
			_t = _t.getNextSibling();
			break;
		}
		case SUBSTITUTE:
		{
			AST __t1577 = _t;
			AST tmp456_AST_in = (AST)_t;
			match(_t,SUBSTITUTE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1577;
			_t = _t.getNextSibling();
			break;
		}
		case TOROWID:
		{
			AST __t1578 = _t;
			AST tmp457_AST_in = (AST)_t;
			match(_t,TOROWID);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1578;
			_t = _t.getNextSibling();
			break;
		}
		case TRIM:
		{
			AST __t1579 = _t;
			AST tmp458_AST_in = (AST)_t;
			match(_t,TRIM);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1579;
			_t = _t.getNextSibling();
			break;
		}
		case TRUNCATE:
		{
			AST __t1580 = _t;
			AST tmp459_AST_in = (AST)_t;
			match(_t,TRUNCATE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1580;
			_t = _t.getNextSibling();
			break;
		}
		case UNBOX:
		{
			AST __t1581 = _t;
			AST tmp460_AST_in = (AST)_t;
			match(_t,UNBOX);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1581;
			_t = _t.getNextSibling();
			break;
		}
		case VALIDEVENT:
		{
			AST __t1582 = _t;
			AST tmp461_AST_in = (AST)_t;
			match(_t,VALIDEVENT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1582;
			_t = _t.getNextSibling();
			break;
		}
		case VALIDHANDLE:
		{
			AST __t1583 = _t;
			AST tmp462_AST_in = (AST)_t;
			match(_t,VALIDHANDLE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1583;
			_t = _t.getNextSibling();
			break;
		}
		case VALIDOBJECT:
		{
			AST __t1584 = _t;
			AST tmp463_AST_in = (AST)_t;
			match(_t,VALIDOBJECT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1584;
			_t = _t.getNextSibling();
			break;
		}
		case WEEKDAY:
		{
			AST __t1585 = _t;
			AST tmp464_AST_in = (AST)_t;
			match(_t,WEEKDAY);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1585;
			_t = _t.getNextSibling();
			break;
		}
		case WIDGETHANDLE:
		{
			AST __t1586 = _t;
			AST tmp465_AST_in = (AST)_t;
			match(_t,WIDGETHANDLE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1586;
			_t = _t.getNextSibling();
			break;
		}
		case YEAR:
		{
			AST __t1587 = _t;
			AST tmp466_AST_in = (AST)_t;
			match(_t,YEAR);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1587;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void noargfunc(AST _t) throws RecognitionException {
		
		AST noargfunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AACONTROL:
		{
			AST tmp467_AST_in = (AST)_t;
			match(_t,AACONTROL);
			_t = _t.getNextSibling();
			break;
		}
		case AAPCONTROL:
		{
			AST tmp468_AST_in = (AST)_t;
			match(_t,AAPCONTROL);
			_t = _t.getNextSibling();
			break;
		}
		case AASERIAL:
		{
			AST tmp469_AST_in = (AST)_t;
			match(_t,AASERIAL);
			_t = _t.getNextSibling();
			break;
		}
		case CURRENTLANGUAGE:
		{
			AST tmp470_AST_in = (AST)_t;
			match(_t,CURRENTLANGUAGE);
			_t = _t.getNextSibling();
			break;
		}
		case CURSOR:
		{
			AST tmp471_AST_in = (AST)_t;
			match(_t,CURSOR);
			_t = _t.getNextSibling();
			break;
		}
		case DATASERVERS:
		{
			AST tmp472_AST_in = (AST)_t;
			match(_t,DATASERVERS);
			_t = _t.getNextSibling();
			break;
		}
		case DBNAME:
		{
			AST tmp473_AST_in = (AST)_t;
			match(_t,DBNAME);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEDB:
		{
			AST tmp474_AST_in = (AST)_t;
			match(_t,FRAMEDB);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEFIELD:
		{
			AST tmp475_AST_in = (AST)_t;
			match(_t,FRAMEFIELD);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEFILE:
		{
			AST tmp476_AST_in = (AST)_t;
			match(_t,FRAMEFILE);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEINDEX:
		{
			AST tmp477_AST_in = (AST)_t;
			match(_t,FRAMEINDEX);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMENAME:
		{
			AST tmp478_AST_in = (AST)_t;
			match(_t,FRAMENAME);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEVALUE:
		{
			AST tmp479_AST_in = (AST)_t;
			match(_t,FRAMEVALUE);
			_t = _t.getNextSibling();
			break;
		}
		case GENERATEPBESALT:
		{
			AST tmp480_AST_in = (AST)_t;
			match(_t,GENERATEPBESALT);
			_t = _t.getNextSibling();
			break;
		}
		case GENERATERANDOMKEY:
		{
			AST tmp481_AST_in = (AST)_t;
			match(_t,GENERATERANDOMKEY);
			_t = _t.getNextSibling();
			break;
		}
		case GENERATEUUID:
		{
			AST tmp482_AST_in = (AST)_t;
			match(_t,GENERATEUUID);
			_t = _t.getNextSibling();
			break;
		}
		case GATEWAYS:
		{
			AST tmp483_AST_in = (AST)_t;
			match(_t,GATEWAYS);
			_t = _t.getNextSibling();
			break;
		}
		case GOPENDING:
		{
			AST tmp484_AST_in = (AST)_t;
			match(_t,GOPENDING);
			_t = _t.getNextSibling();
			break;
		}
		case ISATTRSPACE:
		{
			AST tmp485_AST_in = (AST)_t;
			match(_t,ISATTRSPACE);
			_t = _t.getNextSibling();
			break;
		}
		case LASTKEY:
		{
			AST tmp486_AST_in = (AST)_t;
			match(_t,LASTKEY);
			_t = _t.getNextSibling();
			break;
		}
		case MACHINECLASS:
		{
			AST tmp487_AST_in = (AST)_t;
			match(_t,MACHINECLASS);
			_t = _t.getNextSibling();
			break;
		}
		case MESSAGELINES:
		{
			AST tmp488_AST_in = (AST)_t;
			match(_t,MESSAGELINES);
			_t = _t.getNextSibling();
			break;
		}
		case NOW:
		{
			AST tmp489_AST_in = (AST)_t;
			match(_t,NOW);
			_t = _t.getNextSibling();
			break;
		}
		case NUMALIASES:
		{
			AST tmp490_AST_in = (AST)_t;
			match(_t,NUMALIASES);
			_t = _t.getNextSibling();
			break;
		}
		case NUMDBS:
		{
			AST tmp491_AST_in = (AST)_t;
			match(_t,NUMDBS);
			_t = _t.getNextSibling();
			break;
		}
		case OPSYS:
		{
			AST tmp492_AST_in = (AST)_t;
			match(_t,OPSYS);
			_t = _t.getNextSibling();
			break;
		}
		case OSDRIVES:
		{
			AST tmp493_AST_in = (AST)_t;
			match(_t,OSDRIVES);
			_t = _t.getNextSibling();
			break;
		}
		case OSERROR:
		{
			AST tmp494_AST_in = (AST)_t;
			match(_t,OSERROR);
			_t = _t.getNextSibling();
			break;
		}
		case PROCHANDLE:
		{
			AST tmp495_AST_in = (AST)_t;
			match(_t,PROCHANDLE);
			_t = _t.getNextSibling();
			break;
		}
		case PROCSTATUS:
		{
			AST tmp496_AST_in = (AST)_t;
			match(_t,PROCSTATUS);
			_t = _t.getNextSibling();
			break;
		}
		case PROGRESS:
		{
			AST tmp497_AST_in = (AST)_t;
			match(_t,PROGRESS);
			_t = _t.getNextSibling();
			break;
		}
		case PROMSGS:
		{
			AST tmp498_AST_in = (AST)_t;
			match(_t,PROMSGS);
			_t = _t.getNextSibling();
			break;
		}
		case PROPATH:
		{
			AST tmp499_AST_in = (AST)_t;
			match(_t,PROPATH);
			_t = _t.getNextSibling();
			break;
		}
		case PROVERSION:
		{
			AST tmp500_AST_in = (AST)_t;
			match(_t,PROVERSION);
			_t = _t.getNextSibling();
			break;
		}
		case RETRY:
		{
			AST tmp501_AST_in = (AST)_t;
			match(_t,RETRY);
			_t = _t.getNextSibling();
			break;
		}
		case RETURNVALUE:
		{
			AST tmp502_AST_in = (AST)_t;
			match(_t,RETURNVALUE);
			_t = _t.getNextSibling();
			break;
		}
		case SCREENLINES:
		{
			AST tmp503_AST_in = (AST)_t;
			match(_t,SCREENLINES);
			_t = _t.getNextSibling();
			break;
		}
		case TERMINAL:
		{
			AST tmp504_AST_in = (AST)_t;
			match(_t,TERMINAL);
			_t = _t.getNextSibling();
			break;
		}
		case TIME:
		{
			AST tmp505_AST_in = (AST)_t;
			match(_t,TIME);
			_t = _t.getNextSibling();
			break;
		}
		case TODAY:
		{
			AST tmp506_AST_in = (AST)_t;
			match(_t,TODAY);
			_t = _t.getNextSibling();
			break;
		}
		case TRANSACTION:
		{
			AST tmp507_AST_in = (AST)_t;
			match(_t,TRANSACTION);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void recordfunc(AST _t) throws RecognitionException {
		
		AST recordfunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AMBIGUOUS:
		{
			AST __t1589 = _t;
			AST tmp508_AST_in = (AST)_t;
			match(_t,AMBIGUOUS);
			_t = _t.getFirstChild();
			recordfunargs(_t);
			_t = _retTree;
			_t = __t1589;
			_t = _t.getNextSibling();
			break;
		}
		case AVAILABLE:
		{
			AST __t1590 = _t;
			AST tmp509_AST_in = (AST)_t;
			match(_t,AVAILABLE);
			_t = _t.getFirstChild();
			recordfunargs(_t);
			_t = _retTree;
			_t = __t1590;
			_t = _t.getNextSibling();
			break;
		}
		case CURRENTCHANGED:
		{
			AST __t1591 = _t;
			AST tmp510_AST_in = (AST)_t;
			match(_t,CURRENTCHANGED);
			_t = _t.getFirstChild();
			recordfunargs(_t);
			_t = _retTree;
			_t = __t1591;
			_t = _t.getNextSibling();
			break;
		}
		case DATASOURCEMODIFIED:
		{
			AST __t1592 = _t;
			AST tmp511_AST_in = (AST)_t;
			match(_t,DATASOURCEMODIFIED);
			_t = _t.getFirstChild();
			recordfunargs(_t);
			_t = _retTree;
			_t = __t1592;
			_t = _t.getNextSibling();
			break;
		}
		case ERROR:
		{
			AST __t1593 = _t;
			AST tmp512_AST_in = (AST)_t;
			match(_t,ERROR);
			_t = _t.getFirstChild();
			recordfunargs(_t);
			_t = _retTree;
			_t = __t1593;
			_t = _t.getNextSibling();
			break;
		}
		case LOCKED:
		{
			AST __t1594 = _t;
			AST tmp513_AST_in = (AST)_t;
			match(_t,LOCKED);
			_t = _t.getFirstChild();
			recordfunargs(_t);
			_t = _retTree;
			_t = __t1594;
			_t = _t.getNextSibling();
			break;
		}
		case NEW:
		{
			AST __t1595 = _t;
			AST tmp514_AST_in = (AST)_t;
			match(_t,NEW);
			_t = _t.getFirstChild();
			recordfunargs(_t);
			_t = _retTree;
			_t = __t1595;
			_t = _t.getNextSibling();
			break;
		}
		case RECID:
		{
			AST __t1596 = _t;
			AST tmp515_AST_in = (AST)_t;
			match(_t,RECID);
			_t = _t.getFirstChild();
			recordfunargs(_t);
			_t = _retTree;
			_t = __t1596;
			_t = _t.getNextSibling();
			break;
		}
		case RECORDLENGTH:
		{
			AST __t1597 = _t;
			AST tmp516_AST_in = (AST)_t;
			match(_t,RECORDLENGTH);
			_t = _t.getFirstChild();
			recordfunargs(_t);
			_t = _retTree;
			_t = __t1597;
			_t = _t.getNextSibling();
			break;
		}
		case REJECTED:
		{
			AST __t1598 = _t;
			AST tmp517_AST_in = (AST)_t;
			match(_t,REJECTED);
			_t = _t.getFirstChild();
			recordfunargs(_t);
			_t = _retTree;
			_t = __t1598;
			_t = _t.getNextSibling();
			break;
		}
		case ROWID:
		{
			AST __t1599 = _t;
			AST tmp518_AST_in = (AST)_t;
			match(_t,ROWID);
			_t = _t.getFirstChild();
			recordfunargs(_t);
			_t = _retTree;
			_t = __t1599;
			_t = _t.getNextSibling();
			break;
		}
		case ROWSTATE:
		{
			AST __t1600 = _t;
			AST tmp519_AST_in = (AST)_t;
			match(_t,ROWSTATE);
			_t = _t.getFirstChild();
			recordfunargs(_t);
			_t = _retTree;
			_t = __t1600;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void recordfunargs(AST _t) throws RecognitionException {
		
		AST recordfunargs_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case LEFTPAREN:
		{
			AST tmp520_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			tbl(_t,CQ.REF);
			_t = _retTree;
			AST tmp521_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			break;
		}
		case RECORD_NAME:
		{
			tbl(_t,CQ.REF);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_retTree = _t;
	}
	
	public final void parameter_arg(AST _t) throws RecognitionException {
		
		AST parameter_arg_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST thf = null;
		AST tt = null;
		AST ds = null;
		AST dsh = null;
		AST ex = null;
		
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TABLEHANDLE:
		{
			AST tmp522_AST_in = (AST)_t;
			match(_t,TABLEHANDLE);
			_t = _t.getNextSibling();
			thf = _t==ASTNULL ? null : (AST)_t;
			fld(_t,CQ.INIT);
			_t = _retTree;
			parameter_dataset_options(_t);
			_t = _retTree;
			if ( inputState.guessing==0 ) {
				action.paramSymbol(thf);
			}
			break;
		}
		case TABLE:
		{
			AST tmp523_AST_in = (AST)_t;
			match(_t,TABLE);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case FOR:
			{
				AST tmp524_AST_in = (AST)_t;
				match(_t,FOR);
				_t = _t.getNextSibling();
				break;
			}
			case RECORD_NAME:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			tt = _t==ASTNULL ? null : (AST)_t;
			tbl(_t,CQ.TEMPTABLESYMBOL);
			_t = _retTree;
			parameter_dataset_options(_t);
			_t = _retTree;
			if ( inputState.guessing==0 ) {
					action.paramProgressType(TEMPTABLE);
								action.paramSymbol(tt);
							
			}
			break;
		}
		case DATASET:
		{
			AST tmp525_AST_in = (AST)_t;
			match(_t,DATASET);
			_t = _t.getNextSibling();
			ds = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			parameter_dataset_options(_t);
			_t = _retTree;
			if ( inputState.guessing==0 ) {
					action.setSymbol(DATASET, ds);
								action.paramProgressType(DATASET);
								action.paramSymbol(ds);
							
			}
			break;
		}
		case DATASETHANDLE:
		{
			AST tmp526_AST_in = (AST)_t;
			match(_t,DATASETHANDLE);
			_t = _t.getNextSibling();
			dsh = _t==ASTNULL ? null : (AST)_t;
			fld(_t,CQ.INIT);
			_t = _retTree;
			parameter_dataset_options(_t);
			_t = _retTree;
			if ( inputState.guessing==0 ) {
				action.paramSymbol(dsh);
			}
			break;
		}
		case PARAMETER:
		{
			AST tmp527_AST_in = (AST)_t;
			match(_t,PARAMETER);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			AST tmp528_AST_in = (AST)_t;
			match(_t,EQUAL);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			if ( inputState.guessing==0 ) {
				action.paramProgressType(PARAMETER);
			}
			break;
		}
		case ID:
		{
			AST tmp529_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			AST tmp530_AST_in = (AST)_t;
			match(_t,AS);
			_t = _t.getNextSibling();
			if ( inputState.guessing==0 ) {
				action.paramNoName(_t);
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case CLASS:
			{
				AST tmp531_AST_in = (AST)_t;
				match(_t,CLASS);
				_t = _t.getNextSibling();
				AST tmp532_AST_in = (AST)_t;
				match(_t,TYPE_NAME);
				_t = _t.getNextSibling();
				break;
			}
			case FLOAT:
			case CURRENCY:
			case ERRORCODE:
			case IUNKNOWN:
			case SHORT:
			case UNSIGNEDBYTE:
			{
				datatype_com_native(_t);
				_t = _retTree;
				break;
			}
			case CHARACTER:
			case COMHANDLE:
			case DATE:
			case DECIMAL:
			case HANDLE:
			case INTEGER:
			case LOGICAL:
			case MEMPTR:
			case RAW:
			case RECID:
			case ROWID:
			case WIDGETHANDLE:
			case DATETIME:
			case DATETIMETZ:
			case LONGCHAR:
			case TYPE_NAME:
			case INT64:
			{
				datatype_var(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		default:
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_3.member(_t.getType()))) {
				ex = _t==ASTNULL ? null : (AST)_t;
				expression(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case AS:
				{
					AST tmp533_AST_in = (AST)_t;
					match(_t,AS);
					_t = _t.getNextSibling();
					datatype_com(_t);
					_t = _retTree;
					break;
				}
				case 3:
				case BYPOINTER:
				case BYVARIANTPOINTER:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				if ( inputState.guessing==0 ) {
					action.paramExpression(ex);
				}
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BYPOINTER:
		{
			AST tmp534_AST_in = (AST)_t;
			match(_t,BYPOINTER);
			_t = _t.getNextSibling();
			break;
		}
		case BYVARIANTPOINTER:
		{
			AST tmp535_AST_in = (AST)_t;
			match(_t,BYVARIANTPOINTER);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_retTree = _t;
	}
	
	public final void parameter_dataset_options(AST _t) throws RecognitionException {
		
		AST parameter_dataset_options_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case APPEND:
		{
			AST tmp536_AST_in = (AST)_t;
			match(_t,APPEND);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case BYPOINTER:
		case BYVARIANTPOINTER:
		case BYVALUE:
		case BYREFERENCE:
		case BIND:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BYVALUE:
		{
			AST tmp537_AST_in = (AST)_t;
			match(_t,BYVALUE);
			_t = _t.getNextSibling();
			break;
		}
		case BYREFERENCE:
		{
			AST tmp538_AST_in = (AST)_t;
			match(_t,BYREFERENCE);
			_t = _t.getNextSibling();
			break;
		}
		case BIND:
		{
			AST tmp539_AST_in = (AST)_t;
			match(_t,BIND);
			_t = _t.getNextSibling();
			if ( inputState.guessing==0 ) {
				action.paramBind();
			}
			break;
		}
		case 3:
		case BYPOINTER:
		case BYVARIANTPOINTER:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_retTree = _t;
	}
	
	public final void datatype_com_native(AST _t) throws RecognitionException {
		
		AST datatype_com_native_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case SHORT:
		{
			AST tmp540_AST_in = (AST)_t;
			match(_t,SHORT);
			_t = _t.getNextSibling();
			break;
		}
		case FLOAT:
		{
			AST tmp541_AST_in = (AST)_t;
			match(_t,FLOAT);
			_t = _t.getNextSibling();
			break;
		}
		case CURRENCY:
		{
			AST tmp542_AST_in = (AST)_t;
			match(_t,CURRENCY);
			_t = _t.getNextSibling();
			break;
		}
		case UNSIGNEDBYTE:
		{
			AST tmp543_AST_in = (AST)_t;
			match(_t,UNSIGNEDBYTE);
			_t = _t.getNextSibling();
			break;
		}
		case ERRORCODE:
		{
			AST tmp544_AST_in = (AST)_t;
			match(_t,ERRORCODE);
			_t = _t.getNextSibling();
			break;
		}
		case IUNKNOWN:
		{
			AST tmp545_AST_in = (AST)_t;
			match(_t,IUNKNOWN);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void datatype_var(AST _t) throws RecognitionException {
		
		AST datatype_var_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CHARACTER:
		{
			AST tmp546_AST_in = (AST)_t;
			match(_t,CHARACTER);
			_t = _t.getNextSibling();
			break;
		}
		case COMHANDLE:
		{
			AST tmp547_AST_in = (AST)_t;
			match(_t,COMHANDLE);
			_t = _t.getNextSibling();
			break;
		}
		case DATE:
		{
			AST tmp548_AST_in = (AST)_t;
			match(_t,DATE);
			_t = _t.getNextSibling();
			break;
		}
		case DATETIME:
		{
			AST tmp549_AST_in = (AST)_t;
			match(_t,DATETIME);
			_t = _t.getNextSibling();
			break;
		}
		case DATETIMETZ:
		{
			AST tmp550_AST_in = (AST)_t;
			match(_t,DATETIMETZ);
			_t = _t.getNextSibling();
			break;
		}
		case DECIMAL:
		{
			AST tmp551_AST_in = (AST)_t;
			match(_t,DECIMAL);
			_t = _t.getNextSibling();
			break;
		}
		case HANDLE:
		{
			AST tmp552_AST_in = (AST)_t;
			match(_t,HANDLE);
			_t = _t.getNextSibling();
			break;
		}
		case INTEGER:
		{
			AST tmp553_AST_in = (AST)_t;
			match(_t,INTEGER);
			_t = _t.getNextSibling();
			break;
		}
		case INT64:
		{
			AST tmp554_AST_in = (AST)_t;
			match(_t,INT64);
			_t = _t.getNextSibling();
			break;
		}
		case LOGICAL:
		{
			AST tmp555_AST_in = (AST)_t;
			match(_t,LOGICAL);
			_t = _t.getNextSibling();
			break;
		}
		case LONGCHAR:
		{
			AST tmp556_AST_in = (AST)_t;
			match(_t,LONGCHAR);
			_t = _t.getNextSibling();
			break;
		}
		case MEMPTR:
		{
			AST tmp557_AST_in = (AST)_t;
			match(_t,MEMPTR);
			_t = _t.getNextSibling();
			break;
		}
		case RAW:
		{
			AST tmp558_AST_in = (AST)_t;
			match(_t,RAW);
			_t = _t.getNextSibling();
			break;
		}
		case RECID:
		{
			AST tmp559_AST_in = (AST)_t;
			match(_t,RECID);
			_t = _t.getNextSibling();
			break;
		}
		case ROWID:
		{
			AST tmp560_AST_in = (AST)_t;
			match(_t,ROWID);
			_t = _t.getNextSibling();
			break;
		}
		case TYPE_NAME:
		{
			AST tmp561_AST_in = (AST)_t;
			match(_t,TYPE_NAME);
			_t = _t.getNextSibling();
			break;
		}
		case WIDGETHANDLE:
		{
			AST tmp562_AST_in = (AST)_t;
			match(_t,WIDGETHANDLE);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void datatype_com(AST _t) throws RecognitionException {
		
		AST datatype_com_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case INT64:
		{
			AST tmp563_AST_in = (AST)_t;
			match(_t,INT64);
			_t = _t.getNextSibling();
			break;
		}
		case FLOAT:
		case CURRENCY:
		case ERRORCODE:
		case IUNKNOWN:
		case SHORT:
		case UNSIGNEDBYTE:
		{
			datatype_com_native(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void filenameorvalue(AST _t) throws RecognitionException {
		
		AST filenameorvalue_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST exp = null;
		AST fn = null;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case VALUE:
		{
			AST __t91 = _t;
			AST tmp564_AST_in = (AST)_t;
			match(_t,VALUE);
			_t = _t.getFirstChild();
			AST tmp565_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			exp = _t==ASTNULL ? null : (AST)_t;
			expression(_t);
			_t = _retTree;
			AST tmp566_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t91;
			_t = _t.getNextSibling();
			if ( inputState.guessing==0 ) {
				action.fnvExpression(exp);
			}
			break;
		}
		case FILENAME:
		{
			fn = (AST)_t;
			match(_t,FILENAME);
			_t = _t.getNextSibling();
			if ( inputState.guessing==0 ) {
				action.fnvFilename(fn);
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void exprt(AST _t) throws RecognitionException {
		
		AST exprt_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST uf = null;
		AST lm = null;
		AST tn = null;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case LEFTPAREN:
		{
			AST __t93 = _t;
			AST tmp567_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			AST tmp568_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t93;
			_t = _t.getNextSibling();
			break;
		}
		case LEXDATE:
		case NUMBER:
		case QSTRING:
		case BIGENDIAN:
		case EXCLUSIVELOCK:
		case FALSE_KW:
		case FINDCASESENSITIVE:
		case FINDGLOBAL:
		case FINDNEXTOCCURRENCE:
		case FINDPREVOCCURRENCE:
		case FINDSELECT:
		case FINDWRAPAROUND:
		case HOSTBYTEORDER:
		case LITTLEENDIAN:
		case NO:
		case NOLOCK:
		case NOWAIT:
		case NULL_KW:
		case READAVAILABLE:
		case READEXACTNUM:
		case SEARCHSELF:
		case SEARCHTARGET:
		case SHARELOCK:
		case TRUE_KW:
		case WINDOWDELAYEDMINIMIZE:
		case WINDOWMAXIMIZED:
		case WINDOWMINIMIZED:
		case WINDOWNORMAL:
		case YES:
		case UNKNOWNVALUE:
		case FUNCTIONCALLTYPE:
		case GETATTRCALLTYPE:
		case PROCEDURECALLTYPE:
		case SAXCOMPLETE:
		case SAXPARSERERROR:
		case SAXRUNNING:
		case SAXUNINITIALIZED:
		case SETATTRCALLTYPE:
		case ROWUNMODIFIED:
		case ROWDELETED:
		case ROWMODIFIED:
		case ROWCREATED:
		{
			constant(_t);
			_t = _retTree;
			break;
		}
		case Widget_ref:
		{
			widattr(_t);
			_t = _retTree;
			break;
		}
		case USER_FUNC:
		{
			AST __t94 = _t;
			uf = _t==ASTNULL ? null :(AST)_t;
			match(_t,USER_FUNC);
			_t = _t.getFirstChild();
			if ( inputState.guessing==0 ) {
				action.callBegin(uf);
			}
			parameterlist_noroot(_t);
			_t = _retTree;
			if ( inputState.guessing==0 ) {
				action.callEnd();
			}
			_t = __t94;
			_t = _t.getNextSibling();
			break;
		}
		case LOCAL_METHOD_REF:
		{
			AST __t95 = _t;
			lm = _t==ASTNULL ? null :(AST)_t;
			match(_t,LOCAL_METHOD_REF);
			_t = _t.getFirstChild();
			if ( inputState.guessing==0 ) {
				action.callBegin(lm);
			}
			parameterlist_noroot(_t);
			_t = _retTree;
			if ( inputState.guessing==0 ) {
				action.callEnd();
			}
			_t = __t95;
			_t = _t.getNextSibling();
			break;
		}
		case Field_ref:
		{
			fld(_t,CQ.REF);
			_t = _retTree;
			break;
		}
		case Entered_func:
		{
			AST __t101 = _t;
			AST tmp569_AST_in = (AST)_t;
			match(_t,Entered_func);
			_t = _t.getFirstChild();
			fld(_t,CQ.SYMBOL);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOT:
			{
				AST tmp570_AST_in = (AST)_t;
				match(_t,NOT);
				_t = _t.getNextSibling();
				break;
			}
			case ENTERED:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp571_AST_in = (AST)_t;
			match(_t,ENTERED);
			_t = _t.getNextSibling();
			_t = __t101;
			_t = _t.getNextSibling();
			break;
		}
		case RECORD_NAME:
		{
			tbl(_t,CQ.REF);
			_t = _retTree;
			break;
		}
		default:
			boolean synPredMatched98 = false;
			if (_t==null) _t=ASTNULL;
			if (((_t.getType()==NEW))) {
				AST __t98 = _t;
				synPredMatched98 = true;
				inputState.guessing++;
				try {
					{
					AST __t97 = _t;
					AST tmp572_AST_in = (AST)_t;
					match(_t,NEW);
					_t = _t.getFirstChild();
					AST tmp573_AST_in = (AST)_t;
					match(_t,TYPE_NAME);
					_t = _t.getNextSibling();
					_t = __t97;
					_t = _t.getNextSibling();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched98 = false;
				}
				_t = __t98;
inputState.guessing--;
			}
			if ( synPredMatched98 ) {
				AST __t99 = _t;
				AST tmp574_AST_in = (AST)_t;
				match(_t,NEW);
				_t = _t.getFirstChild();
				tn = (AST)_t;
				match(_t,TYPE_NAME);
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
					action.callBegin(tn);
				}
				parameterlist(_t);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
					action.callEnd();
				}
				_t = __t99;
				_t = _t.getNextSibling();
			}
			else if ((_tokenSet_4.member(_t.getType()))) {
				{
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_5.member(_t.getType()))) {
					functioncall(_t);
					_t = _retTree;
				}
				else if ((_tokenSet_6.member(_t.getType()))) {
					systemhandlename(_t);
					_t = _retTree;
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void widattr(AST _t) throws RecognitionException {
		
		AST widattr_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST aname = null;
		
		AST __t104 = _t;
		AST tmp575_AST_in = (AST)_t;
		match(_t,Widget_ref);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==NORETURNVALUE)) {
			AST tmp576_AST_in = (AST)_t;
			match(_t,NORETURNVALUE);
			_t = _t.getNextSibling();
		}
		else if ((_tokenSet_7.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		boolean synPredMatched108 = false;
		if (_t==null) _t=ASTNULL;
		if (((_tokenSet_8.member(_t.getType())))) {
			AST __t108 = _t;
			synPredMatched108 = true;
			inputState.guessing++;
			try {
				{
				widname(_t);
				_t = _retTree;
				}
			}
			catch (RecognitionException pe) {
				synPredMatched108 = false;
			}
			_t = __t108;
inputState.guessing--;
		}
		if ( synPredMatched108 ) {
			widname(_t);
			_t = _retTree;
		}
		else if ((_tokenSet_1.member(_t.getType()))) {
			exprt(_t);
			_t = _retTree;
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		int _cnt113=0;
		_loop113:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==OBJCOLON||_t.getType()==DOUBLECOLON)) {
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case OBJCOLON:
				{
					AST tmp577_AST_in = (AST)_t;
					match(_t,OBJCOLON);
					_t = _t.getNextSibling();
					break;
				}
				case DOUBLECOLON:
				{
					AST tmp578_AST_in = (AST)_t;
					match(_t,DOUBLECOLON);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				aname = (AST)_t;
				if ( _t==null ) throw new MismatchedTokenException();
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Array_subscript:
				{
					array_subscript(_t);
					_t = _retTree;
					break;
				}
				case 3:
				case OBJCOLON:
				case AS:
				case IN_KW:
				case Method_param_list:
				case DOUBLECOLON:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Method_param_list:
				{
					if ( inputState.guessing==0 ) {
						action.callBegin(aname);
					}
					method_param_list(_t);
					_t = _retTree;
					if ( inputState.guessing==0 ) {
						action.callEnd();
					}
					break;
				}
				case 3:
				case OBJCOLON:
				case AS:
				case IN_KW:
				case DOUBLECOLON:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
			}
			else {
				if ( _cnt113>=1 ) { break _loop113; } else {throw new NoViableAltException(_t);}
			}
			
			_cnt113++;
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t115 = _t;
			AST tmp579_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case MENU:
			{
				AST tmp580_AST_in = (AST)_t;
				match(_t,MENU);
				_t = _t.getNextSibling();
				break;
			}
			case FRAME:
			{
				AST tmp581_AST_in = (AST)_t;
				match(_t,FRAME);
				_t = _t.getNextSibling();
				break;
			}
			case BROWSE:
			{
				AST tmp582_AST_in = (AST)_t;
				match(_t,BROWSE);
				_t = _t.getNextSibling();
				break;
			}
			case SUBMENU:
			{
				AST tmp583_AST_in = (AST)_t;
				match(_t,SUBMENU);
				_t = _t.getNextSibling();
				break;
			}
			case BUFFER:
			{
				AST tmp584_AST_in = (AST)_t;
				match(_t,BUFFER);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp585_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			_t = __t115;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case AS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AS:
		{
			AST tmp586_AST_in = (AST)_t;
			match(_t,AS);
			_t = _t.getNextSibling();
			AST tmp587_AST_in = (AST)_t;
			if ( _t==null ) throw new MismatchedTokenException();
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t104;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void parameterlist_noroot(AST _t) throws RecognitionException {
		
		AST parameterlist_noroot_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST tmp588_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BUFFER:
		case INPUT:
		case INPUTOUTPUT:
		case OUTPUT:
		{
			parameter(_t);
			_t = _retTree;
			break;
		}
		case COMMA:
		case RIGHTPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1607:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp589_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				parameter(_t);
				_t = _retTree;
			}
			else {
				break _loop1607;
			}
			
		} while (true);
		}
		AST tmp590_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void systemhandlename(AST _t) throws RecognitionException {
		
		AST systemhandlename_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AAMEMORY:
		{
			AST tmp591_AST_in = (AST)_t;
			match(_t,AAMEMORY);
			_t = _t.getNextSibling();
			break;
		}
		case ACTIVEWINDOW:
		{
			AST tmp592_AST_in = (AST)_t;
			match(_t,ACTIVEWINDOW);
			_t = _t.getNextSibling();
			break;
		}
		case AUDITCONTROL:
		{
			AST tmp593_AST_in = (AST)_t;
			match(_t,AUDITCONTROL);
			_t = _t.getNextSibling();
			break;
		}
		case AUDITPOLICY:
		{
			AST tmp594_AST_in = (AST)_t;
			match(_t,AUDITPOLICY);
			_t = _t.getNextSibling();
			break;
		}
		case CLIPBOARD:
		{
			AST tmp595_AST_in = (AST)_t;
			match(_t,CLIPBOARD);
			_t = _t.getNextSibling();
			break;
		}
		case CODEBASELOCATOR:
		{
			AST tmp596_AST_in = (AST)_t;
			match(_t,CODEBASELOCATOR);
			_t = _t.getNextSibling();
			break;
		}
		case COLORTABLE:
		{
			AST tmp597_AST_in = (AST)_t;
			match(_t,COLORTABLE);
			_t = _t.getNextSibling();
			break;
		}
		case COMPILER:
		{
			AST tmp598_AST_in = (AST)_t;
			match(_t,COMPILER);
			_t = _t.getNextSibling();
			break;
		}
		case COMSELF:
		{
			AST tmp599_AST_in = (AST)_t;
			match(_t,COMSELF);
			_t = _t.getNextSibling();
			break;
		}
		case CURRENTWINDOW:
		{
			AST tmp600_AST_in = (AST)_t;
			match(_t,CURRENTWINDOW);
			_t = _t.getNextSibling();
			break;
		}
		case DEBUGGER:
		{
			AST tmp601_AST_in = (AST)_t;
			match(_t,DEBUGGER);
			_t = _t.getNextSibling();
			break;
		}
		case DEFAULTWINDOW:
		{
			AST tmp602_AST_in = (AST)_t;
			match(_t,DEFAULTWINDOW);
			_t = _t.getNextSibling();
			break;
		}
		case ERRORSTATUS:
		{
			AST tmp603_AST_in = (AST)_t;
			match(_t,ERRORSTATUS);
			_t = _t.getNextSibling();
			break;
		}
		case FILEINFORMATION:
		{
			AST tmp604_AST_in = (AST)_t;
			match(_t,FILEINFORMATION);
			_t = _t.getNextSibling();
			break;
		}
		case FOCUS:
		{
			AST tmp605_AST_in = (AST)_t;
			match(_t,FOCUS);
			_t = _t.getNextSibling();
			break;
		}
		case FONTTABLE:
		{
			AST tmp606_AST_in = (AST)_t;
			match(_t,FONTTABLE);
			_t = _t.getNextSibling();
			break;
		}
		case LASTEVENT:
		{
			AST tmp607_AST_in = (AST)_t;
			match(_t,LASTEVENT);
			_t = _t.getNextSibling();
			break;
		}
		case LOGMANAGER:
		{
			AST tmp608_AST_in = (AST)_t;
			match(_t,LOGMANAGER);
			_t = _t.getNextSibling();
			break;
		}
		case MOUSE:
		{
			AST tmp609_AST_in = (AST)_t;
			match(_t,MOUSE);
			_t = _t.getNextSibling();
			break;
		}
		case PROFILER:
		{
			AST tmp610_AST_in = (AST)_t;
			match(_t,PROFILER);
			_t = _t.getNextSibling();
			break;
		}
		case RCODEINFORMATION:
		{
			AST tmp611_AST_in = (AST)_t;
			match(_t,RCODEINFORMATION);
			_t = _t.getNextSibling();
			break;
		}
		case SECURITYPOLICY:
		{
			AST tmp612_AST_in = (AST)_t;
			match(_t,SECURITYPOLICY);
			_t = _t.getNextSibling();
			break;
		}
		case SELF:
		{
			AST tmp613_AST_in = (AST)_t;
			match(_t,SELF);
			_t = _t.getNextSibling();
			break;
		}
		case SESSION:
		{
			AST tmp614_AST_in = (AST)_t;
			match(_t,SESSION);
			_t = _t.getNextSibling();
			break;
		}
		case SOURCEPROCEDURE:
		{
			AST tmp615_AST_in = (AST)_t;
			match(_t,SOURCEPROCEDURE);
			_t = _t.getNextSibling();
			break;
		}
		case SUPER:
		{
			AST tmp616_AST_in = (AST)_t;
			match(_t,SUPER);
			_t = _t.getNextSibling();
			break;
		}
		case TARGETPROCEDURE:
		{
			AST tmp617_AST_in = (AST)_t;
			match(_t,TARGETPROCEDURE);
			_t = _t.getNextSibling();
			break;
		}
		case TEXTCURSOR:
		{
			AST tmp618_AST_in = (AST)_t;
			match(_t,TEXTCURSOR);
			_t = _t.getNextSibling();
			break;
		}
		case THISOBJECT:
		{
			AST tmp619_AST_in = (AST)_t;
			match(_t,THISOBJECT);
			_t = _t.getNextSibling();
			break;
		}
		case THISPROCEDURE:
		{
			AST tmp620_AST_in = (AST)_t;
			match(_t,THISPROCEDURE);
			_t = _t.getNextSibling();
			break;
		}
		case WEBCONTEXT:
		{
			AST tmp621_AST_in = (AST)_t;
			match(_t,WEBCONTEXT);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void widname(AST _t) throws RecognitionException {
		
		AST widname_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST f = null;
		AST b = null;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AAMEMORY:
		case ACTIVEWINDOW:
		case CLIPBOARD:
		case CODEBASELOCATOR:
		case COLORTABLE:
		case COMPILER:
		case COMSELF:
		case CURRENTWINDOW:
		case DEBUGGER:
		case DEFAULTWINDOW:
		case ERRORSTATUS:
		case FILEINFORMATION:
		case FOCUS:
		case FONTTABLE:
		case LASTEVENT:
		case MOUSE:
		case PROFILER:
		case RCODEINFORMATION:
		case SELF:
		case SESSION:
		case SOURCEPROCEDURE:
		case SUPER:
		case TARGETPROCEDURE:
		case TEXTCURSOR:
		case THISPROCEDURE:
		case WEBCONTEXT:
		case LOGMANAGER:
		case SECURITYPOLICY:
		case AUDITCONTROL:
		case AUDITPOLICY:
		case THISOBJECT:
		{
			systemhandlename(_t);
			_t = _retTree;
			break;
		}
		case DATASET:
		{
			AST tmp622_AST_in = (AST)_t;
			match(_t,DATASET);
			_t = _t.getNextSibling();
			AST tmp623_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case DATASOURCE:
		{
			AST tmp624_AST_in = (AST)_t;
			match(_t,DATASOURCE);
			_t = _t.getNextSibling();
			AST tmp625_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case FIELD:
		{
			AST tmp626_AST_in = (AST)_t;
			match(_t,FIELD);
			_t = _t.getNextSibling();
			fld(_t,CQ.REF);
			_t = _retTree;
			break;
		}
		case FRAME:
		{
			AST tmp627_AST_in = (AST)_t;
			match(_t,FRAME);
			_t = _t.getNextSibling();
			f = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			if ( inputState.guessing==0 ) {
				action.frameRef(f);
			}
			break;
		}
		case MENU:
		{
			AST tmp628_AST_in = (AST)_t;
			match(_t,MENU);
			_t = _t.getNextSibling();
			AST tmp629_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case SUBMENU:
		{
			AST tmp630_AST_in = (AST)_t;
			match(_t,SUBMENU);
			_t = _t.getNextSibling();
			AST tmp631_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case MENUITEM:
		{
			AST tmp632_AST_in = (AST)_t;
			match(_t,MENUITEM);
			_t = _t.getNextSibling();
			AST tmp633_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case BROWSE:
		{
			AST tmp634_AST_in = (AST)_t;
			match(_t,BROWSE);
			_t = _t.getNextSibling();
			b = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			if ( inputState.guessing==0 ) {
				action.browseRef(b);
			}
			break;
		}
		case QUERY:
		{
			AST tmp635_AST_in = (AST)_t;
			match(_t,QUERY);
			_t = _t.getNextSibling();
			AST tmp636_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case TEMPTABLE:
		{
			AST tmp637_AST_in = (AST)_t;
			match(_t,TEMPTABLE);
			_t = _t.getNextSibling();
			AST tmp638_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case BUFFER:
		{
			AST tmp639_AST_in = (AST)_t;
			match(_t,BUFFER);
			_t = _t.getNextSibling();
			AST tmp640_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case XDOCUMENT:
		{
			AST tmp641_AST_in = (AST)_t;
			match(_t,XDOCUMENT);
			_t = _t.getNextSibling();
			AST tmp642_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case XNODEREF:
		{
			AST tmp643_AST_in = (AST)_t;
			match(_t,XNODEREF);
			_t = _t.getNextSibling();
			AST tmp644_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case SOCKET:
		{
			AST tmp645_AST_in = (AST)_t;
			match(_t,SOCKET);
			_t = _t.getNextSibling();
			AST tmp646_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void array_subscript(AST _t) throws RecognitionException {
		
		AST array_subscript_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1653 = _t;
		AST tmp647_AST_in = (AST)_t;
		match(_t,Array_subscript);
		_t = _t.getFirstChild();
		AST tmp648_AST_in = (AST)_t;
		match(_t,LEFTBRACE);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FOR:
		{
			AST tmp649_AST_in = (AST)_t;
			match(_t,FOR);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			break;
		}
		case RIGHTBRACE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp650_AST_in = (AST)_t;
		match(_t,RIGHTBRACE);
		_t = _t.getNextSibling();
		_t = __t1653;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void method_param_list(AST _t) throws RecognitionException {
		
		AST method_param_list_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1656 = _t;
		AST tmp651_AST_in = (AST)_t;
		match(_t,Method_param_list);
		_t = _t.getFirstChild();
		AST tmp652_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BUFFER:
		case INPUT:
		case INPUTOUTPUT:
		case OUTPUT:
		{
			parameter(_t);
			_t = _retTree;
			break;
		}
		case COMMA:
		case RIGHTPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1660:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp653_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case BUFFER:
				case INPUT:
				case INPUTOUTPUT:
				case OUTPUT:
				{
					parameter(_t);
					_t = _retTree;
					break;
				}
				case COMMA:
				case RIGHTPAREN:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
			}
			else {
				break _loop1660;
			}
			
		} while (true);
		}
		AST tmp654_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t1656;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void gwidget(AST _t) throws RecognitionException {
		
		AST gwidget_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST f = null;
		AST b = null;
		
		AST __t119 = _t;
		AST tmp655_AST_in = (AST)_t;
		match(_t,Widget_ref);
		_t = _t.getFirstChild();
		s_widget(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t121 = _t;
			AST tmp656_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case MENU:
			{
				AST tmp657_AST_in = (AST)_t;
				match(_t,MENU);
				_t = _t.getNextSibling();
				AST tmp658_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				break;
			}
			case FRAME:
			{
				AST tmp659_AST_in = (AST)_t;
				match(_t,FRAME);
				_t = _t.getNextSibling();
				f = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
					action.frameRef(f);
				}
				break;
			}
			case BROWSE:
			{
				AST tmp660_AST_in = (AST)_t;
				match(_t,BROWSE);
				_t = _t.getNextSibling();
				b = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
					action.browseRef(b);
				}
				break;
			}
			case SUBMENU:
			{
				AST tmp661_AST_in = (AST)_t;
				match(_t,SUBMENU);
				_t = _t.getNextSibling();
				AST tmp662_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				break;
			}
			case BUFFER:
			{
				AST tmp663_AST_in = (AST)_t;
				match(_t,BUFFER);
				_t = _t.getNextSibling();
				AST tmp664_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t121;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t119;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void s_widget(AST _t) throws RecognitionException {
		
		AST s_widget_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AAMEMORY:
		case ACTIVEWINDOW:
		case BROWSE:
		case BUFFER:
		case CLIPBOARD:
		case CODEBASELOCATOR:
		case COLORTABLE:
		case COMPILER:
		case COMSELF:
		case CURRENTWINDOW:
		case DEBUGGER:
		case DEFAULTWINDOW:
		case ERRORSTATUS:
		case FIELD:
		case FILEINFORMATION:
		case FOCUS:
		case FONTTABLE:
		case FRAME:
		case LASTEVENT:
		case MENU:
		case MENUITEM:
		case MOUSE:
		case PROFILER:
		case QUERY:
		case RCODEINFORMATION:
		case SELF:
		case SESSION:
		case SOCKET:
		case SOURCEPROCEDURE:
		case SUBMENU:
		case SUPER:
		case TARGETPROCEDURE:
		case TEMPTABLE:
		case TEXTCURSOR:
		case THISPROCEDURE:
		case WEBCONTEXT:
		case XDOCUMENT:
		case XNODEREF:
		case DATASOURCE:
		case DATASET:
		case LOGMANAGER:
		case SECURITYPOLICY:
		case AUDITCONTROL:
		case AUDITPOLICY:
		case THISOBJECT:
		{
			widname(_t);
			_t = _retTree;
			break;
		}
		case Field_ref:
		{
			fld(_t,CQ.REF);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void frame_ref(AST _t) throws RecognitionException {
		
		AST frame_ref_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST f = null;
		
		AST __t855 = _t;
		AST tmp665_AST_in = (AST)_t;
		match(_t,FRAME);
		_t = _t.getFirstChild();
		f = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		_t = __t855;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.frameRef(f);
		}
		_retTree = _t;
	}
	
	public final void browse_ref(AST _t) throws RecognitionException {
		
		AST browse_ref_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST i = null;
		
		AST __t181 = _t;
		AST tmp666_AST_in = (AST)_t;
		match(_t,BROWSE);
		_t = _t.getFirstChild();
		i = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		_t = __t181;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.browseRef(i);
		}
		_retTree = _t;
	}
	
	public final void fld1(AST _t,
		int contextQualifier
	) throws RecognitionException {
		
		AST fld1_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST ref = null;
		AST id = null;
		
		AST __t132 = _t;
		ref = _t==ASTNULL ? null :(AST)_t;
		match(_t,Field_ref);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case INPUT:
		{
			AST tmp667_AST_in = (AST)_t;
			match(_t,INPUT);
			_t = _t.getNextSibling();
			break;
		}
		case BROWSE:
		case FRAME:
		case ID:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FRAME:
		{
			frame_ref(_t);
			_t = _retTree;
			break;
		}
		case BROWSE:
		{
			browse_ref(_t);
			_t = _retTree;
			break;
		}
		case ID:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Array_subscript:
		{
			array_subscript(_t);
			_t = _retTree;
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t132;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.field(ref, id, contextQualifier, 1);
		}
		_retTree = _t;
	}
	
	public final void fld2(AST _t,
		int contextQualifier
	) throws RecognitionException {
		
		AST fld2_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST ref = null;
		AST id = null;
		
		AST __t137 = _t;
		ref = _t==ASTNULL ? null :(AST)_t;
		match(_t,Field_ref);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case INPUT:
		{
			AST tmp668_AST_in = (AST)_t;
			match(_t,INPUT);
			_t = _t.getNextSibling();
			break;
		}
		case BROWSE:
		case FRAME:
		case ID:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FRAME:
		{
			frame_ref(_t);
			_t = _retTree;
			break;
		}
		case BROWSE:
		{
			browse_ref(_t);
			_t = _retTree;
			break;
		}
		case ID:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Array_subscript:
		{
			array_subscript(_t);
			_t = _retTree;
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t137;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.field(ref, id, contextQualifier, 2);
		}
		_retTree = _t;
	}
	
	public final void aggregate_opt(AST _t) throws RecognitionException {
		
		AST aggregate_opt_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST id1 = null;
		AST id2 = null;
		AST id3 = null;
		AST id4 = null;
		AST id5 = null;
		AST id6 = null;
		AST id7 = null;
		AST id8 = null;
		AST id9 = null;
		AST id10 = null;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AVERAGE:
		{
			AST __t142 = _t;
			id1 = _t==ASTNULL ? null :(AST)_t;
			match(_t,AVERAGE);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.addToSymbolScope(action.defineVariable(id1, id1, DECIMAL));
			}
			_t = __t142;
			_t = _t.getNextSibling();
			break;
		}
		case COUNT:
		{
			AST __t144 = _t;
			id2 = _t==ASTNULL ? null :(AST)_t;
			match(_t,COUNT);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.addToSymbolScope(action.defineVariable(id2, id2, INTEGER));
			}
			_t = __t144;
			_t = _t.getNextSibling();
			break;
		}
		case MAXIMUM:
		{
			AST __t146 = _t;
			id3 = _t==ASTNULL ? null :(AST)_t;
			match(_t,MAXIMUM);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.addToSymbolScope(action.defineVariable(id3, id3, DECIMAL));
			}
			_t = __t146;
			_t = _t.getNextSibling();
			break;
		}
		case MINIMUM:
		{
			AST __t148 = _t;
			id4 = _t==ASTNULL ? null :(AST)_t;
			match(_t,MINIMUM);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.addToSymbolScope(action.defineVariable(id4, id4, DECIMAL));
			}
			_t = __t148;
			_t = _t.getNextSibling();
			break;
		}
		case TOTAL:
		{
			AST __t150 = _t;
			id5 = _t==ASTNULL ? null :(AST)_t;
			match(_t,TOTAL);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.addToSymbolScope(action.defineVariable(id5, id5, DECIMAL));
			}
			_t = __t150;
			_t = _t.getNextSibling();
			break;
		}
		case SUBAVERAGE:
		{
			AST __t152 = _t;
			id6 = _t==ASTNULL ? null :(AST)_t;
			match(_t,SUBAVERAGE);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.addToSymbolScope(action.defineVariable(id6, id6, DECIMAL));
			}
			_t = __t152;
			_t = _t.getNextSibling();
			break;
		}
		case SUBCOUNT:
		{
			AST __t154 = _t;
			id7 = _t==ASTNULL ? null :(AST)_t;
			match(_t,SUBCOUNT);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.addToSymbolScope(action.defineVariable(id7, id7, DECIMAL));
			}
			_t = __t154;
			_t = _t.getNextSibling();
			break;
		}
		case SUBMAXIMUM:
		{
			AST __t156 = _t;
			id8 = _t==ASTNULL ? null :(AST)_t;
			match(_t,SUBMAXIMUM);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.addToSymbolScope(action.defineVariable(id8, id8, DECIMAL));
			}
			_t = __t156;
			_t = _t.getNextSibling();
			break;
		}
		case SUBMINIMUM:
		{
			AST __t158 = _t;
			id9 = _t==ASTNULL ? null :(AST)_t;
			match(_t,SUBMINIMUM);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.addToSymbolScope(action.defineVariable(id9, id9, DECIMAL));
			}
			_t = __t158;
			_t = _t.getNextSibling();
			break;
		}
		case SUBTOTAL:
		{
			AST __t160 = _t;
			id10 = _t==ASTNULL ? null :(AST)_t;
			match(_t,SUBTOTAL);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.addToSymbolScope(action.defineVariable(id10, id10, DECIMAL));
			}
			_t = __t160;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void label_constant(AST _t) throws RecognitionException {
		
		AST label_constant_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case COLUMNLABEL:
		{
			AST __t2090 = _t;
			AST tmp669_AST_in = (AST)_t;
			match(_t,COLUMNLABEL);
			_t = _t.getFirstChild();
			constant(_t);
			_t = _retTree;
			{
			_loop2092:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA)) {
					AST tmp670_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
					constant(_t);
					_t = _retTree;
				}
				else {
					break _loop2092;
				}
				
			} while (true);
			}
			_t = __t2090;
			_t = _t.getNextSibling();
			break;
		}
		case LABEL:
		{
			AST __t2093 = _t;
			AST tmp671_AST_in = (AST)_t;
			match(_t,LABEL);
			_t = _t.getFirstChild();
			constant(_t);
			_t = _retTree;
			{
			_loop2095:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA)) {
					AST tmp672_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
					constant(_t);
					_t = _retTree;
				}
				else {
					break _loop2095;
				}
				
			} while (true);
			}
			_t = __t2093;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void assignment_list(AST _t) throws RecognitionException {
		
		AST assignment_list_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RECORD_NAME:
		{
			tbl(_t,CQ.UPDATING);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case EXCEPT:
			{
				AST __t164 = _t;
				AST tmp673_AST_in = (AST)_t;
				match(_t,EXCEPT);
				_t = _t.getFirstChild();
				{
				_loop166:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==Field_ref)) {
						fld1(_t,CQ.SYMBOL);
						_t = _retTree;
					}
					else {
						break _loop166;
					}
					
				} while (true);
				}
				_t = __t164;
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case 3:
			case PERIOD:
			case NOERROR_KW:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		case EOF:
		case 3:
		case PERIOD:
		case NOERROR_KW:
		case EQUAL:
		case Assign_from_buffer:
		{
			{
			_loop173:
			do {
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EQUAL:
				{
					assign_equal(_t);
					_t = _retTree;
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case WHEN:
					{
						AST __t169 = _t;
						AST tmp674_AST_in = (AST)_t;
						match(_t,WHEN);
						_t = _t.getFirstChild();
						expression(_t);
						_t = _retTree;
						_t = __t169;
						_t = _t.getNextSibling();
						break;
					}
					case EOF:
					case 3:
					case PERIOD:
					case NOERROR_KW:
					case EQUAL:
					case Assign_from_buffer:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					break;
				}
				case Assign_from_buffer:
				{
					AST __t170 = _t;
					AST tmp675_AST_in = (AST)_t;
					match(_t,Assign_from_buffer);
					_t = _t.getFirstChild();
					fld(_t,CQ.UPDATING);
					_t = _retTree;
					_t = __t170;
					_t = _t.getNextSibling();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case WHEN:
					{
						AST __t172 = _t;
						AST tmp676_AST_in = (AST)_t;
						match(_t,WHEN);
						_t = _t.getFirstChild();
						expression(_t);
						_t = _retTree;
						_t = __t172;
						_t = _t.getNextSibling();
						break;
					}
					case EOF:
					case 3:
					case PERIOD:
					case NOERROR_KW:
					case EQUAL:
					case Assign_from_buffer:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					break;
				}
				default:
				{
					break _loop173;
				}
				}
			} while (true);
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void assign_equal(AST _t) throws RecognitionException {
		
		AST assign_equal_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t175 = _t;
		AST tmp677_AST_in = (AST)_t;
		match(_t,EQUAL);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AACONTROL:
		case AAMSG:
		case AAPCONTROL:
		case AASERIAL:
		case COMSELF:
		case CURRENTLANGUAGE:
		case CURRENTVALUE:
		case CURRENTWINDOW:
		case CURSOR:
		case DATASERVERS:
		case DBNAME:
		case ENTRY:
		case ETIME_KW:
		case EXTENT:
		case FRAMECOL:
		case FRAMEDB:
		case FRAMEDOWN:
		case FRAMEFIELD:
		case FRAMEFILE:
		case FRAMEINDEX:
		case FRAMELINE:
		case FRAMENAME:
		case FRAMEROW:
		case FRAMEVALUE:
		case GETCODEPAGES:
		case GOPENDING:
		case ISATTRSPACE:
		case LASTKEY:
		case LENGTH:
		case LINECOUNTER:
		case MACHINECLASS:
		case MESSAGELINES:
		case NEXTVALUE:
		case NUMALIASES:
		case NUMDBS:
		case OPSYS:
		case OSDRIVES:
		case OSERROR:
		case OVERLAY:
		case PAGENUMBER:
		case PAGESIZE_KW:
		case PROCHANDLE:
		case PROCSTATUS:
		case PROGRESS:
		case PROMSGS:
		case PROPATH:
		case PROVERSION:
		case PUTBITS:
		case PUTBYTE:
		case PUTBYTES:
		case PUTDOUBLE:
		case PUTFLOAT:
		case PUTLONG:
		case PUTSHORT:
		case PUTSTRING:
		case PUTUNSIGNEDSHORT:
		case RAW:
		case RETRY:
		case RETURNVALUE:
		case SCREENLINES:
		case SETBYTEORDER:
		case SETPOINTERVALUE:
		case SETSIZE:
		case SUBSTRING:
		case TERMINAL:
		case TIME:
		case TRANSACTION:
		case USERID:
		case Widget_ref:
		case DYNAMICCURRENTVALUE:
		case FIXCODEPAGE:
		case PUTINT64:
		case PUTUNSIGNEDLONG:
		{
			pseudfn(_t);
			_t = _retTree;
			break;
		}
		case Field_ref:
		{
			fld(_t,CQ.UPDATING);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		expression(_t);
		_t = _retTree;
		_t = __t175;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void pseudfn(AST _t) throws RecognitionException {
		
		AST pseudfn_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXTENT:
		{
			AST __t1443 = _t;
			AST tmp678_AST_in = (AST)_t;
			match(_t,EXTENT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1443;
			_t = _t.getNextSibling();
			break;
		}
		case FIXCODEPAGE:
		{
			AST __t1444 = _t;
			AST tmp679_AST_in = (AST)_t;
			match(_t,FIXCODEPAGE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1444;
			_t = _t.getNextSibling();
			break;
		}
		case OVERLAY:
		{
			AST __t1445 = _t;
			AST tmp680_AST_in = (AST)_t;
			match(_t,OVERLAY);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1445;
			_t = _t.getNextSibling();
			break;
		}
		case PUTBITS:
		{
			AST __t1446 = _t;
			AST tmp681_AST_in = (AST)_t;
			match(_t,PUTBITS);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1446;
			_t = _t.getNextSibling();
			break;
		}
		case PUTBYTE:
		{
			AST __t1447 = _t;
			AST tmp682_AST_in = (AST)_t;
			match(_t,PUTBYTE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1447;
			_t = _t.getNextSibling();
			break;
		}
		case PUTBYTES:
		{
			AST __t1448 = _t;
			AST tmp683_AST_in = (AST)_t;
			match(_t,PUTBYTES);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1448;
			_t = _t.getNextSibling();
			break;
		}
		case PUTDOUBLE:
		{
			AST __t1449 = _t;
			AST tmp684_AST_in = (AST)_t;
			match(_t,PUTDOUBLE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1449;
			_t = _t.getNextSibling();
			break;
		}
		case PUTFLOAT:
		{
			AST __t1450 = _t;
			AST tmp685_AST_in = (AST)_t;
			match(_t,PUTFLOAT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1450;
			_t = _t.getNextSibling();
			break;
		}
		case PUTINT64:
		{
			AST __t1451 = _t;
			AST tmp686_AST_in = (AST)_t;
			match(_t,PUTINT64);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1451;
			_t = _t.getNextSibling();
			break;
		}
		case PUTLONG:
		{
			AST __t1452 = _t;
			AST tmp687_AST_in = (AST)_t;
			match(_t,PUTLONG);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1452;
			_t = _t.getNextSibling();
			break;
		}
		case PUTSHORT:
		{
			AST __t1453 = _t;
			AST tmp688_AST_in = (AST)_t;
			match(_t,PUTSHORT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1453;
			_t = _t.getNextSibling();
			break;
		}
		case PUTSTRING:
		{
			AST __t1454 = _t;
			AST tmp689_AST_in = (AST)_t;
			match(_t,PUTSTRING);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1454;
			_t = _t.getNextSibling();
			break;
		}
		case PUTUNSIGNEDLONG:
		{
			AST __t1455 = _t;
			AST tmp690_AST_in = (AST)_t;
			match(_t,PUTUNSIGNEDLONG);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1455;
			_t = _t.getNextSibling();
			break;
		}
		case PUTUNSIGNEDSHORT:
		{
			AST __t1456 = _t;
			AST tmp691_AST_in = (AST)_t;
			match(_t,PUTUNSIGNEDSHORT);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1456;
			_t = _t.getNextSibling();
			break;
		}
		case SETBYTEORDER:
		{
			AST __t1457 = _t;
			AST tmp692_AST_in = (AST)_t;
			match(_t,SETBYTEORDER);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1457;
			_t = _t.getNextSibling();
			break;
		}
		case SETPOINTERVALUE:
		{
			AST __t1458 = _t;
			AST tmp693_AST_in = (AST)_t;
			match(_t,SETPOINTERVALUE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1458;
			_t = _t.getNextSibling();
			break;
		}
		case SETSIZE:
		{
			AST __t1459 = _t;
			AST tmp694_AST_in = (AST)_t;
			match(_t,SETSIZE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t1459;
			_t = _t.getNextSibling();
			break;
		}
		case AAMSG:
		{
			AST tmp695_AST_in = (AST)_t;
			match(_t,AAMSG);
			_t = _t.getNextSibling();
			break;
		}
		case CURRENTVALUE:
		{
			currentvaluefunc(_t);
			_t = _retTree;
			break;
		}
		case CURRENTWINDOW:
		{
			AST tmp696_AST_in = (AST)_t;
			match(_t,CURRENTWINDOW);
			_t = _t.getNextSibling();
			break;
		}
		case DYNAMICCURRENTVALUE:
		{
			dynamiccurrentvaluefunc(_t);
			_t = _retTree;
			break;
		}
		case ENTRY:
		{
			entryfunc(_t);
			_t = _retTree;
			break;
		}
		case LENGTH:
		{
			lengthfunc(_t);
			_t = _retTree;
			break;
		}
		case NEXTVALUE:
		{
			nextvaluefunc(_t);
			_t = _retTree;
			break;
		}
		case RAW:
		{
			rawfunc(_t);
			_t = _retTree;
			break;
		}
		case SUBSTRING:
		{
			substringfunc(_t);
			_t = _retTree;
			break;
		}
		case Widget_ref:
		{
			widattr(_t);
			_t = _retTree;
			break;
		}
		case PAGESIZE_KW:
		{
			AST tmp697_AST_in = (AST)_t;
			match(_t,PAGESIZE_KW);
			_t = _t.getNextSibling();
			break;
		}
		case LINECOUNTER:
		{
			AST tmp698_AST_in = (AST)_t;
			match(_t,LINECOUNTER);
			_t = _t.getNextSibling();
			break;
		}
		case PAGENUMBER:
		{
			AST tmp699_AST_in = (AST)_t;
			match(_t,PAGENUMBER);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMECOL:
		{
			AST tmp700_AST_in = (AST)_t;
			match(_t,FRAMECOL);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEDOWN:
		{
			AST tmp701_AST_in = (AST)_t;
			match(_t,FRAMEDOWN);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMELINE:
		{
			AST tmp702_AST_in = (AST)_t;
			match(_t,FRAMELINE);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEROW:
		{
			AST tmp703_AST_in = (AST)_t;
			match(_t,FRAMEROW);
			_t = _t.getNextSibling();
			break;
		}
		case USERID:
		{
			AST tmp704_AST_in = (AST)_t;
			match(_t,USERID);
			_t = _t.getNextSibling();
			break;
		}
		case ETIME_KW:
		{
			AST tmp705_AST_in = (AST)_t;
			match(_t,ETIME_KW);
			_t = _t.getNextSibling();
			break;
		}
		case DBNAME:
		{
			AST tmp706_AST_in = (AST)_t;
			match(_t,DBNAME);
			_t = _t.getNextSibling();
			break;
		}
		case TIME:
		{
			AST tmp707_AST_in = (AST)_t;
			match(_t,TIME);
			_t = _t.getNextSibling();
			break;
		}
		case OPSYS:
		{
			AST tmp708_AST_in = (AST)_t;
			match(_t,OPSYS);
			_t = _t.getNextSibling();
			break;
		}
		case RETRY:
		{
			AST tmp709_AST_in = (AST)_t;
			match(_t,RETRY);
			_t = _t.getNextSibling();
			break;
		}
		case AASERIAL:
		{
			AST tmp710_AST_in = (AST)_t;
			match(_t,AASERIAL);
			_t = _t.getNextSibling();
			break;
		}
		case AACONTROL:
		{
			AST tmp711_AST_in = (AST)_t;
			match(_t,AACONTROL);
			_t = _t.getNextSibling();
			break;
		}
		case MESSAGELINES:
		{
			AST tmp712_AST_in = (AST)_t;
			match(_t,MESSAGELINES);
			_t = _t.getNextSibling();
			break;
		}
		case TERMINAL:
		{
			AST tmp713_AST_in = (AST)_t;
			match(_t,TERMINAL);
			_t = _t.getNextSibling();
			break;
		}
		case PROPATH:
		{
			AST tmp714_AST_in = (AST)_t;
			match(_t,PROPATH);
			_t = _t.getNextSibling();
			break;
		}
		case CURRENTLANGUAGE:
		{
			AST tmp715_AST_in = (AST)_t;
			match(_t,CURRENTLANGUAGE);
			_t = _t.getNextSibling();
			break;
		}
		case PROMSGS:
		{
			AST tmp716_AST_in = (AST)_t;
			match(_t,PROMSGS);
			_t = _t.getNextSibling();
			break;
		}
		case SCREENLINES:
		{
			AST tmp717_AST_in = (AST)_t;
			match(_t,SCREENLINES);
			_t = _t.getNextSibling();
			break;
		}
		case LASTKEY:
		{
			AST tmp718_AST_in = (AST)_t;
			match(_t,LASTKEY);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEFIELD:
		{
			AST tmp719_AST_in = (AST)_t;
			match(_t,FRAMEFIELD);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEFILE:
		{
			AST tmp720_AST_in = (AST)_t;
			match(_t,FRAMEFILE);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEVALUE:
		{
			AST tmp721_AST_in = (AST)_t;
			match(_t,FRAMEVALUE);
			_t = _t.getNextSibling();
			break;
		}
		case GOPENDING:
		{
			AST tmp722_AST_in = (AST)_t;
			match(_t,GOPENDING);
			_t = _t.getNextSibling();
			break;
		}
		case PROGRESS:
		{
			AST tmp723_AST_in = (AST)_t;
			match(_t,PROGRESS);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEINDEX:
		{
			AST tmp724_AST_in = (AST)_t;
			match(_t,FRAMEINDEX);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMEDB:
		{
			AST tmp725_AST_in = (AST)_t;
			match(_t,FRAMEDB);
			_t = _t.getNextSibling();
			break;
		}
		case FRAMENAME:
		{
			AST tmp726_AST_in = (AST)_t;
			match(_t,FRAMENAME);
			_t = _t.getNextSibling();
			break;
		}
		case DATASERVERS:
		{
			AST tmp727_AST_in = (AST)_t;
			match(_t,DATASERVERS);
			_t = _t.getNextSibling();
			break;
		}
		case NUMDBS:
		{
			AST tmp728_AST_in = (AST)_t;
			match(_t,NUMDBS);
			_t = _t.getNextSibling();
			break;
		}
		case NUMALIASES:
		{
			AST tmp729_AST_in = (AST)_t;
			match(_t,NUMALIASES);
			_t = _t.getNextSibling();
			break;
		}
		case ISATTRSPACE:
		{
			AST tmp730_AST_in = (AST)_t;
			match(_t,ISATTRSPACE);
			_t = _t.getNextSibling();
			break;
		}
		case PROCSTATUS:
		{
			AST tmp731_AST_in = (AST)_t;
			match(_t,PROCSTATUS);
			_t = _t.getNextSibling();
			break;
		}
		case PROCHANDLE:
		{
			AST tmp732_AST_in = (AST)_t;
			match(_t,PROCHANDLE);
			_t = _t.getNextSibling();
			break;
		}
		case CURSOR:
		{
			AST tmp733_AST_in = (AST)_t;
			match(_t,CURSOR);
			_t = _t.getNextSibling();
			break;
		}
		case OSERROR:
		{
			AST tmp734_AST_in = (AST)_t;
			match(_t,OSERROR);
			_t = _t.getNextSibling();
			break;
		}
		case RETURNVALUE:
		{
			AST tmp735_AST_in = (AST)_t;
			match(_t,RETURNVALUE);
			_t = _t.getNextSibling();
			break;
		}
		case OSDRIVES:
		{
			AST tmp736_AST_in = (AST)_t;
			match(_t,OSDRIVES);
			_t = _t.getNextSibling();
			break;
		}
		case PROVERSION:
		{
			AST tmp737_AST_in = (AST)_t;
			match(_t,PROVERSION);
			_t = _t.getNextSibling();
			break;
		}
		case TRANSACTION:
		{
			AST tmp738_AST_in = (AST)_t;
			match(_t,TRANSACTION);
			_t = _t.getNextSibling();
			break;
		}
		case MACHINECLASS:
		{
			AST tmp739_AST_in = (AST)_t;
			match(_t,MACHINECLASS);
			_t = _t.getNextSibling();
			break;
		}
		case AAPCONTROL:
		{
			AST tmp740_AST_in = (AST)_t;
			match(_t,AAPCONTROL);
			_t = _t.getNextSibling();
			break;
		}
		case GETCODEPAGES:
		{
			AST tmp741_AST_in = (AST)_t;
			match(_t,GETCODEPAGES);
			_t = _t.getNextSibling();
			break;
		}
		case COMSELF:
		{
			AST tmp742_AST_in = (AST)_t;
			match(_t,COMSELF);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void referencepoint(AST _t) throws RecognitionException {
		
		AST referencepoint_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		fld(_t,CQ.SYMBOL);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case MINUS:
		case PLUS:
		{
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PLUS:
			{
				AST tmp743_AST_in = (AST)_t;
				match(_t,PLUS);
				_t = _t.getNextSibling();
				break;
			}
			case MINUS:
			{
				AST tmp744_AST_in = (AST)_t;
				match(_t,MINUS);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			expression(_t);
			_t = _retTree;
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_retTree = _t;
	}
	
	public final void buffercomparestate(AST _t) throws RecognitionException {
		
		AST buffercomparestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t183 = _t;
		AST tmp745_AST_in = (AST)_t;
		match(_t,BUFFERCOMPARE);
		_t = _t.getFirstChild();
		tbl(_t,CQ.REF);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXCEPT:
		{
			AST __t185 = _t;
			AST tmp746_AST_in = (AST)_t;
			match(_t,EXCEPT);
			_t = _t.getFirstChild();
			{
			_loop187:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					break _loop187;
				}
				
			} while (true);
			}
			_t = __t185;
			_t = _t.getNextSibling();
			break;
		}
		case USING:
		{
			AST __t188 = _t;
			AST tmp747_AST_in = (AST)_t;
			match(_t,USING);
			_t = _t.getFirstChild();
			{
			int _cnt190=0;
			_loop190:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.REF);
					_t = _retTree;
				}
				else {
					if ( _cnt190>=1 ) { break _loop190; } else {throw new NoViableAltException(_t);}
				}
				
				_cnt190++;
			} while (true);
			}
			_t = __t188;
			_t = _t.getNextSibling();
			break;
		}
		case TO:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp748_AST_in = (AST)_t;
		match(_t,TO);
		_t = _t.getNextSibling();
		tbl(_t,CQ.REF);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CASESENSITIVE:
		{
			AST tmp749_AST_in = (AST)_t;
			match(_t,CASESENSITIVE);
			_t = _t.getNextSibling();
			break;
		}
		case BINARY:
		{
			AST tmp750_AST_in = (AST)_t;
			match(_t,BINARY);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case COMPARES:
		case EXPLICIT:
		case NOERROR_KW:
		case SAVE:
		case NOLOBS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case SAVE:
		{
			AST __t193 = _t;
			AST tmp751_AST_in = (AST)_t;
			match(_t,SAVE);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case RESULT:
			{
				AST __t195 = _t;
				AST tmp752_AST_in = (AST)_t;
				match(_t,RESULT);
				_t = _t.getFirstChild();
				AST tmp753_AST_in = (AST)_t;
				match(_t,IN_KW);
				_t = _t.getNextSibling();
				_t = __t195;
				_t = _t.getNextSibling();
				break;
			}
			case Field_ref:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			fld(_t,CQ.UPDATING);
			_t = _retTree;
			_t = __t193;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case COMPARES:
		case EXPLICIT:
		case NOERROR_KW:
		case NOLOBS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXPLICIT:
		{
			AST tmp754_AST_in = (AST)_t;
			match(_t,EXPLICIT);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case COMPARES:
		case NOERROR_KW:
		case NOLOBS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case COMPARES:
		{
			AST tmp755_AST_in = (AST)_t;
			match(_t,COMPARES);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOERROR_KW:
			{
				AST tmp756_AST_in = (AST)_t;
				match(_t,NOERROR_KW);
				_t = _t.getNextSibling();
				break;
			}
			case PERIOD:
			case LEXCOLON:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			block_colon(_t);
			_t = _retTree;
			AST __t199 = _t;
			AST tmp757_AST_in = (AST)_t;
			match(_t,Code_block);
			_t = _t.getFirstChild();
			{
			_loop202:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==WHEN)) {
					AST __t201 = _t;
					AST tmp758_AST_in = (AST)_t;
					match(_t,WHEN);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					AST tmp759_AST_in = (AST)_t;
					match(_t,THEN);
					_t = _t.getNextSibling();
					blockorstate(_t);
					_t = _retTree;
					_t = __t201;
					_t = _t.getNextSibling();
				}
				else {
					break _loop202;
				}
				
			} while (true);
			}
			_t = __t199;
			_t = _t.getNextSibling();
			AST __t203 = _t;
			AST tmp760_AST_in = (AST)_t;
			match(_t,END);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COMPARES:
			{
				AST tmp761_AST_in = (AST)_t;
				match(_t,COMPARES);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t203;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case NOLOBS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOLOBS:
		{
			AST tmp762_AST_in = (AST)_t;
			match(_t,NOLOBS);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp763_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t183;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void block_colon(AST _t) throws RecognitionException {
		
		AST block_colon_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case LEXCOLON:
		{
			AST tmp764_AST_in = (AST)_t;
			match(_t,LEXCOLON);
			_t = _t.getNextSibling();
			break;
		}
		case PERIOD:
		{
			AST tmp765_AST_in = (AST)_t;
			match(_t,PERIOD);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void state_end(AST _t) throws RecognitionException {
		
		AST state_end_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PERIOD:
		{
			AST tmp766_AST_in = (AST)_t;
			match(_t,PERIOD);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		{
			AST tmp767_AST_in = (AST)_t;
			match(_t,Token.EOF_TYPE);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void buffercopystate(AST _t) throws RecognitionException {
		
		AST buffercopystate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t208 = _t;
		AST tmp768_AST_in = (AST)_t;
		match(_t,BUFFERCOPY);
		_t = _t.getFirstChild();
		tbl(_t,CQ.REF);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXCEPT:
		{
			AST __t210 = _t;
			AST tmp769_AST_in = (AST)_t;
			match(_t,EXCEPT);
			_t = _t.getFirstChild();
			{
			_loop212:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					break _loop212;
				}
				
			} while (true);
			}
			_t = __t210;
			_t = _t.getNextSibling();
			break;
		}
		case USING:
		{
			AST __t213 = _t;
			AST tmp770_AST_in = (AST)_t;
			match(_t,USING);
			_t = _t.getFirstChild();
			{
			int _cnt215=0;
			_loop215:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.REF);
					_t = _retTree;
				}
				else {
					if ( _cnt215>=1 ) { break _loop215; } else {throw new NoViableAltException(_t);}
				}
				
				_cnt215++;
			} while (true);
			}
			_t = __t213;
			_t = _t.getNextSibling();
			break;
		}
		case TO:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp771_AST_in = (AST)_t;
		match(_t,TO);
		_t = _t.getNextSibling();
		tbl(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ASSIGN:
		{
			AST __t217 = _t;
			AST tmp772_AST_in = (AST)_t;
			match(_t,ASSIGN);
			_t = _t.getFirstChild();
			assignment_list(_t);
			_t = _retTree;
			_t = __t217;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case NOLOBS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOLOBS:
		{
			AST tmp773_AST_in = (AST)_t;
			match(_t,NOLOBS);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp774_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t208;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void findwhich(AST _t) throws RecognitionException {
		
		AST findwhich_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CURRENT:
		{
			AST tmp775_AST_in = (AST)_t;
			match(_t,CURRENT);
			_t = _t.getNextSibling();
			break;
		}
		case EACH:
		{
			AST tmp776_AST_in = (AST)_t;
			match(_t,EACH);
			_t = _t.getNextSibling();
			break;
		}
		case FIRST:
		{
			AST tmp777_AST_in = (AST)_t;
			match(_t,FIRST);
			_t = _t.getNextSibling();
			break;
		}
		case LAST:
		{
			AST tmp778_AST_in = (AST)_t;
			match(_t,LAST);
			_t = _t.getNextSibling();
			break;
		}
		case NEXT:
		{
			AST tmp779_AST_in = (AST)_t;
			match(_t,NEXT);
			_t = _t.getNextSibling();
			break;
		}
		case PREV:
		{
			AST tmp780_AST_in = (AST)_t;
			match(_t,PREV);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void recordphrase(AST _t) throws RecognitionException {
		
		AST recordphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXCEPT:
		case FIELDS:
		{
			record_fields(_t);
			_t = _retTree;
			break;
		}
		case 3:
		case LEXDATE:
		case NUMBER:
		case QSTRING:
		case BIGENDIAN:
		case EXCLUSIVELOCK:
		case FALSE_KW:
		case FINDCASESENSITIVE:
		case FINDGLOBAL:
		case FINDNEXTOCCURRENCE:
		case FINDPREVOCCURRENCE:
		case FINDSELECT:
		case FINDWRAPAROUND:
		case HOSTBYTEORDER:
		case LEFT:
		case LITTLEENDIAN:
		case NO:
		case NOERROR_KW:
		case NOLOCK:
		case NOPREFETCH:
		case NOWAIT:
		case NULL_KW:
		case OF:
		case OUTERJOIN:
		case READAVAILABLE:
		case READEXACTNUM:
		case SEARCHSELF:
		case SEARCHTARGET:
		case SHARELOCK:
		case TODAY:
		case TRUE_KW:
		case USEINDEX:
		case USING:
		case WHERE:
		case WINDOWDELAYEDMINIMIZE:
		case WINDOWMAXIMIZED:
		case WINDOWMINIMIZED:
		case WINDOWNORMAL:
		case YES:
		case UNKNOWNVALUE:
		case FUNCTIONCALLTYPE:
		case GETATTRCALLTYPE:
		case PROCEDURECALLTYPE:
		case SAXCOMPLETE:
		case SAXPARSERERROR:
		case SAXRUNNING:
		case SAXUNINITIALIZED:
		case SETATTRCALLTYPE:
		case NOW:
		case ROWUNMODIFIED:
		case ROWDELETED:
		case ROWMODIFIED:
		case ROWCREATED:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TODAY:
		{
			AST tmp781_AST_in = (AST)_t;
			match(_t,TODAY);
			_t = _t.getNextSibling();
			break;
		}
		case NOW:
		{
			AST tmp782_AST_in = (AST)_t;
			match(_t,NOW);
			_t = _t.getNextSibling();
			break;
		}
		default:
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_9.member(_t.getType()))) {
				constant(_t);
				_t = _retTree;
			}
			else if ((_tokenSet_10.member(_t.getType()))) {
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1107:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFT:
			{
				AST __t1099 = _t;
				AST tmp783_AST_in = (AST)_t;
				match(_t,LEFT);
				_t = _t.getFirstChild();
				AST tmp784_AST_in = (AST)_t;
				match(_t,OUTERJOIN);
				_t = _t.getNextSibling();
				_t = __t1099;
				_t = _t.getNextSibling();
				break;
			}
			case OUTERJOIN:
			{
				AST tmp785_AST_in = (AST)_t;
				match(_t,OUTERJOIN);
				_t = _t.getNextSibling();
				break;
			}
			case OF:
			{
				AST __t1100 = _t;
				AST tmp786_AST_in = (AST)_t;
				match(_t,OF);
				_t = _t.getFirstChild();
				tbl(_t,CQ.REF);
				_t = _retTree;
				_t = __t1100;
				_t = _t.getNextSibling();
				break;
			}
			case WHERE:
			{
				AST __t1101 = _t;
				AST tmp787_AST_in = (AST)_t;
				match(_t,WHERE);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_3.member(_t.getType()))) {
					expression(_t);
					_t = _retTree;
				}
				else if ((_t.getType()==3)) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				_t = __t1101;
				_t = _t.getNextSibling();
				break;
			}
			case USEINDEX:
			{
				AST __t1103 = _t;
				AST tmp788_AST_in = (AST)_t;
				match(_t,USEINDEX);
				_t = _t.getFirstChild();
				AST tmp789_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				_t = __t1103;
				_t = _t.getNextSibling();
				break;
			}
			case USING:
			{
				AST __t1104 = _t;
				AST tmp790_AST_in = (AST)_t;
				match(_t,USING);
				_t = _t.getFirstChild();
				fld1(_t,CQ.SYMBOL);
				_t = _retTree;
				{
				_loop1106:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==AND)) {
						AST tmp791_AST_in = (AST)_t;
						match(_t,AND);
						_t = _t.getNextSibling();
						fld1(_t,CQ.SYMBOL);
						_t = _retTree;
					}
					else {
						break _loop1106;
					}
					
				} while (true);
				}
				_t = __t1104;
				_t = _t.getNextSibling();
				break;
			}
			case EXCLUSIVELOCK:
			case NOLOCK:
			case SHARELOCK:
			{
				lockhow(_t);
				_t = _retTree;
				break;
			}
			case NOWAIT:
			{
				AST tmp792_AST_in = (AST)_t;
				match(_t,NOWAIT);
				_t = _t.getNextSibling();
				break;
			}
			case NOPREFETCH:
			{
				AST tmp793_AST_in = (AST)_t;
				match(_t,NOPREFETCH);
				_t = _t.getNextSibling();
				break;
			}
			case NOERROR_KW:
			{
				AST tmp794_AST_in = (AST)_t;
				match(_t,NOERROR_KW);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop1107;
			}
			}
		} while (true);
		}
		_retTree = _t;
	}
	
	public final void choosestate(AST _t) throws RecognitionException {
		
		AST choosestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		AST fi = null;
		
		AST __t225 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,CHOOSE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ROW:
		{
			AST tmp795_AST_in = (AST)_t;
			match(_t,ROW);
			_t = _t.getNextSibling();
			break;
		}
		case FIELD:
		{
			AST tmp796_AST_in = (AST)_t;
			match(_t,FIELD);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		if ( inputState.guessing==0 ) {
			action.frameInitializingStatement(head);
		}
		{
		int _cnt231=0;
		_loop231:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Form_item)) {
				AST __t228 = _t;
				fi = _t==ASTNULL ? null :(AST)_t;
				match(_t,Form_item);
				_t = _t.getFirstChild();
				fld(_t,CQ.UPDATING);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
					action.formItem(fi);
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case HELP:
				{
					AST __t230 = _t;
					AST tmp797_AST_in = (AST)_t;
					match(_t,HELP);
					_t = _t.getFirstChild();
					constant(_t);
					_t = _retTree;
					_t = __t230;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t228;
				_t = _t.getNextSibling();
			}
			else {
				if ( _cnt231>=1 ) { break _loop231; } else {throw new NoViableAltException(_t);}
			}
			
			_cnt231++;
		} while (true);
		}
		{
		_loop236:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case AUTORETURN:
			{
				AST tmp798_AST_in = (AST)_t;
				match(_t,AUTORETURN);
				_t = _t.getNextSibling();
				break;
			}
			case COLOR:
			{
				AST __t233 = _t;
				AST tmp799_AST_in = (AST)_t;
				match(_t,COLOR);
				_t = _t.getFirstChild();
				anyorvalue(_t);
				_t = _retTree;
				_t = __t233;
				_t = _t.getNextSibling();
				break;
			}
			case GOON:
			{
				goonphrase(_t);
				_t = _retTree;
				break;
			}
			case KEYS:
			{
				AST __t234 = _t;
				AST tmp800_AST_in = (AST)_t;
				match(_t,KEYS);
				_t = _t.getFirstChild();
				fld(_t,CQ.UPDATING);
				_t = _retTree;
				_t = __t234;
				_t = _t.getNextSibling();
				break;
			}
			case NOERROR_KW:
			{
				AST tmp801_AST_in = (AST)_t;
				match(_t,NOERROR_KW);
				_t = _t.getNextSibling();
				break;
			}
			case PAUSE:
			{
				AST __t235 = _t;
				AST tmp802_AST_in = (AST)_t;
				match(_t,PAUSE);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t235;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop236;
			}
			}
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_t = __t225;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void anyorvalue(AST _t) throws RecognitionException {
		
		AST anyorvalue_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case VALUE:
		{
			AST __t1616 = _t;
			AST tmp803_AST_in = (AST)_t;
			match(_t,VALUE);
			_t = _t.getFirstChild();
			AST tmp804_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			AST tmp805_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t1616;
			_t = _t.getNextSibling();
			break;
		}
		case TYPELESS_TOKEN:
		{
			AST tmp806_AST_in = (AST)_t;
			match(_t,TYPELESS_TOKEN);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void goonphrase(AST _t) throws RecognitionException {
		
		AST goonphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2010 = _t;
		AST tmp807_AST_in = (AST)_t;
		match(_t,GOON);
		_t = _t.getFirstChild();
		AST tmp808_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		goon_elem(_t);
		_t = _retTree;
		{
		_loop2013:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_11.member(_t.getType()))) {
				{
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA)) {
					AST tmp809_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
				}
				else if ((_tokenSet_11.member(_t.getType()))) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				goon_elem(_t);
				_t = _retTree;
			}
			else {
				break _loop2013;
			}
			
		} while (true);
		}
		AST tmp810_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t2010;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void classstate(AST _t) throws RecognitionException {
		
		AST classstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST c = null;
		
		AST __t239 = _t;
		c = _t==ASTNULL ? null :(AST)_t;
		match(_t,CLASS);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.classState(c);
		}
		AST tmp811_AST_in = (AST)_t;
		match(_t,TYPE_NAME);
		_t = _t.getNextSibling();
		{
		_loop245:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case INHERITS:
			{
				AST __t241 = _t;
				AST tmp812_AST_in = (AST)_t;
				match(_t,INHERITS);
				_t = _t.getFirstChild();
				AST tmp813_AST_in = (AST)_t;
				match(_t,TYPE_NAME);
				_t = _t.getNextSibling();
				_t = __t241;
				_t = _t.getNextSibling();
				break;
			}
			case IMPLEMENTS:
			{
				AST __t242 = _t;
				AST tmp814_AST_in = (AST)_t;
				match(_t,IMPLEMENTS);
				_t = _t.getFirstChild();
				AST tmp815_AST_in = (AST)_t;
				match(_t,TYPE_NAME);
				_t = _t.getNextSibling();
				{
				_loop244:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COMMA)) {
						AST tmp816_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						AST tmp817_AST_in = (AST)_t;
						match(_t,TYPE_NAME);
						_t = _t.getNextSibling();
					}
					else {
						break _loop244;
					}
					
				} while (true);
				}
				_t = __t242;
				_t = _t.getNextSibling();
				break;
			}
			case USEWIDGETPOOL:
			{
				AST tmp818_AST_in = (AST)_t;
				match(_t,USEWIDGETPOOL);
				_t = _t.getNextSibling();
				break;
			}
			case ABSTRACT:
			{
				AST tmp819_AST_in = (AST)_t;
				match(_t,ABSTRACT);
				_t = _t.getNextSibling();
				break;
			}
			case FINAL:
			{
				AST tmp820_AST_in = (AST)_t;
				match(_t,FINAL);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop245;
			}
			}
		} while (true);
		}
		block_colon(_t);
		_t = _retTree;
		code_block(_t);
		_t = _retTree;
		AST __t246 = _t;
		AST tmp821_AST_in = (AST)_t;
		match(_t,END);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CLASS:
		{
			AST tmp822_AST_in = (AST)_t;
			match(_t,CLASS);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t246;
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t239;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void code_block(AST _t) throws RecognitionException {
		
		AST code_block_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1426 = _t;
		AST tmp823_AST_in = (AST)_t;
		match(_t,Code_block);
		_t = _t.getFirstChild();
		{
		_loop1428:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_0.member(_t.getType()))) {
				blockorstate(_t);
				_t = _retTree;
			}
			else {
				break _loop1428;
			}
			
		} while (true);
		}
		_t = __t1426;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void clearstate(AST _t) throws RecognitionException {
		
		AST clearstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST c = null;
		
		AST __t249 = _t;
		c = _t==ASTNULL ? null :(AST)_t;
		match(_t,CLEAR);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FRAME:
		{
			frame_ref(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case ALL:
		case NOPAUSE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ALL:
		{
			AST tmp824_AST_in = (AST)_t;
			match(_t,ALL);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOPAUSE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOPAUSE:
		{
			AST tmp825_AST_in = (AST)_t;
			match(_t,NOPAUSE);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.clearState(c);
		}
		_t = __t249;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void closestoredprocedurestate(AST _t) throws RecognitionException {
		
		AST closestoredprocedurestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t254 = _t;
		AST tmp826_AST_in = (AST)_t;
		match(_t,CLOSE);
		_t = _t.getFirstChild();
		AST tmp827_AST_in = (AST)_t;
		match(_t,STOREDPROCEDURE);
		_t = _t.getNextSibling();
		AST tmp828_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EQUAL:
		{
			AST __t256 = _t;
			AST tmp829_AST_in = (AST)_t;
			match(_t,EQUAL);
			_t = _t.getFirstChild();
			fld(_t,CQ.REF);
			_t = _retTree;
			AST tmp830_AST_in = (AST)_t;
			match(_t,PROCSTATUS);
			_t = _t.getNextSibling();
			_t = __t256;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case WHERE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WHERE:
		{
			AST __t258 = _t;
			AST tmp831_AST_in = (AST)_t;
			match(_t,WHERE);
			_t = _t.getFirstChild();
			AST tmp832_AST_in = (AST)_t;
			match(_t,PROCHANDLE);
			_t = _t.getNextSibling();
			AST tmp833_AST_in = (AST)_t;
			match(_t,EQ);
			_t = _t.getNextSibling();
			fld(_t,CQ.REF);
			_t = _retTree;
			_t = __t258;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t254;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void colorstate(AST _t) throws RecognitionException {
		
		AST colorstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		AST fi = null;
		
		AST __t260 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,COLOR);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameInitializingStatement(head);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case DISPLAY:
		case PROMPT:
		{
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case DISPLAY:
			{
				AST __t263 = _t;
				AST tmp834_AST_in = (AST)_t;
				match(_t,DISPLAY);
				_t = _t.getFirstChild();
				anyorvalue(_t);
				_t = _retTree;
				_t = __t263;
				_t = _t.getNextSibling();
				break;
			}
			case PROMPT:
			{
				AST __t264 = _t;
				AST tmp835_AST_in = (AST)_t;
				match(_t,PROMPT);
				_t = _t.getFirstChild();
				anyorvalue(_t);
				_t = _retTree;
				_t = __t264;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case DISPLAY:
			{
				AST __t266 = _t;
				AST tmp836_AST_in = (AST)_t;
				match(_t,DISPLAY);
				_t = _t.getFirstChild();
				anyorvalue(_t);
				_t = _retTree;
				_t = __t266;
				_t = _t.getNextSibling();
				break;
			}
			case PROMPT:
			{
				AST __t267 = _t;
				AST tmp837_AST_in = (AST)_t;
				match(_t,PROMPT);
				_t = _t.getFirstChild();
				anyorvalue(_t);
				_t = _retTree;
				_t = __t267;
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case WITH:
			case Form_item:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		case EOF:
		case PERIOD:
		case WITH:
		case Form_item:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop271:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Form_item)) {
				AST __t269 = _t;
				fi = _t==ASTNULL ? null :(AST)_t;
				match(_t,Form_item);
				_t = _t.getFirstChild();
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
					action.formItem(fi);
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Format_phrase:
				{
					formatphrase(_t);
					_t = _retTree;
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t269;
				_t = _t.getNextSibling();
			}
			else {
				break _loop271;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_t = __t260;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void formatphrase(AST _t) throws RecognitionException {
		
		AST formatphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST af = null;
		
		AST __t839 = _t;
		AST tmp838_AST_in = (AST)_t;
		match(_t,Format_phrase);
		_t = _t.getFirstChild();
		{
		int _cnt853=0;
		_loop853:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case AS:
			{
				AST __t841 = _t;
				AST tmp839_AST_in = (AST)_t;
				match(_t,AS);
				_t = _t.getFirstChild();
				datatype_var(_t);
				_t = _retTree;
				_t = __t841;
				_t = _t.getNextSibling();
				break;
			}
			case AT:
			{
				atphrase(_t);
				_t = _retTree;
				break;
			}
			case ATTRSPACE:
			{
				AST tmp840_AST_in = (AST)_t;
				match(_t,ATTRSPACE);
				_t = _t.getNextSibling();
				break;
			}
			case NOATTRSPACE:
			{
				AST tmp841_AST_in = (AST)_t;
				match(_t,NOATTRSPACE);
				_t = _t.getNextSibling();
				break;
			}
			case AUTORETURN:
			{
				AST tmp842_AST_in = (AST)_t;
				match(_t,AUTORETURN);
				_t = _t.getNextSibling();
				break;
			}
			case BGCOLOR:
			case DCOLOR:
			case FGCOLOR:
			case PFCOLOR:
			{
				color_expr(_t);
				_t = _retTree;
				break;
			}
			case CONTEXTHELPID:
			{
				AST __t842 = _t;
				AST tmp843_AST_in = (AST)_t;
				match(_t,CONTEXTHELPID);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t842;
				_t = _t.getNextSibling();
				break;
			}
			case BLANK:
			{
				AST tmp844_AST_in = (AST)_t;
				match(_t,BLANK);
				_t = _t.getNextSibling();
				break;
			}
			case COLON:
			{
				AST __t843 = _t;
				AST tmp845_AST_in = (AST)_t;
				match(_t,COLON);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t843;
				_t = _t.getNextSibling();
				break;
			}
			case TO:
			{
				AST __t844 = _t;
				AST tmp846_AST_in = (AST)_t;
				match(_t,TO);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t844;
				_t = _t.getNextSibling();
				break;
			}
			case DEBLANK:
			{
				AST tmp847_AST_in = (AST)_t;
				match(_t,DEBLANK);
				_t = _t.getNextSibling();
				break;
			}
			case DISABLEAUTOZAP:
			{
				AST tmp848_AST_in = (AST)_t;
				match(_t,DISABLEAUTOZAP);
				_t = _t.getNextSibling();
				break;
			}
			case FONT:
			{
				AST __t845 = _t;
				AST tmp849_AST_in = (AST)_t;
				match(_t,FONT);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t845;
				_t = _t.getNextSibling();
				break;
			}
			case FORMAT:
			{
				AST __t846 = _t;
				AST tmp850_AST_in = (AST)_t;
				match(_t,FORMAT);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t846;
				_t = _t.getNextSibling();
				break;
			}
			case HELP:
			{
				AST __t847 = _t;
				AST tmp851_AST_in = (AST)_t;
				match(_t,HELP);
				_t = _t.getFirstChild();
				constant(_t);
				_t = _retTree;
				_t = __t847;
				_t = _t.getNextSibling();
				break;
			}
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case LEXAT:
			{
				AST __t848 = _t;
				AST tmp852_AST_in = (AST)_t;
				match(_t,LEXAT);
				_t = _t.getFirstChild();
				af = _t==ASTNULL ? null : (AST)_t;
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
					action.lexat(af);
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Format_phrase:
				{
					formatphrase(_t);
					_t = _retTree;
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t848;
				_t = _t.getNextSibling();
				break;
			}
			case LIKE:
			{
				AST __t850 = _t;
				AST tmp853_AST_in = (AST)_t;
				match(_t,LIKE);
				_t = _t.getFirstChild();
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				_t = __t850;
				_t = _t.getNextSibling();
				break;
			}
			case NOLABELS:
			{
				AST tmp854_AST_in = (AST)_t;
				match(_t,NOLABELS);
				_t = _t.getNextSibling();
				break;
			}
			case NOTABSTOP:
			{
				AST tmp855_AST_in = (AST)_t;
				match(_t,NOTABSTOP);
				_t = _t.getNextSibling();
				break;
			}
			case PASSWORDFIELD:
			{
				AST tmp856_AST_in = (AST)_t;
				match(_t,PASSWORDFIELD);
				_t = _t.getNextSibling();
				break;
			}
			case VALIDATE:
			{
				AST __t851 = _t;
				AST tmp857_AST_in = (AST)_t;
				match(_t,VALIDATE);
				_t = _t.getFirstChild();
				funargs(_t);
				_t = _retTree;
				_t = __t851;
				_t = _t.getNextSibling();
				break;
			}
			case WHEN:
			{
				AST __t852 = _t;
				AST tmp858_AST_in = (AST)_t;
				match(_t,WHEN);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t852;
				_t = _t.getNextSibling();
				break;
			}
			case VIEWAS:
			{
				viewasphrase(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				if ( _cnt853>=1 ) { break _loop853; } else {throw new NoViableAltException(_t);}
			}
			}
			_cnt853++;
		} while (true);
		}
		_t = __t839;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void columnformat(AST _t) throws RecognitionException {
		
		AST columnformat_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST af = null;
		
		AST __t274 = _t;
		AST tmp859_AST_in = (AST)_t;
		match(_t,Format_phrase);
		_t = _t.getFirstChild();
		{
		int _cnt291=0;
		_loop291:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case FORMAT:
			{
				AST __t276 = _t;
				AST tmp860_AST_in = (AST)_t;
				match(_t,FORMAT);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t276;
				_t = _t.getNextSibling();
				break;
			}
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case NOLABELS:
			{
				AST tmp861_AST_in = (AST)_t;
				match(_t,NOLABELS);
				_t = _t.getNextSibling();
				break;
			}
			case COLUMNFONT:
			{
				AST __t277 = _t;
				AST tmp862_AST_in = (AST)_t;
				match(_t,COLUMNFONT);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t277;
				_t = _t.getNextSibling();
				break;
			}
			case COLUMNDCOLOR:
			{
				AST __t278 = _t;
				AST tmp863_AST_in = (AST)_t;
				match(_t,COLUMNDCOLOR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t278;
				_t = _t.getNextSibling();
				break;
			}
			case COLUMNBGCOLOR:
			{
				AST __t279 = _t;
				AST tmp864_AST_in = (AST)_t;
				match(_t,COLUMNBGCOLOR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t279;
				_t = _t.getNextSibling();
				break;
			}
			case COLUMNFGCOLOR:
			{
				AST __t280 = _t;
				AST tmp865_AST_in = (AST)_t;
				match(_t,COLUMNFGCOLOR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t280;
				_t = _t.getNextSibling();
				break;
			}
			case COLUMNPFCOLOR:
			{
				AST __t281 = _t;
				AST tmp866_AST_in = (AST)_t;
				match(_t,COLUMNPFCOLOR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t281;
				_t = _t.getNextSibling();
				break;
			}
			case LABELFONT:
			{
				AST __t282 = _t;
				AST tmp867_AST_in = (AST)_t;
				match(_t,LABELFONT);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t282;
				_t = _t.getNextSibling();
				break;
			}
			case LABELDCOLOR:
			{
				AST __t283 = _t;
				AST tmp868_AST_in = (AST)_t;
				match(_t,LABELDCOLOR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t283;
				_t = _t.getNextSibling();
				break;
			}
			case LABELBGCOLOR:
			{
				AST __t284 = _t;
				AST tmp869_AST_in = (AST)_t;
				match(_t,LABELBGCOLOR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t284;
				_t = _t.getNextSibling();
				break;
			}
			case LABELFGCOLOR:
			{
				AST __t285 = _t;
				AST tmp870_AST_in = (AST)_t;
				match(_t,LABELFGCOLOR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t285;
				_t = _t.getNextSibling();
				break;
			}
			case LEXAT:
			{
				AST __t286 = _t;
				AST tmp871_AST_in = (AST)_t;
				match(_t,LEXAT);
				_t = _t.getFirstChild();
				af = _t==ASTNULL ? null : (AST)_t;
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
					action.lexat(af);
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Format_phrase:
				{
					columnformat(_t);
					_t = _retTree;
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t286;
				_t = _t.getNextSibling();
				break;
			}
			case WIDTH:
			{
				AST __t288 = _t;
				AST tmp872_AST_in = (AST)_t;
				match(_t,WIDTH);
				_t = _t.getFirstChild();
				AST tmp873_AST_in = (AST)_t;
				match(_t,NUMBER);
				_t = _t.getNextSibling();
				_t = __t288;
				_t = _t.getNextSibling();
				break;
			}
			case WIDTHPIXELS:
			{
				AST __t289 = _t;
				AST tmp874_AST_in = (AST)_t;
				match(_t,WIDTHPIXELS);
				_t = _t.getFirstChild();
				AST tmp875_AST_in = (AST)_t;
				match(_t,NUMBER);
				_t = _t.getNextSibling();
				_t = __t289;
				_t = _t.getNextSibling();
				break;
			}
			case WIDTHCHARS:
			{
				AST __t290 = _t;
				AST tmp876_AST_in = (AST)_t;
				match(_t,WIDTHCHARS);
				_t = _t.getFirstChild();
				AST tmp877_AST_in = (AST)_t;
				match(_t,NUMBER);
				_t = _t.getNextSibling();
				_t = __t290;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				if ( _cnt291>=1 ) { break _loop291; } else {throw new NoViableAltException(_t);}
			}
			}
			_cnt291++;
		} while (true);
		}
		_t = __t274;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void constructorstate(AST _t) throws RecognitionException {
		
		AST constructorstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST c = null;
		
		AST __t293 = _t;
		c = _t==ASTNULL ? null :(AST)_t;
		match(_t,CONSTRUCTOR);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.structorBegin(c);
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp878_AST_in = (AST)_t;
		match(_t,TYPE_NAME);
		_t = _t.getNextSibling();
		function_params(_t);
		_t = _retTree;
		block_colon(_t);
		_t = _retTree;
		code_block(_t);
		_t = _retTree;
		AST __t294 = _t;
		AST tmp879_AST_in = (AST)_t;
		match(_t,END);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CONSTRUCTOR:
		{
			AST tmp880_AST_in = (AST)_t;
			match(_t,CONSTRUCTOR);
			_t = _t.getNextSibling();
			break;
		}
		case METHOD:
		{
			AST tmp881_AST_in = (AST)_t;
			match(_t,METHOD);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t294;
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.structorEnd(c);
		}
		_t = __t293;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void def_modifiers(AST _t) throws RecognitionException {
		
		AST def_modifiers_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		{
		_loop1938:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PRIVATE:
			{
				AST tmp882_AST_in = (AST)_t;
				match(_t,PRIVATE);
				_t = _t.getNextSibling();
				break;
			}
			case PROTECTED:
			{
				AST tmp883_AST_in = (AST)_t;
				match(_t,PROTECTED);
				_t = _t.getNextSibling();
				break;
			}
			case PUBLIC:
			{
				AST tmp884_AST_in = (AST)_t;
				match(_t,PUBLIC);
				_t = _t.getNextSibling();
				break;
			}
			case STATIC:
			{
				AST tmp885_AST_in = (AST)_t;
				match(_t,STATIC);
				_t = _t.getNextSibling();
				break;
			}
			case ABSTRACT:
			{
				AST tmp886_AST_in = (AST)_t;
				match(_t,ABSTRACT);
				_t = _t.getNextSibling();
				break;
			}
			case OVERRIDE:
			{
				AST tmp887_AST_in = (AST)_t;
				match(_t,OVERRIDE);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop1938;
			}
			}
		} while (true);
		}
		_retTree = _t;
	}
	
	public final void function_params(AST _t) throws RecognitionException {
		
		AST function_params_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2001 = _t;
		AST tmp888_AST_in = (AST)_t;
		match(_t,Parameter_list);
		_t = _t.getFirstChild();
		AST tmp889_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BUFFER:
		case INPUT:
		case INPUTOUTPUT:
		case OUTPUT:
		{
			function_param(_t);
			_t = _retTree;
			break;
		}
		case COMMA:
		case RIGHTPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop2004:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp890_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				function_param(_t);
				_t = _retTree;
			}
			else {
				break _loop2004;
			}
			
		} while (true);
		}
		AST tmp891_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t2001;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createstate(AST _t) throws RecognitionException {
		
		AST createstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t297 = _t;
		AST tmp892_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		tbl(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case USING:
		{
			AST __t299 = _t;
			AST tmp893_AST_in = (AST)_t;
			match(_t,USING);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ROWID:
			{
				AST tmp894_AST_in = (AST)_t;
				match(_t,ROWID);
				_t = _t.getNextSibling();
				break;
			}
			case RECID:
			{
				AST tmp895_AST_in = (AST)_t;
				match(_t,RECID);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			expression(_t);
			_t = _retTree;
			_t = __t299;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp896_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t297;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void create_whatever_args(AST _t) throws RecognitionException {
		
		AST create_whatever_args_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t304 = _t;
			AST tmp897_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp898_AST_in = (AST)_t;
			match(_t,WIDGETPOOL);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t304;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp899_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_retTree = _t;
	}
	
	public final void createautomationobjectstate(AST _t) throws RecognitionException {
		
		AST createautomationobjectstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t307 = _t;
		AST tmp900_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp901_AST_in = (AST)_t;
		match(_t,QSTRING);
		_t = _t.getNextSibling();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CONNECT:
		{
			AST __t309 = _t;
			AST tmp902_AST_in = (AST)_t;
			match(_t,CONNECT);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case TO:
			{
				AST __t311 = _t;
				AST tmp903_AST_in = (AST)_t;
				match(_t,TO);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t311;
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t309;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp904_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t307;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createbrowsestate(AST _t) throws RecognitionException {
		
		AST createbrowsestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t314 = _t;
		AST tmp905_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp906_AST_in = (AST)_t;
		match(_t,BROWSE);
		_t = _t.getNextSibling();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t316 = _t;
			AST tmp907_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp908_AST_in = (AST)_t;
			match(_t,WIDGETPOOL);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t316;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case ASSIGN:
		case NOERROR_KW:
		case TRIGGERS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp909_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case ASSIGN:
		case TRIGGERS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ASSIGN:
		{
			assign_opt(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case TRIGGERS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TRIGGERS:
		{
			triggerphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t314;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void assign_opt(AST _t) throws RecognitionException {
		
		AST assign_opt_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1695 = _t;
		AST tmp910_AST_in = (AST)_t;
		match(_t,ASSIGN);
		_t = _t.getFirstChild();
		{
		int _cnt1698=0;
		_loop1698:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==EQUAL)) {
				AST __t1697 = _t;
				AST tmp911_AST_in = (AST)_t;
				match(_t,EQUAL);
				_t = _t.getFirstChild();
				AST tmp912_AST_in = (AST)_t;
				if ( _t==null ) throw new MismatchedTokenException();
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				_t = __t1697;
				_t = _t.getNextSibling();
			}
			else {
				if ( _cnt1698>=1 ) { break _loop1698; } else {throw new NoViableAltException(_t);}
			}
			
			_cnt1698++;
		} while (true);
		}
		_t = __t1695;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void triggerphrase(AST _t) throws RecognitionException {
		
		AST triggerphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST on = null;
		
		AST __t1219 = _t;
		AST tmp913_AST_in = (AST)_t;
		match(_t,TRIGGERS);
		_t = _t.getFirstChild();
		block_colon(_t);
		_t = _retTree;
		AST __t1220 = _t;
		AST tmp914_AST_in = (AST)_t;
		match(_t,Code_block);
		_t = _t.getFirstChild();
		{
		_loop1225:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==ON)) {
				AST __t1222 = _t;
				on = _t==ASTNULL ? null :(AST)_t;
				match(_t,ON);
				_t = _t.getFirstChild();
				if ( inputState.guessing==0 ) {
					action.scopeAdd(on);
				}
				eventlist(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case ANYWHERE:
				{
					AST tmp915_AST_in = (AST)_t;
					match(_t,ANYWHERE);
					_t = _t.getNextSibling();
					break;
				}
				case PERIOD:
				case PROPARSEDIRECTIVE:
				case AATRACE:
				case ACCUMULATE:
				case ALTER:
				case ANALYZE:
				case APPLY:
				case ASSIGN:
				case BELL:
				case BTOS:
				case BUFFERCOMPARE:
				case BUFFERCOPY:
				case CALL:
				case CASE:
				case CHOOSE:
				case CLEAR:
				case CLOSE:
				case COLOR:
				case COMPILE:
				case CONNECT:
				case CREATE:
				case DDE:
				case DECLARE:
				case DEFINE:
				case DELETE_KW:
				case DICTIONARY:
				case DISABLE:
				case DISCONNECT:
				case DISPLAY:
				case DO:
				case DOS:
				case DOWN:
				case DROP:
				case EMPTY:
				case ENABLE:
				case EXPORT:
				case FETCH:
				case FIND:
				case FOR:
				case FORMAT:
				case FUNCTION:
				case GET:
				case GETKEYVALUE:
				case GRANT:
				case HIDE:
				case IF:
				case IMPORT:
				case INPUT:
				case INPUTOUTPUT:
				case INSERT:
				case LEAVE:
				case LOAD:
				case MESSAGE:
				case MPE:
				case NEXT:
				case NEXTPROMPT:
				case ON:
				case OPEN:
				case OS2:
				case OS400:
				case OSAPPEND:
				case OSCOMMAND:
				case OSCOPY:
				case OSCREATEDIR:
				case OSDELETE:
				case OSRENAME:
				case OUTPUT:
				case PAGE:
				case PAUSE:
				case PERSISTENT:
				case PROCEDURE:
				case PROCESS:
				case PROMPTFOR:
				case PUBLISH:
				case PUT:
				case PUTKEYVALUE:
				case QUIT:
				case RAWTRANSFER:
				case READKEY:
				case RELEASE:
				case REPEAT:
				case REPOSITION:
				case RETURN:
				case REVOKE:
				case RUN:
				case SAVE:
				case SCROLL:
				case SEEK:
				case SELECT:
				case SET:
				case SHOWSTATS:
				case STATUS:
				case STOP:
				case SUBSCRIBE:
				case SYSTEMDIALOG:
				case SYSTEMHELP:
				case TRANSACTIONMODE:
				case TRIGGER:
				case UNDERLINE:
				case UNDO:
				case UNIX:
				case UNLOAD:
				case UNSUBSCRIBE:
				case UP:
				case UPDATE:
				case USE:
				case USING:
				case VALIDATE:
				case VIEW:
				case VMS:
				case WAITFOR:
				case Expr_statement:
				case BLOCK_LABEL:
				case COPYLOB:
				case DOT_COMMENT:
				case CLASS:
				case CONSTRUCTOR:
				case INTERFACE:
				case METHOD:
				case THISOBJECT:
				case DESTRUCTOR:
				case ANNOTATION:
				case CATCH:
				case FINALLY:
				case ROUTINELEVEL:
				case Assign_dynamic_new:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case PERSISTENT:
				{
					AST tmp916_AST_in = (AST)_t;
					match(_t,PERSISTENT);
					_t = _t.getNextSibling();
					runstate(_t);
					_t = _retTree;
					break;
				}
				case PERIOD:
				case PROPARSEDIRECTIVE:
				case AATRACE:
				case ACCUMULATE:
				case ALTER:
				case ANALYZE:
				case APPLY:
				case ASSIGN:
				case BELL:
				case BTOS:
				case BUFFERCOMPARE:
				case BUFFERCOPY:
				case CALL:
				case CASE:
				case CHOOSE:
				case CLEAR:
				case CLOSE:
				case COLOR:
				case COMPILE:
				case CONNECT:
				case CREATE:
				case DDE:
				case DECLARE:
				case DEFINE:
				case DELETE_KW:
				case DICTIONARY:
				case DISABLE:
				case DISCONNECT:
				case DISPLAY:
				case DO:
				case DOS:
				case DOWN:
				case DROP:
				case EMPTY:
				case ENABLE:
				case EXPORT:
				case FETCH:
				case FIND:
				case FOR:
				case FORMAT:
				case FUNCTION:
				case GET:
				case GETKEYVALUE:
				case GRANT:
				case HIDE:
				case IF:
				case IMPORT:
				case INPUT:
				case INPUTOUTPUT:
				case INSERT:
				case LEAVE:
				case LOAD:
				case MESSAGE:
				case MPE:
				case NEXT:
				case NEXTPROMPT:
				case ON:
				case OPEN:
				case OS2:
				case OS400:
				case OSAPPEND:
				case OSCOMMAND:
				case OSCOPY:
				case OSCREATEDIR:
				case OSDELETE:
				case OSRENAME:
				case OUTPUT:
				case PAGE:
				case PAUSE:
				case PROCEDURE:
				case PROCESS:
				case PROMPTFOR:
				case PUBLISH:
				case PUT:
				case PUTKEYVALUE:
				case QUIT:
				case RAWTRANSFER:
				case READKEY:
				case RELEASE:
				case REPEAT:
				case REPOSITION:
				case RETURN:
				case REVOKE:
				case RUN:
				case SAVE:
				case SCROLL:
				case SEEK:
				case SELECT:
				case SET:
				case SHOWSTATS:
				case STATUS:
				case STOP:
				case SUBSCRIBE:
				case SYSTEMDIALOG:
				case SYSTEMHELP:
				case TRANSACTIONMODE:
				case TRIGGER:
				case UNDERLINE:
				case UNDO:
				case UNIX:
				case UNLOAD:
				case UNSUBSCRIBE:
				case UP:
				case UPDATE:
				case USE:
				case USING:
				case VALIDATE:
				case VIEW:
				case VMS:
				case WAITFOR:
				case Expr_statement:
				case BLOCK_LABEL:
				case COPYLOB:
				case DOT_COMMENT:
				case CLASS:
				case CONSTRUCTOR:
				case INTERFACE:
				case METHOD:
				case THISOBJECT:
				case DESTRUCTOR:
				case ANNOTATION:
				case CATCH:
				case FINALLY:
				case ROUTINELEVEL:
				case Assign_dynamic_new:
				{
					blockorstate(_t);
					_t = _retTree;
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				if ( inputState.guessing==0 ) {
					action.scopeClose(on);
				}
				_t = __t1222;
				_t = _t.getNextSibling();
			}
			else {
				break _loop1225;
			}
			
		} while (true);
		}
		_t = __t1220;
		_t = _t.getNextSibling();
		AST __t1226 = _t;
		AST tmp917_AST_in = (AST)_t;
		match(_t,END);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TRIGGERS:
		{
			AST tmp918_AST_in = (AST)_t;
			match(_t,TRIGGERS);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1226;
		_t = _t.getNextSibling();
		_t = __t1219;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createbufferstate(AST _t) throws RecognitionException {
		
		AST createbufferstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t321 = _t;
		AST tmp919_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp920_AST_in = (AST)_t;
		match(_t,BUFFER);
		_t = _t.getNextSibling();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		AST tmp921_AST_in = (AST)_t;
		match(_t,FOR);
		_t = _t.getNextSibling();
		AST tmp922_AST_in = (AST)_t;
		match(_t,TABLE);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BUFFERNAME:
		{
			AST __t323 = _t;
			AST tmp923_AST_in = (AST)_t;
			match(_t,BUFFERNAME);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t323;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case IN_KW:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t325 = _t;
			AST tmp924_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp925_AST_in = (AST)_t;
			match(_t,WIDGETPOOL);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t325;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp926_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t321;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createserverstate(AST _t) throws RecognitionException {
		
		AST createserverstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t328 = _t;
		AST tmp927_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp928_AST_in = (AST)_t;
		match(_t,SERVER);
		_t = _t.getNextSibling();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ASSIGN:
		{
			assign_opt(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t328;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createserversocketstate(AST _t) throws RecognitionException {
		
		AST createserversocketstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t331 = _t;
		AST tmp929_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp930_AST_in = (AST)_t;
		match(_t,SERVERSOCKET);
		_t = _t.getNextSibling();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp931_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t331;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createsocketstate(AST _t) throws RecognitionException {
		
		AST createsocketstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t334 = _t;
		AST tmp932_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp933_AST_in = (AST)_t;
		match(_t,SOCKET);
		_t = _t.getNextSibling();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp934_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t334;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createtemptablestate(AST _t) throws RecognitionException {
		
		AST createtemptablestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t337 = _t;
		AST tmp935_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp936_AST_in = (AST)_t;
		match(_t,TEMPTABLE);
		_t = _t.getNextSibling();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t339 = _t;
			AST tmp937_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp938_AST_in = (AST)_t;
			match(_t,WIDGETPOOL);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t339;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp939_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t337;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createwidgetstate(AST _t) throws RecognitionException {
		
		AST createwidgetstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t342 = _t;
		AST tmp940_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case VALUE:
		{
			valueexpression(_t);
			_t = _retTree;
			break;
		}
		case BUTTON:
		{
			AST tmp941_AST_in = (AST)_t;
			match(_t,BUTTON);
			_t = _t.getNextSibling();
			break;
		}
		case COMBOBOX:
		{
			AST tmp942_AST_in = (AST)_t;
			match(_t,COMBOBOX);
			_t = _t.getNextSibling();
			break;
		}
		case CONTROLFRAME:
		{
			AST tmp943_AST_in = (AST)_t;
			match(_t,CONTROLFRAME);
			_t = _t.getNextSibling();
			break;
		}
		case DIALOGBOX:
		{
			AST tmp944_AST_in = (AST)_t;
			match(_t,DIALOGBOX);
			_t = _t.getNextSibling();
			break;
		}
		case EDITOR:
		{
			AST tmp945_AST_in = (AST)_t;
			match(_t,EDITOR);
			_t = _t.getNextSibling();
			break;
		}
		case FILLIN:
		{
			AST tmp946_AST_in = (AST)_t;
			match(_t,FILLIN);
			_t = _t.getNextSibling();
			break;
		}
		case FRAME:
		{
			AST tmp947_AST_in = (AST)_t;
			match(_t,FRAME);
			_t = _t.getNextSibling();
			break;
		}
		case IMAGE:
		{
			AST tmp948_AST_in = (AST)_t;
			match(_t,IMAGE);
			_t = _t.getNextSibling();
			break;
		}
		case MENU:
		{
			AST tmp949_AST_in = (AST)_t;
			match(_t,MENU);
			_t = _t.getNextSibling();
			break;
		}
		case MENUITEM:
		{
			AST tmp950_AST_in = (AST)_t;
			match(_t,MENUITEM);
			_t = _t.getNextSibling();
			break;
		}
		case RADIOSET:
		{
			AST tmp951_AST_in = (AST)_t;
			match(_t,RADIOSET);
			_t = _t.getNextSibling();
			break;
		}
		case RECTANGLE:
		{
			AST tmp952_AST_in = (AST)_t;
			match(_t,RECTANGLE);
			_t = _t.getNextSibling();
			break;
		}
		case SAXATTRIBUTES:
		{
			AST tmp953_AST_in = (AST)_t;
			match(_t,SAXATTRIBUTES);
			_t = _t.getNextSibling();
			break;
		}
		case SELECTIONLIST:
		{
			AST tmp954_AST_in = (AST)_t;
			match(_t,SELECTIONLIST);
			_t = _t.getNextSibling();
			break;
		}
		case SLIDER:
		{
			AST tmp955_AST_in = (AST)_t;
			match(_t,SLIDER);
			_t = _t.getNextSibling();
			break;
		}
		case SUBMENU:
		{
			AST tmp956_AST_in = (AST)_t;
			match(_t,SUBMENU);
			_t = _t.getNextSibling();
			break;
		}
		case TEXT:
		{
			AST tmp957_AST_in = (AST)_t;
			match(_t,TEXT);
			_t = _t.getNextSibling();
			break;
		}
		case TOGGLEBOX:
		{
			AST tmp958_AST_in = (AST)_t;
			match(_t,TOGGLEBOX);
			_t = _t.getNextSibling();
			break;
		}
		case WINDOW:
		{
			AST tmp959_AST_in = (AST)_t;
			match(_t,WINDOW);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t345 = _t;
			AST tmp960_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp961_AST_in = (AST)_t;
			match(_t,WIDGETPOOL);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t345;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case ASSIGN:
		case NOERROR_KW:
		case TRIGGERS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp962_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case ASSIGN:
		case TRIGGERS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ASSIGN:
		{
			assign_opt(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case TRIGGERS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TRIGGERS:
		{
			triggerphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t342;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void valueexpression(AST _t) throws RecognitionException {
		
		AST valueexpression_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1618 = _t;
		AST tmp963_AST_in = (AST)_t;
		match(_t,VALUE);
		_t = _t.getFirstChild();
		AST tmp964_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		AST tmp965_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t1618;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void ddegetstate(AST _t) throws RecognitionException {
		
		AST ddegetstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t350 = _t;
		AST tmp966_AST_in = (AST)_t;
		match(_t,DDE);
		_t = _t.getFirstChild();
		AST tmp967_AST_in = (AST)_t;
		match(_t,GET);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		AST tmp968_AST_in = (AST)_t;
		match(_t,TARGET);
		_t = _t.getNextSibling();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		AST tmp969_AST_in = (AST)_t;
		match(_t,ITEM);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TIME:
		{
			AST __t352 = _t;
			AST tmp970_AST_in = (AST)_t;
			match(_t,TIME);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t352;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp971_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t350;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void ddeinitiatestate(AST _t) throws RecognitionException {
		
		AST ddeinitiatestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t355 = _t;
		AST tmp972_AST_in = (AST)_t;
		match(_t,DDE);
		_t = _t.getFirstChild();
		AST tmp973_AST_in = (AST)_t;
		match(_t,INITIATE);
		_t = _t.getNextSibling();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		AST tmp974_AST_in = (AST)_t;
		match(_t,FRAME);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		AST tmp975_AST_in = (AST)_t;
		match(_t,APPLICATION);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		AST tmp976_AST_in = (AST)_t;
		match(_t,TOPIC);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp977_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t355;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void dderequeststate(AST _t) throws RecognitionException {
		
		AST dderequeststate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t358 = _t;
		AST tmp978_AST_in = (AST)_t;
		match(_t,DDE);
		_t = _t.getFirstChild();
		AST tmp979_AST_in = (AST)_t;
		match(_t,REQUEST);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		AST tmp980_AST_in = (AST)_t;
		match(_t,TARGET);
		_t = _t.getNextSibling();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		AST tmp981_AST_in = (AST)_t;
		match(_t,ITEM);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TIME:
		{
			AST __t360 = _t;
			AST tmp982_AST_in = (AST)_t;
			match(_t,TIME);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t360;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp983_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t358;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void definebrowsestate(AST _t) throws RecognitionException {
		
		AST definebrowsestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		AST fi1 = null;
		AST fi2 = null;
		
		AST __t363 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case BROWSE:
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp984_AST_in = (AST)_t;
		match(_t,BROWSE);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineBrowse(def, id));
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case QUERY:
		{
			AST __t366 = _t;
			AST tmp985_AST_in = (AST)_t;
			match(_t,QUERY);
			_t = _t.getFirstChild();
			AST tmp986_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			_t = __t366;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case CONTEXTHELPID:
		case DISPLAY:
		case EXCLUSIVELOCK:
		case NOLOCK:
		case NOWAIT:
		case SHARELOCK:
		case TOOLTIP:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop368:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case EXCLUSIVELOCK:
			case NOLOCK:
			case SHARELOCK:
			{
				lockhow(_t);
				_t = _retTree;
				break;
			}
			case NOWAIT:
			{
				AST tmp987_AST_in = (AST)_t;
				match(_t,NOWAIT);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop368;
			}
			}
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case DISPLAY:
		{
			AST __t370 = _t;
			AST tmp988_AST_in = (AST)_t;
			match(_t,DISPLAY);
			_t = _t.getFirstChild();
			{
			_loop378:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Form_item)) {
					AST __t372 = _t;
					fi1 = _t==ASTNULL ? null :(AST)_t;
					match(_t,Form_item);
					_t = _t.getFirstChild();
					{
					boolean synPredMatched375 = false;
					if (_t==null) _t=ASTNULL;
					if (((_t.getType()==RECORD_NAME))) {
						AST __t375 = _t;
						synPredMatched375 = true;
						inputState.guessing++;
						try {
							{
							tbl(_t,CQ.INIT);
							_t = _retTree;
							}
						}
						catch (RecognitionException pe) {
							synPredMatched375 = false;
						}
						_t = __t375;
inputState.guessing--;
					}
					if ( synPredMatched375 ) {
						tbl(_t,CQ.INIT);
						_t = _retTree;
					}
					else if ((_tokenSet_3.member(_t.getType()))) {
						expression(_t);
						_t = _retTree;
						{
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case Format_phrase:
						{
							columnformat(_t);
							_t = _retTree;
							break;
						}
						case 3:
						case VIEWAS:
						{
							break;
						}
						default:
						{
							throw new NoViableAltException(_t);
						}
						}
						}
						{
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case VIEWAS:
						{
							viewasphrase(_t);
							_t = _retTree;
							break;
						}
						case 3:
						{
							break;
						}
						default:
						{
							throw new NoViableAltException(_t);
						}
						}
						}
					}
					else if ((_t.getType()==SPACE)) {
						spacephrase(_t);
						_t = _retTree;
					}
					else {
						throw new NoViableAltException(_t);
					}
					
					}
					if ( inputState.guessing==0 ) {
						action.formItem(fi1);
					}
					_t = __t372;
					_t = _t.getNextSibling();
				}
				else {
					break _loop378;
				}
				
			} while (true);
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case EXCEPT:
			{
				AST __t380 = _t;
				AST tmp989_AST_in = (AST)_t;
				match(_t,EXCEPT);
				_t = _t.getFirstChild();
				{
				_loop382:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==Field_ref)) {
						fld1(_t,CQ.SYMBOL);
						_t = _retTree;
					}
					else {
						break _loop382;
					}
					
				} while (true);
				}
				_t = __t380;
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t370;
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ENABLE:
			{
				AST __t384 = _t;
				AST tmp990_AST_in = (AST)_t;
				match(_t,ENABLE);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case ALL:
				{
					AST __t386 = _t;
					AST tmp991_AST_in = (AST)_t;
					match(_t,ALL);
					_t = _t.getFirstChild();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case EXCEPT:
					{
						AST __t388 = _t;
						AST tmp992_AST_in = (AST)_t;
						match(_t,EXCEPT);
						_t = _t.getFirstChild();
						{
						_loop390:
						do {
							if (_t==null) _t=ASTNULL;
							if ((_t.getType()==Field_ref)) {
								fld(_t,CQ.SYMBOL);
								_t = _retTree;
							}
							else {
								break _loop390;
							}
							
						} while (true);
						}
						_t = __t388;
						_t = _t.getNextSibling();
						break;
					}
					case 3:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					_t = __t386;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				case Form_item:
				{
					{
					_loop397:
					do {
						if (_t==null) _t=ASTNULL;
						if ((_t.getType()==Form_item)) {
							AST __t392 = _t;
							fi2 = _t==ASTNULL ? null :(AST)_t;
							match(_t,Form_item);
							_t = _t.getFirstChild();
							fld(_t,CQ.SYMBOL);
							_t = _retTree;
							if ( inputState.guessing==0 ) {
								action.formItem(fi2);
							}
							{
							_loop396:
							do {
								if (_t==null) _t=ASTNULL;
								switch ( _t.getType()) {
								case HELP:
								{
									AST __t394 = _t;
									AST tmp993_AST_in = (AST)_t;
									match(_t,HELP);
									_t = _t.getFirstChild();
									constant(_t);
									_t = _retTree;
									_t = __t394;
									_t = _t.getNextSibling();
									break;
								}
								case VALIDATE:
								{
									AST __t395 = _t;
									AST tmp994_AST_in = (AST)_t;
									match(_t,VALIDATE);
									_t = _t.getFirstChild();
									funargs(_t);
									_t = _retTree;
									_t = __t395;
									_t = _t.getNextSibling();
									break;
								}
								case AUTORETURN:
								{
									AST tmp995_AST_in = (AST)_t;
									match(_t,AUTORETURN);
									_t = _t.getNextSibling();
									break;
								}
								case DISABLEAUTOZAP:
								{
									AST tmp996_AST_in = (AST)_t;
									match(_t,DISABLEAUTOZAP);
									_t = _t.getNextSibling();
									break;
								}
								default:
								{
									break _loop396;
								}
								}
							} while (true);
							}
							_t = __t392;
							_t = _t.getNextSibling();
						}
						else {
							break _loop397;
						}
						
					} while (true);
					}
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t384;
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case CONTEXTHELPID:
			case TOOLTIP:
			case WITH:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		case EOF:
		case PERIOD:
		case CONTEXTHELPID:
		case TOOLTIP:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop399:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==WITH)) {
				display_with(_t);
				_t = _retTree;
			}
			else {
				break _loop399;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TOOLTIP:
		{
			tooltip_expr(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case CONTEXTHELPID:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CONTEXTHELPID:
		{
			AST __t402 = _t;
			AST tmp997_AST_in = (AST)_t;
			match(_t,CONTEXTHELPID);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t402;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(pop());
		}
		_t = __t363;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void def_shared(AST _t) throws RecognitionException {
		
		AST def_shared_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case SHARED:
		{
			AST tmp998_AST_in = (AST)_t;
			match(_t,SHARED);
			_t = _t.getNextSibling();
			break;
		}
		case NEW:
		{
			AST __t1934 = _t;
			AST tmp999_AST_in = (AST)_t;
			match(_t,NEW);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case GLOBAL:
			{
				AST tmp1000_AST_in = (AST)_t;
				match(_t,GLOBAL);
				_t = _t.getNextSibling();
				break;
			}
			case SHARED:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1001_AST_in = (AST)_t;
			match(_t,SHARED);
			_t = _t.getNextSibling();
			_t = __t1934;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void lockhow(AST _t) throws RecognitionException {
		
		AST lockhow_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case SHARELOCK:
		{
			AST tmp1002_AST_in = (AST)_t;
			match(_t,SHARELOCK);
			_t = _t.getNextSibling();
			break;
		}
		case EXCLUSIVELOCK:
		{
			AST tmp1003_AST_in = (AST)_t;
			match(_t,EXCLUSIVELOCK);
			_t = _t.getNextSibling();
			break;
		}
		case NOLOCK:
		{
			AST tmp1004_AST_in = (AST)_t;
			match(_t,NOLOCK);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void viewasphrase(AST _t) throws RecognitionException {
		
		AST viewasphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2450 = _t;
		AST tmp1005_AST_in = (AST)_t;
		match(_t,VIEWAS);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case COMBOBOX:
		{
			comboboxphrase(_t);
			_t = _retTree;
			break;
		}
		case EDITOR:
		{
			editorphrase(_t);
			_t = _retTree;
			break;
		}
		case FILLIN:
		{
			fillinphrase(_t);
			_t = _retTree;
			break;
		}
		case RADIOSET:
		{
			radiosetphrase(_t);
			_t = _retTree;
			break;
		}
		case SELECTIONLIST:
		{
			selectionlistphrase(_t);
			_t = _retTree;
			break;
		}
		case SLIDER:
		{
			sliderphrase(_t);
			_t = _retTree;
			break;
		}
		case TEXT:
		{
			textphrase(_t);
			_t = _retTree;
			break;
		}
		case TOGGLEBOX:
		{
			toggleboxphrase(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t2450;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void spacephrase(AST _t) throws RecognitionException {
		
		AST spacephrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2350 = _t;
		AST tmp1006_AST_in = (AST)_t;
		match(_t,SPACE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case LEFTPAREN:
		{
			funargs(_t);
			_t = _retTree;
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t2350;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void display_with(AST _t) throws RecognitionException {
		
		AST display_with_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		boolean synPredMatched1971 = false;
		if (_t==null) _t=ASTNULL;
		if (((_t.getType()==WITH))) {
			AST __t1971 = _t;
			synPredMatched1971 = true;
			inputState.guessing++;
			try {
				{
				AST __t1970 = _t;
				AST tmp1007_AST_in = (AST)_t;
				match(_t,WITH);
				_t = _t.getFirstChild();
				AST tmp1008_AST_in = (AST)_t;
				match(_t,BROWSE);
				_t = _t.getNextSibling();
				AST tmp1009_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				_t = __t1970;
				_t = _t.getNextSibling();
				}
			}
			catch (RecognitionException pe) {
				synPredMatched1971 = false;
			}
			_t = __t1971;
inputState.guessing--;
		}
		if ( synPredMatched1971 ) {
			AST __t1972 = _t;
			AST tmp1010_AST_in = (AST)_t;
			match(_t,WITH);
			_t = _t.getFirstChild();
			AST tmp1011_AST_in = (AST)_t;
			match(_t,BROWSE);
			_t = _t.getNextSibling();
			AST tmp1012_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			_t = __t1972;
			_t = _t.getNextSibling();
		}
		else if ((_t.getType()==WITH)) {
			framephrase(_t);
			_t = _retTree;
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		_retTree = _t;
	}
	
	public final void tooltip_expr(AST _t) throws RecognitionException {
		
		AST tooltip_expr_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2411 = _t;
		AST tmp1013_AST_in = (AST)_t;
		match(_t,TOOLTIP);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case VALUE:
		{
			valueexpression(_t);
			_t = _retTree;
			break;
		}
		case LEXDATE:
		case NUMBER:
		case QSTRING:
		case BIGENDIAN:
		case EXCLUSIVELOCK:
		case FALSE_KW:
		case FINDCASESENSITIVE:
		case FINDGLOBAL:
		case FINDNEXTOCCURRENCE:
		case FINDPREVOCCURRENCE:
		case FINDSELECT:
		case FINDWRAPAROUND:
		case HOSTBYTEORDER:
		case LITTLEENDIAN:
		case NO:
		case NOLOCK:
		case NOWAIT:
		case NULL_KW:
		case READAVAILABLE:
		case READEXACTNUM:
		case SEARCHSELF:
		case SEARCHTARGET:
		case SHARELOCK:
		case TRUE_KW:
		case WINDOWDELAYEDMINIMIZE:
		case WINDOWMAXIMIZED:
		case WINDOWMINIMIZED:
		case WINDOWNORMAL:
		case YES:
		case UNKNOWNVALUE:
		case FUNCTIONCALLTYPE:
		case GETATTRCALLTYPE:
		case PROCEDURECALLTYPE:
		case SAXCOMPLETE:
		case SAXPARSERERROR:
		case SAXRUNNING:
		case SAXUNINITIALIZED:
		case SETATTRCALLTYPE:
		case ROWUNMODIFIED:
		case ROWDELETED:
		case ROWMODIFIED:
		case ROWCREATED:
		{
			constant(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t2411;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void definebufferstate(AST _t) throws RecognitionException {
		
		AST definebufferstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		AST rec = null;
		
		AST __t404 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case BUFFER:
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1014_AST_in = (AST)_t;
		match(_t,BUFFER);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		AST tmp1015_AST_in = (AST)_t;
		match(_t,FOR);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TEMPTABLE:
		{
			AST tmp1016_AST_in = (AST)_t;
			match(_t,TEMPTABLE);
			_t = _t.getNextSibling();
			break;
		}
		case RECORD_NAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		rec = _t==ASTNULL ? null : (AST)_t;
		tbl(_t,CQ.SYMBOL);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.defineBuffer(def, id, rec, false);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PRESELECT:
		{
			AST tmp1017_AST_in = (AST)_t;
			match(_t,PRESELECT);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case COLUMNLABEL:
		case FIELDS:
		case LABEL:
		case NAMESPACEPREFIX:
		case NAMESPACEURI:
		case XMLNODENAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case COLUMNLABEL:
		case LABEL:
		{
			label_constant(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case FIELDS:
		case NAMESPACEPREFIX:
		case NAMESPACEURI:
		case XMLNODENAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NAMESPACEURI:
		{
			namespace_uri(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case FIELDS:
		case NAMESPACEPREFIX:
		case XMLNODENAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NAMESPACEPREFIX:
		{
			namespace_prefix(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case FIELDS:
		case XMLNODENAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case XMLNODENAME:
		{
			xml_node_name(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case FIELDS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FIELDS:
		{
			AST __t413 = _t;
			AST tmp1018_AST_in = (AST)_t;
			match(_t,FIELDS);
			_t = _t.getFirstChild();
			{
			_loop415:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					break _loop415;
				}
				
			} while (true);
			}
			_t = __t413;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t404;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void namespace_uri(AST _t) throws RecognitionException {
		
		AST namespace_uri_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2113 = _t;
		AST tmp1019_AST_in = (AST)_t;
		match(_t,NAMESPACEURI);
		_t = _t.getFirstChild();
		constant(_t);
		_t = _retTree;
		_t = __t2113;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void namespace_prefix(AST _t) throws RecognitionException {
		
		AST namespace_prefix_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2111 = _t;
		AST tmp1020_AST_in = (AST)_t;
		match(_t,NAMESPACEPREFIX);
		_t = _t.getFirstChild();
		constant(_t);
		_t = _retTree;
		_t = __t2111;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void xml_node_name(AST _t) throws RecognitionException {
		
		AST xml_node_name_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2471 = _t;
		AST tmp1021_AST_in = (AST)_t;
		match(_t,XMLNODENAME);
		_t = _t.getFirstChild();
		constant(_t);
		_t = _retTree;
		_t = __t2471;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void definebuttonstate(AST _t) throws RecognitionException {
		
		AST definebuttonstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		
		AST __t417 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case BUTTON:
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1022_AST_in = (AST)_t;
		match(_t,BUTTON);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineSymbol(BUTTON, def, id));
		}
		{
		_loop440:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case AUTOGO:
			{
				AST tmp1023_AST_in = (AST)_t;
				match(_t,AUTOGO);
				_t = _t.getNextSibling();
				break;
			}
			case AUTOENDKEY:
			{
				AST tmp1024_AST_in = (AST)_t;
				match(_t,AUTOENDKEY);
				_t = _t.getNextSibling();
				break;
			}
			case DEFAULT:
			{
				AST tmp1025_AST_in = (AST)_t;
				match(_t,DEFAULT);
				_t = _t.getNextSibling();
				break;
			}
			case BGCOLOR:
			case DCOLOR:
			case FGCOLOR:
			case PFCOLOR:
			{
				color_expr(_t);
				_t = _retTree;
				break;
			}
			case CONTEXTHELPID:
			{
				AST __t420 = _t;
				AST tmp1026_AST_in = (AST)_t;
				match(_t,CONTEXTHELPID);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t420;
				_t = _t.getNextSibling();
				break;
			}
			case DROPTARGET:
			{
				AST tmp1027_AST_in = (AST)_t;
				match(_t,DROPTARGET);
				_t = _t.getNextSibling();
				break;
			}
			case FONT:
			{
				AST __t421 = _t;
				AST tmp1028_AST_in = (AST)_t;
				match(_t,FONT);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t421;
				_t = _t.getNextSibling();
				break;
			}
			case IMAGEDOWN:
			{
				AST __t422 = _t;
				AST tmp1029_AST_in = (AST)_t;
				match(_t,IMAGEDOWN);
				_t = _t.getFirstChild();
				{
				int _cnt424=0;
				_loop424:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_tokenSet_12.member(_t.getType()))) {
						imagephrase_opt(_t);
						_t = _retTree;
					}
					else {
						if ( _cnt424>=1 ) { break _loop424; } else {throw new NoViableAltException(_t);}
					}
					
					_cnt424++;
				} while (true);
				}
				_t = __t422;
				_t = _t.getNextSibling();
				break;
			}
			case IMAGE:
			{
				AST __t425 = _t;
				AST tmp1030_AST_in = (AST)_t;
				match(_t,IMAGE);
				_t = _t.getFirstChild();
				{
				int _cnt427=0;
				_loop427:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_tokenSet_12.member(_t.getType()))) {
						imagephrase_opt(_t);
						_t = _retTree;
					}
					else {
						if ( _cnt427>=1 ) { break _loop427; } else {throw new NoViableAltException(_t);}
					}
					
					_cnt427++;
				} while (true);
				}
				_t = __t425;
				_t = _t.getNextSibling();
				break;
			}
			case IMAGEUP:
			{
				AST __t428 = _t;
				AST tmp1031_AST_in = (AST)_t;
				match(_t,IMAGEUP);
				_t = _t.getFirstChild();
				{
				int _cnt430=0;
				_loop430:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_tokenSet_12.member(_t.getType()))) {
						imagephrase_opt(_t);
						_t = _retTree;
					}
					else {
						if ( _cnt430>=1 ) { break _loop430; } else {throw new NoViableAltException(_t);}
					}
					
					_cnt430++;
				} while (true);
				}
				_t = __t428;
				_t = _t.getNextSibling();
				break;
			}
			case IMAGEINSENSITIVE:
			{
				AST __t431 = _t;
				AST tmp1032_AST_in = (AST)_t;
				match(_t,IMAGEINSENSITIVE);
				_t = _t.getFirstChild();
				{
				int _cnt433=0;
				_loop433:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_tokenSet_12.member(_t.getType()))) {
						imagephrase_opt(_t);
						_t = _retTree;
					}
					else {
						if ( _cnt433>=1 ) { break _loop433; } else {throw new NoViableAltException(_t);}
					}
					
					_cnt433++;
				} while (true);
				}
				_t = __t431;
				_t = _t.getNextSibling();
				break;
			}
			case MOUSEPOINTER:
			{
				AST __t434 = _t;
				AST tmp1033_AST_in = (AST)_t;
				match(_t,MOUSEPOINTER);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t434;
				_t = _t.getNextSibling();
				break;
			}
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case LIKE:
			{
				AST __t435 = _t;
				AST tmp1034_AST_in = (AST)_t;
				match(_t,LIKE);
				_t = _t.getFirstChild();
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case VALIDATE:
				{
					AST tmp1035_AST_in = (AST)_t;
					match(_t,VALIDATE);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t435;
				_t = _t.getNextSibling();
				break;
			}
			case FLATBUTTON:
			{
				AST tmp1036_AST_in = (AST)_t;
				match(_t,FLATBUTTON);
				_t = _t.getNextSibling();
				break;
			}
			case NOFOCUS:
			{
				AST __t437 = _t;
				AST tmp1037_AST_in = (AST)_t;
				match(_t,NOFOCUS);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case FLATBUTTON:
				{
					AST tmp1038_AST_in = (AST)_t;
					match(_t,FLATBUTTON);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t437;
				_t = _t.getNextSibling();
				break;
			}
			case NOCONVERT3DCOLORS:
			{
				AST tmp1039_AST_in = (AST)_t;
				match(_t,NOCONVERT3DCOLORS);
				_t = _t.getNextSibling();
				break;
			}
			case TOOLTIP:
			{
				tooltip_expr(_t);
				_t = _retTree;
				break;
			}
			case SIZE:
			case SIZECHARS:
			case SIZEPIXELS:
			{
				sizephrase(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case MARGINEXTRA:
				{
					AST tmp1040_AST_in = (AST)_t;
					match(_t,MARGINEXTRA);
					_t = _t.getNextSibling();
					break;
				}
				case EOF:
				case PERIOD:
				case AUTOENDKEY:
				case AUTOGO:
				case BGCOLOR:
				case COLUMNLABEL:
				case CONTEXTHELPID:
				case DCOLOR:
				case DEFAULT:
				case DROPTARGET:
				case FGCOLOR:
				case FLATBUTTON:
				case FONT:
				case IMAGE:
				case IMAGEDOWN:
				case IMAGEINSENSITIVE:
				case IMAGEUP:
				case LABEL:
				case LIKE:
				case MOUSEPOINTER:
				case NOCONVERT3DCOLORS:
				case NOFOCUS:
				case PFCOLOR:
				case SIZE:
				case SIZECHARS:
				case SIZEPIXELS:
				case TOOLTIP:
				case TRIGGERS:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				break;
			}
			default:
			{
				break _loop440;
			}
			}
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TRIGGERS:
		{
			triggerphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(pop());
		}
		_t = __t417;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void color_expr(AST _t) throws RecognitionException {
		
		AST color_expr_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BGCOLOR:
		{
			AST __t1752 = _t;
			AST tmp1041_AST_in = (AST)_t;
			match(_t,BGCOLOR);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1752;
			_t = _t.getNextSibling();
			break;
		}
		case DCOLOR:
		{
			AST __t1753 = _t;
			AST tmp1042_AST_in = (AST)_t;
			match(_t,DCOLOR);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1753;
			_t = _t.getNextSibling();
			break;
		}
		case FGCOLOR:
		{
			AST __t1754 = _t;
			AST tmp1043_AST_in = (AST)_t;
			match(_t,FGCOLOR);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1754;
			_t = _t.getNextSibling();
			break;
		}
		case PFCOLOR:
		{
			AST __t1755 = _t;
			AST tmp1044_AST_in = (AST)_t;
			match(_t,PFCOLOR);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1755;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void imagephrase_opt(AST _t) throws RecognitionException {
		
		AST imagephrase_opt_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FILE:
		{
			AST __t2035 = _t;
			AST tmp1045_AST_in = (AST)_t;
			match(_t,FILE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2035;
			_t = _t.getNextSibling();
			break;
		}
		case IMAGESIZE:
		{
			AST __t2036 = _t;
			AST tmp1046_AST_in = (AST)_t;
			match(_t,IMAGESIZE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			AST tmp1047_AST_in = (AST)_t;
			match(_t,BY);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t2036;
			_t = _t.getNextSibling();
			break;
		}
		case IMAGESIZECHARS:
		{
			AST __t2037 = _t;
			AST tmp1048_AST_in = (AST)_t;
			match(_t,IMAGESIZECHARS);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			AST tmp1049_AST_in = (AST)_t;
			match(_t,BY);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t2037;
			_t = _t.getNextSibling();
			break;
		}
		case IMAGESIZEPIXELS:
		{
			AST __t2038 = _t;
			AST tmp1050_AST_in = (AST)_t;
			match(_t,IMAGESIZEPIXELS);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			AST tmp1051_AST_in = (AST)_t;
			match(_t,BY);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t2038;
			_t = _t.getNextSibling();
			break;
		}
		case FROM:
		{
			AST __t2039 = _t;
			AST tmp1052_AST_in = (AST)_t;
			match(_t,FROM);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case X:
			{
				AST tmp1053_AST_in = (AST)_t;
				match(_t,X);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				break;
			}
			case Y:
			{
				AST tmp1054_AST_in = (AST)_t;
				match(_t,Y);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				break;
			}
			case ROW:
			{
				AST tmp1055_AST_in = (AST)_t;
				match(_t,ROW);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				break;
			}
			case COLUMN:
			{
				AST tmp1056_AST_in = (AST)_t;
				match(_t,COLUMN);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case X:
			{
				AST tmp1057_AST_in = (AST)_t;
				match(_t,X);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				break;
			}
			case Y:
			{
				AST tmp1058_AST_in = (AST)_t;
				match(_t,Y);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				break;
			}
			case ROW:
			{
				AST tmp1059_AST_in = (AST)_t;
				match(_t,ROW);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				break;
			}
			case COLUMN:
			{
				AST tmp1060_AST_in = (AST)_t;
				match(_t,COLUMN);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2039;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void sizephrase(AST _t) throws RecognitionException {
		
		AST sizephrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case SIZE:
		{
			AST __t2333 = _t;
			AST tmp1061_AST_in = (AST)_t;
			match(_t,SIZE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			AST tmp1062_AST_in = (AST)_t;
			match(_t,BY);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t2333;
			_t = _t.getNextSibling();
			break;
		}
		case SIZECHARS:
		{
			AST __t2334 = _t;
			AST tmp1063_AST_in = (AST)_t;
			match(_t,SIZECHARS);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			AST tmp1064_AST_in = (AST)_t;
			match(_t,BY);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t2334;
			_t = _t.getNextSibling();
			break;
		}
		case SIZEPIXELS:
		{
			AST __t2335 = _t;
			AST tmp1065_AST_in = (AST)_t;
			match(_t,SIZEPIXELS);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			AST tmp1066_AST_in = (AST)_t;
			match(_t,BY);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t2335;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void definedatasetstate(AST _t) throws RecognitionException {
		
		AST definedatasetstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		AST tb1 = null;
		AST tb2 = null;
		
		AST __t443 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case DATASET:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1067_AST_in = (AST)_t;
		match(_t,DATASET);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineSymbol(DATASET, def, id));
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NAMESPACEURI:
		{
			namespace_uri(_t);
			_t = _retTree;
			break;
		}
		case FOR:
		case NAMESPACEPREFIX:
		case REFERENCEONLY:
		case XMLNODENAME:
		case SERIALIZENAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NAMESPACEPREFIX:
		{
			namespace_prefix(_t);
			_t = _retTree;
			break;
		}
		case FOR:
		case REFERENCEONLY:
		case XMLNODENAME:
		case SERIALIZENAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case XMLNODENAME:
		{
			xml_node_name(_t);
			_t = _retTree;
			break;
		}
		case FOR:
		case REFERENCEONLY:
		case SERIALIZENAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case SERIALIZENAME:
		{
			AST __t449 = _t;
			AST tmp1068_AST_in = (AST)_t;
			match(_t,SERIALIZENAME);
			_t = _t.getFirstChild();
			AST tmp1069_AST_in = (AST)_t;
			match(_t,QSTRING);
			_t = _t.getNextSibling();
			_t = __t449;
			_t = _t.getNextSibling();
			break;
		}
		case FOR:
		case REFERENCEONLY:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case REFERENCEONLY:
		{
			AST tmp1070_AST_in = (AST)_t;
			match(_t,REFERENCEONLY);
			_t = _t.getNextSibling();
			break;
		}
		case FOR:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp1071_AST_in = (AST)_t;
		match(_t,FOR);
		_t = _t.getNextSibling();
		tb1 = _t==ASTNULL ? null : (AST)_t;
		tbl(_t,CQ.INIT);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.datasetTable(tb1);
		}
		{
		_loop452:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp1072_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				tb2 = _t==ASTNULL ? null : (AST)_t;
				tbl(_t,CQ.INIT);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
					action.datasetTable(tb2);
				}
			}
			else {
				break _loop452;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case DATARELATION:
		{
			data_relation(_t);
			_t = _retTree;
			{
			_loop456:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA||_t.getType()==DATARELATION)) {
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case COMMA:
					{
						AST tmp1073_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						break;
					}
					case DATARELATION:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					data_relation(_t);
					_t = _retTree;
				}
				else {
					break _loop456;
				}
				
			} while (true);
			}
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(pop());
		}
		_t = __t443;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void data_relation(AST _t) throws RecognitionException {
		
		AST data_relation_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t458 = _t;
		AST tmp1074_AST_in = (AST)_t;
		match(_t,DATARELATION);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ID:
		{
			AST tmp1075_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case FOR:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp1076_AST_in = (AST)_t;
		match(_t,FOR);
		_t = _t.getNextSibling();
		tbl(_t,CQ.INIT);
		_t = _retTree;
		AST tmp1077_AST_in = (AST)_t;
		match(_t,COMMA);
		_t = _t.getNextSibling();
		tbl(_t,CQ.INIT);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RELATIONFIELDS:
		{
			field_mapping_phrase(_t);
			_t = _retTree;
			break;
		}
		case 3:
		case REPOSITION:
		case NESTED:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop462:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case REPOSITION:
			{
				AST tmp1078_AST_in = (AST)_t;
				match(_t,REPOSITION);
				_t = _t.getNextSibling();
				break;
			}
			case NESTED:
			{
				AST tmp1079_AST_in = (AST)_t;
				match(_t,NESTED);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop462;
			}
			}
		} while (true);
		}
		_t = __t458;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void field_mapping_phrase(AST _t) throws RecognitionException {
		
		AST field_mapping_phrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t464 = _t;
		AST tmp1080_AST_in = (AST)_t;
		match(_t,RELATIONFIELDS);
		_t = _t.getFirstChild();
		AST tmp1081_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		fld2(_t,CQ.SYMBOL);
		_t = _retTree;
		AST tmp1082_AST_in = (AST)_t;
		match(_t,COMMA);
		_t = _t.getNextSibling();
		fld1(_t,CQ.SYMBOL);
		_t = _retTree;
		{
		_loop466:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp1083_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				fld2(_t,CQ.SYMBOL);
				_t = _retTree;
				AST tmp1084_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				fld1(_t,CQ.SYMBOL);
				_t = _retTree;
			}
			else {
				break _loop466;
			}
			
		} while (true);
		}
		AST tmp1085_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t464;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void definedatasourcestate(AST _t) throws RecognitionException {
		
		AST definedatasourcestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		
		AST __t468 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case DATASOURCE:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1086_AST_in = (AST)_t;
		match(_t,DATASOURCE);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineSymbol(DATASOURCE, def, id));
		}
		AST tmp1087_AST_in = (AST)_t;
		match(_t,FOR);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case QUERY:
		{
			AST __t471 = _t;
			AST tmp1088_AST_in = (AST)_t;
			match(_t,QUERY);
			_t = _t.getFirstChild();
			AST tmp1089_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			_t = __t471;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case COMMA:
		case RECORD_NAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RECORD_NAME:
		{
			source_buffer_phrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case COMMA:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop474:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp1090_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				source_buffer_phrase(_t);
				_t = _retTree;
			}
			else {
				break _loop474;
			}
			
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(pop());
		}
		_t = __t468;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void source_buffer_phrase(AST _t) throws RecognitionException {
		
		AST source_buffer_phrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST r = null;
		
		AST __t476 = _t;
		r = _t==ASTNULL ? null :(AST)_t;
		match(_t,RECORD_NAME);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.recordNameNode(r, CQ.INIT);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case KEYS:
		{
			AST tmp1091_AST_in = (AST)_t;
			match(_t,KEYS);
			_t = _t.getNextSibling();
			AST tmp1092_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ROWID:
			{
				AST tmp1093_AST_in = (AST)_t;
				match(_t,ROWID);
				_t = _t.getNextSibling();
				break;
			}
			case Field_ref:
			{
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				{
				_loop480:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COMMA)) {
						AST tmp1094_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						fld(_t,CQ.SYMBOL);
						_t = _retTree;
					}
					else {
						break _loop480;
					}
					
				} while (true);
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1095_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t476;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void defineeventstate(AST _t) throws RecognitionException {
		
		AST defineeventstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		
		AST __t482 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1096_AST_in = (AST)_t;
		match(_t,EVENT);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineEvent(def, id));
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case SIGNATURE:
		{
			AST __t484 = _t;
			AST tmp1097_AST_in = (AST)_t;
			match(_t,SIGNATURE);
			_t = _t.getFirstChild();
			AST tmp1098_AST_in = (AST)_t;
			match(_t,VOID);
			_t = _t.getNextSibling();
			function_params(_t);
			_t = _retTree;
			_t = __t484;
			_t = _t.getNextSibling();
			break;
		}
		case DELEGATE:
		{
			AST __t485 = _t;
			AST tmp1099_AST_in = (AST)_t;
			match(_t,DELEGATE);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case CLASS:
			{
				AST tmp1100_AST_in = (AST)_t;
				match(_t,CLASS);
				_t = _t.getNextSibling();
				break;
			}
			case TYPE_NAME:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1101_AST_in = (AST)_t;
			match(_t,TYPE_NAME);
			_t = _t.getNextSibling();
			_t = __t485;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t482;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(pop());
		}
		_retTree = _t;
	}
	
	public final void defineframestate(AST _t) throws RecognitionException {
		
		AST defineframestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		
		AST __t488 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case FRAME:
		case PRIVATE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PRIVATE:
		{
			AST tmp1102_AST_in = (AST)_t;
			match(_t,PRIVATE);
			_t = _t.getNextSibling();
			break;
		}
		case FRAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp1103_AST_in = (AST)_t;
		match(_t,FRAME);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.frameDef(def, id);
		}
		{
		_loop492:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Form_item)) {
				form_item(_t,CQ.SYMBOL);
				_t = _retTree;
			}
			else {
				break _loop492;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case HEADER:
		{
			AST __t494 = _t;
			AST tmp1104_AST_in = (AST)_t;
			match(_t,HEADER);
			_t = _t.getFirstChild();
			{
			int _cnt496=0;
			_loop496:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Form_item)) {
					display_item(_t);
					_t = _retTree;
				}
				else {
					if ( _cnt496>=1 ) { break _loop496; } else {throw new NoViableAltException(_t);}
				}
				
				_cnt496++;
			} while (true);
			}
			_t = __t494;
			_t = _t.getNextSibling();
			break;
		}
		case BACKGROUND:
		{
			AST __t497 = _t;
			AST tmp1105_AST_in = (AST)_t;
			match(_t,BACKGROUND);
			_t = _t.getFirstChild();
			{
			int _cnt499=0;
			_loop499:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Form_item)) {
					display_item(_t);
					_t = _retTree;
				}
				else {
					if ( _cnt499>=1 ) { break _loop499; } else {throw new NoViableAltException(_t);}
				}
				
				_cnt499++;
			} while (true);
			}
			_t = __t497;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXCEPT:
		{
			AST __t501 = _t;
			AST tmp1106_AST_in = (AST)_t;
			match(_t,EXCEPT);
			_t = _t.getFirstChild();
			{
			_loop503:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					break _loop503;
				}
				
			} while (true);
			}
			_t = __t501;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_t = __t488;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void form_item(AST _t,
		int contextQualifier
	) throws RecognitionException {
		
		AST form_item_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST fi = null;
			int tblQualifier = contextQualifier;
			if (contextQualifier==CQ.SYMBOL) tblQualifier = CQ.BUFFERSYMBOL;
		
		
		AST __t814 = _t;
		fi = _t==ASTNULL ? null :(AST)_t;
		match(_t,Form_item);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RECORD_NAME:
		{
			tbl(_t,tblQualifier);
			_t = _retTree;
			if ( inputState.guessing==0 ) {
				action.formItem(fi);
			}
			break;
		}
		case TEXT:
		{
			AST __t816 = _t;
			AST tmp1107_AST_in = (AST)_t;
			match(_t,TEXT);
			_t = _t.getFirstChild();
			AST tmp1108_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			{
			_loop818:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Form_item)) {
					form_item(_t,contextQualifier);
					_t = _retTree;
				}
				else {
					break _loop818;
				}
				
			} while (true);
			}
			AST tmp1109_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t816;
			_t = _t.getNextSibling();
			break;
		}
		case LEXDATE:
		case NUMBER:
		case QSTRING:
		case BIGENDIAN:
		case EXCLUSIVELOCK:
		case FALSE_KW:
		case FINDCASESENSITIVE:
		case FINDGLOBAL:
		case FINDNEXTOCCURRENCE:
		case FINDPREVOCCURRENCE:
		case FINDSELECT:
		case FINDWRAPAROUND:
		case HOSTBYTEORDER:
		case LITTLEENDIAN:
		case NO:
		case NOLOCK:
		case NOWAIT:
		case NULL_KW:
		case READAVAILABLE:
		case READEXACTNUM:
		case SEARCHSELF:
		case SEARCHTARGET:
		case SHARELOCK:
		case TRUE_KW:
		case WINDOWDELAYEDMINIMIZE:
		case WINDOWMAXIMIZED:
		case WINDOWMINIMIZED:
		case WINDOWNORMAL:
		case YES:
		case UNKNOWNVALUE:
		case FUNCTIONCALLTYPE:
		case GETATTRCALLTYPE:
		case PROCEDURECALLTYPE:
		case SAXCOMPLETE:
		case SAXPARSERERROR:
		case SAXRUNNING:
		case SAXUNINITIALIZED:
		case SETATTRCALLTYPE:
		case ROWUNMODIFIED:
		case ROWDELETED:
		case ROWMODIFIED:
		case ROWCREATED:
		{
			constant(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case Format_phrase:
			{
				formatphrase(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		case SPACE:
		{
			spacephrase(_t);
			_t = _retTree;
			break;
		}
		case SKIP:
		{
			skipphrase(_t);
			_t = _retTree;
			break;
		}
		case WIDGETID:
		{
			widget_id(_t);
			_t = _retTree;
			break;
		}
		case CARET:
		{
			AST tmp1110_AST_in = (AST)_t;
			match(_t,CARET);
			_t = _t.getNextSibling();
			break;
		}
		case Field_ref:
		{
			fld(_t,contextQualifier);
			_t = _retTree;
			if ( inputState.guessing==0 ) {
				action.formItem(fi);
			}
			{
			_loop821:
			do {
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Aggregate_phrase:
				{
					aggregatephrase(_t);
					_t = _retTree;
					break;
				}
				case Format_phrase:
				{
					formatphrase(_t);
					_t = _retTree;
					break;
				}
				default:
				{
					break _loop821;
				}
				}
			} while (true);
			}
			break;
		}
		case EQUAL:
		{
			assign_equal(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t814;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void display_item(AST _t) throws RecognitionException {
		
		AST display_item_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST fi = null;
		
		AST __t722 = _t;
		fi = _t==ASTNULL ? null :(AST)_t;
		match(_t,Form_item);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case SKIP:
		{
			skipphrase(_t);
			_t = _retTree;
			break;
		}
		case SPACE:
		{
			spacephrase(_t);
			_t = _retTree;
			break;
		}
		default:
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_13.member(_t.getType()))) {
				{
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_3.member(_t.getType()))) {
					expression(_t);
					_t = _retTree;
				}
				else if ((_t.getType()==ID)) {
					AST tmp1111_AST_in = (AST)_t;
					match(_t,ID);
					_t = _t.getNextSibling();
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				if ( inputState.guessing==0 ) {
					action.formItem(fi);
				}
				{
				_loop726:
				do {
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case Aggregate_phrase:
					{
						aggregatephrase(_t);
						_t = _retTree;
						break;
					}
					case Format_phrase:
					{
						formatphrase(_t);
						_t = _retTree;
						break;
					}
					default:
					{
						break _loop726;
					}
					}
				} while (true);
				}
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t722;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void defineimagestate(AST _t) throws RecognitionException {
		
		AST defineimagestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		
		AST __t506 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case IMAGE:
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1112_AST_in = (AST)_t;
		match(_t,IMAGE);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineSymbol(IMAGE, def, id));
		}
		{
		_loop513:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LIKE:
			{
				AST __t509 = _t;
				AST tmp1113_AST_in = (AST)_t;
				match(_t,LIKE);
				_t = _t.getFirstChild();
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case VALIDATE:
				{
					AST tmp1114_AST_in = (AST)_t;
					match(_t,VALIDATE);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t509;
				_t = _t.getNextSibling();
				break;
			}
			case FILE:
			case FROM:
			case IMAGESIZE:
			case IMAGESIZECHARS:
			case IMAGESIZEPIXELS:
			{
				imagephrase_opt(_t);
				_t = _retTree;
				break;
			}
			case SIZE:
			case SIZECHARS:
			case SIZEPIXELS:
			{
				sizephrase(_t);
				_t = _retTree;
				break;
			}
			case BGCOLOR:
			case DCOLOR:
			case FGCOLOR:
			case PFCOLOR:
			{
				color_expr(_t);
				_t = _retTree;
				break;
			}
			case CONVERT3DCOLORS:
			{
				AST tmp1115_AST_in = (AST)_t;
				match(_t,CONVERT3DCOLORS);
				_t = _t.getNextSibling();
				break;
			}
			case TOOLTIP:
			{
				tooltip_expr(_t);
				_t = _retTree;
				break;
			}
			case STRETCHTOFIT:
			{
				AST __t511 = _t;
				AST tmp1116_AST_in = (AST)_t;
				match(_t,STRETCHTOFIT);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case RETAINSHAPE:
				{
					AST tmp1117_AST_in = (AST)_t;
					match(_t,RETAINSHAPE);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t511;
				_t = _t.getNextSibling();
				break;
			}
			case TRANSPARENT:
			{
				AST tmp1118_AST_in = (AST)_t;
				match(_t,TRANSPARENT);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop513;
			}
			}
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TRIGGERS:
		{
			triggerphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(pop());
		}
		_t = __t506;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void definemenustate(AST _t) throws RecognitionException {
		
		AST definemenustate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		
		AST __t516 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case MENU:
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1119_AST_in = (AST)_t;
		match(_t,MENU);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineSymbol(MENU, def, id));
		}
		{
		_loop519:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_14.member(_t.getType()))) {
				menu_opt(_t);
				_t = _retTree;
			}
			else {
				break _loop519;
			}
			
		} while (true);
		}
		{
		_loop521:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_15.member(_t.getType()))) {
				menu_list_item(_t);
				_t = _retTree;
			}
			else {
				break _loop521;
			}
			
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(pop());
		}
		_t = __t516;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void menu_opt(AST _t) throws RecognitionException {
		
		AST menu_opt_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BGCOLOR:
		case DCOLOR:
		case FGCOLOR:
		case PFCOLOR:
		{
			color_expr(_t);
			_t = _retTree;
			break;
		}
		case FONT:
		{
			AST __t523 = _t;
			AST tmp1120_AST_in = (AST)_t;
			match(_t,FONT);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t523;
			_t = _t.getNextSibling();
			break;
		}
		case LIKE:
		{
			AST __t524 = _t;
			AST tmp1121_AST_in = (AST)_t;
			match(_t,LIKE);
			_t = _t.getFirstChild();
			fld(_t,CQ.SYMBOL);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case VALIDATE:
			{
				AST tmp1122_AST_in = (AST)_t;
				match(_t,VALIDATE);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t524;
			_t = _t.getNextSibling();
			break;
		}
		case TITLE:
		{
			AST __t526 = _t;
			AST tmp1123_AST_in = (AST)_t;
			match(_t,TITLE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t526;
			_t = _t.getNextSibling();
			break;
		}
		case MENUBAR:
		{
			AST tmp1124_AST_in = (AST)_t;
			match(_t,MENUBAR);
			_t = _t.getNextSibling();
			break;
		}
		case PINNABLE:
		{
			AST tmp1125_AST_in = (AST)_t;
			match(_t,PINNABLE);
			_t = _t.getNextSibling();
			break;
		}
		case SUBMENUHELP:
		{
			AST tmp1126_AST_in = (AST)_t;
			match(_t,SUBMENUHELP);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void menu_list_item(AST _t) throws RecognitionException {
		
		AST menu_list_item_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST id = null;
		AST id2 = null;
		
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case MENUITEM:
		{
			AST __t529 = _t;
			AST tmp1127_AST_in = (AST)_t;
			match(_t,MENUITEM);
			_t = _t.getFirstChild();
			id = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			if ( inputState.guessing==0 ) {
				push(action.defineSymbol(MENUITEM, id, id));
			}
			{
			_loop533:
			do {
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case ACCELERATOR:
				{
					AST __t531 = _t;
					AST tmp1128_AST_in = (AST)_t;
					match(_t,ACCELERATOR);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t531;
					_t = _t.getNextSibling();
					break;
				}
				case BGCOLOR:
				case DCOLOR:
				case FGCOLOR:
				case PFCOLOR:
				{
					color_expr(_t);
					_t = _retTree;
					break;
				}
				case DISABLED:
				{
					AST tmp1129_AST_in = (AST)_t;
					match(_t,DISABLED);
					_t = _t.getNextSibling();
					break;
				}
				case FONT:
				{
					AST __t532 = _t;
					AST tmp1130_AST_in = (AST)_t;
					match(_t,FONT);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t532;
					_t = _t.getNextSibling();
					break;
				}
				case COLUMNLABEL:
				case LABEL:
				{
					label_constant(_t);
					_t = _retTree;
					break;
				}
				case READONLY:
				{
					AST tmp1131_AST_in = (AST)_t;
					match(_t,READONLY);
					_t = _t.getNextSibling();
					break;
				}
				case TOGGLEBOX:
				{
					AST tmp1132_AST_in = (AST)_t;
					match(_t,TOGGLEBOX);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					break _loop533;
				}
				}
			} while (true);
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case TRIGGERS:
			{
				triggerphrase(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.addToSymbolScope(pop());
			}
			_t = __t529;
			_t = _t.getNextSibling();
			break;
		}
		case SUBMENU:
		{
			AST __t535 = _t;
			AST tmp1133_AST_in = (AST)_t;
			match(_t,SUBMENU);
			_t = _t.getFirstChild();
			id2 = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			if ( inputState.guessing==0 ) {
				push(action.defineSymbol(SUBMENU, id2, id2));
			}
			{
			_loop538:
			do {
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case DISABLED:
				{
					AST tmp1134_AST_in = (AST)_t;
					match(_t,DISABLED);
					_t = _t.getNextSibling();
					break;
				}
				case COLUMNLABEL:
				case LABEL:
				{
					label_constant(_t);
					_t = _retTree;
					break;
				}
				case FONT:
				{
					AST __t537 = _t;
					AST tmp1135_AST_in = (AST)_t;
					match(_t,FONT);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t537;
					_t = _t.getNextSibling();
					break;
				}
				case BGCOLOR:
				case DCOLOR:
				case FGCOLOR:
				case PFCOLOR:
				{
					color_expr(_t);
					_t = _retTree;
					break;
				}
				default:
				{
					break _loop538;
				}
				}
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				action.addToSymbolScope(pop());
			}
			_t = __t535;
			_t = _t.getNextSibling();
			break;
		}
		case RULE:
		{
			AST __t539 = _t;
			AST tmp1136_AST_in = (AST)_t;
			match(_t,RULE);
			_t = _t.getFirstChild();
			{
			_loop542:
			do {
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case FONT:
				{
					AST __t541 = _t;
					AST tmp1137_AST_in = (AST)_t;
					match(_t,FONT);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t541;
					_t = _t.getNextSibling();
					break;
				}
				case BGCOLOR:
				case DCOLOR:
				case FGCOLOR:
				case PFCOLOR:
				{
					color_expr(_t);
					_t = _retTree;
					break;
				}
				default:
				{
					break _loop542;
				}
				}
			} while (true);
			}
			_t = __t539;
			_t = _t.getNextSibling();
			break;
		}
		case SKIP:
		{
			AST tmp1138_AST_in = (AST)_t;
			match(_t,SKIP);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		boolean synPredMatched546 = false;
		if (_t==null) _t=ASTNULL;
		if (((_t.getType()==PERIOD))) {
			AST __t546 = _t;
			synPredMatched546 = true;
			inputState.guessing++;
			try {
				{
				AST tmp1139_AST_in = (AST)_t;
				match(_t,PERIOD);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case RULE:
				{
					AST tmp1140_AST_in = (AST)_t;
					match(_t,RULE);
					_t = _t.getNextSibling();
					break;
				}
				case SKIP:
				{
					AST tmp1141_AST_in = (AST)_t;
					match(_t,SKIP);
					_t = _t.getNextSibling();
					break;
				}
				case SUBMENU:
				{
					AST tmp1142_AST_in = (AST)_t;
					match(_t,SUBMENU);
					_t = _t.getNextSibling();
					break;
				}
				case MENUITEM:
				{
					AST tmp1143_AST_in = (AST)_t;
					match(_t,MENUITEM);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				}
			}
			catch (RecognitionException pe) {
				synPredMatched546 = false;
			}
			_t = __t546;
inputState.guessing--;
		}
		if ( synPredMatched546 ) {
			AST tmp1144_AST_in = (AST)_t;
			match(_t,PERIOD);
			_t = _t.getNextSibling();
		}
		else if ((_tokenSet_16.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		_retTree = _t;
	}
	
	public final void defineparameterstate(AST _t) throws RecognitionException {
		
		AST defineparameterstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST buff = null;
		AST bid = null;
		AST brec = null;
		AST tb1 = null;
		AST id = null;
		AST ds = null;
		AST id3 = null;
		AST id2 = null;
		
		AST __t548 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case INPUT:
		case INPUTOUTPUT:
		case OUTPUT:
		case OVERRIDE:
		case PARAMETER:
		case PRIVATE:
		case PUBLIC:
		case RETURN:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PARAMETER:
		{
			AST tmp1145_AST_in = (AST)_t;
			match(_t,PARAMETER);
			_t = _t.getNextSibling();
			buff = (AST)_t;
			match(_t,BUFFER);
			_t = _t.getNextSibling();
			bid = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			AST tmp1146_AST_in = (AST)_t;
			match(_t,FOR);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case TEMPTABLE:
			{
				AST tmp1147_AST_in = (AST)_t;
				match(_t,TEMPTABLE);
				_t = _t.getNextSibling();
				break;
			}
			case RECORD_NAME:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			brec = _t==ASTNULL ? null : (AST)_t;
			tbl(_t,CQ.SYMBOL);
			_t = _retTree;
			if ( inputState.guessing==0 ) {
					action.paramForRoutine(buff);
									action.defineBuffer(def, bid, brec, true);
									action.paramSymbol(bid);
									action.paramProgressType(BUFFER);
								
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PRESELECT:
			{
				AST tmp1148_AST_in = (AST)_t;
				match(_t,PRESELECT);
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case COLUMNLABEL:
			case FIELDS:
			case LABEL:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case EOF:
			case PERIOD:
			case FIELDS:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case FIELDS:
			{
				AST __t555 = _t;
				AST tmp1149_AST_in = (AST)_t;
				match(_t,FIELDS);
				_t = _t.getFirstChild();
				{
				_loop557:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==Field_ref)) {
						fld1(_t,CQ.SYMBOL);
						_t = _retTree;
					}
					else {
						break _loop557;
					}
					
				} while (true);
				}
				_t = __t555;
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		case INPUT:
		case INPUTOUTPUT:
		case OUTPUT:
		case RETURN:
		{
			if ( inputState.guessing==0 ) {
				action.paramForRoutine(_t);
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case INPUT:
			{
				AST tmp1150_AST_in = (AST)_t;
				match(_t,INPUT);
				_t = _t.getNextSibling();
				break;
			}
			case OUTPUT:
			{
				AST tmp1151_AST_in = (AST)_t;
				match(_t,OUTPUT);
				_t = _t.getNextSibling();
				break;
			}
			case INPUTOUTPUT:
			{
				AST tmp1152_AST_in = (AST)_t;
				match(_t,INPUTOUTPUT);
				_t = _t.getNextSibling();
				break;
			}
			case RETURN:
			{
				AST tmp1153_AST_in = (AST)_t;
				match(_t,RETURN);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1154_AST_in = (AST)_t;
			match(_t,PARAMETER);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case TABLE:
			{
				AST tmp1155_AST_in = (AST)_t;
				match(_t,TABLE);
				_t = _t.getNextSibling();
				AST tmp1156_AST_in = (AST)_t;
				match(_t,FOR);
				_t = _t.getNextSibling();
				tb1 = _t==ASTNULL ? null : (AST)_t;
				tbl(_t,CQ.TEMPTABLESYMBOL);
				_t = _retTree;
				defineparam_ab(_t);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
						action.paramProgressType(TEMPTABLE);
											action.paramSymbol(tb1);
										
				}
				break;
			}
			case TABLEHANDLE:
			{
				AST tmp1157_AST_in = (AST)_t;
				match(_t,TABLEHANDLE);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case FOR:
				{
					AST tmp1158_AST_in = (AST)_t;
					match(_t,FOR);
					_t = _t.getNextSibling();
					break;
				}
				case ID:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				id = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				defineparam_ab(_t);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
						action.addToSymbolScope(action.defineVariable(def, id, HANDLE));
											action.paramSymbol(id);
										
				}
				break;
			}
			case DATASET:
			{
				AST tmp1159_AST_in = (AST)_t;
				match(_t,DATASET);
				_t = _t.getNextSibling();
				AST tmp1160_AST_in = (AST)_t;
				match(_t,FOR);
				_t = _t.getNextSibling();
				ds = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				defineparam_ab(_t);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
						action.setSymbol(DATASET, ds);
											action.paramProgressType(DATASET);
											action.paramSymbol(ds);
										
				}
				break;
			}
			case DATASETHANDLE:
			{
				AST tmp1161_AST_in = (AST)_t;
				match(_t,DATASETHANDLE);
				_t = _t.getNextSibling();
				id3 = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				defineparam_ab(_t);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
						action.addToSymbolScope(action.defineVariable(def, id3, HANDLE));
											action.paramSymbol(id3);
										
				}
				break;
			}
			case ID:
			{
				id2 = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
						push(action.defineVariable(def, id2));
											action.paramSymbol(id2);
										
				}
				defineparam_var(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case TRIGGERS:
				{
					triggerphrase(_t);
					_t = _retTree;
					break;
				}
				case EOF:
				case PERIOD:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				if ( inputState.guessing==0 ) {
					action.addToSymbolScope(pop());
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t548;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.paramEnd();
		}
		_retTree = _t;
	}
	
	public final void defineparam_ab(AST _t) throws RecognitionException {
		
		AST defineparam_ab_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		{
		_loop564:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case APPEND:
			{
				AST tmp1162_AST_in = (AST)_t;
				match(_t,APPEND);
				_t = _t.getNextSibling();
				break;
			}
			case BYVALUE:
			{
				AST tmp1163_AST_in = (AST)_t;
				match(_t,BYVALUE);
				_t = _t.getNextSibling();
				break;
			}
			case BIND:
			{
				AST tmp1164_AST_in = (AST)_t;
				match(_t,BIND);
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
					action.paramBind();
				}
				break;
			}
			default:
			{
				break _loop564;
			}
			}
		} while (true);
		}
		_retTree = _t;
	}
	
	public final void defineparam_var(AST _t) throws RecognitionException {
		
		AST defineparam_var_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST as = null;
		AST li = null;
		
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==AS)) {
			AST __t567 = _t;
			as = _t==ASTNULL ? null :(AST)_t;
			match(_t,AS);
			_t = _t.getFirstChild();
			{
			boolean synPredMatched571 = false;
			if (_t==null) _t=ASTNULL;
			if (((_t.getType()==HANDLE))) {
				AST __t571 = _t;
				synPredMatched571 = true;
				inputState.guessing++;
				try {
					{
					AST tmp1165_AST_in = (AST)_t;
					match(_t,HANDLE);
					_t = _t.getNextSibling();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case TO:
					{
						AST tmp1166_AST_in = (AST)_t;
						match(_t,TO);
						_t = _t.getNextSibling();
						break;
					}
					case BYTE:
					case CHARACTER:
					case DOUBLE:
					case FLOAT:
					case LONG:
					case SHORT:
					case UNSIGNEDSHORT:
					case INT64:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					datatype_dll(_t);
					_t = _retTree;
					}
				}
				catch (RecognitionException pe) {
					synPredMatched571 = false;
				}
				_t = __t571;
inputState.guessing--;
			}
			if ( synPredMatched571 ) {
				AST tmp1167_AST_in = (AST)_t;
				match(_t,HANDLE);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case TO:
				{
					AST tmp1168_AST_in = (AST)_t;
					match(_t,TO);
					_t = _t.getNextSibling();
					break;
				}
				case BYTE:
				case CHARACTER:
				case DOUBLE:
				case FLOAT:
				case LONG:
				case SHORT:
				case UNSIGNEDSHORT:
				case INT64:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				datatype_dll(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==CLASS)) {
				AST tmp1169_AST_in = (AST)_t;
				match(_t,CLASS);
				_t = _t.getNextSibling();
				AST tmp1170_AST_in = (AST)_t;
				match(_t,TYPE_NAME);
				_t = _t.getNextSibling();
			}
			else if ((_tokenSet_17.member(_t.getType()))) {
				datatype_param(_t);
				_t = _retTree;
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t567;
			_t = _t.getNextSibling();
			if ( inputState.guessing==0 ) {
				action.defAs(as);
			}
		}
		else if ((_tokenSet_18.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		_loop578:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case CASESENSITIVE:
			case Not_casesens:
			{
				casesens_or_not(_t);
				_t = _retTree;
				break;
			}
			case DECIMALS:
			{
				AST __t575 = _t;
				AST tmp1171_AST_in = (AST)_t;
				match(_t,DECIMALS);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t575;
				_t = _t.getNextSibling();
				break;
			}
			case LIKE:
			{
				AST __t576 = _t;
				li = _t==ASTNULL ? null :(AST)_t;
				match(_t,LIKE);
				_t = _t.getFirstChild();
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case VALIDATE:
				{
					AST tmp1172_AST_in = (AST)_t;
					match(_t,VALIDATE);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				if ( inputState.guessing==0 ) {
					action.defLike(li);
				}
				_t = __t576;
				_t = _t.getNextSibling();
				break;
			}
			case INITIAL:
			{
				initial_constant(_t);
				_t = _retTree;
				break;
			}
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case NOUNDO:
			{
				AST tmp1173_AST_in = (AST)_t;
				match(_t,NOUNDO);
				_t = _t.getNextSibling();
				break;
			}
			case EXTENT:
			{
				extentphrase_def_symbol(_t);
				_t = _retTree;
				break;
			}
			default:
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==FORMAT)) {
					AST __t574 = _t;
					AST tmp1174_AST_in = (AST)_t;
					match(_t,FORMAT);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t574;
					_t = _t.getNextSibling();
				}
			else {
				break _loop578;
			}
			}
		} while (true);
		}
		_retTree = _t;
	}
	
	public final void datatype_dll(AST _t) throws RecognitionException {
		
		AST datatype_dll_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CHARACTER:
		{
			AST tmp1175_AST_in = (AST)_t;
			match(_t,CHARACTER);
			_t = _t.getNextSibling();
			break;
		}
		case INT64:
		{
			AST tmp1176_AST_in = (AST)_t;
			match(_t,INT64);
			_t = _t.getNextSibling();
			break;
		}
		case BYTE:
		case DOUBLE:
		case FLOAT:
		case LONG:
		case SHORT:
		case UNSIGNEDSHORT:
		{
			datatype_dll_native(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void datatype_param(AST _t) throws RecognitionException {
		
		AST datatype_param_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BYTE:
		case DOUBLE:
		case FLOAT:
		case LONG:
		case SHORT:
		case UNSIGNEDSHORT:
		{
			datatype_dll_native(_t);
			_t = _retTree;
			break;
		}
		case CHARACTER:
		case COMHANDLE:
		case DATE:
		case DECIMAL:
		case HANDLE:
		case INTEGER:
		case LOGICAL:
		case MEMPTR:
		case RAW:
		case RECID:
		case ROWID:
		case WIDGETHANDLE:
		case DATETIME:
		case DATETIMETZ:
		case LONGCHAR:
		case TYPE_NAME:
		case INT64:
		{
			datatype_var(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void casesens_or_not(AST _t) throws RecognitionException {
		
		AST casesens_or_not_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Not_casesens:
		{
			AST __t1728 = _t;
			AST tmp1177_AST_in = (AST)_t;
			match(_t,Not_casesens);
			_t = _t.getFirstChild();
			AST tmp1178_AST_in = (AST)_t;
			match(_t,NOT);
			_t = _t.getNextSibling();
			AST tmp1179_AST_in = (AST)_t;
			match(_t,CASESENSITIVE);
			_t = _t.getNextSibling();
			_t = __t1728;
			_t = _t.getNextSibling();
			break;
		}
		case CASESENSITIVE:
		{
			AST tmp1180_AST_in = (AST)_t;
			match(_t,CASESENSITIVE);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void initial_constant(AST _t) throws RecognitionException {
		
		AST initial_constant_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2043 = _t;
		AST tmp1181_AST_in = (AST)_t;
		match(_t,INITIAL);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case LEFTBRACE:
		{
			AST tmp1182_AST_in = (AST)_t;
			match(_t,LEFTBRACE);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case TODAY:
			{
				AST tmp1183_AST_in = (AST)_t;
				match(_t,TODAY);
				_t = _t.getNextSibling();
				break;
			}
			case NOW:
			{
				AST tmp1184_AST_in = (AST)_t;
				match(_t,NOW);
				_t = _t.getNextSibling();
				break;
			}
			case LEXDATE:
			case NUMBER:
			case QSTRING:
			case BIGENDIAN:
			case EXCLUSIVELOCK:
			case FALSE_KW:
			case FINDCASESENSITIVE:
			case FINDGLOBAL:
			case FINDNEXTOCCURRENCE:
			case FINDPREVOCCURRENCE:
			case FINDSELECT:
			case FINDWRAPAROUND:
			case HOSTBYTEORDER:
			case LITTLEENDIAN:
			case NO:
			case NOLOCK:
			case NOWAIT:
			case NULL_KW:
			case READAVAILABLE:
			case READEXACTNUM:
			case SEARCHSELF:
			case SEARCHTARGET:
			case SHARELOCK:
			case TRUE_KW:
			case WINDOWDELAYEDMINIMIZE:
			case WINDOWMAXIMIZED:
			case WINDOWMINIMIZED:
			case WINDOWNORMAL:
			case YES:
			case UNKNOWNVALUE:
			case FUNCTIONCALLTYPE:
			case GETATTRCALLTYPE:
			case PROCEDURECALLTYPE:
			case SAXCOMPLETE:
			case SAXPARSERERROR:
			case SAXRUNNING:
			case SAXUNINITIALIZED:
			case SETATTRCALLTYPE:
			case ROWUNMODIFIED:
			case ROWDELETED:
			case ROWMODIFIED:
			case ROWCREATED:
			{
				constant(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			_loop2048:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA)) {
					AST tmp1185_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case TODAY:
					{
						AST tmp1186_AST_in = (AST)_t;
						match(_t,TODAY);
						_t = _t.getNextSibling();
						break;
					}
					case NOW:
					{
						AST tmp1187_AST_in = (AST)_t;
						match(_t,NOW);
						_t = _t.getNextSibling();
						break;
					}
					case LEXDATE:
					case NUMBER:
					case QSTRING:
					case BIGENDIAN:
					case EXCLUSIVELOCK:
					case FALSE_KW:
					case FINDCASESENSITIVE:
					case FINDGLOBAL:
					case FINDNEXTOCCURRENCE:
					case FINDPREVOCCURRENCE:
					case FINDSELECT:
					case FINDWRAPAROUND:
					case HOSTBYTEORDER:
					case LITTLEENDIAN:
					case NO:
					case NOLOCK:
					case NOWAIT:
					case NULL_KW:
					case READAVAILABLE:
					case READEXACTNUM:
					case SEARCHSELF:
					case SEARCHTARGET:
					case SHARELOCK:
					case TRUE_KW:
					case WINDOWDELAYEDMINIMIZE:
					case WINDOWMAXIMIZED:
					case WINDOWMINIMIZED:
					case WINDOWNORMAL:
					case YES:
					case UNKNOWNVALUE:
					case FUNCTIONCALLTYPE:
					case GETATTRCALLTYPE:
					case PROCEDURECALLTYPE:
					case SAXCOMPLETE:
					case SAXPARSERERROR:
					case SAXRUNNING:
					case SAXUNINITIALIZED:
					case SETATTRCALLTYPE:
					case ROWUNMODIFIED:
					case ROWDELETED:
					case ROWMODIFIED:
					case ROWCREATED:
					{
						constant(_t);
						_t = _retTree;
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
				}
				else {
					break _loop2048;
				}
				
			} while (true);
			}
			AST tmp1188_AST_in = (AST)_t;
			match(_t,RIGHTBRACE);
			_t = _t.getNextSibling();
			break;
		}
		case LEXDATE:
		case NUMBER:
		case QSTRING:
		case BIGENDIAN:
		case EXCLUSIVELOCK:
		case FALSE_KW:
		case FINDCASESENSITIVE:
		case FINDGLOBAL:
		case FINDNEXTOCCURRENCE:
		case FINDPREVOCCURRENCE:
		case FINDSELECT:
		case FINDWRAPAROUND:
		case HOSTBYTEORDER:
		case LITTLEENDIAN:
		case NO:
		case NOLOCK:
		case NOWAIT:
		case NULL_KW:
		case READAVAILABLE:
		case READEXACTNUM:
		case SEARCHSELF:
		case SEARCHTARGET:
		case SHARELOCK:
		case TODAY:
		case TRUE_KW:
		case WINDOWDELAYEDMINIMIZE:
		case WINDOWMAXIMIZED:
		case WINDOWMINIMIZED:
		case WINDOWNORMAL:
		case YES:
		case UNKNOWNVALUE:
		case FUNCTIONCALLTYPE:
		case GETATTRCALLTYPE:
		case PROCEDURECALLTYPE:
		case SAXCOMPLETE:
		case SAXPARSERERROR:
		case SAXRUNNING:
		case SAXUNINITIALIZED:
		case SETATTRCALLTYPE:
		case NOW:
		case ROWUNMODIFIED:
		case ROWDELETED:
		case ROWMODIFIED:
		case ROWCREATED:
		{
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case TODAY:
			{
				AST tmp1189_AST_in = (AST)_t;
				match(_t,TODAY);
				_t = _t.getNextSibling();
				break;
			}
			case NOW:
			{
				AST tmp1190_AST_in = (AST)_t;
				match(_t,NOW);
				_t = _t.getNextSibling();
				break;
			}
			case LEXDATE:
			case NUMBER:
			case QSTRING:
			case BIGENDIAN:
			case EXCLUSIVELOCK:
			case FALSE_KW:
			case FINDCASESENSITIVE:
			case FINDGLOBAL:
			case FINDNEXTOCCURRENCE:
			case FINDPREVOCCURRENCE:
			case FINDSELECT:
			case FINDWRAPAROUND:
			case HOSTBYTEORDER:
			case LITTLEENDIAN:
			case NO:
			case NOLOCK:
			case NOWAIT:
			case NULL_KW:
			case READAVAILABLE:
			case READEXACTNUM:
			case SEARCHSELF:
			case SEARCHTARGET:
			case SHARELOCK:
			case TRUE_KW:
			case WINDOWDELAYEDMINIMIZE:
			case WINDOWMAXIMIZED:
			case WINDOWMINIMIZED:
			case WINDOWNORMAL:
			case YES:
			case UNKNOWNVALUE:
			case FUNCTIONCALLTYPE:
			case GETATTRCALLTYPE:
			case PROCEDURECALLTYPE:
			case SAXCOMPLETE:
			case SAXPARSERERROR:
			case SAXRUNNING:
			case SAXUNINITIALIZED:
			case SETATTRCALLTYPE:
			case ROWUNMODIFIED:
			case ROWDELETED:
			case ROWMODIFIED:
			case ROWCREATED:
			{
				constant(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t2043;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void extentphrase_def_symbol(AST _t) throws RecognitionException {
		
		AST extentphrase_def_symbol_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST ex = null;
		
		AST __t779 = _t;
		ex = _t==ASTNULL ? null :(AST)_t;
		match(_t,EXTENT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else if ((_t.getType()==3)) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		if ( inputState.guessing==0 ) {
			action.defExtent(ex);
		}
		_t = __t779;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void definepropertystate(AST _t) throws RecognitionException {
		
		AST definepropertystate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		AST as = null;
		
		AST __t580 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1191_AST_in = (AST)_t;
		match(_t,PROPERTY);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineVariable(def, id));
		}
		as = (AST)_t;
		match(_t,AS);
		_t = _t.getNextSibling();
		datatype(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.defAs(as);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXTENT:
		{
			extentphrase_def_symbol(_t);
			_t = _retTree;
			break;
		}
		case INITIAL:
		case NOUNDO:
		case Property_getter:
		case Property_setter:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop583:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case INITIAL:
			{
				initial_constant(_t);
				_t = _retTree;
				break;
			}
			case NOUNDO:
			{
				AST tmp1192_AST_in = (AST)_t;
				match(_t,NOUNDO);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop583;
			}
			}
		} while (true);
		}
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(pop());
		}
		defineproperty_accessor(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Property_getter:
		case Property_setter:
		{
			defineproperty_accessor(_t);
			_t = _retTree;
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t580;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void datatype(AST _t) throws RecognitionException {
		
		AST datatype_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CLASS:
		{
			AST tmp1193_AST_in = (AST)_t;
			match(_t,CLASS);
			_t = _t.getNextSibling();
			AST tmp1194_AST_in = (AST)_t;
			match(_t,TYPE_NAME);
			_t = _t.getNextSibling();
			break;
		}
		case CHARACTER:
		case COMHANDLE:
		case DATE:
		case DECIMAL:
		case HANDLE:
		case INTEGER:
		case LOGICAL:
		case MEMPTR:
		case RAW:
		case RECID:
		case ROWID:
		case WIDGETHANDLE:
		case DATETIME:
		case DATETIMETZ:
		case LONGCHAR:
		case TYPE_NAME:
		case INT64:
		{
			datatype_var(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void defineproperty_accessor(AST _t) throws RecognitionException {
		
		AST defineproperty_accessor_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Property_getter:
		{
			AST __t1940 = _t;
			AST tmp1195_AST_in = (AST)_t;
			match(_t,Property_getter);
			_t = _t.getFirstChild();
			def_modifiers(_t);
			_t = _retTree;
			AST tmp1196_AST_in = (AST)_t;
			match(_t,GET);
			_t = _t.getNextSibling();
			{
			boolean synPredMatched1943 = false;
			if (_t==null) _t=ASTNULL;
			if (((_t.getType()==PERIOD))) {
				AST __t1943 = _t;
				synPredMatched1943 = true;
				inputState.guessing++;
				try {
					{
					AST tmp1197_AST_in = (AST)_t;
					match(_t,PERIOD);
					_t = _t.getNextSibling();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched1943 = false;
				}
				_t = __t1943;
inputState.guessing--;
			}
			if ( synPredMatched1943 ) {
				AST tmp1198_AST_in = (AST)_t;
				match(_t,PERIOD);
				_t = _t.getNextSibling();
			}
			else if ((_t.getType()==PERIOD||_t.getType()==LEXCOLON||_t.getType()==Parameter_list)) {
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Parameter_list:
				{
					function_params(_t);
					_t = _retTree;
					break;
				}
				case PERIOD:
				case LEXCOLON:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				block_colon(_t);
				_t = _retTree;
				code_block(_t);
				_t = _retTree;
				AST tmp1199_AST_in = (AST)_t;
				match(_t,END);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case GET:
				{
					AST tmp1200_AST_in = (AST)_t;
					match(_t,GET);
					_t = _t.getNextSibling();
					break;
				}
				case PERIOD:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				AST tmp1201_AST_in = (AST)_t;
				match(_t,PERIOD);
				_t = _t.getNextSibling();
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t1940;
			_t = _t.getNextSibling();
			break;
		}
		case Property_setter:
		{
			AST __t1946 = _t;
			AST tmp1202_AST_in = (AST)_t;
			match(_t,Property_setter);
			_t = _t.getFirstChild();
			def_modifiers(_t);
			_t = _retTree;
			AST tmp1203_AST_in = (AST)_t;
			match(_t,SET);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PERIOD:
			{
				AST tmp1204_AST_in = (AST)_t;
				match(_t,PERIOD);
				_t = _t.getNextSibling();
				break;
			}
			case Parameter_list:
			{
				function_params(_t);
				_t = _retTree;
				block_colon(_t);
				_t = _retTree;
				code_block(_t);
				_t = _retTree;
				AST tmp1205_AST_in = (AST)_t;
				match(_t,END);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case SET:
				{
					AST tmp1206_AST_in = (AST)_t;
					match(_t,SET);
					_t = _t.getNextSibling();
					break;
				}
				case PERIOD:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				AST tmp1207_AST_in = (AST)_t;
				match(_t,PERIOD);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1946;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void definequerystate(AST _t) throws RecognitionException {
		
		AST definequerystate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		
		AST __t586 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case QUERY:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1208_AST_in = (AST)_t;
		match(_t,QUERY);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineSymbol(QUERY, def, id));
		}
		AST tmp1209_AST_in = (AST)_t;
		match(_t,FOR);
		_t = _t.getNextSibling();
		tbl(_t,CQ.INIT);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXCEPT:
		case FIELDS:
		{
			record_fields(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case CACHE:
		case RCODEINFORMATION:
		case SCROLLING:
		case COMMA:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop591:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp1210_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				tbl(_t,CQ.INIT);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EXCEPT:
				case FIELDS:
				{
					record_fields(_t);
					_t = _retTree;
					break;
				}
				case EOF:
				case PERIOD:
				case CACHE:
				case RCODEINFORMATION:
				case SCROLLING:
				case COMMA:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
			}
			else {
				break _loop591;
			}
			
		} while (true);
		}
		{
		_loop594:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case CACHE:
			{
				AST __t593 = _t;
				AST tmp1211_AST_in = (AST)_t;
				match(_t,CACHE);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t593;
				_t = _t.getNextSibling();
				break;
			}
			case SCROLLING:
			{
				AST tmp1212_AST_in = (AST)_t;
				match(_t,SCROLLING);
				_t = _t.getNextSibling();
				break;
			}
			case RCODEINFORMATION:
			{
				AST tmp1213_AST_in = (AST)_t;
				match(_t,RCODEINFORMATION);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop594;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t586;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(pop());
		}
		_retTree = _t;
	}
	
	public final void record_fields(AST _t) throws RecognitionException {
		
		AST record_fields_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FIELDS:
		{
			AST __t1083 = _t;
			AST tmp1214_AST_in = (AST)_t;
			match(_t,FIELDS);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				AST tmp1215_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				{
				_loop1088:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==Field_ref)) {
						fld1(_t,CQ.SYMBOL);
						_t = _retTree;
						{
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case WHEN:
						{
							AST __t1087 = _t;
							AST tmp1216_AST_in = (AST)_t;
							match(_t,WHEN);
							_t = _t.getFirstChild();
							expression(_t);
							_t = _retTree;
							_t = __t1087;
							_t = _t.getNextSibling();
							break;
						}
						case RIGHTPAREN:
						case Field_ref:
						{
							break;
						}
						default:
						{
							throw new NoViableAltException(_t);
						}
						}
						}
					}
					else {
						break _loop1088;
					}
					
				} while (true);
				}
				AST tmp1217_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1083;
			_t = _t.getNextSibling();
			break;
		}
		case EXCEPT:
		{
			AST __t1089 = _t;
			AST tmp1218_AST_in = (AST)_t;
			match(_t,EXCEPT);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				AST tmp1219_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				{
				_loop1094:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==Field_ref)) {
						fld1(_t,CQ.SYMBOL);
						_t = _retTree;
						{
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case WHEN:
						{
							AST __t1093 = _t;
							AST tmp1220_AST_in = (AST)_t;
							match(_t,WHEN);
							_t = _t.getFirstChild();
							expression(_t);
							_t = _retTree;
							_t = __t1093;
							_t = _t.getNextSibling();
							break;
						}
						case RIGHTPAREN:
						case Field_ref:
						{
							break;
						}
						default:
						{
							throw new NoViableAltException(_t);
						}
						}
						}
					}
					else {
						break _loop1094;
					}
					
				} while (true);
				}
				AST tmp1221_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1089;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void definerectanglestate(AST _t) throws RecognitionException {
		
		AST definerectanglestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		
		AST __t596 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case RECTANGLE:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1222_AST_in = (AST)_t;
		match(_t,RECTANGLE);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineSymbol(RECTANGLE, def, id));
		}
		{
		_loop603:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOFILL:
			{
				AST tmp1223_AST_in = (AST)_t;
				match(_t,NOFILL);
				_t = _t.getNextSibling();
				break;
			}
			case EDGECHARS:
			{
				AST __t599 = _t;
				AST tmp1224_AST_in = (AST)_t;
				match(_t,EDGECHARS);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t599;
				_t = _t.getNextSibling();
				break;
			}
			case EDGEPIXELS:
			{
				AST __t600 = _t;
				AST tmp1225_AST_in = (AST)_t;
				match(_t,EDGEPIXELS);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t600;
				_t = _t.getNextSibling();
				break;
			}
			case BGCOLOR:
			case DCOLOR:
			case FGCOLOR:
			case PFCOLOR:
			{
				color_expr(_t);
				_t = _retTree;
				break;
			}
			case GRAPHICEDGE:
			{
				AST tmp1226_AST_in = (AST)_t;
				match(_t,GRAPHICEDGE);
				_t = _t.getNextSibling();
				break;
			}
			case LIKE:
			{
				AST __t601 = _t;
				AST tmp1227_AST_in = (AST)_t;
				match(_t,LIKE);
				_t = _t.getFirstChild();
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case VALIDATE:
				{
					AST tmp1228_AST_in = (AST)_t;
					match(_t,VALIDATE);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t601;
				_t = _t.getNextSibling();
				break;
			}
			case SIZE:
			case SIZECHARS:
			case SIZEPIXELS:
			{
				sizephrase(_t);
				_t = _retTree;
				break;
			}
			case TOOLTIP:
			{
				tooltip_expr(_t);
				_t = _retTree;
				break;
			}
			case ROUNDED:
			{
				AST tmp1229_AST_in = (AST)_t;
				match(_t,ROUNDED);
				_t = _t.getNextSibling();
				break;
			}
			case GROUPBOX:
			{
				AST tmp1230_AST_in = (AST)_t;
				match(_t,GROUPBOX);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop603;
			}
			}
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TRIGGERS:
		{
			triggerphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t596;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(pop());
		}
		_retTree = _t;
	}
	
	public final void definestreamstate(AST _t) throws RecognitionException {
		
		AST definestreamstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		
		AST __t606 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case STREAM:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1231_AST_in = (AST)_t;
		match(_t,STREAM);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t606;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(action.defineSymbol(STREAM, def, id));
		}
		_retTree = _t;
	}
	
	public final void definesubmenustate(AST _t) throws RecognitionException {
		
		AST definesubmenustate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		
		AST __t609 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case SUBMENU:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1232_AST_in = (AST)_t;
		match(_t,SUBMENU);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineSymbol(SUBMENU, def, id));
		}
		{
		_loop612:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_14.member(_t.getType()))) {
				menu_opt(_t);
				_t = _retTree;
			}
			else {
				break _loop612;
			}
			
		} while (true);
		}
		{
		_loop614:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_15.member(_t.getType()))) {
				menu_list_item(_t);
				_t = _retTree;
			}
			else {
				break _loop614;
			}
			
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t609;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(pop());
		}
		_retTree = _t;
	}
	
	public final void definetemptablestate(AST _t) throws RecognitionException {
		
		AST definetemptablestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		AST bt = null;
		
		AST __t616 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case TEMPTABLE:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1233_AST_in = (AST)_t;
		match(_t,TEMPTABLE);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
				action.defineTemptable(def, id);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case UNDO:
		{
			AST tmp1234_AST_in = (AST)_t;
			match(_t,UNDO);
			_t = _t.getNextSibling();
			break;
		}
		case NOUNDO:
		{
			AST tmp1235_AST_in = (AST)_t;
			match(_t,NOUNDO);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case COLUMNLABEL:
		case FIELD:
		case INDEX:
		case LABEL:
		case LIKE:
		case RCODEINFORMATION:
		case BEFORETABLE:
		case NAMESPACEPREFIX:
		case NAMESPACEURI:
		case REFERENCEONLY:
		case LIKESEQUENTIAL:
		case XMLNODENAME:
		case SERIALIZENAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NAMESPACEURI:
		{
			namespace_uri(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case COLUMNLABEL:
		case FIELD:
		case INDEX:
		case LABEL:
		case LIKE:
		case RCODEINFORMATION:
		case BEFORETABLE:
		case NAMESPACEPREFIX:
		case REFERENCEONLY:
		case LIKESEQUENTIAL:
		case XMLNODENAME:
		case SERIALIZENAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NAMESPACEPREFIX:
		{
			namespace_prefix(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case COLUMNLABEL:
		case FIELD:
		case INDEX:
		case LABEL:
		case LIKE:
		case RCODEINFORMATION:
		case BEFORETABLE:
		case REFERENCEONLY:
		case LIKESEQUENTIAL:
		case XMLNODENAME:
		case SERIALIZENAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case XMLNODENAME:
		{
			xml_node_name(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case COLUMNLABEL:
		case FIELD:
		case INDEX:
		case LABEL:
		case LIKE:
		case RCODEINFORMATION:
		case BEFORETABLE:
		case REFERENCEONLY:
		case LIKESEQUENTIAL:
		case SERIALIZENAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case SERIALIZENAME:
		{
			AST __t623 = _t;
			AST tmp1236_AST_in = (AST)_t;
			match(_t,SERIALIZENAME);
			_t = _t.getFirstChild();
			AST tmp1237_AST_in = (AST)_t;
			match(_t,QSTRING);
			_t = _t.getNextSibling();
			_t = __t623;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case COLUMNLABEL:
		case FIELD:
		case INDEX:
		case LABEL:
		case LIKE:
		case RCODEINFORMATION:
		case BEFORETABLE:
		case REFERENCEONLY:
		case LIKESEQUENTIAL:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case REFERENCEONLY:
		{
			AST tmp1238_AST_in = (AST)_t;
			match(_t,REFERENCEONLY);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case COLUMNLABEL:
		case FIELD:
		case INDEX:
		case LABEL:
		case LIKE:
		case RCODEINFORMATION:
		case BEFORETABLE:
		case LIKESEQUENTIAL:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case LIKE:
		case LIKESEQUENTIAL:
		{
			def_table_like(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case COLUMNLABEL:
		case FIELD:
		case INDEX:
		case LABEL:
		case RCODEINFORMATION:
		case BEFORETABLE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case COLUMNLABEL:
		case LABEL:
		{
			label_constant(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case FIELD:
		case INDEX:
		case RCODEINFORMATION:
		case BEFORETABLE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BEFORETABLE:
		{
			AST __t628 = _t;
			AST tmp1239_AST_in = (AST)_t;
			match(_t,BEFORETABLE);
			_t = _t.getFirstChild();
			bt = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			if ( inputState.guessing==0 ) {
					action.defineBuffer(bt, bt, id, false);
			}
			_t = __t628;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case FIELD:
		case INDEX:
		case RCODEINFORMATION:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RCODEINFORMATION:
		{
			AST tmp1240_AST_in = (AST)_t;
			match(_t,RCODEINFORMATION);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case FIELD:
		case INDEX:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop631:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==FIELD)) {
				def_table_field(_t);
				_t = _retTree;
			}
			else {
				break _loop631;
			}
			
		} while (true);
		}
		{
		_loop642:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==INDEX)) {
				AST __t633 = _t;
				AST tmp1241_AST_in = (AST)_t;
				match(_t,INDEX);
				_t = _t.getFirstChild();
				AST tmp1242_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				{
				_loop637:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_tokenSet_19.member(_t.getType()))) {
						{
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case AS:
						{
							AST tmp1243_AST_in = (AST)_t;
							match(_t,AS);
							_t = _t.getNextSibling();
							break;
						}
						case IS:
						{
							AST tmp1244_AST_in = (AST)_t;
							match(_t,IS);
							_t = _t.getNextSibling();
							break;
						}
						case PRIMARY:
						case UNIQUE:
						case WORDINDEX:
						{
							break;
						}
						default:
						{
							throw new NoViableAltException(_t);
						}
						}
						}
						{
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case UNIQUE:
						{
							AST tmp1245_AST_in = (AST)_t;
							match(_t,UNIQUE);
							_t = _t.getNextSibling();
							break;
						}
						case PRIMARY:
						{
							AST tmp1246_AST_in = (AST)_t;
							match(_t,PRIMARY);
							_t = _t.getNextSibling();
							break;
						}
						case WORDINDEX:
						{
							AST tmp1247_AST_in = (AST)_t;
							match(_t,WORDINDEX);
							_t = _t.getNextSibling();
							break;
						}
						default:
						{
							throw new NoViableAltException(_t);
						}
						}
						}
					}
					else {
						break _loop637;
					}
					
				} while (true);
				}
				{
				int _cnt641=0;
				_loop641:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==ID)) {
						AST tmp1248_AST_in = (AST)_t;
						match(_t,ID);
						_t = _t.getNextSibling();
						{
						_loop640:
						do {
							if (_t==null) _t=ASTNULL;
							switch ( _t.getType()) {
							case ASCENDING:
							{
								AST tmp1249_AST_in = (AST)_t;
								match(_t,ASCENDING);
								_t = _t.getNextSibling();
								break;
							}
							case DESCENDING:
							{
								AST tmp1250_AST_in = (AST)_t;
								match(_t,DESCENDING);
								_t = _t.getNextSibling();
								break;
							}
							case CASESENSITIVE:
							{
								AST tmp1251_AST_in = (AST)_t;
								match(_t,CASESENSITIVE);
								_t = _t.getNextSibling();
								break;
							}
							default:
							{
								break _loop640;
							}
							}
						} while (true);
						}
					}
					else {
						if ( _cnt641>=1 ) { break _loop641; } else {throw new NoViableAltException(_t);}
					}
					
					_cnt641++;
				} while (true);
				}
				_t = __t633;
				_t = _t.getNextSibling();
			}
			else {
				break _loop642;
			}
			
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t616;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void def_table_like(AST _t) throws RecognitionException {
		
		AST def_table_like_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case LIKE:
		{
			AST __t644 = _t;
			AST tmp1252_AST_in = (AST)_t;
			match(_t,LIKE);
			_t = _t.getFirstChild();
			def_table_like_sub(_t);
			_t = _retTree;
			_t = __t644;
			_t = _t.getNextSibling();
			break;
		}
		case LIKESEQUENTIAL:
		{
			AST __t645 = _t;
			AST tmp1253_AST_in = (AST)_t;
			match(_t,LIKESEQUENTIAL);
			_t = _t.getFirstChild();
			def_table_like_sub(_t);
			_t = _retTree;
			_t = __t645;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void def_table_field(AST _t) throws RecognitionException {
		
		AST def_table_field_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST id = null;
		
		AST __t654 = _t;
		AST tmp1254_AST_in = (AST)_t;
		match(_t,FIELD);
		_t = _t.getFirstChild();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineTableFieldInitialize(id));
		}
		{
		_loop656:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_20.member(_t.getType()))) {
				fieldoption(_t);
				_t = _retTree;
			}
			else {
				break _loop656;
			}
			
		} while (true);
		}
		if ( inputState.guessing==0 ) {
			action.defineTableFieldFinalize(pop());
		}
		_t = __t654;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void def_table_like_sub(AST _t) throws RecognitionException {
		
		AST def_table_like_sub_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST rec = null;
		
		rec = _t==ASTNULL ? null : (AST)_t;
		tbl(_t,CQ.SYMBOL);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case VALIDATE:
		{
			AST tmp1255_AST_in = (AST)_t;
			match(_t,VALIDATE);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case USEINDEX:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop652:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==USEINDEX)) {
				AST __t649 = _t;
				AST tmp1256_AST_in = (AST)_t;
				match(_t,USEINDEX);
				_t = _t.getFirstChild();
				AST tmp1257_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case AS:
				case IS:
				{
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case AS:
					{
						AST tmp1258_AST_in = (AST)_t;
						match(_t,AS);
						_t = _t.getNextSibling();
						break;
					}
					case IS:
					{
						AST tmp1259_AST_in = (AST)_t;
						match(_t,IS);
						_t = _t.getNextSibling();
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					AST tmp1260_AST_in = (AST)_t;
					match(_t,PRIMARY);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t649;
				_t = _t.getNextSibling();
			}
			else {
				break _loop652;
			}
			
		} while (true);
		}
		if ( inputState.guessing==0 ) {
			action.defineTableLike(rec);
		}
		_retTree = _t;
	}
	
	public final void fieldoption(AST _t) throws RecognitionException {
		
		AST fieldoption_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST as = null;
		AST li = null;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AS:
		{
			AST __t782 = _t;
			as = _t==ASTNULL ? null :(AST)_t;
			match(_t,AS);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case CLASS:
			{
				AST tmp1261_AST_in = (AST)_t;
				match(_t,CLASS);
				_t = _t.getNextSibling();
				AST tmp1262_AST_in = (AST)_t;
				match(_t,TYPE_NAME);
				_t = _t.getNextSibling();
				break;
			}
			case CHARACTER:
			case COMHANDLE:
			case DATE:
			case DECIMAL:
			case HANDLE:
			case INTEGER:
			case LOGICAL:
			case MEMPTR:
			case RAW:
			case RECID:
			case ROWID:
			case WIDGETHANDLE:
			case BLOB:
			case CLOB:
			case DATETIME:
			case DATETIMETZ:
			case LONGCHAR:
			case TYPE_NAME:
			case INT64:
			{
				datatype_field(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t782;
			_t = _t.getNextSibling();
			if ( inputState.guessing==0 ) {
				action.defAs(as);
			}
			break;
		}
		case CASESENSITIVE:
		case Not_casesens:
		{
			casesens_or_not(_t);
			_t = _retTree;
			break;
		}
		case BGCOLOR:
		case DCOLOR:
		case FGCOLOR:
		case PFCOLOR:
		{
			color_expr(_t);
			_t = _retTree;
			break;
		}
		case COLUMNCODEPAGE:
		{
			AST __t784 = _t;
			AST tmp1263_AST_in = (AST)_t;
			match(_t,COLUMNCODEPAGE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t784;
			_t = _t.getNextSibling();
			break;
		}
		case CONTEXTHELPID:
		{
			AST __t785 = _t;
			AST tmp1264_AST_in = (AST)_t;
			match(_t,CONTEXTHELPID);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t785;
			_t = _t.getNextSibling();
			break;
		}
		case DECIMALS:
		{
			AST __t786 = _t;
			AST tmp1265_AST_in = (AST)_t;
			match(_t,DECIMALS);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t786;
			_t = _t.getNextSibling();
			break;
		}
		case DROPTARGET:
		{
			AST tmp1266_AST_in = (AST)_t;
			match(_t,DROPTARGET);
			_t = _t.getNextSibling();
			break;
		}
		case EXTENT:
		{
			extentphrase_def_symbol(_t);
			_t = _retTree;
			break;
		}
		case FONT:
		{
			AST __t787 = _t;
			AST tmp1267_AST_in = (AST)_t;
			match(_t,FONT);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t787;
			_t = _t.getNextSibling();
			break;
		}
		case FORMAT:
		{
			AST __t788 = _t;
			AST tmp1268_AST_in = (AST)_t;
			match(_t,FORMAT);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t788;
			_t = _t.getNextSibling();
			break;
		}
		case HELP:
		{
			AST __t789 = _t;
			AST tmp1269_AST_in = (AST)_t;
			match(_t,HELP);
			_t = _t.getFirstChild();
			constant(_t);
			_t = _retTree;
			_t = __t789;
			_t = _t.getNextSibling();
			break;
		}
		case INITIAL:
		{
			initial_constant(_t);
			_t = _retTree;
			break;
		}
		case COLUMNLABEL:
		case LABEL:
		{
			label_constant(_t);
			_t = _retTree;
			break;
		}
		case LIKE:
		{
			AST __t790 = _t;
			li = _t==ASTNULL ? null :(AST)_t;
			match(_t,LIKE);
			_t = _t.getFirstChild();
			fld(_t,CQ.SYMBOL);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case VALIDATE:
			{
				AST tmp1270_AST_in = (AST)_t;
				match(_t,VALIDATE);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t790;
			_t = _t.getNextSibling();
			if ( inputState.guessing==0 ) {
				action.defLike(li);
			}
			break;
		}
		case MOUSEPOINTER:
		{
			AST __t792 = _t;
			AST tmp1271_AST_in = (AST)_t;
			match(_t,MOUSEPOINTER);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t792;
			_t = _t.getNextSibling();
			break;
		}
		case NOUNDO:
		{
			AST tmp1272_AST_in = (AST)_t;
			match(_t,NOUNDO);
			_t = _t.getNextSibling();
			break;
		}
		case VIEWAS:
		{
			viewasphrase(_t);
			_t = _retTree;
			break;
		}
		case TTCODEPAGE:
		{
			AST tmp1273_AST_in = (AST)_t;
			match(_t,TTCODEPAGE);
			_t = _t.getNextSibling();
			break;
		}
		case XMLDATATYPE:
		{
			xml_data_type(_t);
			_t = _retTree;
			break;
		}
		case XMLNODETYPE:
		{
			xml_node_type(_t);
			_t = _retTree;
			break;
		}
		case SERIALIZENAME:
		{
			AST __t793 = _t;
			AST tmp1274_AST_in = (AST)_t;
			match(_t,SERIALIZENAME);
			_t = _t.getFirstChild();
			AST tmp1275_AST_in = (AST)_t;
			match(_t,QSTRING);
			_t = _t.getNextSibling();
			_t = __t793;
			_t = _t.getNextSibling();
			break;
		}
		case SERIALIZEHIDDEN:
		{
			AST tmp1276_AST_in = (AST)_t;
			match(_t,SERIALIZEHIDDEN);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void defineworktablestate(AST _t) throws RecognitionException {
		
		AST defineworktablestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		
		AST __t658 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case WORKTABLE:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1277_AST_in = (AST)_t;
		match(_t,WORKTABLE);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
				action.defineWorktable(def, id);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOUNDO:
		{
			AST tmp1278_AST_in = (AST)_t;
			match(_t,NOUNDO);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case COLUMNLABEL:
		case FIELD:
		case LABEL:
		case LIKE:
		case LIKESEQUENTIAL:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case LIKE:
		case LIKESEQUENTIAL:
		{
			def_table_like(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case COLUMNLABEL:
		case FIELD:
		case LABEL:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case COLUMNLABEL:
		case LABEL:
		{
			label_constant(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case FIELD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop664:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==FIELD)) {
				def_table_field(_t);
				_t = _retTree;
			}
			else {
				break _loop664;
			}
			
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t658;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void definevariablestate(AST _t) throws RecognitionException {
		
		AST definevariablestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST def = null;
		AST id = null;
		
		AST __t666 = _t;
		def = _t==ASTNULL ? null :(AST)_t;
		match(_t,DEFINE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NEW:
		case SHARED:
		{
			def_shared(_t);
			_t = _retTree;
			break;
		}
		case OVERRIDE:
		case PRIVATE:
		case PUBLIC:
		case VARIABLE:
		case PROTECTED:
		case STATIC:
		case ABSTRACT:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		def_modifiers(_t);
		_t = _retTree;
		AST tmp1279_AST_in = (AST)_t;
		match(_t,VARIABLE);
		_t = _t.getNextSibling();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			push(action.defineVariable(def, id));
		}
		{
		_loop669:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_20.member(_t.getType()))) {
				fieldoption(_t);
				_t = _retTree;
			}
			else {
				break _loop669;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TRIGGERS:
		{
			triggerphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t666;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.addToSymbolScope(pop());
		}
		_retTree = _t;
	}
	
	public final void deletestate(AST _t) throws RecognitionException {
		
		AST deletestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t672 = _t;
		AST tmp1280_AST_in = (AST)_t;
		match(_t,DELETE_KW);
		_t = _t.getFirstChild();
		tbl(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case VALIDATE:
		{
			AST __t674 = _t;
			AST tmp1281_AST_in = (AST)_t;
			match(_t,VALIDATE);
			_t = _t.getFirstChild();
			funargs(_t);
			_t = _retTree;
			_t = __t674;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1282_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t672;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void destructorstate(AST _t) throws RecognitionException {
		
		AST destructorstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST d = null;
		
		AST __t677 = _t;
		d = _t==ASTNULL ? null :(AST)_t;
		match(_t,DESTRUCTOR);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.structorBegin(d);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PUBLIC:
		{
			AST tmp1283_AST_in = (AST)_t;
			match(_t,PUBLIC);
			_t = _t.getNextSibling();
			break;
		}
		case TYPE_NAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp1284_AST_in = (AST)_t;
		match(_t,TYPE_NAME);
		_t = _t.getNextSibling();
		AST tmp1285_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		AST tmp1286_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		block_colon(_t);
		_t = _retTree;
		code_block(_t);
		_t = _retTree;
		AST __t679 = _t;
		AST tmp1287_AST_in = (AST)_t;
		match(_t,END);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case DESTRUCTOR:
		{
			AST tmp1288_AST_in = (AST)_t;
			match(_t,DESTRUCTOR);
			_t = _t.getNextSibling();
			break;
		}
		case METHOD:
		{
			AST tmp1289_AST_in = (AST)_t;
			match(_t,METHOD);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t679;
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.structorEnd(d);
		}
		_t = __t677;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void disablestate(AST _t) throws RecognitionException {
		
		AST disablestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		
		AST __t682 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,DISABLE);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameInitializingStatement(head);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case UNLESSHIDDEN:
		{
			AST tmp1290_AST_in = (AST)_t;
			match(_t,UNLESSHIDDEN);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case ALL:
		case WITH:
		case Form_item:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ALL:
		{
			AST __t685 = _t;
			AST tmp1291_AST_in = (AST)_t;
			match(_t,ALL);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case EXCEPT:
			{
				AST __t687 = _t;
				AST tmp1292_AST_in = (AST)_t;
				match(_t,EXCEPT);
				_t = _t.getFirstChild();
				{
				_loop689:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==Field_ref)) {
						fld(_t,CQ.SYMBOL);
						_t = _retTree;
					}
					else {
						break _loop689;
					}
					
				} while (true);
				}
				_t = __t687;
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t685;
			_t = _t.getNextSibling();
			break;
		}
		case Form_item:
		{
			{
			int _cnt691=0;
			_loop691:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Form_item)) {
					form_item(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					if ( _cnt691>=1 ) { break _loop691; } else {throw new NoViableAltException(_t);}
				}
				
				_cnt691++;
			} while (true);
			}
			break;
		}
		case EOF:
		case PERIOD:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_t = __t682;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void disabletriggersstate(AST _t) throws RecognitionException {
		
		AST disabletriggersstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t694 = _t;
		AST tmp1293_AST_in = (AST)_t;
		match(_t,DISABLE);
		_t = _t.getFirstChild();
		AST tmp1294_AST_in = (AST)_t;
		match(_t,TRIGGERS);
		_t = _t.getNextSibling();
		AST tmp1295_AST_in = (AST)_t;
		match(_t,FOR);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case DUMP:
		{
			AST tmp1296_AST_in = (AST)_t;
			match(_t,DUMP);
			_t = _t.getNextSibling();
			break;
		}
		case LOAD:
		{
			AST tmp1297_AST_in = (AST)_t;
			match(_t,LOAD);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp1298_AST_in = (AST)_t;
		match(_t,OF);
		_t = _t.getNextSibling();
		tbl(_t,CQ.SYMBOL);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ALLOWREPLICATION:
		{
			AST tmp1299_AST_in = (AST)_t;
			match(_t,ALLOWREPLICATION);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t694;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void disconnectstate(AST _t) throws RecognitionException {
		
		AST disconnectstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t698 = _t;
		AST tmp1300_AST_in = (AST)_t;
		match(_t,DISCONNECT);
		_t = _t.getFirstChild();
		filenameorvalue(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1301_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t698;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void displaystate(AST _t) throws RecognitionException {
		
		AST displaystate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		
		AST __t701 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,DISPLAY);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameInitializingStatement(head);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case IN_KW:
		case NOERROR_KW:
		case UNLESSHIDDEN:
		case WITH:
		case Form_item:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case UNLESSHIDDEN:
		{
			AST tmp1302_AST_in = (AST)_t;
			match(_t,UNLESSHIDDEN);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case IN_KW:
		case NOERROR_KW:
		case WITH:
		case Form_item:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop705:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Form_item)) {
				displaystate_item(_t);
				_t = _retTree;
			}
			else {
				break _loop705;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXCEPT:
		{
			AST __t707 = _t;
			AST tmp1303_AST_in = (AST)_t;
			match(_t,EXCEPT);
			_t = _t.getFirstChild();
			{
			_loop709:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					break _loop709;
				}
				
			} while (true);
			}
			_t = __t707;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case IN_KW:
		case NOERROR_KW:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t711 = _t;
			AST tmp1304_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp1305_AST_in = (AST)_t;
			match(_t,WINDOW);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t711;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop713:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==WITH)) {
				display_with(_t);
				_t = _retTree;
			}
			else {
				break _loop713;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1306_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_t = __t701;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void stream_name_or_handle(AST _t) throws RecognitionException {
		
		AST stream_name_or_handle_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		{
			AST __t2365 = _t;
			AST tmp1307_AST_in = (AST)_t;
			match(_t,STREAM);
			_t = _t.getFirstChild();
			AST tmp1308_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			_t = __t2365;
			_t = _t.getNextSibling();
			break;
		}
		case STREAMHANDLE:
		{
			AST __t2366 = _t;
			AST tmp1309_AST_in = (AST)_t;
			match(_t,STREAMHANDLE);
			_t = _t.getFirstChild();
			field(_t);
			_t = _retTree;
			_t = __t2366;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void displaystate_item(AST _t) throws RecognitionException {
		
		AST displaystate_item_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST fi = null;
		
		AST __t716 = _t;
		fi = _t==ASTNULL ? null :(AST)_t;
		match(_t,Form_item);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case SKIP:
		{
			skipphrase(_t);
			_t = _retTree;
			break;
		}
		case SPACE:
		{
			spacephrase(_t);
			_t = _retTree;
			break;
		}
		default:
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_13.member(_t.getType()))) {
				{
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_3.member(_t.getType()))) {
					expression(_t);
					_t = _retTree;
				}
				else if ((_t.getType()==ID)) {
					AST tmp1310_AST_in = (AST)_t;
					match(_t,ID);
					_t = _t.getNextSibling();
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				{
				_loop720:
				do {
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case Aggregate_phrase:
					{
						aggregatephrase(_t);
						_t = _retTree;
						break;
					}
					case Format_phrase:
					{
						formatphrase(_t);
						_t = _retTree;
						break;
					}
					default:
					{
						break _loop720;
					}
					}
				} while (true);
				}
				if ( inputState.guessing==0 ) {
					action.formItem(fi);
				}
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t716;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void skipphrase(AST _t) throws RecognitionException {
		
		AST skipphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2337 = _t;
		AST tmp1311_AST_in = (AST)_t;
		match(_t,SKIP);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case LEFTPAREN:
		{
			funargs(_t);
			_t = _retTree;
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t2337;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void aggregatephrase(AST _t) throws RecognitionException {
		
		AST aggregatephrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1677 = _t;
		AST tmp1312_AST_in = (AST)_t;
		match(_t,Aggregate_phrase);
		_t = _t.getFirstChild();
		AST tmp1313_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		{
		int _cnt1679=0;
		_loop1679:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_21.member(_t.getType()))) {
				aggregate_opt(_t);
				_t = _retTree;
			}
			else {
				if ( _cnt1679>=1 ) { break _loop1679; } else {throw new NoViableAltException(_t);}
			}
			
			_cnt1679++;
		} while (true);
		}
		{
		_loop1683:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==BY)) {
				AST __t1681 = _t;
				AST tmp1314_AST_in = (AST)_t;
				match(_t,BY);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case DESCENDING:
				{
					AST tmp1315_AST_in = (AST)_t;
					match(_t,DESCENDING);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1681;
				_t = _t.getNextSibling();
			}
			else {
				break _loop1683;
			}
			
		} while (true);
		}
		AST tmp1316_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t1677;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void dynamicnewstate(AST _t) throws RecognitionException {
		
		AST dynamicnewstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST dn = null;
		
		AST __t728 = _t;
		AST tmp1317_AST_in = (AST)_t;
		match(_t,Assign_dynamic_new);
		_t = _t.getFirstChild();
		AST __t729 = _t;
		AST tmp1318_AST_in = (AST)_t;
		match(_t,EQUAL);
		_t = _t.getFirstChild();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		AST __t730 = _t;
		dn = _t==ASTNULL ? null :(AST)_t;
		match(_t,DYNAMICNEW);
		_t = _t.getFirstChild();
		expression(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.callBegin(dn);
		}
		parameterlist(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.callEnd();
		}
		_t = __t730;
		_t = _t.getNextSibling();
		_t = __t729;
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1319_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t728;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void dostate(AST _t) throws RecognitionException {
		
		AST dostate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST d = null;
		
		AST __t733 = _t;
		d = _t==ASTNULL ? null :(AST)_t;
		match(_t,DO);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
				action.blockBegin(d);
							action.frameBlockCheck(d);
						
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FOR:
		{
			block_for(_t);
			_t = _retTree;
			break;
		}
		case PERIOD:
		case BREAK:
		case BY:
		case COLLATE:
		case GROUP:
		case ON:
		case PRESELECT:
		case QUERYTUNING:
		case TRANSACTION:
		case WHILE:
		case WITH:
		case LEXCOLON:
		case Block_iterator:
		case STOPAFTER:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PRESELECT:
		{
			block_preselect(_t);
			_t = _retTree;
			break;
		}
		case PERIOD:
		case BREAK:
		case BY:
		case COLLATE:
		case GROUP:
		case ON:
		case QUERYTUNING:
		case TRANSACTION:
		case WHILE:
		case WITH:
		case LEXCOLON:
		case Block_iterator:
		case STOPAFTER:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop737:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_22.member(_t.getType()))) {
				block_opt(_t);
				_t = _retTree;
			}
			else {
				break _loop737;
			}
			
		} while (true);
		}
		block_colon(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		code_block(_t);
		_t = _retTree;
		block_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.blockEnd();
		}
		_t = __t733;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void block_end(AST _t) throws RecognitionException {
		
		AST block_end_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EOF:
		{
			AST tmp1320_AST_in = (AST)_t;
			match(_t,Token.EOF_TYPE);
			_t = _t.getNextSibling();
			break;
		}
		case END:
		{
			AST tmp1321_AST_in = (AST)_t;
			match(_t,END);
			_t = _t.getNextSibling();
			state_end(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void downstate(AST _t) throws RecognitionException {
		
		AST downstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		
		AST __t739 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,DOWN);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameInitializingStatement(head);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			{
			stream_name_or_handle(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_3.member(_t.getType()))) {
				expression(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==EOF||_t.getType()==PERIOD||_t.getType()==WITH)) {
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			}
			break;
		}
		case EOF:
		case PERIOD:
		case WITH:
		{
			break;
		}
		default:
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_3.member(_t.getType()))) {
				{
				expression(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case STREAM:
				case STREAMHANDLE:
				{
					stream_name_or_handle(_t);
					_t = _retTree;
					break;
				}
				case EOF:
				case PERIOD:
				case WITH:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				}
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_t = __t739;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void emptytemptablestate(AST _t) throws RecognitionException {
		
		AST emptytemptablestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t747 = _t;
		AST tmp1322_AST_in = (AST)_t;
		match(_t,EMPTY);
		_t = _t.getFirstChild();
		AST tmp1323_AST_in = (AST)_t;
		match(_t,TEMPTABLE);
		_t = _t.getNextSibling();
		tbl(_t,CQ.TEMPTABLESYMBOL);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1324_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t747;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void enablestate(AST _t) throws RecognitionException {
		
		AST enablestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		
		AST __t750 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,ENABLE);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameEnablingStatement(head);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case UNLESSHIDDEN:
		{
			AST tmp1325_AST_in = (AST)_t;
			match(_t,UNLESSHIDDEN);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case ALL:
		case IN_KW:
		case WITH:
		case Form_item:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ALL:
		{
			AST __t753 = _t;
			AST tmp1326_AST_in = (AST)_t;
			match(_t,ALL);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case EXCEPT:
			{
				AST __t755 = _t;
				AST tmp1327_AST_in = (AST)_t;
				match(_t,EXCEPT);
				_t = _t.getFirstChild();
				{
				_loop757:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==Field_ref)) {
						fld(_t,CQ.SYMBOL);
						_t = _retTree;
					}
					else {
						break _loop757;
					}
					
				} while (true);
				}
				_t = __t755;
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t753;
			_t = _t.getNextSibling();
			break;
		}
		case Form_item:
		{
			{
			int _cnt759=0;
			_loop759:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Form_item)) {
					form_item(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					if ( _cnt759>=1 ) { break _loop759; } else {throw new NoViableAltException(_t);}
				}
				
				_cnt759++;
			} while (true);
			}
			break;
		}
		case EOF:
		case PERIOD:
		case IN_KW:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t761 = _t;
			AST tmp1328_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp1329_AST_in = (AST)_t;
			match(_t,WINDOW);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t761;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_t = __t750;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void exportstate(AST _t) throws RecognitionException {
		
		AST exportstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t764 = _t;
		AST tmp1330_AST_in = (AST)_t;
		match(_t,EXPORT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case DELIMITER:
		case EXCEPT:
		case Form_item:
		case NOLOBS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case DELIMITER:
		{
			AST __t767 = _t;
			AST tmp1331_AST_in = (AST)_t;
			match(_t,DELIMITER);
			_t = _t.getFirstChild();
			constant(_t);
			_t = _retTree;
			_t = __t767;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case Form_item:
		case NOLOBS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop769:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Form_item)) {
				display_item(_t);
				_t = _retTree;
			}
			else {
				break _loop769;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXCEPT:
		{
			AST __t771 = _t;
			AST tmp1332_AST_in = (AST)_t;
			match(_t,EXCEPT);
			_t = _t.getFirstChild();
			{
			_loop773:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					break _loop773;
				}
				
			} while (true);
			}
			_t = __t771;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOLOBS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOLOBS:
		{
			AST tmp1333_AST_in = (AST)_t;
			match(_t,NOLOBS);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t764;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void extentphrase(AST _t) throws RecognitionException {
		
		AST extentphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST ex = null;
		
		AST __t776 = _t;
		ex = _t==ASTNULL ? null :(AST)_t;
		match(_t,EXTENT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else if ((_t.getType()==3)) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		_t = __t776;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void datatype_field(AST _t) throws RecognitionException {
		
		AST datatype_field_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BLOB:
		{
			AST tmp1334_AST_in = (AST)_t;
			match(_t,BLOB);
			_t = _t.getNextSibling();
			break;
		}
		case CLOB:
		{
			AST tmp1335_AST_in = (AST)_t;
			match(_t,CLOB);
			_t = _t.getNextSibling();
			break;
		}
		case CHARACTER:
		case COMHANDLE:
		case DATE:
		case DECIMAL:
		case HANDLE:
		case INTEGER:
		case LOGICAL:
		case MEMPTR:
		case RAW:
		case RECID:
		case ROWID:
		case WIDGETHANDLE:
		case DATETIME:
		case DATETIMETZ:
		case LONGCHAR:
		case TYPE_NAME:
		case INT64:
		{
			datatype_var(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void xml_data_type(AST _t) throws RecognitionException {
		
		AST xml_data_type_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2469 = _t;
		AST tmp1336_AST_in = (AST)_t;
		match(_t,XMLDATATYPE);
		_t = _t.getFirstChild();
		constant(_t);
		_t = _retTree;
		_t = __t2469;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void xml_node_type(AST _t) throws RecognitionException {
		
		AST xml_node_type_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2473 = _t;
		AST tmp1337_AST_in = (AST)_t;
		match(_t,XMLNODETYPE);
		_t = _t.getFirstChild();
		constant(_t);
		_t = _retTree;
		_t = __t2473;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void findstate(AST _t) throws RecognitionException {
		
		AST findstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST r = null;
		
		AST __t795 = _t;
		AST tmp1338_AST_in = (AST)_t;
		match(_t,FIND);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CURRENT:
		case EACH:
		case FIRST:
		case LAST:
		case NEXT:
		case PREV:
		{
			findwhich(_t);
			_t = _retTree;
			break;
		}
		case RECORD_NAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST __t797 = _t;
		r = _t==ASTNULL ? null :(AST)_t;
		match(_t,RECORD_NAME);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.recordNameNode(r, CQ.INIT);
		}
		recordphrase(_t);
		_t = _retTree;
		_t = __t797;
		_t = _t.getNextSibling();
		{
		_loop799:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOWAIT:
			{
				AST tmp1339_AST_in = (AST)_t;
				match(_t,NOWAIT);
				_t = _t.getNextSibling();
				break;
			}
			case NOPREFETCH:
			{
				AST tmp1340_AST_in = (AST)_t;
				match(_t,NOPREFETCH);
				_t = _t.getNextSibling();
				break;
			}
			case NOERROR_KW:
			{
				AST tmp1341_AST_in = (AST)_t;
				match(_t,NOERROR_KW);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop799;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t795;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void fixcodepage_pseudfn(AST _t) throws RecognitionException {
		
		AST fixcodepage_pseudfn_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t801 = _t;
		AST tmp1342_AST_in = (AST)_t;
		match(_t,FIXCODEPAGE);
		_t = _t.getFirstChild();
		AST tmp1343_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		fld(_t,CQ.SYMBOL);
		_t = _retTree;
		AST tmp1344_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t801;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void forstate(AST _t) throws RecognitionException {
		
		AST forstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST f = null;
		
		AST __t803 = _t;
		f = _t==ASTNULL ? null :(AST)_t;
		match(_t,FOR);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
				action.blockBegin(f); 
							action.frameBlockCheck(f);
						
		}
		for_record_spec(_t,CQ.INITWEAK);
		_t = _retTree;
		{
		_loop805:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_22.member(_t.getType()))) {
				block_opt(_t);
				_t = _retTree;
			}
			else {
				break _loop805;
			}
			
		} while (true);
		}
		block_colon(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		code_block(_t);
		_t = _retTree;
		block_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.blockEnd();
		}
		_t = __t803;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void widget_id(AST _t) throws RecognitionException {
		
		AST widget_id_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2467 = _t;
		AST tmp1345_AST_in = (AST)_t;
		match(_t,WIDGETID);
		_t = _t.getFirstChild();
		expression(_t);
		_t = _retTree;
		_t = __t2467;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void formstate(AST _t) throws RecognitionException {
		
		AST formstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		
		AST __t823 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,FORMAT);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameInitializingStatement(head);
		}
		{
		_loop825:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Form_item)) {
				form_item(_t,CQ.SYMBOL);
				_t = _retTree;
			}
			else {
				break _loop825;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case HEADER:
		{
			AST __t827 = _t;
			AST tmp1346_AST_in = (AST)_t;
			match(_t,HEADER);
			_t = _t.getFirstChild();
			{
			int _cnt829=0;
			_loop829:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Form_item)) {
					display_item(_t);
					_t = _retTree;
				}
				else {
					if ( _cnt829>=1 ) { break _loop829; } else {throw new NoViableAltException(_t);}
				}
				
				_cnt829++;
			} while (true);
			}
			_t = __t827;
			_t = _t.getNextSibling();
			break;
		}
		case BACKGROUND:
		{
			AST __t830 = _t;
			AST tmp1347_AST_in = (AST)_t;
			match(_t,BACKGROUND);
			_t = _t.getFirstChild();
			{
			int _cnt832=0;
			_loop832:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Form_item)) {
					display_item(_t);
					_t = _retTree;
				}
				else {
					if ( _cnt832>=1 ) { break _loop832; } else {throw new NoViableAltException(_t);}
				}
				
				_cnt832++;
			} while (true);
			}
			_t = __t830;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXCEPT:
		{
			AST __t834 = _t;
			AST tmp1348_AST_in = (AST)_t;
			match(_t,EXCEPT);
			_t = _t.getFirstChild();
			{
			_loop836:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					break _loop836;
				}
				
			} while (true);
			}
			_t = __t834;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_t = __t823;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void atphrase(AST _t) throws RecognitionException {
		
		AST atphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1703 = _t;
		AST tmp1349_AST_in = (AST)_t;
		match(_t,AT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		if ((_tokenSet_23.member(_t.getType()))) {
			atphraseab(_t);
			_t = _retTree;
			atphraseab(_t);
			_t = _retTree;
		}
		else if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case COLONALIGNED:
		{
			AST tmp1350_AST_in = (AST)_t;
			match(_t,COLONALIGNED);
			_t = _t.getNextSibling();
			break;
		}
		case LEFTALIGNED:
		{
			AST tmp1351_AST_in = (AST)_t;
			match(_t,LEFTALIGNED);
			_t = _t.getNextSibling();
			break;
		}
		case RIGHTALIGNED:
		{
			AST tmp1352_AST_in = (AST)_t;
			match(_t,RIGHTALIGNED);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1703;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void colorspecification(AST _t) throws RecognitionException {
		
		AST colorspecification_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BGCOLOR:
		case DCOLOR:
		case FGCOLOR:
		case PFCOLOR:
		{
			{
			int _cnt1758=0;
			_loop1758:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_24.member(_t.getType()))) {
					color_expr(_t);
					_t = _retTree;
				}
				else {
					if ( _cnt1758>=1 ) { break _loop1758; } else {throw new NoViableAltException(_t);}
				}
				
				_cnt1758++;
			} while (true);
			}
			break;
		}
		case COLOR:
		{
			AST __t1759 = _t;
			AST tmp1353_AST_in = (AST)_t;
			match(_t,COLOR);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case DISPLAY:
			{
				AST tmp1354_AST_in = (AST)_t;
				match(_t,DISPLAY);
				_t = _t.getNextSibling();
				break;
			}
			case VALUE:
			case TYPELESS_TOKEN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			anyorvalue(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PROMPT:
			{
				AST __t1762 = _t;
				AST tmp1355_AST_in = (AST)_t;
				match(_t,PROMPT);
				_t = _t.getFirstChild();
				anyorvalue(_t);
				_t = _retTree;
				_t = __t1762;
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1759;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void titlephrase(AST _t) throws RecognitionException {
		
		AST titlephrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2401 = _t;
		AST tmp1356_AST_in = (AST)_t;
		match(_t,TITLE);
		_t = _t.getFirstChild();
		{
		_loop2405:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case BGCOLOR:
			case DCOLOR:
			case FGCOLOR:
			case PFCOLOR:
			{
				color_expr(_t);
				_t = _retTree;
				break;
			}
			case COLOR:
			{
				AST __t2403 = _t;
				AST tmp1357_AST_in = (AST)_t;
				match(_t,COLOR);
				_t = _t.getFirstChild();
				anyorvalue(_t);
				_t = _retTree;
				_t = __t2403;
				_t = _t.getNextSibling();
				break;
			}
			case FONT:
			{
				AST __t2404 = _t;
				AST tmp1358_AST_in = (AST)_t;
				match(_t,FONT);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2404;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop2405;
			}
			}
		} while (true);
		}
		expression(_t);
		_t = _retTree;
		_t = __t2401;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void functionstate(AST _t) throws RecognitionException {
		
		AST functionstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST f = null;
		AST id = null;
		
		AST __t888 = _t;
		f = _t==ASTNULL ? null :(AST)_t;
		match(_t,FUNCTION);
		_t = _t.getFirstChild();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
			action.funcBegin(f, id);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RETURNS:
		{
			AST tmp1359_AST_in = (AST)_t;
			match(_t,RETURNS);
			_t = _t.getNextSibling();
			break;
		}
		case RETURN:
		{
			AST tmp1360_AST_in = (AST)_t;
			match(_t,RETURN);
			_t = _t.getNextSibling();
			break;
		}
		case CHARACTER:
		case COMHANDLE:
		case DATE:
		case DECIMAL:
		case HANDLE:
		case INTEGER:
		case LOGICAL:
		case MEMPTR:
		case RAW:
		case RECID:
		case ROWID:
		case WIDGETHANDLE:
		case DATETIME:
		case DATETIMETZ:
		case LONGCHAR:
		case CLASS:
		case TYPE_NAME:
		case INT64:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		if ( inputState.guessing==0 ) {
			action.routineReturnDatatype(_t);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CLASS:
		{
			AST tmp1361_AST_in = (AST)_t;
			match(_t,CLASS);
			_t = _t.getNextSibling();
			AST tmp1362_AST_in = (AST)_t;
			match(_t,TYPE_NAME);
			_t = _t.getNextSibling();
			break;
		}
		case CHARACTER:
		case COMHANDLE:
		case DATE:
		case DECIMAL:
		case HANDLE:
		case INTEGER:
		case LOGICAL:
		case MEMPTR:
		case RAW:
		case RECID:
		case ROWID:
		case WIDGETHANDLE:
		case DATETIME:
		case DATETIMETZ:
		case LONGCHAR:
		case TYPE_NAME:
		case INT64:
		{
			datatype_var(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXTENT:
		{
			extentphrase(_t);
			_t = _retTree;
			break;
		}
		case PERIOD:
		case FORWARDS:
		case IN_KW:
		case MAP:
		case PRIVATE:
		case LEXCOLON:
		case Parameter_list:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PRIVATE:
		{
			AST tmp1363_AST_in = (AST)_t;
			match(_t,PRIVATE);
			_t = _t.getNextSibling();
			break;
		}
		case PERIOD:
		case FORWARDS:
		case IN_KW:
		case MAP:
		case LEXCOLON:
		case Parameter_list:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Parameter_list:
		{
			function_params(_t);
			_t = _retTree;
			break;
		}
		case PERIOD:
		case FORWARDS:
		case IN_KW:
		case MAP:
		case LEXCOLON:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FORWARDS:
		{
			AST tmp1364_AST_in = (AST)_t;
			match(_t,FORWARDS);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEXCOLON:
			{
				AST tmp1365_AST_in = (AST)_t;
				match(_t,LEXCOLON);
				_t = _t.getNextSibling();
				break;
			}
			case PERIOD:
			{
				AST tmp1366_AST_in = (AST)_t;
				match(_t,PERIOD);
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			{
				AST tmp1367_AST_in = (AST)_t;
				match(_t,Token.EOF_TYPE);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.funcForward(id);
			}
			break;
		}
		case PERIOD:
		case LEXCOLON:
		{
			block_colon(_t);
			_t = _retTree;
			if ( inputState.guessing==0 ) {
				action.funcDef(f, id);
			}
			code_block(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case EOF:
			{
				AST tmp1368_AST_in = (AST)_t;
				match(_t,Token.EOF_TYPE);
				_t = _t.getNextSibling();
				break;
			}
			case END:
			{
				AST __t903 = _t;
				AST tmp1369_AST_in = (AST)_t;
				match(_t,END);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case FUNCTION:
				{
					AST tmp1370_AST_in = (AST)_t;
					match(_t,FUNCTION);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t903;
				_t = _t.getNextSibling();
				state_end(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		default:
			boolean synPredMatched897 = false;
			if (_t==null) _t=ASTNULL;
			if (((_t.getType()==IN_KW))) {
				AST __t897 = _t;
				synPredMatched897 = true;
				inputState.guessing++;
				try {
					{
					AST tmp1371_AST_in = (AST)_t;
					match(_t,IN_KW);
					_t = _t.getNextSibling();
					AST tmp1372_AST_in = (AST)_t;
					match(_t,SUPER);
					_t = _t.getNextSibling();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched897 = false;
				}
				_t = __t897;
inputState.guessing--;
			}
			if ( synPredMatched897 ) {
				AST tmp1373_AST_in = (AST)_t;
				match(_t,IN_KW);
				_t = _t.getNextSibling();
				AST tmp1374_AST_in = (AST)_t;
				match(_t,SUPER);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case LEXCOLON:
				{
					AST tmp1375_AST_in = (AST)_t;
					match(_t,LEXCOLON);
					_t = _t.getNextSibling();
					break;
				}
				case PERIOD:
				{
					AST tmp1376_AST_in = (AST)_t;
					match(_t,PERIOD);
					_t = _t.getNextSibling();
					break;
				}
				case EOF:
				{
					AST tmp1377_AST_in = (AST)_t;
					match(_t,Token.EOF_TYPE);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				if ( inputState.guessing==0 ) {
					action.funcDef(f, id);
				}
			}
			else if ((_t.getType()==IN_KW||_t.getType()==MAP)) {
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case MAP:
				{
					AST tmp1378_AST_in = (AST)_t;
					match(_t,MAP);
					_t = _t.getNextSibling();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case TO:
					{
						AST tmp1379_AST_in = (AST)_t;
						match(_t,TO);
						_t = _t.getNextSibling();
						break;
					}
					case ID:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					AST tmp1380_AST_in = (AST)_t;
					match(_t,ID);
					_t = _t.getNextSibling();
					break;
				}
				case IN_KW:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				AST tmp1381_AST_in = (AST)_t;
				match(_t,IN_KW);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case LEXCOLON:
				{
					AST tmp1382_AST_in = (AST)_t;
					match(_t,LEXCOLON);
					_t = _t.getNextSibling();
					break;
				}
				case PERIOD:
				{
					AST tmp1383_AST_in = (AST)_t;
					match(_t,PERIOD);
					_t = _t.getNextSibling();
					break;
				}
				case EOF:
				{
					AST tmp1384_AST_in = (AST)_t;
					match(_t,Token.EOF_TYPE);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				if ( inputState.guessing==0 ) {
					action.funcDef(f, id);
				}
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t888;
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
				action.funcEnd(f);
		}
		_retTree = _t;
	}
	
	public final void function_param(AST _t) throws RecognitionException {
		
		AST function_param_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST b = null;
		AST id = null;
		AST rec = null;
		action.paramForRoutine(_t);
		
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BUFFER:
		{
			AST __t907 = _t;
			b = _t==ASTNULL ? null :(AST)_t;
			match(_t,BUFFER);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ID:
			{
				id = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				break;
			}
			case FOR:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1385_AST_in = (AST)_t;
			match(_t,FOR);
			_t = _t.getNextSibling();
			rec = _t==ASTNULL ? null : (AST)_t;
			tbl(_t,CQ.SYMBOL);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PRESELECT:
			{
				AST tmp1386_AST_in = (AST)_t;
				match(_t,PRESELECT);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
					if (id!=null) {
										action.defineBuffer(id, id, rec, true);
										action.paramSymbol(id);
									} else {
										action.paramSymbol(rec);
									}
									action.paramProgressType(BUFFER);
								
			}
			_t = __t907;
			_t = _t.getNextSibling();
			break;
		}
		case INPUT:
		{
			AST __t910 = _t;
			AST tmp1387_AST_in = (AST)_t;
			match(_t,INPUT);
			_t = _t.getFirstChild();
			function_param_arg(_t);
			_t = _retTree;
			_t = __t910;
			_t = _t.getNextSibling();
			break;
		}
		case OUTPUT:
		{
			AST __t911 = _t;
			AST tmp1388_AST_in = (AST)_t;
			match(_t,OUTPUT);
			_t = _t.getFirstChild();
			function_param_arg(_t);
			_t = _retTree;
			_t = __t911;
			_t = _t.getNextSibling();
			break;
		}
		case INPUTOUTPUT:
		{
			AST __t912 = _t;
			AST tmp1389_AST_in = (AST)_t;
			match(_t,INPUTOUTPUT);
			_t = _t.getFirstChild();
			function_param_arg(_t);
			_t = _retTree;
			_t = __t912;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		if ( inputState.guessing==0 ) {
			action.paramEnd();
		}
		_retTree = _t;
	}
	
	public final void function_param_arg(AST _t) throws RecognitionException {
		
		AST function_param_arg_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST tb1 = null;
		AST id2 = null;
		AST ds = null;
		AST dsh = null;
		AST id = null;
		AST as = null;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TABLE:
		{
			AST tmp1390_AST_in = (AST)_t;
			match(_t,TABLE);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case FOR:
			{
				AST tmp1391_AST_in = (AST)_t;
				match(_t,FOR);
				_t = _t.getNextSibling();
				break;
			}
			case RECORD_NAME:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			tb1 = _t==ASTNULL ? null : (AST)_t;
			tbl(_t,CQ.TEMPTABLESYMBOL);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case APPEND:
			{
				AST tmp1392_AST_in = (AST)_t;
				match(_t,APPEND);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			case BIND:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case BIND:
			{
				AST tmp1393_AST_in = (AST)_t;
				match(_t,BIND);
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
					action.paramBind();
				}
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
					action.paramProgressType(TEMPTABLE);
							action.paramSymbol(tb1);
						
			}
			break;
		}
		case TABLEHANDLE:
		{
			AST tmp1394_AST_in = (AST)_t;
			match(_t,TABLEHANDLE);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case FOR:
			{
				AST tmp1395_AST_in = (AST)_t;
				match(_t,FOR);
				_t = _t.getNextSibling();
				break;
			}
			case ID:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			id2 = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case APPEND:
			{
				AST tmp1396_AST_in = (AST)_t;
				match(_t,APPEND);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			case BIND:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case BIND:
			{
				AST tmp1397_AST_in = (AST)_t;
				match(_t,BIND);
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
					action.paramBind();
				}
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
					action.addToSymbolScope(action.defineVariable(id2, id2, HANDLE));
							action.paramSymbol(id2);
						
			}
			break;
		}
		case DATASET:
		{
			AST tmp1398_AST_in = (AST)_t;
			match(_t,DATASET);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case FOR:
			{
				AST tmp1399_AST_in = (AST)_t;
				match(_t,FOR);
				_t = _t.getNextSibling();
				break;
			}
			case ID:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			ds = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case APPEND:
			{
				AST tmp1400_AST_in = (AST)_t;
				match(_t,APPEND);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			case BIND:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case BIND:
			{
				AST tmp1401_AST_in = (AST)_t;
				match(_t,BIND);
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
					action.paramBind();
				}
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
					action.setSymbol(DATASET, ds);
							action.paramProgressType(DATASET);
							action.paramSymbol(ds);
						
			}
			break;
		}
		case DATASETHANDLE:
		{
			AST tmp1402_AST_in = (AST)_t;
			match(_t,DATASETHANDLE);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case FOR:
			{
				AST tmp1403_AST_in = (AST)_t;
				match(_t,FOR);
				_t = _t.getNextSibling();
				break;
			}
			case ID:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			dsh = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case APPEND:
			{
				AST tmp1404_AST_in = (AST)_t;
				match(_t,APPEND);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			case BIND:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case BIND:
			{
				AST tmp1405_AST_in = (AST)_t;
				match(_t,BIND);
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
					action.paramBind();
				}
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
					action.addToSymbolScope(action.defineVariable(dsh, dsh, HANDLE));
							action.paramSymbol(dsh);
						
			}
			break;
		}
		case CHARACTER:
		case COMHANDLE:
		case DATE:
		case DECIMAL:
		case HANDLE:
		case INTEGER:
		case LOGICAL:
		case MEMPTR:
		case RAW:
		case RECID:
		case ROWID:
		case WIDGETHANDLE:
		case ID:
		case DATETIME:
		case DATETIMETZ:
		case LONGCHAR:
		case CLASS:
		case TYPE_NAME:
		case INT64:
		{
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ID:
			{
				id = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				as = (AST)_t;
				match(_t,AS);
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
						action.addToSymbolScope(action.defineVariable(id, id));
									action.defAs(as);
									action.paramSymbol(id);
								
				}
				break;
			}
			case CHARACTER:
			case COMHANDLE:
			case DATE:
			case DECIMAL:
			case HANDLE:
			case INTEGER:
			case LOGICAL:
			case MEMPTR:
			case RAW:
			case RECID:
			case ROWID:
			case WIDGETHANDLE:
			case DATETIME:
			case DATETIMETZ:
			case LONGCHAR:
			case CLASS:
			case TYPE_NAME:
			case INT64:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				if (id==null) action.paramNoName(_t);
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case CLASS:
			{
				AST tmp1406_AST_in = (AST)_t;
				match(_t,CLASS);
				_t = _t.getNextSibling();
				AST tmp1407_AST_in = (AST)_t;
				match(_t,TYPE_NAME);
				_t = _t.getNextSibling();
				break;
			}
			case CHARACTER:
			case COMHANDLE:
			case DATE:
			case DECIMAL:
			case HANDLE:
			case INTEGER:
			case LOGICAL:
			case MEMPTR:
			case RAW:
			case RECID:
			case ROWID:
			case WIDGETHANDLE:
			case DATETIME:
			case DATETIMETZ:
			case LONGCHAR:
			case TYPE_NAME:
			case INT64:
			{
				datatype_var(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case EXTENT:
			{
				extentphrase_def_symbol(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void getkeyvaluestate(AST _t) throws RecognitionException {
		
		AST getkeyvaluestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t930 = _t;
		AST tmp1408_AST_in = (AST)_t;
		match(_t,GETKEYVALUE);
		_t = _t.getFirstChild();
		AST tmp1409_AST_in = (AST)_t;
		match(_t,SECTION);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		AST tmp1410_AST_in = (AST)_t;
		match(_t,KEY);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==DEFAULT)) {
			AST tmp1411_AST_in = (AST)_t;
			match(_t,DEFAULT);
			_t = _t.getNextSibling();
		}
		else if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		AST tmp1412_AST_in = (AST)_t;
		match(_t,VALUE);
		_t = _t.getNextSibling();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t930;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void importstate(AST _t) throws RecognitionException {
		
		AST importstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t933 = _t;
		AST tmp1413_AST_in = (AST)_t;
		match(_t,IMPORT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case DELIMITER:
		case NOERROR_KW:
		case UNFORMATTED:
		case CARET:
		case Field_ref:
		case RECORD_NAME:
		case NOLOBS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case DELIMITER:
		{
			AST __t936 = _t;
			AST tmp1414_AST_in = (AST)_t;
			match(_t,DELIMITER);
			_t = _t.getFirstChild();
			constant(_t);
			_t = _retTree;
			_t = __t936;
			_t = _t.getNextSibling();
			break;
		}
		case UNFORMATTED:
		{
			AST tmp1415_AST_in = (AST)_t;
			match(_t,UNFORMATTED);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case CARET:
		case Field_ref:
		case RECORD_NAME:
		case NOLOBS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RECORD_NAME:
		{
			tbl(_t,CQ.UPDATING);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case EXCEPT:
			{
				AST __t939 = _t;
				AST tmp1416_AST_in = (AST)_t;
				match(_t,EXCEPT);
				_t = _t.getFirstChild();
				{
				_loop941:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==Field_ref)) {
						fld1(_t,CQ.SYMBOL);
						_t = _retTree;
					}
					else {
						break _loop941;
					}
					
				} while (true);
				}
				_t = __t939;
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case NOERROR_KW:
			case NOLOBS:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		case CARET:
		case Field_ref:
		{
			{
			int _cnt943=0;
			_loop943:
			do {
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Field_ref:
				{
					fld(_t,CQ.UPDATING);
					_t = _retTree;
					break;
				}
				case CARET:
				{
					AST tmp1417_AST_in = (AST)_t;
					match(_t,CARET);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					if ( _cnt943>=1 ) { break _loop943; } else {throw new NoViableAltException(_t);}
				}
				}
				_cnt943++;
			} while (true);
			}
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case NOLOBS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOLOBS:
		{
			AST tmp1418_AST_in = (AST)_t;
			match(_t,NOLOBS);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1419_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t933;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void insertstate(AST _t) throws RecognitionException {
		
		AST insertstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		
		AST __t947 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,INSERT);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameInitializingStatement(head);
		}
		tbl(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXCEPT:
		{
			AST __t949 = _t;
			AST tmp1420_AST_in = (AST)_t;
			match(_t,EXCEPT);
			_t = _t.getFirstChild();
			{
			_loop951:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					break _loop951;
				}
				
			} while (true);
			}
			_t = __t949;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case USING:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case USING:
		{
			AST __t953 = _t;
			AST tmp1421_AST_in = (AST)_t;
			match(_t,USING);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ROWID:
			{
				AST tmp1422_AST_in = (AST)_t;
				match(_t,ROWID);
				_t = _t.getNextSibling();
				break;
			}
			case RECID:
			{
				AST tmp1423_AST_in = (AST)_t;
				match(_t,RECID);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			expression(_t);
			_t = _retTree;
			_t = __t953;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1424_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_t = __t947;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void messagestate(AST _t) throws RecognitionException {
		
		AST messagestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t962 = _t;
		AST tmp1425_AST_in = (AST)_t;
		match(_t,MESSAGE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case COLOR:
		{
			AST __t964 = _t;
			AST tmp1426_AST_in = (AST)_t;
			match(_t,COLOR);
			_t = _t.getFirstChild();
			anyorvalue(_t);
			_t = _retTree;
			_t = __t964;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case IN_KW:
		case SET:
		case UPDATE:
		case VIEWAS:
		case Form_item:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop968:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Form_item)) {
				AST __t966 = _t;
				AST tmp1427_AST_in = (AST)_t;
				match(_t,Form_item);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==SKIP)) {
					skipphrase(_t);
					_t = _retTree;
				}
				else if ((_tokenSet_3.member(_t.getType()))) {
					expression(_t);
					_t = _retTree;
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				_t = __t966;
				_t = _t.getNextSibling();
			}
			else {
				break _loop968;
			}
			
		} while (true);
		}
		{
		_loop980:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case VIEWAS:
			{
				AST __t970 = _t;
				AST tmp1428_AST_in = (AST)_t;
				match(_t,VIEWAS);
				_t = _t.getFirstChild();
				AST tmp1429_AST_in = (AST)_t;
				match(_t,ALERTBOX);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case MESSAGE:
				{
					AST tmp1430_AST_in = (AST)_t;
					match(_t,MESSAGE);
					_t = _t.getNextSibling();
					break;
				}
				case QUESTION:
				{
					AST tmp1431_AST_in = (AST)_t;
					match(_t,QUESTION);
					_t = _t.getNextSibling();
					break;
				}
				case INFORMATION:
				{
					AST tmp1432_AST_in = (AST)_t;
					match(_t,INFORMATION);
					_t = _t.getNextSibling();
					break;
				}
				case ERROR:
				{
					AST tmp1433_AST_in = (AST)_t;
					match(_t,ERROR);
					_t = _t.getNextSibling();
					break;
				}
				case WARNING:
				{
					AST tmp1434_AST_in = (AST)_t;
					match(_t,WARNING);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				case BUTTONS:
				case TITLE:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case BUTTONS:
				{
					AST tmp1435_AST_in = (AST)_t;
					match(_t,BUTTONS);
					_t = _t.getNextSibling();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case YESNO:
					{
						AST tmp1436_AST_in = (AST)_t;
						match(_t,YESNO);
						_t = _t.getNextSibling();
						break;
					}
					case YESNOCANCEL:
					{
						AST tmp1437_AST_in = (AST)_t;
						match(_t,YESNOCANCEL);
						_t = _t.getNextSibling();
						break;
					}
					case OK:
					{
						AST tmp1438_AST_in = (AST)_t;
						match(_t,OK);
						_t = _t.getNextSibling();
						break;
					}
					case OKCANCEL:
					{
						AST tmp1439_AST_in = (AST)_t;
						match(_t,OKCANCEL);
						_t = _t.getNextSibling();
						break;
					}
					case RETRYCANCEL:
					{
						AST tmp1440_AST_in = (AST)_t;
						match(_t,RETRYCANCEL);
						_t = _t.getNextSibling();
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					break;
				}
				case 3:
				case TITLE:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case TITLE:
				{
					AST __t975 = _t;
					AST tmp1441_AST_in = (AST)_t;
					match(_t,TITLE);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t975;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t970;
				_t = _t.getNextSibling();
				break;
			}
			case SET:
			{
				AST __t976 = _t;
				AST tmp1442_AST_in = (AST)_t;
				match(_t,SET);
				_t = _t.getFirstChild();
				fld(_t,CQ.UPDATING);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Format_phrase:
				{
					formatphrase(_t);
					_t = _retTree;
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t976;
				_t = _t.getNextSibling();
				break;
			}
			case UPDATE:
			{
				AST __t978 = _t;
				AST tmp1443_AST_in = (AST)_t;
				match(_t,UPDATE);
				_t = _t.getFirstChild();
				fld(_t,CQ.REFUP);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Format_phrase:
				{
					formatphrase(_t);
					_t = _retTree;
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t978;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop980;
			}
			}
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t982 = _t;
			AST tmp1444_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp1445_AST_in = (AST)_t;
			match(_t,WINDOW);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t982;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t962;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void methodstate(AST _t) throws RecognitionException {
		
		AST methodstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST m = null;
		AST id = null;
			AST returnTypeNode = null;
		
		
		AST __t984 = _t;
		m = _t==ASTNULL ? null :(AST)_t;
		match(_t,METHOD);
		_t = _t.getFirstChild();
		def_modifiers(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			returnTypeNode = _t;
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case VOID:
		{
			AST tmp1446_AST_in = (AST)_t;
			match(_t,VOID);
			_t = _t.getNextSibling();
			break;
		}
		case CHARACTER:
		case COMHANDLE:
		case DATE:
		case DECIMAL:
		case HANDLE:
		case INTEGER:
		case LOGICAL:
		case MEMPTR:
		case RAW:
		case RECID:
		case ROWID:
		case WIDGETHANDLE:
		case DATETIME:
		case DATETIMETZ:
		case LONGCHAR:
		case CLASS:
		case TYPE_NAME:
		case INT64:
		{
			datatype(_t);
			_t = _retTree;
			{
			boolean synPredMatched988 = false;
			if (_t==null) _t=ASTNULL;
			if (((_t.getType()==EXTENT))) {
				AST __t988 = _t;
				synPredMatched988 = true;
				inputState.guessing++;
				try {
					{
					extentphrase(_t);
					_t = _retTree;
					}
				}
				catch (RecognitionException pe) {
					synPredMatched988 = false;
				}
				_t = __t988;
inputState.guessing--;
			}
			if ( synPredMatched988 ) {
				{
				extentphrase(_t);
				_t = _retTree;
				}
			}
			else if (((_t.getType() >= LEXDATE && _t.getType() <= Last_Token_Number))) {
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		id = (AST)_t;
		if ( _t==null ) throw new MismatchedTokenException();
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
				action.methodBegin(m, id);
							action.routineReturnDatatype(returnTypeNode);
						
		}
		function_params(_t);
		_t = _retTree;
		{
		boolean synPredMatched992 = false;
		if (_t==null) _t=ASTNULL;
		if (((_t.getType()==PERIOD||_t.getType()==LEXCOLON))) {
			AST __t992 = _t;
			synPredMatched992 = true;
			inputState.guessing++;
			try {
				{
				block_colon(_t);
				_t = _retTree;
				AST tmp1447_AST_in = (AST)_t;
				match(_t,Code_block);
				_t = _t.getNextSibling();
				}
			}
			catch (RecognitionException pe) {
				synPredMatched992 = false;
			}
			_t = __t992;
inputState.guessing--;
		}
		if ( synPredMatched992 ) {
			block_colon(_t);
			_t = _retTree;
			code_block(_t);
			_t = _retTree;
			AST __t993 = _t;
			AST tmp1448_AST_in = (AST)_t;
			match(_t,END);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case METHOD:
			{
				AST tmp1449_AST_in = (AST)_t;
				match(_t,METHOD);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t993;
			_t = _t.getNextSibling();
			state_end(_t);
			_t = _retTree;
		}
		else if ((_t.getType()==EOF||_t.getType()==PERIOD)) {
			state_end(_t);
			_t = _retTree;
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		if ( inputState.guessing==0 ) {
			action.methodEnd(m);
		}
		_t = __t984;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void nextpromptstate(AST _t) throws RecognitionException {
		
		AST nextpromptstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t996 = _t;
		AST tmp1450_AST_in = (AST)_t;
		match(_t,NEXTPROMPT);
		_t = _t.getFirstChild();
		fld(_t,CQ.SYMBOL);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t996;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void onstate(AST _t) throws RecognitionException {
		
		AST onstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST onNode = null;
		AST t1 = null;
		AST rec = null;
		AST id1 = null;
		AST id2 = null;
		AST fld = null;
		AST id = null;
		
		AST __t999 = _t;
		onNode = _t==ASTNULL ? null :(AST)_t;
		match(_t,ON);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.scopeAdd(onNode);
		}
		{
		boolean synPredMatched1002 = false;
		if (_t==null) _t=ASTNULL;
		if (((_tokenSet_25.member(_t.getType())))) {
			AST __t1002 = _t;
			synPredMatched1002 = true;
			inputState.guessing++;
			try {
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case ASSIGN:
				{
					AST tmp1451_AST_in = (AST)_t;
					match(_t,ASSIGN);
					_t = _t.getNextSibling();
					break;
				}
				case CREATE:
				{
					AST tmp1452_AST_in = (AST)_t;
					match(_t,CREATE);
					_t = _t.getNextSibling();
					break;
				}
				case DELETE_KW:
				{
					AST tmp1453_AST_in = (AST)_t;
					match(_t,DELETE_KW);
					_t = _t.getNextSibling();
					break;
				}
				case FIND:
				{
					AST tmp1454_AST_in = (AST)_t;
					match(_t,FIND);
					_t = _t.getNextSibling();
					break;
				}
				case WRITE:
				{
					AST tmp1455_AST_in = (AST)_t;
					match(_t,WRITE);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
			}
			catch (RecognitionException pe) {
				synPredMatched1002 = false;
			}
			_t = __t1002;
inputState.guessing--;
		}
		if ( synPredMatched1002 ) {
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case CREATE:
			case DELETE_KW:
			case FIND:
			{
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case CREATE:
				{
					AST tmp1456_AST_in = (AST)_t;
					match(_t,CREATE);
					_t = _t.getNextSibling();
					break;
				}
				case DELETE_KW:
				{
					AST tmp1457_AST_in = (AST)_t;
					match(_t,DELETE_KW);
					_t = _t.getNextSibling();
					break;
				}
				case FIND:
				{
					AST tmp1458_AST_in = (AST)_t;
					match(_t,FIND);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				AST tmp1459_AST_in = (AST)_t;
				match(_t,OF);
				_t = _t.getNextSibling();
				t1 = _t==ASTNULL ? null : (AST)_t;
				tbl(_t,CQ.SYMBOL);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COLUMNLABEL||_t.getType()==LABEL)) {
					label_constant(_t);
					_t = _retTree;
				}
				else if ((_tokenSet_26.member(_t.getType()))) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				if ( inputState.guessing==0 ) {
					action.defineBufferForTrigger(t1);
				}
				break;
			}
			case WRITE:
			{
				AST tmp1460_AST_in = (AST)_t;
				match(_t,WRITE);
				_t = _t.getNextSibling();
				AST tmp1461_AST_in = (AST)_t;
				match(_t,OF);
				_t = _t.getNextSibling();
				rec = _t==ASTNULL ? null : (AST)_t;
				tbl(_t,CQ.SYMBOL);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COLUMNLABEL||_t.getType()==LABEL)) {
					label_constant(_t);
					_t = _retTree;
				}
				else if ((_tokenSet_27.member(_t.getType()))) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				{
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==NEW)) {
					{
					AST tmp1462_AST_in = (AST)_t;
					match(_t,NEW);
					_t = _t.getNextSibling();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case BUFFER:
					{
						AST tmp1463_AST_in = (AST)_t;
						match(_t,BUFFER);
						_t = _t.getNextSibling();
						break;
					}
					case ID:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					id1 = (AST)_t;
					match(_t,ID);
					_t = _t.getNextSibling();
					}
					{
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COLUMNLABEL||_t.getType()==LABEL)) {
						label_constant(_t);
						_t = _retTree;
					}
					else if ((_tokenSet_28.member(_t.getType()))) {
					}
					else {
						throw new NoViableAltException(_t);
					}
					
					}
					if ( inputState.guessing==0 ) {
						action.defineBuffer(id1, id1, rec, true);
					}
				}
				else if ((_tokenSet_28.member(_t.getType()))) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				if ( inputState.guessing==0 ) {
					if (id1 == null) action.defineBufferForTrigger(rec);
				}
				{
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==OLD)) {
					{
					AST tmp1464_AST_in = (AST)_t;
					match(_t,OLD);
					_t = _t.getNextSibling();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case BUFFER:
					{
						AST tmp1465_AST_in = (AST)_t;
						match(_t,BUFFER);
						_t = _t.getNextSibling();
						break;
					}
					case ID:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					id2 = (AST)_t;
					match(_t,ID);
					_t = _t.getNextSibling();
					}
					{
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COLUMNLABEL||_t.getType()==LABEL)) {
						label_constant(_t);
						_t = _retTree;
					}
					else if ((_tokenSet_26.member(_t.getType()))) {
					}
					else {
						throw new NoViableAltException(_t);
					}
					
					}
					if ( inputState.guessing==0 ) {
						action.defineBuffer(id2, id2, rec, true);
					}
				}
				else if ((_tokenSet_26.member(_t.getType()))) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				break;
			}
			case ASSIGN:
			{
				AST tmp1466_AST_in = (AST)_t;
				match(_t,ASSIGN);
				_t = _t.getNextSibling();
				AST tmp1467_AST_in = (AST)_t;
				match(_t,OF);
				_t = _t.getNextSibling();
				fld = _t==ASTNULL ? null : (AST)_t;
				fld(_t,CQ.INIT);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==TABLE)) {
					AST __t1016 = _t;
					AST tmp1468_AST_in = (AST)_t;
					match(_t,TABLE);
					_t = _t.getFirstChild();
					AST tmp1469_AST_in = (AST)_t;
					match(_t,LABEL);
					_t = _t.getNextSibling();
					constant(_t);
					_t = _retTree;
					_t = __t1016;
					_t = _t.getNextSibling();
				}
				else if ((_tokenSet_28.member(_t.getType()))) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				{
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==OLD)) {
					AST tmp1470_AST_in = (AST)_t;
					match(_t,OLD);
					_t = _t.getNextSibling();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case VALUE:
					{
						AST tmp1471_AST_in = (AST)_t;
						match(_t,VALUE);
						_t = _t.getNextSibling();
						break;
					}
					case ID:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					id = (AST)_t;
					match(_t,ID);
					_t = _t.getNextSibling();
					if ( inputState.guessing==0 ) {
						push(action.defineVariable(id, id, fld));
					}
					{
					if (_t==null) _t=ASTNULL;
					if ((_tokenSet_29.member(_t.getType()))) {
						defineparam_var(_t);
						_t = _retTree;
					}
					else if ((_tokenSet_26.member(_t.getType()))) {
					}
					else {
						throw new NoViableAltException(_t);
					}
					
					}
					if ( inputState.guessing==0 ) {
						action.addToSymbolScope(pop());
					}
				}
				else if ((_tokenSet_26.member(_t.getType()))) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case OVERRIDE:
			{
				AST tmp1472_AST_in = (AST)_t;
				match(_t,OVERRIDE);
				_t = _t.getNextSibling();
				break;
			}
			case PERIOD:
			case PROPARSEDIRECTIVE:
			case AATRACE:
			case ACCUMULATE:
			case ALTER:
			case ANALYZE:
			case APPLY:
			case ASSIGN:
			case BELL:
			case BTOS:
			case BUFFERCOMPARE:
			case BUFFERCOPY:
			case CALL:
			case CASE:
			case CHOOSE:
			case CLEAR:
			case CLOSE:
			case COLOR:
			case COMPILE:
			case CONNECT:
			case CREATE:
			case DDE:
			case DECLARE:
			case DEFINE:
			case DELETE_KW:
			case DICTIONARY:
			case DISABLE:
			case DISCONNECT:
			case DISPLAY:
			case DO:
			case DOS:
			case DOWN:
			case DROP:
			case EMPTY:
			case ENABLE:
			case EXPORT:
			case FETCH:
			case FIND:
			case FOR:
			case FORMAT:
			case FUNCTION:
			case GET:
			case GETKEYVALUE:
			case GRANT:
			case HIDE:
			case IF:
			case IMPORT:
			case INPUT:
			case INPUTOUTPUT:
			case INSERT:
			case LEAVE:
			case LOAD:
			case MESSAGE:
			case MPE:
			case NEXT:
			case NEXTPROMPT:
			case ON:
			case OPEN:
			case OS2:
			case OS400:
			case OSAPPEND:
			case OSCOMMAND:
			case OSCOPY:
			case OSCREATEDIR:
			case OSDELETE:
			case OSRENAME:
			case OUTPUT:
			case PAGE:
			case PAUSE:
			case PERSISTENT:
			case PROCEDURE:
			case PROCESS:
			case PROMPTFOR:
			case PUBLISH:
			case PUT:
			case PUTKEYVALUE:
			case QUIT:
			case RAWTRANSFER:
			case READKEY:
			case RELEASE:
			case REPEAT:
			case REPOSITION:
			case RETURN:
			case REVERT:
			case REVOKE:
			case RUN:
			case SAVE:
			case SCROLL:
			case SEEK:
			case SELECT:
			case SET:
			case SHOWSTATS:
			case STATUS:
			case STOP:
			case SUBSCRIBE:
			case SYSTEMDIALOG:
			case SYSTEMHELP:
			case TRANSACTIONMODE:
			case TRIGGER:
			case UNDERLINE:
			case UNDO:
			case UNIX:
			case UNLOAD:
			case UNSUBSCRIBE:
			case UP:
			case UPDATE:
			case USE:
			case USING:
			case VALIDATE:
			case VIEW:
			case VMS:
			case WAITFOR:
			case Expr_statement:
			case BLOCK_LABEL:
			case COPYLOB:
			case DOT_COMMENT:
			case CLASS:
			case CONSTRUCTOR:
			case INTERFACE:
			case METHOD:
			case THISOBJECT:
			case DESTRUCTOR:
			case ANNOTATION:
			case CATCH:
			case FINALLY:
			case ROUTINELEVEL:
			case Assign_dynamic_new:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case REVERT:
			{
				AST tmp1473_AST_in = (AST)_t;
				match(_t,REVERT);
				_t = _t.getNextSibling();
				state_end(_t);
				_t = _retTree;
				break;
			}
			case PERSISTENT:
			{
				AST tmp1474_AST_in = (AST)_t;
				match(_t,PERSISTENT);
				_t = _t.getNextSibling();
				runstate(_t);
				_t = _retTree;
				break;
			}
			case PERIOD:
			case PROPARSEDIRECTIVE:
			case AATRACE:
			case ACCUMULATE:
			case ALTER:
			case ANALYZE:
			case APPLY:
			case ASSIGN:
			case BELL:
			case BTOS:
			case BUFFERCOMPARE:
			case BUFFERCOPY:
			case CALL:
			case CASE:
			case CHOOSE:
			case CLEAR:
			case CLOSE:
			case COLOR:
			case COMPILE:
			case CONNECT:
			case CREATE:
			case DDE:
			case DECLARE:
			case DEFINE:
			case DELETE_KW:
			case DICTIONARY:
			case DISABLE:
			case DISCONNECT:
			case DISPLAY:
			case DO:
			case DOS:
			case DOWN:
			case DROP:
			case EMPTY:
			case ENABLE:
			case EXPORT:
			case FETCH:
			case FIND:
			case FOR:
			case FORMAT:
			case FUNCTION:
			case GET:
			case GETKEYVALUE:
			case GRANT:
			case HIDE:
			case IF:
			case IMPORT:
			case INPUT:
			case INPUTOUTPUT:
			case INSERT:
			case LEAVE:
			case LOAD:
			case MESSAGE:
			case MPE:
			case NEXT:
			case NEXTPROMPT:
			case ON:
			case OPEN:
			case OS2:
			case OS400:
			case OSAPPEND:
			case OSCOMMAND:
			case OSCOPY:
			case OSCREATEDIR:
			case OSDELETE:
			case OSRENAME:
			case OUTPUT:
			case PAGE:
			case PAUSE:
			case PROCEDURE:
			case PROCESS:
			case PROMPTFOR:
			case PUBLISH:
			case PUT:
			case PUTKEYVALUE:
			case QUIT:
			case RAWTRANSFER:
			case READKEY:
			case RELEASE:
			case REPEAT:
			case REPOSITION:
			case RETURN:
			case REVOKE:
			case RUN:
			case SAVE:
			case SCROLL:
			case SEEK:
			case SELECT:
			case SET:
			case SHOWSTATS:
			case STATUS:
			case STOP:
			case SUBSCRIBE:
			case SYSTEMDIALOG:
			case SYSTEMHELP:
			case TRANSACTIONMODE:
			case TRIGGER:
			case UNDERLINE:
			case UNDO:
			case UNIX:
			case UNLOAD:
			case UNSUBSCRIBE:
			case UP:
			case UPDATE:
			case USE:
			case USING:
			case VALIDATE:
			case VIEW:
			case VMS:
			case WAITFOR:
			case Expr_statement:
			case BLOCK_LABEL:
			case COPYLOB:
			case DOT_COMMENT:
			case CLASS:
			case CONSTRUCTOR:
			case INTERFACE:
			case METHOD:
			case THISOBJECT:
			case DESTRUCTOR:
			case ANNOTATION:
			case CATCH:
			case FINALLY:
			case ROUTINELEVEL:
			case Assign_dynamic_new:
			{
				blockorstate(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
		}
		else {
			boolean synPredMatched1023 = false;
			if (_t==null) _t=ASTNULL;
			if ((((_t.getType() >= LEXDATE && _t.getType() <= Last_Token_Number)))) {
				AST __t1023 = _t;
				synPredMatched1023 = true;
				inputState.guessing++;
				try {
					{
					AST tmp1475_AST_in = (AST)_t;
					if ( _t==null ) throw new MismatchedTokenException();
					_t = _t.getNextSibling();
					AST tmp1476_AST_in = (AST)_t;
					if ( _t==null ) throw new MismatchedTokenException();
					_t = _t.getNextSibling();
					state_end(_t);
					_t = _retTree;
					}
				}
				catch (RecognitionException pe) {
					synPredMatched1023 = false;
				}
				_t = __t1023;
inputState.guessing--;
			}
			if ( synPredMatched1023 ) {
				AST tmp1477_AST_in = (AST)_t;
				if ( _t==null ) throw new MismatchedTokenException();
				_t = _t.getNextSibling();
				AST tmp1478_AST_in = (AST)_t;
				if ( _t==null ) throw new MismatchedTokenException();
				_t = _t.getNextSibling();
				state_end(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==Event_list)) {
				eventlist(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case ANYWHERE:
				{
					AST tmp1479_AST_in = (AST)_t;
					match(_t,ANYWHERE);
					_t = _t.getNextSibling();
					break;
				}
				case OF:
				{
					AST tmp1480_AST_in = (AST)_t;
					match(_t,OF);
					_t = _t.getNextSibling();
					widgetlist(_t);
					_t = _retTree;
					{
					_loop1026:
					do {
						if (_t==null) _t=ASTNULL;
						if ((_t.getType()==OR)) {
							AST tmp1481_AST_in = (AST)_t;
							match(_t,OR);
							_t = _t.getNextSibling();
							eventlist(_t);
							_t = _retTree;
							AST tmp1482_AST_in = (AST)_t;
							match(_t,OF);
							_t = _t.getNextSibling();
							widgetlist(_t);
							_t = _retTree;
						}
						else {
							break _loop1026;
						}
						
					} while (true);
					}
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case ANYWHERE:
					{
						AST tmp1483_AST_in = (AST)_t;
						match(_t,ANYWHERE);
						_t = _t.getNextSibling();
						break;
					}
					case PERIOD:
					case PROPARSEDIRECTIVE:
					case AATRACE:
					case ACCUMULATE:
					case ALTER:
					case ANALYZE:
					case APPLY:
					case ASSIGN:
					case BELL:
					case BTOS:
					case BUFFERCOMPARE:
					case BUFFERCOPY:
					case CALL:
					case CASE:
					case CHOOSE:
					case CLEAR:
					case CLOSE:
					case COLOR:
					case COMPILE:
					case CONNECT:
					case CREATE:
					case DDE:
					case DECLARE:
					case DEFINE:
					case DELETE_KW:
					case DICTIONARY:
					case DISABLE:
					case DISCONNECT:
					case DISPLAY:
					case DO:
					case DOS:
					case DOWN:
					case DROP:
					case EMPTY:
					case ENABLE:
					case EXPORT:
					case FETCH:
					case FIND:
					case FOR:
					case FORMAT:
					case FUNCTION:
					case GET:
					case GETKEYVALUE:
					case GRANT:
					case HIDE:
					case IF:
					case IMPORT:
					case INPUT:
					case INPUTOUTPUT:
					case INSERT:
					case LEAVE:
					case LOAD:
					case MESSAGE:
					case MPE:
					case NEXT:
					case NEXTPROMPT:
					case ON:
					case OPEN:
					case OS2:
					case OS400:
					case OSAPPEND:
					case OSCOMMAND:
					case OSCOPY:
					case OSCREATEDIR:
					case OSDELETE:
					case OSRENAME:
					case OUTPUT:
					case PAGE:
					case PAUSE:
					case PERSISTENT:
					case PROCEDURE:
					case PROCESS:
					case PROMPTFOR:
					case PUBLISH:
					case PUT:
					case PUTKEYVALUE:
					case QUIT:
					case RAWTRANSFER:
					case READKEY:
					case RELEASE:
					case REPEAT:
					case REPOSITION:
					case RETURN:
					case REVERT:
					case REVOKE:
					case RUN:
					case SAVE:
					case SCROLL:
					case SEEK:
					case SELECT:
					case SET:
					case SHOWSTATS:
					case STATUS:
					case STOP:
					case SUBSCRIBE:
					case SYSTEMDIALOG:
					case SYSTEMHELP:
					case TRANSACTIONMODE:
					case TRIGGER:
					case UNDERLINE:
					case UNDO:
					case UNIX:
					case UNLOAD:
					case UNSUBSCRIBE:
					case UP:
					case UPDATE:
					case USE:
					case USING:
					case VALIDATE:
					case VIEW:
					case VMS:
					case WAITFOR:
					case Expr_statement:
					case BLOCK_LABEL:
					case COPYLOB:
					case DOT_COMMENT:
					case CLASS:
					case CONSTRUCTOR:
					case INTERFACE:
					case METHOD:
					case THISOBJECT:
					case DESTRUCTOR:
					case ANNOTATION:
					case CATCH:
					case FINALLY:
					case ROUTINELEVEL:
					case Assign_dynamic_new:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case REVERT:
				{
					AST tmp1484_AST_in = (AST)_t;
					match(_t,REVERT);
					_t = _t.getNextSibling();
					state_end(_t);
					_t = _retTree;
					break;
				}
				case PERSISTENT:
				{
					AST tmp1485_AST_in = (AST)_t;
					match(_t,PERSISTENT);
					_t = _t.getNextSibling();
					AST tmp1486_AST_in = (AST)_t;
					match(_t,RUN);
					_t = _t.getNextSibling();
					filenameorvalue(_t);
					_t = _retTree;
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case IN_KW:
					{
						AST __t1030 = _t;
						AST tmp1487_AST_in = (AST)_t;
						match(_t,IN_KW);
						_t = _t.getFirstChild();
						expression(_t);
						_t = _retTree;
						_t = __t1030;
						_t = _t.getNextSibling();
						break;
					}
					case EOF:
					case PERIOD:
					case Parameter_list:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case Parameter_list:
					{
						AST __t1032 = _t;
						AST tmp1488_AST_in = (AST)_t;
						match(_t,Parameter_list);
						_t = _t.getFirstChild();
						AST tmp1489_AST_in = (AST)_t;
						match(_t,LEFTPAREN);
						_t = _t.getNextSibling();
						{
						if (_t==null) _t=ASTNULL;
						if ((_t.getType()==INPUT)) {
							AST tmp1490_AST_in = (AST)_t;
							match(_t,INPUT);
							_t = _t.getNextSibling();
						}
						else if ((_tokenSet_3.member(_t.getType()))) {
						}
						else {
							throw new NoViableAltException(_t);
						}
						
						}
						expression(_t);
						_t = _retTree;
						{
						_loop1036:
						do {
							if (_t==null) _t=ASTNULL;
							if ((_t.getType()==COMMA)) {
								AST tmp1491_AST_in = (AST)_t;
								match(_t,COMMA);
								_t = _t.getNextSibling();
								{
								if (_t==null) _t=ASTNULL;
								if ((_t.getType()==INPUT)) {
									AST tmp1492_AST_in = (AST)_t;
									match(_t,INPUT);
									_t = _t.getNextSibling();
								}
								else if ((_tokenSet_3.member(_t.getType()))) {
								}
								else {
									throw new NoViableAltException(_t);
								}
								
								}
								expression(_t);
								_t = _retTree;
							}
							else {
								break _loop1036;
							}
							
						} while (true);
						}
						AST tmp1493_AST_in = (AST)_t;
						match(_t,RIGHTPAREN);
						_t = _t.getNextSibling();
						_t = __t1032;
						_t = _t.getNextSibling();
						break;
					}
					case EOF:
					case PERIOD:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					state_end(_t);
					_t = _retTree;
					break;
				}
				case PERIOD:
				case PROPARSEDIRECTIVE:
				case AATRACE:
				case ACCUMULATE:
				case ALTER:
				case ANALYZE:
				case APPLY:
				case ASSIGN:
				case BELL:
				case BTOS:
				case BUFFERCOMPARE:
				case BUFFERCOPY:
				case CALL:
				case CASE:
				case CHOOSE:
				case CLEAR:
				case CLOSE:
				case COLOR:
				case COMPILE:
				case CONNECT:
				case CREATE:
				case DDE:
				case DECLARE:
				case DEFINE:
				case DELETE_KW:
				case DICTIONARY:
				case DISABLE:
				case DISCONNECT:
				case DISPLAY:
				case DO:
				case DOS:
				case DOWN:
				case DROP:
				case EMPTY:
				case ENABLE:
				case EXPORT:
				case FETCH:
				case FIND:
				case FOR:
				case FORMAT:
				case FUNCTION:
				case GET:
				case GETKEYVALUE:
				case GRANT:
				case HIDE:
				case IF:
				case IMPORT:
				case INPUT:
				case INPUTOUTPUT:
				case INSERT:
				case LEAVE:
				case LOAD:
				case MESSAGE:
				case MPE:
				case NEXT:
				case NEXTPROMPT:
				case ON:
				case OPEN:
				case OS2:
				case OS400:
				case OSAPPEND:
				case OSCOMMAND:
				case OSCOPY:
				case OSCREATEDIR:
				case OSDELETE:
				case OSRENAME:
				case OUTPUT:
				case PAGE:
				case PAUSE:
				case PROCEDURE:
				case PROCESS:
				case PROMPTFOR:
				case PUBLISH:
				case PUT:
				case PUTKEYVALUE:
				case QUIT:
				case RAWTRANSFER:
				case READKEY:
				case RELEASE:
				case REPEAT:
				case REPOSITION:
				case RETURN:
				case REVOKE:
				case RUN:
				case SAVE:
				case SCROLL:
				case SEEK:
				case SELECT:
				case SET:
				case SHOWSTATS:
				case STATUS:
				case STOP:
				case SUBSCRIBE:
				case SYSTEMDIALOG:
				case SYSTEMHELP:
				case TRANSACTIONMODE:
				case TRIGGER:
				case UNDERLINE:
				case UNDO:
				case UNIX:
				case UNLOAD:
				case UNSUBSCRIBE:
				case UP:
				case UPDATE:
				case USE:
				case USING:
				case VALIDATE:
				case VIEW:
				case VMS:
				case WAITFOR:
				case Expr_statement:
				case BLOCK_LABEL:
				case COPYLOB:
				case DOT_COMMENT:
				case CLASS:
				case CONSTRUCTOR:
				case INTERFACE:
				case METHOD:
				case THISOBJECT:
				case DESTRUCTOR:
				case ANNOTATION:
				case CATCH:
				case FINALLY:
				case ROUTINELEVEL:
				case Assign_dynamic_new:
				{
					blockorstate(_t);
					_t = _retTree;
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
			}
			else {
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.scopeClose(onNode);
			}
			_t = __t999;
			_t = _t.getNextSibling();
			_retTree = _t;
		}
		
	public final void runstate(AST _t) throws RecognitionException {
		
		AST runstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST r = null;
		AST hnd = null;
		AST hexp = null;
		
		AST __t1118 = _t;
		r = _t==ASTNULL ? null :(AST)_t;
		match(_t,RUN);
		_t = _t.getFirstChild();
		filenameorvalue(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.runBegin(r);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case LEFTANGLE:
		{
			AST tmp1494_AST_in = (AST)_t;
			match(_t,LEFTANGLE);
			_t = _t.getNextSibling();
			AST tmp1495_AST_in = (AST)_t;
			match(_t,LEFTANGLE);
			_t = _t.getNextSibling();
			filenameorvalue(_t);
			_t = _retTree;
			AST tmp1496_AST_in = (AST)_t;
			match(_t,RIGHTANGLE);
			_t = _t.getNextSibling();
			AST tmp1497_AST_in = (AST)_t;
			match(_t,RIGHTANGLE);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case ASYNCHRONOUS:
		case IN_KW:
		case NOERROR_KW:
		case ON:
		case PERSISTENT:
		case SET:
		case VALUE:
		case Parameter_list:
		case TYPELESS_TOKEN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1140:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PERSISTENT:
			{
				AST __t1121 = _t;
				AST tmp1498_AST_in = (AST)_t;
				match(_t,PERSISTENT);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case SET:
				{
					AST __t1123 = _t;
					AST tmp1499_AST_in = (AST)_t;
					match(_t,SET);
					_t = _t.getFirstChild();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case Field_ref:
					{
						hnd = _t==ASTNULL ? null : (AST)_t;
						fld(_t,CQ.UPDATING);
						_t = _retTree;
						if ( inputState.guessing==0 ) {
							action.runPersistentSet(hnd);
						}
						break;
					}
					case 3:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					_t = __t1123;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1121;
				_t = _t.getNextSibling();
				break;
			}
			case SET:
			{
				AST __t1125 = _t;
				AST tmp1500_AST_in = (AST)_t;
				match(_t,SET);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Field_ref:
				{
					fld(_t,CQ.UPDATING);
					_t = _retTree;
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1125;
				_t = _t.getNextSibling();
				break;
			}
			case ON:
			{
				AST __t1127 = _t;
				AST tmp1501_AST_in = (AST)_t;
				match(_t,ON);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==SERVER)) {
					AST tmp1502_AST_in = (AST)_t;
					match(_t,SERVER);
					_t = _t.getNextSibling();
				}
				else if ((_tokenSet_3.member(_t.getType()))) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				expression(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case TRANSACTION:
				{
					AST tmp1503_AST_in = (AST)_t;
					match(_t,TRANSACTION);
					_t = _t.getNextSibling();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case DISTINCT:
					{
						AST tmp1504_AST_in = (AST)_t;
						match(_t,DISTINCT);
						_t = _t.getNextSibling();
						break;
					}
					case 3:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1127;
				_t = _t.getNextSibling();
				break;
			}
			case IN_KW:
			{
				AST __t1131 = _t;
				AST tmp1505_AST_in = (AST)_t;
				match(_t,IN_KW);
				_t = _t.getFirstChild();
				hexp = _t==ASTNULL ? null : (AST)_t;
				expression(_t);
				_t = _retTree;
				_t = __t1131;
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
					action.runInHandle(hexp);
				}
				break;
			}
			case ASYNCHRONOUS:
			{
				AST __t1132 = _t;
				AST tmp1506_AST_in = (AST)_t;
				match(_t,ASYNCHRONOUS);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case SET:
				{
					AST __t1134 = _t;
					AST tmp1507_AST_in = (AST)_t;
					match(_t,SET);
					_t = _t.getFirstChild();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case Field_ref:
					{
						fld(_t,CQ.UPDATING);
						_t = _retTree;
						break;
					}
					case 3:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					_t = __t1134;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				case EVENTPROCEDURE:
				case IN_KW:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EVENTPROCEDURE:
				{
					AST __t1137 = _t;
					AST tmp1508_AST_in = (AST)_t;
					match(_t,EVENTPROCEDURE);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1137;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				case IN_KW:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case IN_KW:
				{
					AST __t1139 = _t;
					AST tmp1509_AST_in = (AST)_t;
					match(_t,IN_KW);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1139;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1132;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop1140;
			}
			}
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Parameter_list:
		{
			parameterlist(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case VALUE:
		case TYPELESS_TOKEN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1143:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOERROR_KW:
			{
				AST tmp1510_AST_in = (AST)_t;
				match(_t,NOERROR_KW);
				_t = _t.getNextSibling();
				break;
			}
			case VALUE:
			case TYPELESS_TOKEN:
			{
				anyorvalue(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				break _loop1143;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.runEnd(r);
		}
		_t = __t1118;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void eventlist(AST _t) throws RecognitionException {
		
		AST eventlist_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1609 = _t;
		AST tmp1511_AST_in = (AST)_t;
		match(_t,Event_list);
		_t = _t.getFirstChild();
		AST tmp1512_AST_in = (AST)_t;
		if ( _t==null ) throw new MismatchedTokenException();
		_t = _t.getNextSibling();
		{
		_loop1611:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp1513_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				AST tmp1514_AST_in = (AST)_t;
				if ( _t==null ) throw new MismatchedTokenException();
				_t = _t.getNextSibling();
			}
			else {
				break _loop1611;
			}
			
		} while (true);
		}
		_t = __t1609;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void widgetlist(AST _t) throws RecognitionException {
		
		AST widgetlist_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		gwidget(_t);
		_t = _retTree;
		{
		_loop1644:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp1515_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				gwidget(_t);
				_t = _retTree;
			}
			else {
				break _loop1644;
			}
			
		} while (true);
		}
		_retTree = _t;
	}
	
	public final void openquerystate(AST _t) throws RecognitionException {
		
		AST openquerystate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1038 = _t;
		AST tmp1516_AST_in = (AST)_t;
		match(_t,OPEN);
		_t = _t.getFirstChild();
		AST tmp1517_AST_in = (AST)_t;
		match(_t,QUERY);
		_t = _t.getNextSibling();
		AST tmp1518_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FOR:
		{
			AST tmp1519_AST_in = (AST)_t;
			match(_t,FOR);
			_t = _t.getNextSibling();
			break;
		}
		case PRESELECT:
		{
			AST tmp1520_AST_in = (AST)_t;
			match(_t,PRESELECT);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		for_record_spec(_t,CQ.INIT);
		_t = _retTree;
		{
		_loop1044:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case QUERYTUNING:
			{
				querytuningphrase(_t);
				_t = _retTree;
				break;
			}
			case BREAK:
			{
				AST tmp1521_AST_in = (AST)_t;
				match(_t,BREAK);
				_t = _t.getNextSibling();
				break;
			}
			case BY:
			{
				AST __t1041 = _t;
				AST tmp1522_AST_in = (AST)_t;
				match(_t,BY);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case DESCENDING:
				{
					AST tmp1523_AST_in = (AST)_t;
					match(_t,DESCENDING);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1041;
				_t = _t.getNextSibling();
				break;
			}
			case COLLATE:
			{
				collatephrase(_t);
				_t = _retTree;
				break;
			}
			case INDEXEDREPOSITION:
			{
				AST tmp1524_AST_in = (AST)_t;
				match(_t,INDEXEDREPOSITION);
				_t = _t.getNextSibling();
				break;
			}
			case MAXROWS:
			{
				AST __t1043 = _t;
				AST tmp1525_AST_in = (AST)_t;
				match(_t,MAXROWS);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1043;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop1044;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1038;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void procedurestate(AST _t) throws RecognitionException {
		
		AST procedurestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST p = null;
		AST id = null;
		
		AST __t1046 = _t;
		p = _t==ASTNULL ? null :(AST)_t;
		match(_t,PROCEDURE);
		_t = _t.getFirstChild();
		id = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		if ( inputState.guessing==0 ) {
				action.procedureBegin(p, id);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXTERNAL:
		{
			AST __t1048 = _t;
			AST tmp1526_AST_in = (AST)_t;
			match(_t,EXTERNAL);
			_t = _t.getFirstChild();
			constant(_t);
			_t = _retTree;
			{
			_loop1051:
			do {
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case CDECL_KW:
				{
					AST tmp1527_AST_in = (AST)_t;
					match(_t,CDECL_KW);
					_t = _t.getNextSibling();
					break;
				}
				case PASCAL_KW:
				{
					AST tmp1528_AST_in = (AST)_t;
					match(_t,PASCAL_KW);
					_t = _t.getNextSibling();
					break;
				}
				case STDCALL_KW:
				{
					AST tmp1529_AST_in = (AST)_t;
					match(_t,STDCALL_KW);
					_t = _t.getNextSibling();
					break;
				}
				case ORDINAL:
				{
					AST __t1050 = _t;
					AST tmp1530_AST_in = (AST)_t;
					match(_t,ORDINAL);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1050;
					_t = _t.getNextSibling();
					break;
				}
				case PERSISTENT:
				{
					AST tmp1531_AST_in = (AST)_t;
					match(_t,PERSISTENT);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					break _loop1051;
				}
				}
			} while (true);
			}
			_t = __t1048;
			_t = _t.getNextSibling();
			break;
		}
		case PRIVATE:
		{
			AST tmp1532_AST_in = (AST)_t;
			match(_t,PRIVATE);
			_t = _t.getNextSibling();
			break;
		}
		case IN_KW:
		{
			AST tmp1533_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getNextSibling();
			AST tmp1534_AST_in = (AST)_t;
			match(_t,SUPER);
			_t = _t.getNextSibling();
			break;
		}
		case PERIOD:
		case LEXCOLON:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		block_colon(_t);
		_t = _retTree;
		code_block(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EOF:
		{
			AST tmp1535_AST_in = (AST)_t;
			match(_t,Token.EOF_TYPE);
			_t = _t.getNextSibling();
			break;
		}
		case END:
		{
			AST __t1053 = _t;
			AST tmp1536_AST_in = (AST)_t;
			match(_t,END);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PROCEDURE:
			{
				AST tmp1537_AST_in = (AST)_t;
				match(_t,PROCEDURE);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1053;
			_t = _t.getNextSibling();
			state_end(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		if ( inputState.guessing==0 ) {
				action.procedureEnd(p);
		}
		_t = __t1046;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void promptforstate(AST _t) throws RecognitionException {
		
		AST promptforstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		
		AST __t1056 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,PROMPTFOR);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameEnablingStatement(head);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case GOON:
		case IN_KW:
		case UNLESSHIDDEN:
		case WITH:
		case Editing_phrase:
		case Form_item:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case UNLESSHIDDEN:
		{
			AST tmp1538_AST_in = (AST)_t;
			match(_t,UNLESSHIDDEN);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case GOON:
		case IN_KW:
		case WITH:
		case Editing_phrase:
		case Form_item:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1060:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Form_item)) {
				form_item(_t,CQ.SYMBOL);
				_t = _retTree;
			}
			else {
				break _loop1060;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case GOON:
		{
			goonphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case IN_KW:
		case WITH:
		case Editing_phrase:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXCEPT:
		{
			AST __t1063 = _t;
			AST tmp1539_AST_in = (AST)_t;
			match(_t,EXCEPT);
			_t = _t.getFirstChild();
			{
			_loop1065:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					break _loop1065;
				}
				
			} while (true);
			}
			_t = __t1063;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case IN_KW:
		case WITH:
		case Editing_phrase:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t1067 = _t;
			AST tmp1540_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp1541_AST_in = (AST)_t;
			match(_t,WINDOW);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t1067;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case WITH:
		case Editing_phrase:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case Editing_phrase:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Editing_phrase:
		{
			editingphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1056;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void editingphrase(AST _t) throws RecognitionException {
		
		AST editingphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1985 = _t;
		AST tmp1542_AST_in = (AST)_t;
		match(_t,Editing_phrase);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ID:
		{
			AST tmp1543_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			AST tmp1544_AST_in = (AST)_t;
			match(_t,LEXCOLON);
			_t = _t.getNextSibling();
			break;
		}
		case EDITING:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp1545_AST_in = (AST)_t;
		match(_t,EDITING);
		_t = _t.getNextSibling();
		block_colon(_t);
		_t = _retTree;
		{
		_loop1988:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_0.member(_t.getType()))) {
				blockorstate(_t);
				_t = _retTree;
			}
			else {
				break _loop1988;
			}
			
		} while (true);
		}
		AST tmp1546_AST_in = (AST)_t;
		match(_t,END);
		_t = _t.getNextSibling();
		_t = __t1985;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void publishstate(AST _t) throws RecognitionException {
		
		AST publishstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST pu = null;
		
		AST __t1071 = _t;
		pu = _t==ASTNULL ? null :(AST)_t;
		match(_t,PUBLISH);
		_t = _t.getFirstChild();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FROM:
		{
			AST __t1073 = _t;
			AST tmp1547_AST_in = (AST)_t;
			match(_t,FROM);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1073;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case Parameter_list:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		if ( inputState.guessing==0 ) {
			action.callBegin(pu);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Parameter_list:
		{
			parameterlist(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.callEnd();
		}
		_t = __t1071;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void rawtransferstate(AST _t) throws RecognitionException {
		
		AST rawtransferstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1076 = _t;
		AST tmp1548_AST_in = (AST)_t;
		match(_t,RAWTRANSFER);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BUFFER:
		{
			AST tmp1549_AST_in = (AST)_t;
			match(_t,BUFFER);
			_t = _t.getNextSibling();
			break;
		}
		case FIELD:
		{
			AST tmp1550_AST_in = (AST)_t;
			match(_t,FIELD);
			_t = _t.getNextSibling();
			break;
		}
		case Field_ref:
		case RECORD_NAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RECORD_NAME:
		{
			tbl(_t,CQ.REF);
			_t = _retTree;
			break;
		}
		case Field_ref:
		{
			fld(_t,CQ.REF);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp1551_AST_in = (AST)_t;
		match(_t,TO);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BUFFER:
		{
			AST tmp1552_AST_in = (AST)_t;
			match(_t,BUFFER);
			_t = _t.getNextSibling();
			break;
		}
		case FIELD:
		{
			AST tmp1553_AST_in = (AST)_t;
			match(_t,FIELD);
			_t = _t.getNextSibling();
			break;
		}
		case Field_ref:
		case RECORD_NAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RECORD_NAME:
		{
			tbl(_t,CQ.UPDATING);
			_t = _retTree;
			break;
		}
		case Field_ref:
		{
			fld(_t,CQ.UPDATING);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1554_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1076;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void releasestate(AST _t) throws RecognitionException {
		
		AST releasestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1109 = _t;
		AST tmp1555_AST_in = (AST)_t;
		match(_t,RELEASE);
		_t = _t.getFirstChild();
		tbl(_t,CQ.REF);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1556_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1109;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void repeatstate(AST _t) throws RecognitionException {
		
		AST repeatstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST r = null;
		
		AST __t1112 = _t;
		r = _t==ASTNULL ? null :(AST)_t;
		match(_t,REPEAT);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
				action.blockBegin(r);
							action.frameBlockCheck(r);
						
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FOR:
		{
			block_for(_t);
			_t = _retTree;
			break;
		}
		case PERIOD:
		case BREAK:
		case BY:
		case COLLATE:
		case GROUP:
		case ON:
		case PRESELECT:
		case QUERYTUNING:
		case TRANSACTION:
		case WHILE:
		case WITH:
		case LEXCOLON:
		case Block_iterator:
		case STOPAFTER:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PRESELECT:
		{
			block_preselect(_t);
			_t = _retTree;
			break;
		}
		case PERIOD:
		case BREAK:
		case BY:
		case COLLATE:
		case GROUP:
		case ON:
		case QUERYTUNING:
		case TRANSACTION:
		case WHILE:
		case WITH:
		case LEXCOLON:
		case Block_iterator:
		case STOPAFTER:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1116:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_22.member(_t.getType()))) {
				block_opt(_t);
				_t = _retTree;
			}
			else {
				break _loop1116;
			}
			
		} while (true);
		}
		block_colon(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		code_block(_t);
		_t = _retTree;
		block_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.blockEnd();
		}
		_t = __t1112;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void runstoredprocedurestate(AST _t) throws RecognitionException {
		
		AST runstoredprocedurestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST r = null;
		
		AST __t1145 = _t;
		r = _t==ASTNULL ? null :(AST)_t;
		match(_t,RUN);
		_t = _t.getFirstChild();
		AST tmp1557_AST_in = (AST)_t;
		match(_t,STOREDPROCEDURE);
		_t = _t.getNextSibling();
		AST tmp1558_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EQUAL:
		{
			assign_equal(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case Parameter_list:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1559_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case Parameter_list:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		if ( inputState.guessing==0 ) {
			action.callBegin(r);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Parameter_list:
		{
			parameterlist(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.callEnd();
		}
		_t = __t1145;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void runsuperstate(AST _t) throws RecognitionException {
		
		AST runsuperstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST r = null;
		
		AST __t1150 = _t;
		r = _t==ASTNULL ? null :(AST)_t;
		match(_t,RUN);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.callBegin(r);
		}
		AST tmp1560_AST_in = (AST)_t;
		match(_t,SUPER);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Parameter_list:
		{
			parameterlist(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1561_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.callEnd();
		}
		_t = __t1150;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void scrollstate(AST _t) throws RecognitionException {
		
		AST scrollstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		
		AST __t1154 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,SCROLL);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameInitializingStatement(head);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FROMCURRENT:
		{
			AST tmp1562_AST_in = (AST)_t;
			match(_t,FROMCURRENT);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case DOWN:
		case UP:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case UP:
		{
			AST tmp1563_AST_in = (AST)_t;
			match(_t,UP);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case DOWN:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case DOWN:
		{
			AST tmp1564_AST_in = (AST)_t;
			match(_t,DOWN);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_t = __t1154;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void setstate(AST _t) throws RecognitionException {
		
		AST setstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		
		AST __t1160 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,SET);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameInitializingStatement(head);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case GOON:
		case IN_KW:
		case NOERROR_KW:
		case UNLESSHIDDEN:
		case WITH:
		case Editing_phrase:
		case Form_item:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case UNLESSHIDDEN:
		{
			AST tmp1565_AST_in = (AST)_t;
			match(_t,UNLESSHIDDEN);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case GOON:
		case IN_KW:
		case NOERROR_KW:
		case WITH:
		case Editing_phrase:
		case Form_item:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1164:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Form_item)) {
				form_item(_t,CQ.UPDATING);
				_t = _retTree;
			}
			else {
				break _loop1164;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case GOON:
		{
			goonphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case IN_KW:
		case NOERROR_KW:
		case WITH:
		case Editing_phrase:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXCEPT:
		{
			AST __t1167 = _t;
			AST tmp1566_AST_in = (AST)_t;
			match(_t,EXCEPT);
			_t = _t.getFirstChild();
			{
			_loop1169:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					break _loop1169;
				}
				
			} while (true);
			}
			_t = __t1167;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case IN_KW:
		case NOERROR_KW:
		case WITH:
		case Editing_phrase:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t1171 = _t;
			AST tmp1567_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp1568_AST_in = (AST)_t;
			match(_t,WINDOW);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t1171;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case WITH:
		case Editing_phrase:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case Editing_phrase:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Editing_phrase:
		{
			editingphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1569_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1160;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void systemdialogcolorstate(AST _t) throws RecognitionException {
		
		AST systemdialogcolorstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1176 = _t;
		AST tmp1570_AST_in = (AST)_t;
		match(_t,SYSTEMDIALOG);
		_t = _t.getFirstChild();
		AST tmp1571_AST_in = (AST)_t;
		match(_t,COLOR);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case UPDATE:
		{
			AST __t1178 = _t;
			AST tmp1572_AST_in = (AST)_t;
			match(_t,UPDATE);
			_t = _t.getFirstChild();
			fld(_t,CQ.UPDATING);
			_t = _retTree;
			_t = __t1178;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case IN_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t1180 = _t;
			AST tmp1573_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp1574_AST_in = (AST)_t;
			match(_t,WINDOW);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t1180;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1176;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void systemdialogfontstate(AST _t) throws RecognitionException {
		
		AST systemdialogfontstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1182 = _t;
		AST tmp1575_AST_in = (AST)_t;
		match(_t,SYSTEMDIALOG);
		_t = _t.getFirstChild();
		AST tmp1576_AST_in = (AST)_t;
		match(_t,FONT);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		_loop1188:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ANSIONLY:
			{
				AST tmp1577_AST_in = (AST)_t;
				match(_t,ANSIONLY);
				_t = _t.getNextSibling();
				break;
			}
			case FIXEDONLY:
			{
				AST tmp1578_AST_in = (AST)_t;
				match(_t,FIXEDONLY);
				_t = _t.getNextSibling();
				break;
			}
			case MAXSIZE:
			{
				AST __t1184 = _t;
				AST tmp1579_AST_in = (AST)_t;
				match(_t,MAXSIZE);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1184;
				_t = _t.getNextSibling();
				break;
			}
			case MINSIZE:
			{
				AST __t1185 = _t;
				AST tmp1580_AST_in = (AST)_t;
				match(_t,MINSIZE);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1185;
				_t = _t.getNextSibling();
				break;
			}
			case UPDATE:
			{
				AST __t1186 = _t;
				AST tmp1581_AST_in = (AST)_t;
				match(_t,UPDATE);
				_t = _t.getFirstChild();
				fld(_t,CQ.UPDATING);
				_t = _retTree;
				_t = __t1186;
				_t = _t.getNextSibling();
				break;
			}
			case IN_KW:
			{
				AST __t1187 = _t;
				AST tmp1582_AST_in = (AST)_t;
				match(_t,IN_KW);
				_t = _t.getFirstChild();
				AST tmp1583_AST_in = (AST)_t;
				match(_t,WINDOW);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				_t = __t1187;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop1188;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1182;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void systemdialoggetdirstate(AST _t) throws RecognitionException {
		
		AST systemdialoggetdirstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1190 = _t;
		AST tmp1584_AST_in = (AST)_t;
		match(_t,SYSTEMDIALOG);
		_t = _t.getFirstChild();
		AST tmp1585_AST_in = (AST)_t;
		match(_t,GETDIR);
		_t = _t.getNextSibling();
		fld(_t,CQ.REFUP);
		_t = _retTree;
		{
		_loop1194:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case INITIALDIR:
			{
				AST __t1192 = _t;
				AST tmp1586_AST_in = (AST)_t;
				match(_t,INITIALDIR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1192;
				_t = _t.getNextSibling();
				break;
			}
			case RETURNTOSTARTDIR:
			{
				AST tmp1587_AST_in = (AST)_t;
				match(_t,RETURNTOSTARTDIR);
				_t = _t.getNextSibling();
				break;
			}
			case TITLE:
			{
				AST __t1193 = _t;
				AST tmp1588_AST_in = (AST)_t;
				match(_t,TITLE);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1193;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop1194;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1190;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void systemdialoggetfilestate(AST _t) throws RecognitionException {
		
		AST systemdialoggetfilestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1196 = _t;
		AST tmp1589_AST_in = (AST)_t;
		match(_t,SYSTEMDIALOG);
		_t = _t.getFirstChild();
		AST tmp1590_AST_in = (AST)_t;
		match(_t,GETFILE);
		_t = _t.getNextSibling();
		fld(_t,CQ.REFUP);
		_t = _retTree;
		{
		_loop1208:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case FILTERS:
			{
				AST __t1198 = _t;
				AST tmp1591_AST_in = (AST)_t;
				match(_t,FILTERS);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				expression(_t);
				_t = _retTree;
				{
				_loop1200:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COMMA)) {
						AST tmp1592_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						expression(_t);
						_t = _retTree;
						expression(_t);
						_t = _retTree;
					}
					else {
						break _loop1200;
					}
					
				} while (true);
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case INITIALFILTER:
				{
					AST __t1202 = _t;
					AST tmp1593_AST_in = (AST)_t;
					match(_t,INITIALFILTER);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1202;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1198;
				_t = _t.getNextSibling();
				break;
			}
			case ASKOVERWRITE:
			{
				AST tmp1594_AST_in = (AST)_t;
				match(_t,ASKOVERWRITE);
				_t = _t.getNextSibling();
				break;
			}
			case CREATETESTFILE:
			{
				AST tmp1595_AST_in = (AST)_t;
				match(_t,CREATETESTFILE);
				_t = _t.getNextSibling();
				break;
			}
			case DEFAULTEXTENSION:
			{
				AST __t1203 = _t;
				AST tmp1596_AST_in = (AST)_t;
				match(_t,DEFAULTEXTENSION);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1203;
				_t = _t.getNextSibling();
				break;
			}
			case INITIALDIR:
			{
				AST __t1204 = _t;
				AST tmp1597_AST_in = (AST)_t;
				match(_t,INITIALDIR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1204;
				_t = _t.getNextSibling();
				break;
			}
			case MUSTEXIST:
			{
				AST tmp1598_AST_in = (AST)_t;
				match(_t,MUSTEXIST);
				_t = _t.getNextSibling();
				break;
			}
			case RETURNTOSTARTDIR:
			{
				AST tmp1599_AST_in = (AST)_t;
				match(_t,RETURNTOSTARTDIR);
				_t = _t.getNextSibling();
				break;
			}
			case SAVEAS:
			{
				AST tmp1600_AST_in = (AST)_t;
				match(_t,SAVEAS);
				_t = _t.getNextSibling();
				break;
			}
			case TITLE:
			{
				AST __t1205 = _t;
				AST tmp1601_AST_in = (AST)_t;
				match(_t,TITLE);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1205;
				_t = _t.getNextSibling();
				break;
			}
			case USEFILENAME:
			{
				AST tmp1602_AST_in = (AST)_t;
				match(_t,USEFILENAME);
				_t = _t.getNextSibling();
				break;
			}
			case UPDATE:
			{
				AST __t1206 = _t;
				AST tmp1603_AST_in = (AST)_t;
				match(_t,UPDATE);
				_t = _t.getFirstChild();
				fld(_t,CQ.UPDATING);
				_t = _retTree;
				_t = __t1206;
				_t = _t.getNextSibling();
				break;
			}
			case IN_KW:
			{
				AST __t1207 = _t;
				AST tmp1604_AST_in = (AST)_t;
				match(_t,IN_KW);
				_t = _t.getFirstChild();
				AST tmp1605_AST_in = (AST)_t;
				match(_t,WINDOW);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				_t = __t1207;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop1208;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1196;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void systemdialogprintersetupstate(AST _t) throws RecognitionException {
		
		AST systemdialogprintersetupstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1210 = _t;
		AST tmp1606_AST_in = (AST)_t;
		match(_t,SYSTEMDIALOG);
		_t = _t.getFirstChild();
		AST tmp1607_AST_in = (AST)_t;
		match(_t,PRINTERSETUP);
		_t = _t.getNextSibling();
		{
		_loop1215:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NUMCOPIES:
			{
				AST __t1212 = _t;
				AST tmp1608_AST_in = (AST)_t;
				match(_t,NUMCOPIES);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1212;
				_t = _t.getNextSibling();
				break;
			}
			case UPDATE:
			{
				AST __t1213 = _t;
				AST tmp1609_AST_in = (AST)_t;
				match(_t,UPDATE);
				_t = _t.getFirstChild();
				fld(_t,CQ.UPDATING);
				_t = _retTree;
				_t = __t1213;
				_t = _t.getNextSibling();
				break;
			}
			case LANDSCAPE:
			{
				AST tmp1610_AST_in = (AST)_t;
				match(_t,LANDSCAPE);
				_t = _t.getNextSibling();
				break;
			}
			case PORTRAIT:
			{
				AST tmp1611_AST_in = (AST)_t;
				match(_t,PORTRAIT);
				_t = _t.getNextSibling();
				break;
			}
			case IN_KW:
			{
				AST __t1214 = _t;
				AST tmp1612_AST_in = (AST)_t;
				match(_t,IN_KW);
				_t = _t.getFirstChild();
				AST tmp1613_AST_in = (AST)_t;
				match(_t,WINDOW);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				_t = __t1214;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop1215;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1210;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void thisobjectstate(AST _t) throws RecognitionException {
		
		AST thisobjectstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST to = null;
		
		AST __t1217 = _t;
		to = _t==ASTNULL ? null :(AST)_t;
		match(_t,THISOBJECT);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.callBegin(to);
		}
		parameterlist_noroot(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.callEnd();
		}
		_t = __t1217;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void triggerprocedurestate(AST _t) throws RecognitionException {
		
		AST triggerprocedurestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST t1 = null;
		AST rec = null;
		AST id4 = null;
		AST id3 = null;
		AST id = null;
		AST id2 = null;
		
		AST __t1229 = _t;
		AST tmp1614_AST_in = (AST)_t;
		match(_t,TRIGGER);
		_t = _t.getFirstChild();
		AST tmp1615_AST_in = (AST)_t;
		match(_t,PROCEDURE);
		_t = _t.getNextSibling();
		AST tmp1616_AST_in = (AST)_t;
		match(_t,FOR);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CREATE:
		case DELETE_KW:
		case FIND:
		case REPLICATIONCREATE:
		case REPLICATIONDELETE:
		{
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case CREATE:
			{
				AST tmp1617_AST_in = (AST)_t;
				match(_t,CREATE);
				_t = _t.getNextSibling();
				break;
			}
			case DELETE_KW:
			{
				AST tmp1618_AST_in = (AST)_t;
				match(_t,DELETE_KW);
				_t = _t.getNextSibling();
				break;
			}
			case FIND:
			{
				AST tmp1619_AST_in = (AST)_t;
				match(_t,FIND);
				_t = _t.getNextSibling();
				break;
			}
			case REPLICATIONCREATE:
			{
				AST tmp1620_AST_in = (AST)_t;
				match(_t,REPLICATIONCREATE);
				_t = _t.getNextSibling();
				break;
			}
			case REPLICATIONDELETE:
			{
				AST tmp1621_AST_in = (AST)_t;
				match(_t,REPLICATIONDELETE);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1622_AST_in = (AST)_t;
			match(_t,OF);
			_t = _t.getNextSibling();
			t1 = _t==ASTNULL ? null : (AST)_t;
			tbl(_t,CQ.SYMBOL);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case EOF:
			case PERIOD:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				action.defineBufferForTrigger(t1);
			}
			break;
		}
		case REPLICATIONWRITE:
		case WRITE:
		{
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case WRITE:
			{
				AST tmp1623_AST_in = (AST)_t;
				match(_t,WRITE);
				_t = _t.getNextSibling();
				break;
			}
			case REPLICATIONWRITE:
			{
				AST tmp1624_AST_in = (AST)_t;
				match(_t,REPLICATIONWRITE);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1625_AST_in = (AST)_t;
			match(_t,OF);
			_t = _t.getNextSibling();
			rec = _t==ASTNULL ? null : (AST)_t;
			tbl(_t,CQ.SYMBOL);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case EOF:
			case PERIOD:
			case NEW:
			case OLD:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NEW:
			{
				AST tmp1626_AST_in = (AST)_t;
				match(_t,NEW);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case BUFFER:
				{
					AST tmp1627_AST_in = (AST)_t;
					match(_t,BUFFER);
					_t = _t.getNextSibling();
					break;
				}
				case ID:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				id4 = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case COLUMNLABEL:
				case LABEL:
				{
					label_constant(_t);
					_t = _retTree;
					break;
				}
				case EOF:
				case PERIOD:
				case OLD:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				if ( inputState.guessing==0 ) {
					action.defineBuffer(id4, id4, rec, true);
				}
				break;
			}
			case EOF:
			case PERIOD:
			case OLD:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			if ( inputState.guessing==0 ) {
				if (id4 == null) action.defineBufferForTrigger(rec);
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case OLD:
			{
				AST tmp1628_AST_in = (AST)_t;
				match(_t,OLD);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case BUFFER:
				{
					AST tmp1629_AST_in = (AST)_t;
					match(_t,BUFFER);
					_t = _t.getNextSibling();
					break;
				}
				case ID:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				id3 = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case COLUMNLABEL:
				case LABEL:
				{
					label_constant(_t);
					_t = _retTree;
					break;
				}
				case EOF:
				case PERIOD:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				if ( inputState.guessing==0 ) {
					action.defineBuffer(id3, id3, rec, true);
				}
				break;
			}
			case EOF:
			case PERIOD:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		case ASSIGN:
		{
			AST tmp1630_AST_in = (AST)_t;
			match(_t,ASSIGN);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case OF:
			{
				AST __t1242 = _t;
				AST tmp1631_AST_in = (AST)_t;
				match(_t,OF);
				_t = _t.getFirstChild();
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case TABLE:
				{
					AST __t1244 = _t;
					AST tmp1632_AST_in = (AST)_t;
					match(_t,TABLE);
					_t = _t.getFirstChild();
					AST tmp1633_AST_in = (AST)_t;
					match(_t,LABEL);
					_t = _t.getNextSibling();
					constant(_t);
					_t = _retTree;
					_t = __t1244;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1242;
				_t = _t.getNextSibling();
				break;
			}
			case NEW:
			{
				AST __t1245 = _t;
				AST tmp1634_AST_in = (AST)_t;
				match(_t,NEW);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case VALUE:
				{
					AST tmp1635_AST_in = (AST)_t;
					match(_t,VALUE);
					_t = _t.getNextSibling();
					break;
				}
				case ID:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				id = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
					push(action.defineVariable(id, id));
				}
				defineparam_var(_t);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
					action.addToSymbolScope(pop());
				}
				_t = __t1245;
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case OLD:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case OLD:
			{
				AST __t1248 = _t;
				AST tmp1636_AST_in = (AST)_t;
				match(_t,OLD);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case VALUE:
				{
					AST tmp1637_AST_in = (AST)_t;
					match(_t,VALUE);
					_t = _t.getNextSibling();
					break;
				}
				case ID:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				id2 = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
					push(action.defineVariable(id2, id2));
				}
				defineparam_var(_t);
				_t = _retTree;
				_t = __t1248;
				_t = _t.getNextSibling();
				if ( inputState.guessing==0 ) {
					action.addToSymbolScope(pop());
				}
				break;
			}
			case EOF:
			case PERIOD:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1229;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void underlinestate(AST _t) throws RecognitionException {
		
		AST underlinestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		AST fi = null;
		
		AST __t1251 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,UNDERLINE);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameInitializingStatement(head);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case WITH:
		case Form_item:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1256:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Form_item)) {
				AST __t1254 = _t;
				fi = _t==ASTNULL ? null :(AST)_t;
				match(_t,Form_item);
				_t = _t.getFirstChild();
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
				if ( inputState.guessing==0 ) {
					action.formItem(fi);
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Format_phrase:
				{
					formatphrase(_t);
					_t = _retTree;
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1254;
				_t = _t.getNextSibling();
			}
			else {
				break _loop1256;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_t = __t1251;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void upstate(AST _t) throws RecognitionException {
		
		AST upstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		
		AST __t1259 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,UP);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameInitializingStatement(head);
		}
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==STREAM||_t.getType()==STREAMHANDLE)) {
			stream_name_or_handle(_t);
			_t = _retTree;
		}
		else if ((_tokenSet_30.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else if ((_tokenSet_31.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_t = __t1259;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void updatestatement(AST _t) throws RecognitionException {
		
		AST updatestatement_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		boolean synPredMatched1267 = false;
		if (_t==null) _t=ASTNULL;
		if (((_t.getType()==UPDATE))) {
			AST __t1267 = _t;
			synPredMatched1267 = true;
			inputState.guessing++;
			try {
				{
				AST __t1266 = _t;
				AST tmp1638_AST_in = (AST)_t;
				match(_t,UPDATE);
				_t = _t.getFirstChild();
				tbl(_t,CQ.SYMBOL);
				_t = _retTree;
				AST tmp1639_AST_in = (AST)_t;
				match(_t,SET);
				_t = _t.getNextSibling();
				_t = __t1266;
				_t = _t.getNextSibling();
				}
			}
			catch (RecognitionException pe) {
				synPredMatched1267 = false;
			}
			_t = __t1267;
inputState.guessing--;
		}
		if ( synPredMatched1267 ) {
			sqlupdatestate(_t);
			_t = _retTree;
		}
		else if ((_t.getType()==UPDATE)) {
			updatestate(_t);
			_t = _retTree;
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		_retTree = _t;
	}
	
	public final void sqlupdatestate(AST _t) throws RecognitionException {
		
		AST sqlupdatestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1406 = _t;
		AST tmp1640_AST_in = (AST)_t;
		match(_t,UPDATE);
		_t = _t.getFirstChild();
		tbl(_t,CQ.SCHEMATABLESYMBOL);
		_t = _retTree;
		AST tmp1641_AST_in = (AST)_t;
		match(_t,SET);
		_t = _t.getNextSibling();
		sqlupdate_equal(_t);
		_t = _retTree;
		{
		_loop1408:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp1642_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				sqlupdate_equal(_t);
				_t = _retTree;
			}
			else {
				break _loop1408;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WHERE:
		{
			AST __t1410 = _t;
			AST tmp1643_AST_in = (AST)_t;
			match(_t,WHERE);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_32.member(_t.getType()))) {
				sqlexpression(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==CURRENT)) {
				AST tmp1644_AST_in = (AST)_t;
				match(_t,CURRENT);
				_t = _t.getNextSibling();
				AST tmp1645_AST_in = (AST)_t;
				match(_t,OF);
				_t = _t.getNextSibling();
				AST tmp1646_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t1410;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1406;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void updatestate(AST _t) throws RecognitionException {
		
		AST updatestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST head = null;
		
		AST __t1269 = _t;
		head = _t==ASTNULL ? null :(AST)_t;
		match(_t,UPDATE);
		_t = _t.getFirstChild();
		if ( inputState.guessing==0 ) {
			action.frameEnablingStatement(head);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case UNLESSHIDDEN:
		{
			AST tmp1647_AST_in = (AST)_t;
			match(_t,UNLESSHIDDEN);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case GOON:
		case IN_KW:
		case NOERROR_KW:
		case WITH:
		case Editing_phrase:
		case Form_item:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1272:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Form_item)) {
				form_item(_t,CQ.REFUP);
				_t = _retTree;
			}
			else {
				break _loop1272;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case GOON:
		{
			goonphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case EXCEPT:
		case IN_KW:
		case NOERROR_KW:
		case WITH:
		case Editing_phrase:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EXCEPT:
		{
			AST __t1275 = _t;
			AST tmp1648_AST_in = (AST)_t;
			match(_t,EXCEPT);
			_t = _t.getFirstChild();
			{
			_loop1277:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Field_ref)) {
					fld1(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					break _loop1277;
				}
				
			} while (true);
			}
			_t = __t1275;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case IN_KW:
		case NOERROR_KW:
		case WITH:
		case Editing_phrase:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t1279 = _t;
			AST tmp1649_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp1650_AST_in = (AST)_t;
			match(_t,WINDOW);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t1279;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case WITH:
		case Editing_phrase:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case Editing_phrase:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Editing_phrase:
		{
			editingphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1651_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1269;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void validatestate(AST _t) throws RecognitionException {
		
		AST validatestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1284 = _t;
		AST tmp1652_AST_in = (AST)_t;
		match(_t,VALIDATE);
		_t = _t.getFirstChild();
		tbl(_t,CQ.REF);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1653_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1284;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void viewstate(AST _t) throws RecognitionException {
		
		AST viewstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST v = null;
		
		AST __t1287 = _t;
		v = _t==ASTNULL ? null :(AST)_t;
		match(_t,VIEW);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case IN_KW:
		case Widget_ref:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1290:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Widget_ref)) {
				gwidget(_t);
				_t = _retTree;
			}
			else {
				break _loop1290;
			}
			
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t1292 = _t;
			AST tmp1654_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp1655_AST_in = (AST)_t;
			match(_t,WINDOW);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t1292;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.viewState(v);
		}
		_t = __t1287;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void altertablestate(AST _t) throws RecognitionException {
		
		AST altertablestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1294 = _t;
		AST tmp1656_AST_in = (AST)_t;
		match(_t,ALTER);
		_t = _t.getFirstChild();
		AST tmp1657_AST_in = (AST)_t;
		match(_t,TABLE);
		_t = _t.getNextSibling();
		tbl(_t,CQ.SCHEMATABLESYMBOL);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ADD:
		{
			AST tmp1658_AST_in = (AST)_t;
			match(_t,ADD);
			_t = _t.getNextSibling();
			AST tmp1659_AST_in = (AST)_t;
			match(_t,COLUMN);
			_t = _t.getNextSibling();
			sql_col_def(_t);
			_t = _retTree;
			break;
		}
		case DROP:
		{
			AST tmp1660_AST_in = (AST)_t;
			match(_t,DROP);
			_t = _t.getNextSibling();
			AST tmp1661_AST_in = (AST)_t;
			match(_t,COLUMN);
			_t = _t.getNextSibling();
			fld(_t,CQ.SYMBOL);
			_t = _retTree;
			break;
		}
		case ALTER:
		{
			AST tmp1662_AST_in = (AST)_t;
			match(_t,ALTER);
			_t = _t.getNextSibling();
			AST tmp1663_AST_in = (AST)_t;
			match(_t,COLUMN);
			_t = _t.getNextSibling();
			fld(_t,CQ.SYMBOL);
			_t = _retTree;
			{
			_loop1299:
			do {
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case FORMAT:
				{
					AST __t1297 = _t;
					AST tmp1664_AST_in = (AST)_t;
					match(_t,FORMAT);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1297;
					_t = _t.getNextSibling();
					break;
				}
				case COLUMNLABEL:
				case LABEL:
				{
					label_constant(_t);
					_t = _retTree;
					break;
				}
				case DEFAULT:
				{
					AST __t1298 = _t;
					AST tmp1665_AST_in = (AST)_t;
					match(_t,DEFAULT);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1298;
					_t = _t.getNextSibling();
					break;
				}
				case CASESENSITIVE:
				case Not_casesens:
				{
					casesens_or_not(_t);
					_t = _retTree;
					break;
				}
				default:
				{
					break _loop1299;
				}
				}
			} while (true);
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1294;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void sql_col_def(AST _t) throws RecognitionException {
		
		AST sql_col_def_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2528 = _t;
		AST tmp1666_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getFirstChild();
		AST tmp1667_AST_in = (AST)_t;
		if ( _t==null ) throw new MismatchedTokenException();
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PRECISION:
		{
			AST tmp1668_AST_in = (AST)_t;
			match(_t,PRECISION);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case CASESENSITIVE:
		case COLUMNLABEL:
		case DEFAULT:
		case FORMAT:
		case LABEL:
		case LEFTPAREN:
		case Not_casesens:
		case Not_null:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case LEFTPAREN:
		{
			AST tmp1669_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			AST tmp1670_AST_in = (AST)_t;
			match(_t,NUMBER);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COMMA:
			{
				AST tmp1671_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				AST tmp1672_AST_in = (AST)_t;
				match(_t,NUMBER);
				_t = _t.getNextSibling();
				break;
			}
			case RIGHTPAREN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1673_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case CASESENSITIVE:
		case COLUMNLABEL:
		case DEFAULT:
		case FORMAT:
		case LABEL:
		case Not_casesens:
		case Not_null:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Not_null:
		{
			AST __t2533 = _t;
			AST tmp1674_AST_in = (AST)_t;
			match(_t,Not_null);
			_t = _t.getFirstChild();
			AST tmp1675_AST_in = (AST)_t;
			match(_t,NOT);
			_t = _t.getNextSibling();
			AST tmp1676_AST_in = (AST)_t;
			match(_t,NULL_KW);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case UNIQUE:
			{
				AST tmp1677_AST_in = (AST)_t;
				match(_t,UNIQUE);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2533;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case CASESENSITIVE:
		case COLUMNLABEL:
		case DEFAULT:
		case FORMAT:
		case LABEL:
		case Not_casesens:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop2538:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLUMNLABEL:
			case LABEL:
			{
				label_constant(_t);
				_t = _retTree;
				break;
			}
			case DEFAULT:
			{
				AST __t2536 = _t;
				AST tmp1678_AST_in = (AST)_t;
				match(_t,DEFAULT);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2536;
				_t = _t.getNextSibling();
				break;
			}
			case FORMAT:
			{
				AST __t2537 = _t;
				AST tmp1679_AST_in = (AST)_t;
				match(_t,FORMAT);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2537;
				_t = _t.getNextSibling();
				break;
			}
			case CASESENSITIVE:
			case Not_casesens:
			{
				casesens_or_not(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				break _loop2538;
			}
			}
		} while (true);
		}
		_t = __t2528;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createindexstate(AST _t) throws RecognitionException {
		
		AST createindexstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1301 = _t;
		AST tmp1680_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case UNIQUE:
		{
			AST tmp1681_AST_in = (AST)_t;
			match(_t,UNIQUE);
			_t = _t.getNextSibling();
			break;
		}
		case INDEX:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp1682_AST_in = (AST)_t;
		match(_t,INDEX);
		_t = _t.getNextSibling();
		AST tmp1683_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		AST tmp1684_AST_in = (AST)_t;
		match(_t,ON);
		_t = _t.getNextSibling();
		tbl(_t,CQ.SCHEMATABLESYMBOL);
		_t = _retTree;
		AST __t1303 = _t;
		AST tmp1685_AST_in = (AST)_t;
		match(_t,Field_list);
		_t = _t.getFirstChild();
		AST tmp1686_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		fld(_t,CQ.SYMBOL);
		_t = _retTree;
		{
		_loop1305:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp1687_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				fld(_t,CQ.SYMBOL);
				_t = _retTree;
			}
			else {
				break _loop1305;
			}
			
		} while (true);
		}
		AST tmp1688_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t1303;
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t1301;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createviewstate(AST _t) throws RecognitionException {
		
		AST createviewstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1307 = _t;
		AST tmp1689_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1690_AST_in = (AST)_t;
		match(_t,VIEW);
		_t = _t.getNextSibling();
		AST tmp1691_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Field_list:
		{
			AST __t1309 = _t;
			AST tmp1692_AST_in = (AST)_t;
			match(_t,Field_list);
			_t = _t.getFirstChild();
			AST tmp1693_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			fld(_t,CQ.SYMBOL);
			_t = _retTree;
			{
			_loop1311:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA)) {
					AST tmp1694_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
					fld(_t,CQ.SYMBOL);
					_t = _retTree;
				}
				else {
					break _loop1311;
				}
				
			} while (true);
			}
			AST tmp1695_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t1309;
			_t = _t.getNextSibling();
			break;
		}
		case AS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp1696_AST_in = (AST)_t;
		match(_t,AS);
		_t = _t.getNextSibling();
		selectstatea(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1307;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void selectstatea(AST _t) throws RecognitionException {
		
		AST selectstatea_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1361 = _t;
		AST tmp1697_AST_in = (AST)_t;
		match(_t,SELECT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ALL:
		{
			AST tmp1698_AST_in = (AST)_t;
			match(_t,ALL);
			_t = _t.getNextSibling();
			break;
		}
		case DISTINCT:
		{
			AST tmp1699_AST_in = (AST)_t;
			match(_t,DISTINCT);
			_t = _t.getNextSibling();
			break;
		}
		case STAR:
		case Sql_select_what:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STAR:
		{
			AST tmp1700_AST_in = (AST)_t;
			match(_t,STAR);
			_t = _t.getNextSibling();
			break;
		}
		case Sql_select_what:
		{
			AST __t1364 = _t;
			AST tmp1701_AST_in = (AST)_t;
			match(_t,Sql_select_what);
			_t = _t.getFirstChild();
			{
			boolean synPredMatched1367 = false;
			if (_t==null) _t=ASTNULL;
			if (((_t.getType()==LEFTPAREN))) {
				AST __t1367 = _t;
				synPredMatched1367 = true;
				inputState.guessing++;
				try {
					{
					AST tmp1702_AST_in = (AST)_t;
					match(_t,LEFTPAREN);
					_t = _t.getNextSibling();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched1367 = false;
				}
				_t = __t1367;
inputState.guessing--;
			}
			if ( synPredMatched1367 ) {
				AST tmp1703_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				sqlexpression(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Format_phrase:
				{
					formatphrase(_t);
					_t = _retTree;
					break;
				}
				case RIGHTPAREN:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				AST tmp1704_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Format_phrase:
				{
					formatphrase(_t);
					_t = _retTree;
					break;
				}
				case 3:
				case COMMA:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
			}
			else if ((_tokenSet_32.member(_t.getType()))) {
				sqlexpression(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case Format_phrase:
				{
					formatphrase(_t);
					_t = _retTree;
					break;
				}
				case 3:
				case COMMA:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			{
			_loop1373:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA)) {
					AST tmp1705_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
					sqlexpression(_t);
					_t = _retTree;
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case Format_phrase:
					{
						formatphrase(_t);
						_t = _retTree;
						break;
					}
					case 3:
					case COMMA:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
				}
				else {
					break _loop1373;
				}
				
			} while (true);
			}
			_t = __t1364;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case INTO:
		{
			AST __t1375 = _t;
			AST tmp1706_AST_in = (AST)_t;
			match(_t,INTO);
			_t = _t.getFirstChild();
			fld(_t,CQ.UPDATING);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case INDICATOR:
			case Field_ref:
			{
				fetch_indicator(_t);
				_t = _retTree;
				break;
			}
			case 3:
			case COMMA:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			_loop1379:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA)) {
					AST tmp1707_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
					fld(_t,CQ.UPDATING);
					_t = _retTree;
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case INDICATOR:
					case Field_ref:
					{
						fetch_indicator(_t);
						_t = _retTree;
						break;
					}
					case 3:
					case COMMA:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
				}
				else {
					break _loop1379;
				}
				
			} while (true);
			}
			_t = __t1375;
			_t = _t.getNextSibling();
			break;
		}
		case FROM:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST __t1380 = _t;
		AST tmp1708_AST_in = (AST)_t;
		match(_t,FROM);
		_t = _t.getFirstChild();
		select_from_spec(_t);
		_t = _retTree;
		{
		_loop1382:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp1709_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				select_from_spec(_t);
				_t = _retTree;
			}
			else {
				break _loop1382;
			}
			
		} while (true);
		}
		_t = __t1380;
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case GROUP:
		{
			AST __t1384 = _t;
			AST tmp1710_AST_in = (AST)_t;
			match(_t,GROUP);
			_t = _t.getFirstChild();
			AST tmp1711_AST_in = (AST)_t;
			match(_t,BY);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			{
			_loop1386:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA)) {
					AST tmp1712_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
					expression(_t);
					_t = _retTree;
				}
				else {
					break _loop1386;
				}
				
			} while (true);
			}
			_t = __t1384;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case BY:
		case HAVING:
		case ORDER:
		case UNION:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case HAVING:
		{
			AST __t1388 = _t;
			AST tmp1713_AST_in = (AST)_t;
			match(_t,HAVING);
			_t = _t.getFirstChild();
			sqlexpression(_t);
			_t = _retTree;
			_t = __t1388;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case BY:
		case ORDER:
		case UNION:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ORDER:
		{
			AST __t1390 = _t;
			AST tmp1714_AST_in = (AST)_t;
			match(_t,ORDER);
			_t = _t.getFirstChild();
			AST tmp1715_AST_in = (AST)_t;
			match(_t,BY);
			_t = _t.getNextSibling();
			select_order_expr(_t);
			_t = _retTree;
			_t = __t1390;
			_t = _t.getNextSibling();
			break;
		}
		case BY:
		{
			AST __t1391 = _t;
			AST tmp1716_AST_in = (AST)_t;
			match(_t,BY);
			_t = _t.getFirstChild();
			select_order_expr(_t);
			_t = _retTree;
			_t = __t1391;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case UNION:
		case WITH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		if (((_t.getType()==3||_t.getType()==UNION||_t.getType()==WITH))&&(_t != null)) {
			{
			boolean synPredMatched1396 = false;
			if (_t==null) _t=ASTNULL;
			if ((((_t.getType()==WITH))&&(_t != null))) {
				AST __t1396 = _t;
				synPredMatched1396 = true;
				inputState.guessing++;
				try {
					{
					AST __t1395 = _t;
					AST tmp1717_AST_in = (AST)_t;
					match(_t,WITH);
					_t = _t.getFirstChild();
					AST tmp1718_AST_in = (AST)_t;
					match(_t,CHECK);
					_t = _t.getNextSibling();
					AST tmp1719_AST_in = (AST)_t;
					match(_t,OPTION);
					_t = _t.getNextSibling();
					_t = __t1395;
					_t = _t.getNextSibling();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched1396 = false;
				}
				_t = __t1396;
inputState.guessing--;
			}
			if ( synPredMatched1396 ) {
				AST __t1397 = _t;
				AST tmp1720_AST_in = (AST)_t;
				match(_t,WITH);
				_t = _t.getFirstChild();
				AST tmp1721_AST_in = (AST)_t;
				match(_t,CHECK);
				_t = _t.getNextSibling();
				AST tmp1722_AST_in = (AST)_t;
				match(_t,OPTION);
				_t = _t.getNextSibling();
				_t = __t1397;
				_t = _t.getNextSibling();
			}
			else if ((_t.getType()==3||_t.getType()==UNION||_t.getType()==WITH)) {
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
		}
		else if ((_t.getType()==3||_t.getType()==UNION||_t.getType()==WITH)) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			framephrase(_t);
			_t = _retTree;
			break;
		}
		case 3:
		case UNION:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case UNION:
		{
			AST __t1400 = _t;
			AST tmp1723_AST_in = (AST)_t;
			match(_t,UNION);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ALL:
			{
				AST tmp1724_AST_in = (AST)_t;
				match(_t,ALL);
				_t = _t.getNextSibling();
				break;
			}
			case SELECT:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			selectstatea(_t);
			_t = _retTree;
			_t = __t1400;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1361;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void deletefromstate(AST _t) throws RecognitionException {
		
		AST deletefromstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1313 = _t;
		AST tmp1725_AST_in = (AST)_t;
		match(_t,DELETE_KW);
		_t = _t.getFirstChild();
		AST tmp1726_AST_in = (AST)_t;
		match(_t,FROM);
		_t = _t.getNextSibling();
		tbl(_t,CQ.SCHEMATABLESYMBOL);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WHERE:
		{
			AST __t1315 = _t;
			AST tmp1727_AST_in = (AST)_t;
			match(_t,WHERE);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case CURRENT:
			{
				AST __t1317 = _t;
				AST tmp1728_AST_in = (AST)_t;
				match(_t,CURRENT);
				_t = _t.getFirstChild();
				AST tmp1729_AST_in = (AST)_t;
				match(_t,OF);
				_t = _t.getNextSibling();
				AST tmp1730_AST_in = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				_t = __t1317;
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_32.member(_t.getType()))) {
					sqlexpression(_t);
					_t = _retTree;
				}
			else {
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1315;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1313;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void sqlexpression(AST _t) throws RecognitionException {
		
		AST sqlexpression_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case OR:
		{
			AST __t2540 = _t;
			AST tmp1731_AST_in = (AST)_t;
			match(_t,OR);
			_t = _t.getFirstChild();
			sqlexpression(_t);
			_t = _retTree;
			sqlexpression(_t);
			_t = _retTree;
			_t = __t2540;
			_t = _t.getNextSibling();
			break;
		}
		case AND:
		{
			AST __t2541 = _t;
			AST tmp1732_AST_in = (AST)_t;
			match(_t,AND);
			_t = _t.getFirstChild();
			sqlexpression(_t);
			_t = _retTree;
			sqlexpression(_t);
			_t = _retTree;
			_t = __t2541;
			_t = _t.getNextSibling();
			break;
		}
		case NOT:
		{
			AST __t2542 = _t;
			AST tmp1733_AST_in = (AST)_t;
			match(_t,NOT);
			_t = _t.getFirstChild();
			sqlexpression(_t);
			_t = _retTree;
			_t = __t2542;
			_t = _t.getNextSibling();
			break;
		}
		case MATCHES:
		{
			AST __t2543 = _t;
			AST tmp1734_AST_in = (AST)_t;
			match(_t,MATCHES);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_33.member(_t.getType()))) {
				sqlscalar(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==Sql_comp_query)) {
				sql_comp_query(_t);
				_t = _retTree;
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t2543;
			_t = _t.getNextSibling();
			break;
		}
		case BEGINS:
		{
			AST __t2545 = _t;
			AST tmp1735_AST_in = (AST)_t;
			match(_t,BEGINS);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_33.member(_t.getType()))) {
				sqlscalar(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==Sql_comp_query)) {
				sql_comp_query(_t);
				_t = _retTree;
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t2545;
			_t = _t.getNextSibling();
			break;
		}
		case CONTAINS:
		{
			AST __t2547 = _t;
			AST tmp1736_AST_in = (AST)_t;
			match(_t,CONTAINS);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_33.member(_t.getType()))) {
				sqlscalar(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==Sql_comp_query)) {
				sql_comp_query(_t);
				_t = _retTree;
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t2547;
			_t = _t.getNextSibling();
			break;
		}
		case EQ:
		{
			AST __t2549 = _t;
			AST tmp1737_AST_in = (AST)_t;
			match(_t,EQ);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_33.member(_t.getType()))) {
				sqlscalar(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==Sql_comp_query)) {
				sql_comp_query(_t);
				_t = _retTree;
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t2549;
			_t = _t.getNextSibling();
			break;
		}
		case NE:
		{
			AST __t2551 = _t;
			AST tmp1738_AST_in = (AST)_t;
			match(_t,NE);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_33.member(_t.getType()))) {
				sqlscalar(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==Sql_comp_query)) {
				sql_comp_query(_t);
				_t = _retTree;
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t2551;
			_t = _t.getNextSibling();
			break;
		}
		case GTHAN:
		{
			AST __t2553 = _t;
			AST tmp1739_AST_in = (AST)_t;
			match(_t,GTHAN);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_33.member(_t.getType()))) {
				sqlscalar(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==Sql_comp_query)) {
				sql_comp_query(_t);
				_t = _retTree;
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t2553;
			_t = _t.getNextSibling();
			break;
		}
		case GE:
		{
			AST __t2555 = _t;
			AST tmp1740_AST_in = (AST)_t;
			match(_t,GE);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_33.member(_t.getType()))) {
				sqlscalar(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==Sql_comp_query)) {
				sql_comp_query(_t);
				_t = _retTree;
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t2555;
			_t = _t.getNextSibling();
			break;
		}
		case LTHAN:
		{
			AST __t2557 = _t;
			AST tmp1741_AST_in = (AST)_t;
			match(_t,LTHAN);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_33.member(_t.getType()))) {
				sqlscalar(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==Sql_comp_query)) {
				sql_comp_query(_t);
				_t = _retTree;
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t2557;
			_t = _t.getNextSibling();
			break;
		}
		case LE:
		{
			AST __t2559 = _t;
			AST tmp1742_AST_in = (AST)_t;
			match(_t,LE);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_33.member(_t.getType()))) {
				sqlscalar(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==Sql_comp_query)) {
				sql_comp_query(_t);
				_t = _retTree;
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t2559;
			_t = _t.getNextSibling();
			break;
		}
		case EXISTS:
		{
			AST __t2561 = _t;
			AST tmp1743_AST_in = (AST)_t;
			match(_t,EXISTS);
			_t = _t.getFirstChild();
			AST tmp1744_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			selectstatea(_t);
			_t = _retTree;
			AST tmp1745_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t2561;
			_t = _t.getNextSibling();
			break;
		}
		case Sql_begins:
		{
			AST __t2562 = _t;
			AST tmp1746_AST_in = (AST)_t;
			match(_t,Sql_begins);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOT:
			{
				AST tmp1747_AST_in = (AST)_t;
				match(_t,NOT);
				_t = _t.getNextSibling();
				break;
			}
			case BEGINS:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1748_AST_in = (AST)_t;
			match(_t,BEGINS);
			_t = _t.getNextSibling();
			sqlscalar(_t);
			_t = _retTree;
			_t = __t2562;
			_t = _t.getNextSibling();
			break;
		}
		case Sql_between:
		{
			AST __t2564 = _t;
			AST tmp1749_AST_in = (AST)_t;
			match(_t,Sql_between);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOT:
			{
				AST tmp1750_AST_in = (AST)_t;
				match(_t,NOT);
				_t = _t.getNextSibling();
				break;
			}
			case BETWEEN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1751_AST_in = (AST)_t;
			match(_t,BETWEEN);
			_t = _t.getNextSibling();
			sqlscalar(_t);
			_t = _retTree;
			AST tmp1752_AST_in = (AST)_t;
			match(_t,AND);
			_t = _t.getNextSibling();
			sqlscalar(_t);
			_t = _retTree;
			_t = __t2564;
			_t = _t.getNextSibling();
			break;
		}
		case Sql_in:
		{
			AST __t2566 = _t;
			AST tmp1753_AST_in = (AST)_t;
			match(_t,Sql_in);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOT:
			{
				AST tmp1754_AST_in = (AST)_t;
				match(_t,NOT);
				_t = _t.getNextSibling();
				break;
			}
			case IN_KW:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1755_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getNextSibling();
			AST tmp1756_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SELECT:
			{
				selectstatea(_t);
				_t = _retTree;
				break;
			}
			case LEXDATE:
			case NUMBER:
			case QSTRING:
			case BIGENDIAN:
			case EXCLUSIVELOCK:
			case FALSE_KW:
			case FINDCASESENSITIVE:
			case FINDGLOBAL:
			case FINDNEXTOCCURRENCE:
			case FINDPREVOCCURRENCE:
			case FINDSELECT:
			case FINDWRAPAROUND:
			case HOSTBYTEORDER:
			case LITTLEENDIAN:
			case NO:
			case NOLOCK:
			case NOWAIT:
			case NULL_KW:
			case READAVAILABLE:
			case READEXACTNUM:
			case SEARCHSELF:
			case SEARCHTARGET:
			case SHARELOCK:
			case TRUE_KW:
			case USERID:
			case WINDOWDELAYEDMINIMIZE:
			case WINDOWMAXIMIZED:
			case WINDOWMINIMIZED:
			case WINDOWNORMAL:
			case YES:
			case UNKNOWNVALUE:
			case Field_ref:
			case FUNCTIONCALLTYPE:
			case GETATTRCALLTYPE:
			case PROCEDURECALLTYPE:
			case SAXCOMPLETE:
			case SAXPARSERERROR:
			case SAXRUNNING:
			case SAXUNINITIALIZED:
			case SETATTRCALLTYPE:
			case ROWUNMODIFIED:
			case ROWDELETED:
			case ROWMODIFIED:
			case ROWCREATED:
			{
				sql_in_val(_t);
				_t = _retTree;
				{
				_loop2570:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COMMA)) {
						AST tmp1757_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						sql_in_val(_t);
						_t = _retTree;
					}
					else {
						break _loop2570;
					}
					
				} while (true);
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1758_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t2566;
			_t = _t.getNextSibling();
			break;
		}
		case Sql_like:
		{
			AST __t2571 = _t;
			AST tmp1759_AST_in = (AST)_t;
			match(_t,Sql_like);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOT:
			{
				AST tmp1760_AST_in = (AST)_t;
				match(_t,NOT);
				_t = _t.getNextSibling();
				break;
			}
			case LIKE:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1761_AST_in = (AST)_t;
			match(_t,LIKE);
			_t = _t.getNextSibling();
			sqlscalar(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ESCAPE:
			{
				AST tmp1762_AST_in = (AST)_t;
				match(_t,ESCAPE);
				_t = _t.getNextSibling();
				sqlscalar(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2571;
			_t = _t.getNextSibling();
			break;
		}
		case Sql_null_test:
		{
			AST __t2574 = _t;
			AST tmp1763_AST_in = (AST)_t;
			match(_t,Sql_null_test);
			_t = _t.getFirstChild();
			AST tmp1764_AST_in = (AST)_t;
			match(_t,IS);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOT:
			{
				AST tmp1765_AST_in = (AST)_t;
				match(_t,NOT);
				_t = _t.getNextSibling();
				break;
			}
			case NULL_KW:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			AST tmp1766_AST_in = (AST)_t;
			match(_t,NULL_KW);
			_t = _t.getNextSibling();
			_t = __t2574;
			_t = _t.getNextSibling();
			break;
		}
		default:
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_33.member(_t.getType()))) {
				sqlscalar(_t);
				_t = _retTree;
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void droptablestate(AST _t) throws RecognitionException {
		
		AST droptablestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1319 = _t;
		AST tmp1767_AST_in = (AST)_t;
		match(_t,DROP);
		_t = _t.getFirstChild();
		AST tmp1768_AST_in = (AST)_t;
		match(_t,TABLE);
		_t = _t.getNextSibling();
		tbl(_t,CQ.SCHEMATABLESYMBOL);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1319;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void fetchstate(AST _t) throws RecognitionException {
		
		AST fetchstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1321 = _t;
		AST tmp1769_AST_in = (AST)_t;
		match(_t,FETCH);
		_t = _t.getFirstChild();
		AST tmp1770_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		AST tmp1771_AST_in = (AST)_t;
		match(_t,INTO);
		_t = _t.getNextSibling();
		fld(_t,CQ.UPDATING);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case INDICATOR:
		case Field_ref:
		{
			fetch_indicator(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case COMMA:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1325:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp1772_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				fld(_t,CQ.UPDATING);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case INDICATOR:
				case Field_ref:
				{
					fetch_indicator(_t);
					_t = _retTree;
					break;
				}
				case EOF:
				case PERIOD:
				case COMMA:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
			}
			else {
				break _loop1325;
			}
			
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1321;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void fetch_indicator(AST _t) throws RecognitionException {
		
		AST fetch_indicator_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case INDICATOR:
		{
			AST __t1327 = _t;
			AST tmp1773_AST_in = (AST)_t;
			match(_t,INDICATOR);
			_t = _t.getFirstChild();
			fld(_t,CQ.UPDATING);
			_t = _retTree;
			_t = __t1327;
			_t = _t.getNextSibling();
			break;
		}
		case Field_ref:
		{
			fld(_t,CQ.UPDATING);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void grantstate(AST _t) throws RecognitionException {
		
		AST grantstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1329 = _t;
		AST tmp1774_AST_in = (AST)_t;
		match(_t,GRANT);
		_t = _t.getFirstChild();
		{
		grant_rev_opt(_t);
		_t = _retTree;
		}
		AST tmp1775_AST_in = (AST)_t;
		match(_t,ON);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RECORD_NAME:
		{
			tbl(_t,CQ.SCHEMATABLESYMBOL);
			_t = _retTree;
			break;
		}
		case ID:
		{
			AST tmp1776_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		grant_rev_to(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WITH:
		{
			AST tmp1777_AST_in = (AST)_t;
			match(_t,WITH);
			_t = _t.getNextSibling();
			AST tmp1778_AST_in = (AST)_t;
			match(_t,GRANT);
			_t = _t.getNextSibling();
			AST tmp1779_AST_in = (AST)_t;
			match(_t,OPTION);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1329;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void grant_rev_opt(AST _t) throws RecognitionException {
		
		AST grant_rev_opt_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ALL:
		{
			AST __t1334 = _t;
			AST tmp1780_AST_in = (AST)_t;
			match(_t,ALL);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PRIVILEGES:
			{
				AST tmp1781_AST_in = (AST)_t;
				match(_t,PRIVILEGES);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1334;
			_t = _t.getNextSibling();
			break;
		}
		case DELETE_KW:
		case INSERT:
		case SELECT:
		case UPDATE:
		case COMMA:
		{
			{
			int _cnt1342=0;
			_loop1342:
			do {
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case SELECT:
				{
					AST tmp1782_AST_in = (AST)_t;
					match(_t,SELECT);
					_t = _t.getNextSibling();
					break;
				}
				case INSERT:
				{
					AST tmp1783_AST_in = (AST)_t;
					match(_t,INSERT);
					_t = _t.getNextSibling();
					break;
				}
				case DELETE_KW:
				{
					AST tmp1784_AST_in = (AST)_t;
					match(_t,DELETE_KW);
					_t = _t.getNextSibling();
					break;
				}
				case UPDATE:
				{
					AST __t1337 = _t;
					AST tmp1785_AST_in = (AST)_t;
					match(_t,UPDATE);
					_t = _t.getFirstChild();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case Field_list:
					{
						AST __t1339 = _t;
						AST tmp1786_AST_in = (AST)_t;
						match(_t,Field_list);
						_t = _t.getFirstChild();
						AST tmp1787_AST_in = (AST)_t;
						match(_t,LEFTPAREN);
						_t = _t.getNextSibling();
						fld(_t,CQ.UPDATING);
						_t = _retTree;
						{
						_loop1341:
						do {
							if (_t==null) _t=ASTNULL;
							if ((_t.getType()==COMMA)) {
								AST tmp1788_AST_in = (AST)_t;
								match(_t,COMMA);
								_t = _t.getNextSibling();
								fld(_t,CQ.UPDATING);
								_t = _retTree;
							}
							else {
								break _loop1341;
							}
							
						} while (true);
						}
						AST tmp1789_AST_in = (AST)_t;
						match(_t,RIGHTPAREN);
						_t = _t.getNextSibling();
						_t = __t1339;
						_t = _t.getNextSibling();
						break;
					}
					case 3:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					_t = __t1337;
					_t = _t.getNextSibling();
					break;
				}
				case COMMA:
				{
					AST tmp1790_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					if ( _cnt1342>=1 ) { break _loop1342; } else {throw new NoViableAltException(_t);}
				}
				}
				_cnt1342++;
			} while (true);
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void grant_rev_to(AST _t) throws RecognitionException {
		
		AST grant_rev_to_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TO:
		{
			AST __t2500 = _t;
			AST tmp1791_AST_in = (AST)_t;
			match(_t,TO);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PUBLIC:
			{
				AST tmp1792_AST_in = (AST)_t;
				match(_t,PUBLIC);
				_t = _t.getNextSibling();
				break;
			}
			case FILENAME:
			{
				AST tmp1793_AST_in = (AST)_t;
				match(_t,FILENAME);
				_t = _t.getNextSibling();
				{
				_loop2503:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COMMA)) {
						AST tmp1794_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						AST tmp1795_AST_in = (AST)_t;
						match(_t,FILENAME);
						_t = _t.getNextSibling();
					}
					else {
						break _loop2503;
					}
					
				} while (true);
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2500;
			_t = _t.getNextSibling();
			break;
		}
		case FROM:
		{
			AST __t2504 = _t;
			AST tmp1796_AST_in = (AST)_t;
			match(_t,FROM);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PUBLIC:
			{
				AST tmp1797_AST_in = (AST)_t;
				match(_t,PUBLIC);
				_t = _t.getNextSibling();
				break;
			}
			case FILENAME:
			{
				AST tmp1798_AST_in = (AST)_t;
				match(_t,FILENAME);
				_t = _t.getNextSibling();
				{
				_loop2507:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COMMA)) {
						AST tmp1799_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						AST tmp1800_AST_in = (AST)_t;
						match(_t,FILENAME);
						_t = _t.getNextSibling();
					}
					else {
						break _loop2507;
					}
					
				} while (true);
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2504;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void insertintostate(AST _t) throws RecognitionException {
		
		AST insertintostate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1344 = _t;
		AST tmp1801_AST_in = (AST)_t;
		match(_t,INSERT);
		_t = _t.getFirstChild();
		AST tmp1802_AST_in = (AST)_t;
		match(_t,INTO);
		_t = _t.getNextSibling();
		tbl(_t,CQ.SCHEMATABLESYMBOL);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Field_list:
		{
			AST __t1346 = _t;
			AST tmp1803_AST_in = (AST)_t;
			match(_t,Field_list);
			_t = _t.getFirstChild();
			AST tmp1804_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			fld(_t,CQ.UPDATING);
			_t = _retTree;
			{
			_loop1348:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA)) {
					AST tmp1805_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
					fld(_t,CQ.UPDATING);
					_t = _retTree;
				}
				else {
					break _loop1348;
				}
				
			} while (true);
			}
			AST tmp1806_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t1346;
			_t = _t.getNextSibling();
			break;
		}
		case SELECT:
		case VALUES:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case VALUES:
		{
			AST __t1350 = _t;
			AST tmp1807_AST_in = (AST)_t;
			match(_t,VALUES);
			_t = _t.getFirstChild();
			AST tmp1808_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			sqlexpression(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case INDICATOR:
			case Field_ref:
			{
				fetch_indicator(_t);
				_t = _retTree;
				break;
			}
			case COMMA:
			case RIGHTPAREN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			_loop1354:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA)) {
					AST tmp1809_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
					sqlexpression(_t);
					_t = _retTree;
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case INDICATOR:
					case Field_ref:
					{
						fetch_indicator(_t);
						_t = _retTree;
						break;
					}
					case COMMA:
					case RIGHTPAREN:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
				}
				else {
					break _loop1354;
				}
				
			} while (true);
			}
			AST tmp1810_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t1350;
			_t = _t.getNextSibling();
			break;
		}
		case SELECT:
		{
			selectstatea(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1344;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void revokestate(AST _t) throws RecognitionException {
		
		AST revokestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1356 = _t;
		AST tmp1811_AST_in = (AST)_t;
		match(_t,REVOKE);
		_t = _t.getFirstChild();
		{
		grant_rev_opt(_t);
		_t = _retTree;
		}
		AST tmp1812_AST_in = (AST)_t;
		match(_t,ON);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RECORD_NAME:
		{
			tbl(_t,CQ.SCHEMATABLESYMBOL);
			_t = _retTree;
			break;
		}
		case ID:
		{
			AST tmp1813_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		grant_rev_to(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1356;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void selectstate(AST _t) throws RecognitionException {
		
		AST selectstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if ( inputState.guessing==0 ) {
			action.frameInitializingStatement(selectstate_AST_in);
		}
		selectstatea(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		if ( inputState.guessing==0 ) {
			action.frameStatementEnd();
		}
		_retTree = _t;
	}
	
	public final void select_from_spec(AST _t) throws RecognitionException {
		
		AST select_from_spec_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		select_sqltableref(_t);
		_t = _retTree;
		{
		_loop2519:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFT:
			{
				AST __t2512 = _t;
				AST tmp1814_AST_in = (AST)_t;
				match(_t,LEFT);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case OUTER:
				{
					AST tmp1815_AST_in = (AST)_t;
					match(_t,OUTER);
					_t = _t.getNextSibling();
					break;
				}
				case JOIN:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				AST tmp1816_AST_in = (AST)_t;
				match(_t,JOIN);
				_t = _t.getNextSibling();
				select_sqltableref(_t);
				_t = _retTree;
				AST tmp1817_AST_in = (AST)_t;
				match(_t,ON);
				_t = _t.getNextSibling();
				sqlexpression(_t);
				_t = _retTree;
				_t = __t2512;
				_t = _t.getNextSibling();
				break;
			}
			case RIGHT:
			{
				AST __t2514 = _t;
				AST tmp1818_AST_in = (AST)_t;
				match(_t,RIGHT);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case OUTER:
				{
					AST tmp1819_AST_in = (AST)_t;
					match(_t,OUTER);
					_t = _t.getNextSibling();
					break;
				}
				case JOIN:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				AST tmp1820_AST_in = (AST)_t;
				match(_t,JOIN);
				_t = _t.getNextSibling();
				select_sqltableref(_t);
				_t = _retTree;
				AST tmp1821_AST_in = (AST)_t;
				match(_t,ON);
				_t = _t.getNextSibling();
				sqlexpression(_t);
				_t = _retTree;
				_t = __t2514;
				_t = _t.getNextSibling();
				break;
			}
			case INNER:
			{
				AST __t2516 = _t;
				AST tmp1822_AST_in = (AST)_t;
				match(_t,INNER);
				_t = _t.getFirstChild();
				AST tmp1823_AST_in = (AST)_t;
				match(_t,JOIN);
				_t = _t.getNextSibling();
				select_sqltableref(_t);
				_t = _retTree;
				AST tmp1824_AST_in = (AST)_t;
				match(_t,ON);
				_t = _t.getNextSibling();
				sqlexpression(_t);
				_t = _retTree;
				_t = __t2516;
				_t = _t.getNextSibling();
				break;
			}
			case OUTER:
			{
				AST __t2517 = _t;
				AST tmp1825_AST_in = (AST)_t;
				match(_t,OUTER);
				_t = _t.getFirstChild();
				AST tmp1826_AST_in = (AST)_t;
				match(_t,JOIN);
				_t = _t.getNextSibling();
				select_sqltableref(_t);
				_t = _retTree;
				AST tmp1827_AST_in = (AST)_t;
				match(_t,ON);
				_t = _t.getNextSibling();
				sqlexpression(_t);
				_t = _retTree;
				_t = __t2517;
				_t = _t.getNextSibling();
				break;
			}
			case JOIN:
			{
				AST __t2518 = _t;
				AST tmp1828_AST_in = (AST)_t;
				match(_t,JOIN);
				_t = _t.getFirstChild();
				select_sqltableref(_t);
				_t = _retTree;
				AST tmp1829_AST_in = (AST)_t;
				match(_t,ON);
				_t = _t.getNextSibling();
				sqlexpression(_t);
				_t = _retTree;
				_t = __t2518;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop2519;
			}
			}
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WHERE:
		{
			AST __t2521 = _t;
			AST tmp1830_AST_in = (AST)_t;
			match(_t,WHERE);
			_t = _t.getFirstChild();
			sqlexpression(_t);
			_t = _retTree;
			_t = __t2521;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case COMMA:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_retTree = _t;
	}
	
	public final void select_order_expr(AST _t) throws RecognitionException {
		
		AST select_order_expr_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		sqlscalar(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ASC:
		{
			AST tmp1831_AST_in = (AST)_t;
			match(_t,ASC);
			_t = _t.getNextSibling();
			break;
		}
		case DESCENDING:
		{
			AST tmp1832_AST_in = (AST)_t;
			match(_t,DESCENDING);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case COMMA:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop2526:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp1833_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				sqlscalar(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case ASC:
				{
					AST tmp1834_AST_in = (AST)_t;
					match(_t,ASC);
					_t = _t.getNextSibling();
					break;
				}
				case DESCENDING:
				{
					AST tmp1835_AST_in = (AST)_t;
					match(_t,DESCENDING);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				case COMMA:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
			}
			else {
				break _loop2526;
			}
			
		} while (true);
		}
		_retTree = _t;
	}
	
	public final void select_sqltableref(AST _t) throws RecognitionException {
		
		AST select_sqltableref_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RECORD_NAME:
		{
			tbl(_t,CQ.SCHEMATABLESYMBOL);
			_t = _retTree;
			break;
		}
		case ID:
		{
			AST tmp1836_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ID:
		{
			AST tmp1837_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case INNER:
		case JOIN:
		case LEFT:
		case ON:
		case OUTER:
		case RIGHT:
		case WHERE:
		case COMMA:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_retTree = _t;
	}
	
	public final void sqlupdate_equal(AST _t) throws RecognitionException {
		
		AST sqlupdate_equal_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1413 = _t;
		AST tmp1838_AST_in = (AST)_t;
		match(_t,EQUAL);
		_t = _t.getFirstChild();
		fld(_t,CQ.REF);
		_t = _retTree;
		sqlexpression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case INDICATOR:
		case Field_ref:
		{
			fetch_indicator(_t);
			_t = _retTree;
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1413;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void sqlaggregatefunc_arg(AST _t) throws RecognitionException {
		
		AST sqlaggregatefunc_arg_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST tmp1839_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case DISTINCT:
		{
			AST tmp1840_AST_in = (AST)_t;
			match(_t,DISTINCT);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEFTPAREN:
			{
				AST tmp1841_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				fld(_t,CQ.REF);
				_t = _retTree;
				AST tmp1842_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				break;
			}
			case Field_ref:
			{
				fld(_t,CQ.REF);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		case STAR:
		{
			AST tmp1843_AST_in = (AST)_t;
			match(_t,STAR);
			_t = _t.getNextSibling();
			break;
		}
		default:
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_34.member(_t.getType()))) {
				{
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==ALL)) {
					AST tmp1844_AST_in = (AST)_t;
					match(_t,ALL);
					_t = _t.getNextSibling();
				}
				else if ((_tokenSet_33.member(_t.getType()))) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				sqlscalar(_t);
				_t = _retTree;
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp1845_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void sqlscalar(AST _t) throws RecognitionException {
		
		AST sqlscalar_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PLUS:
		{
			AST __t2580 = _t;
			AST tmp1846_AST_in = (AST)_t;
			match(_t,PLUS);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			sqlscalar(_t);
			_t = _retTree;
			_t = __t2580;
			_t = _t.getNextSibling();
			break;
		}
		case MINUS:
		{
			AST __t2581 = _t;
			AST tmp1847_AST_in = (AST)_t;
			match(_t,MINUS);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			sqlscalar(_t);
			_t = _retTree;
			_t = __t2581;
			_t = _t.getNextSibling();
			break;
		}
		case MULTIPLY:
		{
			AST __t2582 = _t;
			AST tmp1848_AST_in = (AST)_t;
			match(_t,MULTIPLY);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			sqlscalar(_t);
			_t = _retTree;
			_t = __t2582;
			_t = _t.getNextSibling();
			break;
		}
		case DIVIDE:
		{
			AST __t2583 = _t;
			AST tmp1849_AST_in = (AST)_t;
			match(_t,DIVIDE);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			sqlscalar(_t);
			_t = _retTree;
			_t = __t2583;
			_t = _t.getNextSibling();
			break;
		}
		case MODULO:
		{
			AST __t2584 = _t;
			AST tmp1850_AST_in = (AST)_t;
			match(_t,MODULO);
			_t = _t.getFirstChild();
			sqlscalar(_t);
			_t = _retTree;
			sqlscalar(_t);
			_t = _retTree;
			_t = __t2584;
			_t = _t.getNextSibling();
			break;
		}
		case UNARY_PLUS:
		{
			AST __t2585 = _t;
			AST tmp1851_AST_in = (AST)_t;
			match(_t,UNARY_PLUS);
			_t = _t.getFirstChild();
			exprt(_t);
			_t = _retTree;
			_t = __t2585;
			_t = _t.getNextSibling();
			break;
		}
		case UNARY_MINUS:
		{
			AST __t2586 = _t;
			AST tmp1852_AST_in = (AST)_t;
			match(_t,UNARY_MINUS);
			_t = _t.getFirstChild();
			exprt(_t);
			_t = _retTree;
			_t = __t2586;
			_t = _t.getNextSibling();
			break;
		}
		default:
			boolean synPredMatched2588 = false;
			if (_t==null) _t=ASTNULL;
			if (((_t.getType()==LEFTPAREN))) {
				AST __t2588 = _t;
				synPredMatched2588 = true;
				inputState.guessing++;
				try {
					{
					AST tmp1853_AST_in = (AST)_t;
					match(_t,LEFTPAREN);
					_t = _t.getNextSibling();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched2588 = false;
				}
				_t = __t2588;
inputState.guessing--;
			}
			if ( synPredMatched2588 ) {
				AST __t2589 = _t;
				AST tmp1854_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getFirstChild();
				sqlexpression(_t);
				_t = _retTree;
				AST tmp1855_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				_t = __t2589;
				_t = _t.getNextSibling();
			}
			else if ((_tokenSet_1.member(_t.getType()))) {
				exprt(_t);
				_t = _retTree;
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void sql_in_val(AST _t) throws RecognitionException {
		
		AST sql_in_val_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Field_ref:
		{
			fld(_t,CQ.REF);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case INDICATOR:
			case Field_ref:
			{
				fetch_indicator(_t);
				_t = _retTree;
				break;
			}
			case COMMA:
			case RIGHTPAREN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		case LEXDATE:
		case NUMBER:
		case QSTRING:
		case BIGENDIAN:
		case EXCLUSIVELOCK:
		case FALSE_KW:
		case FINDCASESENSITIVE:
		case FINDGLOBAL:
		case FINDNEXTOCCURRENCE:
		case FINDPREVOCCURRENCE:
		case FINDSELECT:
		case FINDWRAPAROUND:
		case HOSTBYTEORDER:
		case LITTLEENDIAN:
		case NO:
		case NOLOCK:
		case NOWAIT:
		case NULL_KW:
		case READAVAILABLE:
		case READEXACTNUM:
		case SEARCHSELF:
		case SEARCHTARGET:
		case SHARELOCK:
		case TRUE_KW:
		case WINDOWDELAYEDMINIMIZE:
		case WINDOWMAXIMIZED:
		case WINDOWMINIMIZED:
		case WINDOWNORMAL:
		case YES:
		case UNKNOWNVALUE:
		case FUNCTIONCALLTYPE:
		case GETATTRCALLTYPE:
		case PROCEDURECALLTYPE:
		case SAXCOMPLETE:
		case SAXPARSERERROR:
		case SAXRUNNING:
		case SAXUNINITIALIZED:
		case SETATTRCALLTYPE:
		case ROWUNMODIFIED:
		case ROWDELETED:
		case ROWMODIFIED:
		case ROWCREATED:
		{
			constant(_t);
			_t = _retTree;
			break;
		}
		case USERID:
		{
			AST tmp1856_AST_in = (AST)_t;
			match(_t,USERID);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void labeled_block(AST _t) throws RecognitionException {
		
		AST labeled_block_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1437 = _t;
		AST tmp1857_AST_in = (AST)_t;
		match(_t,BLOCK_LABEL);
		_t = _t.getFirstChild();
		AST tmp1858_AST_in = (AST)_t;
		match(_t,LEXCOLON);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case DO:
		{
			dostate(_t);
			_t = _retTree;
			break;
		}
		case FOR:
		{
			forstate(_t);
			_t = _retTree;
			break;
		}
		case REPEAT:
		{
			repeatstate(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1437;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void statement(AST _t) throws RecognitionException {
		
		AST statement_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case AATRACE:
		{
			aatracestatement(_t);
			_t = _retTree;
			break;
		}
		case ACCUMULATE:
		{
			accumulatestate(_t);
			_t = _retTree;
			break;
		}
		case ALTER:
		{
			altertablestate(_t);
			_t = _retTree;
			break;
		}
		case ANALYZE:
		{
			analyzestate(_t);
			_t = _retTree;
			break;
		}
		case APPLY:
		{
			applystate(_t);
			_t = _retTree;
			break;
		}
		case ASSIGN:
		{
			assignstate(_t);
			_t = _retTree;
			break;
		}
		case BELL:
		{
			bellstate(_t);
			_t = _retTree;
			break;
		}
		case BUFFERCOMPARE:
		{
			buffercomparestate(_t);
			_t = _retTree;
			break;
		}
		case BUFFERCOPY:
		{
			buffercopystate(_t);
			_t = _retTree;
			break;
		}
		case CALL:
		{
			callstate(_t);
			_t = _retTree;
			break;
		}
		case CASE:
		{
			casestate(_t);
			_t = _retTree;
			break;
		}
		case CATCH:
		{
			catchstate(_t);
			_t = _retTree;
			break;
		}
		case CHOOSE:
		{
			choosestate(_t);
			_t = _retTree;
			break;
		}
		case CLASS:
		{
			classstate(_t);
			_t = _retTree;
			break;
		}
		case CLEAR:
		{
			clearstate(_t);
			_t = _retTree;
			break;
		}
		case COLOR:
		{
			colorstate(_t);
			_t = _retTree;
			break;
		}
		case COMPILE:
		{
			compilestate(_t);
			_t = _retTree;
			break;
		}
		case CONNECT:
		{
			connectstate(_t);
			_t = _retTree;
			break;
		}
		case CONSTRUCTOR:
		{
			constructorstate(_t);
			_t = _retTree;
			break;
		}
		case COPYLOB:
		{
			copylobstate(_t);
			_t = _retTree;
			break;
		}
		case DECLARE:
		{
			declarecursorstate(_t);
			_t = _retTree;
			break;
		}
		case DICTIONARY:
		{
			dictionarystate(_t);
			_t = _retTree;
			break;
		}
		case DESTRUCTOR:
		{
			destructorstate(_t);
			_t = _retTree;
			break;
		}
		case DISCONNECT:
		{
			disconnectstate(_t);
			_t = _retTree;
			break;
		}
		case DISPLAY:
		{
			displaystate(_t);
			_t = _retTree;
			break;
		}
		case DO:
		{
			dostate(_t);
			_t = _retTree;
			break;
		}
		case DOWN:
		{
			downstate(_t);
			_t = _retTree;
			break;
		}
		case Assign_dynamic_new:
		{
			dynamicnewstate(_t);
			_t = _retTree;
			break;
		}
		case EMPTY:
		{
			emptytemptablestate(_t);
			_t = _retTree;
			break;
		}
		case ENABLE:
		{
			enablestate(_t);
			_t = _retTree;
			break;
		}
		case EXPORT:
		{
			exportstate(_t);
			_t = _retTree;
			break;
		}
		case FETCH:
		{
			fetchstate(_t);
			_t = _retTree;
			break;
		}
		case FINALLY:
		{
			finallystate(_t);
			_t = _retTree;
			break;
		}
		case FIND:
		{
			findstate(_t);
			_t = _retTree;
			break;
		}
		case FOR:
		{
			forstate(_t);
			_t = _retTree;
			break;
		}
		case FORMAT:
		{
			formstate(_t);
			_t = _retTree;
			break;
		}
		case FUNCTION:
		{
			functionstate(_t);
			_t = _retTree;
			break;
		}
		case GET:
		{
			getstate(_t);
			_t = _retTree;
			break;
		}
		case GETKEYVALUE:
		{
			getkeyvaluestate(_t);
			_t = _retTree;
			break;
		}
		case GRANT:
		{
			grantstate(_t);
			_t = _retTree;
			break;
		}
		case HIDE:
		{
			hidestate(_t);
			_t = _retTree;
			break;
		}
		case IF:
		{
			ifstate(_t);
			_t = _retTree;
			break;
		}
		case IMPORT:
		{
			importstate(_t);
			_t = _retTree;
			break;
		}
		case INTERFACE:
		{
			interfacestate(_t);
			_t = _retTree;
			break;
		}
		case LEAVE:
		{
			leavestate(_t);
			_t = _retTree;
			break;
		}
		case LOAD:
		{
			loadstate(_t);
			_t = _retTree;
			break;
		}
		case MESSAGE:
		{
			messagestate(_t);
			_t = _retTree;
			break;
		}
		case METHOD:
		{
			methodstate(_t);
			_t = _retTree;
			break;
		}
		case NEXT:
		{
			nextstate(_t);
			_t = _retTree;
			break;
		}
		case NEXTPROMPT:
		{
			nextpromptstate(_t);
			_t = _retTree;
			break;
		}
		case ON:
		{
			onstate(_t);
			_t = _retTree;
			break;
		}
		case OSAPPEND:
		{
			osappendstate(_t);
			_t = _retTree;
			break;
		}
		case BTOS:
		case DOS:
		case MPE:
		case OS2:
		case OS400:
		case OSCOMMAND:
		case UNIX:
		case VMS:
		{
			oscommandstate(_t);
			_t = _retTree;
			break;
		}
		case OSCOPY:
		{
			oscopystate(_t);
			_t = _retTree;
			break;
		}
		case OSCREATEDIR:
		{
			oscreatedirstate(_t);
			_t = _retTree;
			break;
		}
		case OSDELETE:
		{
			osdeletestate(_t);
			_t = _retTree;
			break;
		}
		case OSRENAME:
		{
			osrenamestate(_t);
			_t = _retTree;
			break;
		}
		case PAGE:
		{
			pagestate(_t);
			_t = _retTree;
			break;
		}
		case PAUSE:
		{
			pausestate(_t);
			_t = _retTree;
			break;
		}
		case PROCEDURE:
		{
			procedurestate(_t);
			_t = _retTree;
			break;
		}
		case PROCESS:
		{
			processeventsstate(_t);
			_t = _retTree;
			break;
		}
		case PROMPTFOR:
		{
			promptforstate(_t);
			_t = _retTree;
			break;
		}
		case PUBLISH:
		{
			publishstate(_t);
			_t = _retTree;
			break;
		}
		case PUTKEYVALUE:
		{
			putkeyvaluestate(_t);
			_t = _retTree;
			break;
		}
		case QUIT:
		{
			quitstate(_t);
			_t = _retTree;
			break;
		}
		case RAWTRANSFER:
		{
			rawtransferstate(_t);
			_t = _retTree;
			break;
		}
		case READKEY:
		{
			readkeystate(_t);
			_t = _retTree;
			break;
		}
		case REPEAT:
		{
			repeatstate(_t);
			_t = _retTree;
			break;
		}
		case REPOSITION:
		{
			repositionstate(_t);
			_t = _retTree;
			break;
		}
		case RETURN:
		{
			returnstate(_t);
			_t = _retTree;
			break;
		}
		case REVOKE:
		{
			revokestate(_t);
			_t = _retTree;
			break;
		}
		case ROUTINELEVEL:
		{
			routinelevelstate(_t);
			_t = _retTree;
			break;
		}
		case SAVE:
		{
			savecachestate(_t);
			_t = _retTree;
			break;
		}
		case SCROLL:
		{
			scrollstate(_t);
			_t = _retTree;
			break;
		}
		case SEEK:
		{
			seekstate(_t);
			_t = _retTree;
			break;
		}
		case SELECT:
		{
			selectstate(_t);
			_t = _retTree;
			break;
		}
		case SET:
		{
			setstate(_t);
			_t = _retTree;
			break;
		}
		case SHOWSTATS:
		{
			showstatsstate(_t);
			_t = _retTree;
			break;
		}
		case STATUS:
		{
			statusstate(_t);
			_t = _retTree;
			break;
		}
		case STOP:
		{
			stopstate(_t);
			_t = _retTree;
			break;
		}
		case SUBSCRIBE:
		{
			subscribestate(_t);
			_t = _retTree;
			break;
		}
		case SYSTEMHELP:
		{
			systemhelpstate(_t);
			_t = _retTree;
			break;
		}
		case THISOBJECT:
		{
			thisobjectstate(_t);
			_t = _retTree;
			break;
		}
		case TRANSACTIONMODE:
		{
			transactionmodeautomaticstate(_t);
			_t = _retTree;
			break;
		}
		case TRIGGER:
		{
			triggerprocedurestate(_t);
			_t = _retTree;
			break;
		}
		case UNDERLINE:
		{
			underlinestate(_t);
			_t = _retTree;
			break;
		}
		case UNDO:
		{
			undostate(_t);
			_t = _retTree;
			break;
		}
		case UNLOAD:
		{
			unloadstate(_t);
			_t = _retTree;
			break;
		}
		case UNSUBSCRIBE:
		{
			unsubscribestate(_t);
			_t = _retTree;
			break;
		}
		case UP:
		{
			upstate(_t);
			_t = _retTree;
			break;
		}
		case UPDATE:
		{
			updatestatement(_t);
			_t = _retTree;
			break;
		}
		case USE:
		{
			usestate(_t);
			_t = _retTree;
			break;
		}
		case USING:
		{
			usingstate(_t);
			_t = _retTree;
			break;
		}
		case VALIDATE:
		{
			validatestate(_t);
			_t = _retTree;
			break;
		}
		case VIEW:
		{
			viewstate(_t);
			_t = _retTree;
			break;
		}
		case WAITFOR:
		{
			waitforstate(_t);
			_t = _retTree;
			break;
		}
		default:
			if (_t==null) _t=ASTNULL;
			if (((_t.getType()==CLOSE))&&(state2(_t, 0))) {
				closestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CLOSE))&&(state2(_t, QUERY))) {
				closequerystate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CLOSE))&&(state2(_t, STOREDPROCEDURE))) {
				closestoredprocedurestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, 0))) {
				createstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, ALIAS))) {
				createaliasstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, Automationobject))) {
				createautomationobjectstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, BROWSE))) {
				createbrowsestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, BUFFER))) {
				createbufferstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, CALL))) {
				createcallstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, CLIENTPRINCIPAL))) {
				createclientprincipalstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, DATABASE))) {
				createdatabasestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, DATASET))) {
				createdatasetstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, DATASOURCE))) {
				createdatasourcestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, INDEX))) {
				createindexstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, QUERY))) {
				createquerystate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, SAXREADER))) {
				createsaxreaderstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, SAXWRITER))) {
				createsaxwriterstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, SERVER))) {
				createserverstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, SERVERSOCKET))) {
				createserversocketstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, SOAPHEADER))) {
				createsoapheaderstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, SOAPHEADERENTRYREF))) {
				createsoapheaderentryrefstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, SOCKET))) {
				createsocketstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, TABLE))) {
				createtablestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, TEMPTABLE))) {
				createtemptablestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, VIEW))) {
				createviewstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, WIDGET))) {
				createwidgetstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, WIDGETPOOL))) {
				createwidgetpoolstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, XDOCUMENT))) {
				createxdocumentstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==CREATE))&&(state2(_t, XNODEREF))) {
				createxnoderefstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DDE))&&(state2(_t, ADVISE))) {
				ddeadvisestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DDE))&&(state2(_t, EXECUTE))) {
				ddeexecutestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DDE))&&(state2(_t, GET))) {
				ddegetstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DDE))&&(state2(_t, INITIATE))) {
				ddeinitiatestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DDE))&&(state2(_t, REQUEST))) {
				dderequeststate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DDE))&&(state2(_t, SEND))) {
				ddesendstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DDE))&&(state2(_t, TERMINATE))) {
				ddeterminatestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, BROWSE))) {
				definebrowsestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, BUFFER))) {
				definebufferstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, BUTTON))) {
				definebuttonstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, DATASET))) {
				definedatasetstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, DATASOURCE))) {
				definedatasourcestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, EVENT))) {
				defineeventstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, FRAME))) {
				defineframestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, IMAGE))) {
				defineimagestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, MENU))) {
				definemenustate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, PARAMETER))) {
				defineparameterstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, PROPERTY))) {
				definepropertystate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, QUERY))) {
				definequerystate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, RECTANGLE))) {
				definerectanglestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, STREAM))) {
				definestreamstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, SUBMENU))) {
				definesubmenustate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, TEMPTABLE))) {
				definetemptablestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, WORKTABLE))) {
				defineworktablestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DEFINE))&&(state2(_t, VARIABLE))) {
				definevariablestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DELETE_KW))&&(state2(_t, 0))) {
				deletestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DELETE_KW))&&(state2(_t, ALIAS))) {
				deletealiasstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DELETE_KW))&&(state2(_t, FROM))) {
				deletefromstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DELETE_KW))&&(state2(_t, OBJECT))) {
				deleteobjectstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DELETE_KW))&&(state2(_t, PROCEDURE))) {
				deleteprocedurestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DELETE_KW))&&(state2(_t, WIDGET))) {
				deletewidgetstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DELETE_KW))&&(state2(_t, WIDGETPOOL))) {
				deletewidgetpoolstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DISABLE))&&(state2(_t, 0))) {
				disablestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DISABLE))&&(state2(_t, TRIGGERS))) {
				disabletriggersstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DROP))&&(state2(_t, INDEX))) {
				dropindexstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DROP))&&(state2(_t, TABLE))) {
				droptablestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==DROP))&&(state2(_t, VIEW))) {
				dropviewstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==INPUT))&&(state2(_t, CLEAR))) {
				inputclearstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==INPUT))&&(state2(_t, CLOSE))) {
				inputclosestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==INPUT))&&(state2(_t, FROM))) {
				inputfromstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==INPUT))&&(state2(_t, THROUGH))) {
				inputthroughstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==INPUTOUTPUT))&&(state2(_t, CLOSE))) {
				inputoutputclosestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==INPUTOUTPUT))&&(state2(_t, THROUGH))) {
				inputoutputthroughstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==INSERT))&&(state2(_t, INTO))) {
				insertintostate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==INSERT))&&(state2(_t, 0))) {
				insertstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==OPEN))&&(state2(_t, 0))) {
				openstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==OPEN))&&(state2(_t, QUERY))) {
				openquerystate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==OUTPUT))&&(state2(_t, CLOSE))) {
				outputclosestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==OUTPUT))&&(state2(_t, THROUGH))) {
				outputthroughstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==OUTPUT))&&(state2(_t, TO))) {
				outputtostate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==PUT))&&(state2(_t, 0))) {
				putstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==PUT))&&(state2(_t, CURSOR))) {
				putcursorstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==PUT))&&(state2(_t, SCREEN))) {
				putscreenstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==RELEASE))&&(state2(_t, 0))) {
				releasestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==RELEASE))&&(state2(_t, EXTERNAL))) {
				releaseexternalstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==RELEASE))&&(state2(_t, OBJECT))) {
				releaseobjectstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==RUN))&&(state2(_t, 0))) {
				runstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==RUN))&&(state2(_t, STOREDPROCEDURE))) {
				runstoredprocedurestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==RUN))&&(state2(_t, SUPER))) {
				runsuperstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==SYSTEMDIALOG))&&(state2(_t, COLOR))) {
				systemdialogcolorstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==SYSTEMDIALOG))&&(state2(_t, FONT))) {
				systemdialogfontstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==SYSTEMDIALOG))&&(state2(_t, GETDIR))) {
				systemdialoggetdirstate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==SYSTEMDIALOG))&&(state2(_t, GETFILE))) {
				systemdialoggetfilestate(_t);
				_t = _retTree;
			}
			else if (((_t.getType()==SYSTEMDIALOG))&&(state2(_t, PRINTERSETUP))) {
				systemdialogprintersetupstate(_t);
				_t = _retTree;
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void aatracestatement(AST _t) throws RecognitionException {
		
		AST aatracestatement_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1664 = _t;
		AST tmp1859_AST_in = (AST)_t;
		match(_t,AATRACE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case OFF:
		{
			AST tmp1860_AST_in = (AST)_t;
			match(_t,OFF);
			_t = _t.getNextSibling();
			state_end(_t);
			_t = _retTree;
			break;
		}
		case ON:
		{
			AST __t1666 = _t;
			AST tmp1861_AST_in = (AST)_t;
			match(_t,ON);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case AALIST:
			{
				AST tmp1862_AST_in = (AST)_t;
				match(_t,AALIST);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1666;
			_t = _t.getNextSibling();
			state_end(_t);
			_t = _retTree;
			break;
		}
		case CLOSE:
		case FROM:
		case STREAM:
		case THROUGH:
		case TO:
		case STREAMHANDLE:
		{
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case STREAM:
			case STREAMHANDLE:
			{
				stream_name_or_handle(_t);
				_t = _retTree;
				break;
			}
			case CLOSE:
			case FROM:
			case THROUGH:
			case TO:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case FROM:
			case THROUGH:
			case TO:
			{
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case TO:
				{
					AST tmp1863_AST_in = (AST)_t;
					match(_t,TO);
					_t = _t.getNextSibling();
					break;
				}
				case FROM:
				{
					AST tmp1864_AST_in = (AST)_t;
					match(_t,FROM);
					_t = _t.getNextSibling();
					break;
				}
				case THROUGH:
				{
					AST tmp1865_AST_in = (AST)_t;
					match(_t,THROUGH);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				io_phrase(_t);
				_t = _retTree;
				state_end(_t);
				_t = _retTree;
				break;
			}
			case CLOSE:
			{
				AST tmp1866_AST_in = (AST)_t;
				match(_t,CLOSE);
				_t = _t.getNextSibling();
				state_end(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1664;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void accumulatestate(AST _t) throws RecognitionException {
		
		AST accumulatestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1673 = _t;
		AST tmp1867_AST_in = (AST)_t;
		match(_t,ACCUMULATE);
		_t = _t.getFirstChild();
		{
		_loop1675:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Form_item)) {
				display_item(_t);
				_t = _retTree;
			}
			else {
				break _loop1675;
			}
			
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1673;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void analyzestate(AST _t) throws RecognitionException {
		
		AST analyzestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1685 = _t;
		AST tmp1868_AST_in = (AST)_t;
		match(_t,ANALYZE);
		_t = _t.getFirstChild();
		filenameorvalue(_t);
		_t = _retTree;
		filenameorvalue(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case OUTPUT:
		{
			AST __t1687 = _t;
			AST tmp1869_AST_in = (AST)_t;
			match(_t,OUTPUT);
			_t = _t.getFirstChild();
			filenameorvalue(_t);
			_t = _retTree;
			_t = __t1687;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case ALL:
		case APPEND:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop1689:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case APPEND:
			{
				AST tmp1870_AST_in = (AST)_t;
				match(_t,APPEND);
				_t = _t.getNextSibling();
				break;
			}
			case ALL:
			{
				AST tmp1871_AST_in = (AST)_t;
				match(_t,ALL);
				_t = _t.getNextSibling();
				break;
			}
			case NOERROR_KW:
			{
				AST tmp1872_AST_in = (AST)_t;
				match(_t,NOERROR_KW);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop1689;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1685;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void applystate(AST _t) throws RecognitionException {
		
		AST applystate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1691 = _t;
		AST tmp1873_AST_in = (AST)_t;
		match(_t,APPLY);
		_t = _t.getFirstChild();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TO:
		{
			AST __t1693 = _t;
			AST tmp1874_AST_in = (AST)_t;
			match(_t,TO);
			_t = _t.getFirstChild();
			gwidget(_t);
			_t = _retTree;
			_t = __t1693;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1691;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void assignstate(AST _t) throws RecognitionException {
		
		AST assignstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1700 = _t;
		AST tmp1875_AST_in = (AST)_t;
		match(_t,ASSIGN);
		_t = _t.getFirstChild();
		assignment_list(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1876_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1700;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void bellstate(AST _t) throws RecognitionException {
		
		AST bellstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1716 = _t;
		AST tmp1877_AST_in = (AST)_t;
		match(_t,BELL);
		_t = _t.getFirstChild();
		state_end(_t);
		_t = _retTree;
		_t = __t1716;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void callstate(AST _t) throws RecognitionException {
		
		AST callstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1718 = _t;
		AST tmp1878_AST_in = (AST)_t;
		match(_t,CALL);
		_t = _t.getFirstChild();
		filenameorvalue(_t);
		_t = _retTree;
		{
		_loop1720:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_35.member(_t.getType()))) {
				expressionorvalue(_t);
				_t = _retTree;
			}
			else {
				break _loop1720;
			}
			
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1718;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void casestate(AST _t) throws RecognitionException {
		
		AST casestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1730 = _t;
		AST tmp1879_AST_in = (AST)_t;
		match(_t,CASE);
		_t = _t.getFirstChild();
		expression(_t);
		_t = _retTree;
		block_colon(_t);
		_t = _retTree;
		AST __t1731 = _t;
		AST tmp1880_AST_in = (AST)_t;
		match(_t,Code_block);
		_t = _t.getFirstChild();
		{
		_loop1734:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==WHEN)) {
				AST __t1733 = _t;
				AST tmp1881_AST_in = (AST)_t;
				match(_t,WHEN);
				_t = _t.getFirstChild();
				case_expression(_t);
				_t = _retTree;
				AST tmp1882_AST_in = (AST)_t;
				match(_t,THEN);
				_t = _t.getNextSibling();
				blockorstate(_t);
				_t = _retTree;
				_t = __t1733;
				_t = _t.getNextSibling();
			}
			else {
				break _loop1734;
			}
			
		} while (true);
		}
		_t = __t1731;
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case OTHERWISE:
		{
			AST __t1736 = _t;
			AST tmp1883_AST_in = (AST)_t;
			match(_t,OTHERWISE);
			_t = _t.getFirstChild();
			blockorstate(_t);
			_t = _retTree;
			_t = __t1736;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case END:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EOF:
		{
			AST tmp1884_AST_in = (AST)_t;
			match(_t,Token.EOF_TYPE);
			_t = _t.getNextSibling();
			break;
		}
		case END:
		{
			AST __t1738 = _t;
			AST tmp1885_AST_in = (AST)_t;
			match(_t,END);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case CASE:
			{
				AST tmp1886_AST_in = (AST)_t;
				match(_t,CASE);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1738;
			_t = _t.getNextSibling();
			state_end(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1730;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void catchstate(AST _t) throws RecognitionException {
		
		AST catchstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1722 = _t;
		AST tmp1887_AST_in = (AST)_t;
		match(_t,CATCH);
		_t = _t.getFirstChild();
		field(_t);
		_t = _retTree;
		AST tmp1888_AST_in = (AST)_t;
		match(_t,AS);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CLASS:
		{
			AST tmp1889_AST_in = (AST)_t;
			match(_t,CLASS);
			_t = _t.getNextSibling();
			break;
		}
		case TYPE_NAME:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp1890_AST_in = (AST)_t;
		match(_t,TYPE_NAME);
		_t = _t.getNextSibling();
		block_colon(_t);
		_t = _retTree;
		code_block(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EOF:
		{
			AST tmp1891_AST_in = (AST)_t;
			match(_t,Token.EOF_TYPE);
			_t = _t.getNextSibling();
			break;
		}
		case END:
		{
			AST __t1725 = _t;
			AST tmp1892_AST_in = (AST)_t;
			match(_t,END);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case CATCH:
			{
				AST tmp1893_AST_in = (AST)_t;
				match(_t,CATCH);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1725;
			_t = _t.getNextSibling();
			state_end(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1722;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void closestate(AST _t) throws RecognitionException {
		
		AST closestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2475 = _t;
		AST tmp1894_AST_in = (AST)_t;
		match(_t,CLOSE);
		_t = _t.getFirstChild();
		AST tmp1895_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t2475;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void closequerystate(AST _t) throws RecognitionException {
		
		AST closequerystate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1747 = _t;
		AST tmp1896_AST_in = (AST)_t;
		match(_t,CLOSE);
		_t = _t.getFirstChild();
		AST tmp1897_AST_in = (AST)_t;
		match(_t,QUERY);
		_t = _t.getNextSibling();
		AST tmp1898_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t1747;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void compilestate(AST _t) throws RecognitionException {
		
		AST compilestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1778 = _t;
		AST tmp1899_AST_in = (AST)_t;
		match(_t,COMPILE);
		_t = _t.getFirstChild();
		filenameorvalue(_t);
		_t = _retTree;
		{
		_loop1828:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ATTRSPACE:
			{
				AST __t1780 = _t;
				AST tmp1900_AST_in = (AST)_t;
				match(_t,ATTRSPACE);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EQUAL:
				{
					AST __t1782 = _t;
					AST tmp1901_AST_in = (AST)_t;
					match(_t,EQUAL);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1782;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1780;
				_t = _t.getNextSibling();
				break;
			}
			case NOATTRSPACE:
			{
				AST tmp1902_AST_in = (AST)_t;
				match(_t,NOATTRSPACE);
				_t = _t.getNextSibling();
				break;
			}
			case SAVE:
			{
				AST __t1783 = _t;
				AST tmp1903_AST_in = (AST)_t;
				match(_t,SAVE);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EQUAL:
				{
					AST __t1785 = _t;
					AST tmp1904_AST_in = (AST)_t;
					match(_t,EQUAL);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1785;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				case INTO:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case INTO:
				{
					AST __t1787 = _t;
					AST tmp1905_AST_in = (AST)_t;
					match(_t,INTO);
					_t = _t.getFirstChild();
					filenameorvalue(_t);
					_t = _retTree;
					_t = __t1787;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1783;
				_t = _t.getNextSibling();
				break;
			}
			case LISTING:
			{
				AST __t1788 = _t;
				AST tmp1906_AST_in = (AST)_t;
				match(_t,LISTING);
				_t = _t.getFirstChild();
				filenameorvalue(_t);
				_t = _retTree;
				{
				_loop1792:
				do {
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case APPEND:
					{
						compile_append(_t);
						_t = _retTree;
						break;
					}
					case PAGESIZE_KW:
					{
						AST __t1790 = _t;
						AST tmp1907_AST_in = (AST)_t;
						match(_t,PAGESIZE_KW);
						_t = _t.getFirstChild();
						expression(_t);
						_t = _retTree;
						_t = __t1790;
						_t = _t.getNextSibling();
						break;
					}
					case PAGEWIDTH:
					{
						AST __t1791 = _t;
						AST tmp1908_AST_in = (AST)_t;
						match(_t,PAGEWIDTH);
						_t = _t.getFirstChild();
						expression(_t);
						_t = _retTree;
						_t = __t1791;
						_t = _t.getNextSibling();
						break;
					}
					default:
					{
						break _loop1792;
					}
					}
				} while (true);
				}
				_t = __t1788;
				_t = _t.getNextSibling();
				break;
			}
			case XCODE:
			{
				AST __t1793 = _t;
				AST tmp1909_AST_in = (AST)_t;
				match(_t,XCODE);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1793;
				_t = _t.getNextSibling();
				break;
			}
			case XREF:
			{
				AST __t1794 = _t;
				AST tmp1910_AST_in = (AST)_t;
				match(_t,XREF);
				_t = _t.getFirstChild();
				filenameorvalue(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case APPEND:
				{
					compile_append(_t);
					_t = _retTree;
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1794;
				_t = _t.getNextSibling();
				break;
			}
			case XREFXML:
			{
				AST __t1796 = _t;
				AST tmp1911_AST_in = (AST)_t;
				match(_t,XREFXML);
				_t = _t.getFirstChild();
				filenameorvalue(_t);
				_t = _retTree;
				_t = __t1796;
				_t = _t.getNextSibling();
				break;
			}
			case STRINGXREF:
			{
				AST __t1797 = _t;
				AST tmp1912_AST_in = (AST)_t;
				match(_t,STRINGXREF);
				_t = _t.getFirstChild();
				filenameorvalue(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case APPEND:
				{
					compile_append(_t);
					_t = _retTree;
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1797;
				_t = _t.getNextSibling();
				break;
			}
			case STREAMIO:
			{
				AST __t1799 = _t;
				AST tmp1913_AST_in = (AST)_t;
				match(_t,STREAMIO);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EQUAL:
				{
					AST __t1801 = _t;
					AST tmp1914_AST_in = (AST)_t;
					match(_t,EQUAL);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1801;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1799;
				_t = _t.getNextSibling();
				break;
			}
			case MINSIZE:
			{
				AST __t1802 = _t;
				AST tmp1915_AST_in = (AST)_t;
				match(_t,MINSIZE);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EQUAL:
				{
					AST __t1804 = _t;
					AST tmp1916_AST_in = (AST)_t;
					match(_t,EQUAL);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1804;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1802;
				_t = _t.getNextSibling();
				break;
			}
			case LANGUAGES:
			{
				AST __t1805 = _t;
				AST tmp1917_AST_in = (AST)_t;
				match(_t,LANGUAGES);
				_t = _t.getFirstChild();
				AST tmp1918_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case VALUE:
				case TYPELESS_TOKEN:
				{
					compile_lang(_t);
					_t = _retTree;
					{
					_loop1808:
					do {
						if (_t==null) _t=ASTNULL;
						if ((_t.getType()==COMMA)) {
							AST tmp1919_AST_in = (AST)_t;
							match(_t,COMMA);
							_t = _t.getNextSibling();
							compile_lang(_t);
							_t = _retTree;
						}
						else {
							break _loop1808;
						}
						
					} while (true);
					}
					break;
				}
				case RIGHTPAREN:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				AST tmp1920_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				_t = __t1805;
				_t = _t.getNextSibling();
				break;
			}
			case TEXTSEGGROW:
			{
				AST __t1809 = _t;
				AST tmp1921_AST_in = (AST)_t;
				match(_t,TEXTSEGGROW);
				_t = _t.getFirstChild();
				AST __t1810 = _t;
				AST tmp1922_AST_in = (AST)_t;
				match(_t,EQUAL);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1810;
				_t = _t.getNextSibling();
				_t = __t1809;
				_t = _t.getNextSibling();
				break;
			}
			case DEBUGLIST:
			{
				AST __t1811 = _t;
				AST tmp1923_AST_in = (AST)_t;
				match(_t,DEBUGLIST);
				_t = _t.getFirstChild();
				filenameorvalue(_t);
				_t = _retTree;
				_t = __t1811;
				_t = _t.getNextSibling();
				break;
			}
			case DEFAULTNOXLATE:
			{
				AST __t1812 = _t;
				AST tmp1924_AST_in = (AST)_t;
				match(_t,DEFAULTNOXLATE);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EQUAL:
				{
					AST __t1814 = _t;
					AST tmp1925_AST_in = (AST)_t;
					match(_t,EQUAL);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1814;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1812;
				_t = _t.getNextSibling();
				break;
			}
			case GENERATEMD5:
			{
				AST __t1815 = _t;
				AST tmp1926_AST_in = (AST)_t;
				match(_t,GENERATEMD5);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EQUAL:
				{
					AST __t1817 = _t;
					AST tmp1927_AST_in = (AST)_t;
					match(_t,EQUAL);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1817;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1815;
				_t = _t.getNextSibling();
				break;
			}
			case PREPROCESS:
			{
				AST __t1818 = _t;
				AST tmp1928_AST_in = (AST)_t;
				match(_t,PREPROCESS);
				_t = _t.getFirstChild();
				filenameorvalue(_t);
				_t = _retTree;
				_t = __t1818;
				_t = _t.getNextSibling();
				break;
			}
			case USEREVVIDEO:
			{
				AST __t1819 = _t;
				AST tmp1929_AST_in = (AST)_t;
				match(_t,USEREVVIDEO);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EQUAL:
				{
					AST __t1821 = _t;
					AST tmp1930_AST_in = (AST)_t;
					match(_t,EQUAL);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1821;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1819;
				_t = _t.getNextSibling();
				break;
			}
			case USEUNDERLINE:
			{
				AST __t1822 = _t;
				AST tmp1931_AST_in = (AST)_t;
				match(_t,USEUNDERLINE);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EQUAL:
				{
					AST __t1824 = _t;
					AST tmp1932_AST_in = (AST)_t;
					match(_t,EQUAL);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1824;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1822;
				_t = _t.getNextSibling();
				break;
			}
			case V6FRAME:
			{
				AST __t1825 = _t;
				AST tmp1933_AST_in = (AST)_t;
				match(_t,V6FRAME);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EQUAL:
				{
					AST __t1827 = _t;
					AST tmp1934_AST_in = (AST)_t;
					match(_t,EQUAL);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t1827;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1825;
				_t = _t.getNextSibling();
				break;
			}
			case NOERROR_KW:
			{
				AST tmp1935_AST_in = (AST)_t;
				match(_t,NOERROR_KW);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop1828;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1778;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void connectstate(AST _t) throws RecognitionException {
		
		AST connectstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1837 = _t;
		AST tmp1936_AST_in = (AST)_t;
		match(_t,CONNECT);
		_t = _t.getFirstChild();
		{
		_loop1839:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOERROR_KW:
			{
				AST tmp1937_AST_in = (AST)_t;
				match(_t,NOERROR_KW);
				_t = _t.getNextSibling();
				break;
			}
			case DDE:
			{
				AST tmp1938_AST_in = (AST)_t;
				match(_t,DDE);
				_t = _t.getNextSibling();
				break;
			}
			case FILENAME:
			case VALUE:
			{
				filenameorvalue(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				break _loop1839;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1837;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void copylobstate(AST _t) throws RecognitionException {
		
		AST copylobstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1851 = _t;
		AST tmp1939_AST_in = (AST)_t;
		match(_t,COPYLOB);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==FROM)) {
			AST tmp1940_AST_in = (AST)_t;
			match(_t,FROM);
			_t = _t.getNextSibling();
		}
		else if ((_tokenSet_36.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==FILE)) {
			AST tmp1941_AST_in = (AST)_t;
			match(_t,FILE);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
		}
		else if ((_tokenSet_37.member(_t.getType()))) {
			{
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==OBJECT)) {
				AST tmp1942_AST_in = (AST)_t;
				match(_t,OBJECT);
				_t = _t.getNextSibling();
			}
			else if ((_tokenSet_3.member(_t.getType()))) {
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			expression(_t);
			_t = _retTree;
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STARTING:
		{
			AST __t1856 = _t;
			AST tmp1943_AST_in = (AST)_t;
			match(_t,STARTING);
			_t = _t.getFirstChild();
			AST tmp1944_AST_in = (AST)_t;
			match(_t,AT);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t1856;
			_t = _t.getNextSibling();
			break;
		}
		case FOR:
		case TO:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FOR:
		{
			AST __t1858 = _t;
			AST tmp1945_AST_in = (AST)_t;
			match(_t,FOR);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1858;
			_t = _t.getNextSibling();
			break;
		}
		case TO:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp1946_AST_in = (AST)_t;
		match(_t,TO);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==FILE)) {
			AST tmp1947_AST_in = (AST)_t;
			match(_t,FILE);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case APPEND:
			{
				AST tmp1948_AST_in = (AST)_t;
				match(_t,APPEND);
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case CONVERT:
			case NOCONVERT:
			case NOERROR_KW:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
		}
		else if ((_tokenSet_37.member(_t.getType()))) {
			{
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==OBJECT)) {
				AST tmp1949_AST_in = (AST)_t;
				match(_t,OBJECT);
				_t = _t.getNextSibling();
			}
			else if ((_tokenSet_3.member(_t.getType()))) {
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			expression(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case OVERLAY:
			{
				AST tmp1950_AST_in = (AST)_t;
				match(_t,OVERLAY);
				_t = _t.getNextSibling();
				AST tmp1951_AST_in = (AST)_t;
				match(_t,AT);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case TRIM:
				{
					AST tmp1952_AST_in = (AST)_t;
					match(_t,TRIM);
					_t = _t.getNextSibling();
					break;
				}
				case EOF:
				case PERIOD:
				case CONVERT:
				case NOCONVERT:
				case NOERROR_KW:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				break;
			}
			case EOF:
			case PERIOD:
			case CONVERT:
			case NOCONVERT:
			case NOERROR_KW:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOCONVERT:
		{
			AST tmp1953_AST_in = (AST)_t;
			match(_t,NOCONVERT);
			_t = _t.getNextSibling();
			break;
		}
		case CONVERT:
		{
			convertphrase(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1954_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1851;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createaliasstate(AST _t) throws RecognitionException {
		
		AST createaliasstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1867 = _t;
		AST tmp1955_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1956_AST_in = (AST)_t;
		match(_t,ALIAS);
		_t = _t.getNextSibling();
		anyorvalue(_t);
		_t = _retTree;
		AST tmp1957_AST_in = (AST)_t;
		match(_t,FOR);
		_t = _t.getNextSibling();
		AST tmp1958_AST_in = (AST)_t;
		match(_t,DATABASE);
		_t = _t.getNextSibling();
		anyorvalue(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1959_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1867;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createcallstate(AST _t) throws RecognitionException {
		
		AST createcallstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1870 = _t;
		AST tmp1960_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1961_AST_in = (AST)_t;
		match(_t,CALL);
		_t = _t.getNextSibling();
		create_whatever_args(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1870;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createclientprincipalstate(AST _t) throws RecognitionException {
		
		AST createclientprincipalstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1872 = _t;
		AST tmp1962_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1963_AST_in = (AST)_t;
		match(_t,CLIENTPRINCIPAL);
		_t = _t.getNextSibling();
		create_whatever_args(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1872;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createdatabasestate(AST _t) throws RecognitionException {
		
		AST createdatabasestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1874 = _t;
		AST tmp1964_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1965_AST_in = (AST)_t;
		match(_t,DATABASE);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FROM:
		{
			AST __t1876 = _t;
			AST tmp1966_AST_in = (AST)_t;
			match(_t,FROM);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NEWINSTANCE:
			{
				AST tmp1967_AST_in = (AST)_t;
				match(_t,NEWINSTANCE);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1876;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		case REPLACE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case REPLACE:
		{
			AST tmp1968_AST_in = (AST)_t;
			match(_t,REPLACE);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp1969_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1874;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createdatasetstate(AST _t) throws RecognitionException {
		
		AST createdatasetstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1881 = _t;
		AST tmp1970_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1971_AST_in = (AST)_t;
		match(_t,DATASET);
		_t = _t.getNextSibling();
		create_whatever_args(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1881;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createdatasourcestate(AST _t) throws RecognitionException {
		
		AST createdatasourcestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1883 = _t;
		AST tmp1972_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1973_AST_in = (AST)_t;
		match(_t,DATASOURCE);
		_t = _t.getNextSibling();
		create_whatever_args(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1883;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createquerystate(AST _t) throws RecognitionException {
		
		AST createquerystate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1885 = _t;
		AST tmp1974_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1975_AST_in = (AST)_t;
		match(_t,QUERY);
		_t = _t.getNextSibling();
		create_whatever_args(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1885;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createsaxreaderstate(AST _t) throws RecognitionException {
		
		AST createsaxreaderstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1887 = _t;
		AST tmp1976_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1977_AST_in = (AST)_t;
		match(_t,SAXREADER);
		_t = _t.getNextSibling();
		create_whatever_args(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1887;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createsaxwriterstate(AST _t) throws RecognitionException {
		
		AST createsaxwriterstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1889 = _t;
		AST tmp1978_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1979_AST_in = (AST)_t;
		match(_t,SAXWRITER);
		_t = _t.getNextSibling();
		create_whatever_args(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1889;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createsoapheaderstate(AST _t) throws RecognitionException {
		
		AST createsoapheaderstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1891 = _t;
		AST tmp1980_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1981_AST_in = (AST)_t;
		match(_t,SOAPHEADER);
		_t = _t.getNextSibling();
		create_whatever_args(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1891;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createsoapheaderentryrefstate(AST _t) throws RecognitionException {
		
		AST createsoapheaderentryrefstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1893 = _t;
		AST tmp1982_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1983_AST_in = (AST)_t;
		match(_t,SOAPHEADERENTRYREF);
		_t = _t.getNextSibling();
		create_whatever_args(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1893;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createtablestate(AST _t) throws RecognitionException {
		
		AST createtablestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2477 = _t;
		AST tmp1984_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp1985_AST_in = (AST)_t;
		match(_t,TABLE);
		_t = _t.getNextSibling();
		AST tmp1986_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		AST tmp1987_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ID:
		{
			sql_col_def(_t);
			_t = _retTree;
			break;
		}
		case UNIQUE:
		{
			AST __t2479 = _t;
			AST tmp1988_AST_in = (AST)_t;
			match(_t,UNIQUE);
			_t = _t.getFirstChild();
			AST tmp1989_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			AST tmp1990_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			{
			_loop2481:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==COMMA)) {
					AST tmp1991_AST_in = (AST)_t;
					match(_t,COMMA);
					_t = _t.getNextSibling();
					AST tmp1992_AST_in = (AST)_t;
					match(_t,ID);
					_t = _t.getNextSibling();
				}
				else {
					break _loop2481;
				}
				
			} while (true);
			}
			AST tmp1993_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			_t = __t2479;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop2487:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==COMMA)) {
				AST tmp1994_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case ID:
				{
					sql_col_def(_t);
					_t = _retTree;
					break;
				}
				case UNIQUE:
				{
					AST __t2484 = _t;
					AST tmp1995_AST_in = (AST)_t;
					match(_t,UNIQUE);
					_t = _t.getFirstChild();
					AST tmp1996_AST_in = (AST)_t;
					match(_t,LEFTPAREN);
					_t = _t.getNextSibling();
					AST tmp1997_AST_in = (AST)_t;
					match(_t,ID);
					_t = _t.getNextSibling();
					{
					_loop2486:
					do {
						if (_t==null) _t=ASTNULL;
						if ((_t.getType()==COMMA)) {
							AST tmp1998_AST_in = (AST)_t;
							match(_t,COMMA);
							_t = _t.getNextSibling();
							AST tmp1999_AST_in = (AST)_t;
							match(_t,ID);
							_t = _t.getNextSibling();
						}
						else {
							break _loop2486;
						}
						
					} while (true);
					}
					AST tmp2000_AST_in = (AST)_t;
					match(_t,RIGHTPAREN);
					_t = _t.getNextSibling();
					_t = __t2484;
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
			}
			else {
				break _loop2487;
			}
			
		} while (true);
		}
		AST tmp2001_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t2477;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createwidgetpoolstate(AST _t) throws RecognitionException {
		
		AST createwidgetpoolstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1895 = _t;
		AST tmp2002_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp2003_AST_in = (AST)_t;
		match(_t,WIDGETPOOL);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else if ((_tokenSet_38.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PERSISTENT:
		{
			AST tmp2004_AST_in = (AST)_t;
			match(_t,PERSISTENT);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2005_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1895;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createxdocumentstate(AST _t) throws RecognitionException {
		
		AST createxdocumentstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1900 = _t;
		AST tmp2006_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp2007_AST_in = (AST)_t;
		match(_t,XDOCUMENT);
		_t = _t.getNextSibling();
		create_whatever_args(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1900;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void createxnoderefstate(AST _t) throws RecognitionException {
		
		AST createxnoderefstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1902 = _t;
		AST tmp2008_AST_in = (AST)_t;
		match(_t,CREATE);
		_t = _t.getFirstChild();
		AST tmp2009_AST_in = (AST)_t;
		match(_t,XNODEREF);
		_t = _t.getNextSibling();
		create_whatever_args(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t1902;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void ddeadvisestate(AST _t) throws RecognitionException {
		
		AST ddeadvisestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1915 = _t;
		AST tmp2010_AST_in = (AST)_t;
		match(_t,DDE);
		_t = _t.getFirstChild();
		AST tmp2011_AST_in = (AST)_t;
		match(_t,ADVISE);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case START:
		{
			AST tmp2012_AST_in = (AST)_t;
			match(_t,START);
			_t = _t.getNextSibling();
			break;
		}
		case STOP:
		{
			AST tmp2013_AST_in = (AST)_t;
			match(_t,STOP);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp2014_AST_in = (AST)_t;
		match(_t,ITEM);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TIME:
		{
			AST __t1918 = _t;
			AST tmp2015_AST_in = (AST)_t;
			match(_t,TIME);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1918;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2016_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1915;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void ddeexecutestate(AST _t) throws RecognitionException {
		
		AST ddeexecutestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1921 = _t;
		AST tmp2017_AST_in = (AST)_t;
		match(_t,DDE);
		_t = _t.getFirstChild();
		AST tmp2018_AST_in = (AST)_t;
		match(_t,EXECUTE);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		AST tmp2019_AST_in = (AST)_t;
		match(_t,COMMAND);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TIME:
		{
			AST __t1923 = _t;
			AST tmp2020_AST_in = (AST)_t;
			match(_t,TIME);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1923;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2021_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1921;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void ddesendstate(AST _t) throws RecognitionException {
		
		AST ddesendstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1926 = _t;
		AST tmp2022_AST_in = (AST)_t;
		match(_t,DDE);
		_t = _t.getFirstChild();
		AST tmp2023_AST_in = (AST)_t;
		match(_t,SEND);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		AST tmp2024_AST_in = (AST)_t;
		match(_t,SOURCE);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		AST tmp2025_AST_in = (AST)_t;
		match(_t,ITEM);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TIME:
		{
			AST __t1928 = _t;
			AST tmp2026_AST_in = (AST)_t;
			match(_t,TIME);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1928;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2027_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1926;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void ddeterminatestate(AST _t) throws RecognitionException {
		
		AST ddeterminatestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1931 = _t;
		AST tmp2028_AST_in = (AST)_t;
		match(_t,DDE);
		_t = _t.getFirstChild();
		AST tmp2029_AST_in = (AST)_t;
		match(_t,TERMINATE);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2030_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1931;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void declarecursorstate(AST _t) throws RecognitionException {
		
		AST declarecursorstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2489 = _t;
		AST tmp2031_AST_in = (AST)_t;
		match(_t,DECLARE);
		_t = _t.getFirstChild();
		AST tmp2032_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		AST tmp2033_AST_in = (AST)_t;
		match(_t,CURSOR);
		_t = _t.getNextSibling();
		AST tmp2034_AST_in = (AST)_t;
		match(_t,FOR);
		_t = _t.getNextSibling();
		selectstatea(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FOR:
		{
			AST __t2491 = _t;
			AST tmp2035_AST_in = (AST)_t;
			match(_t,FOR);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case READ:
			{
				AST __t2493 = _t;
				AST tmp2036_AST_in = (AST)_t;
				match(_t,READ);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case ONLY:
				{
					AST tmp2037_AST_in = (AST)_t;
					match(_t,ONLY);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t2493;
				_t = _t.getNextSibling();
				break;
			}
			case UPDATE:
			{
				AST tmp2038_AST_in = (AST)_t;
				match(_t,UPDATE);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2491;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2489;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void dictionarystate(AST _t) throws RecognitionException {
		
		AST dictionarystate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1967 = _t;
		AST tmp2039_AST_in = (AST)_t;
		match(_t,DICTIONARY);
		_t = _t.getFirstChild();
		state_end(_t);
		_t = _retTree;
		_t = __t1967;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void deletealiasstate(AST _t) throws RecognitionException {
		
		AST deletealiasstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1950 = _t;
		AST tmp2040_AST_in = (AST)_t;
		match(_t,DELETE_KW);
		_t = _t.getFirstChild();
		AST tmp2041_AST_in = (AST)_t;
		match(_t,ALIAS);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ID:
		{
			AST tmp2042_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			break;
		}
		case QSTRING:
		{
			AST tmp2043_AST_in = (AST)_t;
			match(_t,QSTRING);
			_t = _t.getNextSibling();
			break;
		}
		case VALUE:
		{
			valueexpression(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1950;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void deleteobjectstate(AST _t) throws RecognitionException {
		
		AST deleteobjectstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1953 = _t;
		AST tmp2044_AST_in = (AST)_t;
		match(_t,DELETE_KW);
		_t = _t.getFirstChild();
		AST tmp2045_AST_in = (AST)_t;
		match(_t,OBJECT);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2046_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1953;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void deleteprocedurestate(AST _t) throws RecognitionException {
		
		AST deleteprocedurestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1956 = _t;
		AST tmp2047_AST_in = (AST)_t;
		match(_t,DELETE_KW);
		_t = _t.getFirstChild();
		AST tmp2048_AST_in = (AST)_t;
		match(_t,PROCEDURE);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2049_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1956;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void deletewidgetstate(AST _t) throws RecognitionException {
		
		AST deletewidgetstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1959 = _t;
		AST tmp2050_AST_in = (AST)_t;
		match(_t,DELETE_KW);
		_t = _t.getFirstChild();
		AST tmp2051_AST_in = (AST)_t;
		match(_t,WIDGET);
		_t = _t.getNextSibling();
		{
		_loop1961:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==Widget_ref)) {
				gwidget(_t);
				_t = _retTree;
			}
			else {
				break _loop1961;
			}
			
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1959;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void deletewidgetpoolstate(AST _t) throws RecognitionException {
		
		AST deletewidgetpoolstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1963 = _t;
		AST tmp2052_AST_in = (AST)_t;
		match(_t,DELETE_KW);
		_t = _t.getFirstChild();
		AST tmp2053_AST_in = (AST)_t;
		match(_t,WIDGETPOOL);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else if ((_t.getType()==EOF||_t.getType()==PERIOD||_t.getType()==NOERROR_KW)) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2054_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t1963;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void dropindexstate(AST _t) throws RecognitionException {
		
		AST dropindexstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2496 = _t;
		AST tmp2055_AST_in = (AST)_t;
		match(_t,DROP);
		_t = _t.getFirstChild();
		AST tmp2056_AST_in = (AST)_t;
		match(_t,INDEX);
		_t = _t.getNextSibling();
		AST tmp2057_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t2496;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void dropviewstate(AST _t) throws RecognitionException {
		
		AST dropviewstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2498 = _t;
		AST tmp2058_AST_in = (AST)_t;
		match(_t,DROP);
		_t = _t.getFirstChild();
		AST tmp2059_AST_in = (AST)_t;
		match(_t,VIEW);
		_t = _t.getNextSibling();
		AST tmp2060_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t2498;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void finallystate(AST _t) throws RecognitionException {
		
		AST finallystate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1996 = _t;
		AST tmp2061_AST_in = (AST)_t;
		match(_t,FINALLY);
		_t = _t.getFirstChild();
		block_colon(_t);
		_t = _retTree;
		code_block(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EOF:
		{
			AST tmp2062_AST_in = (AST)_t;
			match(_t,Token.EOF_TYPE);
			_t = _t.getNextSibling();
			break;
		}
		case END:
		{
			AST __t1998 = _t;
			AST tmp2063_AST_in = (AST)_t;
			match(_t,END);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case FINALLY:
			{
				AST tmp2064_AST_in = (AST)_t;
				match(_t,FINALLY);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1998;
			_t = _t.getNextSibling();
			state_end(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1996;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void getstate(AST _t) throws RecognitionException {
		
		AST getstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2006 = _t;
		AST tmp2065_AST_in = (AST)_t;
		match(_t,GET);
		_t = _t.getFirstChild();
		findwhich(_t);
		_t = _retTree;
		AST tmp2066_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		{
		_loop2008:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case EXCLUSIVELOCK:
			case NOLOCK:
			case SHARELOCK:
			{
				lockhow(_t);
				_t = _retTree;
				break;
			}
			case NOWAIT:
			{
				AST tmp2067_AST_in = (AST)_t;
				match(_t,NOWAIT);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop2008;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2006;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void hidestate(AST _t) throws RecognitionException {
		
		AST hidestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2020 = _t;
		AST tmp2068_AST_in = (AST)_t;
		match(_t,HIDE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case ALL:
		case IN_KW:
		case MESSAGE:
		case NOPAUSE:
		case Widget_ref:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case MESSAGE:
		{
			AST tmp2069_AST_in = (AST)_t;
			match(_t,MESSAGE);
			_t = _t.getNextSibling();
			break;
		}
		case ALL:
		{
			AST tmp2070_AST_in = (AST)_t;
			match(_t,ALL);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case IN_KW:
		case NOPAUSE:
		case Widget_ref:
		{
			{
			_loop2024:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==Widget_ref)) {
					gwidget(_t);
					_t = _retTree;
				}
				else {
					break _loop2024;
				}
				
			} while (true);
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOPAUSE:
		{
			AST tmp2071_AST_in = (AST)_t;
			match(_t,NOPAUSE);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case IN_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t2027 = _t;
			AST tmp2072_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp2073_AST_in = (AST)_t;
			match(_t,WINDOW);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t2027;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2020;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void ifstate(AST _t) throws RecognitionException {
		
		AST ifstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2029 = _t;
		AST tmp2074_AST_in = (AST)_t;
		match(_t,IF);
		_t = _t.getFirstChild();
		expression(_t);
		_t = _retTree;
		AST tmp2075_AST_in = (AST)_t;
		match(_t,THEN);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PERIOD:
		case PROPARSEDIRECTIVE:
		case AATRACE:
		case ACCUMULATE:
		case ALTER:
		case ANALYZE:
		case APPLY:
		case ASSIGN:
		case BELL:
		case BTOS:
		case BUFFERCOMPARE:
		case BUFFERCOPY:
		case CALL:
		case CASE:
		case CHOOSE:
		case CLEAR:
		case CLOSE:
		case COLOR:
		case COMPILE:
		case CONNECT:
		case CREATE:
		case DDE:
		case DECLARE:
		case DEFINE:
		case DELETE_KW:
		case DICTIONARY:
		case DISABLE:
		case DISCONNECT:
		case DISPLAY:
		case DO:
		case DOS:
		case DOWN:
		case DROP:
		case EMPTY:
		case ENABLE:
		case EXPORT:
		case FETCH:
		case FIND:
		case FOR:
		case FORMAT:
		case FUNCTION:
		case GET:
		case GETKEYVALUE:
		case GRANT:
		case HIDE:
		case IF:
		case IMPORT:
		case INPUT:
		case INPUTOUTPUT:
		case INSERT:
		case LEAVE:
		case LOAD:
		case MESSAGE:
		case MPE:
		case NEXT:
		case NEXTPROMPT:
		case ON:
		case OPEN:
		case OS2:
		case OS400:
		case OSAPPEND:
		case OSCOMMAND:
		case OSCOPY:
		case OSCREATEDIR:
		case OSDELETE:
		case OSRENAME:
		case OUTPUT:
		case PAGE:
		case PAUSE:
		case PROCEDURE:
		case PROCESS:
		case PROMPTFOR:
		case PUBLISH:
		case PUT:
		case PUTKEYVALUE:
		case QUIT:
		case RAWTRANSFER:
		case READKEY:
		case RELEASE:
		case REPEAT:
		case REPOSITION:
		case RETURN:
		case REVOKE:
		case RUN:
		case SAVE:
		case SCROLL:
		case SEEK:
		case SELECT:
		case SET:
		case SHOWSTATS:
		case STATUS:
		case STOP:
		case SUBSCRIBE:
		case SYSTEMDIALOG:
		case SYSTEMHELP:
		case TRANSACTIONMODE:
		case TRIGGER:
		case UNDERLINE:
		case UNDO:
		case UNIX:
		case UNLOAD:
		case UNSUBSCRIBE:
		case UP:
		case UPDATE:
		case USE:
		case USING:
		case VALIDATE:
		case VIEW:
		case VMS:
		case WAITFOR:
		case Expr_statement:
		case BLOCK_LABEL:
		case COPYLOB:
		case DOT_COMMENT:
		case CLASS:
		case CONSTRUCTOR:
		case INTERFACE:
		case METHOD:
		case THISOBJECT:
		case DESTRUCTOR:
		case ANNOTATION:
		case CATCH:
		case FINALLY:
		case ROUTINELEVEL:
		case Assign_dynamic_new:
		{
			blockorstate(_t);
			_t = _retTree;
			break;
		}
		case 3:
		case ELSE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ELSE:
		{
			AST __t2032 = _t;
			AST tmp2076_AST_in = (AST)_t;
			match(_t,ELSE);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PERIOD:
			case PROPARSEDIRECTIVE:
			case AATRACE:
			case ACCUMULATE:
			case ALTER:
			case ANALYZE:
			case APPLY:
			case ASSIGN:
			case BELL:
			case BTOS:
			case BUFFERCOMPARE:
			case BUFFERCOPY:
			case CALL:
			case CASE:
			case CHOOSE:
			case CLEAR:
			case CLOSE:
			case COLOR:
			case COMPILE:
			case CONNECT:
			case CREATE:
			case DDE:
			case DECLARE:
			case DEFINE:
			case DELETE_KW:
			case DICTIONARY:
			case DISABLE:
			case DISCONNECT:
			case DISPLAY:
			case DO:
			case DOS:
			case DOWN:
			case DROP:
			case EMPTY:
			case ENABLE:
			case EXPORT:
			case FETCH:
			case FIND:
			case FOR:
			case FORMAT:
			case FUNCTION:
			case GET:
			case GETKEYVALUE:
			case GRANT:
			case HIDE:
			case IF:
			case IMPORT:
			case INPUT:
			case INPUTOUTPUT:
			case INSERT:
			case LEAVE:
			case LOAD:
			case MESSAGE:
			case MPE:
			case NEXT:
			case NEXTPROMPT:
			case ON:
			case OPEN:
			case OS2:
			case OS400:
			case OSAPPEND:
			case OSCOMMAND:
			case OSCOPY:
			case OSCREATEDIR:
			case OSDELETE:
			case OSRENAME:
			case OUTPUT:
			case PAGE:
			case PAUSE:
			case PROCEDURE:
			case PROCESS:
			case PROMPTFOR:
			case PUBLISH:
			case PUT:
			case PUTKEYVALUE:
			case QUIT:
			case RAWTRANSFER:
			case READKEY:
			case RELEASE:
			case REPEAT:
			case REPOSITION:
			case RETURN:
			case REVOKE:
			case RUN:
			case SAVE:
			case SCROLL:
			case SEEK:
			case SELECT:
			case SET:
			case SHOWSTATS:
			case STATUS:
			case STOP:
			case SUBSCRIBE:
			case SYSTEMDIALOG:
			case SYSTEMHELP:
			case TRANSACTIONMODE:
			case TRIGGER:
			case UNDERLINE:
			case UNDO:
			case UNIX:
			case UNLOAD:
			case UNSUBSCRIBE:
			case UP:
			case UPDATE:
			case USE:
			case USING:
			case VALIDATE:
			case VIEW:
			case VMS:
			case WAITFOR:
			case Expr_statement:
			case BLOCK_LABEL:
			case COPYLOB:
			case DOT_COMMENT:
			case CLASS:
			case CONSTRUCTOR:
			case INTERFACE:
			case METHOD:
			case THISOBJECT:
			case DESTRUCTOR:
			case ANNOTATION:
			case CATCH:
			case FINALLY:
			case ROUTINELEVEL:
			case Assign_dynamic_new:
			{
				blockorstate(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2032;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t2029;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void inputclearstate(AST _t) throws RecognitionException {
		
		AST inputclearstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2051 = _t;
		AST tmp2077_AST_in = (AST)_t;
		match(_t,INPUT);
		_t = _t.getFirstChild();
		AST tmp2078_AST_in = (AST)_t;
		match(_t,CLEAR);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t2051;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void inputclosestate(AST _t) throws RecognitionException {
		
		AST inputclosestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2053 = _t;
		AST tmp2079_AST_in = (AST)_t;
		match(_t,INPUT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case CLOSE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp2080_AST_in = (AST)_t;
		match(_t,CLOSE);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t2053;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void inputfromstate(AST _t) throws RecognitionException {
		
		AST inputfromstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2056 = _t;
		AST tmp2081_AST_in = (AST)_t;
		match(_t,INPUT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case FROM:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp2082_AST_in = (AST)_t;
		match(_t,FROM);
		_t = _t.getNextSibling();
		io_phrase(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t2056;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void inputthroughstate(AST _t) throws RecognitionException {
		
		AST inputthroughstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2059 = _t;
		AST tmp2083_AST_in = (AST)_t;
		match(_t,INPUT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case THROUGH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp2084_AST_in = (AST)_t;
		match(_t,THROUGH);
		_t = _t.getNextSibling();
		io_phrase(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t2059;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void inputoutputclosestate(AST _t) throws RecognitionException {
		
		AST inputoutputclosestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2062 = _t;
		AST tmp2085_AST_in = (AST)_t;
		match(_t,INPUTOUTPUT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case CLOSE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp2086_AST_in = (AST)_t;
		match(_t,CLOSE);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t2062;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void inputoutputthroughstate(AST _t) throws RecognitionException {
		
		AST inputoutputthroughstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2065 = _t;
		AST tmp2087_AST_in = (AST)_t;
		match(_t,INPUTOUTPUT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case THROUGH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp2088_AST_in = (AST)_t;
		match(_t,THROUGH);
		_t = _t.getNextSibling();
		io_phrase(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t2065;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void interfacestate(AST _t) throws RecognitionException {
		
		AST interfacestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2068 = _t;
		AST tmp2089_AST_in = (AST)_t;
		match(_t,INTERFACE);
		_t = _t.getFirstChild();
		AST tmp2090_AST_in = (AST)_t;
		match(_t,TYPE_NAME);
		_t = _t.getNextSibling();
		block_colon(_t);
		_t = _retTree;
		code_block(_t);
		_t = _retTree;
		AST __t2069 = _t;
		AST tmp2091_AST_in = (AST)_t;
		match(_t,END);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case INTERFACE:
		{
			AST tmp2092_AST_in = (AST)_t;
			match(_t,INTERFACE);
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t2069;
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t2068;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void leavestate(AST _t) throws RecognitionException {
		
		AST leavestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2097 = _t;
		AST tmp2093_AST_in = (AST)_t;
		match(_t,LEAVE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BLOCK_LABEL:
		{
			AST tmp2094_AST_in = (AST)_t;
			match(_t,BLOCK_LABEL);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2097;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void loadstate(AST _t) throws RecognitionException {
		
		AST loadstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2102 = _t;
		AST tmp2095_AST_in = (AST)_t;
		match(_t,LOAD);
		_t = _t.getFirstChild();
		expression(_t);
		_t = _retTree;
		{
		_loop2106:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case DIR:
			{
				AST __t2104 = _t;
				AST tmp2096_AST_in = (AST)_t;
				match(_t,DIR);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2104;
				_t = _t.getNextSibling();
				break;
			}
			case APPLICATION:
			{
				AST tmp2097_AST_in = (AST)_t;
				match(_t,APPLICATION);
				_t = _t.getNextSibling();
				break;
			}
			case DYNAMIC:
			{
				AST tmp2098_AST_in = (AST)_t;
				match(_t,DYNAMIC);
				_t = _t.getNextSibling();
				break;
			}
			case NEW:
			{
				AST tmp2099_AST_in = (AST)_t;
				match(_t,NEW);
				_t = _t.getNextSibling();
				break;
			}
			case BASEKEY:
			{
				AST __t2105 = _t;
				AST tmp2100_AST_in = (AST)_t;
				match(_t,BASEKEY);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2105;
				_t = _t.getNextSibling();
				break;
			}
			case NOERROR_KW:
			{
				AST tmp2101_AST_in = (AST)_t;
				match(_t,NOERROR_KW);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop2106;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2102;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void nextstate(AST _t) throws RecognitionException {
		
		AST nextstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2115 = _t;
		AST tmp2102_AST_in = (AST)_t;
		match(_t,NEXT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BLOCK_LABEL:
		{
			AST tmp2103_AST_in = (AST)_t;
			match(_t,BLOCK_LABEL);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2115;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void openstate(AST _t) throws RecognitionException {
		
		AST openstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2509 = _t;
		AST tmp2104_AST_in = (AST)_t;
		match(_t,OPEN);
		_t = _t.getFirstChild();
		AST tmp2105_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t2509;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void osappendstate(AST _t) throws RecognitionException {
		
		AST osappendstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2138 = _t;
		AST tmp2106_AST_in = (AST)_t;
		match(_t,OSAPPEND);
		_t = _t.getFirstChild();
		filenameorvalue(_t);
		_t = _retTree;
		filenameorvalue(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t2138;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void oscommandstate(AST _t) throws RecognitionException {
		
		AST oscommandstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case OS400:
		{
			AST __t2140 = _t;
			AST tmp2107_AST_in = (AST)_t;
			match(_t,OS400);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SILENT:
			{
				AST tmp2108_AST_in = (AST)_t;
				match(_t,SILENT);
				_t = _t.getNextSibling();
				break;
			}
			case NOWAIT:
			{
				AST tmp2109_AST_in = (AST)_t;
				match(_t,NOWAIT);
				_t = _t.getNextSibling();
				break;
			}
			case NOCONSOLE:
			{
				AST tmp2110_AST_in = (AST)_t;
				match(_t,NOCONSOLE);
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case VALUE:
			case TYPELESS_TOKEN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			_loop2143:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==VALUE||_t.getType()==TYPELESS_TOKEN)) {
					anyorvalue(_t);
					_t = _retTree;
				}
				else {
					break _loop2143;
				}
				
			} while (true);
			}
			state_end(_t);
			_t = _retTree;
			_t = __t2140;
			_t = _t.getNextSibling();
			break;
		}
		case BTOS:
		{
			AST __t2144 = _t;
			AST tmp2111_AST_in = (AST)_t;
			match(_t,BTOS);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SILENT:
			{
				AST tmp2112_AST_in = (AST)_t;
				match(_t,SILENT);
				_t = _t.getNextSibling();
				break;
			}
			case NOWAIT:
			{
				AST tmp2113_AST_in = (AST)_t;
				match(_t,NOWAIT);
				_t = _t.getNextSibling();
				break;
			}
			case NOCONSOLE:
			{
				AST tmp2114_AST_in = (AST)_t;
				match(_t,NOCONSOLE);
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case VALUE:
			case TYPELESS_TOKEN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			_loop2147:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==VALUE||_t.getType()==TYPELESS_TOKEN)) {
					anyorvalue(_t);
					_t = _retTree;
				}
				else {
					break _loop2147;
				}
				
			} while (true);
			}
			state_end(_t);
			_t = _retTree;
			_t = __t2144;
			_t = _t.getNextSibling();
			break;
		}
		case DOS:
		{
			AST __t2148 = _t;
			AST tmp2115_AST_in = (AST)_t;
			match(_t,DOS);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SILENT:
			{
				AST tmp2116_AST_in = (AST)_t;
				match(_t,SILENT);
				_t = _t.getNextSibling();
				break;
			}
			case NOWAIT:
			{
				AST tmp2117_AST_in = (AST)_t;
				match(_t,NOWAIT);
				_t = _t.getNextSibling();
				break;
			}
			case NOCONSOLE:
			{
				AST tmp2118_AST_in = (AST)_t;
				match(_t,NOCONSOLE);
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case VALUE:
			case TYPELESS_TOKEN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			_loop2151:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==VALUE||_t.getType()==TYPELESS_TOKEN)) {
					anyorvalue(_t);
					_t = _retTree;
				}
				else {
					break _loop2151;
				}
				
			} while (true);
			}
			state_end(_t);
			_t = _retTree;
			_t = __t2148;
			_t = _t.getNextSibling();
			break;
		}
		case MPE:
		{
			AST __t2152 = _t;
			AST tmp2119_AST_in = (AST)_t;
			match(_t,MPE);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SILENT:
			{
				AST tmp2120_AST_in = (AST)_t;
				match(_t,SILENT);
				_t = _t.getNextSibling();
				break;
			}
			case NOWAIT:
			{
				AST tmp2121_AST_in = (AST)_t;
				match(_t,NOWAIT);
				_t = _t.getNextSibling();
				break;
			}
			case NOCONSOLE:
			{
				AST tmp2122_AST_in = (AST)_t;
				match(_t,NOCONSOLE);
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case VALUE:
			case TYPELESS_TOKEN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			_loop2155:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==VALUE||_t.getType()==TYPELESS_TOKEN)) {
					anyorvalue(_t);
					_t = _retTree;
				}
				else {
					break _loop2155;
				}
				
			} while (true);
			}
			state_end(_t);
			_t = _retTree;
			_t = __t2152;
			_t = _t.getNextSibling();
			break;
		}
		case OS2:
		{
			AST __t2156 = _t;
			AST tmp2123_AST_in = (AST)_t;
			match(_t,OS2);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SILENT:
			{
				AST tmp2124_AST_in = (AST)_t;
				match(_t,SILENT);
				_t = _t.getNextSibling();
				break;
			}
			case NOWAIT:
			{
				AST tmp2125_AST_in = (AST)_t;
				match(_t,NOWAIT);
				_t = _t.getNextSibling();
				break;
			}
			case NOCONSOLE:
			{
				AST tmp2126_AST_in = (AST)_t;
				match(_t,NOCONSOLE);
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case VALUE:
			case TYPELESS_TOKEN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			_loop2159:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==VALUE||_t.getType()==TYPELESS_TOKEN)) {
					anyorvalue(_t);
					_t = _retTree;
				}
				else {
					break _loop2159;
				}
				
			} while (true);
			}
			state_end(_t);
			_t = _retTree;
			_t = __t2156;
			_t = _t.getNextSibling();
			break;
		}
		case OSCOMMAND:
		{
			AST __t2160 = _t;
			AST tmp2127_AST_in = (AST)_t;
			match(_t,OSCOMMAND);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SILENT:
			{
				AST tmp2128_AST_in = (AST)_t;
				match(_t,SILENT);
				_t = _t.getNextSibling();
				break;
			}
			case NOWAIT:
			{
				AST tmp2129_AST_in = (AST)_t;
				match(_t,NOWAIT);
				_t = _t.getNextSibling();
				break;
			}
			case NOCONSOLE:
			{
				AST tmp2130_AST_in = (AST)_t;
				match(_t,NOCONSOLE);
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case VALUE:
			case TYPELESS_TOKEN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			_loop2163:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==VALUE||_t.getType()==TYPELESS_TOKEN)) {
					anyorvalue(_t);
					_t = _retTree;
				}
				else {
					break _loop2163;
				}
				
			} while (true);
			}
			state_end(_t);
			_t = _retTree;
			_t = __t2160;
			_t = _t.getNextSibling();
			break;
		}
		case UNIX:
		{
			AST __t2164 = _t;
			AST tmp2131_AST_in = (AST)_t;
			match(_t,UNIX);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SILENT:
			{
				AST tmp2132_AST_in = (AST)_t;
				match(_t,SILENT);
				_t = _t.getNextSibling();
				break;
			}
			case NOWAIT:
			{
				AST tmp2133_AST_in = (AST)_t;
				match(_t,NOWAIT);
				_t = _t.getNextSibling();
				break;
			}
			case NOCONSOLE:
			{
				AST tmp2134_AST_in = (AST)_t;
				match(_t,NOCONSOLE);
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case VALUE:
			case TYPELESS_TOKEN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			_loop2167:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==VALUE||_t.getType()==TYPELESS_TOKEN)) {
					anyorvalue(_t);
					_t = _retTree;
				}
				else {
					break _loop2167;
				}
				
			} while (true);
			}
			state_end(_t);
			_t = _retTree;
			_t = __t2164;
			_t = _t.getNextSibling();
			break;
		}
		case VMS:
		{
			AST __t2168 = _t;
			AST tmp2135_AST_in = (AST)_t;
			match(_t,VMS);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SILENT:
			{
				AST tmp2136_AST_in = (AST)_t;
				match(_t,SILENT);
				_t = _t.getNextSibling();
				break;
			}
			case NOWAIT:
			{
				AST tmp2137_AST_in = (AST)_t;
				match(_t,NOWAIT);
				_t = _t.getNextSibling();
				break;
			}
			case NOCONSOLE:
			{
				AST tmp2138_AST_in = (AST)_t;
				match(_t,NOCONSOLE);
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case VALUE:
			case TYPELESS_TOKEN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			_loop2171:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==VALUE||_t.getType()==TYPELESS_TOKEN)) {
					anyorvalue(_t);
					_t = _retTree;
				}
				else {
					break _loop2171;
				}
				
			} while (true);
			}
			state_end(_t);
			_t = _retTree;
			_t = __t2168;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void oscopystate(AST _t) throws RecognitionException {
		
		AST oscopystate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2173 = _t;
		AST tmp2139_AST_in = (AST)_t;
		match(_t,OSCOPY);
		_t = _t.getFirstChild();
		filenameorvalue(_t);
		_t = _retTree;
		filenameorvalue(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t2173;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void oscreatedirstate(AST _t) throws RecognitionException {
		
		AST oscreatedirstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2175 = _t;
		AST tmp2140_AST_in = (AST)_t;
		match(_t,OSCREATEDIR);
		_t = _t.getFirstChild();
		{
		int _cnt2177=0;
		_loop2177:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==VALUE||_t.getType()==TYPELESS_TOKEN)) {
				anyorvalue(_t);
				_t = _retTree;
			}
			else {
				if ( _cnt2177>=1 ) { break _loop2177; } else {throw new NoViableAltException(_t);}
			}
			
			_cnt2177++;
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2175;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void osdeletestate(AST _t) throws RecognitionException {
		
		AST osdeletestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2179 = _t;
		AST tmp2141_AST_in = (AST)_t;
		match(_t,OSDELETE);
		_t = _t.getFirstChild();
		{
		int _cnt2182=0;
		_loop2182:
		do {
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==VALUE)) {
				valueexpression(_t);
				_t = _retTree;
			}
			else if ((_tokenSet_39.member(_t.getType()))) {
				{
				AST tmp2142_AST_in = (AST)_t;
				match(_t,_tokenSet_39);
				_t = _t.getNextSibling();
				}
			}
			else {
				if ( _cnt2182>=1 ) { break _loop2182; } else {throw new NoViableAltException(_t);}
			}
			
			_cnt2182++;
		} while (true);
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RECURSIVE:
		{
			AST tmp2143_AST_in = (AST)_t;
			match(_t,RECURSIVE);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2179;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void osrenamestate(AST _t) throws RecognitionException {
		
		AST osrenamestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2185 = _t;
		AST tmp2144_AST_in = (AST)_t;
		match(_t,OSRENAME);
		_t = _t.getFirstChild();
		filenameorvalue(_t);
		_t = _retTree;
		filenameorvalue(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t2185;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void outputclosestate(AST _t) throws RecognitionException {
		
		AST outputclosestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2187 = _t;
		AST tmp2145_AST_in = (AST)_t;
		match(_t,OUTPUT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case CLOSE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp2146_AST_in = (AST)_t;
		match(_t,CLOSE);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t2187;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void outputthroughstate(AST _t) throws RecognitionException {
		
		AST outputthroughstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2190 = _t;
		AST tmp2147_AST_in = (AST)_t;
		match(_t,OUTPUT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case THROUGH:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp2148_AST_in = (AST)_t;
		match(_t,THROUGH);
		_t = _t.getNextSibling();
		io_phrase(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t2190;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void outputtostate(AST _t) throws RecognitionException {
		
		AST outputtostate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2193 = _t;
		AST tmp2149_AST_in = (AST)_t;
		match(_t,OUTPUT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case TO:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp2150_AST_in = (AST)_t;
		match(_t,TO);
		_t = _t.getNextSibling();
		io_phrase(_t);
		_t = _retTree;
		state_end(_t);
		_t = _retTree;
		_t = __t2193;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void pagestate(AST _t) throws RecognitionException {
		
		AST pagestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2196 = _t;
		AST tmp2151_AST_in = (AST)_t;
		match(_t,PAGE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2196;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void pausestate(AST _t) throws RecognitionException {
		
		AST pausestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2199 = _t;
		AST tmp2152_AST_in = (AST)_t;
		match(_t,PAUSE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else if ((_tokenSet_40.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		_loop2204:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case BEFOREHIDE:
			{
				AST tmp2153_AST_in = (AST)_t;
				match(_t,BEFOREHIDE);
				_t = _t.getNextSibling();
				break;
			}
			case MESSAGE:
			{
				AST __t2202 = _t;
				AST tmp2154_AST_in = (AST)_t;
				match(_t,MESSAGE);
				_t = _t.getFirstChild();
				constant(_t);
				_t = _retTree;
				_t = __t2202;
				_t = _t.getNextSibling();
				break;
			}
			case NOMESSAGE:
			{
				AST tmp2155_AST_in = (AST)_t;
				match(_t,NOMESSAGE);
				_t = _t.getNextSibling();
				break;
			}
			case IN_KW:
			{
				AST __t2203 = _t;
				AST tmp2156_AST_in = (AST)_t;
				match(_t,IN_KW);
				_t = _t.getFirstChild();
				AST tmp2157_AST_in = (AST)_t;
				match(_t,WINDOW);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				_t = __t2203;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop2204;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2199;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void processeventsstate(AST _t) throws RecognitionException {
		
		AST processeventsstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2206 = _t;
		AST tmp2158_AST_in = (AST)_t;
		match(_t,PROCESS);
		_t = _t.getFirstChild();
		AST tmp2159_AST_in = (AST)_t;
		match(_t,EVENTS);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t2206;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void putstate(AST _t) throws RecognitionException {
		
		AST putstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2208 = _t;
		AST tmp2160_AST_in = (AST)_t;
		match(_t,PUT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==STREAM||_t.getType()==STREAMHANDLE)) {
			stream_name_or_handle(_t);
			_t = _retTree;
		}
		else if ((_tokenSet_41.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CONTROL:
		{
			AST tmp2161_AST_in = (AST)_t;
			match(_t,CONTROL);
			_t = _t.getNextSibling();
			break;
		}
		case UNFORMATTED:
		{
			AST tmp2162_AST_in = (AST)_t;
			match(_t,UNFORMATTED);
			_t = _t.getNextSibling();
			break;
		}
		default:
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_42.member(_t.getType()))) {
			}
		else {
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop2223:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SKIP:
			{
				skipphrase(_t);
				_t = _retTree;
				break;
			}
			case SPACE:
			{
				spacephrase(_t);
				_t = _retTree;
				break;
			}
			default:
				boolean synPredMatched2215 = false;
				if (_t==null) _t=ASTNULL;
				if (((_t.getType()==NULL_KW))) {
					AST __t2215 = _t;
					synPredMatched2215 = true;
					inputState.guessing++;
					try {
						{
						AST __t2213 = _t;
						AST tmp2163_AST_in = (AST)_t;
						match(_t,NULL_KW);
						_t = _t.getFirstChild();
						{
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case LEFTPAREN:
						{
							AST tmp2164_AST_in = (AST)_t;
							match(_t,LEFTPAREN);
							_t = _t.getNextSibling();
							break;
						}
						case 3:
						{
							break;
						}
						default:
						{
							throw new NoViableAltException(_t);
						}
						}
						}
						_t = __t2213;
						_t = _t.getNextSibling();
						}
					}
					catch (RecognitionException pe) {
						synPredMatched2215 = false;
					}
					_t = __t2215;
inputState.guessing--;
				}
				if ( synPredMatched2215 ) {
					AST __t2216 = _t;
					AST tmp2165_AST_in = (AST)_t;
					match(_t,NULL_KW);
					_t = _t.getFirstChild();
					{
					if (_t==null) _t=ASTNULL;
					switch ( _t.getType()) {
					case LEFTPAREN:
					{
						funargs(_t);
						_t = _retTree;
						break;
					}
					case 3:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(_t);
					}
					}
					}
					_t = __t2216;
					_t = _t.getNextSibling();
				}
				else if ((_tokenSet_3.member(_t.getType()))) {
					expression(_t);
					_t = _retTree;
					{
					_loop2222:
					do {
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case FORMAT:
						{
							AST __t2219 = _t;
							AST tmp2166_AST_in = (AST)_t;
							match(_t,FORMAT);
							_t = _t.getFirstChild();
							expression(_t);
							_t = _retTree;
							_t = __t2219;
							_t = _t.getNextSibling();
							break;
						}
						case AT:
						{
							AST __t2220 = _t;
							AST tmp2167_AST_in = (AST)_t;
							match(_t,AT);
							_t = _t.getFirstChild();
							expression(_t);
							_t = _retTree;
							_t = __t2220;
							_t = _t.getNextSibling();
							break;
						}
						case TO:
						{
							AST __t2221 = _t;
							AST tmp2168_AST_in = (AST)_t;
							match(_t,TO);
							_t = _t.getFirstChild();
							expression(_t);
							_t = _retTree;
							_t = __t2221;
							_t = _t.getNextSibling();
							break;
						}
						default:
						{
							break _loop2222;
						}
						}
					} while (true);
					}
				}
			else {
				break _loop2223;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2208;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void putcursorstate(AST _t) throws RecognitionException {
		
		AST putcursorstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2225 = _t;
		AST tmp2169_AST_in = (AST)_t;
		match(_t,PUT);
		_t = _t.getFirstChild();
		AST tmp2170_AST_in = (AST)_t;
		match(_t,CURSOR);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case OFF:
		{
			AST tmp2171_AST_in = (AST)_t;
			match(_t,OFF);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case COLUMN:
		case ROW:
		{
			{
			_loop2230:
			do {
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case ROW:
				{
					AST __t2228 = _t;
					AST tmp2172_AST_in = (AST)_t;
					match(_t,ROW);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t2228;
					_t = _t.getNextSibling();
					break;
				}
				case COLUMN:
				{
					AST __t2229 = _t;
					AST tmp2173_AST_in = (AST)_t;
					match(_t,COLUMN);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t2229;
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					break _loop2230;
				}
				}
			} while (true);
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2225;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void putscreenstate(AST _t) throws RecognitionException {
		
		AST putscreenstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2232 = _t;
		AST tmp2174_AST_in = (AST)_t;
		match(_t,PUT);
		_t = _t.getFirstChild();
		AST tmp2175_AST_in = (AST)_t;
		match(_t,SCREEN);
		_t = _t.getNextSibling();
		{
		_loop2237:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ATTRSPACE:
			{
				AST tmp2176_AST_in = (AST)_t;
				match(_t,ATTRSPACE);
				_t = _t.getNextSibling();
				break;
			}
			case NOATTRSPACE:
			{
				AST tmp2177_AST_in = (AST)_t;
				match(_t,NOATTRSPACE);
				_t = _t.getNextSibling();
				break;
			}
			case COLOR:
			{
				AST __t2234 = _t;
				AST tmp2178_AST_in = (AST)_t;
				match(_t,COLOR);
				_t = _t.getFirstChild();
				anyorvalue(_t);
				_t = _retTree;
				_t = __t2234;
				_t = _t.getNextSibling();
				break;
			}
			case COLUMN:
			{
				AST __t2235 = _t;
				AST tmp2179_AST_in = (AST)_t;
				match(_t,COLUMN);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2235;
				_t = _t.getNextSibling();
				break;
			}
			case ROW:
			{
				AST __t2236 = _t;
				AST tmp2180_AST_in = (AST)_t;
				match(_t,ROW);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2236;
				_t = _t.getNextSibling();
				break;
			}
			default:
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_3.member(_t.getType()))) {
					expression(_t);
					_t = _retTree;
				}
			else {
				break _loop2237;
			}
			}
		} while (true);
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2232;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void putkeyvaluestate(AST _t) throws RecognitionException {
		
		AST putkeyvaluestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2239 = _t;
		AST tmp2181_AST_in = (AST)_t;
		match(_t,PUTKEYVALUE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case SECTION:
		{
			AST tmp2182_AST_in = (AST)_t;
			match(_t,SECTION);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			AST tmp2183_AST_in = (AST)_t;
			match(_t,KEY);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==DEFAULT)) {
				AST tmp2184_AST_in = (AST)_t;
				match(_t,DEFAULT);
				_t = _t.getNextSibling();
			}
			else if ((_tokenSet_3.member(_t.getType()))) {
				expression(_t);
				_t = _retTree;
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			AST tmp2185_AST_in = (AST)_t;
			match(_t,VALUE);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			break;
		}
		case COLOR:
		case FONT:
		{
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case COLOR:
			{
				AST tmp2186_AST_in = (AST)_t;
				match(_t,COLOR);
				_t = _t.getNextSibling();
				break;
			}
			case FONT:
			{
				AST tmp2187_AST_in = (AST)_t;
				match(_t,FONT);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_3.member(_t.getType()))) {
				expression(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==ALL)) {
				AST tmp2188_AST_in = (AST)_t;
				match(_t,ALL);
				_t = _t.getNextSibling();
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2189_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2239;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void quitstate(AST _t) throws RecognitionException {
		
		AST quitstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2255 = _t;
		AST tmp2190_AST_in = (AST)_t;
		match(_t,QUIT);
		_t = _t.getFirstChild();
		state_end(_t);
		_t = _retTree;
		_t = __t2255;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void readkeystate(AST _t) throws RecognitionException {
		
		AST readkeystate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2273 = _t;
		AST tmp2191_AST_in = (AST)_t;
		match(_t,READKEY);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		case EOF:
		case PERIOD:
		case PAUSE:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case PAUSE:
		{
			AST __t2276 = _t;
			AST tmp2192_AST_in = (AST)_t;
			match(_t,PAUSE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2276;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2273;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void releaseexternalstate(AST _t) throws RecognitionException {
		
		AST releaseexternalstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2278 = _t;
		AST tmp2193_AST_in = (AST)_t;
		match(_t,RELEASE);
		_t = _t.getFirstChild();
		AST tmp2194_AST_in = (AST)_t;
		match(_t,EXTERNAL);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==PROCEDURE)) {
			AST tmp2195_AST_in = (AST)_t;
			match(_t,PROCEDURE);
			_t = _t.getNextSibling();
		}
		else if ((_tokenSet_3.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2196_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2278;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void releaseobjectstate(AST _t) throws RecognitionException {
		
		AST releaseobjectstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2282 = _t;
		AST tmp2197_AST_in = (AST)_t;
		match(_t,RELEASE);
		_t = _t.getFirstChild();
		AST tmp2198_AST_in = (AST)_t;
		match(_t,OBJECT);
		_t = _t.getNextSibling();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2199_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2282;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void repositionstate(AST _t) throws RecognitionException {
		
		AST repositionstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2285 = _t;
		AST tmp2200_AST_in = (AST)_t;
		match(_t,REPOSITION);
		_t = _t.getFirstChild();
		AST tmp2201_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TO:
		{
			AST __t2287 = _t;
			AST tmp2202_AST_in = (AST)_t;
			match(_t,TO);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ROWID:
			{
				AST tmp2203_AST_in = (AST)_t;
				match(_t,ROWID);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				{
				_loop2290:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COMMA)) {
						AST tmp2204_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						expression(_t);
						_t = _retTree;
					}
					else {
						break _loop2290;
					}
					
				} while (true);
				}
				break;
			}
			case RECID:
			{
				AST tmp2205_AST_in = (AST)_t;
				match(_t,RECID);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				break;
			}
			case ROW:
			{
				AST tmp2206_AST_in = (AST)_t;
				match(_t,ROW);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2287;
			_t = _t.getNextSibling();
			break;
		}
		case ROW:
		{
			AST __t2291 = _t;
			AST tmp2207_AST_in = (AST)_t;
			match(_t,ROW);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2291;
			_t = _t.getNextSibling();
			break;
		}
		case FORWARDS:
		{
			AST __t2292 = _t;
			AST tmp2208_AST_in = (AST)_t;
			match(_t,FORWARDS);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2292;
			_t = _t.getNextSibling();
			break;
		}
		case BACKWARDS:
		{
			AST __t2293 = _t;
			AST tmp2209_AST_in = (AST)_t;
			match(_t,BACKWARDS);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2293;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2210_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2285;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void returnstate(AST _t) throws RecognitionException {
		
		AST returnstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2296 = _t;
		AST tmp2211_AST_in = (AST)_t;
		match(_t,RETURN);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		if ((_tokenSet_2.member(_t.getType()))) {
			return_options(_t);
			_t = _retTree;
		}
		else if ((_t.getType()==EOF||_t.getType()==PERIOD)) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2296;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void routinelevelstate(AST _t) throws RecognitionException {
		
		AST routinelevelstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2308 = _t;
		AST tmp2212_AST_in = (AST)_t;
		match(_t,ROUTINELEVEL);
		_t = _t.getFirstChild();
		AST tmp2213_AST_in = (AST)_t;
		match(_t,ON);
		_t = _t.getNextSibling();
		AST tmp2214_AST_in = (AST)_t;
		match(_t,ERROR);
		_t = _t.getNextSibling();
		AST tmp2215_AST_in = (AST)_t;
		match(_t,UNDO);
		_t = _t.getNextSibling();
		AST tmp2216_AST_in = (AST)_t;
		match(_t,COMMA);
		_t = _t.getNextSibling();
		AST tmp2217_AST_in = (AST)_t;
		match(_t,THROW);
		_t = _t.getNextSibling();
		state_end(_t);
		_t = _retTree;
		_t = __t2308;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void savecachestate(AST _t) throws RecognitionException {
		
		AST savecachestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2310 = _t;
		AST tmp2218_AST_in = (AST)_t;
		match(_t,SAVE);
		_t = _t.getFirstChild();
		AST tmp2219_AST_in = (AST)_t;
		match(_t,CACHE);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CURRENT:
		{
			AST tmp2220_AST_in = (AST)_t;
			match(_t,CURRENT);
			_t = _t.getNextSibling();
			break;
		}
		case COMPLETE:
		{
			AST tmp2221_AST_in = (AST)_t;
			match(_t,COMPLETE);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		anyorvalue(_t);
		_t = _retTree;
		AST tmp2222_AST_in = (AST)_t;
		match(_t,TO);
		_t = _t.getNextSibling();
		filenameorvalue(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2223_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2310;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void seekstate(AST _t) throws RecognitionException {
		
		AST seekstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2314 = _t;
		AST tmp2224_AST_in = (AST)_t;
		match(_t,SEEK);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case INPUT:
		{
			AST tmp2225_AST_in = (AST)_t;
			match(_t,INPUT);
			_t = _t.getNextSibling();
			break;
		}
		case OUTPUT:
		{
			AST tmp2226_AST_in = (AST)_t;
			match(_t,OUTPUT);
			_t = _t.getNextSibling();
			break;
		}
		case STREAM:
		case STREAMHANDLE:
		{
			stream_name_or_handle(_t);
			_t = _retTree;
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp2227_AST_in = (AST)_t;
		match(_t,TO);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else if ((_t.getType()==END)) {
			AST tmp2228_AST_in = (AST)_t;
			match(_t,END);
			_t = _t.getNextSibling();
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2314;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void showstatsstate(AST _t) throws RecognitionException {
		
		AST showstatsstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2330 = _t;
		AST tmp2229_AST_in = (AST)_t;
		match(_t,SHOWSTATS);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CLEAR:
		{
			AST tmp2230_AST_in = (AST)_t;
			match(_t,CLEAR);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2330;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void statusstate(AST _t) throws RecognitionException {
		
		AST statusstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2354 = _t;
		AST tmp2231_AST_in = (AST)_t;
		match(_t,STATUS);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case DEFAULT:
		{
			AST __t2356 = _t;
			AST tmp2232_AST_in = (AST)_t;
			match(_t,DEFAULT);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_3.member(_t.getType()))) {
				expression(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==3)) {
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t2356;
			_t = _t.getNextSibling();
			break;
		}
		case INPUT:
		{
			AST __t2358 = _t;
			AST tmp2233_AST_in = (AST)_t;
			match(_t,INPUT);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case OFF:
			{
				AST tmp2234_AST_in = (AST)_t;
				match(_t,OFF);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_3.member(_t.getType()))) {
					expression(_t);
					_t = _retTree;
				}
			else {
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2358;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t2361 = _t;
			AST tmp2235_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			AST tmp2236_AST_in = (AST)_t;
			match(_t,WINDOW);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t2361;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2354;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void stopstate(AST _t) throws RecognitionException {
		
		AST stopstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2363 = _t;
		AST tmp2237_AST_in = (AST)_t;
		match(_t,STOP);
		_t = _t.getFirstChild();
		state_end(_t);
		_t = _retTree;
		_t = __t2363;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void subscribestate(AST _t) throws RecognitionException {
		
		AST subscribestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2368 = _t;
		AST tmp2238_AST_in = (AST)_t;
		match(_t,SUBSCRIBE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==PROCEDURE)) {
			AST __t2370 = _t;
			AST tmp2239_AST_in = (AST)_t;
			match(_t,PROCEDURE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2370;
			_t = _t.getNextSibling();
		}
		else if ((_tokenSet_43.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==TO)) {
			AST tmp2240_AST_in = (AST)_t;
			match(_t,TO);
			_t = _t.getNextSibling();
		}
		else if ((_tokenSet_3.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ANYWHERE:
		{
			AST tmp2241_AST_in = (AST)_t;
			match(_t,ANYWHERE);
			_t = _t.getNextSibling();
			break;
		}
		case IN_KW:
		{
			AST __t2373 = _t;
			AST tmp2242_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2373;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case RUNPROCEDURE:
		{
			AST __t2375 = _t;
			AST tmp2243_AST_in = (AST)_t;
			match(_t,RUNPROCEDURE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2375;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case NOERROR_KW:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2244_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2368;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void systemhelpstate(AST _t) throws RecognitionException {
		
		AST systemhelpstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2380 = _t;
		AST tmp2245_AST_in = (AST)_t;
		match(_t,SYSTEMHELP);
		_t = _t.getFirstChild();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case WINDOWNAME:
		{
			AST __t2382 = _t;
			AST tmp2246_AST_in = (AST)_t;
			match(_t,WINDOWNAME);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2382;
			_t = _t.getNextSibling();
			break;
		}
		case ALTERNATEKEY:
		case COMMAND:
		case CONTENTS:
		case CONTEXT:
		case CONTEXTPOPUP:
		case FINDER:
		case FORCEFILE:
		case HELP:
		case HELPTOPIC:
		case KEY:
		case MULTIPLEKEY:
		case PARTIALKEY:
		case POSITION:
		case QUIT:
		case SETCONTENTS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ALTERNATEKEY:
		{
			AST __t2384 = _t;
			AST tmp2247_AST_in = (AST)_t;
			match(_t,ALTERNATEKEY);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2384;
			_t = _t.getNextSibling();
			break;
		}
		case CONTEXT:
		{
			AST __t2385 = _t;
			AST tmp2248_AST_in = (AST)_t;
			match(_t,CONTEXT);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2385;
			_t = _t.getNextSibling();
			break;
		}
		case CONTENTS:
		{
			AST tmp2249_AST_in = (AST)_t;
			match(_t,CONTENTS);
			_t = _t.getNextSibling();
			break;
		}
		case SETCONTENTS:
		{
			AST __t2386 = _t;
			AST tmp2250_AST_in = (AST)_t;
			match(_t,SETCONTENTS);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2386;
			_t = _t.getNextSibling();
			break;
		}
		case FINDER:
		{
			AST tmp2251_AST_in = (AST)_t;
			match(_t,FINDER);
			_t = _t.getNextSibling();
			break;
		}
		case CONTEXTPOPUP:
		{
			AST __t2387 = _t;
			AST tmp2252_AST_in = (AST)_t;
			match(_t,CONTEXTPOPUP);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2387;
			_t = _t.getNextSibling();
			break;
		}
		case HELPTOPIC:
		{
			AST __t2388 = _t;
			AST tmp2253_AST_in = (AST)_t;
			match(_t,HELPTOPIC);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2388;
			_t = _t.getNextSibling();
			break;
		}
		case KEY:
		{
			AST __t2389 = _t;
			AST tmp2254_AST_in = (AST)_t;
			match(_t,KEY);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2389;
			_t = _t.getNextSibling();
			break;
		}
		case PARTIALKEY:
		{
			AST __t2390 = _t;
			AST tmp2255_AST_in = (AST)_t;
			match(_t,PARTIALKEY);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			if ((_tokenSet_3.member(_t.getType()))) {
				expression(_t);
				_t = _retTree;
			}
			else if ((_t.getType()==3)) {
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t2390;
			_t = _t.getNextSibling();
			break;
		}
		case MULTIPLEKEY:
		{
			AST __t2392 = _t;
			AST tmp2256_AST_in = (AST)_t;
			match(_t,MULTIPLEKEY);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			AST tmp2257_AST_in = (AST)_t;
			match(_t,TEXT);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			_t = __t2392;
			_t = _t.getNextSibling();
			break;
		}
		case COMMAND:
		{
			AST __t2393 = _t;
			AST tmp2258_AST_in = (AST)_t;
			match(_t,COMMAND);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2393;
			_t = _t.getNextSibling();
			break;
		}
		case POSITION:
		{
			AST __t2394 = _t;
			AST tmp2259_AST_in = (AST)_t;
			match(_t,POSITION);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case MAXIMIZE:
			{
				AST tmp2260_AST_in = (AST)_t;
				match(_t,MAXIMIZE);
				_t = _t.getNextSibling();
				break;
			}
			case X:
			{
				AST tmp2261_AST_in = (AST)_t;
				match(_t,X);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				AST tmp2262_AST_in = (AST)_t;
				match(_t,Y);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				AST tmp2263_AST_in = (AST)_t;
				match(_t,WIDTH);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				AST tmp2264_AST_in = (AST)_t;
				match(_t,HEIGHT);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2394;
			_t = _t.getNextSibling();
			break;
		}
		case FORCEFILE:
		{
			AST tmp2265_AST_in = (AST)_t;
			match(_t,FORCEFILE);
			_t = _t.getNextSibling();
			break;
		}
		case HELP:
		{
			AST tmp2266_AST_in = (AST)_t;
			match(_t,HELP);
			_t = _t.getNextSibling();
			break;
		}
		case QUIT:
		{
			AST tmp2267_AST_in = (AST)_t;
			match(_t,QUIT);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2380;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void transactionmodeautomaticstate(AST _t) throws RecognitionException {
		
		AST transactionmodeautomaticstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2414 = _t;
		AST tmp2268_AST_in = (AST)_t;
		match(_t,TRANSACTIONMODE);
		_t = _t.getFirstChild();
		AST tmp2269_AST_in = (AST)_t;
		match(_t,AUTOMATIC);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case CHAINED:
		{
			AST tmp2270_AST_in = (AST)_t;
			match(_t,CHAINED);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2414;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void undostate(AST _t) throws RecognitionException {
		
		AST undostate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2417 = _t;
		AST tmp2271_AST_in = (AST)_t;
		match(_t,UNDO);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BLOCK_LABEL:
		{
			AST tmp2272_AST_in = (AST)_t;
			match(_t,BLOCK_LABEL);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case COMMA:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case COMMA:
		{
			AST tmp2273_AST_in = (AST)_t;
			match(_t,COMMA);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LEAVE:
			{
				AST __t2421 = _t;
				AST tmp2274_AST_in = (AST)_t;
				match(_t,LEAVE);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case BLOCK_LABEL:
				{
					AST tmp2275_AST_in = (AST)_t;
					match(_t,BLOCK_LABEL);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t2421;
				_t = _t.getNextSibling();
				break;
			}
			case NEXT:
			{
				AST __t2423 = _t;
				AST tmp2276_AST_in = (AST)_t;
				match(_t,NEXT);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case BLOCK_LABEL:
				{
					AST tmp2277_AST_in = (AST)_t;
					match(_t,BLOCK_LABEL);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t2423;
				_t = _t.getNextSibling();
				break;
			}
			case RETRY:
			{
				AST __t2425 = _t;
				AST tmp2278_AST_in = (AST)_t;
				match(_t,RETRY);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case BLOCK_LABEL:
				{
					AST tmp2279_AST_in = (AST)_t;
					match(_t,BLOCK_LABEL);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t2425;
				_t = _t.getNextSibling();
				break;
			}
			case RETURN:
			{
				AST __t2427 = _t;
				AST tmp2280_AST_in = (AST)_t;
				match(_t,RETURN);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_2.member(_t.getType()))) {
					return_options(_t);
					_t = _retTree;
				}
				else if ((_t.getType()==3)) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				_t = __t2427;
				_t = _t.getNextSibling();
				break;
			}
			case THROW:
			{
				AST __t2429 = _t;
				AST tmp2281_AST_in = (AST)_t;
				match(_t,THROW);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2429;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2417;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void unloadstate(AST _t) throws RecognitionException {
		
		AST unloadstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2431 = _t;
		AST tmp2282_AST_in = (AST)_t;
		match(_t,UNLOAD);
		_t = _t.getFirstChild();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2283_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2431;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void unsubscribestate(AST _t) throws RecognitionException {
		
		AST unsubscribestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2434 = _t;
		AST tmp2284_AST_in = (AST)_t;
		match(_t,UNSUBSCRIBE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==PROCEDURE)) {
			AST __t2436 = _t;
			AST tmp2285_AST_in = (AST)_t;
			match(_t,PROCEDURE);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2436;
			_t = _t.getNextSibling();
		}
		else if ((_tokenSet_44.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==TO)) {
			AST tmp2286_AST_in = (AST)_t;
			match(_t,TO);
			_t = _t.getNextSibling();
		}
		else if ((_tokenSet_45.member(_t.getType()))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else if ((_t.getType()==ALL)) {
			AST tmp2287_AST_in = (AST)_t;
			match(_t,ALL);
			_t = _t.getNextSibling();
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case IN_KW:
		{
			AST __t2440 = _t;
			AST tmp2288_AST_in = (AST)_t;
			match(_t,IN_KW);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t2440;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2434;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void usestate(AST _t) throws RecognitionException {
		
		AST usestate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2442 = _t;
		AST tmp2289_AST_in = (AST)_t;
		match(_t,USE);
		_t = _t.getFirstChild();
		expression(_t);
		_t = _retTree;
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case NOERROR_KW:
		{
			AST tmp2290_AST_in = (AST)_t;
			match(_t,NOERROR_KW);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2442;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void usingstate(AST _t) throws RecognitionException {
		
		AST usingstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2445 = _t;
		AST tmp2291_AST_in = (AST)_t;
		match(_t,USING);
		_t = _t.getFirstChild();
		AST tmp2292_AST_in = (AST)_t;
		match(_t,TYPE_NAME);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FROM:
		{
			AST __t2447 = _t;
			AST tmp2293_AST_in = (AST)_t;
			match(_t,FROM);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ASSEMBLY:
			{
				AST tmp2294_AST_in = (AST)_t;
				match(_t,ASSEMBLY);
				_t = _t.getNextSibling();
				break;
			}
			case PROPATH:
			{
				AST tmp2295_AST_in = (AST)_t;
				match(_t,PROPATH);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2447;
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2445;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void waitforstate(AST _t) throws RecognitionException {
		
		AST waitforstate_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2453 = _t;
		AST tmp2296_AST_in = (AST)_t;
		match(_t,WAITFOR);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Widget_ref:
		{
			widattr(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SET:
			{
				AST __t2456 = _t;
				AST tmp2297_AST_in = (AST)_t;
				match(_t,SET);
				_t = _t.getFirstChild();
				field(_t);
				_t = _retTree;
				_t = __t2456;
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		case Event_list:
		{
			eventlist(_t);
			_t = _retTree;
			AST tmp2298_AST_in = (AST)_t;
			match(_t,OF);
			_t = _t.getNextSibling();
			widgetlist(_t);
			_t = _retTree;
			{
			_loop2459:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==OR)) {
					AST __t2458 = _t;
					AST tmp2299_AST_in = (AST)_t;
					match(_t,OR);
					_t = _t.getFirstChild();
					eventlist(_t);
					_t = _retTree;
					AST tmp2300_AST_in = (AST)_t;
					match(_t,OF);
					_t = _t.getNextSibling();
					widgetlist(_t);
					_t = _retTree;
					_t = __t2458;
					_t = _t.getNextSibling();
				}
				else {
					break _loop2459;
				}
				
			} while (true);
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case FOCUS:
			{
				AST __t2461 = _t;
				AST tmp2301_AST_in = (AST)_t;
				match(_t,FOCUS);
				_t = _t.getFirstChild();
				gwidget(_t);
				_t = _retTree;
				_t = __t2461;
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case EXCLUSIVEWEBUSER:
			case PAUSE:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PAUSE:
			{
				AST __t2463 = _t;
				AST tmp2302_AST_in = (AST)_t;
				match(_t,PAUSE);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2463;
				_t = _t.getNextSibling();
				break;
			}
			case EOF:
			case PERIOD:
			case EXCLUSIVEWEBUSER:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case EXCLUSIVEWEBUSER:
			{
				AST tmp2303_AST_in = (AST)_t;
				match(_t,EXCLUSIVEWEBUSER);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_3.member(_t.getType()))) {
					expression(_t);
					_t = _retTree;
				}
				else if ((_t.getType()==EOF||_t.getType()==PERIOD)) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
				break;
			}
			case EOF:
			case PERIOD:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		state_end(_t);
		_t = _retTree;
		_t = __t2453;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void expressionorvalue(AST _t) throws RecognitionException {
		
		AST expressionorvalue_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		if ((_t.getType()==VALUE)) {
			valueexpression(_t);
			_t = _retTree;
		}
		else if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		_retTree = _t;
	}
	
	public final void field(AST _t) throws RecognitionException {
		
		AST field_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1646 = _t;
		AST tmp2304_AST_in = (AST)_t;
		match(_t,Field_ref);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case INPUT:
		{
			AST tmp2305_AST_in = (AST)_t;
			match(_t,INPUT);
			_t = _t.getNextSibling();
			break;
		}
		case BROWSE:
		case FRAME:
		case ID:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case FRAME:
		{
			AST __t1649 = _t;
			AST tmp2306_AST_in = (AST)_t;
			match(_t,FRAME);
			_t = _t.getFirstChild();
			AST tmp2307_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			_t = __t1649;
			_t = _t.getNextSibling();
			break;
		}
		case BROWSE:
		{
			AST __t1650 = _t;
			AST tmp2308_AST_in = (AST)_t;
			match(_t,BROWSE);
			_t = _t.getFirstChild();
			AST tmp2309_AST_in = (AST)_t;
			match(_t,ID);
			_t = _t.getNextSibling();
			_t = __t1650;
			_t = _t.getNextSibling();
			break;
		}
		case ID:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp2310_AST_in = (AST)_t;
		match(_t,ID);
		_t = _t.getNextSibling();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case Array_subscript:
		{
			array_subscript(_t);
			_t = _retTree;
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1646;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void io_phrase(AST _t) throws RecognitionException {
		
		AST io_phrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case OSDIR:
		{
			AST __t2073 = _t;
			AST tmp2311_AST_in = (AST)_t;
			match(_t,OSDIR);
			_t = _t.getFirstChild();
			AST tmp2312_AST_in = (AST)_t;
			match(_t,LEFTPAREN);
			_t = _t.getNextSibling();
			expression(_t);
			_t = _retTree;
			AST tmp2313_AST_in = (AST)_t;
			match(_t,RIGHTPAREN);
			_t = _t.getNextSibling();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NOATTRLIST:
			{
				AST tmp2314_AST_in = (AST)_t;
				match(_t,NOATTRLIST);
				_t = _t.getNextSibling();
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t2073;
			_t = _t.getNextSibling();
			break;
		}
		case PRINTER:
		{
			AST __t2075 = _t;
			AST tmp2315_AST_in = (AST)_t;
			match(_t,PRINTER);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			if ((_t.getType()==VALUE)) {
				valueexpression(_t);
				_t = _retTree;
			}
			else if (((_t.getType() >= LEXDATE && _t.getType() <= Last_Token_Number))) {
				AST tmp2316_AST_in = (AST)_t;
				if ( _t==null ) throw new MismatchedTokenException();
				_t = _t.getNextSibling();
			}
			else if ((_t.getType()==3)) {
			}
			else {
				throw new NoViableAltException(_t);
			}
			
			}
			_t = __t2075;
			_t = _t.getNextSibling();
			break;
		}
		case TERMINAL:
		{
			AST tmp2317_AST_in = (AST)_t;
			match(_t,TERMINAL);
			_t = _t.getNextSibling();
			break;
		}
		case EOF:
		case PERIOD:
		case APPEND:
		case BINARY:
		case COLLATE:
		case CONVERT:
		case ECHO:
		case FILENAME:
		case KEEPMESSAGES:
		case LANDSCAPE:
		case MAP:
		case NOCONVERT:
		case NOECHO:
		case NOMAP:
		case NUMCOPIES:
		case PAGESIZE_KW:
		case PAGED:
		case PORTRAIT:
		case UNBUFFERED:
		case VALUE:
		case LOBDIR:
		{
			{
			_loop2078:
			do {
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case VALUE:
				{
					valueexpression(_t);
					_t = _retTree;
					break;
				}
				case FILENAME:
				{
					AST tmp2318_AST_in = (AST)_t;
					match(_t,FILENAME);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					break _loop2078;
				}
				}
			} while (true);
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		_loop2088:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case APPEND:
			{
				AST tmp2319_AST_in = (AST)_t;
				match(_t,APPEND);
				_t = _t.getNextSibling();
				break;
			}
			case BINARY:
			{
				AST tmp2320_AST_in = (AST)_t;
				match(_t,BINARY);
				_t = _t.getNextSibling();
				break;
			}
			case COLLATE:
			{
				AST tmp2321_AST_in = (AST)_t;
				match(_t,COLLATE);
				_t = _t.getNextSibling();
				break;
			}
			case CONVERT:
			{
				AST __t2080 = _t;
				AST tmp2322_AST_in = (AST)_t;
				match(_t,CONVERT);
				_t = _t.getFirstChild();
				{
				_loop2083:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==SOURCE||_t.getType()==TARGET)) {
						{
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case SOURCE:
						{
							AST tmp2323_AST_in = (AST)_t;
							match(_t,SOURCE);
							_t = _t.getNextSibling();
							break;
						}
						case TARGET:
						{
							AST tmp2324_AST_in = (AST)_t;
							match(_t,TARGET);
							_t = _t.getNextSibling();
							break;
						}
						default:
						{
							throw new NoViableAltException(_t);
						}
						}
						}
						expression(_t);
						_t = _retTree;
					}
					else {
						break _loop2083;
					}
					
				} while (true);
				}
				_t = __t2080;
				_t = _t.getNextSibling();
				break;
			}
			case LOBDIR:
			{
				AST __t2084 = _t;
				AST tmp2325_AST_in = (AST)_t;
				match(_t,LOBDIR);
				_t = _t.getFirstChild();
				filenameorvalue(_t);
				_t = _retTree;
				_t = __t2084;
				_t = _t.getNextSibling();
				break;
			}
			case NOCONVERT:
			{
				AST tmp2326_AST_in = (AST)_t;
				match(_t,NOCONVERT);
				_t = _t.getNextSibling();
				break;
			}
			case ECHO:
			{
				AST tmp2327_AST_in = (AST)_t;
				match(_t,ECHO);
				_t = _t.getNextSibling();
				break;
			}
			case NOECHO:
			{
				AST tmp2328_AST_in = (AST)_t;
				match(_t,NOECHO);
				_t = _t.getNextSibling();
				break;
			}
			case KEEPMESSAGES:
			{
				AST tmp2329_AST_in = (AST)_t;
				match(_t,KEEPMESSAGES);
				_t = _t.getNextSibling();
				break;
			}
			case LANDSCAPE:
			{
				AST tmp2330_AST_in = (AST)_t;
				match(_t,LANDSCAPE);
				_t = _t.getNextSibling();
				break;
			}
			case MAP:
			{
				AST __t2085 = _t;
				AST tmp2331_AST_in = (AST)_t;
				match(_t,MAP);
				_t = _t.getFirstChild();
				anyorvalue(_t);
				_t = _retTree;
				_t = __t2085;
				_t = _t.getNextSibling();
				break;
			}
			case NOMAP:
			{
				AST tmp2332_AST_in = (AST)_t;
				match(_t,NOMAP);
				_t = _t.getNextSibling();
				break;
			}
			case NUMCOPIES:
			{
				AST __t2086 = _t;
				AST tmp2333_AST_in = (AST)_t;
				match(_t,NUMCOPIES);
				_t = _t.getFirstChild();
				anyorvalue(_t);
				_t = _retTree;
				_t = __t2086;
				_t = _t.getNextSibling();
				break;
			}
			case PAGED:
			{
				AST tmp2334_AST_in = (AST)_t;
				match(_t,PAGED);
				_t = _t.getNextSibling();
				break;
			}
			case PAGESIZE_KW:
			{
				AST __t2087 = _t;
				AST tmp2335_AST_in = (AST)_t;
				match(_t,PAGESIZE_KW);
				_t = _t.getFirstChild();
				anyorvalue(_t);
				_t = _retTree;
				_t = __t2087;
				_t = _t.getNextSibling();
				break;
			}
			case PORTRAIT:
			{
				AST tmp2336_AST_in = (AST)_t;
				match(_t,PORTRAIT);
				_t = _t.getNextSibling();
				break;
			}
			case UNBUFFERED:
			{
				AST tmp2337_AST_in = (AST)_t;
				match(_t,UNBUFFERED);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				break _loop2088;
			}
			}
		} while (true);
		}
		_retTree = _t;
	}
	
	public final void atphraseab(AST _t) throws RecognitionException {
		
		AST atphraseab_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case COLUMN:
		{
			AST __t1707 = _t;
			AST tmp2338_AST_in = (AST)_t;
			match(_t,COLUMN);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1707;
			_t = _t.getNextSibling();
			break;
		}
		case COLUMNOF:
		{
			AST __t1708 = _t;
			AST tmp2339_AST_in = (AST)_t;
			match(_t,COLUMNOF);
			_t = _t.getFirstChild();
			referencepoint(_t);
			_t = _retTree;
			_t = __t1708;
			_t = _t.getNextSibling();
			break;
		}
		case ROW:
		{
			AST __t1709 = _t;
			AST tmp2340_AST_in = (AST)_t;
			match(_t,ROW);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1709;
			_t = _t.getNextSibling();
			break;
		}
		case ROWOF:
		{
			AST __t1710 = _t;
			AST tmp2341_AST_in = (AST)_t;
			match(_t,ROWOF);
			_t = _t.getFirstChild();
			referencepoint(_t);
			_t = _retTree;
			_t = __t1710;
			_t = _t.getNextSibling();
			break;
		}
		case X:
		{
			AST __t1711 = _t;
			AST tmp2342_AST_in = (AST)_t;
			match(_t,X);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1711;
			_t = _t.getNextSibling();
			break;
		}
		case XOF:
		{
			AST __t1712 = _t;
			AST tmp2343_AST_in = (AST)_t;
			match(_t,XOF);
			_t = _t.getFirstChild();
			referencepoint(_t);
			_t = _retTree;
			_t = __t1712;
			_t = _t.getNextSibling();
			break;
		}
		case Y:
		{
			AST __t1713 = _t;
			AST tmp2344_AST_in = (AST)_t;
			match(_t,Y);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1713;
			_t = _t.getNextSibling();
			break;
		}
		case YOF:
		{
			AST __t1714 = _t;
			AST tmp2345_AST_in = (AST)_t;
			match(_t,YOF);
			_t = _t.getFirstChild();
			referencepoint(_t);
			_t = _retTree;
			_t = __t1714;
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void case_expression(AST _t) throws RecognitionException {
		
		AST case_expression_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		boolean synPredMatched1743 = false;
		if (_t==null) _t=ASTNULL;
		if (((_t.getType()==OR))) {
			AST __t1743 = _t;
			synPredMatched1743 = true;
			inputState.guessing++;
			try {
				{
				AST __t1742 = _t;
				AST tmp2346_AST_in = (AST)_t;
				match(_t,OR);
				_t = _t.getFirstChild();
				AST tmp2347_AST_in = (AST)_t;
				if ( _t==null ) throw new MismatchedTokenException();
				_t = _t.getNextSibling();
				_t = __t1742;
				_t = _t.getNextSibling();
				}
			}
			catch (RecognitionException pe) {
				synPredMatched1743 = false;
			}
			_t = __t1743;
inputState.guessing--;
		}
		if ( synPredMatched1743 ) {
			AST __t1744 = _t;
			AST tmp2348_AST_in = (AST)_t;
			match(_t,OR);
			_t = _t.getFirstChild();
			case_expression(_t);
			_t = _retTree;
			case_expression(_t);
			_t = _retTree;
			_t = __t1744;
			_t = _t.getNextSibling();
		}
		else if ((_t.getType()==WHEN)) {
			AST __t1745 = _t;
			AST tmp2349_AST_in = (AST)_t;
			match(_t,WHEN);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1745;
			_t = _t.getNextSibling();
		}
		else if ((_tokenSet_3.member(_t.getType()))) {
			expression(_t);
			_t = _retTree;
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		_retTree = _t;
	}
	
	public final void comboboxphrase(AST _t) throws RecognitionException {
		
		AST comboboxphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1764 = _t;
		AST tmp2350_AST_in = (AST)_t;
		match(_t,COMBOBOX);
		_t = _t.getFirstChild();
		{
		_loop1776:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LISTITEMS:
			{
				AST __t1766 = _t;
				AST tmp2351_AST_in = (AST)_t;
				match(_t,LISTITEMS);
				_t = _t.getFirstChild();
				constant(_t);
				_t = _retTree;
				{
				_loop1768:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COMMA)) {
						AST tmp2352_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						constant(_t);
						_t = _retTree;
					}
					else {
						break _loop1768;
					}
					
				} while (true);
				}
				_t = __t1766;
				_t = _t.getNextSibling();
				break;
			}
			case LISTITEMPAIRS:
			{
				AST __t1769 = _t;
				AST tmp2353_AST_in = (AST)_t;
				match(_t,LISTITEMPAIRS);
				_t = _t.getFirstChild();
				constant(_t);
				_t = _retTree;
				{
				_loop1771:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COMMA)) {
						AST tmp2354_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						constant(_t);
						_t = _retTree;
					}
					else {
						break _loop1771;
					}
					
				} while (true);
				}
				_t = __t1769;
				_t = _t.getNextSibling();
				break;
			}
			case INNERLINES:
			{
				AST __t1772 = _t;
				AST tmp2355_AST_in = (AST)_t;
				match(_t,INNERLINES);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1772;
				_t = _t.getNextSibling();
				break;
			}
			case SORT:
			{
				AST tmp2356_AST_in = (AST)_t;
				match(_t,SORT);
				_t = _t.getNextSibling();
				break;
			}
			case TOOLTIP:
			{
				tooltip_expr(_t);
				_t = _retTree;
				break;
			}
			case SIMPLE:
			{
				AST tmp2357_AST_in = (AST)_t;
				match(_t,SIMPLE);
				_t = _t.getNextSibling();
				break;
			}
			case DROPDOWN:
			{
				AST tmp2358_AST_in = (AST)_t;
				match(_t,DROPDOWN);
				_t = _t.getNextSibling();
				break;
			}
			case DROPDOWNLIST:
			{
				AST tmp2359_AST_in = (AST)_t;
				match(_t,DROPDOWNLIST);
				_t = _t.getNextSibling();
				break;
			}
			case MAXCHARS:
			{
				AST __t1773 = _t;
				AST tmp2360_AST_in = (AST)_t;
				match(_t,MAXCHARS);
				_t = _t.getFirstChild();
				AST tmp2361_AST_in = (AST)_t;
				match(_t,NUMBER);
				_t = _t.getNextSibling();
				_t = __t1773;
				_t = _t.getNextSibling();
				break;
			}
			case AUTOCOMPLETION:
			{
				AST __t1774 = _t;
				AST tmp2362_AST_in = (AST)_t;
				match(_t,AUTOCOMPLETION);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case UNIQUEMATCH:
				{
					AST tmp2363_AST_in = (AST)_t;
					match(_t,UNIQUEMATCH);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t1774;
				_t = _t.getNextSibling();
				break;
			}
			case SIZE:
			case SIZECHARS:
			case SIZEPIXELS:
			{
				sizephrase(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				break _loop1776;
			}
			}
		} while (true);
		}
		_t = __t1764;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void compile_append(AST _t) throws RecognitionException {
		
		AST compile_append_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1833 = _t;
		AST tmp2364_AST_in = (AST)_t;
		match(_t,APPEND);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case EQUAL:
		{
			AST __t1835 = _t;
			AST tmp2365_AST_in = (AST)_t;
			match(_t,EQUAL);
			_t = _t.getFirstChild();
			expression(_t);
			_t = _retTree;
			_t = __t1835;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1833;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void compile_lang(AST _t) throws RecognitionException {
		
		AST compile_lang_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case VALUE:
		{
			valueexpression(_t);
			_t = _retTree;
			break;
		}
		case TYPELESS_TOKEN:
		{
			AST tmp2366_AST_in = (AST)_t;
			match(_t,TYPELESS_TOKEN);
			_t = _t.getNextSibling();
			{
			_loop1831:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==LEXCOLON)) {
					AST tmp2367_AST_in = (AST)_t;
					match(_t,LEXCOLON);
					_t = _t.getNextSibling();
					AST tmp2368_AST_in = (AST)_t;
					match(_t,TYPELESS_TOKEN);
					_t = _t.getNextSibling();
				}
				else {
					break _loop1831;
				}
				
			} while (true);
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void convertphrase(AST _t) throws RecognitionException {
		
		AST convertphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1841 = _t;
		AST tmp2369_AST_in = (AST)_t;
		match(_t,CONVERT);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case SOURCE:
		{
			AST __t1843 = _t;
			AST tmp2370_AST_in = (AST)_t;
			match(_t,SOURCE);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case BASE64:
			{
				AST tmp2371_AST_in = (AST)_t;
				match(_t,BASE64);
				_t = _t.getNextSibling();
				break;
			}
			case CODEPAGE:
			{
				AST tmp2372_AST_in = (AST)_t;
				match(_t,CODEPAGE);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case BASE64:
				{
					AST tmp2373_AST_in = (AST)_t;
					match(_t,BASE64);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1843;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		case TARGET:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case TARGET:
		{
			AST __t1847 = _t;
			AST tmp2374_AST_in = (AST)_t;
			match(_t,TARGET);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case BASE64:
			{
				AST tmp2375_AST_in = (AST)_t;
				match(_t,BASE64);
				_t = _t.getNextSibling();
				break;
			}
			case CODEPAGE:
			{
				AST tmp2376_AST_in = (AST)_t;
				match(_t,CODEPAGE);
				_t = _t.getNextSibling();
				expression(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case BASE64:
				{
					AST tmp2377_AST_in = (AST)_t;
					match(_t,BASE64);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
			_t = __t1847;
			_t = _t.getNextSibling();
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t1841;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void datatype_dll_native(AST _t) throws RecognitionException {
		
		AST datatype_dll_native_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case BYTE:
		{
			AST tmp2378_AST_in = (AST)_t;
			match(_t,BYTE);
			_t = _t.getNextSibling();
			break;
		}
		case DOUBLE:
		{
			AST tmp2379_AST_in = (AST)_t;
			match(_t,DOUBLE);
			_t = _t.getNextSibling();
			break;
		}
		case FLOAT:
		{
			AST tmp2380_AST_in = (AST)_t;
			match(_t,FLOAT);
			_t = _t.getNextSibling();
			break;
		}
		case LONG:
		{
			AST tmp2381_AST_in = (AST)_t;
			match(_t,LONG);
			_t = _t.getNextSibling();
			break;
		}
		case SHORT:
		{
			AST tmp2382_AST_in = (AST)_t;
			match(_t,SHORT);
			_t = _t.getNextSibling();
			break;
		}
		case UNSIGNEDSHORT:
		{
			AST tmp2383_AST_in = (AST)_t;
			match(_t,UNSIGNEDSHORT);
			_t = _t.getNextSibling();
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		_retTree = _t;
	}
	
	public final void editorphrase(AST _t) throws RecognitionException {
		
		AST editorphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1976 = _t;
		AST tmp2384_AST_in = (AST)_t;
		match(_t,EDITOR);
		_t = _t.getFirstChild();
		{
		_loop1983:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case INNERCHARS:
			{
				AST __t1978 = _t;
				AST tmp2385_AST_in = (AST)_t;
				match(_t,INNERCHARS);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1978;
				_t = _t.getNextSibling();
				break;
			}
			case INNERLINES:
			{
				AST __t1979 = _t;
				AST tmp2386_AST_in = (AST)_t;
				match(_t,INNERLINES);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1979;
				_t = _t.getNextSibling();
				break;
			}
			case BUFFERCHARS:
			{
				AST __t1980 = _t;
				AST tmp2387_AST_in = (AST)_t;
				match(_t,BUFFERCHARS);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1980;
				_t = _t.getNextSibling();
				break;
			}
			case BUFFERLINES:
			{
				AST __t1981 = _t;
				AST tmp2388_AST_in = (AST)_t;
				match(_t,BUFFERLINES);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1981;
				_t = _t.getNextSibling();
				break;
			}
			case LARGE:
			{
				AST tmp2389_AST_in = (AST)_t;
				match(_t,LARGE);
				_t = _t.getNextSibling();
				break;
			}
			case MAXCHARS:
			{
				AST __t1982 = _t;
				AST tmp2390_AST_in = (AST)_t;
				match(_t,MAXCHARS);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t1982;
				_t = _t.getNextSibling();
				break;
			}
			case NOBOX:
			{
				AST tmp2391_AST_in = (AST)_t;
				match(_t,NOBOX);
				_t = _t.getNextSibling();
				break;
			}
			case NOWORDWRAP:
			{
				AST tmp2392_AST_in = (AST)_t;
				match(_t,NOWORDWRAP);
				_t = _t.getNextSibling();
				break;
			}
			case SCROLLBARHORIZONTAL:
			{
				AST tmp2393_AST_in = (AST)_t;
				match(_t,SCROLLBARHORIZONTAL);
				_t = _t.getNextSibling();
				break;
			}
			case SCROLLBARVERTICAL:
			{
				AST tmp2394_AST_in = (AST)_t;
				match(_t,SCROLLBARVERTICAL);
				_t = _t.getNextSibling();
				break;
			}
			case TOOLTIP:
			{
				tooltip_expr(_t);
				_t = _retTree;
				break;
			}
			case SIZE:
			case SIZECHARS:
			case SIZEPIXELS:
			{
				sizephrase(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				break _loop1983;
			}
			}
		} while (true);
		}
		_t = __t1976;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void fillinphrase(AST _t) throws RecognitionException {
		
		AST fillinphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t1992 = _t;
		AST tmp2395_AST_in = (AST)_t;
		match(_t,FILLIN);
		_t = _t.getFirstChild();
		{
		_loop1994:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case NATIVE:
			{
				AST tmp2396_AST_in = (AST)_t;
				match(_t,NATIVE);
				_t = _t.getNextSibling();
				break;
			}
			case SIZE:
			case SIZECHARS:
			case SIZEPIXELS:
			{
				sizephrase(_t);
				_t = _retTree;
				break;
			}
			case TOOLTIP:
			{
				tooltip_expr(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				break _loop1994;
			}
			}
		} while (true);
		}
		_t = __t1992;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void goon_elem(AST _t) throws RecognitionException {
		
		AST goon_elem_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		{
		AST tmp2397_AST_in = (AST)_t;
		match(_t,_tokenSet_11);
		_t = _t.getNextSibling();
		}
		{
		boolean synPredMatched2018 = false;
		if (_t==null) _t=ASTNULL;
		if (((_t.getType()==OF))) {
			AST __t2018 = _t;
			synPredMatched2018 = true;
			inputState.guessing++;
			try {
				{
				AST tmp2398_AST_in = (AST)_t;
				match(_t,OF);
				_t = _t.getNextSibling();
				}
			}
			catch (RecognitionException pe) {
				synPredMatched2018 = false;
			}
			_t = __t2018;
inputState.guessing--;
		}
		if ( synPredMatched2018 ) {
			AST tmp2399_AST_in = (AST)_t;
			match(_t,OF);
			_t = _t.getNextSibling();
			gwidget(_t);
			_t = _retTree;
		}
		else if (((_t.getType() >= LEXDATE && _t.getType() <= Last_Token_Number))) {
		}
		else {
			throw new NoViableAltException(_t);
		}
		
		}
		_retTree = _t;
	}
	
	public final void loadpicturefunc(AST _t) throws RecognitionException {
		
		AST loadpicturefunc_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2108 = _t;
		AST tmp2400_AST_in = (AST)_t;
		match(_t,LOADPICTURE);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case LEFTPAREN:
		{
			funargs(_t);
			_t = _retTree;
			break;
		}
		case 3:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		_t = __t2108;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void return_options(AST _t) throws RecognitionException {
		
		AST return_options_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		{
		boolean synPredMatched2302 = false;
		if (_t==null) _t=ASTNULL;
		if (((_tokenSet_3.member(_t.getType())))) {
			AST __t2302 = _t;
			synPredMatched2302 = true;
			inputState.guessing++;
			try {
				{
				AST __t2301 = _t;
				AST tmp2401_AST_in = (AST)_t;
				match(_t,ERROR);
				_t = _t.getFirstChild();
				AST tmp2402_AST_in = (AST)_t;
				match(_t,LEFTPAREN);
				_t = _t.getNextSibling();
				AST tmp2403_AST_in = (AST)_t;
				match(_t,RECORD_NAME);
				_t = _t.getNextSibling();
				AST tmp2404_AST_in = (AST)_t;
				match(_t,RIGHTPAREN);
				_t = _t.getNextSibling();
				_t = __t2301;
				_t = _t.getNextSibling();
				}
			}
			catch (RecognitionException pe) {
				synPredMatched2302 = false;
			}
			_t = __t2302;
inputState.guessing--;
		}
		if ( synPredMatched2302 ) {
			expression(_t);
			_t = _retTree;
		}
		else {
			boolean synPredMatched2304 = false;
			if (_t==null) _t=ASTNULL;
			if (((_t.getType()==ERROR))) {
				AST __t2304 = _t;
				synPredMatched2304 = true;
				inputState.guessing++;
				try {
					{
					AST tmp2405_AST_in = (AST)_t;
					match(_t,ERROR);
					_t = _t.getNextSibling();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched2304 = false;
				}
				_t = __t2304;
inputState.guessing--;
			}
			if ( synPredMatched2304 ) {
				AST tmp2406_AST_in = (AST)_t;
				match(_t,ERROR);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_3.member(_t.getType()))) {
					expression(_t);
					_t = _retTree;
				}
				else if ((_t.getType()==EOF||_t.getType()==3||_t.getType()==PERIOD)) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
			}
			else if ((_t.getType()==NOAPPLY)) {
				AST tmp2407_AST_in = (AST)_t;
				match(_t,NOAPPLY);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_3.member(_t.getType()))) {
					expression(_t);
					_t = _retTree;
				}
				else if ((_t.getType()==EOF||_t.getType()==3||_t.getType()==PERIOD)) {
				}
				else {
					throw new NoViableAltException(_t);
				}
				
				}
			}
			else if ((_tokenSet_3.member(_t.getType()))) {
				expression(_t);
				_t = _retTree;
			}
			else {
				throw new NoViableAltException(_t);
			}
			}
			}
			_retTree = _t;
		}
		
	public final void radiosetphrase(AST _t) throws RecognitionException {
		
		AST radiosetphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2257 = _t;
		AST tmp2408_AST_in = (AST)_t;
		match(_t,RADIOSET);
		_t = _t.getFirstChild();
		{
		_loop2269:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case HORIZONTAL:
			{
				AST __t2259 = _t;
				AST tmp2409_AST_in = (AST)_t;
				match(_t,HORIZONTAL);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case EXPAND:
				{
					AST tmp2410_AST_in = (AST)_t;
					match(_t,EXPAND);
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t2259;
				_t = _t.getNextSibling();
				break;
			}
			case VERTICAL:
			{
				AST tmp2411_AST_in = (AST)_t;
				match(_t,VERTICAL);
				_t = _t.getNextSibling();
				break;
			}
			case SIZE:
			case SIZECHARS:
			case SIZEPIXELS:
			{
				{
				sizephrase(_t);
				_t = _retTree;
				}
				break;
			}
			case RADIOBUTTONS:
			{
				AST __t2262 = _t;
				AST tmp2412_AST_in = (AST)_t;
				match(_t,RADIOBUTTONS);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case QSTRING:
				{
					AST tmp2413_AST_in = (AST)_t;
					match(_t,QSTRING);
					_t = _t.getNextSibling();
					break;
				}
				case UNQUOTEDSTRING:
				{
					AST tmp2414_AST_in = (AST)_t;
					match(_t,UNQUOTEDSTRING);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				AST tmp2415_AST_in = (AST)_t;
				match(_t,COMMA);
				_t = _t.getNextSibling();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case LEXDATE:
				case NUMBER:
				case QSTRING:
				case BIGENDIAN:
				case EXCLUSIVELOCK:
				case FALSE_KW:
				case FINDCASESENSITIVE:
				case FINDGLOBAL:
				case FINDNEXTOCCURRENCE:
				case FINDPREVOCCURRENCE:
				case FINDSELECT:
				case FINDWRAPAROUND:
				case HOSTBYTEORDER:
				case LITTLEENDIAN:
				case NO:
				case NOLOCK:
				case NOWAIT:
				case NULL_KW:
				case READAVAILABLE:
				case READEXACTNUM:
				case SEARCHSELF:
				case SEARCHTARGET:
				case SHARELOCK:
				case TRUE_KW:
				case WINDOWDELAYEDMINIMIZE:
				case WINDOWMAXIMIZED:
				case WINDOWMINIMIZED:
				case WINDOWNORMAL:
				case YES:
				case UNKNOWNVALUE:
				case FUNCTIONCALLTYPE:
				case GETATTRCALLTYPE:
				case PROCEDURECALLTYPE:
				case SAXCOMPLETE:
				case SAXPARSERERROR:
				case SAXRUNNING:
				case SAXUNINITIALIZED:
				case SETATTRCALLTYPE:
				case ROWUNMODIFIED:
				case ROWDELETED:
				case ROWMODIFIED:
				case ROWCREATED:
				{
					constant(_t);
					_t = _retTree;
					break;
				}
				case TODAY:
				{
					AST tmp2416_AST_in = (AST)_t;
					match(_t,TODAY);
					_t = _t.getNextSibling();
					break;
				}
				case NOW:
				{
					AST tmp2417_AST_in = (AST)_t;
					match(_t,NOW);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				{
				_loop2268:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COMMA)) {
						AST tmp2418_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						{
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case QSTRING:
						{
							AST tmp2419_AST_in = (AST)_t;
							match(_t,QSTRING);
							_t = _t.getNextSibling();
							break;
						}
						case UNQUOTEDSTRING:
						{
							AST tmp2420_AST_in = (AST)_t;
							match(_t,UNQUOTEDSTRING);
							_t = _t.getNextSibling();
							break;
						}
						default:
						{
							throw new NoViableAltException(_t);
						}
						}
						}
						AST tmp2421_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						{
						if (_t==null) _t=ASTNULL;
						switch ( _t.getType()) {
						case LEXDATE:
						case NUMBER:
						case QSTRING:
						case BIGENDIAN:
						case EXCLUSIVELOCK:
						case FALSE_KW:
						case FINDCASESENSITIVE:
						case FINDGLOBAL:
						case FINDNEXTOCCURRENCE:
						case FINDPREVOCCURRENCE:
						case FINDSELECT:
						case FINDWRAPAROUND:
						case HOSTBYTEORDER:
						case LITTLEENDIAN:
						case NO:
						case NOLOCK:
						case NOWAIT:
						case NULL_KW:
						case READAVAILABLE:
						case READEXACTNUM:
						case SEARCHSELF:
						case SEARCHTARGET:
						case SHARELOCK:
						case TRUE_KW:
						case WINDOWDELAYEDMINIMIZE:
						case WINDOWMAXIMIZED:
						case WINDOWMINIMIZED:
						case WINDOWNORMAL:
						case YES:
						case UNKNOWNVALUE:
						case FUNCTIONCALLTYPE:
						case GETATTRCALLTYPE:
						case PROCEDURECALLTYPE:
						case SAXCOMPLETE:
						case SAXPARSERERROR:
						case SAXRUNNING:
						case SAXUNINITIALIZED:
						case SETATTRCALLTYPE:
						case ROWUNMODIFIED:
						case ROWDELETED:
						case ROWMODIFIED:
						case ROWCREATED:
						{
							constant(_t);
							_t = _retTree;
							break;
						}
						case TODAY:
						{
							AST tmp2422_AST_in = (AST)_t;
							match(_t,TODAY);
							_t = _t.getNextSibling();
							break;
						}
						case NOW:
						{
							AST tmp2423_AST_in = (AST)_t;
							match(_t,NOW);
							_t = _t.getNextSibling();
							break;
						}
						default:
						{
							throw new NoViableAltException(_t);
						}
						}
						}
					}
					else {
						break _loop2268;
					}
					
				} while (true);
				}
				_t = __t2262;
				_t = _t.getNextSibling();
				break;
			}
			case TOOLTIP:
			{
				tooltip_expr(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				break _loop2269;
			}
			}
		} while (true);
		}
		_t = __t2257;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void selectionlistphrase(AST _t) throws RecognitionException {
		
		AST selectionlistphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2318 = _t;
		AST tmp2424_AST_in = (AST)_t;
		match(_t,SELECTIONLIST);
		_t = _t.getFirstChild();
		{
		_loop2328:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SINGLE:
			{
				AST tmp2425_AST_in = (AST)_t;
				match(_t,SINGLE);
				_t = _t.getNextSibling();
				break;
			}
			case MULTIPLE:
			{
				AST tmp2426_AST_in = (AST)_t;
				match(_t,MULTIPLE);
				_t = _t.getNextSibling();
				break;
			}
			case NODRAG:
			{
				AST tmp2427_AST_in = (AST)_t;
				match(_t,NODRAG);
				_t = _t.getNextSibling();
				break;
			}
			case LISTITEMS:
			{
				AST __t2320 = _t;
				AST tmp2428_AST_in = (AST)_t;
				match(_t,LISTITEMS);
				_t = _t.getFirstChild();
				constant(_t);
				_t = _retTree;
				{
				_loop2322:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COMMA)) {
						AST tmp2429_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						constant(_t);
						_t = _retTree;
					}
					else {
						break _loop2322;
					}
					
				} while (true);
				}
				_t = __t2320;
				_t = _t.getNextSibling();
				break;
			}
			case LISTITEMPAIRS:
			{
				AST __t2323 = _t;
				AST tmp2430_AST_in = (AST)_t;
				match(_t,LISTITEMPAIRS);
				_t = _t.getFirstChild();
				constant(_t);
				_t = _retTree;
				{
				_loop2325:
				do {
					if (_t==null) _t=ASTNULL;
					if ((_t.getType()==COMMA)) {
						AST tmp2431_AST_in = (AST)_t;
						match(_t,COMMA);
						_t = _t.getNextSibling();
						constant(_t);
						_t = _retTree;
					}
					else {
						break _loop2325;
					}
					
				} while (true);
				}
				_t = __t2323;
				_t = _t.getNextSibling();
				break;
			}
			case SCROLLBARHORIZONTAL:
			{
				AST tmp2432_AST_in = (AST)_t;
				match(_t,SCROLLBARHORIZONTAL);
				_t = _t.getNextSibling();
				break;
			}
			case SCROLLBARVERTICAL:
			{
				AST tmp2433_AST_in = (AST)_t;
				match(_t,SCROLLBARVERTICAL);
				_t = _t.getNextSibling();
				break;
			}
			case INNERCHARS:
			{
				AST __t2326 = _t;
				AST tmp2434_AST_in = (AST)_t;
				match(_t,INNERCHARS);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2326;
				_t = _t.getNextSibling();
				break;
			}
			case INNERLINES:
			{
				AST __t2327 = _t;
				AST tmp2435_AST_in = (AST)_t;
				match(_t,INNERLINES);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2327;
				_t = _t.getNextSibling();
				break;
			}
			case SORT:
			{
				AST tmp2436_AST_in = (AST)_t;
				match(_t,SORT);
				_t = _t.getNextSibling();
				break;
			}
			case TOOLTIP:
			{
				tooltip_expr(_t);
				_t = _retTree;
				break;
			}
			case SIZE:
			case SIZECHARS:
			case SIZEPIXELS:
			{
				sizephrase(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				break _loop2328;
			}
			}
		} while (true);
		}
		_t = __t2318;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void sliderphrase(AST _t) throws RecognitionException {
		
		AST sliderphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2340 = _t;
		AST tmp2437_AST_in = (AST)_t;
		match(_t,SLIDER);
		_t = _t.getFirstChild();
		{
		_loop2348:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case HORIZONTAL:
			{
				AST tmp2438_AST_in = (AST)_t;
				match(_t,HORIZONTAL);
				_t = _t.getNextSibling();
				break;
			}
			case MAXVALUE:
			{
				AST __t2342 = _t;
				AST tmp2439_AST_in = (AST)_t;
				match(_t,MAXVALUE);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2342;
				_t = _t.getNextSibling();
				break;
			}
			case MINVALUE:
			{
				AST __t2343 = _t;
				AST tmp2440_AST_in = (AST)_t;
				match(_t,MINVALUE);
				_t = _t.getFirstChild();
				expression(_t);
				_t = _retTree;
				_t = __t2343;
				_t = _t.getNextSibling();
				break;
			}
			case VERTICAL:
			{
				AST tmp2441_AST_in = (AST)_t;
				match(_t,VERTICAL);
				_t = _t.getNextSibling();
				break;
			}
			case NOCURRENTVALUE:
			{
				AST tmp2442_AST_in = (AST)_t;
				match(_t,NOCURRENTVALUE);
				_t = _t.getNextSibling();
				break;
			}
			case LARGETOSMALL:
			{
				AST tmp2443_AST_in = (AST)_t;
				match(_t,LARGETOSMALL);
				_t = _t.getNextSibling();
				break;
			}
			case TICMARKS:
			{
				AST __t2344 = _t;
				AST tmp2444_AST_in = (AST)_t;
				match(_t,TICMARKS);
				_t = _t.getFirstChild();
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case NONE:
				{
					AST tmp2445_AST_in = (AST)_t;
					match(_t,NONE);
					_t = _t.getNextSibling();
					break;
				}
				case TOP:
				{
					AST tmp2446_AST_in = (AST)_t;
					match(_t,TOP);
					_t = _t.getNextSibling();
					break;
				}
				case BOTTOM:
				{
					AST tmp2447_AST_in = (AST)_t;
					match(_t,BOTTOM);
					_t = _t.getNextSibling();
					break;
				}
				case LEFT:
				{
					AST tmp2448_AST_in = (AST)_t;
					match(_t,LEFT);
					_t = _t.getNextSibling();
					break;
				}
				case RIGHT:
				{
					AST tmp2449_AST_in = (AST)_t;
					match(_t,RIGHT);
					_t = _t.getNextSibling();
					break;
				}
				case BOTH:
				{
					AST tmp2450_AST_in = (AST)_t;
					match(_t,BOTH);
					_t = _t.getNextSibling();
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				{
				if (_t==null) _t=ASTNULL;
				switch ( _t.getType()) {
				case FREQUENCY:
				{
					AST __t2347 = _t;
					AST tmp2451_AST_in = (AST)_t;
					match(_t,FREQUENCY);
					_t = _t.getFirstChild();
					expression(_t);
					_t = _retTree;
					_t = __t2347;
					_t = _t.getNextSibling();
					break;
				}
				case 3:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(_t);
				}
				}
				}
				_t = __t2344;
				_t = _t.getNextSibling();
				break;
			}
			case TOOLTIP:
			{
				tooltip_expr(_t);
				_t = _retTree;
				break;
			}
			case SIZE:
			case SIZECHARS:
			case SIZEPIXELS:
			{
				sizephrase(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				break _loop2348;
			}
			}
		} while (true);
		}
		_t = __t2340;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void textphrase(AST _t) throws RecognitionException {
		
		AST textphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2397 = _t;
		AST tmp2452_AST_in = (AST)_t;
		match(_t,TEXT);
		_t = _t.getFirstChild();
		{
		_loop2399:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SIZE:
			case SIZECHARS:
			case SIZEPIXELS:
			{
				sizephrase(_t);
				_t = _retTree;
				break;
			}
			case TOOLTIP:
			{
				tooltip_expr(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				break _loop2399;
			}
			}
		} while (true);
		}
		_t = __t2397;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void toggleboxphrase(AST _t) throws RecognitionException {
		
		AST toggleboxphrase_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2407 = _t;
		AST tmp2453_AST_in = (AST)_t;
		match(_t,TOGGLEBOX);
		_t = _t.getFirstChild();
		{
		_loop2409:
		do {
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case SIZE:
			case SIZECHARS:
			case SIZEPIXELS:
			{
				sizephrase(_t);
				_t = _retTree;
				break;
			}
			case TOOLTIP:
			{
				tooltip_expr(_t);
				_t = _retTree;
				break;
			}
			default:
			{
				break _loop2409;
			}
			}
		} while (true);
		}
		_t = __t2407;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	public final void sql_comp_query(AST _t) throws RecognitionException {
		
		AST sql_comp_query_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		
		AST __t2577 = _t;
		AST tmp2454_AST_in = (AST)_t;
		match(_t,Sql_comp_query);
		_t = _t.getFirstChild();
		{
		if (_t==null) _t=ASTNULL;
		switch ( _t.getType()) {
		case ANY:
		{
			AST tmp2455_AST_in = (AST)_t;
			match(_t,ANY);
			_t = _t.getNextSibling();
			break;
		}
		case ALL:
		{
			AST tmp2456_AST_in = (AST)_t;
			match(_t,ALL);
			_t = _t.getNextSibling();
			break;
		}
		case SOME:
		{
			AST tmp2457_AST_in = (AST)_t;
			match(_t,SOME);
			_t = _t.getNextSibling();
			break;
		}
		case LEFTPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(_t);
		}
		}
		}
		AST tmp2458_AST_in = (AST)_t;
		match(_t,LEFTPAREN);
		_t = _t.getNextSibling();
		selectstatea(_t);
		_t = _retTree;
		AST tmp2459_AST_in = (AST)_t;
		match(_t,RIGHTPAREN);
		_t = _t.getNextSibling();
		_t = __t2577;
		_t = _t.getNextSibling();
		_retTree = _t;
	}
	
	
	public static final String[] _tokenNames = { };
	
	private static final long[] mk_tokenSet_0() {
		long[] data = new long[38];
		data[0]=71477924201984L;
		data[1]=9099575545663490L;
		data[2]=145241088016254016L;
		data[3]=1649281804293L;
		data[4]=162129895823114372L;
		data[5]=-4611544730914520960L;
		data[6]=2251834173423617L;
		data[7]=3229618176L;
		data[8]=81662655424626688L;
		data[9]=580968854180593672L;
		data[10]=-4607160427476934270L;
		data[11]=1153071038188749824L;
		data[12]=89240839066222604L;
		data[13]=86050L;
		data[15]=2251834173423680L;
		data[17]=4952122499200L;
		data[18]=140737757323264L;
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = new long[38];
		data[0]=720584740915622224L;
		data[1]=19043554009546768L;
		data[2]=4666287662003390856L;
		data[3]=4912584968628076544L;
		data[4]=8360930528650874960L;
		data[5]=1126451814498134L;
		data[6]=1510339491481969202L;
		data[7]=576460765728620736L;
		data[8]=865183713961283584L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442362643714L;
		data[13]=422237178691608L;
		data[14]=130L;
		data[15]=361411877500092944L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = new long[38];
		data[0]=720584758095491408L;
		data[1]=19043554009546769L;
		data[2]=4666287662003394952L;
		data[3]=4913147918581497856L;
		data[4]=8396959325669838928L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460783177449664L;
		data[8]=865183731141169152L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442362643714L;
		data[13]=-9222949799676084200L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = new long[38];
		data[0]=720584758095491408L;
		data[1]=19043554009546769L;
		data[2]=4666287662003394952L;
		data[3]=4913147918581497856L;
		data[4]=8396959325669838928L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460765997580480L;
		data[8]=865183731141169152L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442362643714L;
		data[13]=-9222949799676084200L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = new long[38];
		data[0]=720584740915621888L;
		data[1]=19043554009546752L;
		data[2]=4666287662003390856L;
		data[3]=4624354592476364800L;
		data[4]=8360930528618106896L;
		data[5]=1126449667014486L;
		data[6]=1509213591575126578L;
		data[7]=4835262656L;
		data[8]=865183713961246720L;
		data[9]=1612851632066789392L;
		data[10]=5046283985982849560L;
		data[11]=-2303590900162297340L;
		data[12]=3458765892606829826L;
		data[13]=140737505919000L;
		data[15]=360290169212895232L;
		data[16]=8116221329512430982L;
		data[17]=5764607555248461568L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = new long[38];
		data[0]=720584740907200512L;
		data[1]=853233639620608L;
		data[2]=36587236476585992L;
		data[3]=4622102792662679552L;
		data[4]=8360930509290749968L;
		data[5]=1126449667014486L;
		data[6]=1509213591038255666L;
		data[7]=4833165504L;
		data[8]=865183713961246720L;
		data[9]=459930127392833552L;
		data[10]=5046283985982849560L;
		data[11]=-2303590934522036224L;
		data[12]=3458765892606755842L;
		data[13]=140737505656856L;
		data[15]=288232575174967296L;
		data[16]=6963299824905584006L;
		data[17]=5764607550953492992L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = new long[36];
		data[0]=8421376L;
		data[1]=18190320369926144L;
		data[2]=4629700425526804864L;
		data[3]=2251799813685248L;
		data[4]=19327356928L;
		data[6]=536870912L;
		data[7]=2097152L;
		data[9]=1152921504673955840L;
		data[11]=34359738884L;
		data[12]=73986L;
		data[13]=262144L;
		data[15]=72057594037927936L;
		data[16]=1152921504606846976L;
		data[17]=4294968576L;
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = new long[38];
		data[0]=720584740915622224L;
		data[1]=19043554009557008L;
		data[2]=4666287662003390856L;
		data[3]=4912584968628076544L;
		data[4]=8360931628162503248L;
		data[5]=1126451814498134L;
		data[6]=1510339491481969202L;
		data[7]=576460765728622272L;
		data[8]=865183713961283584L;
		data[9]=-2998693648872243184L;
		data[10]=6775666242893120024L;
		data[11]=-2231533303976754684L;
		data[12]=3458766442362644226L;
		data[13]=425535713574936L;
		data[14]=130L;
		data[15]=388433475264315920L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = new long[36];
		data[0]=8421376L;
		data[1]=18190320369936384L;
		data[2]=4629700425526804864L;
		data[3]=2251799813685248L;
		data[4]=1118838985216L;
		data[6]=536870912L;
		data[7]=2098688L;
		data[9]=1153062242162311168L;
		data[11]=72057630545150468L;
		data[12]=74498L;
		data[13]=3298535145472L;
		data[15]=99079191802150912L;
		data[16]=1152921504606846976L;
		data[17]=4294968576L;
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = new long[34];
		data[0]=336L;
		data[1]=16L;
		data[3]=288230376151711744L;
		data[4]=32768064L;
		data[5]=2147483648L;
		data[6]=1125899906842624L;
		data[7]=576460760893358080L;
		data[8]=36864L;
		data[9]=-4611686018427387904L;
		data[10]=1729382256910270464L;
		data[11]=131072L;
		data[12]=549755813888L;
		data[13]=281499672772608L;
		data[14]=128L;
		data[15]=1121501860331520L;
		data[16]=1080863910568919040L;
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = new long[28];
		data[0]=8L;
		data[3]=288230376151711744L;
		data[6]=68719476736L;
		data[7]=578712552117108736L;
		data[8]=4503599644151810L;
		data[11]=131072L;
		data[12]=576460752303423488L;
		data[13]=2097154L;
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {
		long[] data = new long[60];
		data[0]=-16L;
		for (int i = 1; i<=13; i++) { data[i]=-1L; }
		data[14]=-5L;
		for (int i = 15; i<=17; i++) { data[i]=-1L; }
		data[18]=562949953421311L;
		return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	private static final long[] mk_tokenSet_12() {
		long[] data = new long[19];
		data[4]=4503599627372544L;
		data[5]=61572651155456L;
		return data;
	}
	public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
	private static final long[] mk_tokenSet_13() {
		long[] data = new long[38];
		data[0]=720584758095491408L;
		data[1]=19043554009546769L;
		data[2]=4666287662003394952L;
		data[3]=4913147918581497856L;
		data[4]=8396959325669838928L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460765997580480L;
		data[8]=865183731141169152L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442362643714L;
		data[13]=-9222949799676084200L;
		data[14]=131203L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_13 = new BitSet(mk_tokenSet_13());
	private static final long[] mk_tokenSet_14() {
		long[] data = new long[26];
		data[1]=8L;
		data[2]=562949953421312L;
		data[4]=4294967552L;
		data[6]=2199023255552L;
		data[7]=2048L;
		data[9]=384L;
		data[11]=144115188075855872L;
		data[12]=2097152L;
		return data;
	}
	public static final BitSet _tokenSet_14 = new BitSet(mk_tokenSet_14());
	private static final long[] mk_tokenSet_15() {
		long[] data = new long[24];
		data[7]=1024L;
		data[10]=2199023255552L;
		data[11]=72057594172145664L;
		return data;
	}
	public static final BitSet _tokenSet_15 = new BitSet(mk_tokenSet_15());
	private static final long[] mk_tokenSet_16() {
		long[] data = new long[24];
		data[0]=514L;
		data[7]=1024L;
		data[10]=2199023255552L;
		data[11]=72057594172145664L;
		return data;
	}
	public static final BitSet _tokenSet_16 = new BitSet(mk_tokenSet_16());
	private static final long[] mk_tokenSet_17() {
		long[] data = new long[36];
		data[1]=549764202496L;
		data[2]=36029071896870913L;
		data[3]=2097152L;
		data[4]=1073741824L;
		data[5]=4194304L;
		data[6]=108086391056891906L;
		data[7]=256L;
		data[9]=288230376151711744L;
		data[10]=549755813896L;
		data[13]=16777216L;
		data[16]=83886094L;
		data[17]=1152921642045800448L;
		return data;
	}
	public static final BitSet _tokenSet_17 = new BitSet(mk_tokenSet_17());
	private static final long[] mk_tokenSet_18() {
		long[] data = new long[38];
		data[0]=71477924201994L;
		data[1]=1162021114512248834L;
		data[2]=217298682054181952L;
		data[3]=1649281804293L;
		data[4]=162129895823114388L;
		data[5]=-4575515933895556992L;
		data[6]=2254033197203457L;
		data[7]=3229618176L;
		data[8]=117691452443591680L;
		data[9]=580968854180593736L;
		data[10]=-4607160426940063358L;
		data[11]=1153071038188749824L;
		data[12]=89240976505176076L;
		data[13]=86050L;
		data[15]=2251834173489216L;
		data[17]=4952122499200L;
		data[18]=140737757323264L;
		return data;
	}
	public static final BitSet _tokenSet_18 = new BitSet(mk_tokenSet_18());
	private static final long[] mk_tokenSet_19() {
		long[] data = new long[28];
		data[0]=4398046511104L;
		data[6]=8L;
		data[9]=32768L;
		data[12]=70368744177664L;
		data[13]=68719476736L;
		return data;
	}
	public static final BitSet _tokenSet_19 = new BitSet(mk_tokenSet_19());
	private static final long[] mk_tokenSet_20() {
		long[] data = new long[38];
		data[0]=4398046511104L;
		data[1]=1152921538966585352L;
		data[2]=72620543991480320L;
		data[3]=134217728L;
		data[4]=279172874512L;
		data[5]=36028797086072832L;
		data[6]=2199023779840L;
		data[7]=4194304L;
		data[8]=1024L;
		data[9]=128L;
		data[13]=8192L;
		data[15]=65536L;
		data[16]=96L;
		data[17]=103079215104L;
		data[18]=26388279066624L;
		return data;
	}
	public static final BitSet _tokenSet_20 = new BitSet(mk_tokenSet_20());
	private static final long[] mk_tokenSet_21() {
		long[] data = new long[26];
		data[0]=288230376151711744L;
		data[2]=8388608L;
		data[7]=262208L;
		data[11]=927741523238322176L;
		data[12]=2147483648L;
		return data;
	}
	public static final BitSet _tokenSet_21 = new BitSet(mk_tokenSet_21());
	private static final long[] mk_tokenSet_22() {
		long[] data = new long[38];
		data[1]=562949955519488L;
		data[5]=1048576L;
		data[8]=536870912L;
		data[9]=1125899906842624L;
		data[12]=4294967296L;
		data[13]=34363932672L;
		data[15]=4L;
		data[18]=70368744177664L;
		return data;
	}
	public static final BitSet _tokenSet_22 = new BitSet(mk_tokenSet_22());
	private static final long[] mk_tokenSet_23() {
		long[] data = new long[28];
		data[1]=2341871806232657920L;
		data[10]=1168231104512L;
		data[13]=110500918591488L;
		return data;
	}
	public static final BitSet _tokenSet_23 = new BitSet(mk_tokenSet_23());
	private static final long[] mk_tokenSet_24() {
		long[] data = new long[20];
		data[1]=8L;
		data[2]=562949953421312L;
		data[4]=256L;
		data[9]=128L;
		return data;
	}
	public static final BitSet _tokenSet_24 = new BitSet(mk_tokenSet_24());
	private static final long[] mk_tokenSet_25() {
		long[] data = new long[28];
		data[0]=70368744177664L;
		data[2]=33554432L;
		data[3]=4L;
		data[4]=131072L;
		data[13]=274877906944L;
		return data;
	}
	public static final BitSet _tokenSet_25 = new BitSet(mk_tokenSet_25());
	private static final long[] mk_tokenSet_26() {
		long[] data = new long[38];
		data[0]=71477924201984L;
		data[1]=9099575545663490L;
		data[2]=145241088016254016L;
		data[3]=1649281804293L;
		data[4]=162129895823114372L;
		data[5]=-4611544730914520960L;
		data[6]=2251834173423617L;
		data[7]=3229618176L;
		data[8]=117691452443590656L;
		data[9]=580968854180593736L;
		data[10]=-4607160426940063358L;
		data[11]=1153071038188749824L;
		data[12]=89240839066222604L;
		data[13]=86050L;
		data[15]=2251834173423680L;
		data[17]=4952122499200L;
		data[18]=140737757323264L;
		return data;
	}
	public static final BitSet _tokenSet_26 = new BitSet(mk_tokenSet_26());
	private static final long[] mk_tokenSet_27() {
		long[] data = new long[38];
		data[0]=71477924201984L;
		data[1]=9099575545663490L;
		data[2]=145241088016254016L;
		data[3]=1649281804293L;
		data[4]=162129895823114372L;
		data[5]=-4611544730914520960L;
		data[6]=2251834173423617L;
		data[7]=3766489088L;
		data[8]=117691452712026112L;
		data[9]=580968854180593736L;
		data[10]=-4607160426940063358L;
		data[11]=1153071038188749824L;
		data[12]=89240839066222604L;
		data[13]=86050L;
		data[15]=2251834173423680L;
		data[17]=4952122499200L;
		data[18]=140737757323264L;
		return data;
	}
	public static final BitSet _tokenSet_27 = new BitSet(mk_tokenSet_27());
	private static final long[] mk_tokenSet_28() {
		long[] data = new long[38];
		data[0]=71477924201984L;
		data[1]=9099575545663490L;
		data[2]=145241088016254016L;
		data[3]=1649281804293L;
		data[4]=162129895823114372L;
		data[5]=-4611544730914520960L;
		data[6]=2251834173423617L;
		data[7]=3229618176L;
		data[8]=117691452712026112L;
		data[9]=580968854180593736L;
		data[10]=-4607160426940063358L;
		data[11]=1153071038188749824L;
		data[12]=89240839066222604L;
		data[13]=86050L;
		data[15]=2251834173423680L;
		data[17]=4952122499200L;
		data[18]=140737757323264L;
		return data;
	}
	public static final BitSet _tokenSet_28 = new BitSet(mk_tokenSet_28());
	private static final long[] mk_tokenSet_29() {
		long[] data = new long[38];
		data[0]=75875970713088L;
		data[1]=1162021114512248834L;
		data[2]=217298682054181952L;
		data[3]=1649281804293L;
		data[4]=162129895823114388L;
		data[5]=-4575515933895556992L;
		data[6]=2254033197203457L;
		data[7]=3229618176L;
		data[8]=117691452443591680L;
		data[9]=580968854180593736L;
		data[10]=-4607160426940063358L;
		data[11]=1153071038188749824L;
		data[12]=89240839066222604L;
		data[13]=86050L;
		data[15]=2251834173489216L;
		data[17]=4952122499200L;
		data[18]=140737757323264L;
		return data;
	}
	public static final BitSet _tokenSet_29 = new BitSet(mk_tokenSet_29());
	private static final long[] mk_tokenSet_30() {
		long[] data = new long[38];
		data[0]=720584758095491922L;
		data[1]=19043554009546769L;
		data[2]=4666287662003394952L;
		data[3]=4913147918581497856L;
		data[4]=8396959325669838928L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460765997580480L;
		data[8]=865183731141169152L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303027950208744956L;
		data[12]=3458766442362643714L;
		data[13]=-9222949765316345832L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1229434388481L;
		return data;
	}
	public static final BitSet _tokenSet_30 = new BitSet(mk_tokenSet_30());
	private static final long[] mk_tokenSet_31() {
		long[] data = new long[38];
		data[0]=514L;
		data[11]=562949953421312L;
		data[13]=34359738368L;
		data[18]=1073741824L;
		return data;
	}
	public static final BitSet _tokenSet_31 = new BitSet(mk_tokenSet_31());
	private static final long[] mk_tokenSet_32() {
		long[] data = new long[38];
		data[0]=720584758095491408L;
		data[1]=19043554009546769L;
		data[2]=4666287662003394952L;
		data[3]=7218990927795191808L;
		data[4]=8396959325669838928L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460765997580480L;
		data[8]=865183731141169152L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442362643714L;
		data[13]=-9222949799676084200L;
		data[14]=131L;
		data[15]=361411909836079632L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_32 = new BitSet(mk_tokenSet_32());
	private static final long[] mk_tokenSet_33() {
		long[] data = new long[38];
		data[0]=720584740915622224L;
		data[1]=19043554009546768L;
		data[2]=4666287662003390856L;
		data[3]=4912584968628076544L;
		data[4]=8360930528650874960L;
		data[5]=1126451814498134L;
		data[6]=1510339491481969202L;
		data[7]=576460765729145024L;
		data[8]=865183713961283584L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442362643714L;
		data[13]=-9222949799676084200L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_33 = new BitSet(mk_tokenSet_33());
	private static final long[] mk_tokenSet_34() {
		long[] data = new long[38];
		data[0]=720584741184057680L;
		data[1]=19043554009546768L;
		data[2]=4666287662003390856L;
		data[3]=4912584968628076544L;
		data[4]=8360930528650874960L;
		data[5]=1126451814498134L;
		data[6]=1510339491481969202L;
		data[7]=576460765729145024L;
		data[8]=865183713961283584L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442362643714L;
		data[13]=-9222949799676084200L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_34 = new BitSet(mk_tokenSet_34());
	private static final long[] mk_tokenSet_35() {
		long[] data = new long[38];
		data[0]=720584758095491408L;
		data[1]=19043554009546769L;
		data[2]=4666287662003394952L;
		data[3]=4913147918581497856L;
		data[4]=8396959325669838928L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460765997580480L;
		data[8]=865183731141169152L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442362643714L;
		data[13]=-9222949799676084136L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_35 = new BitSet(mk_tokenSet_35());
	private static final long[] mk_tokenSet_36() {
		long[] data = new long[38];
		data[0]=720584758095491408L;
		data[1]=19043554009546769L;
		data[2]=4666287662003394952L;
		data[3]=4913147918581497856L;
		data[4]=8396959325669840976L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460765997580480L;
		data[8]=865183731145363456L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442362643714L;
		data[13]=-9222949799676084200L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_36 = new BitSet(mk_tokenSet_36());
	private static final long[] mk_tokenSet_37() {
		long[] data = new long[38];
		data[0]=720584758095491408L;
		data[1]=19043554009546769L;
		data[2]=4666287662003394952L;
		data[3]=4913147918581497856L;
		data[4]=8396959325669838928L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460765997580480L;
		data[8]=865183731145363456L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442362643714L;
		data[13]=-9222949799676084200L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_37 = new BitSet(mk_tokenSet_37());
	private static final long[] mk_tokenSet_38() {
		long[] data = new long[20];
		data[0]=514L;
		data[7]=2251799813685248L;
		data[9]=64L;
		return data;
	}
	public static final BitSet _tokenSet_38 = new BitSet(mk_tokenSet_38());
	private static final long[] mk_tokenSet_39() {
		long[] data = new long[56];
		data[0]=-528L;
		for (int i = 1; i<=9; i++) { data[i]=-1L; }
		data[10]=-65L;
		for (int i = 11; i<=12; i++) { data[i]=-1L; }
		data[13]=-65L;
		for (int i = 14; i<=17; i++) { data[i]=-1L; }
		data[18]=562949953421311L;
		return data;
	}
	public static final BitSet _tokenSet_39 = new BitSet(mk_tokenSet_39());
	private static final long[] mk_tokenSet_40() {
		long[] data = new long[19];
		data[0]=-9223372036854775294L;
		data[5]=281474976710656L;
		data[7]=4611686018427392000L;
		return data;
	}
	public static final BitSet _tokenSet_40 = new BitSet(mk_tokenSet_40());
	private static final long[] mk_tokenSet_41() {
		long[] data = new long[38];
		data[0]=720584758095491922L;
		data[1]=19043554009546769L;
		data[2]=4666287662003919240L;
		data[3]=4913147918581497856L;
		data[4]=8396959325669838928L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460765997580480L;
		data[8]=865183731141169152L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590831308471804L;
		data[12]=3458784034548688130L;
		data[13]=-9222949799676084200L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_41 = new BitSet(mk_tokenSet_41());
	private static final long[] mk_tokenSet_42() {
		long[] data = new long[38];
		data[0]=720584758095491922L;
		data[1]=19043554009546769L;
		data[2]=4666287662003394952L;
		data[3]=4913147918581497856L;
		data[4]=8396959325669838928L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460765997580480L;
		data[8]=865183731141169152L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590831308471804L;
		data[12]=3458766442362643714L;
		data[13]=-9222949799676084200L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_42 = new BitSet(mk_tokenSet_42());
	private static final long[] mk_tokenSet_43() {
		long[] data = new long[38];
		data[0]=720584758095491408L;
		data[1]=19043554009546769L;
		data[2]=4666287662003394952L;
		data[3]=4913147918581497856L;
		data[4]=8396959325669838928L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460765997580480L;
		data[8]=865183731141169152L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442366838018L;
		data[13]=-9222949799676084200L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_43 = new BitSet(mk_tokenSet_43());
	private static final long[] mk_tokenSet_44() {
		long[] data = new long[38];
		data[0]=720584758363926864L;
		data[1]=19043554009546769L;
		data[2]=4666287662003394952L;
		data[3]=4913147918581497856L;
		data[4]=8396959325669838928L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460765997580480L;
		data[8]=865183731141169152L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442366838018L;
		data[13]=-9222949799676084200L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_44 = new BitSet(mk_tokenSet_44());
	private static final long[] mk_tokenSet_45() {
		long[] data = new long[38];
		data[0]=720584758363926864L;
		data[1]=19043554009546769L;
		data[2]=4666287662003394952L;
		data[3]=4913147918581497856L;
		data[4]=8396959325669838928L;
		data[5]=1126451816595286L;
		data[6]=-7136571775889513934L;
		data[7]=576460765997580480L;
		data[8]=865183731141169152L;
		data[9]=-2998834386360598512L;
		data[10]=6775666242893120024L;
		data[11]=-2303590900162166268L;
		data[12]=3458766442362643714L;
		data[13]=-9222949799676084200L;
		data[14]=131L;
		data[15]=361411909712347664L;
		data[16]=9197085240081350022L;
		data[17]=5764609754271717120L;
		data[18]=1228360646657L;
		return data;
	}
	public static final BitSet _tokenSet_45 = new BitSet(mk_tokenSet_45());
	}
	
