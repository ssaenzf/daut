package dasoft.introeclipse.wizard.handlers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import dasoft.introeclipse.wizard.handlers.IWizardSource;

import org.eclipse.jface.window.Window;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;


public class WizardHandler extends AbstractHandler {
	
	// Cuadro de dialogo donde el usuario escribira el nombre del proyecto y el nombre
	// de ficheros y carpetas configurable
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		CuadroTextoUsuario dialog = new CuadroTextoUsuario(window.getShell());
		dialog.create();
		String nombre_proyecto = null;
	    List<String> ficheros_configurables = null;
	    List<String> carpetas_configurables = null;
		if (dialog.open() == Window.OK) {
		    nombre_proyecto = dialog.getProyecto();
		    ficheros_configurables = dialog.getFicheros();
		    carpetas_configurables = dialog.getCarpetas();
		}
		// Obtener valores de la interfaz implementada por puntos de extension y creacion del proyecto
		// con su configuración de carpetas y ficheros
		IProgressMonitor monitor = new NullProgressMonitor();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		// crear proyecto
		IProject project = root.getProject(nombre_proyecto);
		// Obtencion de la interfaz
		IExtensionRegistry registro = Platform.getExtensionRegistry();
		IConfigurationElement[] extensiones =
		registro.getConfigurationElementsFor("dasoft.introeclipse.wizard.wizardsource");
		for (IConfigurationElement e : extensiones) {
			if (e.getName().equals("WizardSource")) {
				try {
					IWizardSource fuenteWizard = (IWizardSource) e.createExecutableExtension("class");
					String nombreFuente = (String) e.getAttribute("name");
					String tipo_proyecto = fuenteWizard.getTipoProyecto(); 							// Tipo de proyecto 
					Set<String> ficheros_predefinido = fuenteWizard.getFicherosPredefinido();		// Ficheros con nombre predefinido
					Set<String> carpetas_predefinido = fuenteWizard.getCarpetasPredefinido();		// Carpetas con nombre predefinido
					Set<String> ficheros_configurable = fuenteWizard.getFicherosConfigurable();		// Ficheros con nombre configurable
					for(String fichero : ficheros_configurable) {
						ficheros_configurables.add(fichero);
					}
					Set<String> carpetas_configurable = fuenteWizard.getCarpetasConfigurable();		// Carpetas con nombre configurable
					for(String fichero : carpetas_configurable) {
						carpetas_configurables.add(fichero);
					}
					Map<String, String> carpeta_contenido = fuenteWizard.getContenidoCarpeta();		// Carpeta  y contenido de cada fichero
				}
				catch (CoreException exception) {
					exception.printStackTrace();
				}
			}
		}
		try {
			project.create(monitor);
			project.open(monitor);
			// Iterar por ficheros y carpetas configurables
			
			// crear carpeta en el proyecto
			// Iteracion por carpetas predefinidas
			//for getCarpetasPredefinido()
			IFolder folder = project.getFolder("nombre-carpeta");
			folder.create(true, true, monitor);
			// crear fichero en el proyecto
			IFile file = project.getFile("nombre-fichero.txt");
			file.create(new ByteArrayInputStream("texto".getBytes("UTF-8")), false, monitor);
		}
		catch (CoreException | UnsupportedEncodingException e) { e.printStackTrace(); }
		return null;
	}
}
