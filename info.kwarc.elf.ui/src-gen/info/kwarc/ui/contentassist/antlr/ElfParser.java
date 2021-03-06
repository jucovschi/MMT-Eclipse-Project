/*
* generated by Xtext
*/
package info.kwarc.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import info.kwarc.services.ElfGrammarAccess;

public class ElfParser extends AbstractContentAssistParser {
	
	@Inject
	private ElfGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected info.kwarc.ui.contentassist.antlr.internal.InternalElfParser createParser() {
		info.kwarc.ui.contentassist.antlr.internal.InternalElfParser result = new info.kwarc.ui.contentassist.antlr.internal.InternalElfParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getDeclarationsAlternatives_0(), "rule__Model__DeclarationsAlternatives_0");
					put(grammarAccess.getNamespaceDeclarationAccess().getAlternatives_1(), "rule__NamespaceDeclaration__Alternatives_1");
					put(grammarAccess.getTempTypeAccess().getAlternatives(), "rule__TempType__Alternatives");
					put(grammarAccess.getNamespaceDeclarationAccess().getGroup(), "rule__NamespaceDeclaration__Group__0");
					put(grammarAccess.getNamespaceDeclarationAccess().getGroup_1_0(), "rule__NamespaceDeclaration__Group_1_0__0");
					put(grammarAccess.getSignatureDeclarationAccess().getGroup(), "rule__SignatureDeclaration__Group__0");
					put(grammarAccess.getSigDefinitionsAccess().getGroup(), "rule__SigDefinitions__Group__0");
					put(grammarAccess.getSigDefinitionsAccess().getGroup_3(), "rule__SigDefinitions__Group_3__0");
					put(grammarAccess.getModelAccess().getDeclarationsAssignment(), "rule__Model__DeclarationsAssignment");
					put(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1_0_0(), "rule__NamespaceDeclaration__NameAssignment_1_0_0");
					put(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_1_0_2(), "rule__NamespaceDeclaration__UriAssignment_1_0_2");
					put(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_1_1(), "rule__NamespaceDeclaration__UriAssignment_1_1");
					put(grammarAccess.getSignatureDeclarationAccess().getSigNameAssignment_1(), "rule__SignatureDeclaration__SigNameAssignment_1");
					put(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsAssignment_4(), "rule__SignatureDeclaration__SigDefinitionsAssignment_4");
					put(grammarAccess.getSigDefinitionsAccess().getSymbNameAssignment_0(), "rule__SigDefinitions__SymbNameAssignment_0");
					put(grammarAccess.getSigDefinitionsAccess().getTypeAssignment_2(), "rule__SigDefinitions__TypeAssignment_2");
					put(grammarAccess.getTempTypeAccess().getFullURIAssignment_2(), "rule__TempType__FullURIAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			info.kwarc.ui.contentassist.antlr.internal.InternalElfParser typedParser = (info.kwarc.ui.contentassist.antlr.internal.InternalElfParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ML2_COMMENT" };
	}
	
	public ElfGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ElfGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
