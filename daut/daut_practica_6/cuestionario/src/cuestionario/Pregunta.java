/**
 */
package cuestionario;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link cuestionario.Pregunta#getRespuestas <em>Respuestas</em>}</li>
 *   <li>{@link cuestionario.Pregunta#getSiguientePregunta <em>Siguiente Pregunta</em>}</li>
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
	 * Returns the value of the '<em><b>Respuestas</b></em>' containment reference list.
	 * The list contents are of type {@link cuestionario.Respuesta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Respuestas</em>' containment reference list.
	 * @see cuestionario.CuestionarioPackage#getPregunta_Respuestas()
	 * @model containment="true" lower="2"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Respuesta> getRespuestas();

	/**
	 * Returns the value of the '<em><b>Siguiente Pregunta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siguiente Pregunta</em>' reference.
	 * @see #setSiguientePregunta(Pregunta)
	 * @see cuestionario.CuestionarioPackage#getPregunta_SiguientePregunta()
	 * @model
	 * @generated
	 */
	Pregunta getSiguientePregunta();

	/**
	 * Sets the value of the '{@link cuestionario.Pregunta#getSiguientePregunta <em>Siguiente Pregunta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Siguiente Pregunta</em>' reference.
	 * @see #getSiguientePregunta()
	 * @generated
	 */
	void setSiguientePregunta(Pregunta value);

} // Pregunta
