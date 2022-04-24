package red.handler;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import red.RedTransporte;


public class RedHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Obtener el fichero seleccionado
		IFile file = null;
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
		Object first = ((IStructuredSelection)selection).getFirstElement();
		file = (IFile)Platform.getAdapterManager().getAdapter(first, IFile.class);
		if (file == null)
		if (first instanceof IAdaptable)
		file = (IFile)((IAdaptable)first).getAdapter(IFile.class);
		}
		try {
		// Cargar el fichero seleccionado en un objeto Resource
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createURI(file.getRawLocationURI().toString()));
		resource.load(null);
		// Obtener el objeto raíz del modelo. Sustituye RedTransporte por la clase raíz de tu meta-modelo.
		RedTransporte modelo = (RedTransporte)(resource.getContents().get(0));
		// Incluir el código que se pide implementar en el apartado 3
		MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell(),
		"Sustituir mensaje por la funcionalidad del apartado 3",
		"Sustituir mensaje por la funcionalidad del apartado 3");
		}
		catch (Exception e) { e.printStackTrace(); }
		
		return Status.OK;
	}
}