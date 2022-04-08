/**
 */
package red.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;
import red.Descuento;
import red.RedPackage;
import red.RedTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descuento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.DescuentoImpl#getHoraApertura <em>Hora Apertura</em>}</li>
 *   <li>{@link red.impl.DescuentoImpl#getHoraCierre <em>Hora Cierre</em>}</li>
 *   <li>{@link red.impl.DescuentoImpl#getDescuento <em>Descuento</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescuentoImpl extends MinimalEObjectImpl.Container implements Descuento {
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
	 * The default value of the '{@link #getDescuento() <em>Descuento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescuento()
	 * @generated
	 * @ordered
	 */
	protected static final double DESCUENTO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDescuento() <em>Descuento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescuento()
	 * @generated
	 * @ordered
	 */
	protected double descuento = DESCUENTO_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.DESCUENTO__HORA_APERTURA, oldHoraApertura, horaApertura));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.DESCUENTO__HORA_CIERRE, oldHoraCierre, horaCierre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDescuento() {
		return descuento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescuento(double newDescuento) {
		double oldDescuento = descuento;
		descuento = newDescuento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.DESCUENTO__DESCUENTO, oldDescuento, descuento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean positiveDescuento(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Descuento::positiveDescuento";
		try {
			/**
			 *
			 * inv positiveDescuento:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = descuento > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.DESCUENTO___POSITIVE_DESCUENTO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ double descuento = this.getDescuento();
				final /*@NonInvalid*/ RealValue BOXED_descuento = ValueUtil.realValueOf(descuento);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_descuento, RedTables.INT_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RedTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedPackage.DESCUENTO__HORA_APERTURA:
				return getHoraApertura();
			case RedPackage.DESCUENTO__HORA_CIERRE:
				return getHoraCierre();
			case RedPackage.DESCUENTO__DESCUENTO:
				return getDescuento();
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
			case RedPackage.DESCUENTO__HORA_APERTURA:
				setHoraApertura((Integer)newValue);
				return;
			case RedPackage.DESCUENTO__HORA_CIERRE:
				setHoraCierre((Integer)newValue);
				return;
			case RedPackage.DESCUENTO__DESCUENTO:
				setDescuento((Double)newValue);
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
			case RedPackage.DESCUENTO__HORA_APERTURA:
				setHoraApertura(HORA_APERTURA_EDEFAULT);
				return;
			case RedPackage.DESCUENTO__HORA_CIERRE:
				setHoraCierre(HORA_CIERRE_EDEFAULT);
				return;
			case RedPackage.DESCUENTO__DESCUENTO:
				setDescuento(DESCUENTO_EDEFAULT);
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
			case RedPackage.DESCUENTO__HORA_APERTURA:
				return horaApertura != HORA_APERTURA_EDEFAULT;
			case RedPackage.DESCUENTO__HORA_CIERRE:
				return horaCierre != HORA_CIERRE_EDEFAULT;
			case RedPackage.DESCUENTO__DESCUENTO:
				return descuento != DESCUENTO_EDEFAULT;
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
			case RedPackage.DESCUENTO___POSITIVE_DESCUENTO__DIAGNOSTICCHAIN_MAP:
				return positiveDescuento((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (horaApertura: ");
		result.append(horaApertura);
		result.append(", horaCierre: ");
		result.append(horaCierre);
		result.append(", descuento: ");
		result.append(descuento);
		result.append(')');
		return result.toString();
	}

} //DescuentoImpl
