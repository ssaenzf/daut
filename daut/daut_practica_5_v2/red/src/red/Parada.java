/**
 */
package red;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parada</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.Parada#getNombre <em>Nombre</em>}</li>
 *   <li>{@link red.Parada#isAccesible <em>Accesible</em>}</li>
 *   <li>{@link red.Parada#isBicicletas <em>Bicicletas</em>}</li>
 *   <li>{@link red.Parada#isAparcamientoGrat <em>Aparcamiento Grat</em>}</li>
 *   <li>{@link red.Parada#isAseos <em>Aseos</em>}</li>
 *   <li>{@link red.Parada#getTransbordo <em>Transbordo</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getParada()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonDuplicateNombreParada'"
 * @generated
 */
public interface Parada extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see red.RedPackage#getParada_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link red.Parada#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Accesible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesible</em>' attribute.
	 * @see #setAccesible(boolean)
	 * @see red.RedPackage#getParada_Accesible()
	 * @model required="true"
	 * @generated
	 */
	boolean isAccesible();

	/**
	 * Sets the value of the '{@link red.Parada#isAccesible <em>Accesible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accesible</em>' attribute.
	 * @see #isAccesible()
	 * @generated
	 */
	void setAccesible(boolean value);

	/**
	 * Returns the value of the '<em><b>Bicicletas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bicicletas</em>' attribute.
	 * @see #setBicicletas(boolean)
	 * @see red.RedPackage#getParada_Bicicletas()
	 * @model required="true"
	 * @generated
	 */
	boolean isBicicletas();

	/**
	 * Sets the value of the '{@link red.Parada#isBicicletas <em>Bicicletas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bicicletas</em>' attribute.
	 * @see #isBicicletas()
	 * @generated
	 */
	void setBicicletas(boolean value);

	/**
	 * Returns the value of the '<em><b>Aparcamiento Grat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aparcamiento Grat</em>' attribute.
	 * @see #setAparcamientoGrat(boolean)
	 * @see red.RedPackage#getParada_AparcamientoGrat()
	 * @model required="true"
	 * @generated
	 */
	boolean isAparcamientoGrat();

	/**
	 * Sets the value of the '{@link red.Parada#isAparcamientoGrat <em>Aparcamiento Grat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aparcamiento Grat</em>' attribute.
	 * @see #isAparcamientoGrat()
	 * @generated
	 */
	void setAparcamientoGrat(boolean value);

	/**
	 * Returns the value of the '<em><b>Aseos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aseos</em>' attribute.
	 * @see #setAseos(boolean)
	 * @see red.RedPackage#getParada_Aseos()
	 * @model required="true"
	 * @generated
	 */
	boolean isAseos();

	/**
	 * Sets the value of the '{@link red.Parada#isAseos <em>Aseos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aseos</em>' attribute.
	 * @see #isAseos()
	 * @generated
	 */
	void setAseos(boolean value);

	/**
	 * Returns the value of the '<em><b>Transbordo</b></em>' attribute.
	 * The literals are from the enumeration {@link red.Transbordos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transbordo</em>' attribute.
	 * @see red.Transbordos
	 * @see #setTransbordo(Transbordos)
	 * @see red.RedPackage#getParada_Transbordo()
	 * @model
	 * @generated
	 */
	Transbordos getTransbordo();

	/**
	 * Sets the value of the '{@link red.Parada#getTransbordo <em>Transbordo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transbordo</em>' attribute.
	 * @see red.Transbordos
	 * @see #getTransbordo()
	 * @generated
	 */
	void setTransbordo(Transbordos value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tParada.allInstances()-&gt;isUnique(nombre)'"
	 * @generated
	 */
	boolean nonDuplicateNombreParada(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Parada
