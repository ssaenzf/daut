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
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;
import red.Parada;
import red.RedPackage;
import red.RedTables;
import red.Transbordos;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parada</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link red.impl.ParadaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link red.impl.ParadaImpl#isAccesible <em>Accesible</em>}</li>
 *   <li>{@link red.impl.ParadaImpl#isBicicletas <em>Bicicletas</em>}</li>
 *   <li>{@link red.impl.ParadaImpl#isAparcamientoGrat <em>Aparcamiento Grat</em>}</li>
 *   <li>{@link red.impl.ParadaImpl#isAseos <em>Aseos</em>}</li>
 *   <li>{@link red.impl.ParadaImpl#getTransbordo <em>Transbordo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParadaImpl extends MinimalEObjectImpl.Container implements Parada {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAccesible() <em>Accesible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccesible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCESIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAccesible() <em>Accesible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccesible()
	 * @generated
	 * @ordered
	 */
	protected boolean accesible = ACCESIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBicicletas() <em>Bicicletas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBicicletas()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BICICLETAS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBicicletas() <em>Bicicletas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBicicletas()
	 * @generated
	 * @ordered
	 */
	protected boolean bicicletas = BICICLETAS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAparcamientoGrat() <em>Aparcamiento Grat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAparcamientoGrat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APARCAMIENTO_GRAT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAparcamientoGrat() <em>Aparcamiento Grat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAparcamientoGrat()
	 * @generated
	 * @ordered
	 */
	protected boolean aparcamientoGrat = APARCAMIENTO_GRAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAseos() <em>Aseos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAseos()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASEOS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAseos() <em>Aseos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAseos()
	 * @generated
	 * @ordered
	 */
	protected boolean aseos = ASEOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransbordo() <em>Transbordo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransbordo()
	 * @generated
	 * @ordered
	 */
	protected static final Transbordos TRANSBORDO_EDEFAULT = Transbordos.CORTO;

	/**
	 * The cached value of the '{@link #getTransbordo() <em>Transbordo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransbordo()
	 * @generated
	 * @ordered
	 */
	protected Transbordos transbordo = TRANSBORDO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParadaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.PARADA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.PARADA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccesible() {
		return accesible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccesible(boolean newAccesible) {
		boolean oldAccesible = accesible;
		accesible = newAccesible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.PARADA__ACCESIBLE, oldAccesible, accesible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBicicletas() {
		return bicicletas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBicicletas(boolean newBicicletas) {
		boolean oldBicicletas = bicicletas;
		bicicletas = newBicicletas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.PARADA__BICICLETAS, oldBicicletas, bicicletas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAparcamientoGrat() {
		return aparcamientoGrat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAparcamientoGrat(boolean newAparcamientoGrat) {
		boolean oldAparcamientoGrat = aparcamientoGrat;
		aparcamientoGrat = newAparcamientoGrat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.PARADA__APARCAMIENTO_GRAT, oldAparcamientoGrat, aparcamientoGrat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAseos() {
		return aseos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAseos(boolean newAseos) {
		boolean oldAseos = aseos;
		aseos = newAseos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.PARADA__ASEOS, oldAseos, aseos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transbordos getTransbordo() {
		return transbordo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransbordo(Transbordos newTransbordo) {
		Transbordos oldTransbordo = transbordo;
		transbordo = newTransbordo == null ? TRANSBORDO_EDEFAULT : newTransbordo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.PARADA__TRANSBORDO, oldTransbordo, transbordo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonDuplicateNombreParada(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Parada::nonDuplicateNombreParada";
		try {
			/**
			 *
			 * inv nonDuplicateNombreParada:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Parada.allInstances()->isUnique(nombre)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RedPackage.Literals.PARADA___NON_DUPLICATE_NOMBRE_PARADA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_red_c_c_Parada = idResolver.getClass(RedTables.CLSSid_Parada, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, RedTables.SET_CLSSid_Parada, TYP_red_c_c_Parada);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(RedTables.SET_CLSSid_Parada);
				Iterator<Object> ITERATOR__1 = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Parada _1 = (Parada)ITERATOR__1.next();
					/**
					 * nombre
					 */
					final /*@NonInvalid*/ String nombre = _1.getNombre();
					//
					if (accumulator.includes(nombre) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(nombre);
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
			case RedPackage.PARADA__NOMBRE:
				return getNombre();
			case RedPackage.PARADA__ACCESIBLE:
				return isAccesible();
			case RedPackage.PARADA__BICICLETAS:
				return isBicicletas();
			case RedPackage.PARADA__APARCAMIENTO_GRAT:
				return isAparcamientoGrat();
			case RedPackage.PARADA__ASEOS:
				return isAseos();
			case RedPackage.PARADA__TRANSBORDO:
				return getTransbordo();
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
			case RedPackage.PARADA__NOMBRE:
				setNombre((String)newValue);
				return;
			case RedPackage.PARADA__ACCESIBLE:
				setAccesible((Boolean)newValue);
				return;
			case RedPackage.PARADA__BICICLETAS:
				setBicicletas((Boolean)newValue);
				return;
			case RedPackage.PARADA__APARCAMIENTO_GRAT:
				setAparcamientoGrat((Boolean)newValue);
				return;
			case RedPackage.PARADA__ASEOS:
				setAseos((Boolean)newValue);
				return;
			case RedPackage.PARADA__TRANSBORDO:
				setTransbordo((Transbordos)newValue);
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
			case RedPackage.PARADA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case RedPackage.PARADA__ACCESIBLE:
				setAccesible(ACCESIBLE_EDEFAULT);
				return;
			case RedPackage.PARADA__BICICLETAS:
				setBicicletas(BICICLETAS_EDEFAULT);
				return;
			case RedPackage.PARADA__APARCAMIENTO_GRAT:
				setAparcamientoGrat(APARCAMIENTO_GRAT_EDEFAULT);
				return;
			case RedPackage.PARADA__ASEOS:
				setAseos(ASEOS_EDEFAULT);
				return;
			case RedPackage.PARADA__TRANSBORDO:
				setTransbordo(TRANSBORDO_EDEFAULT);
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
			case RedPackage.PARADA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case RedPackage.PARADA__ACCESIBLE:
				return accesible != ACCESIBLE_EDEFAULT;
			case RedPackage.PARADA__BICICLETAS:
				return bicicletas != BICICLETAS_EDEFAULT;
			case RedPackage.PARADA__APARCAMIENTO_GRAT:
				return aparcamientoGrat != APARCAMIENTO_GRAT_EDEFAULT;
			case RedPackage.PARADA__ASEOS:
				return aseos != ASEOS_EDEFAULT;
			case RedPackage.PARADA__TRANSBORDO:
				return transbordo != TRANSBORDO_EDEFAULT;
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
			case RedPackage.PARADA___NON_DUPLICATE_NOMBRE_PARADA__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateNombreParada((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", accesible: ");
		result.append(accesible);
		result.append(", bicicletas: ");
		result.append(bicicletas);
		result.append(", aparcamientoGrat: ");
		result.append(aparcamientoGrat);
		result.append(", aseos: ");
		result.append(aseos);
		result.append(", transbordo: ");
		result.append(transbordo);
		result.append(')');
		return result.toString();
	}

} //ParadaImpl
