/**
 */
package red;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see red.RedPackage
 * @generated
 */
public interface RedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RedFactory eINSTANCE = red.impl.RedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transporte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transporte</em>'.
	 * @generated
	 */
	RedTransporte createRedTransporte();

	/**
	 * Returns a new object of class '<em>Linea Metro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linea Metro</em>'.
	 * @generated
	 */
	LineaMetro createLineaMetro();

	/**
	 * Returns a new object of class '<em>Linea Tren</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linea Tren</em>'.
	 * @generated
	 */
	LineaTren createLineaTren();

	/**
	 * Returns a new object of class '<em>Linea Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linea Bus</em>'.
	 * @generated
	 */
	LineaBus createLineaBus();

	/**
	 * Returns a new object of class '<em>Parada</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parada</em>'.
	 * @generated
	 */
	Parada createParada();

	/**
	 * Returns a new object of class '<em>Descuento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descuento</em>'.
	 * @generated
	 */
	Descuento createDescuento();

	/**
	 * Returns a new object of class '<em>Zona Tarifacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zona Tarifacion</em>'.
	 * @generated
	 */
	ZonaTarifacion createZonaTarifacion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RedPackage getRedPackage();

} //RedFactory
