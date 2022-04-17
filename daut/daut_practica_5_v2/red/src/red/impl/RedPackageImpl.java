/**
 */
package red.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	public EClass getLineaTren() {
		return lineaTrenEClass;
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

		lineaMetroEClass = createEClass(LINEA_METRO);
		createEAttribute(lineaMetroEClass, LINEA_METRO__COLOR);

		lineaTrenEClass = createEClass(LINEA_TREN);

		lineaBusEClass = createEClass(LINEA_BUS);
		createEAttribute(lineaBusEClass, LINEA_BUS__IS_DIURNA);

		paradaEClass = createEClass(PARADA);
		createEAttribute(paradaEClass, PARADA__NOMBRE);
		createEAttribute(paradaEClass, PARADA__ACCESIBLE);
		createEAttribute(paradaEClass, PARADA__BICICLETAS);
		createEAttribute(paradaEClass, PARADA__APARCAMIENTO_GRAT);
		createEAttribute(paradaEClass, PARADA__TRANSBORDO);
		createEReference(paradaEClass, PARADA__ZONATARIFICACION);

		paradaBusEClass = createEClass(PARADA_BUS);

		paradaMetroEClass = createEClass(PARADA_METRO);
		createEAttribute(paradaMetroEClass, PARADA_METRO__ASEOS);

		paradaTrenEClass = createEClass(PARADA_TREN);
		createEAttribute(paradaTrenEClass, PARADA_TREN__ASEOS);

		descuentoEClass = createEClass(DESCUENTO);
		createEAttribute(descuentoEClass, DESCUENTO__HORA_INI);
		createEAttribute(descuentoEClass, DESCUENTO__HORA_FIN);
		createEAttribute(descuentoEClass, DESCUENTO__DESCUENTO);
		createEReference(descuentoEClass, DESCUENTO__LINEA);

		zonaTarifacionEClass = createEClass(ZONA_TARIFACION);
		createEAttribute(zonaTarifacionEClass, ZONA_TARIFACION__ENUMERACION);
		createEAttribute(zonaTarifacionEClass, ZONA_TARIFACION__TARIFA_BUS);
		createEAttribute(zonaTarifacionEClass, ZONA_TARIFACION__TARIFA_METRO);
		createEAttribute(zonaTarifacionEClass, ZONA_TARIFACION__TARIFA_TREN);

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

		initEClass(lineaMetroEClass, LineaMetro.class, "LineaMetro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineaMetro_Color(), this.getColores(), "color", null, 0, 1, LineaMetro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineaTrenEClass, LineaTren.class, "LineaTren", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineaBusEClass, LineaBus.class, "LineaBus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineaBus_IsDiurna(), ecorePackage.getEBoolean(), "isDiurna", null, 1, 1, LineaBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paradaEClass, Parada.class, "Parada", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParada_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_Accesible(), ecorePackage.getEBoolean(), "accesible", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_Bicicletas(), ecorePackage.getEBoolean(), "bicicletas", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_AparcamientoGrat(), ecorePackage.getEBoolean(), "aparcamientoGrat", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_Transbordo(), this.getTransbordos(), "transbordo", null, 0, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParada_Zonatarificacion(), this.getZonaTarifacion(), null, "zonatarificacion", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paradaBusEClass, ParadaBus.class, "ParadaBus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paradaMetroEClass, ParadaMetro.class, "ParadaMetro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParadaMetro_Aseos(), ecorePackage.getEBoolean(), "aseos", null, 1, 1, ParadaMetro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paradaTrenEClass, ParadaTren.class, "ParadaTren", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParadaTren_Aseos(), ecorePackage.getEBoolean(), "aseos", null, 1, 1, ParadaTren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descuentoEClass, Descuento.class, "Descuento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescuento_HoraIni(), ecorePackage.getEInt(), "horaIni", null, 1, 1, Descuento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescuento_HoraFin(), ecorePackage.getEInt(), "horaFin", null, 1, 1, Descuento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescuento_Descuento(), ecorePackage.getEInt(), "descuento", null, 1, 1, Descuento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescuento_Linea(), this.getLinea(), this.getLinea_Descuentos(), "linea", null, 0, 1, Descuento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zonaTarifacionEClass, ZonaTarifacion.class, "ZonaTarifacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZonaTarifacion_Enumeracion(), ecorePackage.getEInt(), "enumeracion", "1", 1, 1, ZonaTarifacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZonaTarifacion_TarifaBus(), ecorePackage.getEDouble(), "tarifaBus", null, 1, 1, ZonaTarifacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZonaTarifacion_TarifaMetro(), ecorePackage.getEDouble(), "tarifaMetro", null, 1, 1, ZonaTarifacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZonaTarifacion_TarifaTren(), ecorePackage.getEDouble(), "tarifaTren", null, 1, 1, ZonaTarifacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (redTransporteEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (lineaEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (lineaMetroEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (lineaTrenEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (lineaBusEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (paradaBusEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (paradaMetroEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (paradaTrenEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (descuentoEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (zonaTarifacionEClass,
		   source,
		   new String[] {
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
