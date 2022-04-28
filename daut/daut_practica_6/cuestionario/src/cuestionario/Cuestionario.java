/**
 */
package cuestionario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cuestionario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.Cuestionario#getPreguntas <em>Preguntas</em>}</li>
 *   <li>{@link cuestionario.Cuestionario#getCategorias <em>Categorias</em>}</li>
 *   <li>{@link cuestionario.Cuestionario#getPreguntaInicial <em>Pregunta Inicial</em>}</li>
 *   <li>{@link cuestionario.Cuestionario#getPreguntasFinales <em>Preguntas Finales</em>}</li>
 * </ul>
 *
 * @see cuestionario.CuestionarioPackage#getCuestionario()
 * @model
 * @generated
 */
public interface Cuestionario extends EObject {
	/**
	 * Returns the value of the '<em><b>Preguntas</b></em>' containment reference list.
	 * The list contents are of type {@link cuestionario.Pregunta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preguntas</em>' containment reference list.
	 * @see cuestionario.CuestionarioPackage#getCuestionario_Preguntas()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Pregunta> getPreguntas();

	/**
	 * Returns the value of the '<em><b>Categorias</b></em>' containment reference list.
	 * The list contents are of type {@link cuestionario.Categoria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorias</em>' containment reference list.
	 * @see cuestionario.CuestionarioPackage#getCuestionario_Categorias()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Categoria> getCategorias();

	/**
	 * Returns the value of the '<em><b>Pregunta Inicial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pregunta Inicial</em>' reference.
	 * @see #setPreguntaInicial(Pregunta)
	 * @see cuestionario.CuestionarioPackage#getCuestionario_PreguntaInicial()
	 * @model required="true"
	 * @generated
	 */
	Pregunta getPreguntaInicial();

	/**
	 * Sets the value of the '{@link cuestionario.Cuestionario#getPreguntaInicial <em>Pregunta Inicial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pregunta Inicial</em>' reference.
	 * @see #getPreguntaInicial()
	 * @generated
	 */
	void setPreguntaInicial(Pregunta value);

	/**
	 * Returns the value of the '<em><b>Preguntas Finales</b></em>' reference list.
	 * The list contents are of type {@link cuestionario.Pregunta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preguntas Finales</em>' reference list.
	 * @see cuestionario.CuestionarioPackage#getCuestionario_PreguntasFinales()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Pregunta> getPreguntasFinales();

} // Cuestionario
