/**
 */
package cuestionario.impl;

import cuestionario.Categoria;
import cuestionario.Cuestionario;
import cuestionario.CuestionarioPackage;
import cuestionario.Pregunta;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cuestionario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.impl.CuestionarioImpl#getPreguntas <em>Preguntas</em>}</li>
 *   <li>{@link cuestionario.impl.CuestionarioImpl#getCategorias <em>Categorias</em>}</li>
 *   <li>{@link cuestionario.impl.CuestionarioImpl#getPreguntaInicial <em>Pregunta Inicial</em>}</li>
 *   <li>{@link cuestionario.impl.CuestionarioImpl#getPreguntasFinales <em>Preguntas Finales</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CuestionarioImpl extends MinimalEObjectImpl.Container implements Cuestionario {
	/**
	 * The cached value of the '{@link #getPreguntas() <em>Preguntas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreguntas()
	 * @generated
	 * @ordered
	 */
	protected EList<Pregunta> preguntas;

	/**
	 * The cached value of the '{@link #getCategorias() <em>Categorias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorias()
	 * @generated
	 * @ordered
	 */
	protected EList<Categoria> categorias;

	/**
	 * The cached value of the '{@link #getPreguntaInicial() <em>Pregunta Inicial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreguntaInicial()
	 * @generated
	 * @ordered
	 */
	protected Pregunta preguntaInicial;

	/**
	 * The cached value of the '{@link #getPreguntasFinales() <em>Preguntas Finales</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreguntasFinales()
	 * @generated
	 * @ordered
	 */
	protected EList<Pregunta> preguntasFinales;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CuestionarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CuestionarioPackage.Literals.CUESTIONARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pregunta> getPreguntas() {
		if (preguntas == null) {
			preguntas = new EObjectContainmentEList<Pregunta>(Pregunta.class, this, CuestionarioPackage.CUESTIONARIO__PREGUNTAS);
		}
		return preguntas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Categoria> getCategorias() {
		if (categorias == null) {
			categorias = new EObjectContainmentEList<Categoria>(Categoria.class, this, CuestionarioPackage.CUESTIONARIO__CATEGORIAS);
		}
		return categorias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pregunta getPreguntaInicial() {
		if (preguntaInicial != null && preguntaInicial.eIsProxy()) {
			InternalEObject oldPreguntaInicial = (InternalEObject)preguntaInicial;
			preguntaInicial = (Pregunta)eResolveProxy(oldPreguntaInicial);
			if (preguntaInicial != oldPreguntaInicial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CuestionarioPackage.CUESTIONARIO__PREGUNTA_INICIAL, oldPreguntaInicial, preguntaInicial));
			}
		}
		return preguntaInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pregunta basicGetPreguntaInicial() {
		return preguntaInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreguntaInicial(Pregunta newPreguntaInicial) {
		Pregunta oldPreguntaInicial = preguntaInicial;
		preguntaInicial = newPreguntaInicial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CuestionarioPackage.CUESTIONARIO__PREGUNTA_INICIAL, oldPreguntaInicial, preguntaInicial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pregunta> getPreguntasFinales() {
		if (preguntasFinales == null) {
			preguntasFinales = new EObjectResolvingEList<Pregunta>(Pregunta.class, this, CuestionarioPackage.CUESTIONARIO__PREGUNTAS_FINALES);
		}
		return preguntasFinales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CuestionarioPackage.CUESTIONARIO__PREGUNTAS:
				return ((InternalEList<?>)getPreguntas()).basicRemove(otherEnd, msgs);
			case CuestionarioPackage.CUESTIONARIO__CATEGORIAS:
				return ((InternalEList<?>)getCategorias()).basicRemove(otherEnd, msgs);
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
			case CuestionarioPackage.CUESTIONARIO__PREGUNTAS:
				return getPreguntas();
			case CuestionarioPackage.CUESTIONARIO__CATEGORIAS:
				return getCategorias();
			case CuestionarioPackage.CUESTIONARIO__PREGUNTA_INICIAL:
				if (resolve) return getPreguntaInicial();
				return basicGetPreguntaInicial();
			case CuestionarioPackage.CUESTIONARIO__PREGUNTAS_FINALES:
				return getPreguntasFinales();
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
			case CuestionarioPackage.CUESTIONARIO__PREGUNTAS:
				getPreguntas().clear();
				getPreguntas().addAll((Collection<? extends Pregunta>)newValue);
				return;
			case CuestionarioPackage.CUESTIONARIO__CATEGORIAS:
				getCategorias().clear();
				getCategorias().addAll((Collection<? extends Categoria>)newValue);
				return;
			case CuestionarioPackage.CUESTIONARIO__PREGUNTA_INICIAL:
				setPreguntaInicial((Pregunta)newValue);
				return;
			case CuestionarioPackage.CUESTIONARIO__PREGUNTAS_FINALES:
				getPreguntasFinales().clear();
				getPreguntasFinales().addAll((Collection<? extends Pregunta>)newValue);
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
			case CuestionarioPackage.CUESTIONARIO__PREGUNTAS:
				getPreguntas().clear();
				return;
			case CuestionarioPackage.CUESTIONARIO__CATEGORIAS:
				getCategorias().clear();
				return;
			case CuestionarioPackage.CUESTIONARIO__PREGUNTA_INICIAL:
				setPreguntaInicial((Pregunta)null);
				return;
			case CuestionarioPackage.CUESTIONARIO__PREGUNTAS_FINALES:
				getPreguntasFinales().clear();
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
			case CuestionarioPackage.CUESTIONARIO__PREGUNTAS:
				return preguntas != null && !preguntas.isEmpty();
			case CuestionarioPackage.CUESTIONARIO__CATEGORIAS:
				return categorias != null && !categorias.isEmpty();
			case CuestionarioPackage.CUESTIONARIO__PREGUNTA_INICIAL:
				return preguntaInicial != null;
			case CuestionarioPackage.CUESTIONARIO__PREGUNTAS_FINALES:
				return preguntasFinales != null && !preguntasFinales.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CuestionarioImpl
