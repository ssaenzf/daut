/**
 */
package red.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import red.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see red.RedPackage
 * @generated
 */
public class RedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedSwitch() {
		if (modelPackage == null) {
			modelPackage = RedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RedPackage.RED_TRANSPORTE: {
				RedTransporte redTransporte = (RedTransporte)theEObject;
				T result = caseRedTransporte(redTransporte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedPackage.LINEA: {
				Linea linea = (Linea)theEObject;
				T result = caseLinea(linea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedPackage.LINEA_METRO: {
				LineaMetro lineaMetro = (LineaMetro)theEObject;
				T result = caseLineaMetro(lineaMetro);
				if (result == null) result = caseLinea(lineaMetro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedPackage.LINEA_TREN: {
				LineaTren lineaTren = (LineaTren)theEObject;
				T result = caseLineaTren(lineaTren);
				if (result == null) result = caseLinea(lineaTren);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedPackage.LINEA_BUS: {
				LineaBus lineaBus = (LineaBus)theEObject;
				T result = caseLineaBus(lineaBus);
				if (result == null) result = caseLinea(lineaBus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedPackage.PARADA: {
				Parada parada = (Parada)theEObject;
				T result = caseParada(parada);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedPackage.DESCUENTO: {
				Descuento descuento = (Descuento)theEObject;
				T result = caseDescuento(descuento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RedPackage.ZONA_TARIFACION: {
				ZonaTarifacion zonaTarifacion = (ZonaTarifacion)theEObject;
				T result = caseZonaTarifacion(zonaTarifacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transporte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transporte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedTransporte(RedTransporte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinea(Linea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linea Metro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linea Metro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineaMetro(LineaMetro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linea Tren</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linea Tren</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineaTren(LineaTren object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linea Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linea Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineaBus(LineaBus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parada</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parada</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParada(Parada object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descuento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descuento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescuento(Descuento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zona Tarifacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zona Tarifacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZonaTarifacion(ZonaTarifacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RedSwitch
