/*
* generated by Xtext
*/
package info.kwarc.mmt;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class LFUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return info.kwarc.mmt.ui.internal.LFActivator.getInstance().getInjector("info.kwarc.mmt.LF");
	}
	
}