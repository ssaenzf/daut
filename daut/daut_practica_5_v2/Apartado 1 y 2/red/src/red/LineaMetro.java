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
 * </ul>
 *
 * @see red.RedPackage#getLineaMetro()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='paradasCorrectas'"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tparadaIni.oclIsTypeOf(ParadaMetro) and paradaFin.oclIsTypeOf(ParadaMetro)'"
	 * @generated
	 */
	boolean paradasIniFin(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tparadas-&gt;forAll(p | p.oclIsTypeOf(ParadaMetro))'"
	 * @generated
	 */
	boolean paradasCorrectas(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LineaMetro
