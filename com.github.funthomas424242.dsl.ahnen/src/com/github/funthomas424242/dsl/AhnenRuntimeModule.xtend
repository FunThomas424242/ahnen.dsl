/*
 * generated by Xtext 2.10.0
 */
package com.github.funthomas424242.dsl

import org.eclipse.xtext.conversion.IValueConverterService

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class AhnenRuntimeModule extends AbstractAhnenRuntimeModule {

	override  Class<? extends IValueConverterService> bindIValueConverterService() {		
		return AhnenTerminalConverters;
	}
}