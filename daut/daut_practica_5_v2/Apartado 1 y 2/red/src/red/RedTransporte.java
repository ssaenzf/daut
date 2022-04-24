/**
 */
package red;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transporte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link red.RedTransporte#getLineas <em>Lineas</em>}</li>
 *   <li>{@link red.RedTransporte#getParadas <em>Paradas</em>}</li>
 *   <li>{@link red.RedTransporte#getZonasTarifacion <em>Zonas Tarifacion</em>}</li>
 * </ul>
 *
 * @see red.RedPackage#getRedTransporte()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='lineasParadasConsecutivasIguales'"
 * @generated
 */
public interface RedTransporte extends EObject {
	/**
	 * Returns the value of the '<em><b>Lineas</b></em>' containment reference list.
	 * The list contents are of type {@link red.Linea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lineas</em>' containment reference list.
	 * @see red.RedPackage#getRedTransporte_Lineas()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Linea> getLineas();

	/**
	 * Returns the value of the '<em><b>Paradas</b></em>' containment reference list.
	 * The list contents are of type {@link red.Parada}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paradas</em>' containment reference list.
	 * @see red.RedPackage#getRedTransporte_Paradas()
	 * @model containment="true" lower="2" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Parada> getParadas();

	/**
	 * Returns the value of the '<em><b>Zonas Tarifacion</b></em>' containment reference list.
	 * The list contents are of type {@link red.ZonaTarifacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zonas Tarifacion</em>' containment reference list.
	 * @see red.RedPackage#getRedTransporte_ZonasTarifacion()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<ZonaTarifacion> getZonasTarifacion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\tzonasTarifacion-&gt;forAll(zona1|\n\t\t\tzonasTarifacion-&gt;forAll(zona2|\n\t\t\t\t(zona1.enumeracion &lt; zona2.enumeracion) implies (\n\t\t\t\t\t(zona2.tarifaBus &gt; zona1.tarifaBus) and (zona2.tarifaMetro &gt; zona1.tarifaMetro) and (zona2.tarifaTren &gt; zona1.tarifaTren)\n\t\t\t\t)\n\t\t\t)\n\t\t)'"
	 * @generated
	 */
	boolean restriccionTarifasZona(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlineas-&gt;forAll(linea1, linea2 | \n\t\t\t\tlinea1.paradas-&gt;forAll(par1 |\n\t\t\t\t\tlinea2.paradas-&gt;forAll(par2 | \n\t\t\t\t\t\t\tpar1 = par2 and linea1.paradas-&gt;at(1+ linea1.paradas-&gt;indexOf(par1)) = linea2.paradas-&gt;at(1 + linea2.paradas-&gt;indexOf(par2)) \n\t\t\t\t\t\t\timplies (\n\t\t\t\t\t\t\t\tlinea1.siguienteParadaDistancia-&gt;forAll(dis1| \n\t\t\t\t\t\t\t\t\tlinea2.siguienteParadaDistancia-&gt;forAll(dis2|\n\t\t\t\t\t\t\t\t\t\tlinea1.siguienteParadaDistancia-&gt;indexOf(dis1) = linea1.paradas-&gt;indexOf(par1) \n\t\t\t\t\t\t\t\t\t\t\tand linea2.siguienteParadaDistancia-&gt;indexOf(dis2) = linea2.paradas-&gt;indexOf(par2) \n\t\t\t\t\t\t\t\t\t\timplies dis1 = dis2))\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\t)\n\t\t\t\t\t)\n\t\t\t\t)'"
	 * @generated
	 */
	boolean lineasParadasConsecutivasIguales(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RedTransporte
