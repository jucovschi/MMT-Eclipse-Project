/*
* generated by Xtext
*/
package info.kwarc.mmt.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LFAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("info/kwarc/mmt/parser/antlr/internal/InternalLF.tokens");
	}
}
