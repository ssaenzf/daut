/**
 */
package red;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zona Tarifacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.ZonaTarifacion#getEnumeracion <em>Enumeracion</em>}</li>
 *   <li>{@link red.ZonaTarifacion#getTarifaBus <em>Tarifa Bus</em>}</li>
 *   <li>{@link red.ZonaTarifacion#getTarifaMetro <em>Tarifa Metro</em>}</li>
 *   <li>{@link red.ZonaTarifacion#getTarifaTren <em>Tarifa Tren</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getZonaTarifacion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveTarifaBus'"
 * @generated
 */
public interface ZonaTarifacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Enumeracion</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeracion</em>' attribute.
	 * @see #setEnumeracion(int)
	 * @see red.RedPackage#getZonaTarifacion_Enumeracion()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getEnumeracion();

	/**
	 * Sets the value of the '{@link red.ZonaTarifacion#getEnumeracion <em>Enumeracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeracion</em>' attribute.
	 * @see #getEnumeracion()
	 * @generated
	 */
	void setEnumeracion(int value);

	/**
	 * Returns the value of the '<em><b>Tarifa Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarifa Bus</em>' attribute.
	 * @see #setTarifaBus(double)
	 * @see red.RedPackage#getZonaTarifacion_TarifaBus()
	 * @model required="true"
	 * @generated
	 */
	double getTarifaBus();

	/**
	 * Sets the value of the '{@link red.ZonaTarifacion#getTarifaBus <em>Tarifa Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tarifa Bus</em>' attribute.
	 * @see #getTarifaBus()
	 * @generated
	 */
	void setTarifaBus(double value);

	/**
	 * Returns the value of the '<em><b>Tarifa Metro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarifa Metro</em>' attribute.
	 * @see #setTarifaMetro(double)
	 * @see red.RedPackage#getZonaTarifacion_TarifaMetro()
	 * @model required="true"
	 * @generated
	 */
	double getTarifaMetro();

	/**
	 * Sets the value of the '{@link red.ZonaTarifacion#getTarifaMetro <em>Tarifa Metro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tarifa Metro</em>' attribute.
	 * @see #getTarifaMetro()
	 * @generated
	 */
	void setTarifaMetro(double value);

	/**
	 * Returns the value of the '<em><b>Tarifa Tren</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarifa Tren</em>' attribute.
	 * @see #setTarifaTren(double)
	 * @see red.RedPackage#getZonaTarifacion_TarifaTren()
	 * @model required="true"
	 * @generated
	 */
	double getTarifaTren();

	/**
	 * Sets the value of the '{@link red.ZonaTarifacion#getTarifaTren <em>Tarifa Tren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tarifa Tren</em>' attribute.
	 * @see #getTarifaTren()
	 * @generated
	 */
	void setTarifaTren(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='tarifaTren &gt; 0'"
	 * @generated
	 */
	boolean positiveTarifaTren(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='tarifaMetro &gt; 0'"
	 * @generated
	 */
	boolean positiveTarifaMetro(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tZonaTarifacion.allInstances()-&gt;isUnique(enumeracion) and enumeracion &gt; 0'"
	 * @generated
	 */
	boolean nonDuplicateNum(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='tarifaBus &gt; 0'"
	 * @generated
	 */
	boolean positiveTarifaBus(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ZonaTarifacion
