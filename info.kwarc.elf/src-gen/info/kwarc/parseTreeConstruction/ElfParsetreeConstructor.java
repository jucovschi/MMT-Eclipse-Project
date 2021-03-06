/*
* generated by Xtext
*/
package info.kwarc.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor;

import info.kwarc.services.ElfGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class ElfParsetreeConstructor extends AbstractParseTreeConstructor {
		
	@Inject
	private ElfGrammarAccess grammarAccess;
	
	@Override
	protected AbstractToken getRootToken(IEObjectConsumer inst) {
		return new ThisRootNode(inst);	
	}
	
protected class ThisRootNode extends RootToken {
	public ThisRootNode(IEObjectConsumer inst) {
		super(inst);
	}
	
	@Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Model_DeclarationsAssignment(this, this, 0, inst);
			case 1: return new NamespaceDeclaration_Group(this, this, 1, inst);
			case 2: return new SignatureDeclaration_Group(this, this, 2, inst);
			case 3: return new SigDefinitions_Group(this, this, 3, inst);
			case 4: return new TempType_Alternatives(this, this, 4, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule Model ****************
 *
 * Model:
 * 	declarations+=(namespaceDeclaration | signatureDeclaration)*;
 *
 **/

// declarations+=(namespaceDeclaration | signatureDeclaration)*
protected class Model_DeclarationsAssignment extends AssignmentToken  {
	
	public Model_DeclarationsAssignment(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getModelAccess().getDeclarationsAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NamespaceDeclaration_Group(this, this, 0, inst);
			case 1: return new SignatureDeclaration_Group(this, this, 1, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("declarations",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("declarations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getNamespaceDeclarationRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSignatureDeclarationRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Model_DeclarationsAssignment(lastRuleCallOrigin, next, actIndex, consumed);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index - 1, consumed);
		}	
	}	
}

/************ end Rule Model ****************/


/************ begin Rule namespaceDeclaration ****************
 *
 * namespaceDeclaration:
 * 	"%namespace" (name=ID "=" uri=URI | uri=URI) ".";
 *
 **/

// "%namespace" (name=ID "=" uri=URI | uri=URI) "."
protected class NamespaceDeclaration_Group extends GroupToken {
	
	public NamespaceDeclaration_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getNamespaceDeclarationAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NamespaceDeclaration_FullStopKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getNamespaceDeclarationRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "%namespace"
protected class NamespaceDeclaration_NamespaceKeyword_0 extends KeywordToken  {
	
	public NamespaceDeclaration_NamespaceKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID "=" uri=URI | uri=URI
protected class NamespaceDeclaration_Alternatives_1 extends AlternativesToken {

	public NamespaceDeclaration_Alternatives_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getNamespaceDeclarationAccess().getAlternatives_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NamespaceDeclaration_Group_1_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new NamespaceDeclaration_UriAssignment_1_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// name=ID "=" uri=URI
protected class NamespaceDeclaration_Group_1_0 extends GroupToken {
	
	public NamespaceDeclaration_Group_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getNamespaceDeclarationAccess().getGroup_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NamespaceDeclaration_UriAssignment_1_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class NamespaceDeclaration_NameAssignment_1_0_0 extends AssignmentToken  {
	
	public NamespaceDeclaration_NameAssignment_1_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NamespaceDeclaration_NamespaceKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getNamespaceDeclarationAccess().getNameIDTerminalRuleCall_1_0_0_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getNamespaceDeclarationAccess().getNameIDTerminalRuleCall_1_0_0_0();
			return obj;
		}
		return null;
	}

}

// "="
protected class NamespaceDeclaration_EqualsSignKeyword_1_0_1 extends KeywordToken  {
	
	public NamespaceDeclaration_EqualsSignKeyword_1_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_1_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NamespaceDeclaration_NameAssignment_1_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// uri=URI
protected class NamespaceDeclaration_UriAssignment_1_0_2 extends AssignmentToken  {
	
	public NamespaceDeclaration_UriAssignment_1_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_1_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NamespaceDeclaration_EqualsSignKeyword_1_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("uri",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("uri");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getNamespaceDeclarationAccess().getUriURITerminalRuleCall_1_0_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getNamespaceDeclarationAccess().getUriURITerminalRuleCall_1_0_2_0();
			return obj;
		}
		return null;
	}

}


// uri=URI
protected class NamespaceDeclaration_UriAssignment_1_1 extends AssignmentToken  {
	
	public NamespaceDeclaration_UriAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NamespaceDeclaration_NamespaceKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("uri",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("uri");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getNamespaceDeclarationAccess().getUriURITerminalRuleCall_1_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getNamespaceDeclarationAccess().getUriURITerminalRuleCall_1_1_0();
			return obj;
		}
		return null;
	}

}


// "."
protected class NamespaceDeclaration_FullStopKeyword_2 extends KeywordToken  {
	
	public NamespaceDeclaration_FullStopKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NamespaceDeclaration_Alternatives_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule namespaceDeclaration ****************/


/************ begin Rule signatureDeclaration ****************
 *
 * signatureDeclaration:
 * 	"%sig" sigName=ID "=" "{" sigDefinitions+=sigDefinitions* "}" ".";
 *
 **/

// "%sig" sigName=ID "=" "{" sigDefinitions+=sigDefinitions* "}" "."
protected class SignatureDeclaration_Group extends GroupToken {
	
	public SignatureDeclaration_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getSignatureDeclarationAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SignatureDeclaration_FullStopKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getSignatureDeclarationRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "%sig"
protected class SignatureDeclaration_SigKeyword_0 extends KeywordToken  {
	
	public SignatureDeclaration_SigKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSignatureDeclarationAccess().getSigKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// sigName=ID
protected class SignatureDeclaration_SigNameAssignment_1 extends AssignmentToken  {
	
	public SignatureDeclaration_SigNameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getSignatureDeclarationAccess().getSigNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SignatureDeclaration_SigKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("sigName",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("sigName");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getSignatureDeclarationAccess().getSigNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getSignatureDeclarationAccess().getSigNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "="
protected class SignatureDeclaration_EqualsSignKeyword_2 extends KeywordToken  {
	
	public SignatureDeclaration_EqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SignatureDeclaration_SigNameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class SignatureDeclaration_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public SignatureDeclaration_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSignatureDeclarationAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SignatureDeclaration_EqualsSignKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// sigDefinitions+=sigDefinitions*
protected class SignatureDeclaration_SigDefinitionsAssignment_4 extends AssignmentToken  {
	
	public SignatureDeclaration_SigDefinitionsAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SigDefinitions_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("sigDefinitions",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("sigDefinitions");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSigDefinitionsRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsSigDefinitionsParserRuleCall_4_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new SignatureDeclaration_SigDefinitionsAssignment_4(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new SignatureDeclaration_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class SignatureDeclaration_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public SignatureDeclaration_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSignatureDeclarationAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SignatureDeclaration_SigDefinitionsAssignment_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new SignatureDeclaration_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "."
protected class SignatureDeclaration_FullStopKeyword_6 extends KeywordToken  {
	
	public SignatureDeclaration_FullStopKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SignatureDeclaration_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule signatureDeclaration ****************/


/************ begin Rule sigDefinitions ****************
 *
 * sigDefinitions:
 * 	symbName=ID ":" type=ID ("=" ID+)? ".";
 *
 **/

// symbName=ID ":" type=ID ("=" ID+)? "."
protected class SigDefinitions_Group extends GroupToken {
	
	public SigDefinitions_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getSigDefinitionsAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SigDefinitions_FullStopKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getSigDefinitionsRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// symbName=ID
protected class SigDefinitions_SymbNameAssignment_0 extends AssignmentToken  {
	
	public SigDefinitions_SymbNameAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getSigDefinitionsAccess().getSymbNameAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("symbName",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("symbName");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getSigDefinitionsAccess().getSymbNameIDTerminalRuleCall_0_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getSigDefinitionsAccess().getSymbNameIDTerminalRuleCall_0_0();
			return obj;
		}
		return null;
	}

}

// ":"
protected class SigDefinitions_ColonKeyword_1 extends KeywordToken  {
	
	public SigDefinitions_ColonKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSigDefinitionsAccess().getColonKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SigDefinitions_SymbNameAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// type=ID
protected class SigDefinitions_TypeAssignment_2 extends AssignmentToken  {
	
	public SigDefinitions_TypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getSigDefinitionsAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SigDefinitions_ColonKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getSigDefinitionsAccess().getTypeIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getSigDefinitionsAccess().getTypeIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "."
protected class SigDefinitions_FullStopKeyword_4 extends KeywordToken  {
	
	public SigDefinitions_FullStopKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SigDefinitions_TypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule sigDefinitions ****************/


/************ begin Rule TempType ****************
 *
 * TempType:
 * 	{namespaceDeclaration} | {signatureDeclaration} | fullURI=ID;
 *
 **/

// {namespaceDeclaration} | {signatureDeclaration} | fullURI=ID
protected class TempType_Alternatives extends AlternativesToken {

	public TempType_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getTempTypeAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TempType_NamespaceDeclarationAction_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new TempType_SignatureDeclarationAction_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new TempType_FullURIAssignment_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getTempTypeRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getTempTypeAccess().getNamespaceDeclarationAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getTempTypeAccess().getSignatureDeclarationAction_1().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {namespaceDeclaration}
protected class TempType_NamespaceDeclarationAction_0 extends ActionToken  {

	public TempType_NamespaceDeclarationAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getTempTypeAccess().getNamespaceDeclarationAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getTempTypeAccess().getNamespaceDeclarationAction_0().getType().getClassifier())
			return null;
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// {signatureDeclaration}
protected class TempType_SignatureDeclarationAction_1 extends ActionToken  {

	public TempType_SignatureDeclarationAction_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getTempTypeAccess().getSignatureDeclarationAction_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getTempTypeAccess().getSignatureDeclarationAction_1().getType().getClassifier())
			return null;
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// fullURI=ID
protected class TempType_FullURIAssignment_2 extends AssignmentToken  {
	
	public TempType_FullURIAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTempTypeAccess().getFullURIAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getTempTypeRule().getType().getClassifier())
			return null;
		if((value = eObjectConsumer.getConsumable("fullURI",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("fullURI");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getTempTypeAccess().getFullURIIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getTempTypeAccess().getFullURIIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule TempType ****************/

}
