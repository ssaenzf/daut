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
 *   <li>{@link red.LineaTren#getParadaIni <em>Parada Ini</em>}</li>
 *   <li>{@link red.LineaTren#getParadaFin <em>Parada Fin</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getLineaTren()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface LineaTren extends Linea {
	/**
	 * Returns the value of the '<em><b>Parada Ini</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parada Ini</em>' reference.
	 * @see #setParadaIni(ParadaTren)
	 * @see red.RedPackage#getLineaTren_ParadaIni()
	 * @model required="true"
	 * @generated
	 */
	ParadaTren getParadaIni();

	/**
	 * Sets the value of the '{@link red.LineaTren#getParadaIni <em>Parada Ini</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parada Ini</em>' reference.
	 * @see #getParadaIni()
	 * @generated
	 */
	void setParadaIni(ParadaTren value);

	/**
	 * Returns the value of the '<em><b>Parada Fin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parada Fin</em>' reference.
	 * @see #setParadaFin(ParadaTren)
	 * @see red.RedPackage#getLineaTren_ParadaFin()
	 * @model required="true"
	 * @generated
	 */
	ParadaTren getParadaFin();

	/**
	 * Sets the value of the '{@link red.LineaTren#getParadaFin <em>Parada Fin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parada Fin</em>' reference.
	 * @see #getParadaFin()
	 * @generated
	 */
	void setParadaFin(ParadaTren value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tLineaTren.allInstances()-&gt;isUnique(codigo)'"
	 * @generated
	 */
	boolean nonDuplicateCodigoTren(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif circular = true then\n\t\t\t\tparadaFin = paradaIni \n\t\t\telse \n\t\t\t\tparadaFin &lt;&gt; paradaIni \n\t\t\tendif'"
	 * @generated
	 */
	boolean lineaCircular(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LineaTren
