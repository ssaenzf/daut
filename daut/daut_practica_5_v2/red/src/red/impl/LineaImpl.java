/**
 */
package red.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import red.Descuento;
import red.Linea;
import red.Parada;
import red.RedPackage;
import red.util.RedValidator;

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
 *   <li>{@link red.impl.LineaImpl#isCircular <em>Circular</em>}</li>
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
	 * The cached value of the '{@link #getSiguienteParadaTiempo() <em>Siguiente Parada Tiempo</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiguienteParadaTiempo()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> siguienteParadaTiempo;

	/**
	 * The cached value of the '{@link #getSiguienteParadaDistancia() <em>Siguiente Parada Distancia</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiguienteParadaDistancia()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> siguienteParadaDistancia;

	/**
	 * The default value of the '{@link #isCircular() <em>Circular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCircular()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CIRCULAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCircular() <em>Circular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCircular()
	 * @generated
	 * @ordered
	 */
	protected boolean circular = CIRCULAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParadas() <em>Paradas</em>}' reference list.
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
			descuentos = new EObjectContainmentWithInverseEList<Descuento>(Descuento.class, this, RedPackage.LINEA__DESCUENTOS, RedPackage.DESCUENTO__LINEA);
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
	public EList<Double> getSiguienteParadaTiempo() {
		if (siguienteParadaTiempo == null) {
			siguienteParadaTiempo = new EDataTypeUniqueEList<Double>(Double.class, this, RedPackage.LINEA__SIGUIENTE_PARADA_TIEMPO);
		}
		return siguienteParadaTiempo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getSiguienteParadaDistancia() {
		if (siguienteParadaDistancia == null) {
			siguienteParadaDistancia = new EDataTypeUniqueEList<Double>(Double.class, this, RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA);
		}
		return siguienteParadaDistancia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCircular() {
		return circular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircular(boolean newCircular) {
		boolean oldCircular = circular;
		circular = newCircular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__CIRCULAR, oldCircular, circular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parada> getParadas() {
		if (paradas == null) {
			paradas = new EObjectResolvingEList<Parada>(Parada.class, this, RedPackage.LINEA__PARADAS);
		}
		return paradas;
	}

	/**
	 * The cached validation expression for the '{@link #horarioCorrecto(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Horario Correcto</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #horarioCorrecto(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String HORARIO_CORRECTO_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\t\t(horaApertura >= 0 and horaApertura <= 23) and \n" +
		"\t\t\t(horaCierre >= 0 and horaCierre <= 23) and\n" +
		"\t\t\t(horaApertura <> horaCierre) and (horaCierre > horaApertura)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean horarioCorrecto(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.LINEA,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.LINEA___HORARIO_CORRECTO__DIAGNOSTICCHAIN_MAP,
				 HORARIO_CORRECTO_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.LINEA__HORARIO_CORRECTO);
	}

	/**
	 * The cached validation expression for the '{@link #nonDescuentosSolapados(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Descuentos Solapados</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nonDescuentosSolapados(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NON_DESCUENTOS_SOLAPADOS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\t\tdescuentos->forAll(d1,d2 |\n" +
		"\t\t\t\tif ((d1.horaIni < d2.horaFin and d1.horaIni > d2.horaIni) or (d1.horaFin < d2.horaFin and d1.horaFin > d2.horaIni)) then false\n" +
		"\t\t\t\telse true endif\n" +
		"\t\t\t)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonDescuentosSolapados(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.LINEA,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.LINEA___NON_DESCUENTOS_SOLAPADOS__DIAGNOSTICCHAIN_MAP,
				 NON_DESCUENTOS_SOLAPADOS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.LINEA__NON_DESCUENTOS_SOLAPADOS);
	}

	/**
	 * The cached validation expression for the '{@link #zonaTarificacionParadasConsecutivas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Zona Tarificacion Paradas Consecutivas</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #zonaTarificacionParadasConsecutivas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ZONA_TARIFICACION_PARADAS_CONSECUTIVAS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\tparadas->forAll(parada1|\n" +
		"\t\t\tparadas->forAll(parada2|\n" +
		"\t\t\t\t(paradas->indexOf(parada1) = 1 + paradas->indexOf(parada2)) implies (\n" +
		"\t\t\t\t\t(parada1.zonatarificacion.enumeracion = parada2.zonatarificacion.enumeracion) or (parada1.zonatarificacion.enumeracion = parada2.zonatarificacion.enumeracion + 1) \n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean zonaTarificacionParadasConsecutivas(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.LINEA,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.LINEA___ZONA_TARIFICACION_PARADAS_CONSECUTIVAS__DIAGNOSTICCHAIN_MAP,
				 ZONA_TARIFICACION_PARADAS_CONSECUTIVAS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.LINEA__ZONA_TARIFICACION_PARADAS_CONSECUTIVAS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RedPackage.LINEA__DESCUENTOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDescuentos()).basicAdd(otherEnd, msgs);
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
			case RedPackage.LINEA__DESCUENTOS:
				return ((InternalEList<?>)getDescuentos()).basicRemove(otherEnd, msgs);
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
			case RedPackage.LINEA__CIRCULAR:
				return isCircular();
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
				getSiguienteParadaTiempo().clear();
				getSiguienteParadaTiempo().addAll((Collection<? extends Double>)newValue);
				return;
			case RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA:
				getSiguienteParadaDistancia().clear();
				getSiguienteParadaDistancia().addAll((Collection<? extends Double>)newValue);
				return;
			case RedPackage.LINEA__CIRCULAR:
				setCircular((Boolean)newValue);
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
				getSiguienteParadaTiempo().clear();
				return;
			case RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA:
				getSiguienteParadaDistancia().clear();
				return;
			case RedPackage.LINEA__CIRCULAR:
				setCircular(CIRCULAR_EDEFAULT);
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
				return siguienteParadaTiempo != null && !siguienteParadaTiempo.isEmpty();
			case RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA:
				return siguienteParadaDistancia != null && !siguienteParadaDistancia.isEmpty();
			case RedPackage.LINEA__CIRCULAR:
				return circular != CIRCULAR_EDEFAULT;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RedPackage.LINEA___HORARIO_CORRECTO__DIAGNOSTICCHAIN_MAP:
				return horarioCorrecto((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA___NON_DESCUENTOS_SOLAPADOS__DIAGNOSTICCHAIN_MAP:
				return nonDescuentosSolapados((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA___ZONA_TARIFICACION_PARADAS_CONSECUTIVAS__DIAGNOSTICCHAIN_MAP:
				return zonaTarificacionParadasConsecutivas((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", circular: ");
		result.append(circular);
		result.append(')');
		return result.toString();
	}

} //LineaImpl
