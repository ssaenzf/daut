/**
 */
package red.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import red.LineaTren;
import red.RedPackage;
import red.RedTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linea Tren</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.LineaTrenImpl#isDiurna <em>Diurna</em>}</li>
 *   <li>{@link red.impl.LineaTrenImpl#isNocturna <em>Nocturna</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineaTrenImpl extends LineaImpl implements LineaTren {
	/**
	 * The default value of the '{@link #isDiurna() <em>Diurna</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiurna()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIURNA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDiurna() <em>Diurna</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiurna()
	 * @generated
	 * @ordered
	 */
	protected boolean diurna = DIURNA_EDEFAULT;

	/**
	 * The default value of the '{@link #isNocturna() <em>Nocturna</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNocturna()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOCTURNA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNocturna() <em>Nocturna</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNocturna()
	 * @generated
	 * @ordered
	 */
	protected boolean nocturna = NOCTURNA_EDEFAULT;

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
	public boolean isDiurna() {
		return diurna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiurna(boolean newDiurna) {
		boolean oldDiurna = diurna;
		diurna = newDiurna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA_TREN__DIURNA, oldDiurna, diurna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNocturna() {
		return nocturna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNocturna(boolean newNocturna) {
		boolean oldNocturna = nocturna;
		nocturna = newNocturna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA_TREN__NOCTURNA, oldNocturna, nocturna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonDuplicateCodigoTren(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "LineaTren::nonDuplicateCodigoTren";
		try {
			/**
			 *
			 * inv nonDuplicateCodigoTren:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = LineaTren.allInstances()
			 *         ->isUnique(codigo)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.LINEA_TREN___NON_DUPLICATE_CODIGO_TREN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_red_c_c_LineaTren = idResolver.getClass(RedTables.CLSSid_LineaTren, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, RedTables.SET_CLSSid_LineaTren, TYP_red_c_c_LineaTren);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(RedTables.SET_CLSSid_LineaTren);
				Iterator<Object> ITERATOR__1 = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ LineaTren _1 = (LineaTren)ITERATOR__1.next();
					/**
					 * codigo
					 */
					final /*@NonInvalid*/ String codigo = _1.getCodigo();
					//
					if (accumulator.includes(codigo) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(codigo);
					}
				}
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
			case RedPackage.LINEA_TREN__DIURNA:
				return isDiurna();
			case RedPackage.LINEA_TREN__NOCTURNA:
				return isNocturna();
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
			case RedPackage.LINEA_TREN__DIURNA:
				setDiurna((Boolean)newValue);
				return;
			case RedPackage.LINEA_TREN__NOCTURNA:
				setNocturna((Boolean)newValue);
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
			case RedPackage.LINEA_TREN__DIURNA:
				setDiurna(DIURNA_EDEFAULT);
				return;
			case RedPackage.LINEA_TREN__NOCTURNA:
				setNocturna(NOCTURNA_EDEFAULT);
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
			case RedPackage.LINEA_TREN__DIURNA:
				return diurna != DIURNA_EDEFAULT;
			case RedPackage.LINEA_TREN__NOCTURNA:
				return nocturna != NOCTURNA_EDEFAULT;
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
		result.append(" (diurna: ");
		result.append(diurna);
		result.append(", nocturna: ");
		result.append(nocturna);
		result.append(')');
		return result.toString();
	}

} //LineaTrenImpl
