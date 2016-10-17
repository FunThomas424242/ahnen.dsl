/*
 * generated by Xtext 2.10.0
 */
package com.github.funthomas424242.dsl.parser.antlr;

import com.github.funthomas424242.dsl.parser.antlr.internal.InternalAhnenParser;
import com.github.funthomas424242.dsl.services.AhnenGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AhnenParser extends AbstractAntlrParser {

	@Inject
	private AhnenGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAhnenParser createParser(XtextTokenStream stream) {
		return new InternalAhnenParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public AhnenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AhnenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}