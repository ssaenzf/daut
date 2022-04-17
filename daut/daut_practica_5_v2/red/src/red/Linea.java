/**
 */
package red;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.Linea#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link red.Linea#getDescuentos <em>Descuentos</em>}</li>
 *   <li>{@link red.Linea#getHoraApertura <em>Hora Apertura</em>}</li>
 *   <li>{@link red.Linea#getHoraCierre <em>Hora Cierre</em>}</li>
 *   <li>{@link red.Linea#getSiguienteParadaTiempo <em>Siguiente Parada Tiempo</em>}</li>
 *   <li>{@link red.Linea#getSiguienteParadaDistancia <em>Siguiente Parada Distancia</em>}</li>
 *   <li>{@link red.Linea#isCircular <em>Circular</em>}</li>
 *   <li>{@link red.Linea#getParadaIni <em>Parada Ini</em>}</li>
 *   <li>{@link red.Linea#getParadaFin <em>Parada Fin</em>}</li>
 *   <li>{@link red.Linea#getParadas <em>Paradas</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getLinea()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Linea extends EObject {
	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(String)
	 * @see red.RedPackage#getLinea_Codigo()
	 * @model required="true"
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link red.Linea#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>Descuentos</b></em>' containment reference list.
	 * The list contents are of type {@link red.Descuento}.
	 * It is bidirectional and its opposite is '{@link red.Descuento#getLinea <em>Linea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descuentos</em>' containment reference list.
	 * @see red.RedPackage#getLinea_Descuentos()
	 * @see red.Descuento#getLinea
	 * @model opposite="linea" containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Descuento> getDescuentos();

	/**
	 * Returns the value of the '<em><b>Hora Apertura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hora Apertura</em>' attribute.
	 * @see #setHoraApertura(int)
	 * @see red.RedPackage#getLinea_HoraApertura()
	 * @model required="true"
	 * @generated
	 */
	int getHoraApertura();

	/**
	 * Sets the value of the '{@link red.Linea#getHoraApertura <em>Hora Apertura</em>}' attribute.
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
	 * @see red.RedPackage#getLinea_HoraCierre()
	 * @model required="true"
	 * @generated
	 */
	int getHoraCierre();

	/**
	 * Sets the value of the '{@link red.Linea#getHoraCierre <em>Hora Cierre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora Cierre</em>' attribute.
	 * @see #getHoraCierre()
	 * @generated
	 */
	void setHoraCierre(int value);

	/**
	 * Returns the value of the '<em><b>Siguiente Parada Tiempo</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siguiente Parada Tiempo</em>' attribute list.
	 * @see red.RedPackage#getLinea_SiguienteParadaTiempo()
	 * @model required="true" transient="true"
	 * @generated
	 */
	EList<Double> getSiguienteParadaTiempo();

	/**
	 * Returns the value of the '<em><b>Siguiente Parada Distancia</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siguiente Parada Distancia</em>' attribute list.
	 * @see red.RedPackage#getLinea_SiguienteParadaDistancia()
	 * @model required="true" transient="true"
	 * @generated
	 */
	EList<Double> getSiguienteParadaDistancia();

	/**
	 * Returns the value of the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circular</em>' attribute.
	 * @see #setCircular(boolean)
	 * @see red.RedPackage#getLinea_Circular()
	 * @model required="true"
	 * @generated
	 */
	boolean isCircular();

	/**
	 * Sets the value of the '{@link red.Linea#isCircular <em>Circular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circular</em>' attribute.
	 * @see #isCircular()
	 * @generated
	 */
	void setCircular(boolean value);

	/**
	 * Returns the value of the '<em><b>Parada Ini</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parada Ini</em>' reference.
	 * @see #setParadaIni(Parada)
	 * @see red.RedPackage#getLinea_ParadaIni()
	 * @model required="true"
	 * @generated
	 */
	Parada getParadaIni();

	/**
	 * Sets the value of the '{@link red.Linea#getParadaIni <em>Parada Ini</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parada Ini</em>' reference.
	 * @see #getParadaIni()
	 * @generated
	 */
	void setParadaIni(Parada value);

	/**
	 * Returns the value of the '<em><b>Parada Fin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parada Fin</em>' reference.
	 * @see #setParadaFin(Parada)
	 * @see red.RedPackage#getLinea_ParadaFin()
	 * @model required="true"
	 * @generated
	 */
	Parada getParadaFin();

	/**
	 * Sets the value of the '{@link red.Linea#getParadaFin <em>Parada Fin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parada Fin</em>' reference.
	 * @see #getParadaFin()
	 * @generated
	 */
	void setParadaFin(Parada value);

	/**
	 * Returns the value of the '<em><b>Paradas</b></em>' reference list.
	 * The list contents are of type {@link red.Parada}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paradas</em>' reference list.
	 * @see red.RedPackage#getLinea_Paradas()
	 * @model lower="2"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Parada> getParadas();

} // Linea
