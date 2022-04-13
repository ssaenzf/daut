/**
 */
package red.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import red.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see red.RedPackage
 * @generated
 */
public class RedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RedValidator INSTANCE = new RedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "red";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Linea Circular' of 'Linea'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINEA__LINEA_CIRCULAR = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Horario Correcto' of 'Linea'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINEA__HORARIO_CORRECTO = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Descuentos Solapados' of 'Linea'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINEA__NON_DESCUENTOS_SOLAPADOS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Duplicate Colores' of 'Linea Metro'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINEA_METRO__NON_DUPLICATE_COLORES = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Duplicate Codigo Metro' of 'Linea Metro'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINEA_METRO__NON_DUPLICATE_CODIGO_METRO = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Duplicate Codigo Tren' of 'Linea Tren'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINEA_TREN__NON_DUPLICATE_CODIGO_TREN = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Duplicate Codigo Bus' of 'Linea Bus'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINEA_BUS__NON_DUPLICATE_CODIGO_BUS = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Linea Diurna' of 'Linea Bus'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINEA_BUS__LINEA_DIURNA = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Duplicate Nombre Parada' of 'Parada Bus'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARADA_BUS__NON_DUPLICATE_NOMBRE_PARADA = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Duplicate Nombre Parada' of 'Parada Metro'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARADA_METRO__NON_DUPLICATE_NOMBRE_PARADA = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Duplicate Nombre Parada' of 'Parada Tren'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARADA_TREN__NON_DUPLICATE_NOMBRE_PARADA = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Descuento' of 'Descuento'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DESCUENTO__POSITIVE_DESCUENTO = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Horario Correcto' of 'Descuento'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DESCUENTO__HORARIO_CORRECTO = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Tarifa Bus' of 'Zona Tarifacion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ZONA_TARIFACION__POSITIVE_TARIFA_BUS = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Tarifa Tren' of 'Zona Tarifacion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ZONA_TARIFACION__POSITIVE_TARIFA_TREN = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Duplicate Num' of 'Zona Tarifacion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ZONA_TARIFACION__NON_DUPLICATE_NUM = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Tarifa Metro' of 'Zona Tarifacion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ZONA_TARIFACION__POSITIVE_TARIFA_METRO = 14;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 17;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RedPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RedPackage.RED_TRANSPORTE:
				return validateRedTransporte((RedTransporte)value, diagnostics, context);
			case RedPackage.LINEA:
				return validateLinea((Linea)value, diagnostics, context);
			case RedPackage.LINEA_METRO:
				return validateLineaMetro((LineaMetro)value, diagnostics, context);
			case RedPackage.LINEA_TREN:
				return validateLineaTren((LineaTren)value, diagnostics, context);
			case RedPackage.LINEA_BUS:
				return validateLineaBus((LineaBus)value, diagnostics, context);
			case RedPackage.PARADA:
				return validateParada((Parada)value, diagnostics, context);
			case RedPackage.PARADA_BUS:
				return validateParadaBus((ParadaBus)value, diagnostics, context);
			case RedPackage.PARADA_METRO:
				return validateParadaMetro((ParadaMetro)value, diagnostics, context);
			case RedPackage.PARADA_TREN:
				return validateParadaTren((ParadaTren)value, diagnostics, context);
			case RedPackage.DESCUENTO:
				return validateDescuento((Descuento)value, diagnostics, context);
			case RedPackage.ZONA_TARIFACION:
				return validateZonaTarifacion((ZonaTarifacion)value, diagnostics, context);
			case RedPackage.COLORES:
				return validateColores((Colores)value, diagnostics, context);
			case RedPackage.TRANSBORDOS:
				return validateTransbordos((Transbordos)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedTransporte(RedTransporte redTransporte, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(redTransporte, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinea(Linea linea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linea, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linea, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinea_lineaCircular(linea, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinea_horarioCorrecto(linea, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinea_nonDescuentosSolapados(linea, diagnostics, context);
		return result;
	}

	/**
	 * Validates the horarioCorrecto constraint of '<em>Linea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinea_horarioCorrecto(Linea linea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linea.horarioCorrecto(diagnostics, context);
	}

	/**
	 * Validates the nonDescuentosSolapados constraint of '<em>Linea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinea_nonDescuentosSolapados(Linea linea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linea.nonDescuentosSolapados(diagnostics, context);
	}

	/**
	 * Validates the lineaCircular constraint of '<em>Linea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinea_lineaCircular(Linea linea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linea.lineaCircular(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineaMetro(LineaMetro lineaMetro, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lineaMetro, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lineaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lineaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lineaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lineaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lineaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lineaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lineaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lineaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinea_lineaCircular(lineaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinea_horarioCorrecto(lineaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinea_nonDescuentosSolapados(lineaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validateLineaMetro_nonDuplicateCodigoMetro(lineaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validateLineaMetro_nonDuplicateColores(lineaMetro, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonDuplicateCodigoMetro constraint of '<em>Linea Metro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineaMetro_nonDuplicateCodigoMetro(LineaMetro lineaMetro, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lineaMetro.nonDuplicateCodigoMetro(diagnostics, context);
	}

	/**
	 * Validates the nonDuplicateColores constraint of '<em>Linea Metro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineaMetro_nonDuplicateColores(LineaMetro lineaMetro, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lineaMetro.nonDuplicateColores(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineaTren(LineaTren lineaTren, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lineaTren, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lineaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lineaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lineaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lineaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lineaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lineaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lineaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lineaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinea_lineaCircular(lineaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinea_horarioCorrecto(lineaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinea_nonDescuentosSolapados(lineaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validateLineaTren_nonDuplicateCodigoTren(lineaTren, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonDuplicateCodigoTren constraint of '<em>Linea Tren</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineaTren_nonDuplicateCodigoTren(LineaTren lineaTren, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lineaTren.nonDuplicateCodigoTren(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineaBus(LineaBus lineaBus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lineaBus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lineaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lineaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lineaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lineaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lineaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lineaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lineaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lineaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinea_lineaCircular(lineaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinea_horarioCorrecto(lineaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinea_nonDescuentosSolapados(lineaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validateLineaBus_lineaDiurna(lineaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validateLineaBus_nonDuplicateCodigoBus(lineaBus, diagnostics, context);
		return result;
	}

	/**
	 * Validates the lineaDiurna constraint of '<em>Linea Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineaBus_lineaDiurna(LineaBus lineaBus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lineaBus.lineaDiurna(diagnostics, context);
	}

	/**
	 * Validates the nonDuplicateCodigoBus constraint of '<em>Linea Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineaBus_nonDuplicateCodigoBus(LineaBus lineaBus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lineaBus.nonDuplicateCodigoBus(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParada(Parada parada, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parada, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParadaBus(ParadaBus paradaBus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(paradaBus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(paradaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(paradaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(paradaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(paradaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(paradaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(paradaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(paradaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(paradaBus, diagnostics, context);
		if (result || diagnostics != null) result &= validateParadaBus_nonDuplicateNombreParada(paradaBus, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonDuplicateNombreParada constraint of '<em>Parada Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParadaBus_nonDuplicateNombreParada(ParadaBus paradaBus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return paradaBus.nonDuplicateNombreParada(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParadaMetro(ParadaMetro paradaMetro, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(paradaMetro, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(paradaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(paradaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(paradaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(paradaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(paradaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(paradaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(paradaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(paradaMetro, diagnostics, context);
		if (result || diagnostics != null) result &= validateParadaMetro_nonDuplicateNombreParada(paradaMetro, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonDuplicateNombreParada constraint of '<em>Parada Metro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParadaMetro_nonDuplicateNombreParada(ParadaMetro paradaMetro, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return paradaMetro.nonDuplicateNombreParada(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParadaTren(ParadaTren paradaTren, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(paradaTren, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(paradaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(paradaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(paradaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(paradaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(paradaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(paradaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(paradaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(paradaTren, diagnostics, context);
		if (result || diagnostics != null) result &= validateParadaTren_nonDuplicateNombreParada(paradaTren, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonDuplicateNombreParada constraint of '<em>Parada Tren</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParadaTren_nonDuplicateNombreParada(ParadaTren paradaTren, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return paradaTren.nonDuplicateNombreParada(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescuento(Descuento descuento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(descuento, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(descuento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(descuento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(descuento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(descuento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(descuento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(descuento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(descuento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(descuento, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescuento_horarioCorrecto(descuento, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescuento_positiveDescuento(descuento, diagnostics, context);
		return result;
	}

	/**
	 * Validates the horarioCorrecto constraint of '<em>Descuento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescuento_horarioCorrecto(Descuento descuento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return descuento.horarioCorrecto(diagnostics, context);
	}

	/**
	 * Validates the positiveDescuento constraint of '<em>Descuento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescuento_positiveDescuento(Descuento descuento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return descuento.positiveDescuento(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZonaTarifacion(ZonaTarifacion zonaTarifacion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zonaTarifacion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zonaTarifacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zonaTarifacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zonaTarifacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zonaTarifacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zonaTarifacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zonaTarifacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zonaTarifacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zonaTarifacion, diagnostics, context);
		if (result || diagnostics != null) result &= validateZonaTarifacion_positiveTarifaBus(zonaTarifacion, diagnostics, context);
		if (result || diagnostics != null) result &= validateZonaTarifacion_positiveTarifaMetro(zonaTarifacion, diagnostics, context);
		if (result || diagnostics != null) result &= validateZonaTarifacion_positiveTarifaTren(zonaTarifacion, diagnostics, context);
		if (result || diagnostics != null) result &= validateZonaTarifacion_nonDuplicateNum(zonaTarifacion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the positiveTarifaMetro constraint of '<em>Zona Tarifacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZonaTarifacion_positiveTarifaMetro(ZonaTarifacion zonaTarifacion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return zonaTarifacion.positiveTarifaMetro(diagnostics, context);
	}

	/**
	 * Validates the positiveTarifaBus constraint of '<em>Zona Tarifacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZonaTarifacion_positiveTarifaBus(ZonaTarifacion zonaTarifacion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return zonaTarifacion.positiveTarifaBus(diagnostics, context);
	}

	/**
	 * Validates the positiveTarifaTren constraint of '<em>Zona Tarifacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZonaTarifacion_positiveTarifaTren(ZonaTarifacion zonaTarifacion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return zonaTarifacion.positiveTarifaTren(diagnostics, context);
	}

	/**
	 * Validates the nonDuplicateNum constraint of '<em>Zona Tarifacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZonaTarifacion_nonDuplicateNum(ZonaTarifacion zonaTarifacion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return zonaTarifacion.nonDuplicateNum(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColores(Colores colores, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransbordos(Transbordos transbordos, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RedValidator
