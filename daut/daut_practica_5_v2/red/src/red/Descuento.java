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
 *   <li>{@link red.Descuento#getHoraIni <em>Hora Ini</em>}</li>
 *   <li>{@link red.Descuento#getHoraFin <em>Hora Fin</em>}</li>
 *   <li>{@link red.Descuento#getDescuento <em>Descuento</em>}</li>
 *   <li>{@link red.Descuento#getLinea <em>Linea</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getDescuento()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Descuento extends EObject {
	/**
	 * Returns the value of the '<em><b>Hora Ini</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hora Ini</em>' attribute.
	 * @see #setHoraIni(int)
	 * @see red.RedPackage#getDescuento_HoraIni()
	 * @model required="true"
	 * @generated
	 */
	int getHoraIni();

	/**
	 * Sets the value of the '{@link red.Descuento#getHoraIni <em>Hora Ini</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora Ini</em>' attribute.
	 * @see #getHoraIni()
	 * @generated
	 */
	void setHoraIni(int value);

	/**
	 * Returns the value of the '<em><b>Hora Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hora Fin</em>' attribute.
	 * @see #setHoraFin(int)
	 * @see red.RedPackage#getDescuento_HoraFin()
	 * @model required="true"
	 * @generated
	 */
	int getHoraFin();

	/**
	 * Sets the value of the '{@link red.Descuento#getHoraFin <em>Hora Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora Fin</em>' attribute.
	 * @see #getHoraFin()
	 * @generated
	 */
	void setHoraFin(int value);

	/**
	 * Returns the value of the '<em><b>Descuento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descuento</em>' attribute.
	 * @see #setDescuento(int)
	 * @see red.RedPackage#getDescuento_Descuento()
	 * @model required="true"
	 * @generated
	 */
	int getDescuento();

	/**
	 * Sets the value of the '{@link red.Descuento#getDescuento <em>Descuento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descuento</em>' attribute.
	 * @see #getDescuento()
	 * @generated
	 */
	void setDescuento(int value);

	/**
	 * Returns the value of the '<em><b>Linea</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link red.Linea#getDescuentos <em>Descuentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linea</em>' container reference.
	 * @see #setLinea(Linea)
	 * @see red.RedPackage#getDescuento_Linea()
	 * @see red.Linea#getDescuentos
	 * @model opposite="descuentos" transient="false"
	 * @generated
	 */
	Linea getLinea();

	/**
	 * Sets the value of the '{@link red.Descuento#getLinea <em>Linea</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linea</em>' container reference.
	 * @see #getLinea()
	 * @generated
	 */
	void setLinea(Linea value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='descuento &gt; 0'"
	 * @generated
	 */
	boolean positiveDescuento(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t(horaIni &gt;= 0 and horaIni &lt;= 23) and \n\t\t\t(horaFin &gt;= 0 and horaFin &lt;= 23) and\n\t\t\t(horaIni &lt;&gt; horaFin) and (horaFin &gt; horaIni) and\n\t\t\t(horaIni &gt;= linea.horaApertura and horaFin &lt;= linea.horaCierre)'"
	 * @generated
	 */
	boolean horarioCorrecto(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Descuento
