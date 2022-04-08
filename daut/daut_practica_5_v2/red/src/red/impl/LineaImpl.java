/**
 */
package red.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import red.Descuento;
import red.Linea;
import red.Parada;
import red.RedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linea</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.LineaImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getDescuentos <em>Descuentos</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getHoraApertura <em>Hora Apertura</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getHoraCierre <em>Hora Cierre</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getSiguienteParadaTiempo <em>Siguiente Parada Tiempo</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getSiguienteParadaDistancia <em>Siguiente Parada Distancia</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getParadas <em>Paradas</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LineaImpl extends MinimalEObjectImpl.Container implements Linea {
	/**
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected String codigo = CODIGO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescuentos() <em>Descuentos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescuentos()
	 * @generated
	 * @ordered
	 */
	protected EList<Descuento> descuentos;

	/**
	 * The default value of the '{@link #getHoraApertura() <em>Hora Apertura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraApertura()
	 * @generated
	 * @ordered
	 */
	protected static final int HORA_APERTURA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHoraApertura() <em>Hora Apertura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraApertura()
	 * @generated
	 * @ordered
	 */
	protected int horaApertura = HORA_APERTURA_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoraCierre() <em>Hora Cierre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraCierre()
	 * @generated
	 * @ordered
	 */
	protected static final int HORA_CIERRE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHoraCierre() <em>Hora Cierre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraCierre()
	 * @generated
	 * @ordered
	 */
	protected int horaCierre = HORA_CIERRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSiguienteParadaTiempo() <em>Siguiente Parada Tiempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiguienteParadaTiempo()
	 * @generated
	 * @ordered
	 */
	protected Map<?, ?> siguienteParadaTiempo;

	/**
	 * The cached value of the '{@link #getSiguienteParadaDistancia() <em>Siguiente Parada Distancia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiguienteParadaDistancia()
	 * @generated
	 * @ordered
	 */
	protected Map<?, ?> siguienteParadaDistancia;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.LINEA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(String newCodigo) {
		String oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Descuento> getDescuentos() {
		if (descuentos == null) {
			descuentos = new EObjectContainmentEList<Descuento>(Descuento.class, this, RedPackage.LINEA__DESCUENTOS);
		}
		return descuentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoraApertura() {
		return horaApertura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoraApertura(int newHoraApertura) {
		int oldHoraApertura = horaApertura;
		horaApertura = newHoraApertura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__HORA_APERTURA, oldHoraApertura, horaApertura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoraCierre() {
		return horaCierre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoraCierre(int newHoraCierre) {
		int oldHoraCierre = horaCierre;
		horaCierre = newHoraCierre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__HORA_CIERRE, oldHoraCierre, horaCierre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> getSiguienteParadaTiempo() {
		return siguienteParadaTiempo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiguienteParadaTiempo(Map<?, ?> newSiguienteParadaTiempo) {
		Map<?, ?> oldSiguienteParadaTiempo = siguienteParadaTiempo;
		siguienteParadaTiempo = newSiguienteParadaTiempo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__SIGUIENTE_PARADA_TIEMPO, oldSiguienteParadaTiempo, siguienteParadaTiempo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> getSiguienteParadaDistancia() {
		return siguienteParadaDistancia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiguienteParadaDistancia(Map<?, ?> newSiguienteParadaDistancia) {
		Map<?, ?> oldSiguienteParadaDistancia = siguienteParadaDistancia;
		siguienteParadaDistancia = newSiguienteParadaDistancia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA, oldSiguienteParadaDistancia, siguienteParadaDistancia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parada> getParadas() {
		if (paradas == null) {
			paradas = new EObjectContainmentEList<Parada>(Parada.class, this, RedPackage.LINEA__PARADAS);
		}
		return paradas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RedPackage.LINEA__DESCUENTOS:
				return ((InternalEList<?>)getDescuentos()).basicRemove(otherEnd, msgs);
			case RedPackage.LINEA__PARADAS:
				return ((InternalEList<?>)getParadas()).basicRemove(otherEnd, msgs);
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
			case RedPackage.LINEA__CODIGO:
				return getCodigo();
			case RedPackage.LINEA__DESCUENTOS:
				return getDescuentos();
			case RedPackage.LINEA__HORA_APERTURA:
				return getHoraApertura();
			case RedPackage.LINEA__HORA_CIERRE:
				return getHoraCierre();
			case RedPackage.LINEA__SIGUIENTE_PARADA_TIEMPO:
				return getSiguienteParadaTiempo();
			case RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA:
				return getSiguienteParadaDistancia();
			case RedPackage.LINEA__PARADAS:
				return getParadas();
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
			case RedPackage.LINEA__CODIGO:
				setCodigo((String)newValue);
				return;
			case RedPackage.LINEA__DESCUENTOS:
				getDescuentos().clear();
				getDescuentos().addAll((Collection<? extends Descuento>)newValue);
				return;
			case RedPackage.LINEA__HORA_APERTURA:
				setHoraApertura((Integer)newValue);
				return;
			case RedPackage.LINEA__HORA_CIERRE:
				setHoraCierre((Integer)newValue);
				return;
			case RedPackage.LINEA__SIGUIENTE_PARADA_TIEMPO:
				setSiguienteParadaTiempo((Map<?, ?>)newValue);
				return;
			case RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA:
				setSiguienteParadaDistancia((Map<?, ?>)newValue);
				return;
			case RedPackage.LINEA__PARADAS:
				getParadas().clear();
				getParadas().addAll((Collection<? extends Parada>)newValue);
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
			case RedPackage.LINEA__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case RedPackage.LINEA__DESCUENTOS:
				getDescuentos().clear();
				return;
			case RedPackage.LINEA__HORA_APERTURA:
				setHoraApertura(HORA_APERTURA_EDEFAULT);
				return;
			case RedPackage.LINEA__HORA_CIERRE:
				setHoraCierre(HORA_CIERRE_EDEFAULT);
				return;
			case RedPackage.LINEA__SIGUIENTE_PARADA_TIEMPO:
				setSiguienteParadaTiempo((Map<?, ?>)null);
				return;
			case RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA:
				setSiguienteParadaDistancia((Map<?, ?>)null);
				return;
			case RedPackage.LINEA__PARADAS:
				getParadas().clear();
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
			case RedPackage.LINEA__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case RedPackage.LINEA__DESCUENTOS:
				return descuentos != null && !descuentos.isEmpty();
			case RedPackage.LINEA__HORA_APERTURA:
				return horaApertura != HORA_APERTURA_EDEFAULT;
			case RedPackage.LINEA__HORA_CIERRE:
				return horaCierre != HORA_CIERRE_EDEFAULT;
			case RedPackage.LINEA__SIGUIENTE_PARADA_TIEMPO:
				return siguienteParadaTiempo != null;
			case RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA:
				return siguienteParadaDistancia != null;
			case RedPackage.LINEA__PARADAS:
				return paradas != null && !paradas.isEmpty();
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
		result.append(" (codigo: ");
		result.append(codigo);
		result.append(", horaApertura: ");
		result.append(horaApertura);
		result.append(", horaCierre: ");
		result.append(horaCierre);
		result.append(", siguienteParadaTiempo: ");
		result.append(siguienteParadaTiempo);
		result.append(", siguienteParadaDistancia: ");
		result.append(siguienteParadaDistancia);
		result.append(')');
		return result.toString();
	}

} //LineaImpl
