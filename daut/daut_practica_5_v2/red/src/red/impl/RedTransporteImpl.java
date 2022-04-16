/**
 */
package red.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
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
import red.util.RedValidator;

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
	 * The cached validation expression for the '{@link #restriccionTarifasZona(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Restriccion Tarifas Zona</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #restriccionTarifasZona(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String RESTRICCION_TARIFAS_ZONA_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\tzonasTarifacion->forAll(zona1|\n" +
		"\t\t\tzonasTarifacion->forAll(zona2|\n" +
		"\t\t\t\t(zona1.enumeracion < zona2.enumeracion) implies (\n" +
		"\t\t\t\t\t(zona2.tarifaBus > zona1.tarifaBus) and (zona2.tarifaMetro > zona1.tarifaMetro) and (zona2.tarifaTren > zona1.tarifaTren)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean restriccionTarifasZona(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.RED_TRANSPORTE,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.RED_TRANSPORTE___RESTRICCION_TARIFAS_ZONA__DIAGNOSTICCHAIN_MAP,
				 RESTRICCION_TARIFAS_ZONA_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.RED_TRANSPORTE__RESTRICCION_TARIFAS_ZONA);
	}

	/**
	 * The cached validation expression for the '{@link #lineasParadasConsecutivasIguales(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Lineas Paradas Consecutivas Iguales</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #lineasParadasConsecutivasIguales(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAS_PARADAS_CONSECUTIVAS_IGUALES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\t\tlineas->forAll(linea1, linea2 | \n" +
		"\t\t\t\tlinea1.paradas->forAll(par1|\n" +
		"\t\t\t\t\tlinea2.paradas->forAll(par2|\n" +
		"\t\t\t\t\t\t(par1 = par2) implies (\n" +
		"\t\t\t\t\t\t\tlinea2.paradas->forAll(par3|\n" +
		"\t\t\t\t\t\t\t\tlinea1.paradas->forAll(par4|\n" +
		"\t\t\t\t\t\t\t\t\t((par3 = par4) and (linea1.paradas->indexOf(par4) = 1 + linea1.paradas->indexOf(par1)) and (linea2.paradas->indexOf(par2) = 1 + linea2.paradas->indexOf(par3))) implies(\n" +
		"\t\t\t\t\t\t\t\t\t\tlinea1.siguienteParadaDistancia->forAll(dis1|\n" +
		"\t\t\t\t\t\t\t\t\t\t\t(linea1.siguienteParadaDistancia->indexOf(dis1) = linea1.paradas->indexOf(par1)) implies(\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\tlinea2.siguienteParadaDistancia->forAll(dis2|\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t(linea2.siguienteParadaDistancia->indexOf(dis2) = linea2.paradas->indexOf(par2)) implies(\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\tdis1 = dis2\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean lineasParadasConsecutivasIguales(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.RED_TRANSPORTE,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.RED_TRANSPORTE___LINEAS_PARADAS_CONSECUTIVAS_IGUALES__DIAGNOSTICCHAIN_MAP,
				 LINEAS_PARADAS_CONSECUTIVAS_IGUALES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.RED_TRANSPORTE__LINEAS_PARADAS_CONSECUTIVAS_IGUALES);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RedPackage.RED_TRANSPORTE___RESTRICCION_TARIFAS_ZONA__DIAGNOSTICCHAIN_MAP:
				return restriccionTarifasZona((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.RED_TRANSPORTE___LINEAS_PARADAS_CONSECUTIVAS_IGUALES__DIAGNOSTICCHAIN_MAP:
				return lineasParadasConsecutivasIguales((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RedTransporteImpl
