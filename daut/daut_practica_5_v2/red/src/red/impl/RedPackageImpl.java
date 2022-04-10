/**
 */
package red.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	public EReference getLinea_Paradas() {
		return (EReference)lineaEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getLinea_Circular() {
		return (EAttribute)lineaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinea__LineaCircular__DiagnosticChain_Map() {
		return lineaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinea__ParadasIguales__DiagnosticChain_Map() {
		return lineaEClass.getEOperations().get(1);
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
	public EOperation getLineaMetro__NonDuplicateColores__DiagnosticChain_Map() {
		return lineaMetroEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaMetro__NonDuplicateCodigoMetro__DiagnosticChain_Map() {
		return lineaMetroEClass.getEOperations().get(1);
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
	public EAttribute getLineaTren_Diurna() {
		return (EAttribute)lineaTrenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineaTren_Nocturna() {
		return (EAttribute)lineaTrenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineaTren__NonDuplicateCodigoTren__DiagnosticChain_Map() {
		return lineaTrenEClass.getEOperations().get(0);
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
	public EOperation getLineaBus__NonDuplicateCodigoBus__DiagnosticChain_Map() {
		return lineaBusEClass.getEOperations().get(0);
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
	public EAttribute getParada_Aseos() {
		return (EAttribute)paradaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParada_Transbordo() {
		return (EAttribute)paradaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParada__NonDuplicateNombreParada__DiagnosticChain_Map() {
		return paradaEClass.getEOperations().get(0);
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
	public EAttribute getDescuento_HoraApertura() {
		return (EAttribute)descuentoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescuento_HoraCierre() {
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
	public EOperation getDescuento__PositiveDescuento__DiagnosticChain_Map() {
		return descuentoEClass.getEOperations().get(0);
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
	public EOperation getZonaTarifacion__PositiveTarifaBus__DiagnosticChain_Map() {
		return zonaTarifacionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZonaTarifacion__PositiveTarifaTren__DiagnosticChain_Map() {
		return zonaTarifacionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZonaTarifacion__PositiveTarifaMetro__DiagnosticChain_Map() {
		return zonaTarifacionEClass.getEOperations().get(2);
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
		createEReference(lineaEClass, LINEA__PARADAS);
		createEReference(lineaEClass, LINEA__PARADA_INI);
		createEReference(lineaEClass, LINEA__PARADA_FIN);
		createEAttribute(lineaEClass, LINEA__CIRCULAR);
		createEOperation(lineaEClass, LINEA___LINEA_CIRCULAR__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaEClass, LINEA___PARADAS_IGUALES__DIAGNOSTICCHAIN_MAP);

		lineaMetroEClass = createEClass(LINEA_METRO);
		createEAttribute(lineaMetroEClass, LINEA_METRO__COLOR);
		createEOperation(lineaMetroEClass, LINEA_METRO___NON_DUPLICATE_COLORES__DIAGNOSTICCHAIN_MAP);
		createEOperation(lineaMetroEClass, LINEA_METRO___NON_DUPLICATE_CODIGO_METRO__DIAGNOSTICCHAIN_MAP);

		lineaTrenEClass = createEClass(LINEA_TREN);
		createEAttribute(lineaTrenEClass, LINEA_TREN__DIURNA);
		createEAttribute(lineaTrenEClass, LINEA_TREN__NOCTURNA);
		createEOperation(lineaTrenEClass, LINEA_TREN___NON_DUPLICATE_CODIGO_TREN__DIAGNOSTICCHAIN_MAP);

		lineaBusEClass = createEClass(LINEA_BUS);
		createEOperation(lineaBusEClass, LINEA_BUS___NON_DUPLICATE_CODIGO_BUS__DIAGNOSTICCHAIN_MAP);

		paradaEClass = createEClass(PARADA);
		createEAttribute(paradaEClass, PARADA__NOMBRE);
		createEAttribute(paradaEClass, PARADA__ACCESIBLE);
		createEAttribute(paradaEClass, PARADA__BICICLETAS);
		createEAttribute(paradaEClass, PARADA__APARCAMIENTO_GRAT);
		createEAttribute(paradaEClass, PARADA__ASEOS);
		createEAttribute(paradaEClass, PARADA__TRANSBORDO);
		createEOperation(paradaEClass, PARADA___NON_DUPLICATE_NOMBRE_PARADA__DIAGNOSTICCHAIN_MAP);

		descuentoEClass = createEClass(DESCUENTO);
		createEAttribute(descuentoEClass, DESCUENTO__HORA_APERTURA);
		createEAttribute(descuentoEClass, DESCUENTO__HORA_CIERRE);
		createEAttribute(descuentoEClass, DESCUENTO__DESCUENTO);
		createEOperation(descuentoEClass, DESCUENTO___POSITIVE_DESCUENTO__DIAGNOSTICCHAIN_MAP);

		zonaTarifacionEClass = createEClass(ZONA_TARIFACION);
		createEAttribute(zonaTarifacionEClass, ZONA_TARIFACION__ENUMERACION);
		createEAttribute(zonaTarifacionEClass, ZONA_TARIFACION__TARIFA_BUS);
		createEAttribute(zonaTarifacionEClass, ZONA_TARIFACION__TARIFA_METRO);
		createEAttribute(zonaTarifacionEClass, ZONA_TARIFACION__TARIFA_TREN);
		createEOperation(zonaTarifacionEClass, ZONA_TARIFACION___POSITIVE_TARIFA_BUS__DIAGNOSTICCHAIN_MAP);
		createEOperation(zonaTarifacionEClass, ZONA_TARIFACION___POSITIVE_TARIFA_TREN__DIAGNOSTICCHAIN_MAP);
		createEOperation(zonaTarifacionEClass, ZONA_TARIFACION___POSITIVE_TARIFA_METRO__DIAGNOSTICCHAIN_MAP);

		// Create enums
		coloresEEnum = createEEnum(COLORES);
		transbordosEEnum = createEEnum(TRANSBORDOS);
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

		// Set bounds for type parameters

		// Add supertypes to classes
		lineaMetroEClass.getESuperTypes().add(this.getLinea());
		lineaTrenEClass.getESuperTypes().add(this.getLinea());
		lineaBusEClass.getESuperTypes().add(this.getLinea());

		// Initialize classes, features, and operations; add parameters
		initEClass(redTransporteEClass, RedTransporte.class, "RedTransporte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRedTransporte_Lineas(), this.getLinea(), null, "lineas", null, 1, -1, RedTransporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedTransporte_Paradas(), this.getParada(), null, "paradas", null, 2, -1, RedTransporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedTransporte_ZonasTarifacion(), this.getZonaTarifacion(), null, "zonasTarifacion", null, 1, -1, RedTransporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lineaEClass, Linea.class, "Linea", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinea_Codigo(), ecorePackage.getEString(), "codigo", null, 1, 1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinea_Descuentos(), this.getDescuento(), null, "descuentos", null, 0, -1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLinea_HoraApertura(), ecorePackage.getEInt(), "horaApertura", null, 1, 1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinea_HoraCierre(), ecorePackage.getEInt(), "horaCierre", null, 1, 1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getLinea_SiguienteParadaTiempo(), g1, "siguienteParadaTiempo", null, 0, 1, Linea.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getLinea_SiguienteParadaDistancia(), g1, "siguienteParadaDistancia", null, 0, 1, Linea.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinea_Paradas(), this.getParada(), null, "paradas", null, 2, -1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinea_ParadaIni(), this.getParada(), null, "paradaIni", null, 1, 1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinea_ParadaFin(), this.getParada(), null, "paradaFin", null, 1, 1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinea_Circular(), ecorePackage.getEBoolean(), "circular", null, 1, 1, Linea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getLinea__LineaCircular__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "lineaCircular", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLinea__ParadasIguales__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "paradasIguales", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lineaMetroEClass, LineaMetro.class, "LineaMetro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineaMetro_Color(), this.getColores(), "color", null, 0, 1, LineaMetro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(lineaTrenEClass, LineaTren.class, "LineaTren", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineaTren_Diurna(), ecorePackage.getEBoolean(), "diurna", null, 1, 1, LineaTren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineaTren_Nocturna(), ecorePackage.getEBoolean(), "nocturna", null, 1, 1, LineaTren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLineaTren__NonDuplicateCodigoTren__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateCodigoTren", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lineaBusEClass, LineaBus.class, "LineaBus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLineaBus__NonDuplicateCodigoBus__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateCodigoBus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paradaEClass, Parada.class, "Parada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParada_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_Accesible(), ecorePackage.getEBoolean(), "accesible", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_Bicicletas(), ecorePackage.getEBoolean(), "bicicletas", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_AparcamientoGrat(), ecorePackage.getEBoolean(), "aparcamientoGrat", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_Aseos(), ecorePackage.getEBoolean(), "aseos", null, 1, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParada_Transbordo(), this.getTransbordos(), "transbordo", null, 0, 1, Parada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getParada__NonDuplicateNombreParada__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateNombreParada", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(descuentoEClass, Descuento.class, "Descuento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescuento_HoraApertura(), ecorePackage.getEInt(), "horaApertura", null, 1, 1, Descuento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescuento_HoraCierre(), ecorePackage.getEInt(), "horaCierre", null, 1, 1, Descuento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescuento_Descuento(), ecorePackage.getEDouble(), "descuento", null, 1, 1, Descuento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDescuento__PositiveDescuento__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "positiveDescuento", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(zonaTarifacionEClass, ZonaTarifacion.class, "ZonaTarifacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZonaTarifacion_Enumeracion(), ecorePackage.getEInt(), "enumeracion", "1", 1, 1, ZonaTarifacion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZonaTarifacion_TarifaBus(), ecorePackage.getEDouble(), "tarifaBus", null, 1, 1, ZonaTarifacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZonaTarifacion_TarifaMetro(), ecorePackage.getEDouble(), "tarifaMetro", null, 1, 1, ZonaTarifacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZonaTarifacion_TarifaTren(), ecorePackage.getEDouble(), "tarifaTren", null, 1, 1, ZonaTarifacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getZonaTarifacion__PositiveTarifaBus__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "positiveTarifaBus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
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
		  (lineaEClass,
		   source,
		   new String[] {
			   "constraints", "paradasIguales"
		   });
		addAnnotation
		  (lineaMetroEClass,
		   source,
		   new String[] {
			   "constraints", "nonDuplicateCodigoMetro"
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
			   "constraints", "nonDuplicateCodigoBus"
		   });
		addAnnotation
		  (paradaEClass,
		   source,
		   new String[] {
			   "constraints", "nonDuplicateNombreParada"
		   });
		addAnnotation
		  (descuentoEClass,
		   source,
		   new String[] {
			   "constraints", "positiveDescuento"
		   });
		addAnnotation
		  (zonaTarifacionEClass,
		   source,
		   new String[] {
			   "constraints", "positiveTarifaMetro"
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

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getLinea__LineaCircular__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tif circular = true then\n\t\t\t\tparadaFin = paradaIni \n\t\t\telse \n\t\t\t\tparadaFin <> paradaIni \n\t\t\tendif"
		   });
		addAnnotation
		  (getLinea__ParadasIguales__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tparadas->forAll(p1, p2 | \n\t\t\t\tp1 <> p2 implies p1.nombre <> p2.nombre\n\t\t\t)"
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
		  (getLineaTren__NonDuplicateCodigoTren__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tLineaTren.allInstances()->isUnique(codigo)"
		   });
		addAnnotation
		  (getLineaBus__NonDuplicateCodigoBus__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tLineaBus.allInstances()->isUnique(codigo)"
		   });
		addAnnotation
		  (getParada__NonDuplicateNombreParada__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tParada.allInstances()->isUnique(nombre)"
		   });
		addAnnotation
		  (getDescuento__PositiveDescuento__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "descuento > 0"
		   });
		addAnnotation
		  (getZonaTarifacion__PositiveTarifaBus__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "tarifaBus > 0"
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
	}

} //RedPackageImpl
