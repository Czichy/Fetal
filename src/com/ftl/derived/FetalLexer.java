// Generated from Fetal.g4 by ANTLR 4.5.2

package com.ftl.derived;
import com.ftl.helper.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.lang.reflect.InvocationTargetException;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FetalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, DecimalType=14, NumberType=15, 
		StringType=16, BooleanType=17, DateType=18, ObjectType=19, DaoType=20, 
		Equals=21, PlusEquals=22, MinusEquals=23, MultiplyEquals=24, DivideEquals=25, 
		ModuloEquals=26, ExponentEquals=27, Plus=28, Minus=29, Multiply=30, Divide=31, 
		Modulo=32, Exponent=33, And=34, Or=35, Not=36, IsEqualTo=37, IsLessThan=38, 
		IsLessThanOrEqualTo=39, IsGreaterThan=40, IsGreaterThanOrEqualTo=41, IsNotEqualTo=42, 
		AndExpression=43, OrExpression=44, ExclusiveOrExpression=45, GetBalance=46, 
		GetVariableType=47, GetDescription=48, Today=49, GetDays=50, DayOfTheWeek=51, 
		GetCalendarDay=52, GetMonth=53, GetYear=54, Import=55, Lookup=56, Update=57, 
		List=58, Credit=59, Debit=60, Ledger=61, Alias=62, MapFile=63, IfStatement=64, 
		Else=65, Print=66, Percentage=67, Boolean=68, Number=69, Decimal=70, Date=71, 
		Identifier=72, String=73, ExtendedAscii=74, Whitespace=75, Newline=76, 
		BlockComment=77, LineComment=78;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "DecimalType", "NumberType", "StringType", 
		"BooleanType", "DateType", "ObjectType", "DaoType", "Equals", "PlusEquals", 
		"MinusEquals", "MultiplyEquals", "DivideEquals", "ModuloEquals", "ExponentEquals", 
		"Plus", "Minus", "Multiply", "Divide", "Modulo", "Exponent", "And", "Or", 
		"Not", "IsEqualTo", "IsLessThan", "IsLessThanOrEqualTo", "IsGreaterThan", 
		"IsGreaterThanOrEqualTo", "IsNotEqualTo", "AndExpression", "OrExpression", 
		"ExclusiveOrExpression", "GetBalance", "GetVariableType", "GetDescription", 
		"Today", "GetDays", "DayOfTheWeek", "GetCalendarDay", "GetMonth", "GetYear", 
		"Import", "Lookup", "Update", "List", "Credit", "Debit", "Ledger", "Alias", 
		"MapFile", "IfStatement", "Else", "Print", "Percentage", "Boolean", "Number", 
		"Decimal", "Date", "Identifier", "String", "ESC", "IdentifierNondigit", 
		"Nondigit", "Digit", "Digits", "Year", "Month", "Day", "Sign", "Dot", 
		"SCharSequence", "SChar", "CChar", "SimpleEscapeSequence", "ExtendedAscii", 
		"Whitespace", "Newline", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "';'", "'('", "')'", "'{'", "'}'", "','", "':'", 
		"'.'", "'()'", "'D'", "'C'", "'decimal'", "'number'", "'string'", "'boolean'", 
		"'date'", "'object'", "'dao'", "'='", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'^='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", 
		"'!'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'&&'", "'||'", "'^^'", 
		"'getBalance'", "'getVariableType'", "'getDescription'", "'today'", "'getDays'", 
		"'dayOfTheWeek'", "'getCalendarDay'", "'getMonth'", "'getYear'", "'import'", 
		"'lookup'", "'update'", "'list'", "'credit'", "'debit'", "'ledger'", "'alias'", 
		"'mapFile'", "'if'", "'else'", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "DecimalType", "NumberType", "StringType", "BooleanType", 
		"DateType", "ObjectType", "DaoType", "Equals", "PlusEquals", "MinusEquals", 
		"MultiplyEquals", "DivideEquals", "ModuloEquals", "ExponentEquals", "Plus", 
		"Minus", "Multiply", "Divide", "Modulo", "Exponent", "And", "Or", "Not", 
		"IsEqualTo", "IsLessThan", "IsLessThanOrEqualTo", "IsGreaterThan", "IsGreaterThanOrEqualTo", 
		"IsNotEqualTo", "AndExpression", "OrExpression", "ExclusiveOrExpression", 
		"GetBalance", "GetVariableType", "GetDescription", "Today", "GetDays", 
		"DayOfTheWeek", "GetCalendarDay", "GetMonth", "GetYear", "Import", "Lookup", 
		"Update", "List", "Credit", "Debit", "Ledger", "Alias", "MapFile", "IfStatement", 
		"Else", "Print", "Percentage", "Boolean", "Number", "Decimal", "Date", 
		"Identifier", "String", "ExtendedAscii", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


		FetalTransaction trans;
		ObjectMath	om;
		private static final int NOT_DEFINED=0, MALFORMED_EXP=1, CAST_EXCEPT=2, CANNOT_LOAD_FILE=3,
								 INVALID_DATE=4, CANNOT_LOAD_OBJECT=5, CANNOT_INVOKE_METHD=6, INVALID_OBJECT=7,
								 INVALID_ARG=8; 


	public FetalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Fetal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2P\u02ab\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3"+
		"*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\3"+
		"9\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3"+
		"=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\5D\u01fa\nD\3D\6"+
		"D\u01fd\nD\rD\16D\u01fe\3D\3D\6D\u0203\nD\rD\16D\u0204\5D\u0207\nD\3D"+
		"\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0214\nE\3F\5F\u0217\nF\3F\6F\u021a"+
		"\nF\rF\16F\u021b\3G\5G\u021f\nG\3G\6G\u0222\nG\rG\16G\u0223\3G\3G\7G\u0228"+
		"\nG\fG\16G\u022b\13G\3H\3H\3H\3H\3H\3H\3I\3I\3I\7I\u0236\nI\fI\16I\u0239"+
		"\13I\3J\3J\3J\7J\u023e\nJ\fJ\16J\u0241\13J\3J\3J\3K\3K\3K\3L\3L\3M\3M"+
		"\3N\3N\3O\5O\u024f\nO\3O\6O\u0252\nO\rO\16O\u0253\3P\3P\3P\3P\3P\3Q\3"+
		"Q\3Q\3R\3R\3R\3S\3S\5S\u0263\nS\3T\3T\3U\6U\u0268\nU\rU\16U\u0269\3V\3"+
		"V\3V\3V\3V\3V\3V\5V\u0273\nV\3W\3W\5W\u0277\nW\3X\3X\3X\3Y\6Y\u027d\n"+
		"Y\rY\16Y\u027e\3Y\3Y\3Z\6Z\u0284\nZ\rZ\16Z\u0285\3Z\3Z\3[\3[\5[\u028c"+
		"\n[\3[\5[\u028f\n[\3[\3[\3\\\3\\\3\\\3\\\7\\\u0297\n\\\f\\\16\\\u029a"+
		"\13\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\7]\u02a5\n]\f]\16]\u02a8\13]\3]"+
		"\3]\3\u0298\2^\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F"+
		"\u008bG\u008dH\u008fI\u0091J\u0093K\u0095\2\u0097\2\u0099\2\u009b\2\u009d"+
		"\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af"+
		"\2\u00b1L\u00b3M\u00b5N\u00b7O\u00b9P\3\2\r\4\2$$^^\13\2$$))^^cdhhppt"+
		"tvvxx\5\2C\\aac|\3\2\62;\4\2--//\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\f"+
		"\2$$))AA^^cdhhppttvvxx\5\2\62^ghzz\4\2\13\13\"\"\4\2\f\f\17\17\u02b8\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\3\u00bb\3\2\2"+
		"\2\5\u00c1\3\2\2\2\7\u00c5\3\2\2\2\t\u00c7\3\2\2\2\13\u00c9\3\2\2\2\r"+
		"\u00cb\3\2\2\2\17\u00cd\3\2\2\2\21\u00cf\3\2\2\2\23\u00d1\3\2\2\2\25\u00d3"+
		"\3\2\2\2\27\u00d5\3\2\2\2\31\u00d8\3\2\2\2\33\u00da\3\2\2\2\35\u00dc\3"+
		"\2\2\2\37\u00e4\3\2\2\2!\u00eb\3\2\2\2#\u00f2\3\2\2\2%\u00fa\3\2\2\2\'"+
		"\u00ff\3\2\2\2)\u0106\3\2\2\2+\u010a\3\2\2\2-\u010c\3\2\2\2/\u010f\3\2"+
		"\2\2\61\u0112\3\2\2\2\63\u0115\3\2\2\2\65\u0118\3\2\2\2\67\u011b\3\2\2"+
		"\29\u011e\3\2\2\2;\u0120\3\2\2\2=\u0122\3\2\2\2?\u0124\3\2\2\2A\u0126"+
		"\3\2\2\2C\u0128\3\2\2\2E\u012a\3\2\2\2G\u012c\3\2\2\2I\u012e\3\2\2\2K"+
		"\u0130\3\2\2\2M\u0133\3\2\2\2O\u0135\3\2\2\2Q\u0138\3\2\2\2S\u013a\3\2"+
		"\2\2U\u013d\3\2\2\2W\u0140\3\2\2\2Y\u0143\3\2\2\2[\u0146\3\2\2\2]\u0149"+
		"\3\2\2\2_\u0154\3\2\2\2a\u0164\3\2\2\2c\u0173\3\2\2\2e\u0179\3\2\2\2g"+
		"\u0181\3\2\2\2i\u018e\3\2\2\2k\u019d\3\2\2\2m\u01a6\3\2\2\2o\u01ae\3\2"+
		"\2\2q\u01b5\3\2\2\2s\u01bc\3\2\2\2u\u01c3\3\2\2\2w\u01c8\3\2\2\2y\u01cf"+
		"\3\2\2\2{\u01d5\3\2\2\2}\u01dc\3\2\2\2\177\u01e2\3\2\2\2\u0081\u01ea\3"+
		"\2\2\2\u0083\u01ed\3\2\2\2\u0085\u01f2\3\2\2\2\u0087\u01f9\3\2\2\2\u0089"+
		"\u0213\3\2\2\2\u008b\u0216\3\2\2\2\u008d\u021e\3\2\2\2\u008f\u022c\3\2"+
		"\2\2\u0091\u0232\3\2\2\2\u0093\u023a\3\2\2\2\u0095\u0244\3\2\2\2\u0097"+
		"\u0247\3\2\2\2\u0099\u0249\3\2\2\2\u009b\u024b\3\2\2\2\u009d\u024e\3\2"+
		"\2\2\u009f\u0255\3\2\2\2\u00a1\u025a\3\2\2\2\u00a3\u025d\3\2\2\2\u00a5"+
		"\u0262\3\2\2\2\u00a7\u0264\3\2\2\2\u00a9\u0267\3\2\2\2\u00ab\u0272\3\2"+
		"\2\2\u00ad\u0276\3\2\2\2\u00af\u0278\3\2\2\2\u00b1\u027c\3\2\2\2\u00b3"+
		"\u0283\3\2\2\2\u00b5\u028e\3\2\2\2\u00b7\u0292\3\2\2\2\u00b9\u02a0\3\2"+
		"\2\2\u00bb\u00bc\7d\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7i\2\2\u00be\u00bf"+
		"\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\4\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3"+
		"\7p\2\2\u00c3\u00c4\7f\2\2\u00c4\6\3\2\2\2\u00c5\u00c6\7=\2\2\u00c6\b"+
		"\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\n\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca\f"+
		"\3\2\2\2\u00cb\u00cc\7}\2\2\u00cc\16\3\2\2\2\u00cd\u00ce\7\177\2\2\u00ce"+
		"\20\3\2\2\2\u00cf\u00d0\7.\2\2\u00d0\22\3\2\2\2\u00d1\u00d2\7<\2\2\u00d2"+
		"\24\3\2\2\2\u00d3\u00d4\7\60\2\2\u00d4\26\3\2\2\2\u00d5\u00d6\7*\2\2\u00d6"+
		"\u00d7\7+\2\2\u00d7\30\3\2\2\2\u00d8\u00d9\7F\2\2\u00d9\32\3\2\2\2\u00da"+
		"\u00db\7E\2\2\u00db\34\3\2\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7e\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2\7c\2\2"+
		"\u00e2\u00e3\7n\2\2\u00e3\36\3\2\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7"+
		"w\2\2\u00e6\u00e7\7o\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea"+
		"\7t\2\2\u00ea \3\2\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7i\2\2\u00f1"+
		"\"\3\2\2\2\u00f2\u00f3\7d\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7q\2\2\u00f5"+
		"\u00f6\7n\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7p\2\2"+
		"\u00f9$\3\2\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7v\2"+
		"\2\u00fd\u00fe\7g\2\2\u00fe&\3\2\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7"+
		"d\2\2\u0101\u0102\7l\2\2\u0102\u0103\7g\2\2\u0103\u0104\7e\2\2\u0104\u0105"+
		"\7v\2\2\u0105(\3\2\2\2\u0106\u0107\7f\2\2\u0107\u0108\7c\2\2\u0108\u0109"+
		"\7q\2\2\u0109*\3\2\2\2\u010a\u010b\7?\2\2\u010b,\3\2\2\2\u010c\u010d\7"+
		"-\2\2\u010d\u010e\7?\2\2\u010e.\3\2\2\2\u010f\u0110\7/\2\2\u0110\u0111"+
		"\7?\2\2\u0111\60\3\2\2\2\u0112\u0113\7,\2\2\u0113\u0114\7?\2\2\u0114\62"+
		"\3\2\2\2\u0115\u0116\7\61\2\2\u0116\u0117\7?\2\2\u0117\64\3\2\2\2\u0118"+
		"\u0119\7\'\2\2\u0119\u011a\7?\2\2\u011a\66\3\2\2\2\u011b\u011c\7`\2\2"+
		"\u011c\u011d\7?\2\2\u011d8\3\2\2\2\u011e\u011f\7-\2\2\u011f:\3\2\2\2\u0120"+
		"\u0121\7/\2\2\u0121<\3\2\2\2\u0122\u0123\7,\2\2\u0123>\3\2\2\2\u0124\u0125"+
		"\7\61\2\2\u0125@\3\2\2\2\u0126\u0127\7\'\2\2\u0127B\3\2\2\2\u0128\u0129"+
		"\7`\2\2\u0129D\3\2\2\2\u012a\u012b\7(\2\2\u012bF\3\2\2\2\u012c\u012d\7"+
		"~\2\2\u012dH\3\2\2\2\u012e\u012f\7#\2\2\u012fJ\3\2\2\2\u0130\u0131\7?"+
		"\2\2\u0131\u0132\7?\2\2\u0132L\3\2\2\2\u0133\u0134\7>\2\2\u0134N\3\2\2"+
		"\2\u0135\u0136\7>\2\2\u0136\u0137\7?\2\2\u0137P\3\2\2\2\u0138\u0139\7"+
		"@\2\2\u0139R\3\2\2\2\u013a\u013b\7@\2\2\u013b\u013c\7?\2\2\u013cT\3\2"+
		"\2\2\u013d\u013e\7#\2\2\u013e\u013f\7?\2\2\u013fV\3\2\2\2\u0140\u0141"+
		"\7(\2\2\u0141\u0142\7(\2\2\u0142X\3\2\2\2\u0143\u0144\7~\2\2\u0144\u0145"+
		"\7~\2\2\u0145Z\3\2\2\2\u0146\u0147\7`\2\2\u0147\u0148\7`\2\2\u0148\\\3"+
		"\2\2\2\u0149\u014a\7i\2\2\u014a\u014b\7g\2\2\u014b\u014c\7v\2\2\u014c"+
		"\u014d\7D\2\2\u014d\u014e\7c\2\2\u014e\u014f\7n\2\2\u014f\u0150\7c\2\2"+
		"\u0150\u0151\7p\2\2\u0151\u0152\7e\2\2\u0152\u0153\7g\2\2\u0153^\3\2\2"+
		"\2\u0154\u0155\7i\2\2\u0155\u0156\7g\2\2\u0156\u0157\7v\2\2\u0157\u0158"+
		"\7X\2\2\u0158\u0159\7c\2\2\u0159\u015a\7t\2\2\u015a\u015b\7k\2\2\u015b"+
		"\u015c\7c\2\2\u015c\u015d\7d\2\2\u015d\u015e\7n\2\2\u015e\u015f\7g\2\2"+
		"\u015f\u0160\7V\2\2\u0160\u0161\7{\2\2\u0161\u0162\7r\2\2\u0162\u0163"+
		"\7g\2\2\u0163`\3\2\2\2\u0164\u0165\7i\2\2\u0165\u0166\7g\2\2\u0166\u0167"+
		"\7v\2\2\u0167\u0168\7F\2\2\u0168\u0169\7g\2\2\u0169\u016a\7u\2\2\u016a"+
		"\u016b\7e\2\2\u016b\u016c\7t\2\2\u016c\u016d\7k\2\2\u016d\u016e\7r\2\2"+
		"\u016e\u016f\7v\2\2\u016f\u0170\7k\2\2\u0170\u0171\7q\2\2\u0171\u0172"+
		"\7p\2\2\u0172b\3\2\2\2\u0173\u0174\7v\2\2\u0174\u0175\7q\2\2\u0175\u0176"+
		"\7f\2\2\u0176\u0177\7c\2\2\u0177\u0178\7{\2\2\u0178d\3\2\2\2\u0179\u017a"+
		"\7i\2\2\u017a\u017b\7g\2\2\u017b\u017c\7v\2\2\u017c\u017d\7F\2\2\u017d"+
		"\u017e\7c\2\2\u017e\u017f\7{\2\2\u017f\u0180\7u\2\2\u0180f\3\2\2\2\u0181"+
		"\u0182\7f\2\2\u0182\u0183\7c\2\2\u0183\u0184\7{\2\2\u0184\u0185\7Q\2\2"+
		"\u0185\u0186\7h\2\2\u0186\u0187\7V\2\2\u0187\u0188\7j\2\2\u0188\u0189"+
		"\7g\2\2\u0189\u018a\7Y\2\2\u018a\u018b\7g\2\2\u018b\u018c\7g\2\2\u018c"+
		"\u018d\7m\2\2\u018dh\3\2\2\2\u018e\u018f\7i\2\2\u018f\u0190\7g\2\2\u0190"+
		"\u0191\7v\2\2\u0191\u0192\7E\2\2\u0192\u0193\7c\2\2\u0193\u0194\7n\2\2"+
		"\u0194\u0195\7g\2\2\u0195\u0196\7p\2\2\u0196\u0197\7f\2\2\u0197\u0198"+
		"\7c\2\2\u0198\u0199\7t\2\2\u0199\u019a\7F\2\2\u019a\u019b\7c\2\2\u019b"+
		"\u019c\7{\2\2\u019cj\3\2\2\2\u019d\u019e\7i\2\2\u019e\u019f\7g\2\2\u019f"+
		"\u01a0\7v\2\2\u01a0\u01a1\7O\2\2\u01a1\u01a2\7q\2\2\u01a2\u01a3\7p\2\2"+
		"\u01a3\u01a4\7v\2\2\u01a4\u01a5\7j\2\2\u01a5l\3\2\2\2\u01a6\u01a7\7i\2"+
		"\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7v\2\2\u01a9\u01aa\7[\2\2\u01aa\u01ab"+
		"\7g\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7t\2\2\u01adn\3\2\2\2\u01ae\u01af"+
		"\7k\2\2\u01af\u01b0\7o\2\2\u01b0\u01b1\7r\2\2\u01b1\u01b2\7q\2\2\u01b2"+
		"\u01b3\7t\2\2\u01b3\u01b4\7v\2\2\u01b4p\3\2\2\2\u01b5\u01b6\7n\2\2\u01b6"+
		"\u01b7\7q\2\2\u01b7\u01b8\7q\2\2\u01b8\u01b9\7m\2\2\u01b9\u01ba\7w\2\2"+
		"\u01ba\u01bb\7r\2\2\u01bbr\3\2\2\2\u01bc\u01bd\7w\2\2\u01bd\u01be\7r\2"+
		"\2\u01be\u01bf\7f\2\2\u01bf\u01c0\7c\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2"+
		"\7g\2\2\u01c2t\3\2\2\2\u01c3\u01c4\7n\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6"+
		"\7u\2\2\u01c6\u01c7\7v\2\2\u01c7v\3\2\2\2\u01c8\u01c9\7e\2\2\u01c9\u01ca"+
		"\7t\2\2\u01ca\u01cb\7g\2\2\u01cb\u01cc\7f\2\2\u01cc\u01cd\7k\2\2\u01cd"+
		"\u01ce\7v\2\2\u01cex\3\2\2\2\u01cf\u01d0\7f\2\2\u01d0\u01d1\7g\2\2\u01d1"+
		"\u01d2\7d\2\2\u01d2\u01d3\7k\2\2\u01d3\u01d4\7v\2\2\u01d4z\3\2\2\2\u01d5"+
		"\u01d6\7n\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d8\7f\2\2\u01d8\u01d9\7i\2\2"+
		"\u01d9\u01da\7g\2\2\u01da\u01db\7t\2\2\u01db|\3\2\2\2\u01dc\u01dd\7c\2"+
		"\2\u01dd\u01de\7n\2\2\u01de\u01df\7k\2\2\u01df\u01e0\7c\2\2\u01e0\u01e1"+
		"\7u\2\2\u01e1~\3\2\2\2\u01e2\u01e3\7o\2\2\u01e3\u01e4\7c\2\2\u01e4\u01e5"+
		"\7r\2\2\u01e5\u01e6\7H\2\2\u01e6\u01e7\7k\2\2\u01e7\u01e8\7n\2\2\u01e8"+
		"\u01e9\7g\2\2\u01e9\u0080\3\2\2\2\u01ea\u01eb\7k\2\2\u01eb\u01ec\7h\2"+
		"\2\u01ec\u0082\3\2\2\2\u01ed\u01ee\7g\2\2\u01ee\u01ef\7n\2\2\u01ef\u01f0"+
		"\7u\2\2\u01f0\u01f1\7g\2\2\u01f1\u0084\3\2\2\2\u01f2\u01f3\7r\2\2\u01f3"+
		"\u01f4\7t\2\2\u01f4\u01f5\7k\2\2\u01f5\u01f6\7p\2\2\u01f6\u01f7\7v\2\2"+
		"\u01f7\u0086\3\2\2\2\u01f8\u01fa\5\u00a5S\2\u01f9\u01f8\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\5\u009bN\2\u01fc\u01fb"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0206\3\2\2\2\u0200\u0202\5\u00a7T\2\u0201\u0203\5\u009bN\2\u0202\u0201"+
		"\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0207\3\2\2\2\u0206\u0200\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u0209\7\'\2\2\u0209\u0088\3\2\2\2\u020a\u020b\7v\2\2\u020b"+
		"\u020c\7t\2\2\u020c\u020d\7w\2\2\u020d\u0214\7g\2\2\u020e\u020f\7h\2\2"+
		"\u020f\u0210\7c\2\2\u0210\u0211\7n\2\2\u0211\u0212\7u\2\2\u0212\u0214"+
		"\7g\2\2\u0213\u020a\3\2\2\2\u0213\u020e\3\2\2\2\u0214\u008a\3\2\2\2\u0215"+
		"\u0217\5\u00a5S\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219"+
		"\3\2\2\2\u0218\u021a\5\u009bN\2\u0219\u0218\3\2\2\2\u021a\u021b\3\2\2"+
		"\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u008c\3\2\2\2\u021d\u021f"+
		"\5\u00a5S\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2"+
		"\2\u0220\u0222\5\u009bN\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0229\5\u00a7"+
		"T\2\u0226\u0228\5\u009bN\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u008e\3\2\2\2\u022b\u0229\3\2"+
		"\2\2\u022c\u022d\5\u009fP\2\u022d\u022e\7/\2\2\u022e\u022f\5\u00a1Q\2"+
		"\u022f\u0230\7/\2\2\u0230\u0231\5\u00a3R\2\u0231\u0090\3\2\2\2\u0232\u0237"+
		"\5\u0097L\2\u0233\u0236\5\u0097L\2\u0234\u0236\5\u009bN\2\u0235\u0233"+
		"\3\2\2\2\u0235\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0092\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023f\7$"+
		"\2\2\u023b\u023e\5\u0095K\2\u023c\u023e\n\2\2\2\u023d\u023b\3\2\2\2\u023d"+
		"\u023c\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7$\2\2\u0243"+
		"\u0094\3\2\2\2\u0244\u0245\7^\2\2\u0245\u0246\t\3\2\2\u0246\u0096\3\2"+
		"\2\2\u0247\u0248\5\u0099M\2\u0248\u0098\3\2\2\2\u0249\u024a\t\4\2\2\u024a"+
		"\u009a\3\2\2\2\u024b\u024c\t\5\2\2\u024c\u009c\3\2\2\2\u024d\u024f\t\6"+
		"\2\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250"+
		"\u0252\t\5\2\2\u0251\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0253\u0254\3\2\2\2\u0254\u009e\3\2\2\2\u0255\u0256\5\u009bN\2\u0256"+
		"\u0257\5\u009bN\2\u0257\u0258\5\u009bN\2\u0258\u0259\5\u009bN\2\u0259"+
		"\u00a0\3\2\2\2\u025a\u025b\5\u009bN\2\u025b\u025c\5\u009bN\2\u025c\u00a2"+
		"\3\2\2\2\u025d\u025e\5\u009bN\2\u025e\u025f\5\u009bN\2\u025f\u00a4\3\2"+
		"\2\2\u0260\u0263\59\35\2\u0261\u0263\5;\36\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0261\3\2\2\2\u0263\u00a6\3\2\2\2\u0264\u0265\7\60\2\2\u0265\u00a8\3"+
		"\2\2\2\u0266\u0268\5\u00abV\2\u0267\u0266\3\2\2\2\u0268\u0269\3\2\2\2"+
		"\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u00aa\3\2\2\2\u026b\u0273"+
		"\n\7\2\2\u026c\u0273\5\u00afX\2\u026d\u026e\7^\2\2\u026e\u0273\7\f\2\2"+
		"\u026f\u0270\7^\2\2\u0270\u0271\7\17\2\2\u0271\u0273\7\f\2\2\u0272\u026b"+
		"\3\2\2\2\u0272\u026c\3\2\2\2\u0272\u026d\3\2\2\2\u0272\u026f\3\2\2\2\u0273"+
		"\u00ac\3\2\2\2\u0274\u0277\n\b\2\2\u0275\u0277\5\u00afX\2\u0276\u0274"+
		"\3\2\2\2\u0276\u0275\3\2\2\2\u0277\u00ae\3\2\2\2\u0278\u0279\7^\2\2\u0279"+
		"\u027a\t\t\2\2\u027a\u00b0\3\2\2\2\u027b\u027d\t\n\2\2\u027c\u027b\3\2"+
		"\2\2\u027d\u027e\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0281\bY\2\2\u0281\u00b2\3\2\2\2\u0282\u0284\t\13"+
		"\2\2\u0283\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\bZ\2\2\u0288\u00b4\3\2"+
		"\2\2\u0289\u028b\7\17\2\2\u028a\u028c\7\f\2\2\u028b\u028a\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028f\7\f\2\2\u028e\u0289\3\2"+
		"\2\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\b[\2\2\u0291"+
		"\u00b6\3\2\2\2\u0292\u0293\7\61\2\2\u0293\u0294\7,\2\2\u0294\u0298\3\2"+
		"\2\2\u0295\u0297\13\2\2\2\u0296\u0295\3\2\2\2\u0297\u029a\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029b\3\2\2\2\u029a\u0298\3\2"+
		"\2\2\u029b\u029c\7,\2\2\u029c\u029d\7\61\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u029f\b\\\2\2\u029f\u00b8\3\2\2\2\u02a0\u02a1\7\61\2\2\u02a1\u02a2\7"+
		"\61\2\2\u02a2\u02a6\3\2\2\2\u02a3\u02a5\n\f\2\2\u02a4\u02a3\3\2\2\2\u02a5"+
		"\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2"+
		"\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\b]\2\2\u02aa\u00ba\3\2\2\2\35\2\u01f9"+
		"\u01fe\u0204\u0206\u0213\u0216\u021b\u021e\u0223\u0229\u0235\u0237\u023d"+
		"\u023f\u024e\u0253\u0262\u0269\u0272\u0276\u027e\u0285\u028b\u028e\u0298"+
		"\u02a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}