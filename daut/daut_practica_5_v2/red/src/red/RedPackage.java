/**
 */
package red;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	 * The feature id for the '<em><b>Siguiente Parada Tiempo</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__SIGUIENTE_PARADA_TIEMPO = 4;

	/**
	 * The feature id for the '<em><b>Siguiente Parada Distancia</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__SIGUIENTE_PARADA_DISTANCIA = 5;

	/**
	 * The feature id for the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__CIRCULAR = 6;

	/**
	 * The feature id for the '<em><b>Parada Ini</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__PARADA_INI = 7;

	/**
	 * The feature id for the '<em><b>Parada Fin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__PARADA_FIN = 8;

	/**
	 * The feature id for the '<em><b>Paradas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA__PARADAS = 9;

	/**
	 * The number of structural features of the '<em>Linea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_FEATURE_COUNT = 10;

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
	 * The feature id for the '<em><b>Siguiente Parada Tiempo</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__SIGUIENTE_PARADA_TIEMPO = LINEA__SIGUIENTE_PARADA_TIEMPO;

	/**
	 * The feature id for the '<em><b>Siguiente Parada Distancia</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__SIGUIENTE_PARADA_DISTANCIA = LINEA__SIGUIENTE_PARADA_DISTANCIA;

	/**
	 * The feature id for the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__CIRCULAR = LINEA__CIRCULAR;

	/**
	 * The feature id for the '<em><b>Parada Ini</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__PARADA_INI = LINEA__PARADA_INI;

	/**
	 * The feature id for the '<em><b>Parada Fin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO__PARADA_FIN = LINEA__PARADA_FIN;

	/**
	 * The feature id for the '<em><b>Paradas</b></em>' reference list.
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
	 * The number of operations of the '<em>Linea Metro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_METRO_OPERATION_COUNT = LINEA_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Siguiente Parada Tiempo</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__SIGUIENTE_PARADA_TIEMPO = LINEA__SIGUIENTE_PARADA_TIEMPO;

	/**
	 * The feature id for the '<em><b>Siguiente Parada Distancia</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__SIGUIENTE_PARADA_DISTANCIA = LINEA__SIGUIENTE_PARADA_DISTANCIA;

	/**
	 * The feature id for the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__CIRCULAR = LINEA__CIRCULAR;

	/**
	 * The feature id for the '<em><b>Parada Ini</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__PARADA_INI = LINEA__PARADA_INI;

	/**
	 * The feature id for the '<em><b>Parada Fin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__PARADA_FIN = LINEA__PARADA_FIN;

	/**
	 * The feature id for the '<em><b>Paradas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN__PARADAS = LINEA__PARADAS;

	/**
	 * The number of structural features of the '<em>Linea Tren</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN_FEATURE_COUNT = LINEA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linea Tren</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_TREN_OPERATION_COUNT = LINEA_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Siguiente Parada Tiempo</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__SIGUIENTE_PARADA_TIEMPO = LINEA__SIGUIENTE_PARADA_TIEMPO;

	/**
	 * The feature id for the '<em><b>Siguiente Parada Distancia</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__SIGUIENTE_PARADA_DISTANCIA = LINEA__SIGUIENTE_PARADA_DISTANCIA;

	/**
	 * The feature id for the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__CIRCULAR = LINEA__CIRCULAR;

	/**
	 * The feature id for the '<em><b>Parada Ini</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__PARADA_INI = LINEA__PARADA_INI;

	/**
	 * The feature id for the '<em><b>Parada Fin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__PARADA_FIN = LINEA__PARADA_FIN;

	/**
	 * The feature id for the '<em><b>Paradas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__PARADAS = LINEA__PARADAS;

	/**
	 * The feature id for the '<em><b>Is Diurna</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS__IS_DIURNA = LINEA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linea Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS_FEATURE_COUNT = LINEA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Linea Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_BUS_OPERATION_COUNT = LINEA_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Transbordo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA__TRANSBORDO = 4;

	/**
	 * The feature id for the '<em><b>Zonatarificacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA__ZONATARIFICACION = 5;

	/**
	 * The number of structural features of the '<em>Parada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Parada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link red.impl.ParadaBusImpl <em>Parada Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.ParadaBusImpl
	 * @see red.impl.RedPackageImpl#getParadaBus()
	 * @generated
	 */
	int PARADA_BUS = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_BUS__NOMBRE = PARADA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Accesible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_BUS__ACCESIBLE = PARADA__ACCESIBLE;

	/**
	 * The feature id for the '<em><b>Bicicletas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_BUS__BICICLETAS = PARADA__BICICLETAS;

	/**
	 * The feature id for the '<em><b>Aparcamiento Grat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_BUS__APARCAMIENTO_GRAT = PARADA__APARCAMIENTO_GRAT;

	/**
	 * The feature id for the '<em><b>Transbordo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_BUS__TRANSBORDO = PARADA__TRANSBORDO;

	/**
	 * The feature id for the '<em><b>Zonatarificacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_BUS__ZONATARIFICACION = PARADA__ZONATARIFICACION;

	/**
	 * The number of structural features of the '<em>Parada Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_BUS_FEATURE_COUNT = PARADA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parada Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_BUS_OPERATION_COUNT = PARADA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link red.impl.ParadaMetroImpl <em>Parada Metro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.ParadaMetroImpl
	 * @see red.impl.RedPackageImpl#getParadaMetro()
	 * @generated
	 */
	int PARADA_METRO = 7;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_METRO__NOMBRE = PARADA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Accesible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_METRO__ACCESIBLE = PARADA__ACCESIBLE;

	/**
	 * The feature id for the '<em><b>Bicicletas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_METRO__BICICLETAS = PARADA__BICICLETAS;

	/**
	 * The feature id for the '<em><b>Aparcamiento Grat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_METRO__APARCAMIENTO_GRAT = PARADA__APARCAMIENTO_GRAT;

	/**
	 * The feature id for the '<em><b>Transbordo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_METRO__TRANSBORDO = PARADA__TRANSBORDO;

	/**
	 * The feature id for the '<em><b>Zonatarificacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_METRO__ZONATARIFICACION = PARADA__ZONATARIFICACION;

	/**
	 * The feature id for the '<em><b>Aseos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_METRO__ASEOS = PARADA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parada Metro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_METRO_FEATURE_COUNT = PARADA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parada Metro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_METRO_OPERATION_COUNT = PARADA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link red.impl.ParadaTrenImpl <em>Parada Tren</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.ParadaTrenImpl
	 * @see red.impl.RedPackageImpl#getParadaTren()
	 * @generated
	 */
	int PARADA_TREN = 8;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_TREN__NOMBRE = PARADA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Accesible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_TREN__ACCESIBLE = PARADA__ACCESIBLE;

	/**
	 * The feature id for the '<em><b>Bicicletas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_TREN__BICICLETAS = PARADA__BICICLETAS;

	/**
	 * The feature id for the '<em><b>Aparcamiento Grat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_TREN__APARCAMIENTO_GRAT = PARADA__APARCAMIENTO_GRAT;

	/**
	 * The feature id for the '<em><b>Transbordo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_TREN__TRANSBORDO = PARADA__TRANSBORDO;

	/**
	 * The feature id for the '<em><b>Zonatarificacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_TREN__ZONATARIFICACION = PARADA__ZONATARIFICACION;

	/**
	 * The feature id for the '<em><b>Aseos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_TREN__ASEOS = PARADA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parada Tren</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_TREN_FEATURE_COUNT = PARADA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parada Tren</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARADA_TREN_OPERATION_COUNT = PARADA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link red.impl.DescuentoImpl <em>Descuento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.DescuentoImpl
	 * @see red.impl.RedPackageImpl#getDescuento()
	 * @generated
	 */
	int DESCUENTO = 9;

	/**
	 * The feature id for the '<em><b>Hora Ini</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCUENTO__HORA_INI = 0;

	/**
	 * The feature id for the '<em><b>Hora Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCUENTO__HORA_FIN = 1;

	/**
	 * The feature id for the '<em><b>Descuento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCUENTO__DESCUENTO = 2;

	/**
	 * The feature id for the '<em><b>Linea</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCUENTO__LINEA = 3;

	/**
	 * The number of structural features of the '<em>Descuento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCUENTO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Descuento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCUENTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link red.impl.ZonaTarifacionImpl <em>Zona Tarifacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.ZonaTarifacionImpl
	 * @see red.impl.RedPackageImpl#getZonaTarifacion()
	 * @generated
	 */
	int ZONA_TARIFACION = 10;

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
	 * The number of operations of the '<em>Zona Tarifacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONA_TARIFACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link red.Colores <em>Colores</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.Colores
	 * @see red.impl.RedPackageImpl#getColores()
	 * @generated
	 */
	int COLORES = 11;

	/**
	 * The meta object id for the '{@link red.Transbordos <em>Transbordos</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.Transbordos
	 * @see red.impl.RedPackageImpl#getTransbordos()
	 * @generated
	 */
	int TRANSBORDOS = 12;

	/**
	 * The meta object id for the '<em>Diagnostic Chain</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.DiagnosticChain
	 * @see red.impl.RedPackageImpl#getDiagnosticChain()
	 * @generated
	 */
	int DIAGNOSTIC_CHAIN = 13;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see red.impl.RedPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 14;


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
	 * Returns the meta object for the attribute list '{@link red.Linea#getSiguienteParadaTiempo <em>Siguiente Parada Tiempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Siguiente Parada Tiempo</em>'.
	 * @see red.Linea#getSiguienteParadaTiempo()
	 * @see #getLinea()
	 * @generated
	 */
	EAttribute getLinea_SiguienteParadaTiempo();

	/**
	 * Returns the meta object for the attribute list '{@link red.Linea#getSiguienteParadaDistancia <em>Siguiente Parada Distancia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Siguiente Parada Distancia</em>'.
	 * @see red.Linea#getSiguienteParadaDistancia()
	 * @see #getLinea()
	 * @generated
	 */
	EAttribute getLinea_SiguienteParadaDistancia();

	/**
	 * Returns the meta object for the attribute '{@link red.Linea#isCircular <em>Circular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circular</em>'.
	 * @see red.Linea#isCircular()
	 * @see #getLinea()
	 * @generated
	 */
	EAttribute getLinea_Circular();

	/**
	 * Returns the meta object for the reference '{@link red.Linea#getParadaIni <em>Parada Ini</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parada Ini</em>'.
	 * @see red.Linea#getParadaIni()
	 * @see #getLinea()
	 * @generated
	 */
	EReference getLinea_ParadaIni();

	/**
	 * Returns the meta object for the reference '{@link red.Linea#getParadaFin <em>Parada Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parada Fin</em>'.
	 * @see red.Linea#getParadaFin()
	 * @see #getLinea()
	 * @generated
	 */
	EReference getLinea_ParadaFin();

	/**
	 * Returns the meta object for the reference list '{@link red.Linea#getParadas <em>Paradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paradas</em>'.
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
	 * Returns the meta object for class '{@link red.LineaTren <em>Linea Tren</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linea Tren</em>'.
	 * @see red.LineaTren
	 * @generated
	 */
	EClass getLineaTren();

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
	 * Returns the meta object for the attribute '{@link red.LineaBus#isIsDiurna <em>Is Diurna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Diurna</em>'.
	 * @see red.LineaBus#isIsDiurna()
	 * @see #getLineaBus()
	 * @generated
	 */
	EAttribute getLineaBus_IsDiurna();

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
	 * Returns the meta object for the reference '{@link red.Parada#getZonatarificacion <em>Zonatarificacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zonatarificacion</em>'.
	 * @see red.Parada#getZonatarificacion()
	 * @see #getParada()
	 * @generated
	 */
	EReference getParada_Zonatarificacion();

	/**
	 * Returns the meta object for class '{@link red.ParadaBus <em>Parada Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parada Bus</em>'.
	 * @see red.ParadaBus
	 * @generated
	 */
	EClass getParadaBus();

	/**
	 * Returns the meta object for class '{@link red.ParadaMetro <em>Parada Metro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parada Metro</em>'.
	 * @see red.ParadaMetro
	 * @generated
	 */
	EClass getParadaMetro();

	/**
	 * Returns the meta object for the attribute '{@link red.ParadaMetro#isAseos <em>Aseos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aseos</em>'.
	 * @see red.ParadaMetro#isAseos()
	 * @see #getParadaMetro()
	 * @generated
	 */
	EAttribute getParadaMetro_Aseos();

	/**
	 * Returns the meta object for class '{@link red.ParadaTren <em>Parada Tren</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parada Tren</em>'.
	 * @see red.ParadaTren
	 * @generated
	 */
	EClass getParadaTren();

	/**
	 * Returns the meta object for the attribute '{@link red.ParadaTren#isAseos <em>Aseos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aseos</em>'.
	 * @see red.ParadaTren#isAseos()
	 * @see #getParadaTren()
	 * @generated
	 */
	EAttribute getParadaTren_Aseos();

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
	 * Returns the meta object for the attribute '{@link red.Descuento#getHoraIni <em>Hora Ini</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora Ini</em>'.
	 * @see red.Descuento#getHoraIni()
	 * @see #getDescuento()
	 * @generated
	 */
	EAttribute getDescuento_HoraIni();

	/**
	 * Returns the meta object for the attribute '{@link red.Descuento#getHoraFin <em>Hora Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora Fin</em>'.
	 * @see red.Descuento#getHoraFin()
	 * @see #getDescuento()
	 * @generated
	 */
	EAttribute getDescuento_HoraFin();

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
	 * Returns the meta object for the container reference '{@link red.Descuento#getLinea <em>Linea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Linea</em>'.
	 * @see red.Descuento#getLinea()
	 * @see #getDescuento()
	 * @generated
	 */
	EReference getDescuento_Linea();

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
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.DiagnosticChain <em>Diagnostic Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Diagnostic Chain</em>'.
	 * @see org.eclipse.emf.common.util.DiagnosticChain
	 * @model instanceClass="org.eclipse.emf.common.util.DiagnosticChain"
	 * @generated
	 */
	EDataType getDiagnosticChain();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="T T1"
	 * @generated
	 */
	EDataType getMap();

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
		 * The meta object literal for the '<em><b>Siguiente Parada Tiempo</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA__SIGUIENTE_PARADA_TIEMPO = eINSTANCE.getLinea_SiguienteParadaTiempo();

		/**
		 * The meta object literal for the '<em><b>Siguiente Parada Distancia</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA__SIGUIENTE_PARADA_DISTANCIA = eINSTANCE.getLinea_SiguienteParadaDistancia();

		/**
		 * The meta object literal for the '<em><b>Circular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA__CIRCULAR = eINSTANCE.getLinea_Circular();

		/**
		 * The meta object literal for the '<em><b>Parada Ini</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEA__PARADA_INI = eINSTANCE.getLinea_ParadaIni();

		/**
		 * The meta object literal for the '<em><b>Parada Fin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEA__PARADA_FIN = eINSTANCE.getLinea_ParadaFin();

		/**
		 * The meta object literal for the '<em><b>Paradas</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link red.impl.LineaTrenImpl <em>Linea Tren</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.LineaTrenImpl
		 * @see red.impl.RedPackageImpl#getLineaTren()
		 * @generated
		 */
		EClass LINEA_TREN = eINSTANCE.getLineaTren();

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
		 * The meta object literal for the '<em><b>Is Diurna</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEA_BUS__IS_DIURNA = eINSTANCE.getLineaBus_IsDiurna();

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
		 * The meta object literal for the '<em><b>Transbordo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARADA__TRANSBORDO = eINSTANCE.getParada_Transbordo();

		/**
		 * The meta object literal for the '<em><b>Zonatarificacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARADA__ZONATARIFICACION = eINSTANCE.getParada_Zonatarificacion();

		/**
		 * The meta object literal for the '{@link red.impl.ParadaBusImpl <em>Parada Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.ParadaBusImpl
		 * @see red.impl.RedPackageImpl#getParadaBus()
		 * @generated
		 */
		EClass PARADA_BUS = eINSTANCE.getParadaBus();

		/**
		 * The meta object literal for the '{@link red.impl.ParadaMetroImpl <em>Parada Metro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.ParadaMetroImpl
		 * @see red.impl.RedPackageImpl#getParadaMetro()
		 * @generated
		 */
		EClass PARADA_METRO = eINSTANCE.getParadaMetro();

		/**
		 * The meta object literal for the '<em><b>Aseos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARADA_METRO__ASEOS = eINSTANCE.getParadaMetro_Aseos();

		/**
		 * The meta object literal for the '{@link red.impl.ParadaTrenImpl <em>Parada Tren</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.ParadaTrenImpl
		 * @see red.impl.RedPackageImpl#getParadaTren()
		 * @generated
		 */
		EClass PARADA_TREN = eINSTANCE.getParadaTren();

		/**
		 * The meta object literal for the '<em><b>Aseos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARADA_TREN__ASEOS = eINSTANCE.getParadaTren_Aseos();

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
		 * The meta object literal for the '<em><b>Hora Ini</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCUENTO__HORA_INI = eINSTANCE.getDescuento_HoraIni();

		/**
		 * The meta object literal for the '<em><b>Hora Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCUENTO__HORA_FIN = eINSTANCE.getDescuento_HoraFin();

		/**
		 * The meta object literal for the '<em><b>Descuento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCUENTO__DESCUENTO = eINSTANCE.getDescuento_Descuento();

		/**
		 * The meta object literal for the '<em><b>Linea</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCUENTO__LINEA = eINSTANCE.getDescuento_Linea();

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

		/**
		 * The meta object literal for the '<em>Diagnostic Chain</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.DiagnosticChain
		 * @see red.impl.RedPackageImpl#getDiagnosticChain()
		 * @generated
		 */
		EDataType DIAGNOSTIC_CHAIN = eINSTANCE.getDiagnosticChain();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see red.impl.RedPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

	}

} //RedPackage
