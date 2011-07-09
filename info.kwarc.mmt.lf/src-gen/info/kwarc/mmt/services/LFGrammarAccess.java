/*
* generated by Xtext
*/

package info.kwarc.mmt.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class LFGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cDeclarationsAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cDeclarationsAlternatives_0 = (Alternatives)cDeclarationsAssignment.eContents().get(0);
		private final RuleCall cDeclarationsNamespaceDeclarationParserRuleCall_0_0 = (RuleCall)cDeclarationsAlternatives_0.eContents().get(0);
		private final RuleCall cDeclarationsSignatureDeclarationParserRuleCall_0_1 = (RuleCall)cDeclarationsAlternatives_0.eContents().get(1);
		private final RuleCall cDeclarationsReadDeclarationParserRuleCall_0_2 = (RuleCall)cDeclarationsAlternatives_0.eContents().get(2);
		private final RuleCall cDeclarationsViewDeclarationParserRuleCall_0_3 = (RuleCall)cDeclarationsAlternatives_0.eContents().get(3);
		
		//Model:
		//	declarations+=(namespaceDeclaration | signatureDeclaration | readDeclaration | viewDeclaration)*;
		public ParserRule getRule() { return rule; }

		//declarations+=(namespaceDeclaration | signatureDeclaration | readDeclaration | viewDeclaration)*
		public Assignment getDeclarationsAssignment() { return cDeclarationsAssignment; }

		//namespaceDeclaration | signatureDeclaration | readDeclaration | viewDeclaration
		public Alternatives getDeclarationsAlternatives_0() { return cDeclarationsAlternatives_0; }

		//namespaceDeclaration
		public RuleCall getDeclarationsNamespaceDeclarationParserRuleCall_0_0() { return cDeclarationsNamespaceDeclarationParserRuleCall_0_0; }

		//signatureDeclaration
		public RuleCall getDeclarationsSignatureDeclarationParserRuleCall_0_1() { return cDeclarationsSignatureDeclarationParserRuleCall_0_1; }

		//readDeclaration
		public RuleCall getDeclarationsReadDeclarationParserRuleCall_0_2() { return cDeclarationsReadDeclarationParserRuleCall_0_2; }

		//viewDeclaration
		public RuleCall getDeclarationsViewDeclarationParserRuleCall_0_3() { return cDeclarationsViewDeclarationParserRuleCall_0_3; }
	}

	public class NAMESPACEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NAMESPACE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//NAMESPACE:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class URIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "URI");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonSolidusSolidusKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cNAMESPACEParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cSolidusKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//URI:
		//	(ID "://")? NAMESPACE ("/" ID)*;
		public ParserRule getRule() { return rule; }

		//(ID "://")? NAMESPACE ("/" ID)*
		public Group getGroup() { return cGroup; }

		//(ID "://")?
		public Group getGroup_0() { return cGroup_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_0_0() { return cIDTerminalRuleCall_0_0; }

		//"://"
		public Keyword getColonSolidusSolidusKeyword_0_1() { return cColonSolidusSolidusKeyword_0_1; }

		//NAMESPACE
		public RuleCall getNAMESPACEParserRuleCall_1() { return cNAMESPACEParserRuleCall_1; }

		//("/" ID)*
		public Group getGroup_2() { return cGroup_2; }

		//"/"
		public Keyword getSolidusKeyword_2_0() { return cSolidusKeyword_2_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}

	public class URISTRINGElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "URISTRING");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuotationMarkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cURIParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cQuotationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//URISTRING:
		//	"\"" URI "\"";
		public ParserRule getRule() { return rule; }

		//"\"" URI "\""
		public Group getGroup() { return cGroup; }

		//"\""
		public Keyword getQuotationMarkKeyword_0() { return cQuotationMarkKeyword_0; }

		//URI
		public RuleCall getURIParserRuleCall_1() { return cURIParserRuleCall_1; }

		//"\""
		public Keyword getQuotationMarkKeyword_2() { return cQuotationMarkKeyword_2; }
	}

	public class ReadDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "readDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReadKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFileAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFileURISTRINGParserRuleCall_1_0 = (RuleCall)cFileAssignment_1.eContents().get(0);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//readDeclaration:
		//	"%read" file=URISTRING ".";
		public ParserRule getRule() { return rule; }

		//"%read" file=URISTRING "."
		public Group getGroup() { return cGroup; }

		//"%read"
		public Keyword getReadKeyword_0() { return cReadKeyword_0; }

		//file=URISTRING
		public Assignment getFileAssignment_1() { return cFileAssignment_1; }

		//URISTRING
		public RuleCall getFileURISTRINGParserRuleCall_1_0() { return cFileURISTRINGParserRuleCall_1_0; }

		//"."
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
	}

	public class NamespaceDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "namespaceDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNamespaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cUriAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUriURISTRINGParserRuleCall_2_0 = (RuleCall)cUriAssignment_2.eContents().get(0);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//namespaceDeclaration:
		//	"%namespace" (name=ID "=")? uri=URISTRING ".";
		public ParserRule getRule() { return rule; }

		//"%namespace" (name=ID "=")? uri=URISTRING "."
		public Group getGroup() { return cGroup; }

		//"%namespace"
		public Keyword getNamespaceKeyword_0() { return cNamespaceKeyword_0; }

		//(name=ID "=")?
		public Group getGroup_1() { return cGroup_1; }

		//name=ID
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_0() { return cNameIDTerminalRuleCall_1_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1_1() { return cEqualsSignKeyword_1_1; }

		//uri=URISTRING
		public Assignment getUriAssignment_2() { return cUriAssignment_2; }

		//URISTRING
		public RuleCall getUriURISTRINGParserRuleCall_2_0() { return cUriURISTRINGParserRuleCall_2_0; }

		//"."
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
	}

	public class SignatureDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "signatureDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSigKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSigNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSigNameIDTerminalRuleCall_1_0 = (RuleCall)cSigNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSigDefinitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSigDefinitionsSigDefinitionsParserRuleCall_4_0 = (RuleCall)cSigDefinitionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cFullStopKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//signatureDeclaration:
		//	"%sig" sigName=ID "=" "{" sigDefinitions+=sigDefinitions* "}" ".";
		public ParserRule getRule() { return rule; }

		//"%sig" sigName=ID "=" "{" sigDefinitions+=sigDefinitions* "}" "."
		public Group getGroup() { return cGroup; }

		//"%sig"
		public Keyword getSigKeyword_0() { return cSigKeyword_0; }

		//sigName=ID
		public Assignment getSigNameAssignment_1() { return cSigNameAssignment_1; }

		//ID
		public RuleCall getSigNameIDTerminalRuleCall_1_0() { return cSigNameIDTerminalRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//sigDefinitions+=sigDefinitions*
		public Assignment getSigDefinitionsAssignment_4() { return cSigDefinitionsAssignment_4; }

		//sigDefinitions
		public RuleCall getSigDefinitionsSigDefinitionsParserRuleCall_4_0() { return cSigDefinitionsSigDefinitionsParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//"."
		public Keyword getFullStopKeyword_6() { return cFullStopKeyword_6; }
	}

	public class SigDefinitionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "sigDefinitions");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cSymbNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cSymbNameIDTerminalRuleCall_0_0_0 = (RuleCall)cSymbNameAssignment_0_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final Keyword cColonKeyword_0_1_0 = (Keyword)cAlternatives_0_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_0_1_1 = (Keyword)cAlternatives_0_1.eContents().get(1);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Assignment cTypeAssignment_0_2_0 = (Assignment)cGroup_0_2.eContents().get(0);
		private final RuleCall cTypeIDTerminalRuleCall_0_2_0_0 = (RuleCall)cTypeAssignment_0_2_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_0_2_1 = (Keyword)cGroup_0_2.eContents().get(1);
		private final RuleCall cNAMESPACEParserRuleCall_0_3 = (RuleCall)cGroup_0.eContents().get(3);
		private final Keyword cFullStopKeyword_0_4 = (Keyword)cGroup_0.eContents().get(4);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cIncludeKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNamespaceAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNamespaceNAMESPACEParserRuleCall_1_1_0 = (RuleCall)cNamespaceAssignment_1_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cStructKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cStructNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cStructNameIDTerminalRuleCall_2_1_0 = (RuleCall)cStructNameAssignment_2_1.eContents().get(0);
		private final Keyword cColonKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cNamespaceAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final RuleCall cNamespaceNAMESPACEParserRuleCall_2_3_0 = (RuleCall)cNamespaceAssignment_2_3.eContents().get(0);
		private final Keyword cFullStopKeyword_2_4 = (Keyword)cGroup_2.eContents().get(4);
		
		//sigDefinitions:
		//	symbName=ID (":" | ":=") (type=ID "=")? NAMESPACE "." | "%include" namespace=NAMESPACE "." | "%struct" structName=ID
		//	":" namespace=NAMESPACE ".";
		public ParserRule getRule() { return rule; }

		//symbName=ID (":" | ":=") (type=ID "=")? NAMESPACE "." | "%include" namespace=NAMESPACE "." | "%struct" structName=ID ":"
		//namespace=NAMESPACE "."
		public Alternatives getAlternatives() { return cAlternatives; }

		//symbName=ID (":" | ":=") (type=ID "=")? NAMESPACE "."
		public Group getGroup_0() { return cGroup_0; }

		//symbName=ID
		public Assignment getSymbNameAssignment_0_0() { return cSymbNameAssignment_0_0; }

		//ID
		public RuleCall getSymbNameIDTerminalRuleCall_0_0_0() { return cSymbNameIDTerminalRuleCall_0_0_0; }

		//":" | ":="
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }

		//":"
		public Keyword getColonKeyword_0_1_0() { return cColonKeyword_0_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_0_1_1() { return cColonEqualsSignKeyword_0_1_1; }

		//(type=ID "=")?
		public Group getGroup_0_2() { return cGroup_0_2; }

		//type=ID
		public Assignment getTypeAssignment_0_2_0() { return cTypeAssignment_0_2_0; }

		//ID
		public RuleCall getTypeIDTerminalRuleCall_0_2_0_0() { return cTypeIDTerminalRuleCall_0_2_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_0_2_1() { return cEqualsSignKeyword_0_2_1; }

		//NAMESPACE
		public RuleCall getNAMESPACEParserRuleCall_0_3() { return cNAMESPACEParserRuleCall_0_3; }

		//"."
		public Keyword getFullStopKeyword_0_4() { return cFullStopKeyword_0_4; }

		//"%include" namespace=NAMESPACE "."
		public Group getGroup_1() { return cGroup_1; }

		//"%include"
		public Keyword getIncludeKeyword_1_0() { return cIncludeKeyword_1_0; }

		//namespace=NAMESPACE
		public Assignment getNamespaceAssignment_1_1() { return cNamespaceAssignment_1_1; }

		//NAMESPACE
		public RuleCall getNamespaceNAMESPACEParserRuleCall_1_1_0() { return cNamespaceNAMESPACEParserRuleCall_1_1_0; }

		//"."
		public Keyword getFullStopKeyword_1_2() { return cFullStopKeyword_1_2; }

		//"%struct" structName=ID ":" namespace=NAMESPACE "."
		public Group getGroup_2() { return cGroup_2; }

		//"%struct"
		public Keyword getStructKeyword_2_0() { return cStructKeyword_2_0; }

		//structName=ID
		public Assignment getStructNameAssignment_2_1() { return cStructNameAssignment_2_1; }

		//ID
		public RuleCall getStructNameIDTerminalRuleCall_2_1_0() { return cStructNameIDTerminalRuleCall_2_1_0; }

		//":"
		public Keyword getColonKeyword_2_2() { return cColonKeyword_2_2; }

		//namespace=NAMESPACE
		public Assignment getNamespaceAssignment_2_3() { return cNamespaceAssignment_2_3; }

		//NAMESPACE
		public RuleCall getNamespaceNAMESPACEParserRuleCall_2_3_0() { return cNamespaceNAMESPACEParserRuleCall_2_3_0; }

		//"."
		public Keyword getFullStopKeyword_2_4() { return cFullStopKeyword_2_4; }
	}

	public class TempTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TempType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Action cNamespaceDeclarationAction_0 = (Action)cAlternatives.eContents().get(0);
		private final Action cSignatureDeclarationAction_1 = (Action)cAlternatives.eContents().get(1);
		private final Assignment cFullURIAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cFullURIIDTerminalRuleCall_2_0 = (RuleCall)cFullURIAssignment_2.eContents().get(0);
		
		//TempType:
		//	{namespaceDeclaration} | {signatureDeclaration} | fullURI=ID;
		public ParserRule getRule() { return rule; }

		//{namespaceDeclaration} | {signatureDeclaration} | fullURI=ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//{namespaceDeclaration}
		public Action getNamespaceDeclarationAction_0() { return cNamespaceDeclarationAction_0; }

		//{signatureDeclaration}
		public Action getSignatureDeclarationAction_1() { return cSignatureDeclarationAction_1; }

		//fullURI=ID
		public Assignment getFullURIAssignment_2() { return cFullURIAssignment_2; }

		//ID
		public RuleCall getFullURIIDTerminalRuleCall_2_0() { return cFullURIIDTerminalRuleCall_2_0; }
	}

	public class ViewDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "viewDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cViewKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cViewIDAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cViewIDIDTerminalRuleCall_1_0 = (RuleCall)cViewIDAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFromAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFromNAMESPACEParserRuleCall_3_0 = (RuleCall)cFromAssignment_3.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cToAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cToNAMESPACEParserRuleCall_5_0 = (RuleCall)cToAssignment_5.eContents().get(0);
		private final Keyword cEqualsSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cViewDefinitionsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cViewDefinitionsSigDefinitionsParserRuleCall_8_0 = (RuleCall)cViewDefinitionsAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cFullStopKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//viewDeclaration:
		//	"%view" viewID=ID ":" from=NAMESPACE "->" to=NAMESPACE "=" "{" viewDefinitions+=sigDefinitions "}" ".";
		public ParserRule getRule() { return rule; }

		//"%view" viewID=ID ":" from=NAMESPACE "->" to=NAMESPACE "=" "{" viewDefinitions+=sigDefinitions "}" "."
		public Group getGroup() { return cGroup; }

		//"%view"
		public Keyword getViewKeyword_0() { return cViewKeyword_0; }

		//viewID=ID
		public Assignment getViewIDAssignment_1() { return cViewIDAssignment_1; }

		//ID
		public RuleCall getViewIDIDTerminalRuleCall_1_0() { return cViewIDIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//from=NAMESPACE
		public Assignment getFromAssignment_3() { return cFromAssignment_3; }

		//NAMESPACE
		public RuleCall getFromNAMESPACEParserRuleCall_3_0() { return cFromNAMESPACEParserRuleCall_3_0; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_4() { return cHyphenMinusGreaterThanSignKeyword_4; }

		//to=NAMESPACE
		public Assignment getToAssignment_5() { return cToAssignment_5; }

		//NAMESPACE
		public RuleCall getToNAMESPACEParserRuleCall_5_0() { return cToNAMESPACEParserRuleCall_5_0; }

		//"="
		public Keyword getEqualsSignKeyword_6() { return cEqualsSignKeyword_6; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_7() { return cLeftCurlyBracketKeyword_7; }

		//viewDefinitions+=sigDefinitions
		public Assignment getViewDefinitionsAssignment_8() { return cViewDefinitionsAssignment_8; }

		//sigDefinitions
		public RuleCall getViewDefinitionsSigDefinitionsParserRuleCall_8_0() { return cViewDefinitionsSigDefinitionsParserRuleCall_8_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }

		//"."
		public Keyword getFullStopKeyword_10() { return cFullStopKeyword_10; }
	}
	
	
	private ModelElements pModel;
	private TerminalRule tINT;
	private TerminalRule tWS;
	private TerminalRule tID;
	private NAMESPACEElements pNAMESPACE;
	private URIElements pURI;
	private URISTRINGElements pURISTRING;
	private ReadDeclarationElements pReadDeclaration;
	private TerminalRule tML_COMMENT;
	private TerminalRule tML2_COMMENT;
	private TerminalRule tSL_COMMENT;
	private TerminalRule tANY_OTHER;
	private NamespaceDeclarationElements pNamespaceDeclaration;
	private SignatureDeclarationElements pSignatureDeclaration;
	private SigDefinitionsElements pSigDefinitions;
	private TempTypeElements pTempType;
	private ViewDeclarationElements pViewDeclaration;
	
	private final GrammarProvider grammarProvider;

	@Inject
	public LFGrammarAccess(GrammarProvider grammarProvider) {
		this.grammarProvider = grammarProvider;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	
	//Model:
	//	declarations+=(namespaceDeclaration | signatureDeclaration | readDeclaration | viewDeclaration)*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return (tINT != null) ? tINT : (tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INT"));
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 

	//terminal ID:
	//	("a".."z" | "A".."Z" | "0".."9")*;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//NAMESPACE:
	//	ID ("." ID)*;
	public NAMESPACEElements getNAMESPACEAccess() {
		return (pNAMESPACE != null) ? pNAMESPACE : (pNAMESPACE = new NAMESPACEElements());
	}
	
	public ParserRule getNAMESPACERule() {
		return getNAMESPACEAccess().getRule();
	}

	//URI:
	//	(ID "://")? NAMESPACE ("/" ID)*;
	public URIElements getURIAccess() {
		return (pURI != null) ? pURI : (pURI = new URIElements());
	}
	
	public ParserRule getURIRule() {
		return getURIAccess().getRule();
	}

	//URISTRING:
	//	"\"" URI "\"";
	public URISTRINGElements getURISTRINGAccess() {
		return (pURISTRING != null) ? pURISTRING : (pURISTRING = new URISTRINGElements());
	}
	
	public ParserRule getURISTRINGRule() {
		return getURISTRINGAccess().getRule();
	}

	//readDeclaration:
	//	"%read" file=URISTRING ".";
	public ReadDeclarationElements getReadDeclarationAccess() {
		return (pReadDeclaration != null) ? pReadDeclaration : (pReadDeclaration = new ReadDeclarationElements());
	}
	
	public ParserRule getReadDeclarationRule() {
		return getReadDeclarationAccess().getRule();
	}

	//terminal ML_COMMENT:
	//	"%{"->"}%";
	public TerminalRule getML_COMMENTRule() {
		return (tML_COMMENT != null) ? tML_COMMENT : (tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ML_COMMENT"));
	} 

	//terminal ML2_COMMENT:
	//	"%*"->"*%";
	public TerminalRule getML2_COMMENTRule() {
		return (tML2_COMMENT != null) ? tML2_COMMENT : (tML2_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ML2_COMMENT"));
	} 

	//terminal SL_COMMENT:
	//	"%" (" " | "%") !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return (tANY_OTHER != null) ? tANY_OTHER : (tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ANY_OTHER"));
	} 

	//namespaceDeclaration:
	//	"%namespace" (name=ID "=")? uri=URISTRING ".";
	public NamespaceDeclarationElements getNamespaceDeclarationAccess() {
		return (pNamespaceDeclaration != null) ? pNamespaceDeclaration : (pNamespaceDeclaration = new NamespaceDeclarationElements());
	}
	
	public ParserRule getNamespaceDeclarationRule() {
		return getNamespaceDeclarationAccess().getRule();
	}

	//signatureDeclaration:
	//	"%sig" sigName=ID "=" "{" sigDefinitions+=sigDefinitions* "}" ".";
	public SignatureDeclarationElements getSignatureDeclarationAccess() {
		return (pSignatureDeclaration != null) ? pSignatureDeclaration : (pSignatureDeclaration = new SignatureDeclarationElements());
	}
	
	public ParserRule getSignatureDeclarationRule() {
		return getSignatureDeclarationAccess().getRule();
	}

	//sigDefinitions:
	//	symbName=ID (":" | ":=") (type=ID "=")? NAMESPACE "." | "%include" namespace=NAMESPACE "." | "%struct" structName=ID
	//	":" namespace=NAMESPACE ".";
	public SigDefinitionsElements getSigDefinitionsAccess() {
		return (pSigDefinitions != null) ? pSigDefinitions : (pSigDefinitions = new SigDefinitionsElements());
	}
	
	public ParserRule getSigDefinitionsRule() {
		return getSigDefinitionsAccess().getRule();
	}

	//TempType:
	//	{namespaceDeclaration} | {signatureDeclaration} | fullURI=ID;
	public TempTypeElements getTempTypeAccess() {
		return (pTempType != null) ? pTempType : (pTempType = new TempTypeElements());
	}
	
	public ParserRule getTempTypeRule() {
		return getTempTypeAccess().getRule();
	}

	//viewDeclaration:
	//	"%view" viewID=ID ":" from=NAMESPACE "->" to=NAMESPACE "=" "{" viewDefinitions+=sigDefinitions "}" ".";
	public ViewDeclarationElements getViewDeclarationAccess() {
		return (pViewDeclaration != null) ? pViewDeclaration : (pViewDeclaration = new ViewDeclarationElements());
	}
	
	public ParserRule getViewDeclarationRule() {
		return getViewDeclarationAccess().getRule();
	}
}
