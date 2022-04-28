/**
 */
package cuestionario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pregunta Unica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.PreguntaUnica#getCorrecta <em>Correcta</em>}</li>
 * </ul>
 *
 * @see cuestionario.CuestionarioPackage#getPreguntaUnica()
 * @model
 * @generated
 */
public interface PreguntaUnica extends Pregunta {
	/**
	 * Returns the value of the '<em><b>Correcta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correcta</em>' reference.
	 * @see #setCorrecta(Respuesta)
	 * @see cuestionario.CuestionarioPackage#getPreguntaUnica_Correcta()
	 * @model required="true"
	 * @generated
	 */
	Respuesta getCorrecta();

	/**
	 * Sets the value of the '{@link cuestionario.PreguntaUnica#getCorrecta <em>Correcta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correcta</em>' reference.
	 * @see #getCorrecta()
	 * @generated
	 */
	void setCorrecta(Respuesta value);

} // PreguntaUnica
