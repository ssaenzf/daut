/**
 */
package red;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parada Tren</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.ParadaTren#isAseos <em>Aseos</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getParadaTren()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonDuplicateNombreParada'"
 * @generated
 */
public interface ParadaTren extends Parada {
	/**
	 * Returns the value of the '<em><b>Aseos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aseos</em>' attribute.
	 * @see #setAseos(boolean)
	 * @see red.RedPackage#getParadaTren_Aseos()
	 * @model required="true"
	 * @generated
	 */
	boolean isAseos();

	/**
	 * Sets the value of the '{@link red.ParadaTren#isAseos <em>Aseos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aseos</em>' attribute.
	 * @see #isAseos()
	 * @generated
	 */
	void setAseos(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tParadaTren.allInstances()-&gt;isUnique(nombre)'"
	 * @generated
	 */
	boolean nonDuplicateNombreParada(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ParadaTren
