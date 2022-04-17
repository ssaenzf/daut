/**
 */
package red.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import red.Linea;
import red.Parada;
import red.RedPackage;
import red.RedTransporte;
import red.ZonaTarifacion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transporte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.RedTransporteImpl#getLineas <em>Lineas</em>}</li>
 *   <li>{@link red.impl.RedTransporteImpl#getParadas <em>Paradas</em>}</li>
 *   <li>{@link red.impl.RedTransporteImpl#getZonasTarifacion <em>Zonas Tarifacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedTransporteImpl extends MinimalEObjectImpl.Container implements RedTransporte {
	/**
	 * The cached value of the '{@link #getLineas() <em>Lineas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineas()
	 * @generated
	 * @ordered
	 */
	protected EList<Linea> lineas;

	/**
	 * The cached value of the '{@link #getParadas() <em>Paradas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParadas()
	 * @generated
	 * @ordered
	 */
	protected EList<Parada> paradas;

	/**
	 * The cached value of the '{@link #getZonasTarifacion() <em>Zonas Tarifacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonasTarifacion()
	 * @generated
	 * @ordered
	 */
	protected EList<ZonaTarifacion> zonasTarifacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedTransporteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.RED_TRANSPORTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Linea> getLineas() {
		if (lineas == null) {
			lineas = new EObjectContainmentEList<Linea>(Linea.class, this, RedPackage.RED_TRANSPORTE__LINEAS);
		}
		return lineas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parada> getParadas() {
		if (paradas == null) {
			paradas = new EObjectContainmentEList<Parada>(Parada.class, this, RedPackage.RED_TRANSPORTE__PARADAS);
		}
		return paradas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ZonaTarifacion> getZonasTarifacion() {
		if (zonasTarifacion == null) {
			zonasTarifacion = new EObjectContainmentEList<ZonaTarifacion>(ZonaTarifacion.class, this, RedPackage.RED_TRANSPORTE__ZONAS_TARIFACION);
		}
		return zonasTarifacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RedPackage.RED_TRANSPORTE__LINEAS:
				return ((InternalEList<?>)getLineas()).basicRemove(otherEnd, msgs);
			case RedPackage.RED_TRANSPORTE__PARADAS:
				return ((InternalEList<?>)getParadas()).basicRemove(otherEnd, msgs);
			case RedPackage.RED_TRANSPORTE__ZONAS_TARIFACION:
				return ((InternalEList<?>)getZonasTarifacion()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedPackage.RED_TRANSPORTE__LINEAS:
				return getLineas();
			case RedPackage.RED_TRANSPORTE__PARADAS:
				return getParadas();
			case RedPackage.RED_TRANSPORTE__ZONAS_TARIFACION:
				return getZonasTarifacion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RedPackage.RED_TRANSPORTE__LINEAS:
				getLineas().clear();
				getLineas().addAll((Collection<? extends Linea>)newValue);
				return;
			case RedPackage.RED_TRANSPORTE__PARADAS:
				getParadas().clear();
				getParadas().addAll((Collection<? extends Parada>)newValue);
				return;
			case RedPackage.RED_TRANSPORTE__ZONAS_TARIFACION:
				getZonasTarifacion().clear();
				getZonasTarifacion().addAll((Collection<? extends ZonaTarifacion>)newValue);
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
			case RedPackage.RED_TRANSPORTE__LINEAS:
				getLineas().clear();
				return;
			case RedPackage.RED_TRANSPORTE__PARADAS:
				getParadas().clear();
				return;
			case RedPackage.RED_TRANSPORTE__ZONAS_TARIFACION:
				getZonasTarifacion().clear();
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
			case RedPackage.RED_TRANSPORTE__LINEAS:
				return lineas != null && !lineas.isEmpty();
			case RedPackage.RED_TRANSPORTE__PARADAS:
				return paradas != null && !paradas.isEmpty();
			case RedPackage.RED_TRANSPORTE__ZONAS_TARIFACION:
				return zonasTarifacion != null && !zonasTarifacion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RedTransporteImpl
