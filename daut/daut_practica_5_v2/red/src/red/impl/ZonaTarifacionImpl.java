/**
 */
package red.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import red.RedPackage;
import red.ZonaTarifacion;

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
