/**
 */
package cuestionario.impl;

import cuestionario.Categoria;
import cuestionario.Cuestionario;
import cuestionario.CuestionarioFactory;
import cuestionario.CuestionarioPackage;
import cuestionario.Pregunta;
import cuestionario.PreguntaMultiple;
import cuestionario.PreguntaUnica;
import cuestionario.Respuesta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CuestionarioPackageImpl extends EPackageImpl implements CuestionarioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuestionarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preguntaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preguntaUnicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preguntaMultipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respuestaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cuestionario.CuestionarioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CuestionarioPackageImpl() {
		super(eNS_URI, CuestionarioFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CuestionarioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CuestionarioPackage init() {
		if (isInited) return (CuestionarioPackage)EPackage.Registry.INSTANCE.getEPackage(CuestionarioPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCuestionarioPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CuestionarioPackageImpl theCuestionarioPackage = registeredCuestionarioPackage instanceof CuestionarioPackageImpl ? (CuestionarioPackageImpl)registeredCuestionarioPackage : new CuestionarioPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCuestionarioPackage.createPackageContents();

		// Initialize created meta-data
		theCuestionarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCuestionarioPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CuestionarioPackage.eNS_URI, theCuestionarioPackage);
		return theCuestionarioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCuestionario() {
		return cuestionarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCuestionario_Preguntas() {
		return (EReference)cuestionarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCuestionario_Categorias() {
		return (EReference)cuestionarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCuestionario_PreguntaInicial() {
		return (EReference)cuestionarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCuestionario_PreguntasFinales() {
		return (EReference)cuestionarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPregunta() {
		return preguntaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPregunta_Name() {
		return (EAttribute)preguntaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPregunta_Enunciado() {
		return (EAttribute)preguntaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPregunta_Puntuacion() {
		return (EAttribute)preguntaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPregunta_Penalizacion() {
		return (EAttribute)preguntaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPregunta_Categoria() {
		return (EReference)preguntaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPregunta_IsInicial() {
		return (EAttribute)preguntaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPregunta_SiguientePreguntaAcierto() {
		return (EReference)preguntaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPregunta_SiguientePreguntaError() {
		return (EReference)preguntaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoria() {
		return categoriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoria_Name() {
		return (EAttribute)categoriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoria_Dificultad() {
		return (EAttribute)categoriaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoria_Subcategorias() {
		return (EReference)categoriaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreguntaUnica() {
		return preguntaUnicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreguntaUnica_Respuestas() {
		return (EReference)preguntaUnicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreguntaUnica_Correcta() {
		return (EReference)preguntaUnicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreguntaMultiple() {
		return preguntaMultipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreguntaMultiple_Respuestas() {
		return (EReference)preguntaMultipleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreguntaMultiple_Correctas() {
		return (EReference)preguntaMultipleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespuesta() {
		return respuestaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespuesta_Name() {
		return (EAttribute)respuestaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespuesta_Opcion() {
		return (EAttribute)respuestaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CuestionarioFactory getCuestionarioFactory() {
		return (CuestionarioFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cuestionarioEClass = createEClass(CUESTIONARIO);
		createEReference(cuestionarioEClass, CUESTIONARIO__PREGUNTAS);
		createEReference(cuestionarioEClass, CUESTIONARIO__CATEGORIAS);
		createEReference(cuestionarioEClass, CUESTIONARIO__PREGUNTA_INICIAL);
		createEReference(cuestionarioEClass, CUESTIONARIO__PREGUNTAS_FINALES);

		preguntaEClass = createEClass(PREGUNTA);
		createEAttribute(preguntaEClass, PREGUNTA__NAME);
		createEAttribute(preguntaEClass, PREGUNTA__ENUNCIADO);
		createEAttribute(preguntaEClass, PREGUNTA__PUNTUACION);
		createEAttribute(preguntaEClass, PREGUNTA__PENALIZACION);
		createEReference(preguntaEClass, PREGUNTA__CATEGORIA);
		createEAttribute(preguntaEClass, PREGUNTA__IS_INICIAL);
		createEReference(preguntaEClass, PREGUNTA__SIGUIENTE_PREGUNTA_ACIERTO);
		createEReference(preguntaEClass, PREGUNTA__SIGUIENTE_PREGUNTA_ERROR);

		categoriaEClass = createEClass(CATEGORIA);
		createEAttribute(categoriaEClass, CATEGORIA__NAME);
		createEAttribute(categoriaEClass, CATEGORIA__DIFICULTAD);
		createEReference(categoriaEClass, CATEGORIA__SUBCATEGORIAS);

		preguntaUnicaEClass = createEClass(PREGUNTA_UNICA);
		createEReference(preguntaUnicaEClass, PREGUNTA_UNICA__RESPUESTAS);
		createEReference(preguntaUnicaEClass, PREGUNTA_UNICA__CORRECTA);

		preguntaMultipleEClass = createEClass(PREGUNTA_MULTIPLE);
		createEReference(preguntaMultipleEClass, PREGUNTA_MULTIPLE__RESPUESTAS);
		createEReference(preguntaMultipleEClass, PREGUNTA_MULTIPLE__CORRECTAS);

		respuestaEClass = createEClass(RESPUESTA);
		createEAttribute(respuestaEClass, RESPUESTA__NAME);
		createEAttribute(respuestaEClass, RESPUESTA__OPCION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		preguntaUnicaEClass.getESuperTypes().add(this.getPregunta());
		preguntaMultipleEClass.getESuperTypes().add(this.getPregunta());

		// Initialize classes, features, and operations; add parameters
		initEClass(cuestionarioEClass, Cuestionario.class, "Cuestionario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCuestionario_Preguntas(), this.getPregunta(), null, "preguntas", null, 1, -1, Cuestionario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCuestionario_Categorias(), this.getCategoria(), null, "categorias", null, 1, -1, Cuestionario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCuestionario_PreguntaInicial(), this.getPregunta(), null, "preguntaInicial", null, 1, 1, Cuestionario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCuestionario_PreguntasFinales(), this.getPregunta(), null, "preguntasFinales", null, 1, -1, Cuestionario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preguntaEClass, Pregunta.class, "Pregunta", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPregunta_Name(), ecorePackage.getEString(), "name", null, 1, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPregunta_Enunciado(), ecorePackage.getEString(), "enunciado", null, 1, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPregunta_Puntuacion(), ecorePackage.getEDouble(), "puntuacion", null, 1, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPregunta_Penalizacion(), ecorePackage.getEDouble(), "penalizacion", null, 1, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPregunta_Categoria(), this.getCategoria(), null, "categoria", null, 1, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPregunta_IsInicial(), ecorePackage.getEBoolean(), "isInicial", null, 1, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPregunta_SiguientePreguntaAcierto(), this.getPregunta(), null, "siguientePreguntaAcierto", null, 0, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPregunta_SiguientePreguntaError(), this.getPregunta(), null, "siguientePreguntaError", null, 0, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoriaEClass, Categoria.class, "Categoria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategoria_Name(), ecorePackage.getEString(), "name", null, 1, 1, Categoria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategoria_Dificultad(), ecorePackage.getEDouble(), "dificultad", null, 1, 1, Categoria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategoria_Subcategorias(), this.getCategoria(), null, "subcategorias", null, 0, -1, Categoria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preguntaUnicaEClass, PreguntaUnica.class, "PreguntaUnica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreguntaUnica_Respuestas(), this.getRespuesta(), null, "respuestas", null, 2, -1, PreguntaUnica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreguntaUnica_Correcta(), this.getRespuesta(), null, "correcta", null, 1, 1, PreguntaUnica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preguntaMultipleEClass, PreguntaMultiple.class, "PreguntaMultiple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreguntaMultiple_Respuestas(), this.getRespuesta(), null, "respuestas", null, 1, -1, PreguntaMultiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreguntaMultiple_Correctas(), this.getRespuesta(), null, "correctas", null, 0, -1, PreguntaMultiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(respuestaEClass, Respuesta.class, "Respuesta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRespuesta_Name(), ecorePackage.getEString(), "name", null, 1, 1, Respuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespuesta_Opcion(), ecorePackage.getEString(), "opcion", null, 1, 1, Respuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getCuestionario_Preguntas(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getCuestionario_Categorias(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getCuestionario_PreguntasFinales(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getCategoria_Subcategorias(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getPreguntaUnica_Respuestas(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getPreguntaMultiple_Respuestas(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getPreguntaMultiple_Correctas(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //CuestionarioPackageImpl
