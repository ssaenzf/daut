/**
 */
package red;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linea Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.LineaBus#isIsDiurna <em>Is Diurna</em>}</li>
 *   <li>{@link red.LineaBus#getParadaIni <em>Parada Ini</em>}</li>
 *   <li>{@link red.LineaBus#getParadaFin <em>Parada Fin</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getLineaBus()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface LineaBus extends Linea {
	/**
	 * Returns the value of the '<em><b>Is Diurna</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Diurna</em>' attribute.
	 * @see #setIsDiurna(boolean)
	 * @see red.RedPackage#getLineaBus_IsDiurna()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsDiurna();

	/**
	 * Sets the value of the '{@link red.LineaBus#isIsDiurna <em>Is Diurna</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Diurna</em>' attribute.
	 * @see #isIsDiurna()
	 * @generated
	 */
	void setIsDiurna(boolean value);

	/**
	 * Returns the value of the '<em><b>Parada Ini</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parada Ini</em>' reference.
	 * @see #setParadaIni(ParadaBus)
	 * @see red.RedPackage#getLineaBus_ParadaIni()
	 * @model required="true"
	 * @generated
	 */
	ParadaBus getParadaIni();

	/**
	 * Sets the value of the '{@link red.LineaBus#getParadaIni <em>Parada Ini</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parada Ini</em>' reference.
	 * @see #getParadaIni()
	 * @generated
	 */
	void setParadaIni(ParadaBus value);

	/**
	 * Returns the value of the '<em><b>Parada Fin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parada Fin</em>' reference.
	 * @see #setParadaFin(ParadaBus)
	 * @see red.RedPackage#getLineaBus_ParadaFin()
	 * @model required="true"
	 * @generated
	 */
	ParadaBus getParadaFin();

	/**
	 * Sets the value of the '{@link red.LineaBus#getParadaFin <em>Parada Fin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parada Fin</em>' reference.
	 * @see #getParadaFin()
	 * @generated
	 */
	void setParadaFin(ParadaBus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tLineaBus.allInstances()-&gt;isUnique(codigo)'"
	 * @generated
	 */
	boolean nonDuplicateCodigoBus(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif isDiurna = true then\n\t\t\t\t(horaApertura &gt;= 6 and horaCierre &lt;= 23) and (horaCierre &gt; horaApertura)\n\t\t\telse \n\t\t\t\t(horaApertura &gt;= 0 and horaCierre &lt;=5) and (horaCierre &gt; horaApertura)\n\t\t\tendif'"
	 * @generated
	 */
	boolean lineaDiurna(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif circular = true then\n\t\t\t\tparadaFin = paradaIni \n\t\t\telse \n\t\t\t\tparadaFin &lt;&gt; paradaIni \n\t\t\tendif'"
	 * @generated
	 */
	boolean lineaCircular(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LineaBus
