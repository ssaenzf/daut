/**
 */
package red;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parada Metro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.ParadaMetro#isAseos <em>Aseos</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getParadaMetro()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface ParadaMetro extends Parada {
	/**
	 * Returns the value of the '<em><b>Aseos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aseos</em>' attribute.
	 * @see #setAseos(boolean)
	 * @see red.RedPackage#getParadaMetro_Aseos()
	 * @model required="true"
	 * @generated
	 */
	boolean isAseos();

	/**
	 * Sets the value of the '{@link red.ParadaMetro#isAseos <em>Aseos</em>}' attribute.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tParadaMetro.allInstances()-&gt;isUnique(nombre)'"
	 * @generated
	 */
	boolean nonDuplicateNombreParada(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ParadaMetro
