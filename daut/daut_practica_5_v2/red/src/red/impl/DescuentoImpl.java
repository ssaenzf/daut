/**
 */
package red.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import red.Descuento;
import red.Linea;
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
 *   <li>{@link red.impl.DescuentoImpl#getHoraIni <em>Hora Ini</em>}</li>
 *   <li>{@link red.impl.DescuentoImpl#getHoraFin <em>Hora Fin</em>}</li>
 *   <li>{@link red.impl.DescuentoImpl#getDescuento <em>Descuento</em>}</li>
 *   <li>{@link red.impl.DescuentoImpl#getLinea <em>Linea</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescuentoImpl extends MinimalEObjectImpl.Container implements Descuento {
	/**
	 * The default value of the '{@link #getHoraIni() <em>Hora Ini</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraIni()
	 * @generated
	 * @ordered
	 */
	protected static final int HORA_INI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHoraIni() <em>Hora Ini</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraIni()
	 * @generated
	 * @ordered
	 */
	protected int horaIni = HORA_INI_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoraFin() <em>Hora Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraFin()
	 * @generated
	 * @ordered
	 */
	protected static final int HORA_FIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHoraFin() <em>Hora Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraFin()
	 * @generated
	 * @ordered
	 */
	protected int horaFin = HORA_FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescuento() <em>Descuento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescuento()
	 * @generated
	 * @ordered
	 */
	protected static final int DESCUENTO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDescuento() <em>Descuento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescuento()
	 * @generated
	 * @ordered
	 */
	protected int descuento = DESCUENTO_EDEFAULT;

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
	public int getHoraIni() {
		return horaIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoraIni(int newHoraIni) {
		int oldHoraIni = horaIni;
		horaIni = newHoraIni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.DESCUENTO__HORA_INI, oldHoraIni, horaIni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoraFin() {
		return horaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoraFin(int newHoraFin) {
		int oldHoraFin = horaFin;
		horaFin = newHoraFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.DESCUENTO__HORA_FIN, oldHoraFin, horaFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDescuento() {
		return descuento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescuento(int newDescuento) {
		int oldDescuento = descuento;
		descuento = newDescuento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.DESCUENTO__DESCUENTO, oldDescuento, descuento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linea getLinea() {
		if (eContainerFeatureID() != RedPackage.DESCUENTO__LINEA) return null;
		return (Linea)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinea(Linea newLinea, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLinea, RedPackage.DESCUENTO__LINEA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinea(Linea newLinea) {
		if (newLinea != eInternalContainer() || (eContainerFeatureID() != RedPackage.DESCUENTO__LINEA && newLinea != null)) {
			if (EcoreUtil.isAncestor(this, newLinea))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLinea != null)
				msgs = ((InternalEObject)newLinea).eInverseAdd(this, RedPackage.LINEA__DESCUENTOS, Linea.class, msgs);
			msgs = basicSetLinea(newLinea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.DESCUENTO__LINEA, newLinea, newLinea));
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
				final /*@NonInvalid*/ int descuento = this.getDescuento();
				final /*@NonInvalid*/ IntegerValue BOXED_descuento = ValueUtil.integerValueOf(descuento);
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
	public boolean horarioCorrecto(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Descuento::horarioCorrecto";
		try {
			/**
			 *
			 * inv horarioCorrecto:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = horaIni >= 0 and horaIni <= 23 and horaFin >= 0 and horaFin <= 23 and horaIni <> horaFin and horaFin > horaIni and horaIni >= linea.horaApertura and horaFin <= linea.horaCierre
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.DESCUENTO___HORARIO_CORRECTO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and_3;
					try {
						final /*@NonInvalid*/ int horaFin_2 = this.getHoraFin();
						final /*@NonInvalid*/ int horaIni_2 = this.getHoraIni();
						final /*@NonInvalid*/ IntegerValue BOXED_horaFin_2 = ValueUtil.integerValueOf(horaFin_2);
						final /*@NonInvalid*/ IntegerValue BOXED_horaIni_2 = ValueUtil.integerValueOf(horaIni_2);
						/*@Caught*/ Object CAUGHT_and_2;
						try {
							/*@Caught*/ Object CAUGHT_and_1;
							try {
								final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaIni_2, RedTables.INT_0).booleanValue();
								final /*@NonInvalid*/ Boolean and;
								if (!ge) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaIni_2, RedTables.INT_23).booleanValue();
									if (!le_0) {
										and = ValueUtil.FALSE_VALUE;
									}
									else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
								final /*@Thrown*/ Boolean and_1;
								if (and == ValueUtil.FALSE_VALUE) {
									and_1 = ValueUtil.FALSE_VALUE;
								}
								else {
									final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaFin_2, RedTables.INT_0).booleanValue();
									final /*@NonInvalid*/ Boolean and_0;
									if (!ge_0) {
										and_0 = ValueUtil.FALSE_VALUE;
									}
									else {
										final /*@NonInvalid*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaFin_2, RedTables.INT_23).booleanValue();
										if (!le_1) {
											and_0 = ValueUtil.FALSE_VALUE;
										}
										else {
											and_0 = ValueUtil.TRUE_VALUE;
										}
									}
									if (and_0 == ValueUtil.FALSE_VALUE) {
										and_1 = ValueUtil.FALSE_VALUE;
									}
									else {
										if ((and == null) || (and_0 == null)) {
											and_1 = null;
										}
										else {
											and_1 = ValueUtil.TRUE_VALUE;
										}
									}
								}
								CAUGHT_and_1 = and_1;
							}
							catch (Exception e) {
								CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_2;
							if (CAUGHT_and_1 == ValueUtil.FALSE_VALUE) {
								and_2 = ValueUtil.FALSE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean ne = horaIni_2 != horaFin_2;
								if (!ne) {
									and_2 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_and_1 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_and_1;
									}
									if (CAUGHT_and_1 == null) {
										and_2 = null;
									}
									else {
										and_2 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_2 = and_2;
						}
						catch (Exception e) {
							CAUGHT_and_2 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and_3;
						if (CAUGHT_and_2 == ValueUtil.FALSE_VALUE) {
							and_3 = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_horaFin_2, BOXED_horaIni_2).booleanValue();
							if (!gt) {
								and_3 = ValueUtil.FALSE_VALUE;
							}
							else {
								if (CAUGHT_and_2 instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_and_2;
								}
								if (CAUGHT_and_2 == null) {
									and_3 = null;
								}
								else {
									and_3 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_3 = and_3;
					}
					catch (Exception e) {
						CAUGHT_and_3 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_3 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_and_4;
						try {
							/*@Caught*/ Object CAUGHT_ge_1;
							try {
								final /*@NonInvalid*/ int horaIni_3 = this.getHoraIni();
								final /*@NonInvalid*/ IntegerValue BOXED_horaIni_3 = ValueUtil.integerValueOf(horaIni_3);
								final /*@NonInvalid*/ Linea linea = this.getLinea();
								if (linea == null) {
									throw new InvalidValueException("Null source for \'\'red\'::Linea::horaApertura\'");
								}
								final /*@Thrown*/ int horaApertura = linea.getHoraApertura();
								final /*@Thrown*/ IntegerValue BOXED_horaApertura = ValueUtil.integerValueOf(horaApertura);
								if (BOXED_horaApertura instanceof InvalidValueException) {
									throw (InvalidValueException)BOXED_horaApertura;
								}
								final /*@Thrown*/ boolean ge_1 = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaIni_3, BOXED_horaApertura).booleanValue();
								CAUGHT_ge_1 = ge_1;
							}
							catch (Exception e) {
								CAUGHT_ge_1 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_4;
							if (CAUGHT_ge_1 == ValueUtil.FALSE_VALUE) {
								and_4 = ValueUtil.FALSE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_le_2;
								try {
									final /*@NonInvalid*/ int horaFin_3 = this.getHoraFin();
									final /*@NonInvalid*/ IntegerValue BOXED_horaFin_3 = ValueUtil.integerValueOf(horaFin_3);
									final /*@NonInvalid*/ Linea linea_0 = this.getLinea();
									if (linea_0 == null) {
										throw new InvalidValueException("Null source for \'\'red\'::Linea::horaCierre\'");
									}
									final /*@Thrown*/ int horaCierre = linea_0.getHoraCierre();
									final /*@Thrown*/ IntegerValue BOXED_horaCierre = ValueUtil.integerValueOf(horaCierre);
									if (BOXED_horaCierre instanceof InvalidValueException) {
										throw (InvalidValueException)BOXED_horaCierre;
									}
									final /*@Thrown*/ boolean le_2 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaFin_3, BOXED_horaCierre).booleanValue();
									CAUGHT_le_2 = le_2;
								}
								catch (Exception e) {
									CAUGHT_le_2 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_le_2 == ValueUtil.FALSE_VALUE) {
									and_4 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_ge_1 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_ge_1;
									}
									if (CAUGHT_le_2 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_le_2;
									}
									and_4 = ValueUtil.TRUE_VALUE;
								}
							}
							CAUGHT_and_4 = and_4;
						}
						catch (Exception e) {
							CAUGHT_and_4 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and_4 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_and_3 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_3;
							}
							if (CAUGHT_and_4 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_4;
							}
							if ((CAUGHT_and_3 == null) || (CAUGHT_and_4 == null)) {
								result = null;
							}
							else {
								result = ValueUtil.TRUE_VALUE;
							}
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RedPackage.DESCUENTO__LINEA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLinea((Linea)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RedPackage.DESCUENTO__LINEA:
				return basicSetLinea(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RedPackage.DESCUENTO__LINEA:
				return eInternalContainer().eInverseRemove(this, RedPackage.LINEA__DESCUENTOS, Linea.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedPackage.DESCUENTO__HORA_INI:
				return getHoraIni();
			case RedPackage.DESCUENTO__HORA_FIN:
				return getHoraFin();
			case RedPackage.DESCUENTO__DESCUENTO:
				return getDescuento();
			case RedPackage.DESCUENTO__LINEA:
				return getLinea();
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
			case RedPackage.DESCUENTO__HORA_INI:
				setHoraIni((Integer)newValue);
				return;
			case RedPackage.DESCUENTO__HORA_FIN:
				setHoraFin((Integer)newValue);
				return;
			case RedPackage.DESCUENTO__DESCUENTO:
				setDescuento((Integer)newValue);
				return;
			case RedPackage.DESCUENTO__LINEA:
				setLinea((Linea)newValue);
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
			case RedPackage.DESCUENTO__HORA_INI:
				setHoraIni(HORA_INI_EDEFAULT);
				return;
			case RedPackage.DESCUENTO__HORA_FIN:
				setHoraFin(HORA_FIN_EDEFAULT);
				return;
			case RedPackage.DESCUENTO__DESCUENTO:
				setDescuento(DESCUENTO_EDEFAULT);
				return;
			case RedPackage.DESCUENTO__LINEA:
				setLinea((Linea)null);
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
			case RedPackage.DESCUENTO__HORA_INI:
				return horaIni != HORA_INI_EDEFAULT;
			case RedPackage.DESCUENTO__HORA_FIN:
				return horaFin != HORA_FIN_EDEFAULT;
			case RedPackage.DESCUENTO__DESCUENTO:
				return descuento != DESCUENTO_EDEFAULT;
			case RedPackage.DESCUENTO__LINEA:
				return getLinea() != null;
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
			case RedPackage.DESCUENTO___HORARIO_CORRECTO__DIAGNOSTICCHAIN_MAP:
				return horarioCorrecto((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (horaIni: ");
		result.append(horaIni);
		result.append(", horaFin: ");
		result.append(horaFin);
		result.append(", descuento: ");
		result.append(descuento);
		result.append(')');
		return result.toString();
	}

} //DescuentoImpl
