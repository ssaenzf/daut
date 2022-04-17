/**
 */
package red.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;
import red.LineaTren;
import red.Parada;
import red.RedPackage;
import red.RedTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linea Tren</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LineaTrenImpl extends LineaImpl implements LineaTren {
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
	public boolean paradasIniFin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "LineaTren::paradasIniFin";
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
			 *         result : Boolean[?] = paradaIni.oclIsTypeOf(ParadaTren) and
			 *         paradaFin.oclIsTypeOf(ParadaTren)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.LINEA_TREN___PARADAS_INI_FIN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_red_c_c_ParadaTren_1 = idResolver.getClass(RedTables.CLSSid_ParadaTren, null);
				final /*@NonInvalid*/ Parada paradaIni = this.getParadaIni();
				final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, paradaIni, TYP_red_c_c_ParadaTren_1).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!oclIsTypeOf) {
					result = ValueUtil.FALSE_VALUE;
				}
				else {
					final /*@NonInvalid*/ Parada paradaFin = this.getParadaFin();
					final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, paradaFin, TYP_red_c_c_ParadaTren_1).booleanValue();
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
	public boolean paradasCorrectas(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "LineaTren::paradasCorrectas";
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
			 *           p.oclIsTypeOf(ParadaTren))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.LINEA_TREN___PARADAS_CORRECTAS__DIAGNOSTICCHAIN_MAP);
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
						 * p.oclIsTypeOf(ParadaTren)
						 */
						/*@Caught*/ Object CAUGHT_oclIsTypeOf;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_red_c_c_ParadaTren = idResolver.getClass(RedTables.CLSSid_ParadaTren, null);
							final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p, TYP_red_c_c_ParadaTren).booleanValue();
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RedPackage.LINEA_TREN___PARADAS_INI_FIN__DIAGNOSTICCHAIN_MAP:
				return paradasIniFin((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA_TREN___PARADAS_CORRECTAS__DIAGNOSTICCHAIN_MAP:
				return paradasCorrectas((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA_TREN___NON_DUPLICATE_CODIGO_TREN__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateCodigoTren((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LineaTrenImpl
