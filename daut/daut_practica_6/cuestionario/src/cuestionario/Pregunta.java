/**
 */
package cuestionario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pregunta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.Pregunta#getName <em>Name</em>}</li>
 *   <li>{@link cuestionario.Pregunta#getEnunciado <em>Enunciado</em>}</li>
 *   <li>{@link cuestionario.Pregunta#getPuntuacion <em>Puntuacion</em>}</li>
 *   <li>{@link cuestionario.Pregunta#getPenalizacion <em>Penalizacion</em>}</li>
 *   <li>{@link cuestionario.Pregunta#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link cuestionario.Pregunta#isIsInicial <em>Is Inicial</em>}</li>
 *   <li>{@link cuestionario.Pregunta#getSiguientePreguntaAcierto <em>Siguiente Pregunta Acierto</em>}</li>
 *   <li>{@link cuestionario.Pregunta#getSiguientePreguntaError <em>Siguiente Pregunta Error</em>}</li>
 * </ul>
 *
 * @see cuestionario.CuestionarioPackage#getPregunta()
 * @model abstract="true"
 * @generated
 */
public interface Pregunta extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cuestionario.CuestionarioPackage#getPregunta_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cuestionario.Pregunta#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enunciado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enunciado</em>' attribute.
	 * @see #setEnunciado(String)
	 * @see cuestionario.CuestionarioPackage#getPregunta_Enunciado()
	 * @model required="true"
	 * @generated
	 */
	String getEnunciado();

	/**
	 * Sets the value of the '{@link cuestionario.Pregunta#getEnunciado <em>Enunciado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enunciado</em>' attribute.
	 * @see #getEnunciado()
	 * @generated
	 */
	void setEnunciado(String value);

	/**
	 * Returns the value of the '<em><b>Puntuacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puntuacion</em>' attribute.
	 * @see #setPuntuacion(double)
	 * @see cuestionario.CuestionarioPackage#getPregunta_Puntuacion()
	 * @model required="true"
	 * @generated
	 */
	double getPuntuacion();

	/**
	 * Sets the value of the '{@link cuestionario.Pregunta#getPuntuacion <em>Puntuacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puntuacion</em>' attribute.
	 * @see #getPuntuacion()
	 * @generated
	 */
	void setPuntuacion(double value);

	/**
	 * Returns the value of the '<em><b>Penalizacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penalizacion</em>' attribute.
	 * @see #setPenalizacion(double)
	 * @see cuestionario.CuestionarioPackage#getPregunta_Penalizacion()
	 * @model required="true"
	 * @generated
	 */
	double getPenalizacion();

	/**
	 * Sets the value of the '{@link cuestionario.Pregunta#getPenalizacion <em>Penalizacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalizacion</em>' attribute.
	 * @see #getPenalizacion()
	 * @generated
	 */
	void setPenalizacion(double value);

	/**
	 * Returns the value of the '<em><b>Categoria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categoria</em>' reference.
	 * @see #setCategoria(Categoria)
	 * @see cuestionario.CuestionarioPackage#getPregunta_Categoria()
	 * @model required="true"
	 * @generated
	 */
	Categoria getCategoria();

	/**
	 * Sets the value of the '{@link cuestionario.Pregunta#getCategoria <em>Categoria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categoria</em>' reference.
	 * @see #getCategoria()
	 * @generated
	 */
	void setCategoria(Categoria value);

	/**
	 * Returns the value of the '<em><b>Is Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Inicial</em>' attribute.
	 * @see #setIsInicial(boolean)
	 * @see cuestionario.CuestionarioPackage#getPregunta_IsInicial()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsInicial();

	/**
	 * Sets the value of the '{@link cuestionario.Pregunta#isIsInicial <em>Is Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inicial</em>' attribute.
	 * @see #isIsInicial()
	 * @generated
	 */
	void setIsInicial(boolean value);

	/**
	 * Returns the value of the '<em><b>Siguiente Pregunta Acierto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siguiente Pregunta Acierto</em>' reference.
	 * @see #setSiguientePreguntaAcierto(Pregunta)
	 * @see cuestionario.CuestionarioPackage#getPregunta_SiguientePreguntaAcierto()
	 * @model
	 * @generated
	 */
	Pregunta getSiguientePreguntaAcierto();

	/**
	 * Sets the value of the '{@link cuestionario.Pregunta#getSiguientePreguntaAcierto <em>Siguiente Pregunta Acierto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Siguiente Pregunta Acierto</em>' reference.
	 * @see #getSiguientePreguntaAcierto()
	 * @generated
	 */
	void setSiguientePreguntaAcierto(Pregunta value);

	/**
	 * Returns the value of the '<em><b>Siguiente Pregunta Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siguiente Pregunta Error</em>' reference.
	 * @see #setSiguientePreguntaError(Pregunta)
	 * @see cuestionario.CuestionarioPackage#getPregunta_SiguientePreguntaError()
	 * @model
	 * @generated
	 */
	Pregunta getSiguientePreguntaError();

	/**
	 * Sets the value of the '{@link cuestionario.Pregunta#getSiguientePreguntaError <em>Siguiente Pregunta Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Siguiente Pregunta Error</em>' reference.
	 * @see #getSiguientePreguntaError()
	 * @generated
	 */
	void setSiguientePreguntaError(Pregunta value);

} // Pregunta
