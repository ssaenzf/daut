/**
 */
package cuestionario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categoria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cuestionario.Categoria#getName <em>Name</em>}</li>
 *   <li>{@link cuestionario.Categoria#getDificultad <em>Dificultad</em>}</li>
 *   <li>{@link cuestionario.Categoria#getSubcategorias <em>Subcategorias</em>}</li>
 * </ul>
 *
 * @see cuestionario.CuestionarioPackage#getCategoria()
 * @model
 * @generated
 */
public interface Categoria extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cuestionario.CuestionarioPackage#getCategoria_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cuestionario.Categoria#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dificultad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dificultad</em>' attribute.
	 * @see #setDificultad(double)
	 * @see cuestionario.CuestionarioPackage#getCategoria_Dificultad()
	 * @model required="true"
	 * @generated
	 */
	double getDificultad();

	/**
	 * Sets the value of the '{@link cuestionario.Categoria#getDificultad <em>Dificultad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dificultad</em>' attribute.
	 * @see #getDificultad()
	 * @generated
	 */
	void setDificultad(double value);

	/**
	 * Returns the value of the '<em><b>Subcategorias</b></em>' containment reference list.
	 * The list contents are of type {@link cuestionario.Categoria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcategorias</em>' containment reference list.
	 * @see cuestionario.CuestionarioPackage#getCategoria_Subcategorias()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Categoria> getSubcategorias();

} // Categoria
