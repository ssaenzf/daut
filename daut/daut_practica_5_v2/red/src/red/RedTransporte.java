/**
 */
package red;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transporte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.RedTransporte#getLineas <em>Lineas</em>}</li>
 *   <li>{@link red.RedTransporte#getParadas <em>Paradas</em>}</li>
 *   <li>{@link red.RedTransporte#getZonasTarifacion <em>Zonas Tarifacion</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getRedTransporte()
 * @model
 * @generated
 */
public interface RedTransporte extends EObject {
	/**
	 * Returns the value of the '<em><b>Lineas</b></em>' containment reference list.
	 * The list contents are of type {@link red.Linea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lineas</em>' containment reference list.
	 * @see red.RedPackage#getRedTransporte_Lineas()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Linea> getLineas();

	/**
	 * Returns the value of the '<em><b>Paradas</b></em>' containment reference list.
	 * The list contents are of type {@link red.Parada}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paradas</em>' containment reference list.
	 * @see red.RedPackage#getRedTransporte_Paradas()
	 * @model containment="true" lower="2" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Parada> getParadas();

	/**
	 * Returns the value of the '<em><b>Zonas Tarifacion</b></em>' containment reference list.
	 * The list contents are of type {@link red.ZonaTarifacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zonas Tarifacion</em>' containment reference list.
	 * @see red.RedPackage#getRedTransporte_ZonasTarifacion()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<ZonaTarifacion> getZonasTarifacion();

} // RedTransporte
