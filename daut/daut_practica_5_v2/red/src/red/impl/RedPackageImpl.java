/**
 */
package red.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import red.Colores;
import red.Descuento;
import red.Linea;
import red.LineaBus;
import red.LineaMetro;
import red.LineaTren;
import red.Parada;
import red.ParadaBus;
import red.ParadaMetro;
import red.ParadaTren;
import red.RedFactory;
import red.RedPackage;
import red.RedTransporte;
import red.Transbordos;
import red.ZonaTarifacion;
import red.util.RedValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RedPackageImpl extends EPackageImpl implements RedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redTransporteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineaMetroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineaTrenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineaBusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paradaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paradaBusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paradaMetroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paradaTrenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descuentoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zonaTarifacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coloresEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transbordosEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType diagnosticChainEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see red.RedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RedPackageImpl() {
		super(eNS_URI, RedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RedPackage init() {
		if (isInited) return (RedPackage)EPackage.Registry.INSTANCE.getEPackage(RedPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRedPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RedPackageImpl theRedPackage = registeredRedPackage instanceof RedPackageImpl ? (RedPackageImpl)registeredRedPackage : new RedPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRedPackage.createPackageContents();

		// Initialize created meta-data
		theRedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRedPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RedValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RedPackage.eNS_URI, theRedPackage);
		return theRedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedTransporte() {
		return redTransporteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedTransporte_Lineas() {
		return (EReference)redTransporteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedTransporte_Paradas() {
		return (EReference)redTransporteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedTransporte_ZonasTarifacion() {
		return (EReference)redTransporteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedTransporte__RestriccionTarifasZona__DiagnosticChain_Map() {
		return redTransporteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedTransporte__LineasParadasConsecutivasIguales__DiagnosticChain_Map() {
		return redTransporteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinea() {
		return lineaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinea_Codigo() {
		return (EAttribute)lineaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinea_Descuentos() {
		return (EReference)lineaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinea_HoraApertura() {
		return (EAttribute)lineaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinea_HoraCierre() {
		return (EAttribute)lineaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinea_SiguienteParadaTiempo() {
		return (EAttribute)lineaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinea_SiguienteParadaDistancia() {
		return (EAttribute)lineaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinea_Circular() {
		return (EAttribute)lineaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinea_ParadaIni() {
		return (EReference)lineaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinea_ParadaFin() {
		return (EReference)lineaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinea_Paradas() {
		return (EReference)lineaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinea__HorarioCorrecto__DiagnosticChain_Map() {
		return lineaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinea__ZonaTarificacionParadasConsecutivas__DiagnosticChain_Map() {
		return lineaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinea__NonDescuentosSolapados__DiagnosticChain_Map() {
		return lineaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinea__LineaCircular__DiagnosticChain_Map() {
		return lineaEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineaMetro() {
		return lineaMetroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineaMetro_Color() {
		return (EAttribute)lineaMetroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaMetro__ParadasIniFin__DiagnosticChain_Map() {
		return lineaMetroEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaMetro__NonDuplicateColores__DiagnosticChain_Map() {
		return lineaMetroEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaMetro__NonDuplicateCodigoMetro__DiagnosticChain_Map() {
		return lineaMetroEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaMetro__ParadasCorrectas__DiagnosticChain_Map() {
		return lineaMetroEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineaTren() {
		return lineaTrenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaTren__ParadasIniFin__DiagnosticChain_Map() {
		return lineaTrenEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaTren__ParadasCorrectas__DiagnosticChain_Map() {
		return lineaTrenEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaTren__NonDuplicateCodigoTren__DiagnosticChain_Map() {
		return lineaTrenEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineaBus() {
		return lineaBusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineaBus_IsDiurna() {
		return (EAttribute)lineaBusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaBus__ParadasIniFin__DiagnosticChain_Map() {
		return lineaBusEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaBus__NonDuplicateCodigoBus__DiagnosticChain_Map() {
		return lineaBusEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaBus__LineaDiurna__DiagnosticChain_Map() {
		return lineaBusEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaBus__ParadasCorrectas__DiagnosticChain_Map() {
		return lineaBusEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParada() {
		return paradaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParada_Nombre() {
		return (EAttribute)paradaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParada_Accesible() {
		return (EAttribute)paradaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParada_Bicicletas() {
		return (EAttribute)paradaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParada_AparcamientoGrat() {
		return (EAttribute)paradaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParada_Transbordo() {
		return (EAttribute)paradaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParada_Zonatarificacion() {
		return (EReference)paradaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParadaBus() {
		return paradaBusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParadaBus__NonDuplicateNombreParada__DiagnosticChain_Map() {
		return paradaBusEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParadaMetro() {
		return paradaMetroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParadaMetro_Aseos() {
		return (EAttribute)paradaMetroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParadaMetro__NonDuplicateNombreParada__DiagnosticChain_Map() {
		return paradaMetroEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParadaTren() {
		return paradaTrenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParadaTren_Aseos() {
		return (EAttribute)paradaTrenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParadaTren__NonDuplicateNombreParada__DiagnosticChain_Map() {
		return paradaTrenEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescuento() {
		return descuentoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescuento_HoraIni() {
		return (EAttribute)descuentoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescuento_HoraFin() {
		return (EAttribute)descuentoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescuento_Descuento() {
		return (EAttribute)descuentoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescuento_Linea() {
		return (EReference)descuentoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescuento__DescuentoCorrecto__DiagnosticChain_Map() {
		return descuentoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescuento__HorarioCorrecto__DiagnosticChain_Map() {
		return descuentoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZonaTarifacion() {
		return zonaTarifacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZonaTarifacion_Enumeracion() {
		return (EAttribute)zonaTarifacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZonaTarifacion_TarifaBus() {
		return (EAttribute)zonaTarifacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZonaTarifacion_TarifaMetro() {
		return (EAttribute)zonaTarifacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZonaTarifacion_TarifaTren() {
		return (EAttribute)zonaTarifacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZonaTarifacion__PositiveTarifaTren__DiagnosticChain_Map() {
		return zonaTarifacionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZonaTarifacion__PositiveTarifaMetro__DiagnosticChain_Map() {
		return zonaTarifacionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZonaTarifacion__NonDuplicateNum__DiagnosticChain_Map() {
		return zonaTarifacionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZonaTarifacion__PositiveTarifaBus__DiagnosticChain_Map() {
		return zonaTarifacionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColores() {
		return coloresEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransbordos() {
		return transbordosEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDiagnosticChain() {
		return diagnosticChainEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedFactory getRedFactory() {
		return (RedFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		redTransporteEClass = createEClass(RED_TRANSPORTE);
		createEReference(redTransporteEClass, RED_TRANSPORTE__LINEAS);
		createEReference(redTransporteEClass, RED_TRANSPORTE__PARADAS);
		createEReference(redTransporteEClass, RED_TRANSPORTE__ZONAS_TARIFACION);
		createEOperation(redTransporteEClass, RED_TRANSPORTE___RESTRICCION_TARIFAS_ZONA__DIAGNOSTICCHAIN_MAP);
		createEOperation(redTransporteEClass, RED_TRANSPORTE___LINEAS_PARADAS_CONSECUTIVAS_IGUALES__DIAGNOSTICCHAIN_MAP);

		lineaEClass = createEClass(LINEA);
		createEAttribute(lineaEClass, LINEA__CODIGO);
		createEReference(lineaEClass, LINEA__DESCUENTOS);
		createEAttribute(lineaEClass, LINEA__HORA_APERTURA);
		createEAttribute(lineaEClass, LINEA__HORA_CIERRE);
		createEAttribute(lineaEClass, LINEA__SIGUIENTE_PARADA_TIEMPO);
		createEAttribute(lineaEClass, LINEA__SIGUIENTE_PARADA_DISTANCIA);
		createEAttribute(lineaEClass, LINEA__CIRCULAR);
		createEReference(lineaEClass, LINEA__PARADA_INI);
		createEReference(lineaEClass, LINEA__PARADA_FIN);
		createEReference(lineaEClass, LINEA__PARADAS);
		createEOperation(lineaEClass, LINEA___HORARIO_CORRECTO__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaEClass, LINEA___ZONA_TARIFICACION_PARADAS_CONSECUTIVAS__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaEClass, LINEA___NON_DESCUENTOS_SOLAPADOS__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaEClass, LINEA___LINEA_CIRCULAR__DIAGNOSTICCHAIN_MAP);

		lineaMetroEClass = createEClass(LINEA_METRO);
		createEAttribute(lineaMetroEClass, LINEA_METRO__COLOR);
		createEOperation(lineaMetroEClass, LINEA_METRO___PARADAS_INI_FIN__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaMetroEClass, LINEA_METRO___NON_DUPLICATE_COLORES__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaMetroEClass, LINEA_METRO___NON_DUPLICATE_CODIGO_METRO__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaMetroEClass, LINEA_METRO___PARADAS_CORRECTAS__DIAGNOSTICCHAIN_MAP);

		lineaTrenEClass = createEClass(LINEA_TREN);
		createEOperation(lineaTrenEClass, LINEA_TREN___PARADAS_INI_FIN__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaTrenEClass, LINEA_TREN___PARADAS_CORRECTAS__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaTrenEClass, LINEA_TREN___NON_DUPLICATE_CODIGO_TREN__DIAGNOSTICCHAIN_MAP);

		lineaBusEClass = createEClass(LINEA_BUS);
		createEAttribute(lineaBusEClass, LINEA_BUS__IS_DIURNA);
		createEOperation(lineaBusEClass, LINEA_BUS___PARADAS_INI_FIN__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaBusEClass, LINEA_BUS___NON_DUPLICATE_CODIGO_BUS__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaBusEClass, LINEA_BUS___LINEA_DIURNA__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaBusEClass, LINEA_BUS___PARADAS_CORRECTAS__DIAGNOSTICCHAIN_MAP);

		paradaEClass = createEClass(PARADA);
		createEAttribute(paradaEClass, PARADA__NOMBRE);
		createEAttribute(paradaEClass, PARADA__ACCESIBLE);
		createEAttribute(paradaEClass, PARADA__BICICLETAS);
		createEAttribute(paradaEClass, PARADA__APARCAMIENTO_GRAT);
		createEAttribute(paradaEClass, PARADA__TRANSBORDO);
		createEReference(paradaEClass, PARADA__ZONATARIFICACION);

		paradaBusEClass = createEClass(PARADA_BUS);
		createEOperation(paradaBusEClass, PARADA_BUS___NON_DUPLICATE_NOMBRE_PARADA__DIAGNOSTICCHAIN_MAP);

		paradaMetroEClass = createEClass(PARADA_METRO);
		createEAttribute(paradaMetroEClass, PARADA_METRO__ASEOS);
		createEOperation(paradaMetroEClass, PARADA_METRO___NON_DUPLICATE_NOMBRE_PARADA__DIAGNOSTICCHAIN_MAP);

		paradaTrenEClass = createEClass(PARADA_TREN);
		createEAttribute(paradaTrenEClass, PARADA_TREN__ASEOS);
		createEOperation(paradaTrenEClass, PARADA_TREN___NON_DUPLICATE_NOMBRE_PARADA__DIAGNOSTICCHAIN_MAP);

		descuentoEClass = createEClass(DESCUENTO);
		createEAttribute(descuentoEClass, DESCUENTO__HORA_INI);
		createEAttribute(descuentoEClass, DESCUENTO__HORA_FIN);
		createEAttribute(descuentoEClass, DESCUENTO__DESCUENTO);
		createEReference(descuentoEClass, DESCUENTO__LINEA);
		createEOperation(descuentoEClass, DESCUENTO___DESCUENTO_CORRECTO__DIAGNOSTICCHAIN_MAP);
		createEOperation(descuentoEClass, DESCUENTO___HORARIO_CORRECTO__DIAGNOSTICCHAIN_MAP);

		zonaTarifacionEClass = createEClass(ZONA_TARIFACION);
		createEAttribute(zonaTarifacionEClass, ZONA_TARIFACION__ENUMERACION);
		createEAttribute(zonaTarifacionEClass, ZONA_TARIFACION__TARIFA_BUS);
		createEAttribute(zonaTarifacionEClass, ZONA_TARIFACION__TARIFA_METRO);
		createEAttribute(zonaTarifacionEClass, ZONA_TARIFACION__TARIFA_TREN);
		createEOperation(zonaTarifacionEClass, ZONA_TARIFACION___POSITIVE_TARIFA_TREN__DIAGNOSTICCHAIN_MAP);
		createEOperation(zonaTarifacionEClass, ZONA_TARIFACION___POSITIVE_TARIFA_METRO__DIAGNOSTICCHAIN_MAP);
		createEOperation(zonaTarifacionEClass, ZONA_TARIFACION___NON_DUPLICATE_NUM__DIAGNOSTICCHAIN_MAP);
		createEOperation(zonaTarifacionEClass, ZONA_TARIFACION___POSITIVE_TARIFA_BUS__DIAGNOSTICCHAIN_MAP);

		// Create enums
		coloresEEnum = createEEnum(COLORES);
		transbordosEEnum = createEEnum(TRANSBORDOS);

		// Create data types
		diagnosticChainEDataType = createEDataType(DIAGNOSTIC_CHAIN);
		mapEDataType = createEDataType(MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(mapEDataType, "T");
		addETypeParameter(mapEDataType, "T1");

		// Set bounds for type parameters

		// Add supertypes to classes
		lineaMetroEClass.getESuperTypes().add(this.getLinea());
		lineaTrenEClass.getESuperTypes().add(this.getLinea());
		lineaBusEClass.getESuperTypes().add(this.getLinea());
		paradaBusEClass.getESuperTypes().add(this.getParada());
		paradaMetroEClass.getESuperTypes().add(this.getParada());
		paradaTrenEClass.getESuperTypes().add(this.getParada());

		// Initialize classes, features, and operations; add parameters
		initEClass(redTransporteEClass, RedTransporte.class, "RedTransporte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRedTransporte_Lineas(), this.getLinea(), null, "lineas", null, 1, -1, RedTransporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedTransporte_Paradas(), this.getParada(), null, "paradas", null, 2, -1, RedTransporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedTransporte_ZonasTarifacion(), this.getZonaTarifacion(), null, "zonasTarifacion", null, 1, -1, RedTransporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getRedTransporte__RestriccionTarifasZona__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "restriccionTarifasZona", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRedTransporte__LineasParadasConsecutivasIguales__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "lineasParadasConsecutivasIguales", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lineaEClass, Linea.class, "Linea", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinea_Codigo(), ecorePackage.getEString(), "codigo", null, 1, 1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinea_Descuentos(), this.getDescuento(), this.getDescuento_Linea(), "descuentos", null, 0, -1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLinea_HoraApertura(), ecorePackage.getEInt(), "horaApertura", null, 1, 1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinea_HoraCierre(), ecorePackage.getEInt(), "horaCierre", null, 1, 1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinea_SiguienteParadaTiempo(), ecorePackage.getEDouble(), "siguienteParadaTiempo", null, 1, -1, Linea.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinea_SiguienteParadaDistancia(), ecorePackage.getEDouble(), "siguienteParadaDistancia", null, 1, -1, Linea.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinea_Circular(), ecorePackage.getEBoolean(), "circular", null, 1, 1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinea_ParadaIni(), this.getParada(), null, "paradaIni", null, 1, 1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinea_ParadaFin(), this.getParada(), null, "paradaFin", null, 1, 1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinea_Paradas(), this.getParada(), null, "paradas", null, 2, -1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLinea__HorarioCorrecto__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "horarioCorrecto", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLinea__ZonaTarificacionParadasConsecutivas__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "zonaTarificacionParadasConsecutivas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLinea__NonDescuentosSolapados__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDescuentosSolapados", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLinea__LineaCircular__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "lineaCircular", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lineaMetroEClass, LineaMetro.class, "LineaMetro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineaMetro_Color(), this.getColores(), "color", null, 0, 1, LineaMetro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLineaMetro__ParadasIniFin__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "paradasIniFin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLineaMetro__NonDuplicateColores__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateColores", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLineaMetro__NonDuplicateCodigoMetro__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateCodigoMetro", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLineaMetro__ParadasCorrectas__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "paradasCorrectas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lineaTrenEClass, LineaTren.class, "LineaTren", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLineaTren__ParadasIniFin__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "paradasIniFin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLineaTren__ParadasCorrectas__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "paradasCorrectas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLineaTren__NonDuplicateCodigoTren__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateCodigoTren", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lineaBusEClass, LineaBus.class, "LineaBus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineaBus_IsDiurna(), ecorePackage.getEBoolean(), "isDiurna", null, 1, 1, LineaBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLineaBus__ParadasIniFin__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "paradasIniFin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLineaBus__NonDuplicateCodigoBus__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateCodigoBus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLineaBus__LineaDiurna__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "lineaDiurna", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLineaBus__ParadasCorrectas__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "paradasCorrectas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paradaEClass, Parada.class, "Parada", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParada_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_Accesible(), ecorePackage.getEBoolean(), "accesible", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_Bicicletas(), ecorePackage.getEBoolean(), "bicicletas", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_AparcamientoGrat(), ecorePackage.getEBoolean(), "aparcamientoGrat", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_Transbordo(), this.getTransbordos(), "transbordo", null, 0, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParada_Zonatarificacion(), this.getZonaTarifacion(), null, "zonatarificacion", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paradaBusEClass, ParadaBus.class, "ParadaBus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getParadaBus__NonDuplicateNombreParada__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateNombreParada", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paradaMetroEClass, ParadaMetro.class, "ParadaMetro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParadaMetro_Aseos(), ecorePackage.getEBoolean(), "aseos", null, 1, 1, ParadaMetro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getParadaMetro__NonDuplicateNombreParada__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateNombreParada", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paradaTrenEClass, ParadaTren.class, "ParadaTren", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParadaTren_Aseos(), ecorePackage.getEBoolean(), "aseos", null, 1, 1, ParadaTren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getParadaTren__NonDuplicateNombreParada__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateNombreParada", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(descuentoEClass, Descuento.class, "Descuento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescuento_HoraIni(), ecorePackage.getEInt(), "horaIni", null, 1, 1, Descuento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescuento_HoraFin(), ecorePackage.getEInt(), "horaFin", null, 1, 1, Descuento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescuento_Descuento(), ecorePackage.getEInt(), "descuento", null, 1, 1, Descuento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescuento_Linea(), this.getLinea(), this.getLinea_Descuentos(), "linea", null, 0, 1, Descuento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDescuento__DescuentoCorrecto__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "descuentoCorrecto", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDescuento__HorarioCorrecto__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "horarioCorrecto", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(zonaTarifacionEClass, ZonaTarifacion.class, "ZonaTarifacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZonaTarifacion_Enumeracion(), ecorePackage.getEInt(), "enumeracion", "1", 1, 1, ZonaTarifacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZonaTarifacion_TarifaBus(), ecorePackage.getEDouble(), "tarifaBus", null, 1, 1, ZonaTarifacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZonaTarifacion_TarifaMetro(), ecorePackage.getEDouble(), "tarifaMetro", null, 1, 1, ZonaTarifacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZonaTarifacion_TarifaTren(), ecorePackage.getEDouble(), "tarifaTren", null, 1, 1, ZonaTarifacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getZonaTarifacion__PositiveTarifaTren__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "positiveTarifaTren", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getZonaTarifacion__PositiveTarifaMetro__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "positiveTarifaMetro", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getZonaTarifacion__NonDuplicateNum__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateNum", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getZonaTarifacion__PositiveTarifaBus__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "positiveTarifaBus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(coloresEEnum, Colores.class, "Colores");
		addEEnumLiteral(coloresEEnum, Colores.ROJO);
		addEEnumLiteral(coloresEEnum, Colores.VERDE);
		addEEnumLiteral(coloresEEnum, Colores.AZUL);
		addEEnumLiteral(coloresEEnum, Colores.AMARILLO);
		addEEnumLiteral(coloresEEnum, Colores.NEGRO);
		addEEnumLiteral(coloresEEnum, Colores.BLANCO);
		addEEnumLiteral(coloresEEnum, Colores.MORADO);

		initEEnum(transbordosEEnum, Transbordos.class, "Transbordos");
		addEEnumLiteral(transbordosEEnum, Transbordos.CORTO);
		addEEnumLiteral(transbordosEEnum, Transbordos.LARGO);
		addEEnumLiteral(transbordosEEnum, Transbordos.NO_PERMITIDO);

		// Initialize data types
		initEDataType(diagnosticChainEDataType, DiagnosticChain.class, "DiagnosticChain", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (redTransporteEClass,
		   source,
		   new String[] {
			   "constraints", "lineasParadasConsecutivasIguales"
		   });
		addAnnotation
		  (lineaEClass,
		   source,
		   new String[] {
			   "constraints", "lineaCircular"
		   });
		addAnnotation
		  (lineaMetroEClass,
		   source,
		   new String[] {
			   "constraints", "paradasCorrectas"
		   });
		addAnnotation
		  (lineaTrenEClass,
		   source,
		   new String[] {
			   "constraints", "nonDuplicateCodigoTren"
		   });
		addAnnotation
		  (lineaBusEClass,
		   source,
		   new String[] {
			   "constraints", "paradasCorrectas"
		   });
		addAnnotation
		  (paradaBusEClass,
		   source,
		   new String[] {
			   "constraints", "nonDuplicateNombreParada"
		   });
		addAnnotation
		  (paradaMetroEClass,
		   source,
		   new String[] {
			   "constraints", "nonDuplicateNombreParada"
		   });
		addAnnotation
		  (paradaTrenEClass,
		   source,
		   new String[] {
			   "constraints", "nonDuplicateNombreParada"
		   });
		addAnnotation
		  (descuentoEClass,
		   source,
		   new String[] {
			   "constraints", "horarioCorrecto"
		   });
		addAnnotation
		  (zonaTarifacionEClass,
		   source,
		   new String[] {
			   "constraints", "positiveTarifaBus"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getRedTransporte__RestriccionTarifasZona__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\tzonasTarifacion->forAll(zona1|\n\t\t\tzonasTarifacion->forAll(zona2|\n\t\t\t\t(zona1.enumeracion < zona2.enumeracion) implies (\n\t\t\t\t\t(zona2.tarifaBus > zona1.tarifaBus) and (zona2.tarifaMetro > zona1.tarifaMetro) and (zona2.tarifaTren > zona1.tarifaTren)\n\t\t\t\t)\n\t\t\t)\n\t\t)"
		   });
		addAnnotation
		  (getRedTransporte__LineasParadasConsecutivasIguales__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tlineas->forAll(linea1, linea2 | \n\t\t\t\tlinea1.paradas->forAll(par1|\n\t\t\t\t\tlinea2.paradas->forAll(par2|\n\t\t\t\t\t\t(par1 = par2) \n\t\t\t\t\t\timplies (\n\t\t\t\t\t\t\tlinea2.paradas->forAll(par3|\n\t\t\t\t\t\t\t\tlinea1.paradas->forAll(par4|\n\t\t\t\t\t\t\t\t\t((par3 = par4) \n\t\t\t\t\t\t\t\t\t\tand (linea1.paradas->indexOf(par4) = 1 + linea1.paradas->indexOf(par1)) \n\t\t\t\t\t\t\t\t\t\tand (linea2.paradas->indexOf(par2) = 1 + linea2.paradas->indexOf(par3))\n\t\t\t\t\t\t\t\t\t) \n\t\t\t\t\t\t\t\t\timplies(\n\t\t\t\t\t\t\t\t\t\tlinea1.siguienteParadaDistancia->forAll(dis1|\n\t\t\t\t\t\t\t\t\t\t\t(linea1.siguienteParadaDistancia->indexOf(dis1) = linea1.paradas->indexOf(par1)) \n\t\t\t\t\t\t\t\t\t\t\timplies(\n\t\t\t\t\t\t\t\t\t\t\t\tlinea2.siguienteParadaDistancia->forAll(dis2|\n\t\t\t\t\t\t\t\t\t\t\t\t\t(linea2.siguienteParadaDistancia->indexOf(dis2) = linea2.paradas->indexOf(par2)) \n\t\t\t\t\t\t\t\t\t\t\t\t\timplies(\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tdis1 = dis2\n\t\t\t\t\t\t\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\t)\n\t\t\t\t\t)\n\t\t\t\t)\n\t\t\t)"
		   });
		addAnnotation
		  (getLinea__HorarioCorrecto__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t(horaApertura >= 0 and horaApertura <= 23) and \n\t\t\t(horaCierre >= 0 and horaCierre <= 23) and\n\t\t\t(horaApertura <> horaCierre) and (horaCierre > horaApertura)"
		   });
		addAnnotation
		  (getLinea__ZonaTarificacionParadasConsecutivas__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\tparadas->forAll(parada1|\n\t\t\tparadas->forAll(parada2|\n\t\t\t\t(paradas->indexOf(parada1) = 1 + paradas->indexOf(parada2)) implies (\n\t\t\t\t\t(parada1.zonatarificacion.enumeracion = parada2.zonatarificacion.enumeracion) or (parada1.zonatarificacion.enumeracion = parada2.zonatarificacion.enumeracion + 1) \n\t\t\t\t)\n\t\t\t)\n\t\t)"
		   });
		addAnnotation
		  (getLinea__NonDescuentosSolapados__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tdescuentos->forAll(d1,d2 |\n\t\t\t\tif ((d1.horaIni < d2.horaFin and d1.horaIni > d2.horaIni) or (d1.horaFin < d2.horaFin and d1.horaFin > d2.horaIni)) then false\n\t\t\t\telse true endif\n\t\t\t)"
		   });
		addAnnotation
		  (getLinea__LineaCircular__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tif circular = true then\n\t\t\t\tparadaFin = paradaIni \n\t\t\telse \n\t\t\t\tparadaFin <> paradaIni \n\t\t\tendif"
		   });
		addAnnotation
		  (getLineaMetro__ParadasIniFin__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tparadaIni.oclIsTypeOf(ParadaMetro) and paradaFin.oclIsTypeOf(ParadaMetro)"
		   });
		addAnnotation
		  (getLineaMetro__NonDuplicateColores__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tLineaMetro.allInstances()->isUnique(color)"
		   });
		addAnnotation
		  (getLineaMetro__NonDuplicateCodigoMetro__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tLineaMetro.allInstances()->isUnique(codigo)"
		   });
		addAnnotation
		  (getLineaMetro__ParadasCorrectas__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tparadas->forAll(p | p.oclIsTypeOf(ParadaMetro))"
		   });
		addAnnotation
		  (getLineaTren__ParadasIniFin__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tparadaIni.oclIsTypeOf(ParadaTren) and paradaFin.oclIsTypeOf(ParadaTren)"
		   });
		addAnnotation
		  (getLineaTren__ParadasCorrectas__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tparadas->forAll(p | p.oclIsTypeOf(ParadaTren))"
		   });
		addAnnotation
		  (getLineaTren__NonDuplicateCodigoTren__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tLineaTren.allInstances()->isUnique(codigo)"
		   });
		addAnnotation
		  (getLineaBus__ParadasIniFin__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tparadaIni.oclIsTypeOf(ParadaBus) and paradaFin.oclIsTypeOf(ParadaBus)"
		   });
		addAnnotation
		  (getLineaBus__NonDuplicateCodigoBus__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tLineaBus.allInstances()->isUnique(codigo)"
		   });
		addAnnotation
		  (getLineaBus__LineaDiurna__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tif isDiurna = true then\n\t\t\t\t(horaApertura >= 6 and horaCierre <= 23) and (horaCierre > horaApertura)\n\t\t\telse \n\t\t\t\t(horaApertura >= 0 and horaCierre <=5) and (horaCierre > horaApertura)\n\t\t\tendif"
		   });
		addAnnotation
		  (getLineaBus__ParadasCorrectas__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tparadas->forAll(p | p.oclIsTypeOf(ParadaBus))"
		   });
		addAnnotation
		  (getParadaBus__NonDuplicateNombreParada__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tParadaBus.allInstances()->isUnique(nombre)"
		   });
		addAnnotation
		  (getParadaMetro__NonDuplicateNombreParada__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tParadaMetro.allInstances()->isUnique(nombre)"
		   });
		addAnnotation
		  (getParadaTren__NonDuplicateNombreParada__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tParadaTren.allInstances()->isUnique(nombre)"
		   });
		addAnnotation
		  (getDescuento__DescuentoCorrecto__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tdescuento > 0 and descuento <= 100"
		   });
		addAnnotation
		  (getDescuento__HorarioCorrecto__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t(horaIni >= 0 and horaIni <= 23) and \n\t\t\t(horaFin >= 0 and horaFin <= 23) and\n\t\t\t(horaIni <> horaFin) and (horaFin > horaIni) and\n\t\t\t(horaIni >= linea.horaApertura and horaFin <= linea.horaCierre)"
		   });
		addAnnotation
		  (getZonaTarifacion__PositiveTarifaTren__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "tarifaTren > 0"
		   });
		addAnnotation
		  (getZonaTarifacion__PositiveTarifaMetro__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "tarifaMetro > 0"
		   });
		addAnnotation
		  (getZonaTarifacion__NonDuplicateNum__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tZonaTarifacion.allInstances()->isUnique(enumeracion)"
		   });
		addAnnotation
		  (getZonaTarifacion__PositiveTarifaBus__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "tarifaBus > 0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getRedTransporte_Lineas(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getRedTransporte_Paradas(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getRedTransporte_ZonasTarifacion(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getLinea_Descuentos(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getLinea_Paradas(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //RedPackageImpl
