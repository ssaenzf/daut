/**
 */
package cuestionario;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pregunta Multiple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.PreguntaMultiple#getRespuestas <em>Respuestas</em>}</li>
 *   <li>{@link cuestionario.PreguntaMultiple#getCorrectas <em>Correctas</em>}</li>
 * </ul>
 *
 * @see cuestionario.CuestionarioPackage#getPreguntaMultiple()
 * @model
 * @generated
 */
public interface PreguntaMultiple extends Pregunta {
	/**
	 * Returns the value of the '<em><b>Respuestas</b></em>' containment reference list.
	 * The list contents are of type {@link cuestionario.Respuesta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Respuestas</em>' containment reference list.
	 * @see cuestionario.CuestionarioPackage#getPreguntaMultiple_Respuestas()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Respuesta> getRespuestas();

	/**
	 * Returns the value of the '<em><b>Correctas</b></em>' reference list.
	 * The list contents are of type {@link cuestionario.Respuesta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correctas</em>' reference list.
	 * @see cuestionario.CuestionarioPackage#getPreguntaMultiple_Correctas()
	 * @model annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Respuesta> getCorrectas();

} // PreguntaMultiple
