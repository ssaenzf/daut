/**
 */
package red;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linea Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.LineaBus#getParadas <em>Paradas</em>}</li>
 *   <li>{@link red.LineaBus#isIsDiurna <em>Is Diurna</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getLineaBus()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='lineaDiurna'"
 * @generated
 */
public interface LineaBus extends Linea {
	/**
	 * Returns the value of the '<em><b>Paradas</b></em>' reference list.
	 * The list contents are of type {@link red.ParadaBus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paradas</em>' reference list.
	 * @see red.RedPackage#getLineaBus_Paradas()
	 * @model lower="2"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<ParadaBus> getParadas();

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

} // LineaBus
