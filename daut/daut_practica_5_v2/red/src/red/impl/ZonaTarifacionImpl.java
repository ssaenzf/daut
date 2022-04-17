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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;
import red.RedPackage;
import red.RedTables;
import red.ZonaTarifacion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zona Tarifacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.ZonaTarifacionImpl#getEnumeracion <em>Enumeracion</em>}</li>
 *   <li>{@link red.impl.ZonaTarifacionImpl#getTarifaBus <em>Tarifa Bus</em>}</li>
 *   <li>{@link red.impl.ZonaTarifacionImpl#getTarifaMetro <em>Tarifa Metro</em>}</li>
 *   <li>{@link red.impl.ZonaTarifacionImpl#getTarifaTren <em>Tarifa Tren</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZonaTarifacionImpl extends MinimalEObjectImpl.Container implements ZonaTarifacion {
	/**
	 * The default value of the '{@link #getEnumeracion() <em>Enumeracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeracion()
	 * @generated
	 * @ordered
	 */
	protected static final int ENUMERACION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getEnumeracion() <em>Enumeracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeracion()
	 * @generated
	 * @ordered
	 */
	protected int enumeracion = ENUMERACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarifaBus() <em>Tarifa Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifaBus()
	 * @generated
	 * @ordered
	 */
	protected static final double TARIFA_BUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTarifaBus() <em>Tarifa Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifaBus()
	 * @generated
	 * @ordered
	 */
	protected double tarifaBus = TARIFA_BUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarifaMetro() <em>Tarifa Metro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifaMetro()
	 * @generated
	 * @ordered
	 */
	protected static final double TARIFA_METRO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTarifaMetro() <em>Tarifa Metro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifaMetro()
	 * @generated
	 * @ordered
	 */
	protected double tarifaMetro = TARIFA_METRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarifaTren() <em>Tarifa Tren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifaTren()
	 * @generated
	 * @ordered
	 */
	protected static final double TARIFA_TREN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTarifaTren() <em>Tarifa Tren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarifaTren()
	 * @generated
	 * @ordered
	 */
	protected double tarifaTren = TARIFA_TREN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZonaTarifacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.ZONA_TARIFACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnumeracion() {
		return enumeracion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeracion(int newEnumeracion) {
		int oldEnumeracion = enumeracion;
		enumeracion = newEnumeracion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.ZONA_TARIFACION__ENUMERACION, oldEnumeracion, enumeracion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTarifaBus() {
		return tarifaBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarifaBus(double newTarifaBus) {
		double oldTarifaBus = tarifaBus;
		tarifaBus = newTarifaBus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.ZONA_TARIFACION__TARIFA_BUS, oldTarifaBus, tarifaBus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTarifaMetro() {
		return tarifaMetro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarifaMetro(double newTarifaMetro) {
		double oldTarifaMetro = tarifaMetro;
		tarifaMetro = newTarifaMetro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.ZONA_TARIFACION__TARIFA_METRO, oldTarifaMetro, tarifaMetro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTarifaTren() {
		return tarifaTren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarifaTren(double newTarifaTren) {
		double oldTarifaTren = tarifaTren;
		tarifaTren = newTarifaTren;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.ZONA_TARIFACION__TARIFA_TREN, oldTarifaTren, tarifaTren));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean positiveTarifaBus(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ZonaTarifacion::positiveTarifaBus";
		try {
			/**
			 *
			 * inv positiveTarifaBus:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = tarifaBus > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.ZONA_TARIFACION___POSITIVE_TARIFA_BUS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ double tarifaBus = this.getTarifaBus();
				final /*@NonInvalid*/ RealValue BOXED_tarifaBus = ValueUtil.realValueOf(tarifaBus);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_tarifaBus, RedTables.INT_0).booleanValue();
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
	public boolean positiveTarifaTren(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ZonaTarifacion::positiveTarifaTren";
		try {
			/**
			 *
			 * inv positiveTarifaTren:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = tarifaTren > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.ZONA_TARIFACION___POSITIVE_TARIFA_TREN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ double tarifaTren = this.getTarifaTren();
				final /*@NonInvalid*/ RealValue BOXED_tarifaTren = ValueUtil.realValueOf(tarifaTren);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_tarifaTren, RedTables.INT_0).booleanValue();
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
	public boolean nonDuplicateNum(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ZonaTarifacion::nonDuplicateNum";
		try {
			/**
			 *
			 * inv nonDuplicateNum:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = ZonaTarifacion.allInstances()
			 *         ->isUnique(enumeracion)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.ZONA_TARIFACION___NON_DUPLICATE_NUM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_red_c_c_ZonaTarifacion = idResolver.getClass(RedTables.CLSSid_ZonaTarifacion, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, RedTables.SET_CLSSid_ZonaTarifacion, TYP_red_c_c_ZonaTarifacion);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(RedTables.SET_CLSSid_ZonaTarifacion);
				Iterator<Object> ITERATOR__1 = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ ZonaTarifacion _1 = (ZonaTarifacion)ITERATOR__1.next();
					/**
					 * enumeracion
					 */
					final /*@NonInvalid*/ int enumeracion = _1.getEnumeracion();
					final /*@NonInvalid*/ IntegerValue BOXED_enumeracion = ValueUtil.integerValueOf(enumeracion);
					//
					if (accumulator.includes(BOXED_enumeracion) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(BOXED_enumeracion);
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
	public boolean positiveTarifaMetro(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ZonaTarifacion::positiveTarifaMetro";
		try {
			/**
			 *
			 * inv positiveTarifaMetro:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = tarifaMetro > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.ZONA_TARIFACION___POSITIVE_TARIFA_METRO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ double tarifaMetro = this.getTarifaMetro();
				final /*@NonInvalid*/ RealValue BOXED_tarifaMetro = ValueUtil.realValueOf(tarifaMetro);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_tarifaMetro, RedTables.INT_0).booleanValue();
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
			case RedPackage.ZONA_TARIFACION__ENUMERACION:
				return getEnumeracion();
			case RedPackage.ZONA_TARIFACION__TARIFA_BUS:
				return getTarifaBus();
			case RedPackage.ZONA_TARIFACION__TARIFA_METRO:
				return getTarifaMetro();
			case RedPackage.ZONA_TARIFACION__TARIFA_TREN:
				return getTarifaTren();
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
			case RedPackage.ZONA_TARIFACION__ENUMERACION:
				setEnumeracion((Integer)newValue);
				return;
			case RedPackage.ZONA_TARIFACION__TARIFA_BUS:
				setTarifaBus((Double)newValue);
				return;
			case RedPackage.ZONA_TARIFACION__TARIFA_METRO:
				setTarifaMetro((Double)newValue);
				return;
			case RedPackage.ZONA_TARIFACION__TARIFA_TREN:
				setTarifaTren((Double)newValue);
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
			case RedPackage.ZONA_TARIFACION__ENUMERACION:
				setEnumeracion(ENUMERACION_EDEFAULT);
				return;
			case RedPackage.ZONA_TARIFACION__TARIFA_BUS:
				setTarifaBus(TARIFA_BUS_EDEFAULT);
				return;
			case RedPackage.ZONA_TARIFACION__TARIFA_METRO:
				setTarifaMetro(TARIFA_METRO_EDEFAULT);
				return;
			case RedPackage.ZONA_TARIFACION__TARIFA_TREN:
				setTarifaTren(TARIFA_TREN_EDEFAULT);
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
			case RedPackage.ZONA_TARIFACION__ENUMERACION:
				return enumeracion != ENUMERACION_EDEFAULT;
			case RedPackage.ZONA_TARIFACION__TARIFA_BUS:
				return tarifaBus != TARIFA_BUS_EDEFAULT;
			case RedPackage.ZONA_TARIFACION__TARIFA_METRO:
				return tarifaMetro != TARIFA_METRO_EDEFAULT;
			case RedPackage.ZONA_TARIFACION__TARIFA_TREN:
				return tarifaTren != TARIFA_TREN_EDEFAULT;
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
			case RedPackage.ZONA_TARIFACION___POSITIVE_TARIFA_TREN__DIAGNOSTICCHAIN_MAP:
				return positiveTarifaTren((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.ZONA_TARIFACION___POSITIVE_TARIFA_METRO__DIAGNOSTICCHAIN_MAP:
				return positiveTarifaMetro((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.ZONA_TARIFACION___NON_DUPLICATE_NUM__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateNum((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.ZONA_TARIFACION___POSITIVE_TARIFA_BUS__DIAGNOSTICCHAIN_MAP:
				return positiveTarifaBus((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (enumeracion: ");
		result.append(enumeracion);
		result.append(", tarifaBus: ");
		result.append(tarifaBus);
		result.append(", tarifaMetro: ");
		result.append(tarifaMetro);
		result.append(", tarifaTren: ");
		result.append(tarifaTren);
		result.append(')');
		return result.toString();
	}

} //ZonaTarifacionImpl
