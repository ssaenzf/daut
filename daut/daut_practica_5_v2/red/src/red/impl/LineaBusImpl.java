/**
 */
package red.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import red.LineaBus;
import red.ParadaBus;
import red.RedPackage;
import red.RedTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linea Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.LineaBusImpl#getParadas <em>Paradas</em>}</li>
 *   <li>{@link red.impl.LineaBusImpl#isIsDiurna <em>Is Diurna</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineaBusImpl extends LineaImpl implements LineaBus {
	/**
	 * The cached value of the '{@link #getParadas() <em>Paradas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParadas()
	 * @generated
	 * @ordered
	 */
	protected EList<ParadaBus> paradas;

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
	public EList<ParadaBus> getParadas() {
		if (paradas == null) {
			paradas = new EObjectResolvingEList<ParadaBus>(ParadaBus.class, this, RedPackage.LINEA_BUS__PARADAS);
		}
		return paradas;
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
	public boolean nonDuplicateCodigoBus(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "LineaBus::nonDuplicateCodigoBus";
		try {
			/**
			 *
			 * inv nonDuplicateCodigoBus:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = LineaBus.allInstances()->isUnique(codigo)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.LINEA_BUS___NON_DUPLICATE_CODIGO_BUS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_red_c_c_LineaBus = idResolver.getClass(RedTables.CLSSid_LineaBus, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, RedTables.SET_CLSSid_LineaBus, TYP_red_c_c_LineaBus);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(RedTables.SET_CLSSid_LineaBus);
				Iterator<Object> ITERATOR__1 = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ LineaBus _1 = (LineaBus)ITERATOR__1.next();
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
	public boolean lineaDiurna(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "LineaBus::lineaDiurna";
		try {
			/**
			 *
			 * inv lineaDiurna:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if isDiurna = true
			 *         then horaApertura >= 6 and horaCierre <= 23 and horaCierre > horaApertura
			 *         else horaApertura >= 0 and horaCierre <= 5 and horaCierre > horaApertura
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.LINEA_BUS___LINEA_DIURNA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ int horaApertura_2 = this.getHoraApertura();
					final /*@NonInvalid*/ int horaCierre_2 = this.getHoraCierre();
					final /*@NonInvalid*/ IntegerValue BOXED_horaApertura_2 = ValueUtil.integerValueOf(horaApertura_2);
					final /*@NonInvalid*/ IntegerValue BOXED_horaCierre_2 = ValueUtil.integerValueOf(horaCierre_2);
					final /*@NonInvalid*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_horaCierre_2, BOXED_horaApertura_2).booleanValue();
					final /*@NonInvalid*/ boolean isDiurna = this.isIsDiurna();
					/*@Thrown*/ Boolean result;
					if (isDiurna) {
						final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaApertura_2, RedTables.INT_6).booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!ge) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaCierre_2, RedTables.INT_23).booleanValue();
							if (!le_0) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						final /*@Thrown*/ Boolean and_0;
						if (and == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						}
						else {
							if (!gt_0) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								if (and == null) {
									and_0 = null;
								}
								else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						result = and_0;
					}
					else {
						final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaApertura_2, RedTables.INT_0).booleanValue();
						final /*@NonInvalid*/ Boolean and_1;
						if (!ge_0) {
							and_1 = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaCierre_2, RedTables.INT_5).booleanValue();
							if (!le_1) {
								and_1 = ValueUtil.FALSE_VALUE;
							}
							else {
								and_1 = ValueUtil.TRUE_VALUE;
							}
						}
						final /*@Thrown*/ Boolean and_2;
						if (and_1 == ValueUtil.FALSE_VALUE) {
							and_2 = ValueUtil.FALSE_VALUE;
						}
						else {
							if (!gt_0) {
								and_2 = ValueUtil.FALSE_VALUE;
							}
							else {
								if (and_1 == null) {
									and_2 = null;
								}
								else {
									and_2 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						result = and_2;
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
			case RedPackage.LINEA_BUS__PARADAS:
				return getParadas();
			case RedPackage.LINEA_BUS__IS_DIURNA:
				return isIsDiurna();
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
			case RedPackage.LINEA_BUS__PARADAS:
				getParadas().clear();
				getParadas().addAll((Collection<? extends ParadaBus>)newValue);
				return;
			case RedPackage.LINEA_BUS__IS_DIURNA:
				setIsDiurna((Boolean)newValue);
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
			case RedPackage.LINEA_BUS__PARADAS:
				getParadas().clear();
				return;
			case RedPackage.LINEA_BUS__IS_DIURNA:
				setIsDiurna(IS_DIURNA_EDEFAULT);
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
			case RedPackage.LINEA_BUS__PARADAS:
				return paradas != null && !paradas.isEmpty();
			case RedPackage.LINEA_BUS__IS_DIURNA:
				return isDiurna != IS_DIURNA_EDEFAULT;
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
