/**
 */
package cuestionario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cuestionario.CuestionarioFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface CuestionarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cuestionario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cuestionario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cuestionario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CuestionarioPackage eINSTANCE = cuestionario.impl.CuestionarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link cuestionario.impl.CuestionarioImpl <em>Cuestionario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cuestionario.impl.CuestionarioImpl
	 * @see cuestionario.impl.CuestionarioPackageImpl#getCuestionario()
	 * @generated
	 */
	int CUESTIONARIO = 0;

	/**
	 * The feature id for the '<em><b>Preguntas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO__PREGUNTAS = 0;

	/**
	 * The feature id for the '<em><b>Categorias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO__CATEGORIAS = 1;

	/**
	 * The feature id for the '<em><b>Pregunta Inicial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO__PREGUNTA_INICIAL = 2;

	/**
	 * The feature id for the '<em><b>Preguntas Finales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO__PREGUNTAS_FINALES = 3;

	/**
	 * The number of structural features of the '<em>Cuestionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cuestionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cuestionario.impl.PreguntaImpl <em>Pregunta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cuestionario.impl.PreguntaImpl
	 * @see cuestionario.impl.CuestionarioPackageImpl#getPregunta()
	 * @generated
	 */
	int PREGUNTA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Enunciado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__ENUNCIADO = 1;

	/**
	 * The feature id for the '<em><b>Puntuacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__PUNTUACION = 2;

	/**
	 * The feature id for the '<em><b>Penalizacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__PENALIZACION = 3;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__CATEGORIA = 4;

	/**
	 * The feature id for the '<em><b>Is Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__IS_INICIAL = 5;

	/**
	 * The feature id for the '<em><b>Siguiente Pregunta Acierto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__SIGUIENTE_PREGUNTA_ACIERTO = 6;

	/**
	 * The feature id for the '<em><b>Siguiente Pregunta Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__SIGUIENTE_PREGUNTA_ERROR = 7;

	/**
	 * The number of structural features of the '<em>Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cuestionario.impl.CategoriaImpl <em>Categoria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cuestionario.impl.CategoriaImpl
	 * @see cuestionario.impl.CuestionarioPackageImpl#getCategoria()
	 * @generated
	 */
	int CATEGORIA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dificultad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__DIFICULTAD = 1;

	/**
	 * The feature id for the '<em><b>Subcategorias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__SUBCATEGORIAS = 2;

	/**
	 * The number of structural features of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cuestionario.impl.PreguntaUnicaImpl <em>Pregunta Unica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cuestionario.impl.PreguntaUnicaImpl
	 * @see cuestionario.impl.CuestionarioPackageImpl#getPreguntaUnica()
	 * @generated
	 */
	int PREGUNTA_UNICA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_UNICA__NAME = PREGUNTA__NAME;

	/**
	 * The feature id for the '<em><b>Enunciado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_UNICA__ENUNCIADO = PREGUNTA__ENUNCIADO;

	/**
	 * The feature id for the '<em><b>Puntuacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_UNICA__PUNTUACION = PREGUNTA__PUNTUACION;

	/**
	 * The feature id for the '<em><b>Penalizacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_UNICA__PENALIZACION = PREGUNTA__PENALIZACION;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_UNICA__CATEGORIA = PREGUNTA__CATEGORIA;

	/**
	 * The feature id for the '<em><b>Is Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_UNICA__IS_INICIAL = PREGUNTA__IS_INICIAL;

	/**
	 * The feature id for the '<em><b>Siguiente Pregunta Acierto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_UNICA__SIGUIENTE_PREGUNTA_ACIERTO = PREGUNTA__SIGUIENTE_PREGUNTA_ACIERTO;

	/**
	 * The feature id for the '<em><b>Siguiente Pregunta Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_UNICA__SIGUIENTE_PREGUNTA_ERROR = PREGUNTA__SIGUIENTE_PREGUNTA_ERROR;

	/**
	 * The feature id for the '<em><b>Respuestas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_UNICA__RESPUESTAS = PREGUNTA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correcta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_UNICA__CORRECTA = PREGUNTA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pregunta Unica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_UNICA_FEATURE_COUNT = PREGUNTA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pregunta Unica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_UNICA_OPERATION_COUNT = PREGUNTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cuestionario.impl.PreguntaMultipleImpl <em>Pregunta Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cuestionario.impl.PreguntaMultipleImpl
	 * @see cuestionario.impl.CuestionarioPackageImpl#getPreguntaMultiple()
	 * @generated
	 */
	int PREGUNTA_MULTIPLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_MULTIPLE__NAME = PREGUNTA__NAME;

	/**
	 * The feature id for the '<em><b>Enunciado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_MULTIPLE__ENUNCIADO = PREGUNTA__ENUNCIADO;

	/**
	 * The feature id for the '<em><b>Puntuacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_MULTIPLE__PUNTUACION = PREGUNTA__PUNTUACION;

	/**
	 * The feature id for the '<em><b>Penalizacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_MULTIPLE__PENALIZACION = PREGUNTA__PENALIZACION;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_MULTIPLE__CATEGORIA = PREGUNTA__CATEGORIA;

	/**
	 * The feature id for the '<em><b>Is Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_MULTIPLE__IS_INICIAL = PREGUNTA__IS_INICIAL;

	/**
	 * The feature id for the '<em><b>Siguiente Pregunta Acierto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_MULTIPLE__SIGUIENTE_PREGUNTA_ACIERTO = PREGUNTA__SIGUIENTE_PREGUNTA_ACIERTO;

	/**
	 * The feature id for the '<em><b>Siguiente Pregunta Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_MULTIPLE__SIGUIENTE_PREGUNTA_ERROR = PREGUNTA__SIGUIENTE_PREGUNTA_ERROR;

	/**
	 * The feature id for the '<em><b>Respuestas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_MULTIPLE__RESPUESTAS = PREGUNTA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correctas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_MULTIPLE__CORRECTAS = PREGUNTA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pregunta Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_MULTIPLE_FEATURE_COUNT = PREGUNTA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pregunta Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_MULTIPLE_OPERATION_COUNT = PREGUNTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cuestionario.impl.RespuestaImpl <em>Respuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cuestionario.impl.RespuestaImpl
	 * @see cuestionario.impl.CuestionarioPackageImpl#getRespuesta()
	 * @generated
	 */
	int RESPUESTA = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Opcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA__OPCION = 1;

	/**
	 * The number of structural features of the '<em>Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link cuestionario.Cuestionario <em>Cuestionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cuestionario</em>'.
	 * @see cuestionario.Cuestionario
	 * @generated
	 */
	EClass getCuestionario();

	/**
	 * Returns the meta object for the containment reference list '{@link cuestionario.Cuestionario#getPreguntas <em>Preguntas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preguntas</em>'.
	 * @see cuestionario.Cuestionario#getPreguntas()
	 * @see #getCuestionario()
	 * @generated
	 */
	EReference getCuestionario_Preguntas();

	/**
	 * Returns the meta object for the containment reference list '{@link cuestionario.Cuestionario#getCategorias <em>Categorias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categorias</em>'.
	 * @see cuestionario.Cuestionario#getCategorias()
	 * @see #getCuestionario()
	 * @generated
	 */
	EReference getCuestionario_Categorias();

	/**
	 * Returns the meta object for the reference '{@link cuestionario.Cuestionario#getPreguntaInicial <em>Pregunta Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pregunta Inicial</em>'.
	 * @see cuestionario.Cuestionario#getPreguntaInicial()
	 * @see #getCuestionario()
	 * @generated
	 */
	EReference getCuestionario_PreguntaInicial();

	/**
	 * Returns the meta object for the reference list '{@link cuestionario.Cuestionario#getPreguntasFinales <em>Preguntas Finales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Preguntas Finales</em>'.
	 * @see cuestionario.Cuestionario#getPreguntasFinales()
	 * @see #getCuestionario()
	 * @generated
	 */
	EReference getCuestionario_PreguntasFinales();

	/**
	 * Returns the meta object for class '{@link cuestionario.Pregunta <em>Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pregunta</em>'.
	 * @see cuestionario.Pregunta
	 * @generated
	 */
	EClass getPregunta();

	/**
	 * Returns the meta object for the attribute '{@link cuestionario.Pregunta#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cuestionario.Pregunta#getName()
	 * @see #getPregunta()
	 * @generated
	 */
	EAttribute getPregunta_Name();

	/**
	 * Returns the meta object for the attribute '{@link cuestionario.Pregunta#getEnunciado <em>Enunciado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enunciado</em>'.
	 * @see cuestionario.Pregunta#getEnunciado()
	 * @see #getPregunta()
	 * @generated
	 */
	EAttribute getPregunta_Enunciado();

	/**
	 * Returns the meta object for the attribute '{@link cuestionario.Pregunta#getPuntuacion <em>Puntuacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puntuacion</em>'.
	 * @see cuestionario.Pregunta#getPuntuacion()
	 * @see #getPregunta()
	 * @generated
	 */
	EAttribute getPregunta_Puntuacion();

	/**
	 * Returns the meta object for the attribute '{@link cuestionario.Pregunta#getPenalizacion <em>Penalizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalizacion</em>'.
	 * @see cuestionario.Pregunta#getPenalizacion()
	 * @see #getPregunta()
	 * @generated
	 */
	EAttribute getPregunta_Penalizacion();

	/**
	 * Returns the meta object for the reference '{@link cuestionario.Pregunta#getCategoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categoria</em>'.
	 * @see cuestionario.Pregunta#getCategoria()
	 * @see #getPregunta()
	 * @generated
	 */
	EReference getPregunta_Categoria();

	/**
	 * Returns the meta object for the attribute '{@link cuestionario.Pregunta#isIsInicial <em>Is Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inicial</em>'.
	 * @see cuestionario.Pregunta#isIsInicial()
	 * @see #getPregunta()
	 * @generated
	 */
	EAttribute getPregunta_IsInicial();

	/**
	 * Returns the meta object for the reference '{@link cuestionario.Pregunta#getSiguientePreguntaAcierto <em>Siguiente Pregunta Acierto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Siguiente Pregunta Acierto</em>'.
	 * @see cuestionario.Pregunta#getSiguientePreguntaAcierto()
	 * @see #getPregunta()
	 * @generated
	 */
	EReference getPregunta_SiguientePreguntaAcierto();

	/**
	 * Returns the meta object for the reference '{@link cuestionario.Pregunta#getSiguientePreguntaError <em>Siguiente Pregunta Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Siguiente Pregunta Error</em>'.
	 * @see cuestionario.Pregunta#getSiguientePreguntaError()
	 * @see #getPregunta()
	 * @generated
	 */
	EReference getPregunta_SiguientePreguntaError();

	/**
	 * Returns the meta object for class '{@link cuestionario.Categoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categoria</em>'.
	 * @see cuestionario.Categoria
	 * @generated
	 */
	EClass getCategoria();

	/**
	 * Returns the meta object for the attribute '{@link cuestionario.Categoria#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cuestionario.Categoria#getName()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_Name();

	/**
	 * Returns the meta object for the attribute '{@link cuestionario.Categoria#getDificultad <em>Dificultad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dificultad</em>'.
	 * @see cuestionario.Categoria#getDificultad()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_Dificultad();

	/**
	 * Returns the meta object for the containment reference list '{@link cuestionario.Categoria#getSubcategorias <em>Subcategorias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcategorias</em>'.
	 * @see cuestionario.Categoria#getSubcategorias()
	 * @see #getCategoria()
	 * @generated
	 */
	EReference getCategoria_Subcategorias();

	/**
	 * Returns the meta object for class '{@link cuestionario.PreguntaUnica <em>Pregunta Unica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pregunta Unica</em>'.
	 * @see cuestionario.PreguntaUnica
	 * @generated
	 */
	EClass getPreguntaUnica();

	/**
	 * Returns the meta object for the containment reference list '{@link cuestionario.PreguntaUnica#getRespuestas <em>Respuestas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Respuestas</em>'.
	 * @see cuestionario.PreguntaUnica#getRespuestas()
	 * @see #getPreguntaUnica()
	 * @generated
	 */
	EReference getPreguntaUnica_Respuestas();

	/**
	 * Returns the meta object for the reference '{@link cuestionario.PreguntaUnica#getCorrecta <em>Correcta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correcta</em>'.
	 * @see cuestionario.PreguntaUnica#getCorrecta()
	 * @see #getPreguntaUnica()
	 * @generated
	 */
	EReference getPreguntaUnica_Correcta();

	/**
	 * Returns the meta object for class '{@link cuestionario.PreguntaMultiple <em>Pregunta Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pregunta Multiple</em>'.
	 * @see cuestionario.PreguntaMultiple
	 * @generated
	 */
	EClass getPreguntaMultiple();

	/**
	 * Returns the meta object for the containment reference list '{@link cuestionario.PreguntaMultiple#getRespuestas <em>Respuestas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Respuestas</em>'.
	 * @see cuestionario.PreguntaMultiple#getRespuestas()
	 * @see #getPreguntaMultiple()
	 * @generated
	 */
	EReference getPreguntaMultiple_Respuestas();

	/**
	 * Returns the meta object for the reference list '{@link cuestionario.PreguntaMultiple#getCorrectas <em>Correctas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Correctas</em>'.
	 * @see cuestionario.PreguntaMultiple#getCorrectas()
	 * @see #getPreguntaMultiple()
	 * @generated
	 */
	EReference getPreguntaMultiple_Correctas();

	/**
	 * Returns the meta object for class '{@link cuestionario.Respuesta <em>Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Respuesta</em>'.
	 * @see cuestionario.Respuesta
	 * @generated
	 */
	EClass getRespuesta();

	/**
	 * Returns the meta object for the attribute '{@link cuestionario.Respuesta#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cuestionario.Respuesta#getName()
	 * @see #getRespuesta()
	 * @generated
	 */
	EAttribute getRespuesta_Name();

	/**
	 * Returns the meta object for the attribute '{@link cuestionario.Respuesta#getOpcion <em>Opcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opcion</em>'.
	 * @see cuestionario.Respuesta#getOpcion()
	 * @see #getRespuesta()
	 * @generated
	 */
	EAttribute getRespuesta_Opcion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CuestionarioFactory getCuestionarioFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cuestionario.impl.CuestionarioImpl <em>Cuestionario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cuestionario.impl.CuestionarioImpl
		 * @see cuestionario.impl.CuestionarioPackageImpl#getCuestionario()
		 * @generated
		 */
		EClass CUESTIONARIO = eINSTANCE.getCuestionario();

		/**
		 * The meta object literal for the '<em><b>Preguntas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUESTIONARIO__PREGUNTAS = eINSTANCE.getCuestionario_Preguntas();

		/**
		 * The meta object literal for the '<em><b>Categorias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUESTIONARIO__CATEGORIAS = eINSTANCE.getCuestionario_Categorias();

		/**
		 * The meta object literal for the '<em><b>Pregunta Inicial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUESTIONARIO__PREGUNTA_INICIAL = eINSTANCE.getCuestionario_PreguntaInicial();

		/**
		 * The meta object literal for the '<em><b>Preguntas Finales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUESTIONARIO__PREGUNTAS_FINALES = eINSTANCE.getCuestionario_PreguntasFinales();

		/**
		 * The meta object literal for the '{@link cuestionario.impl.PreguntaImpl <em>Pregunta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cuestionario.impl.PreguntaImpl
		 * @see cuestionario.impl.CuestionarioPackageImpl#getPregunta()
		 * @generated
		 */
		EClass PREGUNTA = eINSTANCE.getPregunta();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREGUNTA__NAME = eINSTANCE.getPregunta_Name();

		/**
		 * The meta object literal for the '<em><b>Enunciado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREGUNTA__ENUNCIADO = eINSTANCE.getPregunta_Enunciado();

		/**
		 * The meta object literal for the '<em><b>Puntuacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREGUNTA__PUNTUACION = eINSTANCE.getPregunta_Puntuacion();

		/**
		 * The meta object literal for the '<em><b>Penalizacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREGUNTA__PENALIZACION = eINSTANCE.getPregunta_Penalizacion();

		/**
		 * The meta object literal for the '<em><b>Categoria</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA__CATEGORIA = eINSTANCE.getPregunta_Categoria();

		/**
		 * The meta object literal for the '<em><b>Is Inicial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREGUNTA__IS_INICIAL = eINSTANCE.getPregunta_IsInicial();

		/**
		 * The meta object literal for the '<em><b>Siguiente Pregunta Acierto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA__SIGUIENTE_PREGUNTA_ACIERTO = eINSTANCE.getPregunta_SiguientePreguntaAcierto();

		/**
		 * The meta object literal for the '<em><b>Siguiente Pregunta Error</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA__SIGUIENTE_PREGUNTA_ERROR = eINSTANCE.getPregunta_SiguientePreguntaError();

		/**
		 * The meta object literal for the '{@link cuestionario.impl.CategoriaImpl <em>Categoria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cuestionario.impl.CategoriaImpl
		 * @see cuestionario.impl.CuestionarioPackageImpl#getCategoria()
		 * @generated
		 */
		EClass CATEGORIA = eINSTANCE.getCategoria();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__NAME = eINSTANCE.getCategoria_Name();

		/**
		 * The meta object literal for the '<em><b>Dificultad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__DIFICULTAD = eINSTANCE.getCategoria_Dificultad();

		/**
		 * The meta object literal for the '<em><b>Subcategorias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIA__SUBCATEGORIAS = eINSTANCE.getCategoria_Subcategorias();

		/**
		 * The meta object literal for the '{@link cuestionario.impl.PreguntaUnicaImpl <em>Pregunta Unica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cuestionario.impl.PreguntaUnicaImpl
		 * @see cuestionario.impl.CuestionarioPackageImpl#getPreguntaUnica()
		 * @generated
		 */
		EClass PREGUNTA_UNICA = eINSTANCE.getPreguntaUnica();

		/**
		 * The meta object literal for the '<em><b>Respuestas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA_UNICA__RESPUESTAS = eINSTANCE.getPreguntaUnica_Respuestas();

		/**
		 * The meta object literal for the '<em><b>Correcta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA_UNICA__CORRECTA = eINSTANCE.getPreguntaUnica_Correcta();

		/**
		 * The meta object literal for the '{@link cuestionario.impl.PreguntaMultipleImpl <em>Pregunta Multiple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cuestionario.impl.PreguntaMultipleImpl
		 * @see cuestionario.impl.CuestionarioPackageImpl#getPreguntaMultiple()
		 * @generated
		 */
		EClass PREGUNTA_MULTIPLE = eINSTANCE.getPreguntaMultiple();

		/**
		 * The meta object literal for the '<em><b>Respuestas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA_MULTIPLE__RESPUESTAS = eINSTANCE.getPreguntaMultiple_Respuestas();

		/**
		 * The meta object literal for the '<em><b>Correctas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA_MULTIPLE__CORRECTAS = eINSTANCE.getPreguntaMultiple_Correctas();

		/**
		 * The meta object literal for the '{@link cuestionario.impl.RespuestaImpl <em>Respuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cuestionario.impl.RespuestaImpl
		 * @see cuestionario.impl.CuestionarioPackageImpl#getRespuesta()
		 * @generated
		 */
		EClass RESPUESTA = eINSTANCE.getRespuesta();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPUESTA__NAME = eINSTANCE.getRespuesta_Name();

		/**
		 * The meta object literal for the '<em><b>Opcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPUESTA__OPCION = eINSTANCE.getRespuesta_Opcion();

	}

} //CuestionarioPackage
