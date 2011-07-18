package info.kwarc.mmt.tests;

import info.kwarc.mmt.LFInjectorProvider;
import info.kwarc.mmt.parser.antlr.LFParser;
import info.kwarc.mmt.parser.antlr.internal.InternalLFLexer;

import java.io.StringReader;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Token;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;

import com.google.inject.Injector;


public class ParserTest {

	static String src="%read \"test.elf\". \n" + 
			"\n" + 
			"%namespace \"http://cds.omdoc.org/test2\". \n" + 
			"\n" + 
			"%namespace ats = \"test\".\n" + 
			"\n" + 
			"%sig A' = {\n" + 
			"   %include t.A.\n  " +
			"%struct types  : Level  %open cl  %as tp \n" + 
			"%meta pf.DFOL.\n" + 
			"\n" + 
			"%{ extensionality }%\n\n\n" + 
			"  %struct dom : Category.\n" + 
			"  %struct cod : Category.\n" +
			"  # := ded in.\n" + 
			"\n" +
			"  forall' := a.\n  " +
			"forall0 := ... . %% fails  \n" + 
			"  FO : dom.Obj -> cod.Obj.\n" + 
			"  FM : A dom.--> B -> (FO A) cod.--> (FO B)." + 
			"   c': a.\n" + 
			"}.\n" + 
			"\n" + 
			"%view v : A -> t.A = {\n" + 
			"   c := c.\n" + 
			"}.\n" + 
			""; 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LFInjectorProvider inj = new LFInjectorProvider();
		Injector p = inj.getInjector();
		LFParser pp = p.getInstance(LFParser.class);
		StringReader reader = new StringReader(src);
		IParseResult res = pp.parse(reader);
		
		InternalLFLexer lexer = new InternalLFLexer(new ANTLRStringStream(src));
		while (true) {
			Token t = lexer.nextToken();
			if (t == null || t.getText()==null)
				break;
			System.out.print(t.getText()+" ");
			switch (t.getType()) {
				case InternalLFLexer.RULE_ANY_OTHER: System.out.println("ANYOTHER");	break;
				case InternalLFLexer.RULE_CID: System.out.println("CID");	break;
				case InternalLFLexer.RULE_SP: System.out.println("WS");	break;
				case InternalLFLexer.RULE_INT: System.out.println("INT");	break;
				case InternalLFLexer.RULE_ML2_COMMENT: System.out.println("M2 Comment");	break;
				case InternalLFLexer.RULE_ML_COMMENT: System.out.println("M1 Comment");	break;
				default: System.out.println(t.getType()); 
			}
		};

		for (INode t : res.getSyntaxErrors()) {
			System.out.println("Error "+t.getSyntaxErrorMessage().getMessage());
			System.out.println(t.getText());
		}
	}

}
