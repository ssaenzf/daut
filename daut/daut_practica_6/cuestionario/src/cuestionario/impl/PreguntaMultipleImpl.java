/**
 */
package cuestionario.impl;

import cuestionario.CuestionarioPackage;
import cuestionario.PreguntaMultiple;
import cuestionario.Respuesta;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pregunta Multiple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.impl.PreguntaMultipleImpl#getCorrectas <em>Correctas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreguntaMultipleImpl extends PreguntaImpl implements PreguntaMultiple {
	/**
	 * The cached value of the '{@link #getCorrectas() <em>Correctas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectas()
	 * @generated
	 * @ordered
	 */
	protected EList<Respuesta> correctas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreguntaMultipleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CuestionarioPackage.Literals.PREGUNTA_MULTIPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Respuesta> getCorrectas() {
		if (correctas == null) {
			correctas = new EObjectResolvingEList<Respuesta>(Respuesta.class, this, CuestionarioPackage.PREGUNTA_MULTIPLE__CORRECTAS);
		}
		return correctas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CuestionarioPackage.PREGUNTA_MULTIPLE__CORRECTAS:
				return getCorrectas();
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
			case CuestionarioPackage.PREGUNTA_MULTIPLE__CORRECTAS:
				getCorrectas().clear();
				getCorrectas().addAll((Collection<? extends Respuesta>)newValue);
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
			case CuestionarioPackage.PREGUNTA_MULTIPLE__CORRECTAS:
				getCorrectas().clear();
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
			case CuestionarioPackage.PREGUNTA_MULTIPLE__CORRECTAS:
				return correctas != null && !correctas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PreguntaMultipleImpl
