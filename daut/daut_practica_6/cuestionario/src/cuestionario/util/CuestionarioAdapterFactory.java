/**
 */
package cuestionario.util;

import cuestionario.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cuestionario.CuestionarioPackage
 * @generated
 */
public class CuestionarioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CuestionarioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CuestionarioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CuestionarioPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CuestionarioSwitch<Adapter> modelSwitch =
		new CuestionarioSwitch<Adapter>() {
			@Override
			public Adapter caseCuestionario(Cuestionario object) {
				return createCuestionarioAdapter();
			}
			@Override
			public Adapter casePregunta(Pregunta object) {
				return createPreguntaAdapter();
			}
			@Override
			public Adapter caseCategoria(Categoria object) {
				return createCategoriaAdapter();
			}
			@Override
			public Adapter casePreguntaUnica(PreguntaUnica object) {
				return createPreguntaUnicaAdapter();
			}
			@Override
			public Adapter casePreguntaMultiple(PreguntaMultiple object) {
				return createPreguntaMultipleAdapter();
			}
			@Override
			public Adapter caseRespuesta(Respuesta object) {
				return createRespuestaAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cuestionario.Cuestionario <em>Cuestionario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cuestionario.Cuestionario
	 * @generated
	 */
	public Adapter createCuestionarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cuestionario.Pregunta <em>Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cuestionario.Pregunta
	 * @generated
	 */
	public Adapter createPreguntaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cuestionario.Categoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cuestionario.Categoria
	 * @generated
	 */
	public Adapter createCategoriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cuestionario.PreguntaUnica <em>Pregunta Unica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cuestionario.PreguntaUnica
	 * @generated
	 */
	public Adapter createPreguntaUnicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cuestionario.PreguntaMultiple <em>Pregunta Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cuestionario.PreguntaMultiple
	 * @generated
	 */
	public Adapter createPreguntaMultipleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cuestionario.Respuesta <em>Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cuestionario.Respuesta
	 * @generated
	 */
	public Adapter createRespuestaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CuestionarioAdapterFactory
