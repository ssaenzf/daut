/**
 */
package red.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import red.util.RedAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RedItemProviderAdapterFactory extends RedAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link red.RedTransporte} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedTransporteItemProvider redTransporteItemProvider;

	/**
	 * This creates an adapter for a {@link red.RedTransporte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRedTransporteAdapter() {
		if (redTransporteItemProvider == null) {
			redTransporteItemProvider = new RedTransporteItemProvider(this);
		}

		return redTransporteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link red.LineaMetro} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineaMetroItemProvider lineaMetroItemProvider;

	/**
	 * This creates an adapter for a {@link red.LineaMetro}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLineaMetroAdapter() {
		if (lineaMetroItemProvider == null) {
			lineaMetroItemProvider = new LineaMetroItemProvider(this);
		}

		return lineaMetroItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link red.LineaTren} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineaTrenItemProvider lineaTrenItemProvider;

	/**
	 * This creates an adapter for a {@link red.LineaTren}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLineaTrenAdapter() {
		if (lineaTrenItemProvider == null) {
			lineaTrenItemProvider = new LineaTrenItemProvider(this);
		}

		return lineaTrenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link red.LineaBus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineaBusItemProvider lineaBusItemProvider;

	/**
	 * This creates an adapter for a {@link red.LineaBus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLineaBusAdapter() {
		if (lineaBusItemProvider == null) {
			lineaBusItemProvider = new LineaBusItemProvider(this);
		}

		return lineaBusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link red.ParadaBus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParadaBusItemProvider paradaBusItemProvider;

	/**
	 * This creates an adapter for a {@link red.ParadaBus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParadaBusAdapter() {
		if (paradaBusItemProvider == null) {
			paradaBusItemProvider = new ParadaBusItemProvider(this);
		}

		return paradaBusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link red.ParadaMetro} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParadaMetroItemProvider paradaMetroItemProvider;

	/**
	 * This creates an adapter for a {@link red.ParadaMetro}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParadaMetroAdapter() {
		if (paradaMetroItemProvider == null) {
			paradaMetroItemProvider = new ParadaMetroItemProvider(this);
		}

		return paradaMetroItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link red.ParadaTren} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParadaTrenItemProvider paradaTrenItemProvider;

	/**
	 * This creates an adapter for a {@link red.ParadaTren}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParadaTrenAdapter() {
		if (paradaTrenItemProvider == null) {
			paradaTrenItemProvider = new ParadaTrenItemProvider(this);
		}

		return paradaTrenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link red.Descuento} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescuentoItemProvider descuentoItemProvider;

	/**
	 * This creates an adapter for a {@link red.Descuento}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescuentoAdapter() {
		if (descuentoItemProvider == null) {
			descuentoItemProvider = new DescuentoItemProvider(this);
		}

		return descuentoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link red.ZonaTarifacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZonaTarifacionItemProvider zonaTarifacionItemProvider;

	/**
	 * This creates an adapter for a {@link red.ZonaTarifacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createZonaTarifacionAdapter() {
		if (zonaTarifacionItemProvider == null) {
			zonaTarifacionItemProvider = new ZonaTarifacionItemProvider(this);
		}

		return zonaTarifacionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (redTransporteItemProvider != null) redTransporteItemProvider.dispose();
		if (lineaMetroItemProvider != null) lineaMetroItemProvider.dispose();
		if (lineaTrenItemProvider != null) lineaTrenItemProvider.dispose();
		if (lineaBusItemProvider != null) lineaBusItemProvider.dispose();
		if (paradaBusItemProvider != null) paradaBusItemProvider.dispose();
		if (paradaMetroItemProvider != null) paradaMetroItemProvider.dispose();
		if (paradaTrenItemProvider != null) paradaTrenItemProvider.dispose();
		if (descuentoItemProvider != null) descuentoItemProvider.dispose();
		if (zonaTarifacionItemProvider != null) zonaTarifacionItemProvider.dispose();
	}

}
