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

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import red.LineaBus;
import red.ParadaBus;
import red.RedPackage;
import red.util.RedValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linea Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.LineaBusImpl#isIsDiurna <em>Is Diurna</em>}</li>
 *   <li>{@link red.impl.LineaBusImpl#getParadaIni <em>Parada Ini</em>}</li>
 *   <li>{@link red.impl.LineaBusImpl#getParadaFin <em>Parada Fin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineaBusImpl extends LineaImpl implements LineaBus {
	/**
	 * The default value of the '{@link #isIsDiurna() <em>Is Diurna</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDiurna()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIURNA_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsDiurna() <em>Is Diurna</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDiurna()
	 * @generated
	 * @ordered
	 */
	protected boolean isDiurna = IS_DIURNA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParadaIni() <em>Parada Ini</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParadaIni()
	 * @generated
	 * @ordered
	 */
	protected ParadaBus paradaIni;

	/**
	 * The cached value of the '{@link #getParadaFin() <em>Parada Fin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParadaFin()
	 * @generated
	 * @ordered
	 */
	protected ParadaBus paradaFin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineaBusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.LINEA_BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDiurna() {
		return isDiurna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDiurna(boolean newIsDiurna) {
		boolean oldIsDiurna = isDiurna;
		isDiurna = newIsDiurna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA_BUS__IS_DIURNA, oldIsDiurna, isDiurna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaBus getParadaIni() {
		if (paradaIni != null && paradaIni.eIsProxy()) {
			InternalEObject oldParadaIni = (InternalEObject)paradaIni;
			paradaIni = (ParadaBus)eResolveProxy(oldParadaIni);
			if (paradaIni != oldParadaIni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RedPackage.LINEA_BUS__PARADA_INI, oldParadaIni, paradaIni));
			}
		}
		return paradaIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaBus basicGetParadaIni() {
		return paradaIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParadaIni(ParadaBus newParadaIni) {
		ParadaBus oldParadaIni = paradaIni;
		paradaIni = newParadaIni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA_BUS__PARADA_INI, oldParadaIni, paradaIni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaBus getParadaFin() {
		if (paradaFin != null && paradaFin.eIsProxy()) {
			InternalEObject oldParadaFin = (InternalEObject)paradaFin;
			paradaFin = (ParadaBus)eResolveProxy(oldParadaFin);
			if (paradaFin != oldParadaFin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RedPackage.LINEA_BUS__PARADA_FIN, oldParadaFin, paradaFin));
			}
		}
		return paradaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaBus basicGetParadaFin() {
		return paradaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParadaFin(ParadaBus newParadaFin) {
		ParadaBus oldParadaFin = paradaFin;
		paradaFin = newParadaFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA_BUS__PARADA_FIN, oldParadaFin, paradaFin));
	}

	/**
	 * The cached validation expression for the '{@link #nonDuplicateCodigoBus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Codigo Bus</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nonDuplicateCodigoBus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NON_DUPLICATE_CODIGO_BUS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\t\tLineaBus.allInstances()->isUnique(codigo)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonDuplicateCodigoBus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.LINEA_BUS,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.LINEA_BUS___NON_DUPLICATE_CODIGO_BUS__DIAGNOSTICCHAIN_MAP,
				 NON_DUPLICATE_CODIGO_BUS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.LINEA_BUS__NON_DUPLICATE_CODIGO_BUS);
	}

	/**
	 * The cached validation expression for the '{@link #lineaDiurna(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Linea Diurna</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #lineaDiurna(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String LINEA_DIURNA_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\t\tif isDiurna = true then\n" +
		"\t\t\t\t(horaApertura >= 6 and horaCierre <= 23) and (horaCierre > horaApertura)\n" +
		"\t\t\telse \n" +
		"\t\t\t\t(horaApertura >= 0 and horaCierre <=5) and (horaCierre > horaApertura)\n" +
		"\t\t\tendif";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean lineaDiurna(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.LINEA_BUS,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.LINEA_BUS___LINEA_DIURNA__DIAGNOSTICCHAIN_MAP,
				 LINEA_DIURNA_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.LINEA_BUS__LINEA_DIURNA);
	}

	/**
	 * The cached validation expression for the '{@link #lineaCircular(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Linea Circular</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #lineaCircular(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String LINEA_CIRCULAR_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\t\tif circular = true then\n" +
		"\t\t\t\tparadaFin = paradaIni \n" +
		"\t\t\telse \n" +
		"\t\t\t\tparadaFin <> paradaIni \n" +
		"\t\t\tendif";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean lineaCircular(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.LINEA_BUS,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.LINEA_BUS___LINEA_CIRCULAR__DIAGNOSTICCHAIN_MAP,
				 LINEA_CIRCULAR_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.LINEA_BUS__LINEA_CIRCULAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedPackage.LINEA_BUS__IS_DIURNA:
				return isIsDiurna();
			case RedPackage.LINEA_BUS__PARADA_INI:
				if (resolve) return getParadaIni();
				return basicGetParadaIni();
			case RedPackage.LINEA_BUS__PARADA_FIN:
				if (resolve) return getParadaFin();
				return basicGetParadaFin();
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
			case RedPackage.LINEA_BUS__IS_DIURNA:
				setIsDiurna((Boolean)newValue);
				return;
			case RedPackage.LINEA_BUS__PARADA_INI:
				setParadaIni((ParadaBus)newValue);
				return;
			case RedPackage.LINEA_BUS__PARADA_FIN:
				setParadaFin((ParadaBus)newValue);
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
			case RedPackage.LINEA_BUS__IS_DIURNA:
				setIsDiurna(IS_DIURNA_EDEFAULT);
				return;
			case RedPackage.LINEA_BUS__PARADA_INI:
				setParadaIni((ParadaBus)null);
				return;
			case RedPackage.LINEA_BUS__PARADA_FIN:
				setParadaFin((ParadaBus)null);
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
			case RedPackage.LINEA_BUS__IS_DIURNA:
				return isDiurna != IS_DIURNA_EDEFAULT;
			case RedPackage.LINEA_BUS__PARADA_INI:
				return paradaIni != null;
			case RedPackage.LINEA_BUS__PARADA_FIN:
				return paradaFin != null;
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
			case RedPackage.LINEA_BUS___NON_DUPLICATE_CODIGO_BUS__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateCodigoBus((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA_BUS___LINEA_DIURNA__DIAGNOSTICCHAIN_MAP:
				return lineaDiurna((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA_BUS___LINEA_CIRCULAR__DIAGNOSTICCHAIN_MAP:
				return lineaCircular((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (isDiurna: ");
		result.append(isDiurna);
		result.append(')');
		return result.toString();
	}

} //LineaBusImpl
