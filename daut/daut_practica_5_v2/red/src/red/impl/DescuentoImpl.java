/**
 */
package red.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import red.Descuento;
import red.Linea;
import red.RedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descuento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.DescuentoImpl#getHoraIni <em>Hora Ini</em>}</li>
 *   <li>{@link red.impl.DescuentoImpl#getHoraFin <em>Hora Fin</em>}</li>
 *   <li>{@link red.impl.DescuentoImpl#getDescuento <em>Descuento</em>}</li>
 *   <li>{@link red.impl.DescuentoImpl#getLinea <em>Linea</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescuentoImpl extends MinimalEObjectImpl.Container implements Descuento {
	/**
	 * The default value of the '{@link #getHoraIni() <em>Hora Ini</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraIni()
	 * @generated
	 * @ordered
	 */
	protected static final int HORA_INI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHoraIni() <em>Hora Ini</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraIni()
	 * @generated
	 * @ordered
	 */
	protected int horaIni = HORA_INI_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoraFin() <em>Hora Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraFin()
	 * @generated
	 * @ordered
	 */
	protected static final int HORA_FIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHoraFin() <em>Hora Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraFin()
	 * @generated
	 * @ordered
	 */
	protected int horaFin = HORA_FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescuento() <em>Descuento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescuento()
	 * @generated
	 * @ordered
	 */
	protected static final int DESCUENTO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDescuento() <em>Descuento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescuento()
	 * @generated
	 * @ordered
	 */
	protected int descuento = DESCUENTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescuentoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.DESCUENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoraIni() {
		return horaIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoraIni(int newHoraIni) {
		int oldHoraIni = horaIni;
		horaIni = newHoraIni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.DESCUENTO__HORA_INI, oldHoraIni, horaIni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoraFin() {
		return horaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoraFin(int newHoraFin) {
		int oldHoraFin = horaFin;
		horaFin = newHoraFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.DESCUENTO__HORA_FIN, oldHoraFin, horaFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDescuento() {
		return descuento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescuento(int newDescuento) {
		int oldDescuento = descuento;
		descuento = newDescuento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.DESCUENTO__DESCUENTO, oldDescuento, descuento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linea getLinea() {
		if (eContainerFeatureID() != RedPackage.DESCUENTO__LINEA) return null;
		return (Linea)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinea(Linea newLinea, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLinea, RedPackage.DESCUENTO__LINEA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinea(Linea newLinea) {
		if (newLinea != eInternalContainer() || (eContainerFeatureID() != RedPackage.DESCUENTO__LINEA && newLinea != null)) {
			if (EcoreUtil.isAncestor(this, newLinea))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLinea != null)
				msgs = ((InternalEObject)newLinea).eInverseAdd(this, RedPackage.LINEA__DESCUENTOS, Linea.class, msgs);
			msgs = basicSetLinea(newLinea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.DESCUENTO__LINEA, newLinea, newLinea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RedPackage.DESCUENTO__LINEA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLinea((Linea)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RedPackage.DESCUENTO__LINEA:
				return basicSetLinea(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RedPackage.DESCUENTO__LINEA:
				return eInternalContainer().eInverseRemove(this, RedPackage.LINEA__DESCUENTOS, Linea.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedPackage.DESCUENTO__HORA_INI:
				return getHoraIni();
			case RedPackage.DESCUENTO__HORA_FIN:
				return getHoraFin();
			case RedPackage.DESCUENTO__DESCUENTO:
				return getDescuento();
			case RedPackage.DESCUENTO__LINEA:
				return getLinea();
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
			case RedPackage.DESCUENTO__HORA_INI:
				setHoraIni((Integer)newValue);
				return;
			case RedPackage.DESCUENTO__HORA_FIN:
				setHoraFin((Integer)newValue);
				return;
			case RedPackage.DESCUENTO__DESCUENTO:
				setDescuento((Integer)newValue);
				return;
			case RedPackage.DESCUENTO__LINEA:
				setLinea((Linea)newValue);
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
			case RedPackage.DESCUENTO__HORA_INI:
				setHoraIni(HORA_INI_EDEFAULT);
				return;
			case RedPackage.DESCUENTO__HORA_FIN:
				setHoraFin(HORA_FIN_EDEFAULT);
				return;
			case RedPackage.DESCUENTO__DESCUENTO:
				setDescuento(DESCUENTO_EDEFAULT);
				return;
			case RedPackage.DESCUENTO__LINEA:
				setLinea((Linea)null);
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
			case RedPackage.DESCUENTO__HORA_INI:
				return horaIni != HORA_INI_EDEFAULT;
			case RedPackage.DESCUENTO__HORA_FIN:
				return horaFin != HORA_FIN_EDEFAULT;
			case RedPackage.DESCUENTO__DESCUENTO:
				return descuento != DESCUENTO_EDEFAULT;
			case RedPackage.DESCUENTO__LINEA:
				return getLinea() != null;
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
		result.append(" (horaIni: ");
		result.append(horaIni);
		result.append(", horaFin: ");
		result.append(horaFin);
		result.append(", descuento: ");
		result.append(descuento);
		result.append(')');
		return result.toString();
	}

} //DescuentoImpl
