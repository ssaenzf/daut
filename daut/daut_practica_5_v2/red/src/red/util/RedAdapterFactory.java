/**
 */
package red.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import red.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see red.RedPackage
 * @generated
 */
public class RedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedSwitch<Adapter> modelSwitch =
		new RedSwitch<Adapter>() {
			@Override
			public Adapter caseRedTransporte(RedTransporte object) {
				return createRedTransporteAdapter();
			}
			@Override
			public Adapter caseLinea(Linea object) {
				return createLineaAdapter();
			}
			@Override
			public Adapter caseLineaMetro(LineaMetro object) {
				return createLineaMetroAdapter();
			}
			@Override
			public Adapter caseLineaTren(LineaTren object) {
				return createLineaTrenAdapter();
			}
			@Override
			public Adapter caseLineaBus(LineaBus object) {
				return createLineaBusAdapter();
			}
			@Override
			public Adapter caseParada(Parada object) {
				return createParadaAdapter();
			}
			@Override
			public Adapter caseDescuento(Descuento object) {
				return createDescuentoAdapter();
			}
			@Override
			public Adapter caseZonaTarifacion(ZonaTarifacion object) {
				return createZonaTarifacionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link red.RedTransporte <em>Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see red.RedTransporte
	 * @generated
	 */
	public Adapter createRedTransporteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link red.Linea <em>Linea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see red.Linea
	 * @generated
	 */
	public Adapter createLineaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link red.LineaMetro <em>Linea Metro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see red.LineaMetro
	 * @generated
	 */
	public Adapter createLineaMetroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link red.LineaTren <em>Linea Tren</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see red.LineaTren
	 * @generated
	 */
	public Adapter createLineaTrenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link red.LineaBus <em>Linea Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see red.LineaBus
	 * @generated
	 */
	public Adapter createLineaBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link red.Parada <em>Parada</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see red.Parada
	 * @generated
	 */
	public Adapter createParadaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link red.Descuento <em>Descuento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see red.Descuento
	 * @generated
	 */
	public Adapter createDescuentoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link red.ZonaTarifacion <em>Zona Tarifacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see red.ZonaTarifacion
	 * @generated
	 */
	public Adapter createZonaTarifacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RedAdapterFactory
