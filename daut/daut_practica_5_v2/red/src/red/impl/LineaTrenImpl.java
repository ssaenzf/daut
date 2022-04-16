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
import red.LineaTren;
import red.ParadaTren;
import red.RedPackage;
import red.util.RedValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linea Tren</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.LineaTrenImpl#getParadaIni <em>Parada Ini</em>}</li>
 *   <li>{@link red.impl.LineaTrenImpl#getParadaFin <em>Parada Fin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineaTrenImpl extends LineaImpl implements LineaTren {
	/**
	 * The cached value of the '{@link #getParadaIni() <em>Parada Ini</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParadaIni()
	 * @generated
	 * @ordered
	 */
	protected ParadaTren paradaIni;
	/**
	 * The cached value of the '{@link #getParadaFin() <em>Parada Fin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParadaFin()
	 * @generated
	 * @ordered
	 */
	protected ParadaTren paradaFin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineaTrenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.LINEA_TREN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaTren getParadaIni() {
		if (paradaIni != null && paradaIni.eIsProxy()) {
			InternalEObject oldParadaIni = (InternalEObject)paradaIni;
			paradaIni = (ParadaTren)eResolveProxy(oldParadaIni);
			if (paradaIni != oldParadaIni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RedPackage.LINEA_TREN__PARADA_INI, oldParadaIni, paradaIni));
			}
		}
		return paradaIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaTren basicGetParadaIni() {
		return paradaIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParadaIni(ParadaTren newParadaIni) {
		ParadaTren oldParadaIni = paradaIni;
		paradaIni = newParadaIni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA_TREN__PARADA_INI, oldParadaIni, paradaIni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaTren getParadaFin() {
		if (paradaFin != null && paradaFin.eIsProxy()) {
			InternalEObject oldParadaFin = (InternalEObject)paradaFin;
			paradaFin = (ParadaTren)eResolveProxy(oldParadaFin);
			if (paradaFin != oldParadaFin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RedPackage.LINEA_TREN__PARADA_FIN, oldParadaFin, paradaFin));
			}
		}
		return paradaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaTren basicGetParadaFin() {
		return paradaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParadaFin(ParadaTren newParadaFin) {
		ParadaTren oldParadaFin = paradaFin;
		paradaFin = newParadaFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA_TREN__PARADA_FIN, oldParadaFin, paradaFin));
	}

	/**
	 * The cached validation expression for the '{@link #nonDuplicateCodigoTren(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Codigo Tren</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nonDuplicateCodigoTren(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NON_DUPLICATE_CODIGO_TREN_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\t\tLineaTren.allInstances()->isUnique(codigo)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonDuplicateCodigoTren(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.LINEA_TREN,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.LINEA_TREN___NON_DUPLICATE_CODIGO_TREN__DIAGNOSTICCHAIN_MAP,
				 NON_DUPLICATE_CODIGO_TREN_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.LINEA_TREN__NON_DUPLICATE_CODIGO_TREN);
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
				(RedPackage.Literals.LINEA_TREN,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.LINEA_TREN___LINEA_CIRCULAR__DIAGNOSTICCHAIN_MAP,
				 LINEA_CIRCULAR_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.LINEA_TREN__LINEA_CIRCULAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedPackage.LINEA_TREN__PARADA_INI:
				if (resolve) return getParadaIni();
				return basicGetParadaIni();
			case RedPackage.LINEA_TREN__PARADA_FIN:
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
			case RedPackage.LINEA_TREN__PARADA_INI:
				setParadaIni((ParadaTren)newValue);
				return;
			case RedPackage.LINEA_TREN__PARADA_FIN:
				setParadaFin((ParadaTren)newValue);
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
			case RedPackage.LINEA_TREN__PARADA_INI:
				setParadaIni((ParadaTren)null);
				return;
			case RedPackage.LINEA_TREN__PARADA_FIN:
				setParadaFin((ParadaTren)null);
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
			case RedPackage.LINEA_TREN__PARADA_INI:
				return paradaIni != null;
			case RedPackage.LINEA_TREN__PARADA_FIN:
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
			case RedPackage.LINEA_TREN___NON_DUPLICATE_CODIGO_TREN__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateCodigoTren((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA_TREN___LINEA_CIRCULAR__DIAGNOSTICCHAIN_MAP:
				return lineaCircular((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LineaTrenImpl
