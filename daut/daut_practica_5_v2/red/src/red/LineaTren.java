/**
 */
package red;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linea Tren</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.LineaTren#isDiurna <em>Diurna</em>}</li>
 *   <li>{@link red.LineaTren#isNocturna <em>Nocturna</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getLineaTren()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonDuplicateCodigoTren'"
 * @generated
 */
public interface LineaTren extends Linea {
	/**
	 * Returns the value of the '<em><b>Diurna</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diurna</em>' attribute.
	 * @see #setDiurna(boolean)
	 * @see red.RedPackage#getLineaTren_Diurna()
	 * @model required="true"
	 * @generated
	 */
	boolean isDiurna();

	/**
	 * Sets the value of the '{@link red.LineaTren#isDiurna <em>Diurna</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diurna</em>' attribute.
	 * @see #isDiurna()
	 * @generated
	 */
	void setDiurna(boolean value);

	/**
	 * Returns the value of the '<em><b>Nocturna</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nocturna</em>' attribute.
	 * @see #setNocturna(boolean)
	 * @see red.RedPackage#getLineaTren_Nocturna()
	 * @model required="true"
	 * @generated
	 */
	boolean isNocturna();

	/**
	 * Sets the value of the '{@link red.LineaTren#isNocturna <em>Nocturna</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nocturna</em>' attribute.
	 * @see #isNocturna()
	 * @generated
	 */
	void setNocturna(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tLineaTren.allInstances()-&gt;isUnique(codigo)'"
	 * @generated
	 */
	boolean nonDuplicateCodigoTren(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LineaTren
