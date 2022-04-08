/**
 */
package red;

import java.util.Map;

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
 *   <li>{@link red.Linea#getParadas <em>Paradas</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getLinea()
 * @model abstract="true"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descuentos</em>' containment reference list.
	 * @see red.RedPackage#getLinea_Descuentos()
	 * @model containment="true" ordered="false"
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
	 * Returns the value of the '<em><b>Siguiente Parada Tiempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siguiente Parada Tiempo</em>' attribute.
	 * @see #setSiguienteParadaTiempo(Map)
	 * @see red.RedPackage#getLinea_SiguienteParadaTiempo()
	 * @model transient="true"
	 * @generated
	 */
	Map<?, ?> getSiguienteParadaTiempo();

	/**
	 * Sets the value of the '{@link red.Linea#getSiguienteParadaTiempo <em>Siguiente Parada Tiempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Siguiente Parada Tiempo</em>' attribute.
	 * @see #getSiguienteParadaTiempo()
	 * @generated
	 */
	void setSiguienteParadaTiempo(Map<?, ?> value);

	/**
	 * Returns the value of the '<em><b>Siguiente Parada Distancia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siguiente Parada Distancia</em>' attribute.
	 * @see #setSiguienteParadaDistancia(Map)
	 * @see red.RedPackage#getLinea_SiguienteParadaDistancia()
	 * @model transient="true"
	 * @generated
	 */
	Map<?, ?> getSiguienteParadaDistancia();

	/**
	 * Sets the value of the '{@link red.Linea#getSiguienteParadaDistancia <em>Siguiente Parada Distancia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Siguiente Parada Distancia</em>' attribute.
	 * @see #getSiguienteParadaDistancia()
	 * @generated
	 */
	void setSiguienteParadaDistancia(Map<?, ?> value);

	/**
	 * Returns the value of the '<em><b>Paradas</b></em>' containment reference list.
	 * The list contents are of type {@link red.Parada}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paradas</em>' containment reference list.
	 * @see red.RedPackage#getLinea_Paradas()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Parada> getParadas();

} // Linea
