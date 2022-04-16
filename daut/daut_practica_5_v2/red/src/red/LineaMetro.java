/**
 */
package red;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linea Metro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.LineaMetro#getColor <em>Color</em>}</li>
 *   <li>{@link red.LineaMetro#getParadaIni <em>Parada Ini</em>}</li>
 *   <li>{@link red.LineaMetro#getParadaFin <em>Parada Fin</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getLineaMetro()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface LineaMetro extends Linea {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link red.Colores}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see red.Colores
	 * @see #setColor(Colores)
	 * @see red.RedPackage#getLineaMetro_Color()
	 * @model
	 * @generated
	 */
	Colores getColor();

	/**
	 * Sets the value of the '{@link red.LineaMetro#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see red.Colores
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Colores value);

	/**
	 * Returns the value of the '<em><b>Parada Ini</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parada Ini</em>' reference.
	 * @see #setParadaIni(ParadaMetro)
	 * @see red.RedPackage#getLineaMetro_ParadaIni()
	 * @model required="true"
	 * @generated
	 */
	ParadaMetro getParadaIni();

	/**
	 * Sets the value of the '{@link red.LineaMetro#getParadaIni <em>Parada Ini</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parada Ini</em>' reference.
	 * @see #getParadaIni()
	 * @generated
	 */
	void setParadaIni(ParadaMetro value);

	/**
	 * Returns the value of the '<em><b>Parada Fin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parada Fin</em>' reference.
	 * @see #setParadaFin(ParadaMetro)
	 * @see red.RedPackage#getLineaMetro_ParadaFin()
	 * @model required="true"
	 * @generated
	 */
	ParadaMetro getParadaFin();

	/**
	 * Sets the value of the '{@link red.LineaMetro#getParadaFin <em>Parada Fin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parada Fin</em>' reference.
	 * @see #getParadaFin()
	 * @generated
	 */
	void setParadaFin(ParadaMetro value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tLineaMetro.allInstances()-&gt;isUnique(color)'"
	 * @generated
	 */
	boolean nonDuplicateColores(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tLineaMetro.allInstances()-&gt;isUnique(codigo)'"
	 * @generated
	 */
	boolean nonDuplicateCodigoMetro(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif circular = true then\n\t\t\t\tparadaFin = paradaIni \n\t\t\telse \n\t\t\t\tparadaFin &lt;&gt; paradaIni \n\t\t\tendif'"
	 * @generated
	 */
	boolean lineaCircular(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LineaMetro
