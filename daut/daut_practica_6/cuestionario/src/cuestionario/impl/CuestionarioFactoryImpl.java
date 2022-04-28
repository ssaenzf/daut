/**
 */
package cuestionario.impl;

import cuestionario.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CuestionarioFactoryImpl extends EFactoryImpl implements CuestionarioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CuestionarioFactory init() {
		try {
			CuestionarioFactory theCuestionarioFactory = (CuestionarioFactory)EPackage.Registry.INSTANCE.getEFactory(CuestionarioPackage.eNS_URI);
			if (theCuestionarioFactory != null) {
				return theCuestionarioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CuestionarioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CuestionarioFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CuestionarioPackage.CUESTIONARIO: return createCuestionario();
			case CuestionarioPackage.CATEGORIA: return createCategoria();
			case CuestionarioPackage.PREGUNTA_UNICA: return createPreguntaUnica();
			case CuestionarioPackage.PREGUNTA_MULTIPLE: return createPreguntaMultiple();
			case CuestionarioPackage.RESPUESTA: return createRespuesta();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cuestionario createCuestionario() {
		CuestionarioImpl cuestionario = new CuestionarioImpl();
		return cuestionario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categoria createCategoria() {
		CategoriaImpl categoria = new CategoriaImpl();
		return categoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreguntaUnica createPreguntaUnica() {
		PreguntaUnicaImpl preguntaUnica = new PreguntaUnicaImpl();
		return preguntaUnica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreguntaMultiple createPreguntaMultiple() {
		PreguntaMultipleImpl preguntaMultiple = new PreguntaMultipleImpl();
		return preguntaMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Respuesta createRespuesta() {
		RespuestaImpl respuesta = new RespuestaImpl();
		return respuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CuestionarioPackage getCuestionarioPackage() {
		return (CuestionarioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CuestionarioPackage getPackage() {
		return CuestionarioPackage.eINSTANCE;
	}

} //CuestionarioFactoryImpl
