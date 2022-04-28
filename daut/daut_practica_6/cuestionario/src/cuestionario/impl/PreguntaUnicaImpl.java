/**
 */
package cuestionario.impl;

import cuestionario.CuestionarioPackage;
import cuestionario.PreguntaUnica;
import cuestionario.Respuesta;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pregunta Unica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.impl.PreguntaUnicaImpl#getCorrecta <em>Correcta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreguntaUnicaImpl extends PreguntaImpl implements PreguntaUnica {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
			case CuestionarioPackage.PREGUNTA_UNICA__CORRECTA:
				return correcta != null;
		}
		return super.eIsSet(featureID);
	}

} //PreguntaUnicaImpl
