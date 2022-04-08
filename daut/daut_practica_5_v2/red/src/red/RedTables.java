/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /red/model/red.ecore
 * using:
 *   /red/model/red.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package red;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import red.RedPackage;
// import red.RedTables;

/**
 * RedTables provides the dispatch tables for the red for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class RedTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(RedPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Orphanage = IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/2015/Orphanage", "orphanage", null);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_red = IdManager.getNsURIPackageId("red", null, RedPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = RedTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Descuento = RedTables.PACKid_red.getClassId("Descuento", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Linea = RedTables.PACKid_red.getClassId("Linea", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LineaBus = RedTables.PACKid_red.getClassId("LineaBus", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LineaMetro = RedTables.PACKid_red.getClassId("LineaMetro", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LineaTren = RedTables.PACKid_red.getClassId("LineaTren", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Parada = RedTables.PACKid_red.getClassId("Parada", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RedTransporte = RedTables.PACKid_red.getClassId("RedTransporte", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ZonaTarifacion = RedTables.PACKid_red.getClassId("ZonaTarifacion", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = RedTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = RedTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EMap = RedTables.PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Orphanage.getDataTypeId("EMap", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Colores = RedTables.PACKid_red.getEnumerationId("Colores");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Transbordos = RedTables.PACKid_red.getEnumerationId("Transbordos");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Parada = TypeId.ORDERED_SET.getSpecializedId(RedTables.CLSSid_Parada);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Descuento = TypeId.SET.getSpecializedId(RedTables.CLSSid_Descuento);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Linea = TypeId.SET.getSpecializedId(RedTables.CLSSid_Linea);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_LineaBus = TypeId.SET.getSpecializedId(RedTables.CLSSid_LineaBus);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_LineaMetro = TypeId.SET.getSpecializedId(RedTables.CLSSid_LineaMetro);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_LineaTren = TypeId.SET.getSpecializedId(RedTables.CLSSid_LineaTren);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Parada = TypeId.SET.getSpecializedId(RedTables.CLSSid_Parada);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ZonaTarifacion = TypeId.SET.getSpecializedId(RedTables.CLSSid_ZonaTarifacion);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			RedTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RedTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorEnumeration _Colores = new EcoreExecutorEnumeration(RedPackage.Literals.COLORES, PACKAGE, 0);
		public static final EcoreExecutorType _Descuento = new EcoreExecutorType(RedPackage.Literals.DESCUENTO, PACKAGE, 0);
		public static final EcoreExecutorType _Linea = new EcoreExecutorType(RedPackage.Literals.LINEA, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _LineaBus = new EcoreExecutorType(RedPackage.Literals.LINEA_BUS, PACKAGE, 0);
		public static final EcoreExecutorType _LineaMetro = new EcoreExecutorType(RedPackage.Literals.LINEA_METRO, PACKAGE, 0);
		public static final EcoreExecutorType _LineaTren = new EcoreExecutorType(RedPackage.Literals.LINEA_TREN, PACKAGE, 0);
		public static final EcoreExecutorType _Parada = new EcoreExecutorType(RedPackage.Literals.PARADA, PACKAGE, 0);
		public static final EcoreExecutorType _RedTransporte = new EcoreExecutorType(RedPackage.Literals.RED_TRANSPORTE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Transbordos = new EcoreExecutorEnumeration(RedPackage.Literals.TRANSBORDOS, PACKAGE, 0);
		public static final EcoreExecutorType _ZonaTarifacion = new EcoreExecutorType(RedPackage.Literals.ZONA_TARIFACION, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Colores,
			_Descuento,
			_Linea,
			_LineaBus,
			_LineaMetro,
			_LineaTren,
			_Parada,
			_RedTransporte,
			_Transbordos,
			_ZonaTarifacion
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RedTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Colores__Colores = new ExecutorFragment(Types._Colores, RedTables.Types._Colores);
		private static final ExecutorFragment _Colores__OclAny = new ExecutorFragment(Types._Colores, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Colores__OclElement = new ExecutorFragment(Types._Colores, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Colores__OclEnumeration = new ExecutorFragment(Types._Colores, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Colores__OclType = new ExecutorFragment(Types._Colores, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Descuento__Descuento = new ExecutorFragment(Types._Descuento, RedTables.Types._Descuento);
		private static final ExecutorFragment _Descuento__OclAny = new ExecutorFragment(Types._Descuento, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Descuento__OclElement = new ExecutorFragment(Types._Descuento, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Linea__Linea = new ExecutorFragment(Types._Linea, RedTables.Types._Linea);
		private static final ExecutorFragment _Linea__OclAny = new ExecutorFragment(Types._Linea, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Linea__OclElement = new ExecutorFragment(Types._Linea, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LineaBus__Linea = new ExecutorFragment(Types._LineaBus, RedTables.Types._Linea);
		private static final ExecutorFragment _LineaBus__LineaBus = new ExecutorFragment(Types._LineaBus, RedTables.Types._LineaBus);
		private static final ExecutorFragment _LineaBus__OclAny = new ExecutorFragment(Types._LineaBus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LineaBus__OclElement = new ExecutorFragment(Types._LineaBus, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LineaMetro__Linea = new ExecutorFragment(Types._LineaMetro, RedTables.Types._Linea);
		private static final ExecutorFragment _LineaMetro__LineaMetro = new ExecutorFragment(Types._LineaMetro, RedTables.Types._LineaMetro);
		private static final ExecutorFragment _LineaMetro__OclAny = new ExecutorFragment(Types._LineaMetro, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LineaMetro__OclElement = new ExecutorFragment(Types._LineaMetro, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LineaTren__Linea = new ExecutorFragment(Types._LineaTren, RedTables.Types._Linea);
		private static final ExecutorFragment _LineaTren__LineaTren = new ExecutorFragment(Types._LineaTren, RedTables.Types._LineaTren);
		private static final ExecutorFragment _LineaTren__OclAny = new ExecutorFragment(Types._LineaTren, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LineaTren__OclElement = new ExecutorFragment(Types._LineaTren, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Parada__OclAny = new ExecutorFragment(Types._Parada, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Parada__OclElement = new ExecutorFragment(Types._Parada, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Parada__Parada = new ExecutorFragment(Types._Parada, RedTables.Types._Parada);

		private static final ExecutorFragment _RedTransporte__OclAny = new ExecutorFragment(Types._RedTransporte, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RedTransporte__OclElement = new ExecutorFragment(Types._RedTransporte, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RedTransporte__RedTransporte = new ExecutorFragment(Types._RedTransporte, RedTables.Types._RedTransporte);

		private static final ExecutorFragment _Transbordos__OclAny = new ExecutorFragment(Types._Transbordos, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Transbordos__OclElement = new ExecutorFragment(Types._Transbordos, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Transbordos__OclEnumeration = new ExecutorFragment(Types._Transbordos, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Transbordos__OclType = new ExecutorFragment(Types._Transbordos, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Transbordos__Transbordos = new ExecutorFragment(Types._Transbordos, RedTables.Types._Transbordos);

		private static final ExecutorFragment _ZonaTarifacion__OclAny = new ExecutorFragment(Types._ZonaTarifacion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ZonaTarifacion__OclElement = new ExecutorFragment(Types._ZonaTarifacion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ZonaTarifacion__ZonaTarifacion = new ExecutorFragment(Types._ZonaTarifacion, RedTables.Types._ZonaTarifacion);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RedTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RedTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RedTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _Descuento__descuento = new EcoreExecutorProperty(RedPackage.Literals.DESCUENTO__DESCUENTO, Types._Descuento, 0);
		public static final ExecutorProperty _Descuento__horaApertura = new EcoreExecutorProperty(RedPackage.Literals.DESCUENTO__HORA_APERTURA, Types._Descuento, 1);
		public static final ExecutorProperty _Descuento__horaCierre = new EcoreExecutorProperty(RedPackage.Literals.DESCUENTO__HORA_CIERRE, Types._Descuento, 2);
		public static final ExecutorProperty _Descuento__Linea__descuentos = new ExecutorPropertyWithImplementation("Linea", Types._Descuento, 3, new EcoreLibraryOppositeProperty(RedPackage.Literals.LINEA__DESCUENTOS));

		public static final ExecutorProperty _Linea__codigo = new EcoreExecutorProperty(RedPackage.Literals.LINEA__CODIGO, Types._Linea, 0);
		public static final ExecutorProperty _Linea__descuentos = new EcoreExecutorProperty(RedPackage.Literals.LINEA__DESCUENTOS, Types._Linea, 1);
		public static final ExecutorProperty _Linea__horaApertura = new EcoreExecutorProperty(RedPackage.Literals.LINEA__HORA_APERTURA, Types._Linea, 2);
		public static final ExecutorProperty _Linea__horaCierre = new EcoreExecutorProperty(RedPackage.Literals.LINEA__HORA_CIERRE, Types._Linea, 3);
		public static final ExecutorProperty _Linea__paradas = new EcoreExecutorProperty(RedPackage.Literals.LINEA__PARADAS, Types._Linea, 4);
		public static final ExecutorProperty _Linea__siguienteParadaDistancia = new EcoreExecutorProperty(RedPackage.Literals.LINEA__SIGUIENTE_PARADA_DISTANCIA, Types._Linea, 5);
		public static final ExecutorProperty _Linea__siguienteParadaTiempo = new EcoreExecutorProperty(RedPackage.Literals.LINEA__SIGUIENTE_PARADA_TIEMPO, Types._Linea, 6);
		public static final ExecutorProperty _Linea__RedTransporte__lineas = new ExecutorPropertyWithImplementation("RedTransporte", Types._Linea, 7, new EcoreLibraryOppositeProperty(RedPackage.Literals.RED_TRANSPORTE__LINEAS));

		public static final ExecutorProperty _LineaMetro__color = new EcoreExecutorProperty(RedPackage.Literals.LINEA_METRO__COLOR, Types._LineaMetro, 0);

		public static final ExecutorProperty _LineaTren__diurna = new EcoreExecutorProperty(RedPackage.Literals.LINEA_TREN__DIURNA, Types._LineaTren, 0);
		public static final ExecutorProperty _LineaTren__nocturna = new EcoreExecutorProperty(RedPackage.Literals.LINEA_TREN__NOCTURNA, Types._LineaTren, 1);

		public static final ExecutorProperty _Parada__accesible = new EcoreExecutorProperty(RedPackage.Literals.PARADA__ACCESIBLE, Types._Parada, 0);
		public static final ExecutorProperty _Parada__aparcamientoGrat = new EcoreExecutorProperty(RedPackage.Literals.PARADA__APARCAMIENTO_GRAT, Types._Parada, 1);
		public static final ExecutorProperty _Parada__aseos = new EcoreExecutorProperty(RedPackage.Literals.PARADA__ASEOS, Types._Parada, 2);
		public static final ExecutorProperty _Parada__bicicletas = new EcoreExecutorProperty(RedPackage.Literals.PARADA__BICICLETAS, Types._Parada, 3);
		public static final ExecutorProperty _Parada__nombre = new EcoreExecutorProperty(RedPackage.Literals.PARADA__NOMBRE, Types._Parada, 4);
		public static final ExecutorProperty _Parada__transbordo = new EcoreExecutorProperty(RedPackage.Literals.PARADA__TRANSBORDO, Types._Parada, 5);
		public static final ExecutorProperty _Parada__Linea__paradas = new ExecutorPropertyWithImplementation("Linea", Types._Parada, 6, new EcoreLibraryOppositeProperty(RedPackage.Literals.LINEA__PARADAS));
		public static final ExecutorProperty _Parada__RedTransporte__paradas = new ExecutorPropertyWithImplementation("RedTransporte", Types._Parada, 7, new EcoreLibraryOppositeProperty(RedPackage.Literals.RED_TRANSPORTE__PARADAS));

		public static final ExecutorProperty _RedTransporte__lineas = new EcoreExecutorProperty(RedPackage.Literals.RED_TRANSPORTE__LINEAS, Types._RedTransporte, 0);
		public static final ExecutorProperty _RedTransporte__paradas = new EcoreExecutorProperty(RedPackage.Literals.RED_TRANSPORTE__PARADAS, Types._RedTransporte, 1);
		public static final ExecutorProperty _RedTransporte__zonasTarifacion = new EcoreExecutorProperty(RedPackage.Literals.RED_TRANSPORTE__ZONAS_TARIFACION, Types._RedTransporte, 2);

		public static final ExecutorProperty _ZonaTarifacion__enumeracion = new EcoreExecutorProperty(RedPackage.Literals.ZONA_TARIFACION__ENUMERACION, Types._ZonaTarifacion, 0);
		public static final ExecutorProperty _ZonaTarifacion__tarifaBus = new EcoreExecutorProperty(RedPackage.Literals.ZONA_TARIFACION__TARIFA_BUS, Types._ZonaTarifacion, 1);
		public static final ExecutorProperty _ZonaTarifacion__tarifaMetro = new EcoreExecutorProperty(RedPackage.Literals.ZONA_TARIFACION__TARIFA_METRO, Types._ZonaTarifacion, 2);
		public static final ExecutorProperty _ZonaTarifacion__tarifaTren = new EcoreExecutorProperty(RedPackage.Literals.ZONA_TARIFACION__TARIFA_TREN, Types._ZonaTarifacion, 3);
		public static final ExecutorProperty _ZonaTarifacion__RedTransporte__zonasTarifacion = new ExecutorPropertyWithImplementation("RedTransporte", Types._ZonaTarifacion, 4, new EcoreLibraryOppositeProperty(RedPackage.Literals.RED_TRANSPORTE__ZONAS_TARIFACION));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RedTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Colores =
			{
				Fragments._Colores__OclAny /* 0 */,
				Fragments._Colores__OclElement /* 1 */,
				Fragments._Colores__OclType /* 2 */,
				Fragments._Colores__OclEnumeration /* 3 */,
				Fragments._Colores__Colores /* 4 */
			};
		private static final int /*@NonNull*/ [] __Colores = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Descuento =
			{
				Fragments._Descuento__OclAny /* 0 */,
				Fragments._Descuento__OclElement /* 1 */,
				Fragments._Descuento__Descuento /* 2 */
			};
		private static final int /*@NonNull*/ [] __Descuento = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Linea =
			{
				Fragments._Linea__OclAny /* 0 */,
				Fragments._Linea__OclElement /* 1 */,
				Fragments._Linea__Linea /* 2 */
			};
		private static final int /*@NonNull*/ [] __Linea = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LineaBus =
			{
				Fragments._LineaBus__OclAny /* 0 */,
				Fragments._LineaBus__OclElement /* 1 */,
				Fragments._LineaBus__Linea /* 2 */,
				Fragments._LineaBus__LineaBus /* 3 */
			};
		private static final int /*@NonNull*/ [] __LineaBus = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LineaMetro =
			{
				Fragments._LineaMetro__OclAny /* 0 */,
				Fragments._LineaMetro__OclElement /* 1 */,
				Fragments._LineaMetro__Linea /* 2 */,
				Fragments._LineaMetro__LineaMetro /* 3 */
			};
		private static final int /*@NonNull*/ [] __LineaMetro = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LineaTren =
			{
				Fragments._LineaTren__OclAny /* 0 */,
				Fragments._LineaTren__OclElement /* 1 */,
				Fragments._LineaTren__Linea /* 2 */,
				Fragments._LineaTren__LineaTren /* 3 */
			};
		private static final int /*@NonNull*/ [] __LineaTren = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Parada =
			{
				Fragments._Parada__OclAny /* 0 */,
				Fragments._Parada__OclElement /* 1 */,
				Fragments._Parada__Parada /* 2 */
			};
		private static final int /*@NonNull*/ [] __Parada = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RedTransporte =
			{
				Fragments._RedTransporte__OclAny /* 0 */,
				Fragments._RedTransporte__OclElement /* 1 */,
				Fragments._RedTransporte__RedTransporte /* 2 */
			};
		private static final int /*@NonNull*/ [] __RedTransporte = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Transbordos =
			{
				Fragments._Transbordos__OclAny /* 0 */,
				Fragments._Transbordos__OclElement /* 1 */,
				Fragments._Transbordos__OclType /* 2 */,
				Fragments._Transbordos__OclEnumeration /* 3 */,
				Fragments._Transbordos__Transbordos /* 4 */
			};
		private static final int /*@NonNull*/ [] __Transbordos = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ZonaTarifacion =
			{
				Fragments._ZonaTarifacion__OclAny /* 0 */,
				Fragments._ZonaTarifacion__OclElement /* 1 */,
				Fragments._ZonaTarifacion__ZonaTarifacion /* 2 */
			};
		private static final int /*@NonNull*/ [] __ZonaTarifacion = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Colores.initFragments(_Colores, __Colores);
			Types._Descuento.initFragments(_Descuento, __Descuento);
			Types._Linea.initFragments(_Linea, __Linea);
			Types._LineaBus.initFragments(_LineaBus, __LineaBus);
			Types._LineaMetro.initFragments(_LineaMetro, __LineaMetro);
			Types._LineaTren.initFragments(_LineaTren, __LineaTren);
			Types._Parada.initFragments(_Parada, __Parada);
			Types._RedTransporte.initFragments(_RedTransporte, __RedTransporte);
			Types._Transbordos.initFragments(_Transbordos, __Transbordos);
			Types._ZonaTarifacion.initFragments(_ZonaTarifacion, __ZonaTarifacion);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RedTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Colores__Colores = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Colores__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Colores__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Colores__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Colores__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Descuento__Descuento = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Descuento__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Descuento__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Linea__Linea = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Linea__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Linea__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LineaBus__LineaBus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LineaBus__Linea = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LineaBus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LineaBus__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LineaMetro__LineaMetro = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LineaMetro__Linea = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LineaMetro__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LineaMetro__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LineaTren__LineaTren = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LineaTren__Linea = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LineaTren__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LineaTren__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Parada__Parada = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parada__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Parada__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RedTransporte__RedTransporte = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RedTransporte__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RedTransporte__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Transbordos__Transbordos = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Transbordos__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Transbordos__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Transbordos__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Transbordos__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ZonaTarifacion__ZonaTarifacion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ZonaTarifacion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ZonaTarifacion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Colores__Colores.initOperations(_Colores__Colores);
			Fragments._Colores__OclAny.initOperations(_Colores__OclAny);
			Fragments._Colores__OclElement.initOperations(_Colores__OclElement);
			Fragments._Colores__OclEnumeration.initOperations(_Colores__OclEnumeration);
			Fragments._Colores__OclType.initOperations(_Colores__OclType);

			Fragments._Descuento__Descuento.initOperations(_Descuento__Descuento);
			Fragments._Descuento__OclAny.initOperations(_Descuento__OclAny);
			Fragments._Descuento__OclElement.initOperations(_Descuento__OclElement);

			Fragments._Linea__Linea.initOperations(_Linea__Linea);
			Fragments._Linea__OclAny.initOperations(_Linea__OclAny);
			Fragments._Linea__OclElement.initOperations(_Linea__OclElement);

			Fragments._LineaBus__Linea.initOperations(_LineaBus__Linea);
			Fragments._LineaBus__LineaBus.initOperations(_LineaBus__LineaBus);
			Fragments._LineaBus__OclAny.initOperations(_LineaBus__OclAny);
			Fragments._LineaBus__OclElement.initOperations(_LineaBus__OclElement);

			Fragments._LineaMetro__Linea.initOperations(_LineaMetro__Linea);
			Fragments._LineaMetro__LineaMetro.initOperations(_LineaMetro__LineaMetro);
			Fragments._LineaMetro__OclAny.initOperations(_LineaMetro__OclAny);
			Fragments._LineaMetro__OclElement.initOperations(_LineaMetro__OclElement);

			Fragments._LineaTren__Linea.initOperations(_LineaTren__Linea);
			Fragments._LineaTren__LineaTren.initOperations(_LineaTren__LineaTren);
			Fragments._LineaTren__OclAny.initOperations(_LineaTren__OclAny);
			Fragments._LineaTren__OclElement.initOperations(_LineaTren__OclElement);

			Fragments._Parada__OclAny.initOperations(_Parada__OclAny);
			Fragments._Parada__OclElement.initOperations(_Parada__OclElement);
			Fragments._Parada__Parada.initOperations(_Parada__Parada);

			Fragments._RedTransporte__OclAny.initOperations(_RedTransporte__OclAny);
			Fragments._RedTransporte__OclElement.initOperations(_RedTransporte__OclElement);
			Fragments._RedTransporte__RedTransporte.initOperations(_RedTransporte__RedTransporte);

			Fragments._Transbordos__OclAny.initOperations(_Transbordos__OclAny);
			Fragments._Transbordos__OclElement.initOperations(_Transbordos__OclElement);
			Fragments._Transbordos__OclEnumeration.initOperations(_Transbordos__OclEnumeration);
			Fragments._Transbordos__OclType.initOperations(_Transbordos__OclType);
			Fragments._Transbordos__Transbordos.initOperations(_Transbordos__Transbordos);

			Fragments._ZonaTarifacion__OclAny.initOperations(_ZonaTarifacion__OclAny);
			Fragments._ZonaTarifacion__OclElement.initOperations(_ZonaTarifacion__OclElement);
			Fragments._ZonaTarifacion__ZonaTarifacion.initOperations(_ZonaTarifacion__ZonaTarifacion);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RedTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Colores = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Descuento = {
			RedTables.Properties._Descuento__descuento,
			RedTables.Properties._Descuento__horaApertura,
			RedTables.Properties._Descuento__horaCierre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Linea = {
			RedTables.Properties._Linea__codigo,
			RedTables.Properties._Linea__descuentos,
			RedTables.Properties._Linea__horaApertura,
			RedTables.Properties._Linea__horaCierre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RedTables.Properties._Linea__paradas,
			RedTables.Properties._Linea__siguienteParadaDistancia,
			RedTables.Properties._Linea__siguienteParadaTiempo
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LineaBus = {
			RedTables.Properties._Linea__codigo,
			RedTables.Properties._Linea__descuentos,
			RedTables.Properties._Linea__horaApertura,
			RedTables.Properties._Linea__horaCierre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RedTables.Properties._Linea__paradas,
			RedTables.Properties._Linea__siguienteParadaDistancia,
			RedTables.Properties._Linea__siguienteParadaTiempo
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LineaMetro = {
			RedTables.Properties._Linea__codigo,
			RedTables.Properties._LineaMetro__color,
			RedTables.Properties._Linea__descuentos,
			RedTables.Properties._Linea__horaApertura,
			RedTables.Properties._Linea__horaCierre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RedTables.Properties._Linea__paradas,
			RedTables.Properties._Linea__siguienteParadaDistancia,
			RedTables.Properties._Linea__siguienteParadaTiempo
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LineaTren = {
			RedTables.Properties._Linea__codigo,
			RedTables.Properties._Linea__descuentos,
			RedTables.Properties._LineaTren__diurna,
			RedTables.Properties._Linea__horaApertura,
			RedTables.Properties._Linea__horaCierre,
			RedTables.Properties._LineaTren__nocturna,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RedTables.Properties._Linea__paradas,
			RedTables.Properties._Linea__siguienteParadaDistancia,
			RedTables.Properties._Linea__siguienteParadaTiempo
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Parada = {
			RedTables.Properties._Parada__accesible,
			RedTables.Properties._Parada__aparcamientoGrat,
			RedTables.Properties._Parada__aseos,
			RedTables.Properties._Parada__bicicletas,
			RedTables.Properties._Parada__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RedTables.Properties._Parada__transbordo
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RedTransporte = {
			RedTables.Properties._RedTransporte__lineas,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RedTables.Properties._RedTransporte__paradas,
			RedTables.Properties._RedTransporte__zonasTarifacion
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Transbordos = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ZonaTarifacion = {
			RedTables.Properties._ZonaTarifacion__enumeracion,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RedTables.Properties._ZonaTarifacion__tarifaBus,
			RedTables.Properties._ZonaTarifacion__tarifaMetro,
			RedTables.Properties._ZonaTarifacion__tarifaTren
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Colores__Colores.initProperties(_Colores);
			Fragments._Descuento__Descuento.initProperties(_Descuento);
			Fragments._Linea__Linea.initProperties(_Linea);
			Fragments._LineaBus__LineaBus.initProperties(_LineaBus);
			Fragments._LineaMetro__LineaMetro.initProperties(_LineaMetro);
			Fragments._LineaTren__LineaTren.initProperties(_LineaTren);
			Fragments._Parada__Parada.initProperties(_Parada);
			Fragments._RedTransporte__RedTransporte.initProperties(_RedTransporte);
			Fragments._Transbordos__Transbordos.initProperties(_Transbordos);
			Fragments._ZonaTarifacion__ZonaTarifacion.initProperties(_ZonaTarifacion);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RedTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _Colores__Rojo = new EcoreExecutorEnumerationLiteral(RedPackage.Literals.COLORES.getEEnumLiteral("Rojo"), Types._Colores, 0);
		public static final EcoreExecutorEnumerationLiteral _Colores__Verde = new EcoreExecutorEnumerationLiteral(RedPackage.Literals.COLORES.getEEnumLiteral("Verde"), Types._Colores, 1);
		public static final EcoreExecutorEnumerationLiteral _Colores__Azul = new EcoreExecutorEnumerationLiteral(RedPackage.Literals.COLORES.getEEnumLiteral("Azul"), Types._Colores, 2);
		public static final EcoreExecutorEnumerationLiteral _Colores__Amarillo = new EcoreExecutorEnumerationLiteral(RedPackage.Literals.COLORES.getEEnumLiteral("Amarillo"), Types._Colores, 3);
		public static final EcoreExecutorEnumerationLiteral _Colores__Negro = new EcoreExecutorEnumerationLiteral(RedPackage.Literals.COLORES.getEEnumLiteral("Negro"), Types._Colores, 4);
		public static final EcoreExecutorEnumerationLiteral _Colores__Blanco = new EcoreExecutorEnumerationLiteral(RedPackage.Literals.COLORES.getEEnumLiteral("Blanco"), Types._Colores, 5);
		public static final EcoreExecutorEnumerationLiteral _Colores__Morado = new EcoreExecutorEnumerationLiteral(RedPackage.Literals.COLORES.getEEnumLiteral("Morado"), Types._Colores, 6);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Colores = {
			_Colores__Rojo,
			_Colores__Verde,
			_Colores__Azul,
			_Colores__Amarillo,
			_Colores__Negro,
			_Colores__Blanco,
			_Colores__Morado
		};

		public static final EcoreExecutorEnumerationLiteral _Transbordos__Corto = new EcoreExecutorEnumerationLiteral(RedPackage.Literals.TRANSBORDOS.getEEnumLiteral("Corto"), Types._Transbordos, 0);
		public static final EcoreExecutorEnumerationLiteral _Transbordos__Largo = new EcoreExecutorEnumerationLiteral(RedPackage.Literals.TRANSBORDOS.getEEnumLiteral("Largo"), Types._Transbordos, 1);
		public static final EcoreExecutorEnumerationLiteral _Transbordos__NoPermitido = new EcoreExecutorEnumerationLiteral(RedPackage.Literals.TRANSBORDOS.getEEnumLiteral("NoPermitido"), Types._Transbordos, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Transbordos = {
			_Transbordos__Corto,
			_Transbordos__Largo,
			_Transbordos__NoPermitido
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Colores.initLiterals(_Colores);
			Types._Transbordos.initLiterals(_Transbordos);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RedTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new RedTables();
	}

	private RedTables() {
		super(RedPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		RedPackage.Literals.LINEA_BUS,
		RedPackage.Literals.LINEA_METRO,
		RedPackage.Literals.LINEA_TREN,
		RedPackage.Literals.PARADA
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
