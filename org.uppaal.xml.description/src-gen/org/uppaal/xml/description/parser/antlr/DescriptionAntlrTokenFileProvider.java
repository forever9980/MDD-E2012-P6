/*
* generated by Xtext
*/
package org.uppaal.xml.description.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DescriptionAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/uppaal/xml/description/parser/antlr/internal/InternalDescription.tokens");
	}
}
