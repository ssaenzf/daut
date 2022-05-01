/**
 */
package cuestionario.impl;

import cuestionario.CuestionarioPackage;
import cuestionario.PreguntaMultiple;
import cuestionario.Respuesta;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pregunta Multiple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.impl.PreguntaMultipleImpl#getRespuestas <em>Respuestas</em>}</li>
 *   <li>{@link cuestionario.impl.PreguntaMultipleImpl#getCorrectas <em>Correctas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreguntaMultipleImpl extends PreguntaImpl implements PreguntaMultiple {
	/**
	 * The cached value of the '{@link #getRespuestas() <em>Respuestas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespuestas()
	 * @generated
	 * @ordered
	 */
	protected EList<Respuesta> respuestas;
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
	public EList<Respuesta> getRespuestas() {
		if (respuestas == null) {
			respuestas = new EObjectContainmentEList<Respuesta>(Respuesta.class, this, CuestionarioPackage.PREGUNTA_MULTIPLE__RESPUESTAS);
		}
		return respuestas;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CuestionarioPackage.PREGUNTA_MULTIPLE__RESPUESTAS:
				return ((InternalEList<?>)getRespuestas()).basicRemove(otherEnd, msgs);
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
			case CuestionarioPackage.PREGUNTA_MULTIPLE__RESPUESTAS:
				return getRespuestas();
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
			case CuestionarioPackage.PREGUNTA_MULTIPLE__RESPUESTAS:
				getRespuestas().clear();
				getRespuestas().addAll((Collection<? extends Respuesta>)newValue);
				return;
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
			case CuestionarioPackage.PREGUNTA_MULTIPLE__RESPUESTAS:
				getRespuestas().clear();
				return;
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
			case CuestionarioPackage.PREGUNTA_MULTIPLE__RESPUESTAS:
				return respuestas != null && !respuestas.isEmpty();
			case CuestionarioPackage.PREGUNTA_MULTIPLE__CORRECTAS:
				return correctas != null && !correctas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PreguntaMultipleImpl
