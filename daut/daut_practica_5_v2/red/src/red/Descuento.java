/**
 */
package red;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descuento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.Descuento#getHoraApertura <em>Hora Apertura</em>}</li>
 *   <li>{@link red.Descuento#getHoraCierre <em>Hora Cierre</em>}</li>
 *   <li>{@link red.Descuento#getDescuento <em>Descuento</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getDescuento()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveDescuento'"
 * @generated
 */
public interface Descuento extends EObject {
	/**
	 * Returns the value of the '<em><b>Hora Apertura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hora Apertura</em>' attribute.
	 * @see #setHoraApertura(int)
	 * @see red.RedPackage#getDescuento_HoraApertura()
	 * @model required="true"
	 * @generated
	 */
	int getHoraApertura();

	/**
	 * Sets the value of the '{@link red.Descuento#getHoraApertura <em>Hora Apertura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora Apertura</em>' attribute.
	 * @see #getHoraApertura()
	 * @generated
	 */
	void setHoraApertura(int value);

	/**
	 * Returns the value of the '<em><b>Hora Cierre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hora Cierre</em>' attribute.
	 * @see #setHoraCierre(int)
	 * @see red.RedPackage#getDescuento_HoraCierre()
	 * @model required="true"
	 * @generated
	 */
	int getHoraCierre();

	/**
	 * Sets the value of the '{@link red.Descuento#getHoraCierre <em>Hora Cierre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora Cierre</em>' attribute.
	 * @see #getHoraCierre()
	 * @generated
	 */
	void setHoraCierre(int value);

	/**
	 * Returns the value of the '<em><b>Descuento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descuento</em>' attribute.
	 * @see #setDescuento(double)
	 * @see red.RedPackage#getDescuento_Descuento()
	 * @model required="true"
	 * @generated
	 */
	double getDescuento();

	/**
	 * Sets the value of the '{@link red.Descuento#getDescuento <em>Descuento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descuento</em>' attribute.
	 * @see #getDescuento()
	 * @generated
	 */
	void setDescuento(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='descuento &gt; 0'"
	 * @generated
	 */
	boolean positiveDescuento(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Descuento
