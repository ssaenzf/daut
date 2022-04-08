/**
 */
package red;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linea Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see red.RedPackage#getLineaBus()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonDuplicateCodigoBus'"
 * @generated
 */
public interface LineaBus extends Linea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tLineaBus.allInstances()-&gt;isUnique(codigo)'"
	 * @generated
	 */
	boolean nonDuplicateCodigoBus(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LineaBus
