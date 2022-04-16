/**
 */
package red.impl;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import red.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RedFactoryImpl extends EFactoryImpl implements RedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RedFactory init() {
		try {
			RedFactory theRedFactory = (RedFactory)EPackage.Registry.INSTANCE.getEFactory(RedPackage.eNS_URI);
			if (theRedFactory != null) {
				return theRedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RedPackage.RED_TRANSPORTE: return createRedTransporte();
			case RedPackage.LINEA_METRO: return createLineaMetro();
			case RedPackage.LINEA_TREN: return createLineaTren();
			case RedPackage.LINEA_BUS: return createLineaBus();
			case RedPackage.PARADA_BUS: return createParadaBus();
			case RedPackage.PARADA_METRO: return createParadaMetro();
			case RedPackage.PARADA_TREN: return createParadaTren();
			case RedPackage.DESCUENTO: return createDescuento();
			case RedPackage.ZONA_TARIFACION: return createZonaTarifacion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RedPackage.COLORES:
				return createColoresFromString(eDataType, initialValue);
			case RedPackage.TRANSBORDOS:
				return createTransbordosFromString(eDataType, initialValue);
			case RedPackage.DIAGNOSTIC_CHAIN:
				return createDiagnosticChainFromString(eDataType, initialValue);
			case RedPackage.MAP:
				return createMapFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RedPackage.COLORES:
				return convertColoresToString(eDataType, instanceValue);
			case RedPackage.TRANSBORDOS:
				return convertTransbordosToString(eDataType, instanceValue);
			case RedPackage.DIAGNOSTIC_CHAIN:
				return convertDiagnosticChainToString(eDataType, instanceValue);
			case RedPackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedTransporte createRedTransporte() {
		RedTransporteImpl redTransporte = new RedTransporteImpl();
		return redTransporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineaMetro createLineaMetro() {
		LineaMetroImpl lineaMetro = new LineaMetroImpl();
		return lineaMetro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineaTren createLineaTren() {
		LineaTrenImpl lineaTren = new LineaTrenImpl();
		return lineaTren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineaBus createLineaBus() {
		LineaBusImpl lineaBus = new LineaBusImpl();
		return lineaBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaBus createParadaBus() {
		ParadaBusImpl paradaBus = new ParadaBusImpl();
		return paradaBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaMetro createParadaMetro() {
		ParadaMetroImpl paradaMetro = new ParadaMetroImpl();
		return paradaMetro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParadaTren createParadaTren() {
		ParadaTrenImpl paradaTren = new ParadaTrenImpl();
		return paradaTren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descuento createDescuento() {
		DescuentoImpl descuento = new DescuentoImpl();
		return descuento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonaTarifacion createZonaTarifacion() {
		ZonaTarifacionImpl zonaTarifacion = new ZonaTarifacionImpl();
		return zonaTarifacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colores createColoresFromString(EDataType eDataType, String initialValue) {
		Colores result = Colores.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColoresToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transbordos createTransbordosFromString(EDataType eDataType, String initialValue) {
		Transbordos result = Transbordos.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransbordosToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticChain createDiagnosticChainFromString(EDataType eDataType, String initialValue) {
		return (DiagnosticChain)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticChainToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedPackage getRedPackage() {
		return (RedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RedPackage getPackage() {
		return RedPackage.eINSTANCE;
	}

} //RedFactoryImpl
