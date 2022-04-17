/**
 */
package red.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionIndexOfOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SetValue;
import red.Linea;
import red.Parada;
import red.RedPackage;
import red.RedTables;
import red.RedTransporte;
import red.ZonaTarifacion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transporte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.RedTransporteImpl#getLineas <em>Lineas</em>}</li>
 *   <li>{@link red.impl.RedTransporteImpl#getParadas <em>Paradas</em>}</li>
 *   <li>{@link red.impl.RedTransporteImpl#getZonasTarifacion <em>Zonas Tarifacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedTransporteImpl extends MinimalEObjectImpl.Container implements RedTransporte {
	/**
	 * The cached value of the '{@link #getLineas() <em>Lineas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineas()
	 * @generated
	 * @ordered
	 */
	protected EList<Linea> lineas;

	/**
	 * The cached value of the '{@link #getParadas() <em>Paradas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParadas()
	 * @generated
	 * @ordered
	 */
	protected EList<Parada> paradas;

	/**
	 * The cached value of the '{@link #getZonasTarifacion() <em>Zonas Tarifacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonasTarifacion()
	 * @generated
	 * @ordered
	 */
	protected EList<ZonaTarifacion> zonasTarifacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedTransporteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.RED_TRANSPORTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Linea> getLineas() {
		if (lineas == null) {
			lineas = new EObjectContainmentEList<Linea>(Linea.class, this, RedPackage.RED_TRANSPORTE__LINEAS);
		}
		return lineas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parada> getParadas() {
		if (paradas == null) {
			paradas = new EObjectContainmentEList<Parada>(Parada.class, this, RedPackage.RED_TRANSPORTE__PARADAS);
		}
		return paradas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ZonaTarifacion> getZonasTarifacion() {
		if (zonasTarifacion == null) {
			zonasTarifacion = new EObjectContainmentEList<ZonaTarifacion>(ZonaTarifacion.class, this, RedPackage.RED_TRANSPORTE__ZONAS_TARIFACION);
		}
		return zonasTarifacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean restriccionTarifasZona(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "RedTransporte::restriccionTarifasZona";
		try {
			/**
			 *
			 * inv restriccionTarifasZona:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = zonasTarifacion->forAll(zona1 |
			 *           zonasTarifacion->forAll(zona2 | zona1.enumeracion < zona2.enumeracion implies zona2.tarifaBus > zona1.tarifaBus and zona2.tarifaMetro > zona1.tarifaMetro and zona2.tarifaTren > zona1.tarifaTren))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.RED_TRANSPORTE___RESTRICCION_TARIFAS_ZONA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<ZonaTarifacion> zonasTarifacion = this.getZonasTarifacion();
					final /*@NonInvalid*/ SetValue BOXED_zonasTarifacion = idResolver.createSetOfAll(RedTables.SET_CLSSid_ZonaTarifacion, zonasTarifacion);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_zona1 = BOXED_zonasTarifacion.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_zona1.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ ZonaTarifacion zona1 = (ZonaTarifacion)ITERATOR_zona1.next();
						/**
						 *
						 * zonasTarifacion->forAll(zona2 | zona1.enumeracion < zona2.enumeracion implies zona2.tarifaBus > zona1.tarifaBus and zona2.tarifaMetro > zona1.tarifaMetro and zona2.tarifaTren > zona1.tarifaTren)
						 */
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_zona2 = BOXED_zonasTarifacion.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR_zona2.hasNext()) {
									if (accumulator_0 == null) {
										forAll = null;
									}
									else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator_0;
									}
									break;
								}
								/*@NonInvalid*/ ZonaTarifacion zona2 = (ZonaTarifacion)ITERATOR_zona2.next();
								/**
								 * zona1.enumeracion < zona2.enumeracion implies zona2.tarifaBus > zona1.tarifaBus and zona2.tarifaMetro > zona1.tarifaMetro and zona2.tarifaTren > zona1.tarifaTren
								 */
								/*@Caught*/ Object CAUGHT_implies;
								try {
									/*@Caught*/ Object CAUGHT_lt;
									try {
										if (zona1 == null) {
											throw new InvalidValueException("Null source for \'\'red\'::ZonaTarifacion::enumeracion\'");
										}
										final /*@Thrown*/ int enumeracion = zona1.getEnumeracion();
										final /*@Thrown*/ IntegerValue BOXED_enumeracion = ValueUtil.integerValueOf(enumeracion);
										if (zona2 == null) {
											throw new InvalidValueException("Null source for \'\'red\'::ZonaTarifacion::enumeracion\'");
										}
										final /*@Thrown*/ int enumeracion_0 = zona2.getEnumeracion();
										final /*@Thrown*/ IntegerValue BOXED_enumeracion_0 = ValueUtil.integerValueOf(enumeracion_0);
										if (BOXED_enumeracion_0 instanceof InvalidValueException) {
											throw (InvalidValueException)BOXED_enumeracion_0;
										}
										final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, BOXED_enumeracion, BOXED_enumeracion_0).booleanValue();
										CAUGHT_lt = lt;
									}
									catch (Exception e) {
										CAUGHT_lt = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean implies;
									if (CAUGHT_lt == ValueUtil.FALSE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										/*@Caught*/ Object CAUGHT_and_0;
										try {
											/*@Caught*/ Object CAUGHT_and;
											try {
												/*@Caught*/ Object CAUGHT_gt;
												try {
													if (zona2 == null) {
														throw new InvalidValueException("Null source for \'\'red\'::ZonaTarifacion::tarifaBus\'");
													}
													final /*@Thrown*/ double tarifaBus = zona2.getTarifaBus();
													final /*@Thrown*/ RealValue BOXED_tarifaBus = ValueUtil.realValueOf(tarifaBus);
													if (zona1 == null) {
														throw new InvalidValueException("Null source for \'\'red\'::ZonaTarifacion::tarifaBus\'");
													}
													final /*@Thrown*/ double tarifaBus_0 = zona1.getTarifaBus();
													final /*@Thrown*/ RealValue BOXED_tarifaBus_0 = ValueUtil.realValueOf(tarifaBus_0);
													if (BOXED_tarifaBus_0 instanceof InvalidValueException) {
														throw (InvalidValueException)BOXED_tarifaBus_0;
													}
													final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_tarifaBus, BOXED_tarifaBus_0).booleanValue();
													CAUGHT_gt = gt;
												}
												catch (Exception e) {
													CAUGHT_gt = ValueUtil.createInvalidValue(e);
												}
												final /*@Thrown*/ Boolean and;
												if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {
													and = ValueUtil.FALSE_VALUE;
												}
												else {
													/*@Caught*/ Object CAUGHT_gt_0;
													try {
														if (zona2 == null) {
															throw new InvalidValueException("Null source for \'\'red\'::ZonaTarifacion::tarifaMetro\'");
														}
														final /*@Thrown*/ double tarifaMetro = zona2.getTarifaMetro();
														final /*@Thrown*/ RealValue BOXED_tarifaMetro = ValueUtil.realValueOf(tarifaMetro);
														if (zona1 == null) {
															throw new InvalidValueException("Null source for \'\'red\'::ZonaTarifacion::tarifaMetro\'");
														}
														final /*@Thrown*/ double tarifaMetro_0 = zona1.getTarifaMetro();
														final /*@Thrown*/ RealValue BOXED_tarifaMetro_0 = ValueUtil.realValueOf(tarifaMetro_0);
														if (BOXED_tarifaMetro_0 instanceof InvalidValueException) {
															throw (InvalidValueException)BOXED_tarifaMetro_0;
														}
														final /*@Thrown*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_tarifaMetro, BOXED_tarifaMetro_0).booleanValue();
														CAUGHT_gt_0 = gt_0;
													}
													catch (Exception e) {
														CAUGHT_gt_0 = ValueUtil.createInvalidValue(e);
													}
													if (CAUGHT_gt_0 == ValueUtil.FALSE_VALUE) {
														and = ValueUtil.FALSE_VALUE;
													}
													else {
														if (CAUGHT_gt instanceof InvalidValueException) {
															throw (InvalidValueException)CAUGHT_gt;
														}
														if (CAUGHT_gt_0 instanceof InvalidValueException) {
															throw (InvalidValueException)CAUGHT_gt_0;
														}
														and = ValueUtil.TRUE_VALUE;
													}
												}
												CAUGHT_and = and;
											}
											catch (Exception e) {
												CAUGHT_and = ValueUtil.createInvalidValue(e);
											}
											final /*@Thrown*/ Boolean and_0;
											if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
												and_0 = ValueUtil.FALSE_VALUE;
											}
											else {
												/*@Caught*/ Object CAUGHT_gt_1;
												try {
													if (zona2 == null) {
														throw new InvalidValueException("Null source for \'\'red\'::ZonaTarifacion::tarifaTren\'");
													}
													final /*@Thrown*/ double tarifaTren = zona2.getTarifaTren();
													final /*@Thrown*/ RealValue BOXED_tarifaTren = ValueUtil.realValueOf(tarifaTren);
													if (zona1 == null) {
														throw new InvalidValueException("Null source for \'\'red\'::ZonaTarifacion::tarifaTren\'");
													}
													final /*@Thrown*/ double tarifaTren_0 = zona1.getTarifaTren();
													final /*@Thrown*/ RealValue BOXED_tarifaTren_0 = ValueUtil.realValueOf(tarifaTren_0);
													if (BOXED_tarifaTren_0 instanceof InvalidValueException) {
														throw (InvalidValueException)BOXED_tarifaTren_0;
													}
													final /*@Thrown*/ boolean gt_1 = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_tarifaTren, BOXED_tarifaTren_0).booleanValue();
													CAUGHT_gt_1 = gt_1;
												}
												catch (Exception e) {
													CAUGHT_gt_1 = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_gt_1 == ValueUtil.FALSE_VALUE) {
													and_0 = ValueUtil.FALSE_VALUE;
												}
												else {
													if (CAUGHT_and instanceof InvalidValueException) {
														throw (InvalidValueException)CAUGHT_and;
													}
													if (CAUGHT_gt_1 instanceof InvalidValueException) {
														throw (InvalidValueException)CAUGHT_gt_1;
													}
													if (CAUGHT_and == null) {
														and_0 = null;
													}
													else {
														and_0 = ValueUtil.TRUE_VALUE;
													}
												}
											}
											CAUGHT_and_0 = and_0;
										}
										catch (Exception e) {
											CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
											implies = ValueUtil.TRUE_VALUE;
										}
										else {
											if (CAUGHT_lt instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_lt;
											}
											if (CAUGHT_and_0 instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_and_0;
											}
											if (CAUGHT_and_0 == null) {
												implies = null;
											}
											else {
												implies = ValueUtil.FALSE_VALUE;
											}
										}
									}
									CAUGHT_implies = implies;
								}
								catch (Exception e) {
									CAUGHT_implies = ValueUtil.createInvalidValue(e);
								}
								//
								if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break;														// Stop immediately
								}
								else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
									;															// Carry on
								}
								else if (CAUGHT_implies == null) {								// Abnormal null body evaluation result
									if (accumulator_0 == ValueUtil.TRUE_VALUE) {
										accumulator_0 = null;										// Cache a null failure
									}
								}
								else if (CAUGHT_implies instanceof InvalidValueException) {		// Abnormal exception evaluation result
									accumulator_0 = CAUGHT_implies;									// Cache an exception failure
								}
								else {															// Impossible badly typed result
									accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						}
						catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_forAll == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_forAll instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_forAll;									// Cache an exception failure
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
	public boolean lineasParadasConsecutivasIguales(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "RedTransporte::lineasParadasConsecutivasIguales";
		try {
			/**
			 *
			 * inv lineasParadasConsecutivasIguales:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = lineas->forAll(linea1, linea2 |
			 *           linea1.paradas->forAll(par1 |
			 *             linea2.paradas->forAll(par2 | par1 = par2 implies
			 *               linea2.paradas->forAll(par3 |
			 *                 linea1.paradas->forAll(par4 | par3 = par4 and
			 *                   linea1.paradas->indexOf(par4) = 1 +
			 *                   linea1.paradas->indexOf(par1) and
			 *                   linea2.paradas->indexOf(par2) = 1 +
			 *                   linea2.paradas->indexOf(par3) implies
			 *                   linea1.siguienteParadaDistancia->forAll(dis1 |
			 *                     linea1.siguienteParadaDistancia->indexOf(dis1) =
			 *                     linea1.paradas->indexOf(par1) implies
			 *                     linea2.siguienteParadaDistancia->forAll(dis2 |
			 *                       linea2.siguienteParadaDistancia->indexOf(dis2) =
			 *                       linea2.paradas->indexOf(par2) implies dis1 = dis2)))))))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.RED_TRANSPORTE___LINEAS_PARADAS_CONSECUTIVAS_IGUALES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_14;
			if (le) {
				local_14 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Linea> lineas = this.getLineas();
					final /*@NonInvalid*/ SetValue BOXED_lineas = idResolver.createSetOfAll(RedTables.SET_CLSSid_Linea, lineas);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, BOXED_lineas);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 *
						 * linea1.paradas->forAll(par1 |
						 *   linea2.paradas->forAll(par2 | par1 = par2 implies
						 *     linea2.paradas->forAll(par3 |
						 *       linea1.paradas->forAll(par4 | par3 = par4 and
						 *         linea1.paradas->indexOf(par4) = 1 +
						 *         linea1.paradas->indexOf(par1) and
						 *         linea2.paradas->indexOf(par2) = 1 +
						 *         linea2.paradas->indexOf(par3) implies
						 *         linea1.siguienteParadaDistancia->forAll(dis1 |
						 *           linea1.siguienteParadaDistancia->indexOf(dis1) =
						 *           linea1.paradas->indexOf(par1) implies
						 *           linea2.siguienteParadaDistancia->forAll(dis2 |
						 *             linea2.siguienteParadaDistancia->indexOf(dis2) =
						 *             linea2.paradas->indexOf(par2) implies dis1 = dis2))))))
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ SetValue BOXED_lineas = (SetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object linea1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object linea2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_forAll;
							try {
								final /*@NonInvalid*/ Linea local_0 = (Linea)linea1;
								if (local_0 == null) {
									throw new InvalidValueException("Null source for \'\'red\'::Linea::paradas\'");
								}
								final /*@Thrown*/ List<Parada> paradas = local_0.getParadas();
								final /*@Thrown*/ OrderedSetValue BOXED_paradas = idResolver.createOrderedSetOfAll(RedTables.ORD_CLSSid_Parada, paradas);
								/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
								Iterator<Object> ITERATOR_par1 = BOXED_paradas.iterator();
								/*@Thrown*/ Boolean forAll;
								while (true) {
									if (!ITERATOR_par1.hasNext()) {
										if (accumulator == null) {
											forAll = null;
										}
										else if (accumulator == ValueUtil.TRUE_VALUE) {
											forAll = ValueUtil.TRUE_VALUE;
										}
										else {
											throw (InvalidValueException)accumulator;
										}
										break;
									}
									/*@NonInvalid*/ Parada par1 = (Parada)ITERATOR_par1.next();
									/**
									 *
									 * linea2.paradas->forAll(par2 | par1 = par2 implies
									 *   linea2.paradas->forAll(par3 |
									 *     linea1.paradas->forAll(par4 | par3 = par4 and
									 *       linea1.paradas->indexOf(par4) = 1 +
									 *       linea1.paradas->indexOf(par1) and
									 *       linea2.paradas->indexOf(par2) = 1 +
									 *       linea2.paradas->indexOf(par3) implies
									 *       linea1.siguienteParadaDistancia->forAll(dis1 |
									 *         linea1.siguienteParadaDistancia->indexOf(dis1) =
									 *         linea1.paradas->indexOf(par1) implies
									 *         linea2.siguienteParadaDistancia->forAll(dis2 |
									 *           linea2.siguienteParadaDistancia->indexOf(dis2) =
									 *           linea2.paradas->indexOf(par2) implies dis1 = dis2)))))
									 */
									/*@Caught*/ Object CAUGHT_forAll_0;
									try {
										final /*@NonInvalid*/ Linea local_1 = (Linea)linea2;
										if (local_1 == null) {
											throw new InvalidValueException("Null source for \'\'red\'::Linea::paradas\'");
										}
										final /*@Thrown*/ List<Parada> paradas_0 = local_1.getParadas();
										final /*@Thrown*/ OrderedSetValue BOXED_paradas_0 = idResolver.createOrderedSetOfAll(RedTables.ORD_CLSSid_Parada, paradas_0);
										/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
										Iterator<Object> ITERATOR_par2 = BOXED_paradas_0.iterator();
										/*@Thrown*/ Boolean forAll_0;
										while (true) {
											if (!ITERATOR_par2.hasNext()) {
												if (accumulator_0 == null) {
													forAll_0 = null;
												}
												else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
													forAll_0 = ValueUtil.TRUE_VALUE;
												}
												else {
													throw (InvalidValueException)accumulator_0;
												}
												break;
											}
											/*@NonInvalid*/ Parada par2 = (Parada)ITERATOR_par2.next();
											/**
											 * par1 = par2 implies
											 * linea2.paradas->forAll(par3 |
											 *   linea1.paradas->forAll(par4 | par3 = par4 and
											 *     linea1.paradas->indexOf(par4) = 1 +
											 *     linea1.paradas->indexOf(par1) and
											 *     linea2.paradas->indexOf(par2) = 1 +
											 *     linea2.paradas->indexOf(par3) implies
											 *     linea1.siguienteParadaDistancia->forAll(dis1 |
											 *       linea1.siguienteParadaDistancia->indexOf(dis1) =
											 *       linea1.paradas->indexOf(par1) implies
											 *       linea2.siguienteParadaDistancia->forAll(dis2 |
											 *         linea2.siguienteParadaDistancia->indexOf(dis2) =
											 *         linea2.paradas->indexOf(par2) implies dis1 = dis2))))
											 */
											/*@Caught*/ Object CAUGHT_implies_2;
											try {
												final /*@NonInvalid*/ boolean eq = par1.equals(par2);
												final /*@Thrown*/ Boolean implies_2;
												if (!eq) {
													implies_2 = ValueUtil.TRUE_VALUE;
												}
												else {
													/*@Caught*/ Object CAUGHT_forAll_1;
													try {
														/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
														Iterator<Object> ITERATOR_par3 = BOXED_paradas_0.iterator();
														/*@Thrown*/ Boolean forAll_1;
														while (true) {
															if (!ITERATOR_par3.hasNext()) {
																if (accumulator_1 == null) {
																	forAll_1 = null;
																}
																else if (accumulator_1 == ValueUtil.TRUE_VALUE) {
																	forAll_1 = ValueUtil.TRUE_VALUE;
																}
																else {
																	throw (InvalidValueException)accumulator_1;
																}
																break;
															}
															/*@NonInvalid*/ Parada par3 = (Parada)ITERATOR_par3.next();
															/**
															 *
															 * linea1.paradas->forAll(par4 | par3 = par4 and
															 *   linea1.paradas->indexOf(par4) = 1 +
															 *   linea1.paradas->indexOf(par1) and
															 *   linea2.paradas->indexOf(par2) = 1 +
															 *   linea2.paradas->indexOf(par3) implies
															 *   linea1.siguienteParadaDistancia->forAll(dis1 |
															 *     linea1.siguienteParadaDistancia->indexOf(dis1) =
															 *     linea1.paradas->indexOf(par1) implies
															 *     linea2.siguienteParadaDistancia->forAll(dis2 |
															 *       linea2.siguienteParadaDistancia->indexOf(dis2) =
															 *       linea2.paradas->indexOf(par2) implies dis1 = dis2)))
															 */
															/*@Caught*/ Object CAUGHT_forAll_2;
															try {
																/*@Thrown*/ Object accumulator_2 = ValueUtil.TRUE_VALUE;
																Iterator<Object> ITERATOR_par4 = BOXED_paradas.iterator();
																/*@Thrown*/ Boolean forAll_2;
																while (true) {
																	if (!ITERATOR_par4.hasNext()) {
																		if (accumulator_2 == null) {
																			forAll_2 = null;
																		}
																		else if (accumulator_2 == ValueUtil.TRUE_VALUE) {
																			forAll_2 = ValueUtil.TRUE_VALUE;
																		}
																		else {
																			throw (InvalidValueException)accumulator_2;
																		}
																		break;
																	}
																	/*@NonInvalid*/ Parada par4 = (Parada)ITERATOR_par4.next();
																	/**
																	 * par3 = par4 and
																	 * linea1.paradas->indexOf(par4) = 1 +
																	 * linea1.paradas->indexOf(par1) and
																	 * linea2.paradas->indexOf(par2) = 1 +
																	 * linea2.paradas->indexOf(par3) implies
																	 * linea1.siguienteParadaDistancia->forAll(dis1 |
																	 *   linea1.siguienteParadaDistancia->indexOf(dis1) =
																	 *   linea1.paradas->indexOf(par1) implies
																	 *   linea2.siguienteParadaDistancia->forAll(dis2 |
																	 *     linea2.siguienteParadaDistancia->indexOf(dis2) =
																	 *     linea2.paradas->indexOf(par2) implies dis1 = dis2))
																	 */
																	/*@Caught*/ Object CAUGHT_implies_1;
																	try {
																		/*@Caught*/ Object CAUGHT_and_0;
																		try {
																			/*@Caught*/ Object CAUGHT_and;
																			try {
																				final /*@NonInvalid*/ boolean eq_0 = par3.equals(par4);
																				final /*@Thrown*/ Boolean and;
																				if (!eq_0) {
																					and = ValueUtil.FALSE_VALUE;
																				}
																				else {
																					/*@Caught*/ Object CAUGHT_eq_1;
																					try {
																						final /*@Thrown*/ IntegerValue indexOf = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_paradas, par4);
																						final /*@Thrown*/ IntegerValue indexOf_0 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_paradas, par1);
																						if (indexOf_0 == null) {
																							throw new InvalidValueException("Null \'\'OclSelf\'\' rather than \'\'OclVoid\'\' value required");
																						}
																						if (indexOf_0 instanceof InvalidValueException) {
																							throw (InvalidValueException)indexOf_0;
																						}
																						final /*@Thrown*/ IntegerValue sum = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(RedTables.INT_1, indexOf_0);
																						final /*@Thrown*/ boolean eq_1 = sum.equals(indexOf);
																						CAUGHT_eq_1 = eq_1;
																					}
																					catch (Exception e) {
																						CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
																					}
																					if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) {
																						and = ValueUtil.FALSE_VALUE;
																					}
																					else {
																						if (CAUGHT_eq_1 instanceof InvalidValueException) {
																							throw (InvalidValueException)CAUGHT_eq_1;
																						}
																						and = ValueUtil.TRUE_VALUE;
																					}
																				}
																				CAUGHT_and = and;
																			}
																			catch (Exception e) {
																				CAUGHT_and = ValueUtil.createInvalidValue(e);
																			}
																			final /*@Thrown*/ Boolean and_0;
																			if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
																				and_0 = ValueUtil.FALSE_VALUE;
																			}
																			else {
																				/*@Caught*/ Object CAUGHT_eq_2;
																				try {
																					final /*@Thrown*/ IntegerValue indexOf_1 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_paradas_0, par2);
																					final /*@Thrown*/ IntegerValue indexOf_2 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_paradas_0, par3);
																					if (indexOf_2 == null) {
																						throw new InvalidValueException("Null \'\'OclSelf\'\' rather than \'\'OclVoid\'\' value required");
																					}
																					if (indexOf_2 instanceof InvalidValueException) {
																						throw (InvalidValueException)indexOf_2;
																					}
																					final /*@Thrown*/ IntegerValue sum_0 = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(RedTables.INT_1, indexOf_2);
																					final /*@Thrown*/ boolean eq_2 = sum_0.equals(indexOf_1);
																					CAUGHT_eq_2 = eq_2;
																				}
																				catch (Exception e) {
																					CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
																				}
																				if (CAUGHT_eq_2 == ValueUtil.FALSE_VALUE) {
																					and_0 = ValueUtil.FALSE_VALUE;
																				}
																				else {
																					if (CAUGHT_and instanceof InvalidValueException) {
																						throw (InvalidValueException)CAUGHT_and;
																					}
																					if (CAUGHT_eq_2 instanceof InvalidValueException) {
																						throw (InvalidValueException)CAUGHT_eq_2;
																					}
																					if (CAUGHT_and == null) {
																						and_0 = null;
																					}
																					else {
																						and_0 = ValueUtil.TRUE_VALUE;
																					}
																				}
																			}
																			CAUGHT_and_0 = and_0;
																		}
																		catch (Exception e) {
																			CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
																		}
																		final /*@Thrown*/ Boolean implies_1;
																		if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
																			implies_1 = ValueUtil.TRUE_VALUE;
																		}
																		else {
																			/*@Caught*/ Object CAUGHT_forAll_3;
																			try {
																				final /*@Thrown*/ List<Double> siguienteParadaDistancia = local_0.getSiguienteParadaDistancia();
																				final /*@Thrown*/ OrderedSetValue BOXED_siguienteParadaDistancia = idResolver.createOrderedSetOfAll(RedTables.ORD_DATAid_EDouble, siguienteParadaDistancia);
																				/*@Thrown*/ Object accumulator_3 = ValueUtil.TRUE_VALUE;
																				Iterator<Object> ITERATOR_dis1 = BOXED_siguienteParadaDistancia.iterator();
																				/*@Thrown*/ Boolean forAll_3;
																				while (true) {
																					if (!ITERATOR_dis1.hasNext()) {
																						if (accumulator_3 == null) {
																							forAll_3 = null;
																						}
																						else if (accumulator_3 == ValueUtil.TRUE_VALUE) {
																							forAll_3 = ValueUtil.TRUE_VALUE;
																						}
																						else {
																							throw (InvalidValueException)accumulator_3;
																						}
																						break;
																					}
																					/*@NonInvalid*/ RealValue dis1 = (RealValue)ITERATOR_dis1.next();
																					/**
																					 *
																					 * linea1.siguienteParadaDistancia->indexOf(dis1) =
																					 * linea1.paradas->indexOf(par1) implies
																					 * linea2.siguienteParadaDistancia->forAll(dis2 |
																					 *   linea2.siguienteParadaDistancia->indexOf(dis2) =
																					 *   linea2.paradas->indexOf(par2) implies dis1 = dis2)
																					 */
																					/*@Caught*/ Object CAUGHT_implies_0;
																					try {
																						/*@Caught*/ Object CAUGHT_eq_3;
																						try {
																							final /*@Thrown*/ IntegerValue indexOf_3 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_siguienteParadaDistancia, dis1);
																							final /*@Thrown*/ IntegerValue indexOf_4 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_paradas, par1);
																							final /*@Thrown*/ boolean eq_3 = (indexOf_3 != null) ? indexOf_3.equals(indexOf_4) : (indexOf_4 == null);
																							CAUGHT_eq_3 = eq_3;
																						}
																						catch (Exception e) {
																							CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
																						}
																						final /*@Thrown*/ Boolean implies_0;
																						if (CAUGHT_eq_3 == ValueUtil.FALSE_VALUE) {
																							implies_0 = ValueUtil.TRUE_VALUE;
																						}
																						else {
																							/*@Caught*/ Object CAUGHT_forAll_4;
																							try {
																								final /*@Thrown*/ List<Double> siguienteParadaDistancia_1 = local_1.getSiguienteParadaDistancia();
																								final /*@Thrown*/ OrderedSetValue BOXED_siguienteParadaDistancia_1 = idResolver.createOrderedSetOfAll(RedTables.ORD_DATAid_EDouble, siguienteParadaDistancia_1);
																								/*@Thrown*/ Object accumulator_4 = ValueUtil.TRUE_VALUE;
																								Iterator<Object> ITERATOR_dis2 = BOXED_siguienteParadaDistancia_1.iterator();
																								/*@Thrown*/ Boolean forAll_4;
																								while (true) {
																									if (!ITERATOR_dis2.hasNext()) {
																										if (accumulator_4 == null) {
																											forAll_4 = null;
																										}
																										else if (accumulator_4 == ValueUtil.TRUE_VALUE) {
																											forAll_4 = ValueUtil.TRUE_VALUE;
																										}
																										else {
																											throw (InvalidValueException)accumulator_4;
																										}
																										break;
																									}
																									/*@NonInvalid*/ RealValue dis2 = (RealValue)ITERATOR_dis2.next();
																									/**
																									 *
																									 * linea2.siguienteParadaDistancia->indexOf(dis2) =
																									 * linea2.paradas->indexOf(par2) implies dis1 = dis2
																									 */
																									/*@Caught*/ Object CAUGHT_implies;
																									try {
																										/*@Caught*/ Object CAUGHT_eq_4;
																										try {
																											final /*@Thrown*/ IntegerValue indexOf_5 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_siguienteParadaDistancia_1, dis2);
																											final /*@Thrown*/ IntegerValue indexOf_6 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_paradas_0, par2);
																											final /*@Thrown*/ boolean eq_4 = (indexOf_5 != null) ? indexOf_5.equals(indexOf_6) : (indexOf_6 == null);
																											CAUGHT_eq_4 = eq_4;
																										}
																										catch (Exception e) {
																											CAUGHT_eq_4 = ValueUtil.createInvalidValue(e);
																										}
																										final /*@Thrown*/ Boolean implies;
																										if (CAUGHT_eq_4 == ValueUtil.FALSE_VALUE) {
																											implies = ValueUtil.TRUE_VALUE;
																										}
																										else {
																											final /*@NonInvalid*/ boolean eq_5 = dis1.equals(dis2);
																											if (eq_5) {
																												implies = ValueUtil.TRUE_VALUE;
																											}
																											else {
																												if (CAUGHT_eq_4 instanceof InvalidValueException) {
																													throw (InvalidValueException)CAUGHT_eq_4;
																												}
																												implies = ValueUtil.FALSE_VALUE;
																											}
																										}
																										CAUGHT_implies = implies;
																									}
																									catch (Exception e) {
																										CAUGHT_implies = ValueUtil.createInvalidValue(e);
																									}
																									//
																									if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
																										forAll_4 = ValueUtil.FALSE_VALUE;
																										break;														// Stop immediately
																									}
																									else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
																										;															// Carry on
																									}
																									else if (CAUGHT_implies == null) {								// Abnormal null body evaluation result
																										if (accumulator_4 == ValueUtil.TRUE_VALUE) {
																											accumulator_4 = null;										// Cache a null failure
																										}
																									}
																									else if (CAUGHT_implies instanceof InvalidValueException) {		// Abnormal exception evaluation result
																										accumulator_4 = CAUGHT_implies;									// Cache an exception failure
																									}
																									else {															// Impossible badly typed result
																										accumulator_4 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
																									}
																								}
																								CAUGHT_forAll_4 = forAll_4;
																							}
																							catch (Exception e) {
																								CAUGHT_forAll_4 = ValueUtil.createInvalidValue(e);
																							}
																							if (CAUGHT_forAll_4 == ValueUtil.TRUE_VALUE) {
																								implies_0 = ValueUtil.TRUE_VALUE;
																							}
																							else {
																								if (CAUGHT_eq_3 instanceof InvalidValueException) {
																									throw (InvalidValueException)CAUGHT_eq_3;
																								}
																								if (CAUGHT_forAll_4 instanceof InvalidValueException) {
																									throw (InvalidValueException)CAUGHT_forAll_4;
																								}
																								if (CAUGHT_forAll_4 == null) {
																									implies_0 = null;
																								}
																								else {
																									implies_0 = ValueUtil.FALSE_VALUE;
																								}
																							}
																						}
																						CAUGHT_implies_0 = implies_0;
																					}
																					catch (Exception e) {
																						CAUGHT_implies_0 = ValueUtil.createInvalidValue(e);
																					}
																					//
																					if (CAUGHT_implies_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
																						forAll_3 = ValueUtil.FALSE_VALUE;
																						break;														// Stop immediately
																					}
																					else if (CAUGHT_implies_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
																						;															// Carry on
																					}
																					else if (CAUGHT_implies_0 == null) {								// Abnormal null body evaluation result
																						if (accumulator_3 == ValueUtil.TRUE_VALUE) {
																							accumulator_3 = null;										// Cache a null failure
																						}
																					}
																					else if (CAUGHT_implies_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
																						accumulator_3 = CAUGHT_implies_0;									// Cache an exception failure
																					}
																					else {															// Impossible badly typed result
																						accumulator_3 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
																					}
																				}
																				CAUGHT_forAll_3 = forAll_3;
																			}
																			catch (Exception e) {
																				CAUGHT_forAll_3 = ValueUtil.createInvalidValue(e);
																			}
																			if (CAUGHT_forAll_3 == ValueUtil.TRUE_VALUE) {
																				implies_1 = ValueUtil.TRUE_VALUE;
																			}
																			else {
																				if (CAUGHT_and_0 instanceof InvalidValueException) {
																					throw (InvalidValueException)CAUGHT_and_0;
																				}
																				if (CAUGHT_forAll_3 instanceof InvalidValueException) {
																					throw (InvalidValueException)CAUGHT_forAll_3;
																				}
																				if ((CAUGHT_and_0 == null) || (CAUGHT_forAll_3 == null)) {
																					implies_1 = null;
																				}
																				else {
																					implies_1 = ValueUtil.FALSE_VALUE;
																				}
																			}
																		}
																		CAUGHT_implies_1 = implies_1;
																	}
																	catch (Exception e) {
																		CAUGHT_implies_1 = ValueUtil.createInvalidValue(e);
																	}
																	//
																	if (CAUGHT_implies_1 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
																		forAll_2 = ValueUtil.FALSE_VALUE;
																		break;														// Stop immediately
																	}
																	else if (CAUGHT_implies_1 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
																		;															// Carry on
																	}
																	else if (CAUGHT_implies_1 == null) {								// Abnormal null body evaluation result
																		if (accumulator_2 == ValueUtil.TRUE_VALUE) {
																			accumulator_2 = null;										// Cache a null failure
																		}
																	}
																	else if (CAUGHT_implies_1 instanceof InvalidValueException) {		// Abnormal exception evaluation result
																		accumulator_2 = CAUGHT_implies_1;									// Cache an exception failure
																	}
																	else {															// Impossible badly typed result
																		accumulator_2 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
																	}
																}
																CAUGHT_forAll_2 = forAll_2;
															}
															catch (Exception e) {
																CAUGHT_forAll_2 = ValueUtil.createInvalidValue(e);
															}
															//
															if (CAUGHT_forAll_2 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
																forAll_1 = ValueUtil.FALSE_VALUE;
																break;														// Stop immediately
															}
															else if (CAUGHT_forAll_2 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
																;															// Carry on
															}
															else if (CAUGHT_forAll_2 == null) {								// Abnormal null body evaluation result
																if (accumulator_1 == ValueUtil.TRUE_VALUE) {
																	accumulator_1 = null;										// Cache a null failure
																}
															}
															else if (CAUGHT_forAll_2 instanceof InvalidValueException) {		// Abnormal exception evaluation result
																accumulator_1 = CAUGHT_forAll_2;									// Cache an exception failure
															}
															else {															// Impossible badly typed result
																accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
															}
														}
														CAUGHT_forAll_1 = forAll_1;
													}
													catch (Exception e) {
														CAUGHT_forAll_1 = ValueUtil.createInvalidValue(e);
													}
													if (CAUGHT_forAll_1 == ValueUtil.TRUE_VALUE) {
														implies_2 = ValueUtil.TRUE_VALUE;
													}
													else {
														if (CAUGHT_forAll_1 instanceof InvalidValueException) {
															throw (InvalidValueException)CAUGHT_forAll_1;
														}
														if (CAUGHT_forAll_1 == null) {
															implies_2 = null;
														}
														else {
															implies_2 = ValueUtil.FALSE_VALUE;
														}
													}
												}
												CAUGHT_implies_2 = implies_2;
											}
											catch (Exception e) {
												CAUGHT_implies_2 = ValueUtil.createInvalidValue(e);
											}
											//
											if (CAUGHT_implies_2 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
												forAll_0 = ValueUtil.FALSE_VALUE;
												break;														// Stop immediately
											}
											else if (CAUGHT_implies_2 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
												;															// Carry on
											}
											else if (CAUGHT_implies_2 == null) {								// Abnormal null body evaluation result
												if (accumulator_0 == ValueUtil.TRUE_VALUE) {
													accumulator_0 = null;										// Cache a null failure
												}
											}
											else if (CAUGHT_implies_2 instanceof InvalidValueException) {		// Abnormal exception evaluation result
												accumulator_0 = CAUGHT_implies_2;									// Cache an exception failure
											}
											else {															// Impossible badly typed result
												accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
											}
										}
										CAUGHT_forAll_0 = forAll_0;
									}
									catch (Exception e) {
										CAUGHT_forAll_0 = ValueUtil.createInvalidValue(e);
									}
									//
									if (CAUGHT_forAll_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
										forAll = ValueUtil.FALSE_VALUE;
										break;														// Stop immediately
									}
									else if (CAUGHT_forAll_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
										;															// Carry on
									}
									else if (CAUGHT_forAll_0 == null) {								// Abnormal null body evaluation result
										if (accumulator == ValueUtil.TRUE_VALUE) {
											accumulator = null;										// Cache a null failure
										}
									}
									else if (CAUGHT_forAll_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
										accumulator = CAUGHT_forAll_0;									// Cache an exception failure
									}
									else {															// Impossible badly typed result
										accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
									}
								}
								CAUGHT_forAll = forAll;
							}
							catch (Exception e) {
								CAUGHT_forAll = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_forAll;
						}
					};
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, BOXED_lineas, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, RedTables.INT_0).booleanValue();
				local_14 = logDiagnostic;
			}
			return local_14;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RedPackage.RED_TRANSPORTE__LINEAS:
				return ((InternalEList<?>)getLineas()).basicRemove(otherEnd, msgs);
			case RedPackage.RED_TRANSPORTE__PARADAS:
				return ((InternalEList<?>)getParadas()).basicRemove(otherEnd, msgs);
			case RedPackage.RED_TRANSPORTE__ZONAS_TARIFACION:
				return ((InternalEList<?>)getZonasTarifacion()).basicRemove(otherEnd, msgs);
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
			case RedPackage.RED_TRANSPORTE__LINEAS:
				return getLineas();
			case RedPackage.RED_TRANSPORTE__PARADAS:
				return getParadas();
			case RedPackage.RED_TRANSPORTE__ZONAS_TARIFACION:
				return getZonasTarifacion();
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
			case RedPackage.RED_TRANSPORTE__LINEAS:
				getLineas().clear();
				getLineas().addAll((Collection<? extends Linea>)newValue);
				return;
			case RedPackage.RED_TRANSPORTE__PARADAS:
				getParadas().clear();
				getParadas().addAll((Collection<? extends Parada>)newValue);
				return;
			case RedPackage.RED_TRANSPORTE__ZONAS_TARIFACION:
				getZonasTarifacion().clear();
				getZonasTarifacion().addAll((Collection<? extends ZonaTarifacion>)newValue);
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
			case RedPackage.RED_TRANSPORTE__LINEAS:
				getLineas().clear();
				return;
			case RedPackage.RED_TRANSPORTE__PARADAS:
				getParadas().clear();
				return;
			case RedPackage.RED_TRANSPORTE__ZONAS_TARIFACION:
				getZonasTarifacion().clear();
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
			case RedPackage.RED_TRANSPORTE__LINEAS:
				return lineas != null && !lineas.isEmpty();
			case RedPackage.RED_TRANSPORTE__PARADAS:
				return paradas != null && !paradas.isEmpty();
			case RedPackage.RED_TRANSPORTE__ZONAS_TARIFACION:
				return zonasTarifacion != null && !zonasTarifacion.isEmpty();
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
			case RedPackage.RED_TRANSPORTE___RESTRICCION_TARIFAS_ZONA__DIAGNOSTICCHAIN_MAP:
				return restriccionTarifasZona((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RedPackage.RED_TRANSPORTE___LINEAS_PARADAS_CONSECUTIVAS_IGUALES__DIAGNOSTICCHAIN_MAP:
				return lineasParadasConsecutivasIguales((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RedTransporteImpl
