/**
 */
package red;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linea Tren</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.LineaTren#getParadas <em>Paradas</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getLineaTren()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonDuplicateCodigoTren'"
 * @generated
 */
public interface LineaTren extends Linea {
	/**
	 * Returns the value of the '<em><b>Paradas</b></em>' reference list.
	 * The list contents are of type {@link red.ParadaTren}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paradas</em>' reference list.
	 * @see red.RedPackage#getLineaTren_Paradas()
	 * @model lower="2"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<ParadaTren> getParadas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tLineaTren.allInstances()-&gt;isUnique(codigo)'"
	 * @generated
	 */
	boolean nonDuplicateCodigoTren(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LineaTren
