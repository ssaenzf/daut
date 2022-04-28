/**
 */
package cuestionario.util;

import cuestionario.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cuestionario.CuestionarioPackage
 * @generated
 */
public class CuestionarioSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CuestionarioPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CuestionarioSwitch() {
		if (modelPackage == null) {
			modelPackage = CuestionarioPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CuestionarioPackage.CUESTIONARIO: {
				Cuestionario cuestionario = (Cuestionario)theEObject;
				T result = caseCuestionario(cuestionario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CuestionarioPackage.PREGUNTA: {
				Pregunta pregunta = (Pregunta)theEObject;
				T result = casePregunta(pregunta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CuestionarioPackage.CATEGORIA: {
				Categoria categoria = (Categoria)theEObject;
				T result = caseCategoria(categoria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CuestionarioPackage.PREGUNTA_UNICA: {
				PreguntaUnica preguntaUnica = (PreguntaUnica)theEObject;
				T result = casePreguntaUnica(preguntaUnica);
				if (result == null) result = casePregunta(preguntaUnica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CuestionarioPackage.PREGUNTA_MULTIPLE: {
				PreguntaMultiple preguntaMultiple = (PreguntaMultiple)theEObject;
				T result = casePreguntaMultiple(preguntaMultiple);
				if (result == null) result = casePregunta(preguntaMultiple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CuestionarioPackage.RESPUESTA: {
				Respuesta respuesta = (Respuesta)theEObject;
				T result = caseRespuesta(respuesta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cuestionario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cuestionario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCuestionario(Cuestionario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pregunta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pregunta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePregunta(Pregunta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categoria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categoria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoria(Categoria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pregunta Unica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pregunta Unica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreguntaUnica(PreguntaUnica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pregunta Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pregunta Multiple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreguntaMultiple(PreguntaMultiple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Respuesta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespuesta(Respuesta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CuestionarioSwitch
