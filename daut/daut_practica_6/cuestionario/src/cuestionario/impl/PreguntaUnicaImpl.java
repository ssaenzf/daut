/**
 */
package cuestionario.impl;

import cuestionario.CuestionarioPackage;
import cuestionario.PreguntaUnica;
import cuestionario.Respuesta;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pregunta Unica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.impl.PreguntaUnicaImpl#getRespuestas <em>Respuestas</em>}</li>
 *   <li>{@link cuestionario.impl.PreguntaUnicaImpl#getCorrecta <em>Correcta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreguntaUnicaImpl extends PreguntaImpl implements PreguntaUnica {
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
	 * The cached value of the '{@link #getCorrecta() <em>Correcta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrecta()
	 * @generated
	 * @ordered
	 */
	protected Respuesta correcta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreguntaUnicaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CuestionarioPackage.Literals.PREGUNTA_UNICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Respuesta> getRespuestas() {
		if (respuestas == null) {
			respuestas = new EObjectContainmentEList<Respuesta>(Respuesta.class, this, CuestionarioPackage.PREGUNTA_UNICA__RESPUESTAS);
		}
		return respuestas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Respuesta getCorrecta() {
		if (correcta != null && correcta.eIsProxy()) {
			InternalEObject oldCorrecta = (InternalEObject)correcta;
			correcta = (Respuesta)eResolveProxy(oldCorrecta);
			if (correcta != oldCorrecta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CuestionarioPackage.PREGUNTA_UNICA__CORRECTA, oldCorrecta, correcta));
			}
		}
		return correcta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Respuesta basicGetCorrecta() {
		return correcta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrecta(Respuesta newCorrecta) {
		Respuesta oldCorrecta = correcta;
		correcta = newCorrecta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CuestionarioPackage.PREGUNTA_UNICA__CORRECTA, oldCorrecta, correcta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CuestionarioPackage.PREGUNTA_UNICA__RESPUESTAS:
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
			case CuestionarioPackage.PREGUNTA_UNICA__RESPUESTAS:
				return getRespuestas();
			case CuestionarioPackage.PREGUNTA_UNICA__CORRECTA:
				if (resolve) return getCorrecta();
				return basicGetCorrecta();
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
			case CuestionarioPackage.PREGUNTA_UNICA__RESPUESTAS:
				getRespuestas().clear();
				getRespuestas().addAll((Collection<? extends Respuesta>)newValue);
				return;
			case CuestionarioPackage.PREGUNTA_UNICA__CORRECTA:
				setCorrecta((Respuesta)newValue);
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
			case CuestionarioPackage.PREGUNTA_UNICA__RESPUESTAS:
				getRespuestas().clear();
				return;
			case CuestionarioPackage.PREGUNTA_UNICA__CORRECTA:
				setCorrecta((Respuesta)null);
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
			case CuestionarioPackage.PREGUNTA_UNICA__RESPUESTAS:
				return respuestas != null && !respuestas.isEmpty();
			case CuestionarioPackage.PREGUNTA_UNICA__CORRECTA:
				return correcta != null;
		}
		return super.eIsSet(featureID);
	}

} //PreguntaUnicaImpl
