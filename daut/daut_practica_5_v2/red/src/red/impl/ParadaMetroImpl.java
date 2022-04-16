/**
 */
package red.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import red.ParadaMetro;
import red.RedPackage;
import red.util.RedValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parada Metro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.ParadaMetroImpl#isAseos <em>Aseos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParadaMetroImpl extends ParadaImpl implements ParadaMetro {
	/**
	 * The default value of the '{@link #isAseos() <em>Aseos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAseos()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASEOS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAseos() <em>Aseos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAseos()
	 * @generated
	 * @ordered
	 */
	protected boolean aseos = ASEOS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParadaMetroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.PARADA_METRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAseos() {
		return aseos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAseos(boolean newAseos) {
		boolean oldAseos = aseos;
		aseos = newAseos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.PARADA_METRO__ASEOS, oldAseos, aseos));
	}

	/**
	 * The cached validation expression for the '{@link #nonDuplicateNombreParada(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Nombre Parada</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nonDuplicateNombreParada(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NON_DUPLICATE_NOMBRE_PARADA_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\t\tParadaMetro.allInstances()->isUnique(nombre)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonDuplicateNombreParada(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.PARADA_METRO,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.PARADA_METRO___NON_DUPLICATE_NOMBRE_PARADA__DIAGNOSTICCHAIN_MAP,
				 NON_DUPLICATE_NOMBRE_PARADA_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.PARADA_METRO__NON_DUPLICATE_NOMBRE_PARADA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedPackage.PARADA_METRO__ASEOS:
				return isAseos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RedPackage.PARADA_METRO__ASEOS:
				setAseos((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RedPackage.PARADA_METRO__ASEOS:
				setAseos(ASEOS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RedPackage.PARADA_METRO__ASEOS:
				return aseos != ASEOS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RedPackage.PARADA_METRO___NON_DUPLICATE_NOMBRE_PARADA__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateNombreParada((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (aseos: ");
		result.append(aseos);
		result.append(')');
		return result.toString();
	}

} //ParadaMetroImpl
