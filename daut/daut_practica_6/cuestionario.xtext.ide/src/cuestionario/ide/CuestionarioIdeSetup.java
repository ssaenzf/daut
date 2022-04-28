/*
 * generated by Xtext 2.26.0
 */
package cuestionario.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import cuestionario.CuestionarioRuntimeModule;
import cuestionario.CuestionarioStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CuestionarioIdeSetup extends CuestionarioStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new CuestionarioRuntimeModule(), new CuestionarioIdeModule()));
	}
	
}
