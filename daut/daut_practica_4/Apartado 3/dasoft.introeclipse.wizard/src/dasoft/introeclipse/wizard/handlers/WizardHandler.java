package dasoft.introeclipse.wizard.handlers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
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
		Set<String> ficheros_configurables = new HashSet<String>();
		Set<String> carpetas_configurables = new HashSet<String>();
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
		IWizardSource fuenteWizard = null;
		String nombreFuente;
		String tipo_proyecto; 													// Tipo de proyecto 
		Set<String> ficheros_predefinido = new HashSet<String>();				// Ficheros con nombre predefinido
		Set<String> carpetas_predefinido = new HashSet<String>();				// Carpetas con nombre predefinido
		Set<String> ficheros_configurable =new HashSet<String>();				// Ficheros con nombre configurable
		Set<String> carpetas_configurable = new HashSet<String>();				// Carpetas con nombre configurable
		Map<String, String> fichero_carpeta = new HashMap<String, String>();
		Map<String, String> fichero_contenido = new HashMap<String, String>();
		for (IConfigurationElement e : extensiones) {
			if (e.getName().equals("WizardSource")) {
				try {
					fuenteWizard = (IWizardSource) e.createExecutableExtension("class");
					nombreFuente = (String) e.getAttribute("name");
					tipo_proyecto = fuenteWizard.getTipoProyecto(); 							
					ficheros_predefinido = fuenteWizard.getFicherosPredefinido();		
					carpetas_predefinido = fuenteWizard.getCarpetasPredefinido();		
					ficheros_configurable = fuenteWizard.getFicherosConfigurable();	
					// De momento para los ficheros configurables se hace la iterseccion de los disponibles
					// con el plugin y los dados por el usuario
					ficheros_configurable.retainAll(ficheros_configurables);
					carpetas_configurable.retainAll(carpetas_configurables);
					fichero_carpeta = fuenteWizard.getCarpetaFichero();				// Carpeta para cada fichero
					fichero_contenido = fuenteWizard.getContenidoFichero();			// Contenido para cada fichero
				}
				catch (CoreException exception) {
					exception.printStackTrace();
				}
			}
		}

		try {
			// crear carpeta en el proyecto
			project.create(monitor);
			project.open(monitor);
			
			// Creación carpetas configurables
			for(String carpeta : carpetas_configurable) {
				Boolean validacion = fuenteWizard.validacionCarpeta(carpeta);
				if (validacion != true) {
					System.out.println("Error en validacion");
				}
				else {
					IFolder folder = project.getFolder(carpeta);
					folder.create(true, true, monitor);
				}
			}
			// Creación carpetas predefinidas
			for(String carpeta : carpetas_predefinido) {
				Boolean validacion = fuenteWizard.validacionCarpeta(carpeta);
				if (validacion != true) {
					System.out.println("Error en validacion");
				}
				else {
					IFolder folder = project.getFolder(carpeta);
					folder.create(true, true, monitor);
				}
			}
			
			// Creacion ficheros predefinidos
			for (String fichero : ficheros_configurable) {
			    // Obtengo su carpeta
			    String carpeta = fichero_carpeta.get(fichero);
			    // Obtendo su contenido
			    String contenido = fichero_contenido.get(fichero);
			    Boolean validacion = fuenteWizard.validacionFichero(fichero);
				if (validacion != true) {
					System.out.println("Error en validacion");
				}
				else {
					IFile file = project.getFile(carpeta + fichero);
					file.create(new ByteArrayInputStream(contenido.getBytes("UTF-8")), false, monitor);
				}	    
			}
			
			// Creacion ficheros predefinidos
			for (String fichero : ficheros_predefinido) {
				// Obtengo su carpeta
				String carpeta = fichero_carpeta.get(fichero);
				// Obtendo su contenido
				String contenido = fichero_contenido.get(fichero);
				Boolean validacion = fuenteWizard.validacionFichero(fichero);
				if (validacion != true) {
					System.out.println("Error en validacion");
				}
				else {
					IFile file = project.getFile(carpeta + fichero);
					file.create(new ByteArrayInputStream(contenido.getBytes("UTF-8")), false, monitor);
					}	    
				}
		}
		catch (CoreException | UnsupportedEncodingException e) { e.printStackTrace(); }
		return null;
	}
}