/**
 */
package cuestionario.impl;

import cuestionario.Categoria;
import cuestionario.CuestionarioPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categoria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.impl.CategoriaImpl#getName <em>Name</em>}</li>
 *   <li>{@link cuestionario.impl.CategoriaImpl#getDificultad <em>Dificultad</em>}</li>
 *   <li>{@link cuestionario.impl.CategoriaImpl#getSubcategorias <em>Subcategorias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoriaImpl extends MinimalEObjectImpl.Container implements Categoria {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDificultad() <em>Dificultad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDificultad()
	 * @generated
	 * @ordered
	 */
	protected static final double DIFICULTAD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDificultad() <em>Dificultad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDificultad()
	 * @generated
	 * @ordered
	 */
	protected double dificultad = DIFICULTAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubcategorias() <em>Subcategorias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcategorias()
	 * @generated
	 * @ordered
	 */
	protected EList<Categoria> subcategorias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CuestionarioPackage.Literals.CATEGORIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CuestionarioPackage.CATEGORIA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDificultad() {
		return dificultad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDificultad(double newDificultad) {
		double oldDificultad = dificultad;
		dificultad = newDificultad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CuestionarioPackage.CATEGORIA__DIFICULTAD, oldDificultad, dificultad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Categoria> getSubcategorias() {
		if (subcategorias == null) {
			subcategorias = new EObjectContainmentEList<Categoria>(Categoria.class, this, CuestionarioPackage.CATEGORIA__SUBCATEGORIAS);
		}
		return subcategorias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CuestionarioPackage.CATEGORIA__SUBCATEGORIAS:
				return ((InternalEList<?>)getSubcategorias()).basicRemove(otherEnd, msgs);
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
			case CuestionarioPackage.CATEGORIA__NAME:
				return getName();
			case CuestionarioPackage.CATEGORIA__DIFICULTAD:
				return getDificultad();
			case CuestionarioPackage.CATEGORIA__SUBCATEGORIAS:
				return getSubcategorias();
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
			case CuestionarioPackage.CATEGORIA__NAME:
				setName((String)newValue);
				return;
			case CuestionarioPackage.CATEGORIA__DIFICULTAD:
				setDificultad((Double)newValue);
				return;
			case CuestionarioPackage.CATEGORIA__SUBCATEGORIAS:
				getSubcategorias().clear();
				getSubcategorias().addAll((Collection<? extends Categoria>)newValue);
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
			case CuestionarioPackage.CATEGORIA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CuestionarioPackage.CATEGORIA__DIFICULTAD:
				setDificultad(DIFICULTAD_EDEFAULT);
				return;
			case CuestionarioPackage.CATEGORIA__SUBCATEGORIAS:
				getSubcategorias().clear();
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
			case CuestionarioPackage.CATEGORIA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CuestionarioPackage.CATEGORIA__DIFICULTAD:
				return dificultad != DIFICULTAD_EDEFAULT;
			case CuestionarioPackage.CATEGORIA__SUBCATEGORIAS:
				return subcategorias != null && !subcategorias.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", dificultad: ");
		result.append(dificultad);
		result.append(')');
		return result.toString();
	}

} //CategoriaImpl
