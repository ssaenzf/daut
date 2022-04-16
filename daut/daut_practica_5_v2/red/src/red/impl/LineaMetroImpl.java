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
import red.Colores;
import red.LineaMetro;
import red.ParadaMetro;
import red.RedPackage;
import red.util.RedValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linea Metro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.LineaMetroImpl#getColor <em>Color</em>}</li>
 *   <li>{@link red.impl.LineaMetroImpl#getParadaIni <em>Parada Ini</em>}</li>
 *   <li>{@link red.impl.LineaMetroImpl#getParadaFin <em>Parada Fin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineaMetroImpl extends LineaImpl implements LineaMetro {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Colores COLOR_EDEFAULT = Colores.ROJO;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Colores color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParadaIni() <em>Parada Ini</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParadaIni()
	 * @generated
	 * @ordered
	 */
	protected ParadaMetro paradaIni;

	/**
	 * The cached value of the '{@link #getParadaFin() <em>Parada Fin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParadaFin()
	 * @generated
	 * @ordered
	 */
	protected ParadaMetro paradaFin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineaMetroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.LINEA_METRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colores getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Colores newColor) {
		Colores oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA_METRO__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaMetro getParadaIni() {
		if (paradaIni != null && paradaIni.eIsProxy()) {
			InternalEObject oldParadaIni = (InternalEObject)paradaIni;
			paradaIni = (ParadaMetro)eResolveProxy(oldParadaIni);
			if (paradaIni != oldParadaIni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RedPackage.LINEA_METRO__PARADA_INI, oldParadaIni, paradaIni));
			}
		}
		return paradaIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaMetro basicGetParadaIni() {
		return paradaIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParadaIni(ParadaMetro newParadaIni) {
		ParadaMetro oldParadaIni = paradaIni;
		paradaIni = newParadaIni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA_METRO__PARADA_INI, oldParadaIni, paradaIni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaMetro getParadaFin() {
		if (paradaFin != null && paradaFin.eIsProxy()) {
			InternalEObject oldParadaFin = (InternalEObject)paradaFin;
			paradaFin = (ParadaMetro)eResolveProxy(oldParadaFin);
			if (paradaFin != oldParadaFin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RedPackage.LINEA_METRO__PARADA_FIN, oldParadaFin, paradaFin));
			}
		}
		return paradaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaMetro basicGetParadaFin() {
		return paradaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParadaFin(ParadaMetro newParadaFin) {
		ParadaMetro oldParadaFin = paradaFin;
		paradaFin = newParadaFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA_METRO__PARADA_FIN, oldParadaFin, paradaFin));
	}

	/**
	 * The cached validation expression for the '{@link #nonDuplicateColores(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Colores</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nonDuplicateColores(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NON_DUPLICATE_COLORES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\t\tLineaMetro.allInstances()->isUnique(color)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonDuplicateColores(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.LINEA_METRO,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.LINEA_METRO___NON_DUPLICATE_COLORES__DIAGNOSTICCHAIN_MAP,
				 NON_DUPLICATE_COLORES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.LINEA_METRO__NON_DUPLICATE_COLORES);
	}

	/**
	 * The cached validation expression for the '{@link #nonDuplicateCodigoMetro(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Codigo Metro</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nonDuplicateCodigoMetro(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NON_DUPLICATE_CODIGO_METRO_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\t\tLineaMetro.allInstances()->isUnique(codigo)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonDuplicateCodigoMetro(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.LINEA_METRO,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.LINEA_METRO___NON_DUPLICATE_CODIGO_METRO__DIAGNOSTICCHAIN_MAP,
				 NON_DUPLICATE_CODIGO_METRO_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.LINEA_METRO__NON_DUPLICATE_CODIGO_METRO);
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
				(RedPackage.Literals.LINEA_METRO,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.LINEA_METRO___LINEA_CIRCULAR__DIAGNOSTICCHAIN_MAP,
				 LINEA_CIRCULAR_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.LINEA_METRO__LINEA_CIRCULAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedPackage.LINEA_METRO__COLOR:
				return getColor();
			case RedPackage.LINEA_METRO__PARADA_INI:
				if (resolve) return getParadaIni();
				return basicGetParadaIni();
			case RedPackage.LINEA_METRO__PARADA_FIN:
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
			case RedPackage.LINEA_METRO__COLOR:
				setColor((Colores)newValue);
				return;
			case RedPackage.LINEA_METRO__PARADA_INI:
				setParadaIni((ParadaMetro)newValue);
				return;
			case RedPackage.LINEA_METRO__PARADA_FIN:
				setParadaFin((ParadaMetro)newValue);
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
			case RedPackage.LINEA_METRO__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case RedPackage.LINEA_METRO__PARADA_INI:
				setParadaIni((ParadaMetro)null);
				return;
			case RedPackage.LINEA_METRO__PARADA_FIN:
				setParadaFin((ParadaMetro)null);
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
			case RedPackage.LINEA_METRO__COLOR:
				return color != COLOR_EDEFAULT;
			case RedPackage.LINEA_METRO__PARADA_INI:
				return paradaIni != null;
			case RedPackage.LINEA_METRO__PARADA_FIN:
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
			case RedPackage.LINEA_METRO___NON_DUPLICATE_COLORES__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateColores((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA_METRO___NON_DUPLICATE_CODIGO_METRO__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateCodigoMetro((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA_METRO___LINEA_CIRCULAR__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //LineaMetroImpl
