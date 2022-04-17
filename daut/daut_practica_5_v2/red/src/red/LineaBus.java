/**
 */
package red;


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

} // LineaBus
