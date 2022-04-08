/**
 */
package red;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see red.RedFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface RedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "red";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "red";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "red";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RedPackage eINSTANCE = red.impl.RedPackageImpl.init();

	/**
	 * The meta object id for the '{@link red.impl.RedTransporteImpl <em>Transporte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.RedTransporteImpl
	 * @see red.impl.RedPackageImpl#getRedTransporte()
	 * @generated
	 */
	int RED_TRANSPORTE = 0;

	/**
	 * The feature id for the '<em><b>Lineas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_TRANSPORTE__LINEAS = 0;

	/**
	 * The feature id for the '<em><b>Paradas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_TRANSPORTE__PARADAS = 1;

	/**
	 * The feature id for the '<em><b>Zonas Tarifacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_TRANSPORTE__ZONAS_TARIFACION = 2;

	/**
	 * The number of structural features of the '<em>Transporte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_TRANSPORTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transporte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_TRANSPORTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link red.impl.LineaImpl <em>Linea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.LineaImpl
	 * @see red.impl.RedPackageImpl#getLinea()
	 * @generated
	 */
	int LINEA = 1;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Descuentos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__DESCUENTOS = 1;

	/**
	 * The feature id for the '<em><b>Hora Apertura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__HORA_APERTURA = 2;

	/**
	 * The feature id for the '<em><b>Hora Cierre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__HORA_CIERRE = 3;

	/**
	 * The feature id for the '<em><b>Siguiente Parada Tiempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__SIGUIENTE_PARADA_TIEMPO = 4;

	/**
	 * The feature id for the '<em><b>Siguiente Parada Distancia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__SIGUIENTE_PARADA_DISTANCIA = 5;

	/**
	 * The feature id for the '<em><b>Paradas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__PARADAS = 6;

	/**
	 * The number of structural features of the '<em>Linea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Linea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link red.impl.LineaMetroImpl <em>Linea Metro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.LineaMetroImpl
	 * @see red.impl.RedPackageImpl#getLineaMetro()
	 * @generated
	 */
	int LINEA_METRO = 2;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__CODIGO = LINEA__CODIGO;

	/**
	 * The feature id for the '<em><b>Descuentos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__DESCUENTOS = LINEA__DESCUENTOS;

	/**
	 * The feature id for the '<em><b>Hora Apertura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__HORA_APERTURA = LINEA__HORA_APERTURA;

	/**
	 * The feature id for the '<em><b>Hora Cierre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__HORA_CIERRE = LINEA__HORA_CIERRE;

	/**
	 * The feature id for the '<em><b>Siguiente Parada Tiempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__SIGUIENTE_PARADA_TIEMPO = LINEA__SIGUIENTE_PARADA_TIEMPO;

	/**
	 * The feature id for the '<em><b>Siguiente Parada Distancia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__SIGUIENTE_PARADA_DISTANCIA = LINEA__SIGUIENTE_PARADA_DISTANCIA;

	/**
	 * The feature id for the '<em><b>Paradas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__PARADAS = LINEA__PARADAS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__COLOR = LINEA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linea Metro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO_FEATURE_COUNT = LINEA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Non Duplicate Colores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO___NON_DUPLICATE_COLORES__DIAGNOSTICCHAIN_MAP = LINEA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Non Duplicate Codigo Metro</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO___NON_DUPLICATE_CODIGO_METRO__DIAGNOSTICCHAIN_MAP = LINEA_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Linea Metro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO_OPERATION_COUNT = LINEA_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link red.impl.LineaTrenImpl <em>Linea Tren</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.LineaTrenImpl
	 * @see red.impl.RedPackageImpl#getLineaTren()
	 * @generated
	 */
	int LINEA_TREN = 3;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__CODIGO = LINEA__CODIGO;

	/**
	 * The feature id for the '<em><b>Descuentos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__DESCUENTOS = LINEA__DESCUENTOS;

	/**
	 * The feature id for the '<em><b>Hora Apertura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__HORA_APERTURA = LINEA__HORA_APERTURA;

	/**
	 * The feature id for the '<em><b>Hora Cierre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__HORA_CIERRE = LINEA__HORA_CIERRE;

	/**
	 * The feature id for the '<em><b>Siguiente Parada Tiempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__SIGUIENTE_PARADA_TIEMPO = LINEA__SIGUIENTE_PARADA_TIEMPO;

	/**
	 * The feature id for the '<em><b>Siguiente Parada Distancia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__SIGUIENTE_PARADA_DISTANCIA = LINEA__SIGUIENTE_PARADA_DISTANCIA;

	/**
	 * The feature id for the '<em><b>Paradas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__PARADAS = LINEA__PARADAS;

	/**
	 * The feature id for the '<em><b>Diurna</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__DIURNA = LINEA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nocturna</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__NOCTURNA = LINEA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linea Tren</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN_FEATURE_COUNT = LINEA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Non Duplicate Codigo Tren</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN___NON_DUPLICATE_CODIGO_TREN__DIAGNOSTICCHAIN_MAP = LINEA_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linea Tren</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN_OPERATION_COUNT = LINEA_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link red.impl.LineaBusImpl <em>Linea Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.LineaBusImpl
	 * @see red.impl.RedPackageImpl#getLineaBus()
	 * @generated
	 */
	int LINEA_BUS = 4;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__CODIGO = LINEA__CODIGO;

	/**
	 * The feature id for the '<em><b>Descuentos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__DESCUENTOS = LINEA__DESCUENTOS;

	/**
	 * The feature id for the '<em><b>Hora Apertura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__HORA_APERTURA = LINEA__HORA_APERTURA;

	/**
	 * The feature id for the '<em><b>Hora Cierre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__HORA_CIERRE = LINEA__HORA_CIERRE;

	/**
	 * The feature id for the '<em><b>Siguiente Parada Tiempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__SIGUIENTE_PARADA_TIEMPO = LINEA__SIGUIENTE_PARADA_TIEMPO;

	/**
	 * The feature id for the '<em><b>Siguiente Parada Distancia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__SIGUIENTE_PARADA_DISTANCIA = LINEA__SIGUIENTE_PARADA_DISTANCIA;

	/**
	 * The feature id for the '<em><b>Paradas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__PARADAS = LINEA__PARADAS;

	/**
	 * The number of structural features of the '<em>Linea Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS_FEATURE_COUNT = LINEA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Non Duplicate Codigo Bus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS___NON_DUPLICATE_CODIGO_BUS__DIAGNOSTICCHAIN_MAP = LINEA_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linea Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS_OPERATION_COUNT = LINEA_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link red.impl.ParadaImpl <em>Parada</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.ParadaImpl
	 * @see red.impl.RedPackageImpl#getParada()
	 * @generated
	 */
	int PARADA = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Accesible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA__ACCESIBLE = 1;

	/**
	 * The feature id for the '<em><b>Bicicletas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA__BICICLETAS = 2;

	/**
	 * The feature id for the '<em><b>Aparcamiento Grat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA__APARCAMIENTO_GRAT = 3;

	/**
	 * The feature id for the '<em><b>Aseos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA__ASEOS = 4;

	/**
	 * The feature id for the '<em><b>Transbordo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA__TRANSBORDO = 5;

	/**
	 * The number of structural features of the '<em>Parada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Non Duplicate Nombre Parada</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA___NON_DUPLICATE_NOMBRE_PARADA__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Parada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link red.impl.DescuentoImpl <em>Descuento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.DescuentoImpl
	 * @see red.impl.RedPackageImpl#getDescuento()
	 * @generated
	 */
	int DESCUENTO = 6;

	/**
	 * The feature id for the '<em><b>Hora Apertura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCUENTO__HORA_APERTURA = 0;

	/**
	 * The feature id for the '<em><b>Hora Cierre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCUENTO__HORA_CIERRE = 1;

	/**
	 * The feature id for the '<em><b>Descuento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCUENTO__DESCUENTO = 2;

	/**
	 * The number of structural features of the '<em>Descuento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCUENTO_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Positive Descuento</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCUENTO___POSITIVE_DESCUENTO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Descuento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCUENTO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link red.impl.ZonaTarifacionImpl <em>Zona Tarifacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.ZonaTarifacionImpl
	 * @see red.impl.RedPackageImpl#getZonaTarifacion()
	 * @generated
	 */
	int ZONA_TARIFACION = 7;

	/**
	 * The feature id for the '<em><b>Enumeracion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_TARIFACION__ENUMERACION = 0;

	/**
	 * The feature id for the '<em><b>Tarifa Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_TARIFACION__TARIFA_BUS = 1;

	/**
	 * The feature id for the '<em><b>Tarifa Metro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_TARIFACION__TARIFA_METRO = 2;

	/**
	 * The feature id for the '<em><b>Tarifa Tren</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_TARIFACION__TARIFA_TREN = 3;

	/**
	 * The number of structural features of the '<em>Zona Tarifacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_TARIFACION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Positive Tarifa Bus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_TARIFACION___POSITIVE_TARIFA_BUS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Positive Tarifa Tren</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_TARIFACION___POSITIVE_TARIFA_TREN__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Positive Tarifa Metro</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_TARIFACION___POSITIVE_TARIFA_METRO__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Zona Tarifacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_TARIFACION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link red.Colores <em>Colores</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.Colores
	 * @see red.impl.RedPackageImpl#getColores()
	 * @generated
	 */
	int COLORES = 8;

	/**
	 * The meta object id for the '{@link red.Transbordos <em>Transbordos</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.Transbordos
	 * @see red.impl.RedPackageImpl#getTransbordos()
	 * @generated
	 */
	int TRANSBORDOS = 9;


	/**
	 * Returns the meta object for class '{@link red.RedTransporte <em>Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transporte</em>'.
	 * @see red.RedTransporte
	 * @generated
	 */
	EClass getRedTransporte();

	/**
	 * Returns the meta object for the containment reference list '{@link red.RedTransporte#getLineas <em>Lineas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lineas</em>'.
	 * @see red.RedTransporte#getLineas()
	 * @see #getRedTransporte()
	 * @generated
	 */
	EReference getRedTransporte_Lineas();

	/**
	 * Returns the meta object for the containment reference list '{@link red.RedTransporte#getParadas <em>Paradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paradas</em>'.
	 * @see red.RedTransporte#getParadas()
	 * @see #getRedTransporte()
	 * @generated
	 */
	EReference getRedTransporte_Paradas();

	/**
	 * Returns the meta object for the containment reference list '{@link red.RedTransporte#getZonasTarifacion <em>Zonas Tarifacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zonas Tarifacion</em>'.
	 * @see red.RedTransporte#getZonasTarifacion()
	 * @see #getRedTransporte()
	 * @generated
	 */
	EReference getRedTransporte_ZonasTarifacion();

	/**
	 * Returns the meta object for class '{@link red.Linea <em>Linea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linea</em>'.
	 * @see red.Linea
	 * @generated
	 */
	EClass getLinea();

	/**
	 * Returns the meta object for the attribute '{@link red.Linea#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see red.Linea#getCodigo()
	 * @see #getLinea()
	 * @generated
	 */
	EAttribute getLinea_Codigo();

	/**
	 * Returns the meta object for the containment reference list '{@link red.Linea#getDescuentos <em>Descuentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descuentos</em>'.
	 * @see red.Linea#getDescuentos()
	 * @see #getLinea()
	 * @generated
	 */
	EReference getLinea_Descuentos();

	/**
	 * Returns the meta object for the attribute '{@link red.Linea#getHoraApertura <em>Hora Apertura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora Apertura</em>'.
	 * @see red.Linea#getHoraApertura()
	 * @see #getLinea()
	 * @generated
	 */
	EAttribute getLinea_HoraApertura();

	/**
	 * Returns the meta object for the attribute '{@link red.Linea#getHoraCierre <em>Hora Cierre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora Cierre</em>'.
	 * @see red.Linea#getHoraCierre()
	 * @see #getLinea()
	 * @generated
	 */
	EAttribute getLinea_HoraCierre();

	/**
	 * Returns the meta object for the attribute '{@link red.Linea#getSiguienteParadaTiempo <em>Siguiente Parada Tiempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Siguiente Parada Tiempo</em>'.
	 * @see red.Linea#getSiguienteParadaTiempo()
	 * @see #getLinea()
	 * @generated
	 */
	EAttribute getLinea_SiguienteParadaTiempo();

	/**
	 * Returns the meta object for the attribute '{@link red.Linea#getSiguienteParadaDistancia <em>Siguiente Parada Distancia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Siguiente Parada Distancia</em>'.
	 * @see red.Linea#getSiguienteParadaDistancia()
	 * @see #getLinea()
	 * @generated
	 */
	EAttribute getLinea_SiguienteParadaDistancia();

	/**
	 * Returns the meta object for the containment reference list '{@link red.Linea#getParadas <em>Paradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paradas</em>'.
	 * @see red.Linea#getParadas()
	 * @see #getLinea()
	 * @generated
	 */
	EReference getLinea_Paradas();

	/**
	 * Returns the meta object for class '{@link red.LineaMetro <em>Linea Metro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linea Metro</em>'.
	 * @see red.LineaMetro
	 * @generated
	 */
	EClass getLineaMetro();

	/**
	 * Returns the meta object for the attribute '{@link red.LineaMetro#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see red.LineaMetro#getColor()
	 * @see #getLineaMetro()
	 * @generated
	 */
	EAttribute getLineaMetro_Color();

	/**
	 * Returns the meta object for the '{@link red.LineaMetro#nonDuplicateColores(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Colores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Duplicate Colores</em>' operation.
	 * @see red.LineaMetro#nonDuplicateColores(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLineaMetro__NonDuplicateColores__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link red.LineaMetro#nonDuplicateCodigoMetro(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Codigo Metro</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Duplicate Codigo Metro</em>' operation.
	 * @see red.LineaMetro#nonDuplicateCodigoMetro(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLineaMetro__NonDuplicateCodigoMetro__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link red.LineaTren <em>Linea Tren</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linea Tren</em>'.
	 * @see red.LineaTren
	 * @generated
	 */
	EClass getLineaTren();

	/**
	 * Returns the meta object for the attribute '{@link red.LineaTren#isDiurna <em>Diurna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diurna</em>'.
	 * @see red.LineaTren#isDiurna()
	 * @see #getLineaTren()
	 * @generated
	 */
	EAttribute getLineaTren_Diurna();

	/**
	 * Returns the meta object for the attribute '{@link red.LineaTren#isNocturna <em>Nocturna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nocturna</em>'.
	 * @see red.LineaTren#isNocturna()
	 * @see #getLineaTren()
	 * @generated
	 */
	EAttribute getLineaTren_Nocturna();

	/**
	 * Returns the meta object for the '{@link red.LineaTren#nonDuplicateCodigoTren(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Codigo Tren</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Duplicate Codigo Tren</em>' operation.
	 * @see red.LineaTren#nonDuplicateCodigoTren(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLineaTren__NonDuplicateCodigoTren__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link red.LineaBus <em>Linea Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linea Bus</em>'.
	 * @see red.LineaBus
	 * @generated
	 */
	EClass getLineaBus();

	/**
	 * Returns the meta object for the '{@link red.LineaBus#nonDuplicateCodigoBus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Codigo Bus</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Duplicate Codigo Bus</em>' operation.
	 * @see red.LineaBus#nonDuplicateCodigoBus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLineaBus__NonDuplicateCodigoBus__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link red.Parada <em>Parada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parada</em>'.
	 * @see red.Parada
	 * @generated
	 */
	EClass getParada();

	/**
	 * Returns the meta object for the attribute '{@link red.Parada#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see red.Parada#getNombre()
	 * @see #getParada()
	 * @generated
	 */
	EAttribute getParada_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link red.Parada#isAccesible <em>Accesible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accesible</em>'.
	 * @see red.Parada#isAccesible()
	 * @see #getParada()
	 * @generated
	 */
	EAttribute getParada_Accesible();

	/**
	 * Returns the meta object for the attribute '{@link red.Parada#isBicicletas <em>Bicicletas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bicicletas</em>'.
	 * @see red.Parada#isBicicletas()
	 * @see #getParada()
	 * @generated
	 */
	EAttribute getParada_Bicicletas();

	/**
	 * Returns the meta object for the attribute '{@link red.Parada#isAparcamientoGrat <em>Aparcamiento Grat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aparcamiento Grat</em>'.
	 * @see red.Parada#isAparcamientoGrat()
	 * @see #getParada()
	 * @generated
	 */
	EAttribute getParada_AparcamientoGrat();

	/**
	 * Returns the meta object for the attribute '{@link red.Parada#isAseos <em>Aseos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aseos</em>'.
	 * @see red.Parada#isAseos()
	 * @see #getParada()
	 * @generated
	 */
	EAttribute getParada_Aseos();

	/**
	 * Returns the meta object for the attribute '{@link red.Parada#getTransbordo <em>Transbordo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transbordo</em>'.
	 * @see red.Parada#getTransbordo()
	 * @see #getParada()
	 * @generated
	 */
	EAttribute getParada_Transbordo();

	/**
	 * Returns the meta object for the '{@link red.Parada#nonDuplicateNombreParada(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Nombre Parada</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Duplicate Nombre Parada</em>' operation.
	 * @see red.Parada#nonDuplicateNombreParada(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getParada__NonDuplicateNombreParada__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link red.Descuento <em>Descuento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descuento</em>'.
	 * @see red.Descuento
	 * @generated
	 */
	EClass getDescuento();

	/**
	 * Returns the meta object for the attribute '{@link red.Descuento#getHoraApertura <em>Hora Apertura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora Apertura</em>'.
	 * @see red.Descuento#getHoraApertura()
	 * @see #getDescuento()
	 * @generated
	 */
	EAttribute getDescuento_HoraApertura();

	/**
	 * Returns the meta object for the attribute '{@link red.Descuento#getHoraCierre <em>Hora Cierre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora Cierre</em>'.
	 * @see red.Descuento#getHoraCierre()
	 * @see #getDescuento()
	 * @generated
	 */
	EAttribute getDescuento_HoraCierre();

	/**
	 * Returns the meta object for the attribute '{@link red.Descuento#getDescuento <em>Descuento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descuento</em>'.
	 * @see red.Descuento#getDescuento()
	 * @see #getDescuento()
	 * @generated
	 */
	EAttribute getDescuento_Descuento();

	/**
	 * Returns the meta object for the '{@link red.Descuento#positiveDescuento(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Descuento</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Descuento</em>' operation.
	 * @see red.Descuento#positiveDescuento(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDescuento__PositiveDescuento__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link red.ZonaTarifacion <em>Zona Tarifacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zona Tarifacion</em>'.
	 * @see red.ZonaTarifacion
	 * @generated
	 */
	EClass getZonaTarifacion();

	/**
	 * Returns the meta object for the attribute '{@link red.ZonaTarifacion#getEnumeracion <em>Enumeracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumeracion</em>'.
	 * @see red.ZonaTarifacion#getEnumeracion()
	 * @see #getZonaTarifacion()
	 * @generated
	 */
	EAttribute getZonaTarifacion_Enumeracion();

	/**
	 * Returns the meta object for the attribute '{@link red.ZonaTarifacion#getTarifaBus <em>Tarifa Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tarifa Bus</em>'.
	 * @see red.ZonaTarifacion#getTarifaBus()
	 * @see #getZonaTarifacion()
	 * @generated
	 */
	EAttribute getZonaTarifacion_TarifaBus();

	/**
	 * Returns the meta object for the attribute '{@link red.ZonaTarifacion#getTarifaMetro <em>Tarifa Metro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tarifa Metro</em>'.
	 * @see red.ZonaTarifacion#getTarifaMetro()
	 * @see #getZonaTarifacion()
	 * @generated
	 */
	EAttribute getZonaTarifacion_TarifaMetro();

	/**
	 * Returns the meta object for the attribute '{@link red.ZonaTarifacion#getTarifaTren <em>Tarifa Tren</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tarifa Tren</em>'.
	 * @see red.ZonaTarifacion#getTarifaTren()
	 * @see #getZonaTarifacion()
	 * @generated
	 */
	EAttribute getZonaTarifacion_TarifaTren();

	/**
	 * Returns the meta object for the '{@link red.ZonaTarifacion#positiveTarifaBus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Tarifa Bus</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Tarifa Bus</em>' operation.
	 * @see red.ZonaTarifacion#positiveTarifaBus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getZonaTarifacion__PositiveTarifaBus__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link red.ZonaTarifacion#positiveTarifaTren(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Tarifa Tren</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Tarifa Tren</em>' operation.
	 * @see red.ZonaTarifacion#positiveTarifaTren(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getZonaTarifacion__PositiveTarifaTren__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link red.ZonaTarifacion#positiveTarifaMetro(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Tarifa Metro</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Tarifa Metro</em>' operation.
	 * @see red.ZonaTarifacion#positiveTarifaMetro(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getZonaTarifacion__PositiveTarifaMetro__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link red.Colores <em>Colores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colores</em>'.
	 * @see red.Colores
	 * @generated
	 */
	EEnum getColores();

	/**
	 * Returns the meta object for enum '{@link red.Transbordos <em>Transbordos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transbordos</em>'.
	 * @see red.Transbordos
	 * @generated
	 */
	EEnum getTransbordos();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RedFactory getRedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link red.impl.RedTransporteImpl <em>Transporte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.RedTransporteImpl
		 * @see red.impl.RedPackageImpl#getRedTransporte()
		 * @generated
		 */
		EClass RED_TRANSPORTE = eINSTANCE.getRedTransporte();

		/**
		 * The meta object literal for the '<em><b>Lineas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RED_TRANSPORTE__LINEAS = eINSTANCE.getRedTransporte_Lineas();

		/**
		 * The meta object literal for the '<em><b>Paradas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RED_TRANSPORTE__PARADAS = eINSTANCE.getRedTransporte_Paradas();

		/**
		 * The meta object literal for the '<em><b>Zonas Tarifacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RED_TRANSPORTE__ZONAS_TARIFACION = eINSTANCE.getRedTransporte_ZonasTarifacion();

		/**
		 * The meta object literal for the '{@link red.impl.LineaImpl <em>Linea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.LineaImpl
		 * @see red.impl.RedPackageImpl#getLinea()
		 * @generated
		 */
		EClass LINEA = eINSTANCE.getLinea();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA__CODIGO = eINSTANCE.getLinea_Codigo();

		/**
		 * The meta object literal for the '<em><b>Descuentos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEA__DESCUENTOS = eINSTANCE.getLinea_Descuentos();

		/**
		 * The meta object literal for the '<em><b>Hora Apertura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA__HORA_APERTURA = eINSTANCE.getLinea_HoraApertura();

		/**
		 * The meta object literal for the '<em><b>Hora Cierre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA__HORA_CIERRE = eINSTANCE.getLinea_HoraCierre();

		/**
		 * The meta object literal for the '<em><b>Siguiente Parada Tiempo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA__SIGUIENTE_PARADA_TIEMPO = eINSTANCE.getLinea_SiguienteParadaTiempo();

		/**
		 * The meta object literal for the '<em><b>Siguiente Parada Distancia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA__SIGUIENTE_PARADA_DISTANCIA = eINSTANCE.getLinea_SiguienteParadaDistancia();

		/**
		 * The meta object literal for the '<em><b>Paradas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEA__PARADAS = eINSTANCE.getLinea_Paradas();

		/**
		 * The meta object literal for the '{@link red.impl.LineaMetroImpl <em>Linea Metro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.LineaMetroImpl
		 * @see red.impl.RedPackageImpl#getLineaMetro()
		 * @generated
		 */
		EClass LINEA_METRO = eINSTANCE.getLineaMetro();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA_METRO__COLOR = eINSTANCE.getLineaMetro_Color();

		/**
		 * The meta object literal for the '<em><b>Non Duplicate Colores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINEA_METRO___NON_DUPLICATE_COLORES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLineaMetro__NonDuplicateColores__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Non Duplicate Codigo Metro</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINEA_METRO___NON_DUPLICATE_CODIGO_METRO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLineaMetro__NonDuplicateCodigoMetro__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link red.impl.LineaTrenImpl <em>Linea Tren</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.LineaTrenImpl
		 * @see red.impl.RedPackageImpl#getLineaTren()
		 * @generated
		 */
		EClass LINEA_TREN = eINSTANCE.getLineaTren();

		/**
		 * The meta object literal for the '<em><b>Diurna</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA_TREN__DIURNA = eINSTANCE.getLineaTren_Diurna();

		/**
		 * The meta object literal for the '<em><b>Nocturna</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA_TREN__NOCTURNA = eINSTANCE.getLineaTren_Nocturna();

		/**
		 * The meta object literal for the '<em><b>Non Duplicate Codigo Tren</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINEA_TREN___NON_DUPLICATE_CODIGO_TREN__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLineaTren__NonDuplicateCodigoTren__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link red.impl.LineaBusImpl <em>Linea Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.LineaBusImpl
		 * @see red.impl.RedPackageImpl#getLineaBus()
		 * @generated
		 */
		EClass LINEA_BUS = eINSTANCE.getLineaBus();

		/**
		 * The meta object literal for the '<em><b>Non Duplicate Codigo Bus</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINEA_BUS___NON_DUPLICATE_CODIGO_BUS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLineaBus__NonDuplicateCodigoBus__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link red.impl.ParadaImpl <em>Parada</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.ParadaImpl
		 * @see red.impl.RedPackageImpl#getParada()
		 * @generated
		 */
		EClass PARADA = eINSTANCE.getParada();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARADA__NOMBRE = eINSTANCE.getParada_Nombre();

		/**
		 * The meta object literal for the '<em><b>Accesible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARADA__ACCESIBLE = eINSTANCE.getParada_Accesible();

		/**
		 * The meta object literal for the '<em><b>Bicicletas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARADA__BICICLETAS = eINSTANCE.getParada_Bicicletas();

		/**
		 * The meta object literal for the '<em><b>Aparcamiento Grat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARADA__APARCAMIENTO_GRAT = eINSTANCE.getParada_AparcamientoGrat();

		/**
		 * The meta object literal for the '<em><b>Aseos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARADA__ASEOS = eINSTANCE.getParada_Aseos();

		/**
		 * The meta object literal for the '<em><b>Transbordo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARADA__TRANSBORDO = eINSTANCE.getParada_Transbordo();

		/**
		 * The meta object literal for the '<em><b>Non Duplicate Nombre Parada</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARADA___NON_DUPLICATE_NOMBRE_PARADA__DIAGNOSTICCHAIN_MAP = eINSTANCE.getParada__NonDuplicateNombreParada__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link red.impl.DescuentoImpl <em>Descuento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.DescuentoImpl
		 * @see red.impl.RedPackageImpl#getDescuento()
		 * @generated
		 */
		EClass DESCUENTO = eINSTANCE.getDescuento();

		/**
		 * The meta object literal for the '<em><b>Hora Apertura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCUENTO__HORA_APERTURA = eINSTANCE.getDescuento_HoraApertura();

		/**
		 * The meta object literal for the '<em><b>Hora Cierre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCUENTO__HORA_CIERRE = eINSTANCE.getDescuento_HoraCierre();

		/**
		 * The meta object literal for the '<em><b>Descuento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCUENTO__DESCUENTO = eINSTANCE.getDescuento_Descuento();

		/**
		 * The meta object literal for the '<em><b>Positive Descuento</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DESCUENTO___POSITIVE_DESCUENTO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDescuento__PositiveDescuento__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link red.impl.ZonaTarifacionImpl <em>Zona Tarifacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.ZonaTarifacionImpl
		 * @see red.impl.RedPackageImpl#getZonaTarifacion()
		 * @generated
		 */
		EClass ZONA_TARIFACION = eINSTANCE.getZonaTarifacion();

		/**
		 * The meta object literal for the '<em><b>Enumeracion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONA_TARIFACION__ENUMERACION = eINSTANCE.getZonaTarifacion_Enumeracion();

		/**
		 * The meta object literal for the '<em><b>Tarifa Bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONA_TARIFACION__TARIFA_BUS = eINSTANCE.getZonaTarifacion_TarifaBus();

		/**
		 * The meta object literal for the '<em><b>Tarifa Metro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONA_TARIFACION__TARIFA_METRO = eINSTANCE.getZonaTarifacion_TarifaMetro();

		/**
		 * The meta object literal for the '<em><b>Tarifa Tren</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONA_TARIFACION__TARIFA_TREN = eINSTANCE.getZonaTarifacion_TarifaTren();

		/**
		 * The meta object literal for the '<em><b>Positive Tarifa Bus</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ZONA_TARIFACION___POSITIVE_TARIFA_BUS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getZonaTarifacion__PositiveTarifaBus__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Positive Tarifa Tren</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ZONA_TARIFACION___POSITIVE_TARIFA_TREN__DIAGNOSTICCHAIN_MAP = eINSTANCE.getZonaTarifacion__PositiveTarifaTren__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Positive Tarifa Metro</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ZONA_TARIFACION___POSITIVE_TARIFA_METRO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getZonaTarifacion__PositiveTarifaMetro__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link red.Colores <em>Colores</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.Colores
		 * @see red.impl.RedPackageImpl#getColores()
		 * @generated
		 */
		EEnum COLORES = eINSTANCE.getColores();

		/**
		 * The meta object literal for the '{@link red.Transbordos <em>Transbordos</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.Transbordos
		 * @see red.impl.RedPackageImpl#getTransbordos()
		 * @generated
		 */
		EEnum TRANSBORDOS = eINSTANCE.getTransbordos();

	}

} //RedPackage
