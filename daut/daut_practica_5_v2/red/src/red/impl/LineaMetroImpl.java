/**
 */
package red.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;
import red.Colores;
import red.LineaMetro;
import red.Parada;
import red.RedPackage;
import red.RedTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linea Metro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.LineaMetroImpl#getColor <em>Color</em>}</li>
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
	public boolean paradasIniFin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "LineaMetro::paradasIniFin";
		try {
			/**
			 *
			 * inv paradasIniFin:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = paradaIni.oclIsTypeOf(ParadaMetro) and
			 *         paradaFin.oclIsTypeOf(ParadaMetro)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.LINEA_METRO___PARADAS_INI_FIN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_red_c_c_ParadaMetro_1 = idResolver.getClass(RedTables.CLSSid_ParadaMetro, null);
				final /*@NonInvalid*/ Parada paradaIni = this.getParadaIni();
				final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, paradaIni, TYP_red_c_c_ParadaMetro_1).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!oclIsTypeOf) {
					result = ValueUtil.FALSE_VALUE;
				}
				else {
					final /*@NonInvalid*/ Parada paradaFin = this.getParadaFin();
					final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, paradaFin, TYP_red_c_c_ParadaMetro_1).booleanValue();
					if (!oclIsTypeOf_0) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						result = ValueUtil.TRUE_VALUE;
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
	public boolean nonDuplicateColores(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "LineaMetro::nonDuplicateColores";
		try {
			/**
			 *
			 * inv nonDuplicateColores:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = LineaMetro.allInstances()->isUnique(color)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.LINEA_METRO___NON_DUPLICATE_COLORES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_red_c_c_LineaMetro = idResolver.getClass(RedTables.CLSSid_LineaMetro, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, RedTables.SET_CLSSid_LineaMetro, TYP_red_c_c_LineaMetro);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(RedTables.SET_CLSSid_LineaMetro);
					Iterator<Object> ITERATOR__1 = allInstances.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							result = true;
							break;
						}
						/*@NonInvalid*/ LineaMetro _1 = (LineaMetro)ITERATOR__1.next();
						/**
						 * color
						 */
						final /*@NonInvalid*/ Colores color = _1.getColor();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_color = color == null ? null : RedTables.ENUMid_Colores.getEnumerationLiteralId(ClassUtil.nonNullState(color.getName()));
						//
						if (accumulator.includes(BOXED_color) == ValueUtil.TRUE_VALUE) {
							result = false;
							break;			// Abort after second find
						}
						else {
							accumulator.add(BOXED_color);
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, RedTables.INT_0).booleanValue();
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
	public boolean nonDuplicateCodigoMetro(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "LineaMetro::nonDuplicateCodigoMetro";
		try {
			/**
			 *
			 * inv nonDuplicateCodigoMetro:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = LineaMetro.allInstances()
			 *         ->isUnique(codigo)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.LINEA_METRO___NON_DUPLICATE_CODIGO_METRO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_red_c_c_LineaMetro_0 = idResolver.getClass(RedTables.CLSSid_LineaMetro, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, RedTables.SET_CLSSid_LineaMetro, TYP_red_c_c_LineaMetro_0);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(RedTables.SET_CLSSid_LineaMetro);
				Iterator<Object> ITERATOR__1 = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ LineaMetro _1 = (LineaMetro)ITERATOR__1.next();
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
	public boolean paradasCorrectas(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "LineaMetro::paradasCorrectas";
		try {
			/**
			 *
			 * inv paradasCorrectas:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = paradas->forAll(p |
			 *           p.oclIsTypeOf(ParadaMetro))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.LINEA_METRO___PARADAS_CORRECTAS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Parada> paradas = this.getParadas();
					final /*@NonInvalid*/ OrderedSetValue BOXED_paradas = idResolver.createOrderedSetOfAll(RedTables.ORD_CLSSid_Parada, paradas);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_p = BOXED_paradas.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Parada p = (Parada)ITERATOR_p.next();
						/**
						 * p.oclIsTypeOf(ParadaMetro)
						 */
						/*@Caught*/ Object CAUGHT_oclIsTypeOf;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_red_c_c_ParadaMetro = idResolver.getClass(RedTables.CLSSid_ParadaMetro, null);
							final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p, TYP_red_c_c_ParadaMetro).booleanValue();
							CAUGHT_oclIsTypeOf = oclIsTypeOf;
						}
						catch (Exception e) {
							CAUGHT_oclIsTypeOf = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_oclIsTypeOf == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_oclIsTypeOf == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_oclIsTypeOf instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_oclIsTypeOf;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, RedTables.INT_0).booleanValue();
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
			case RedPackage.LINEA_METRO__COLOR:
				return getColor();
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
			case RedPackage.LINEA_METRO__COLOR:
				setColor((Colores)newValue);
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
			case RedPackage.LINEA_METRO___PARADAS_INI_FIN__DIAGNOSTICCHAIN_MAP:
				return paradasIniFin((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA_METRO___NON_DUPLICATE_COLORES__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateColores((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA_METRO___NON_DUPLICATE_CODIGO_METRO__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateCodigoMetro((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA_METRO___PARADAS_CORRECTAS__DIAGNOSTICCHAIN_MAP:
				return paradasCorrectas((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
