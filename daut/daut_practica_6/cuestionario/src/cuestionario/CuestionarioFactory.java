/**
 */
package cuestionario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cuestionario.CuestionarioPackage
 * @generated
 */
public interface CuestionarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CuestionarioFactory eINSTANCE = cuestionario.impl.CuestionarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cuestionario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cuestionario</em>'.
	 * @generated
	 */
	Cuestionario createCuestionario();

	/**
	 * Returns a new object of class '<em>Categoria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categoria</em>'.
	 * @generated
	 */
	Categoria createCategoria();

	/**
	 * Returns a new object of class '<em>Pregunta Unica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregunta Unica</em>'.
	 * @generated
	 */
	PreguntaUnica createPreguntaUnica();

	/**
	 * Returns a new object of class '<em>Pregunta Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregunta Multiple</em>'.
	 * @generated
	 */
	PreguntaMultiple createPreguntaMultiple();

	/**
	 * Returns a new object of class '<em>Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Respuesta</em>'.
	 * @generated
	 */
	Respuesta createRespuesta();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CuestionarioPackage getCuestionarioPackage();

} //CuestionarioFactory
