/**
 */
package red.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;
import red.Descuento;
import red.Linea;
import red.Parada;
import red.RedPackage;
import red.RedTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linea</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.LineaImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getDescuentos <em>Descuentos</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getHoraApertura <em>Hora Apertura</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getHoraCierre <em>Hora Cierre</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getSiguienteParadaTiempo <em>Siguiente Parada Tiempo</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getSiguienteParadaDistancia <em>Siguiente Parada Distancia</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getParadaIni <em>Parada Ini</em>}</li>
 *   <li>{@link red.impl.LineaImpl#getParadaFin <em>Parada Fin</em>}</li>
 *   <li>{@link red.impl.LineaImpl#isCircular <em>Circular</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LineaImpl extends MinimalEObjectImpl.Container implements Linea {
	/**
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected String codigo = CODIGO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescuentos() <em>Descuentos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescuentos()
	 * @generated
	 * @ordered
	 */
	protected EList<Descuento> descuentos;

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
	 * The cached value of the '{@link #getSiguienteParadaTiempo() <em>Siguiente Parada Tiempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiguienteParadaTiempo()
	 * @generated
	 * @ordered
	 */
	protected Map<?, ?> siguienteParadaTiempo;

	/**
	 * The cached value of the '{@link #getSiguienteParadaDistancia() <em>Siguiente Parada Distancia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiguienteParadaDistancia()
	 * @generated
	 * @ordered
	 */
	protected Map<?, ?> siguienteParadaDistancia;

	/**
	 * The cached value of the '{@link #getParadaIni() <em>Parada Ini</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParadaIni()
	 * @generated
	 * @ordered
	 */
	protected Parada paradaIni;

	/**
	 * The cached value of the '{@link #getParadaFin() <em>Parada Fin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParadaFin()
	 * @generated
	 * @ordered
	 */
	protected Parada paradaFin;

	/**
	 * The default value of the '{@link #isCircular() <em>Circular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCircular()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CIRCULAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCircular() <em>Circular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCircular()
	 * @generated
	 * @ordered
	 */
	protected boolean circular = CIRCULAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.LINEA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(String newCodigo) {
		String oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Descuento> getDescuentos() {
		if (descuentos == null) {
			descuentos = new EObjectContainmentWithInverseEList<Descuento>(Descuento.class, this, RedPackage.LINEA__DESCUENTOS, RedPackage.DESCUENTO__LINEA);
		}
		return descuentos;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__HORA_APERTURA, oldHoraApertura, horaApertura));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__HORA_CIERRE, oldHoraCierre, horaCierre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> getSiguienteParadaTiempo() {
		return siguienteParadaTiempo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiguienteParadaTiempo(Map<?, ?> newSiguienteParadaTiempo) {
		Map<?, ?> oldSiguienteParadaTiempo = siguienteParadaTiempo;
		siguienteParadaTiempo = newSiguienteParadaTiempo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__SIGUIENTE_PARADA_TIEMPO, oldSiguienteParadaTiempo, siguienteParadaTiempo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> getSiguienteParadaDistancia() {
		return siguienteParadaDistancia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiguienteParadaDistancia(Map<?, ?> newSiguienteParadaDistancia) {
		Map<?, ?> oldSiguienteParadaDistancia = siguienteParadaDistancia;
		siguienteParadaDistancia = newSiguienteParadaDistancia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA, oldSiguienteParadaDistancia, siguienteParadaDistancia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parada getParadaIni() {
		if (paradaIni != null && paradaIni.eIsProxy()) {
			InternalEObject oldParadaIni = (InternalEObject)paradaIni;
			paradaIni = (Parada)eResolveProxy(oldParadaIni);
			if (paradaIni != oldParadaIni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RedPackage.LINEA__PARADA_INI, oldParadaIni, paradaIni));
			}
		}
		return paradaIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parada basicGetParadaIni() {
		return paradaIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParadaIni(Parada newParadaIni) {
		Parada oldParadaIni = paradaIni;
		paradaIni = newParadaIni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__PARADA_INI, oldParadaIni, paradaIni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parada getParadaFin() {
		if (paradaFin != null && paradaFin.eIsProxy()) {
			InternalEObject oldParadaFin = (InternalEObject)paradaFin;
			paradaFin = (Parada)eResolveProxy(oldParadaFin);
			if (paradaFin != oldParadaFin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RedPackage.LINEA__PARADA_FIN, oldParadaFin, paradaFin));
			}
		}
		return paradaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parada basicGetParadaFin() {
		return paradaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParadaFin(Parada newParadaFin) {
		Parada oldParadaFin = paradaFin;
		paradaFin = newParadaFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__PARADA_FIN, oldParadaFin, paradaFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCircular() {
		return circular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircular(boolean newCircular) {
		boolean oldCircular = circular;
		circular = newCircular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.LINEA__CIRCULAR, oldCircular, circular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean lineaCircular(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Linea::lineaCircular";
		try {
			/**
			 *
			 * inv lineaCircular:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = if circular = true
			 *         then paradaFin = paradaIni
			 *         else paradaFin <> paradaIni
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.LINEA___LINEA_CIRCULAR__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ Parada paradaFin_0 = this.getParadaFin();
				final /*@NonInvalid*/ Parada paradaIni_0 = this.getParadaIni();
				final /*@NonInvalid*/ boolean circular = this.isCircular();
				/*@NonInvalid*/ boolean result;
				if (circular) {
					final /*@NonInvalid*/ boolean eq = paradaFin_0.equals(paradaIni_0);
					result = eq;
				}
				else {
					final /*@NonInvalid*/ boolean ne = !paradaFin_0.equals(paradaIni_0);
					result = ne;
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
	public boolean horarioCorrecto(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Linea::horarioCorrecto";
		try {
			/**
			 *
			 * inv horarioCorrecto:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = horaApertura >= 0 and horaApertura <= 23 and horaCierre >= 0 and horaCierre <= 23 and horaApertura <> horaCierre and horaCierre > horaApertura
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.LINEA___HORARIO_CORRECTO__DIAGNOSTICCHAIN_MAP);
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
					/*@Caught*/ Object CAUGHT_and_2;
					try {
						/*@Caught*/ Object CAUGHT_and_1;
						try {
							final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaApertura_2, RedTables.INT_0).booleanValue();
							final /*@NonInvalid*/ Boolean and;
							if (!ge) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaApertura_2, RedTables.INT_23).booleanValue();
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
								final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaCierre_2, RedTables.INT_0).booleanValue();
								final /*@NonInvalid*/ Boolean and_0;
								if (!ge_0) {
									and_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									final /*@NonInvalid*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_horaCierre_2, RedTables.INT_23).booleanValue();
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
							final /*@NonInvalid*/ boolean ne = horaApertura_2 != horaCierre_2;
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
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_2 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_horaCierre_2, BOXED_horaApertura_2).booleanValue();
						if (!gt) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_and_2 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_2;
							}
							if (CAUGHT_and_2 == null) {
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
	public boolean nonDescuentosSolapados(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Linea::nonDescuentosSolapados";
		try {
			/**
			 *
			 * inv nonDescuentosSolapados:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = descuentos->forAll(d1, d2 |
			 *           if d1.horaIni < d2.horaFin and d1.horaIni > d2.horaIni and d1.horaFin < d2.horaFin and d1.horaFin > d2.horaIni
			 *           then true
			 *           else false
			 *           endif)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.LINEA___NON_DESCUENTOS_SOLAPADOS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_9;
			if (le) {
				local_9 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Descuento> descuentos = this.getDescuentos();
					final /*@NonInvalid*/ SetValue BOXED_descuentos = idResolver.createSetOfAll(RedTables.SET_CLSSid_Descuento, descuentos);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, BOXED_descuentos);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 *
						 * if d1.horaIni < d2.horaFin and d1.horaIni > d2.horaIni and d1.horaFin < d2.horaFin and d1.horaFin > d2.horaIni
						 * then true
						 * else false
						 * endif
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ SetValue BOXED_descuentos = (SetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object d1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object d2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_and;
							try {
								/*@Caught*/ Object CAUGHT_lt;
								try {
									final /*@NonInvalid*/ Descuento local_0 = (Descuento)d1;
									if (local_0 == null) {
										throw new InvalidValueException("Null source for \'\'red\'::Descuento::horaIni\'");
									}
									final /*@Thrown*/ int horaIni = local_0.getHoraIni();
									final /*@Thrown*/ IntegerValue BOXED_horaIni = ValueUtil.integerValueOf(horaIni);
									final /*@NonInvalid*/ Descuento local_1 = (Descuento)d2;
									if (local_1 == null) {
										throw new InvalidValueException("Null source for \'\'red\'::Descuento::horaFin\'");
									}
									final /*@Thrown*/ int horaFin = local_1.getHoraFin();
									final /*@Thrown*/ IntegerValue BOXED_horaFin = ValueUtil.integerValueOf(horaFin);
									if (BOXED_horaFin instanceof InvalidValueException) {
										throw (InvalidValueException)BOXED_horaFin;
									}
									final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, BOXED_horaIni, BOXED_horaFin).booleanValue();
									CAUGHT_lt = lt;
								}
								catch (Exception e) {
									CAUGHT_lt = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean and;
								if (CAUGHT_lt == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_gt;
									try {
										final /*@NonInvalid*/ Descuento local_2 = (Descuento)d1;
										if (local_2 == null) {
											throw new InvalidValueException("Null source for \'\'red\'::Descuento::horaIni\'");
										}
										final /*@Thrown*/ int horaIni_0 = local_2.getHoraIni();
										final /*@Thrown*/ IntegerValue BOXED_horaIni_0 = ValueUtil.integerValueOf(horaIni_0);
										final /*@NonInvalid*/ Descuento local_3 = (Descuento)d2;
										if (local_3 == null) {
											throw new InvalidValueException("Null source for \'\'red\'::Descuento::horaIni\'");
										}
										final /*@Thrown*/ int horaIni_1 = local_3.getHoraIni();
										final /*@Thrown*/ IntegerValue BOXED_horaIni_1 = ValueUtil.integerValueOf(horaIni_1);
										if (BOXED_horaIni_1 instanceof InvalidValueException) {
											throw (InvalidValueException)BOXED_horaIni_1;
										}
										final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_horaIni_0, BOXED_horaIni_1).booleanValue();
										CAUGHT_gt = gt;
									}
									catch (Exception e) {
										CAUGHT_gt = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {
										and = ValueUtil.FALSE_VALUE;
									}
									else {
										if (CAUGHT_lt instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_lt;
										}
										if (CAUGHT_gt instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_gt;
										}
										and = ValueUtil.TRUE_VALUE;
									}
								}
								CAUGHT_and = and;
							}
							catch (Exception e) {
								CAUGHT_and = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_1;
							if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
								and_1 = ValueUtil.FALSE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_and_0;
								try {
									/*@Caught*/ Object CAUGHT_lt_0;
									try {
										final /*@NonInvalid*/ Descuento local_4 = (Descuento)d1;
										if (local_4 == null) {
											throw new InvalidValueException("Null source for \'\'red\'::Descuento::horaFin\'");
										}
										final /*@Thrown*/ int horaFin_0 = local_4.getHoraFin();
										final /*@Thrown*/ IntegerValue BOXED_horaFin_0 = ValueUtil.integerValueOf(horaFin_0);
										final /*@NonInvalid*/ Descuento local_5 = (Descuento)d2;
										if (local_5 == null) {
											throw new InvalidValueException("Null source for \'\'red\'::Descuento::horaFin\'");
										}
										final /*@Thrown*/ int horaFin_1 = local_5.getHoraFin();
										final /*@Thrown*/ IntegerValue BOXED_horaFin_1 = ValueUtil.integerValueOf(horaFin_1);
										if (BOXED_horaFin_1 instanceof InvalidValueException) {
											throw (InvalidValueException)BOXED_horaFin_1;
										}
										final /*@Thrown*/ boolean lt_0 = OclComparableLessThanOperation.INSTANCE.evaluate(executor, BOXED_horaFin_0, BOXED_horaFin_1).booleanValue();
										CAUGHT_lt_0 = lt_0;
									}
									catch (Exception e) {
										CAUGHT_lt_0 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean and_0;
									if (CAUGHT_lt_0 == ValueUtil.FALSE_VALUE) {
										and_0 = ValueUtil.FALSE_VALUE;
									}
									else {
										/*@Caught*/ Object CAUGHT_gt_0;
										try {
											final /*@NonInvalid*/ Descuento local_6 = (Descuento)d1;
											if (local_6 == null) {
												throw new InvalidValueException("Null source for \'\'red\'::Descuento::horaFin\'");
											}
											final /*@Thrown*/ int horaFin_2 = local_6.getHoraFin();
											final /*@Thrown*/ IntegerValue BOXED_horaFin_2 = ValueUtil.integerValueOf(horaFin_2);
											final /*@NonInvalid*/ Descuento local_7 = (Descuento)d2;
											if (local_7 == null) {
												throw new InvalidValueException("Null source for \'\'red\'::Descuento::horaIni\'");
											}
											final /*@Thrown*/ int horaIni_2 = local_7.getHoraIni();
											final /*@Thrown*/ IntegerValue BOXED_horaIni_2 = ValueUtil.integerValueOf(horaIni_2);
											if (BOXED_horaIni_2 instanceof InvalidValueException) {
												throw (InvalidValueException)BOXED_horaIni_2;
											}
											final /*@Thrown*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_horaFin_2, BOXED_horaIni_2).booleanValue();
											CAUGHT_gt_0 = gt_0;
										}
										catch (Exception e) {
											CAUGHT_gt_0 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_gt_0 == ValueUtil.FALSE_VALUE) {
											and_0 = ValueUtil.FALSE_VALUE;
										}
										else {
											if (CAUGHT_lt_0 instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_lt_0;
											}
											if (CAUGHT_gt_0 instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_gt_0;
											}
											and_0 = ValueUtil.TRUE_VALUE;
										}
									}
									CAUGHT_and_0 = and_0;
								}
								catch (Exception e) {
									CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
									and_1 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_and instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_and;
									}
									if (CAUGHT_and_0 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_and_0;
									}
									if ((CAUGHT_and == null) || (CAUGHT_and_0 == null)) {
										and_1 = null;
									}
									else {
										and_1 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							if (and_1 == null) {
								throw new InvalidValueException("Null if condition");
							}
							/*@NonInvalid*/ boolean local_8;
							if (and_1) {
								local_8 = true;
							}
							else {
								local_8 = false;
							}
							return local_8;
						}
					};
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, BOXED_descuentos, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, RedTables.INT_0).booleanValue();
				local_9 = logDiagnostic;
			}
			return local_9;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RedPackage.LINEA__DESCUENTOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDescuentos()).basicAdd(otherEnd, msgs);
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
			case RedPackage.LINEA__DESCUENTOS:
				return ((InternalEList<?>)getDescuentos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedPackage.LINEA__CODIGO:
				return getCodigo();
			case RedPackage.LINEA__DESCUENTOS:
				return getDescuentos();
			case RedPackage.LINEA__HORA_APERTURA:
				return getHoraApertura();
			case RedPackage.LINEA__HORA_CIERRE:
				return getHoraCierre();
			case RedPackage.LINEA__SIGUIENTE_PARADA_TIEMPO:
				return getSiguienteParadaTiempo();
			case RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA:
				return getSiguienteParadaDistancia();
			case RedPackage.LINEA__PARADA_INI:
				if (resolve) return getParadaIni();
				return basicGetParadaIni();
			case RedPackage.LINEA__PARADA_FIN:
				if (resolve) return getParadaFin();
				return basicGetParadaFin();
			case RedPackage.LINEA__CIRCULAR:
				return isCircular();
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
			case RedPackage.LINEA__CODIGO:
				setCodigo((String)newValue);
				return;
			case RedPackage.LINEA__DESCUENTOS:
				getDescuentos().clear();
				getDescuentos().addAll((Collection<? extends Descuento>)newValue);
				return;
			case RedPackage.LINEA__HORA_APERTURA:
				setHoraApertura((Integer)newValue);
				return;
			case RedPackage.LINEA__HORA_CIERRE:
				setHoraCierre((Integer)newValue);
				return;
			case RedPackage.LINEA__SIGUIENTE_PARADA_TIEMPO:
				setSiguienteParadaTiempo((Map<?, ?>)newValue);
				return;
			case RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA:
				setSiguienteParadaDistancia((Map<?, ?>)newValue);
				return;
			case RedPackage.LINEA__PARADA_INI:
				setParadaIni((Parada)newValue);
				return;
			case RedPackage.LINEA__PARADA_FIN:
				setParadaFin((Parada)newValue);
				return;
			case RedPackage.LINEA__CIRCULAR:
				setCircular((Boolean)newValue);
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
			case RedPackage.LINEA__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case RedPackage.LINEA__DESCUENTOS:
				getDescuentos().clear();
				return;
			case RedPackage.LINEA__HORA_APERTURA:
				setHoraApertura(HORA_APERTURA_EDEFAULT);
				return;
			case RedPackage.LINEA__HORA_CIERRE:
				setHoraCierre(HORA_CIERRE_EDEFAULT);
				return;
			case RedPackage.LINEA__SIGUIENTE_PARADA_TIEMPO:
				setSiguienteParadaTiempo((Map<?, ?>)null);
				return;
			case RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA:
				setSiguienteParadaDistancia((Map<?, ?>)null);
				return;
			case RedPackage.LINEA__PARADA_INI:
				setParadaIni((Parada)null);
				return;
			case RedPackage.LINEA__PARADA_FIN:
				setParadaFin((Parada)null);
				return;
			case RedPackage.LINEA__CIRCULAR:
				setCircular(CIRCULAR_EDEFAULT);
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
			case RedPackage.LINEA__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case RedPackage.LINEA__DESCUENTOS:
				return descuentos != null && !descuentos.isEmpty();
			case RedPackage.LINEA__HORA_APERTURA:
				return horaApertura != HORA_APERTURA_EDEFAULT;
			case RedPackage.LINEA__HORA_CIERRE:
				return horaCierre != HORA_CIERRE_EDEFAULT;
			case RedPackage.LINEA__SIGUIENTE_PARADA_TIEMPO:
				return siguienteParadaTiempo != null;
			case RedPackage.LINEA__SIGUIENTE_PARADA_DISTANCIA:
				return siguienteParadaDistancia != null;
			case RedPackage.LINEA__PARADA_INI:
				return paradaIni != null;
			case RedPackage.LINEA__PARADA_FIN:
				return paradaFin != null;
			case RedPackage.LINEA__CIRCULAR:
				return circular != CIRCULAR_EDEFAULT;
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
			case RedPackage.LINEA___HORARIO_CORRECTO__DIAGNOSTICCHAIN_MAP:
				return horarioCorrecto((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA___NON_DESCUENTOS_SOLAPADOS__DIAGNOSTICCHAIN_MAP:
				return nonDescuentosSolapados((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.LINEA___LINEA_CIRCULAR__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (codigo: ");
		result.append(codigo);
		result.append(", horaApertura: ");
		result.append(horaApertura);
		result.append(", horaCierre: ");
		result.append(horaCierre);
		result.append(", siguienteParadaTiempo: ");
		result.append(siguienteParadaTiempo);
		result.append(", siguienteParadaDistancia: ");
		result.append(siguienteParadaDistancia);
		result.append(", circular: ");
		result.append(circular);
		result.append(')');
		return result.toString();
	}

} //LineaImpl
