/*
 * generated by Xtext 2.10.0
 */
package com.github.funthomas424242.dsl.ui.tests;

import com.github.funthomas424242.dsl.ahnen.ui.internal.AhnenActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class AhnenUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AhnenActivator.getInstance().getInjector("com.github.funthomas424242.dsl.Ahnen");
	}

}