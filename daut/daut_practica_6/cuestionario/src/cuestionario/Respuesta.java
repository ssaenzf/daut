/**
 */
package cuestionario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Respuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.Respuesta#getName <em>Name</em>}</li>
 *   <li>{@link cuestionario.Respuesta#getOpcion <em>Opcion</em>}</li>
 * </ul>
 *
 * @see cuestionario.CuestionarioPackage#getRespuesta()
 * @model
 * @generated
 */
public interface Respuesta extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cuestionario.CuestionarioPackage#getRespuesta_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cuestionario.Respuesta#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Opcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opcion</em>' attribute.
	 * @see #setOpcion(String)
	 * @see cuestionario.CuestionarioPackage#getRespuesta_Opcion()
	 * @model required="true"
	 * @generated
	 */
	String getOpcion();

	/**
	 * Sets the value of the '{@link cuestionario.Respuesta#getOpcion <em>Opcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opcion</em>' attribute.
	 * @see #getOpcion()
	 * @generated
	 */
	void setOpcion(String value);

} // Respuesta
