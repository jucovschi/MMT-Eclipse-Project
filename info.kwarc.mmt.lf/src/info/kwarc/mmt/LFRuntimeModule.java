/*
 * generated by Xtext
 */
package info.kwarc.mmt;

import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.XtextResource;

import apc.APCResource;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class LFRuntimeModule extends info.kwarc.mmt.AbstractLFRuntimeModule {
	@Override
	public Class<? extends XtextResource> bindXtextResource() {
		return APCResource.class;
	}
	
	@Override
	public Class<? extends IParser> bindIParser() {
		return MyAPC.class;
	}
}
