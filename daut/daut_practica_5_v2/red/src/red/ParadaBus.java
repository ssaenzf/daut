/**
 */
package red;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parada Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see red.RedPackage#getParadaBus()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface ParadaBus extends Parada {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tParadaBus.allInstances()-&gt;isUnique(nombre)'"
	 * @generated
	 */
	boolean nonDuplicateNombreParada(DiagnosticChain diagnostics, Map<Object, Object> context);
} // ParadaBus
