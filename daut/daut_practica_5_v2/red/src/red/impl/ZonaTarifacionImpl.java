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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import red.RedPackage;
import red.ZonaTarifacion;
import red.util.RedValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zona Tarifacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.ZonaTarifacionImpl#getEnumeracion <em>Enumeracion</em>}</li>
 *   <li>{@link red.impl.ZonaTarifacionImpl#getTarifaBus <em>Tarifa Bus</em>}</li>
 *   <li>{@link red.impl.ZonaTarifacionImpl#getTarifaMetro <em>Tarifa Metro</em>}</li>
 *   <li>{@link red.impl.ZonaTarifacionImpl#getTarifaTren <em>Tarifa Tren</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZonaTarifacionImpl extends MinimalEObjectImpl.Container implements ZonaTarifacion {
	/**
	 * The default value of the '{@link #getEnumeracion() <em>Enumeracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeracion()
	 * @generated
	 * @ordered
	 */
	protected static final int ENUMERACION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getEnumeracion() <em>Enumeracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeracion()
	 * @generated
	 * @ordered
	 */
	protected int enumeracion = ENUMERACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarifaBus() <em>Tarifa Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifaBus()
	 * @generated
	 * @ordered
	 */
	protected static final double TARIFA_BUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTarifaBus() <em>Tarifa Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifaBus()
	 * @generated
	 * @ordered
	 */
	protected double tarifaBus = TARIFA_BUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarifaMetro() <em>Tarifa Metro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifaMetro()
	 * @generated
	 * @ordered
	 */
	protected static final double TARIFA_METRO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTarifaMetro() <em>Tarifa Metro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifaMetro()
	 * @generated
	 * @ordered
	 */
	protected double tarifaMetro = TARIFA_METRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarifaTren() <em>Tarifa Tren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifaTren()
	 * @generated
	 * @ordered
	 */
	protected static final double TARIFA_TREN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTarifaTren() <em>Tarifa Tren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifaTren()
	 * @generated
	 * @ordered
	 */
	protected double tarifaTren = TARIFA_TREN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZonaTarifacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.ZONA_TARIFACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnumeracion() {
		return enumeracion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeracion(int newEnumeracion) {
		int oldEnumeracion = enumeracion;
		enumeracion = newEnumeracion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.ZONA_TARIFACION__ENUMERACION, oldEnumeracion, enumeracion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTarifaBus() {
		return tarifaBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarifaBus(double newTarifaBus) {
		double oldTarifaBus = tarifaBus;
		tarifaBus = newTarifaBus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.ZONA_TARIFACION__TARIFA_BUS, oldTarifaBus, tarifaBus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTarifaMetro() {
		return tarifaMetro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarifaMetro(double newTarifaMetro) {
		double oldTarifaMetro = tarifaMetro;
		tarifaMetro = newTarifaMetro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.ZONA_TARIFACION__TARIFA_METRO, oldTarifaMetro, tarifaMetro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTarifaTren() {
		return tarifaTren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarifaTren(double newTarifaTren) {
		double oldTarifaTren = tarifaTren;
		tarifaTren = newTarifaTren;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.ZONA_TARIFACION__TARIFA_TREN, oldTarifaTren, tarifaTren));
	}

	/**
	 * The cached validation expression for the '{@link #positiveTarifaBus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Tarifa Bus</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #positiveTarifaBus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIVE_TARIFA_BUS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "tarifaBus > 0";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean positiveTarifaBus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.ZONA_TARIFACION,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.ZONA_TARIFACION___POSITIVE_TARIFA_BUS__DIAGNOSTICCHAIN_MAP,
				 POSITIVE_TARIFA_BUS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.ZONA_TARIFACION__POSITIVE_TARIFA_BUS);
	}

	/**
	 * The cached validation expression for the '{@link #positiveTarifaTren(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Tarifa Tren</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #positiveTarifaTren(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIVE_TARIFA_TREN_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "tarifaTren > 0";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean positiveTarifaTren(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.ZONA_TARIFACION,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.ZONA_TARIFACION___POSITIVE_TARIFA_TREN__DIAGNOSTICCHAIN_MAP,
				 POSITIVE_TARIFA_TREN_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.ZONA_TARIFACION__POSITIVE_TARIFA_TREN);
	}

	/**
	 * The cached validation expression for the '{@link #nonDuplicateNum(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Num</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nonDuplicateNum(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NON_DUPLICATE_NUM_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\t\tZonaTarifacion.allInstances()->isUnique(enumeracion)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonDuplicateNum(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.ZONA_TARIFACION,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.ZONA_TARIFACION___NON_DUPLICATE_NUM__DIAGNOSTICCHAIN_MAP,
				 NON_DUPLICATE_NUM_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.ZONA_TARIFACION__NON_DUPLICATE_NUM);
	}

	/**
	 * The cached validation expression for the '{@link #positiveTarifaMetro(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Tarifa Metro</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #positiveTarifaMetro(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIVE_TARIFA_METRO_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "tarifaMetro > 0";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean positiveTarifaMetro(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.ZONA_TARIFACION,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.ZONA_TARIFACION___POSITIVE_TARIFA_METRO__DIAGNOSTICCHAIN_MAP,
				 POSITIVE_TARIFA_METRO_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.ZONA_TARIFACION__POSITIVE_TARIFA_METRO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedPackage.ZONA_TARIFACION__ENUMERACION:
				return getEnumeracion();
			case RedPackage.ZONA_TARIFACION__TARIFA_BUS:
				return getTarifaBus();
			case RedPackage.ZONA_TARIFACION__TARIFA_METRO:
				return getTarifaMetro();
			case RedPackage.ZONA_TARIFACION__TARIFA_TREN:
				return getTarifaTren();
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
			case RedPackage.ZONA_TARIFACION__ENUMERACION:
				setEnumeracion((Integer)newValue);
				return;
			case RedPackage.ZONA_TARIFACION__TARIFA_BUS:
				setTarifaBus((Double)newValue);
				return;
			case RedPackage.ZONA_TARIFACION__TARIFA_METRO:
				setTarifaMetro((Double)newValue);
				return;
			case RedPackage.ZONA_TARIFACION__TARIFA_TREN:
				setTarifaTren((Double)newValue);
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
			case RedPackage.ZONA_TARIFACION__ENUMERACION:
				setEnumeracion(ENUMERACION_EDEFAULT);
				return;
			case RedPackage.ZONA_TARIFACION__TARIFA_BUS:
				setTarifaBus(TARIFA_BUS_EDEFAULT);
				return;
			case RedPackage.ZONA_TARIFACION__TARIFA_METRO:
				setTarifaMetro(TARIFA_METRO_EDEFAULT);
				return;
			case RedPackage.ZONA_TARIFACION__TARIFA_TREN:
				setTarifaTren(TARIFA_TREN_EDEFAULT);
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
			case RedPackage.ZONA_TARIFACION__ENUMERACION:
				return enumeracion != ENUMERACION_EDEFAULT;
			case RedPackage.ZONA_TARIFACION__TARIFA_BUS:
				return tarifaBus != TARIFA_BUS_EDEFAULT;
			case RedPackage.ZONA_TARIFACION__TARIFA_METRO:
				return tarifaMetro != TARIFA_METRO_EDEFAULT;
			case RedPackage.ZONA_TARIFACION__TARIFA_TREN:
				return tarifaTren != TARIFA_TREN_EDEFAULT;
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
			case RedPackage.ZONA_TARIFACION___POSITIVE_TARIFA_BUS__DIAGNOSTICCHAIN_MAP:
				return positiveTarifaBus((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.ZONA_TARIFACION___POSITIVE_TARIFA_TREN__DIAGNOSTICCHAIN_MAP:
				return positiveTarifaTren((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.ZONA_TARIFACION___NON_DUPLICATE_NUM__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateNum((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.ZONA_TARIFACION___POSITIVE_TARIFA_METRO__DIAGNOSTICCHAIN_MAP:
				return positiveTarifaMetro((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (enumeracion: ");
		result.append(enumeracion);
		result.append(", tarifaBus: ");
		result.append(tarifaBus);
		result.append(", tarifaMetro: ");
		result.append(tarifaMetro);
		result.append(", tarifaTren: ");
		result.append(tarifaTren);
		result.append(')');
		return result.toString();
	}

} //ZonaTarifacionImpl
