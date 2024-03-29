/**
 */
package cuestionario.impl;

import cuestionario.Categoria;
import cuestionario.CuestionarioPackage;
import cuestionario.Pregunta;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pregunta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.impl.PreguntaImpl#getName <em>Name</em>}</li>
 *   <li>{@link cuestionario.impl.PreguntaImpl#getEnunciado <em>Enunciado</em>}</li>
 *   <li>{@link cuestionario.impl.PreguntaImpl#getPuntuacion <em>Puntuacion</em>}</li>
 *   <li>{@link cuestionario.impl.PreguntaImpl#getPenalizacion <em>Penalizacion</em>}</li>
 *   <li>{@link cuestionario.impl.PreguntaImpl#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link cuestionario.impl.PreguntaImpl#isIsInicial <em>Is Inicial</em>}</li>
 *   <li>{@link cuestionario.impl.PreguntaImpl#getSiguientePreguntaAcierto <em>Siguiente Pregunta Acierto</em>}</li>
 *   <li>{@link cuestionario.impl.PreguntaImpl#getSiguientePreguntaError <em>Siguiente Pregunta Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PreguntaImpl extends MinimalEObjectImpl.Container implements Pregunta {
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
	 * The default value of the '{@link #getEnunciado() <em>Enunciado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnunciado()
	 * @generated
	 * @ordered
	 */
	protected static final String ENUNCIADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnunciado() <em>Enunciado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnunciado()
	 * @generated
	 * @ordered
	 */
	protected String enunciado = ENUNCIADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPuntuacion() <em>Puntuacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuntuacion()
	 * @generated
	 * @ordered
	 */
	protected static final double PUNTUACION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPuntuacion() <em>Puntuacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuntuacion()
	 * @generated
	 * @ordered
	 */
	protected double puntuacion = PUNTUACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenalizacion() <em>Penalizacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalizacion()
	 * @generated
	 * @ordered
	 */
	protected static final double PENALIZACION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPenalizacion() <em>Penalizacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalizacion()
	 * @generated
	 * @ordered
	 */
	protected double penalizacion = PENALIZACION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategoria() <em>Categoria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoria()
	 * @generated
	 * @ordered
	 */
	protected Categoria categoria;

	/**
	 * The default value of the '{@link #isIsInicial() <em>Is Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInicial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INICIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInicial() <em>Is Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInicial()
	 * @generated
	 * @ordered
	 */
	protected boolean isInicial = IS_INICIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSiguientePreguntaAcierto() <em>Siguiente Pregunta Acierto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiguientePreguntaAcierto()
	 * @generated
	 * @ordered
	 */
	protected Pregunta siguientePreguntaAcierto;

	/**
	 * The cached value of the '{@link #getSiguientePreguntaError() <em>Siguiente Pregunta Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiguientePreguntaError()
	 * @generated
	 * @ordered
	 */
	protected Pregunta siguientePreguntaError;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreguntaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CuestionarioPackage.Literals.PREGUNTA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CuestionarioPackage.PREGUNTA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnunciado() {
		return enunciado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnunciado(String newEnunciado) {
		String oldEnunciado = enunciado;
		enunciado = newEnunciado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CuestionarioPackage.PREGUNTA__ENUNCIADO, oldEnunciado, enunciado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPuntuacion() {
		return puntuacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuntuacion(double newPuntuacion) {
		double oldPuntuacion = puntuacion;
		puntuacion = newPuntuacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CuestionarioPackage.PREGUNTA__PUNTUACION, oldPuntuacion, puntuacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPenalizacion() {
		return penalizacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenalizacion(double newPenalizacion) {
		double oldPenalizacion = penalizacion;
		penalizacion = newPenalizacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CuestionarioPackage.PREGUNTA__PENALIZACION, oldPenalizacion, penalizacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categoria getCategoria() {
		if (categoria != null && categoria.eIsProxy()) {
			InternalEObject oldCategoria = (InternalEObject)categoria;
			categoria = (Categoria)eResolveProxy(oldCategoria);
			if (categoria != oldCategoria) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CuestionarioPackage.PREGUNTA__CATEGORIA, oldCategoria, categoria));
			}
		}
		return categoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categoria basicGetCategoria() {
		return categoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoria(Categoria newCategoria) {
		Categoria oldCategoria = categoria;
		categoria = newCategoria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CuestionarioPackage.PREGUNTA__CATEGORIA, oldCategoria, categoria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInicial() {
		return isInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInicial(boolean newIsInicial) {
		boolean oldIsInicial = isInicial;
		isInicial = newIsInicial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CuestionarioPackage.PREGUNTA__IS_INICIAL, oldIsInicial, isInicial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pregunta getSiguientePreguntaAcierto() {
		if (siguientePreguntaAcierto != null && siguientePreguntaAcierto.eIsProxy()) {
			InternalEObject oldSiguientePreguntaAcierto = (InternalEObject)siguientePreguntaAcierto;
			siguientePreguntaAcierto = (Pregunta)eResolveProxy(oldSiguientePreguntaAcierto);
			if (siguientePreguntaAcierto != oldSiguientePreguntaAcierto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CuestionarioPackage.PREGUNTA__SIGUIENTE_PREGUNTA_ACIERTO, oldSiguientePreguntaAcierto, siguientePreguntaAcierto));
			}
		}
		return siguientePreguntaAcierto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pregunta basicGetSiguientePreguntaAcierto() {
		return siguientePreguntaAcierto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiguientePreguntaAcierto(Pregunta newSiguientePreguntaAcierto) {
		Pregunta oldSiguientePreguntaAcierto = siguientePreguntaAcierto;
		siguientePreguntaAcierto = newSiguientePreguntaAcierto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CuestionarioPackage.PREGUNTA__SIGUIENTE_PREGUNTA_ACIERTO, oldSiguientePreguntaAcierto, siguientePreguntaAcierto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pregunta getSiguientePreguntaError() {
		if (siguientePreguntaError != null && siguientePreguntaError.eIsProxy()) {
			InternalEObject oldSiguientePreguntaError = (InternalEObject)siguientePreguntaError;
			siguientePreguntaError = (Pregunta)eResolveProxy(oldSiguientePreguntaError);
			if (siguientePreguntaError != oldSiguientePreguntaError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CuestionarioPackage.PREGUNTA__SIGUIENTE_PREGUNTA_ERROR, oldSiguientePreguntaError, siguientePreguntaError));
			}
		}
		return siguientePreguntaError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pregunta basicGetSiguientePreguntaError() {
		return siguientePreguntaError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiguientePreguntaError(Pregunta newSiguientePreguntaError) {
		Pregunta oldSiguientePreguntaError = siguientePreguntaError;
		siguientePreguntaError = newSiguientePreguntaError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CuestionarioPackage.PREGUNTA__SIGUIENTE_PREGUNTA_ERROR, oldSiguientePreguntaError, siguientePreguntaError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CuestionarioPackage.PREGUNTA__NAME:
				return getName();
			case CuestionarioPackage.PREGUNTA__ENUNCIADO:
				return getEnunciado();
			case CuestionarioPackage.PREGUNTA__PUNTUACION:
				return getPuntuacion();
			case CuestionarioPackage.PREGUNTA__PENALIZACION:
				return getPenalizacion();
			case CuestionarioPackage.PREGUNTA__CATEGORIA:
				if (resolve) return getCategoria();
				return basicGetCategoria();
			case CuestionarioPackage.PREGUNTA__IS_INICIAL:
				return isIsInicial();
			case CuestionarioPackage.PREGUNTA__SIGUIENTE_PREGUNTA_ACIERTO:
				if (resolve) return getSiguientePreguntaAcierto();
				return basicGetSiguientePreguntaAcierto();
			case CuestionarioPackage.PREGUNTA__SIGUIENTE_PREGUNTA_ERROR:
				if (resolve) return getSiguientePreguntaError();
				return basicGetSiguientePreguntaError();
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
			case CuestionarioPackage.PREGUNTA__NAME:
				setName((String)newValue);
				return;
			case CuestionarioPackage.PREGUNTA__ENUNCIADO:
				setEnunciado((String)newValue);
				return;
			case CuestionarioPackage.PREGUNTA__PUNTUACION:
				setPuntuacion((Double)newValue);
				return;
			case CuestionarioPackage.PREGUNTA__PENALIZACION:
				setPenalizacion((Double)newValue);
				return;
			case CuestionarioPackage.PREGUNTA__CATEGORIA:
				setCategoria((Categoria)newValue);
				return;
			case CuestionarioPackage.PREGUNTA__IS_INICIAL:
				setIsInicial((Boolean)newValue);
				return;
			case CuestionarioPackage.PREGUNTA__SIGUIENTE_PREGUNTA_ACIERTO:
				setSiguientePreguntaAcierto((Pregunta)newValue);
				return;
			case CuestionarioPackage.PREGUNTA__SIGUIENTE_PREGUNTA_ERROR:
				setSiguientePreguntaError((Pregunta)newValue);
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
			case CuestionarioPackage.PREGUNTA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CuestionarioPackage.PREGUNTA__ENUNCIADO:
				setEnunciado(ENUNCIADO_EDEFAULT);
				return;
			case CuestionarioPackage.PREGUNTA__PUNTUACION:
				setPuntuacion(PUNTUACION_EDEFAULT);
				return;
			case CuestionarioPackage.PREGUNTA__PENALIZACION:
				setPenalizacion(PENALIZACION_EDEFAULT);
				return;
			case CuestionarioPackage.PREGUNTA__CATEGORIA:
				setCategoria((Categoria)null);
				return;
			case CuestionarioPackage.PREGUNTA__IS_INICIAL:
				setIsInicial(IS_INICIAL_EDEFAULT);
				return;
			case CuestionarioPackage.PREGUNTA__SIGUIENTE_PREGUNTA_ACIERTO:
				setSiguientePreguntaAcierto((Pregunta)null);
				return;
			case CuestionarioPackage.PREGUNTA__SIGUIENTE_PREGUNTA_ERROR:
				setSiguientePreguntaError((Pregunta)null);
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
			case CuestionarioPackage.PREGUNTA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CuestionarioPackage.PREGUNTA__ENUNCIADO:
				return ENUNCIADO_EDEFAULT == null ? enunciado != null : !ENUNCIADO_EDEFAULT.equals(enunciado);
			case CuestionarioPackage.PREGUNTA__PUNTUACION:
				return puntuacion != PUNTUACION_EDEFAULT;
			case CuestionarioPackage.PREGUNTA__PENALIZACION:
				return penalizacion != PENALIZACION_EDEFAULT;
			case CuestionarioPackage.PREGUNTA__CATEGORIA:
				return categoria != null;
			case CuestionarioPackage.PREGUNTA__IS_INICIAL:
				return isInicial != IS_INICIAL_EDEFAULT;
			case CuestionarioPackage.PREGUNTA__SIGUIENTE_PREGUNTA_ACIERTO:
				return siguientePreguntaAcierto != null;
			case CuestionarioPackage.PREGUNTA__SIGUIENTE_PREGUNTA_ERROR:
				return siguientePreguntaError != null;
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
		result.append(", enunciado: ");
		result.append(enunciado);
		result.append(", puntuacion: ");
		result.append(puntuacion);
		result.append(", penalizacion: ");
		result.append(penalizacion);
		result.append(", isInicial: ");
		result.append(isInicial);
		result.append(')');
		return result.toString();
	}

} //PreguntaImpl
