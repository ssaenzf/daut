/**
 */
package red;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linea Tren</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see red.RedPackage#getLineaTren()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonDuplicateCodigoTren'"
 * @generated
 */
public interface LineaTren extends Linea {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tparadaIni.oclIsTypeOf(ParadaTren) and paradaFin.oclIsTypeOf(ParadaTren)'"
	 * @generated
	 */
	boolean paradasIniFin(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tparadas-&gt;forAll(p | p.oclIsTypeOf(ParadaTren))'"
	 * @generated
	 */
	boolean paradasCorrectas(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tLineaTren.allInstances()-&gt;isUnique(codigo)'"
	 * @generated
	 */
	boolean nonDuplicateCodigoTren(DiagnosticChain diagnostics, Map<Object, Object> context);
} // LineaTren
