package dasoft.introeclipse.wizard.handlers;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;


public class WizardHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		// Obtencion de la interfaz
		IExtensionRegistry registro = Platform.getExtensionRegistry();
		IConfigurationElement[] extensiones = registro.getConfigurationElementsFor("dasoft.introeclipse.wizard.wizardsource");
		// Ventana donde el usuario selecciona el tipo de proyecto
		ElementListSelectionDialog dialog_tipo_proyecto = new ElementListSelectionDialog(window.getShell(), new LabelProvider());
		int i = 0;
		// Se recorren las extensiones para saber cuantas son
		for (IConfigurationElement e : extensiones) {
			i += 1;
		}
		String lista_tipos_proyecto[] = new String[i];
		
		IWizardSource fuenteWizard = null;		// Tipo de proyecto 
		i = 0;
		for (IConfigurationElement e : extensiones) {
			try {
				fuenteWizard = (IWizardSource) e.createExecutableExtension("class");
				lista_tipos_proyecto[i] = fuenteWizard.getTipoProyecto();
			}
			catch (CoreException exception) {
				exception.printStackTrace();
			}	
			i += 1;
		}
		dialog_tipo_proyecto.setElements(lista_tipos_proyecto);
		dialog_tipo_proyecto.setTitle("Selecciona el tipo de proyecto");
		// user pressed cancel
		if (dialog_tipo_proyecto.open() != Window.OK) {
		        return false;
		}
		String result = (String)dialog_tipo_proyecto.getFirstResult();
		// Cuadro de dialogo donde el usuario escribira el nombre del proyecto y el nombre
		// de ficheros y carpetas configurable
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
		IProject project;
		try {
			project = root.getProject(nombre_proyecto);
		} catch (Exception e) {
			System.out.println("Error. No se ha indicado nombre para el proyecto.\n");
			return null;
		}
		Set<String> ficheros_predefinido = new HashSet<String>();				// Ficheros con nombre predefinido
		Set<String> carpetas_predefinido = new HashSet<String>();				// Carpetas con nombre predefinido
		Set<String> ficheros_configurable =new HashSet<String>();				// Ficheros con nombre configurable
		Set<String> carpetas_configurable = new HashSet<String>();				// Carpetas con nombre configurable
		Map<String, String> fichero_carpeta = new HashMap<String, String>();
		Map<String, String> fichero_contenido = new HashMap<String, String>();
		// Se recorren las extensiones para wizard source
		for (IConfigurationElement e : extensiones) {
			try {
				fuenteWizard = (IWizardSource) e.createExecutableExtension("class");
				if (fuenteWizard.getTipoProyecto().equals(result)) { 
					// Si es el seleccionado en la primera ventana se mete
					fuenteWizard = (IWizardSource) e.createExecutableExtension("class");							
					ficheros_predefinido = fuenteWizard.getFicherosPredefinido();		
					carpetas_predefinido = fuenteWizard.getCarpetasPredefinido();	
					ficheros_configurable = fuenteWizard.getFicherosConfigurable();	
					// Union de ficheros configurables dados por la extension y por el usuario
					ficheros_configurable.addAll (ficheros_configurables);
					carpetas_configurable.addAll (carpetas_configurables);
					fichero_carpeta = fuenteWizard.getCarpetaFichero();				// Carpeta para cada fichero
					fichero_contenido = fuenteWizard.getContenidoFichero();			// Contenido para cada fichero
				}
			}
			catch (CoreException exception) {
				exception.printStackTrace();
			}
		}

		try {
			// crear carpeta en el proyecto
			project.create(monitor);
			project.open(monitor);
			IFolder folder;
			
			// Creación carpetas predefinidas
			for(String carpeta : carpetas_predefinido) {
				folder = project.getFolder(carpeta);
				folder.create(true, true, monitor);
			}
			
			project.open(monitor);
			// Creación carpetas configurables
			for(String carpeta : carpetas_configurable) {
				Boolean validacion = fuenteWizard.validacionCarpeta(carpeta);
				if (validacion != true) {
					System.out.println("Error en validacion");
				}
				else {
					folder = project.getFolder(carpeta);
					folder.create(true, true, monitor);
				}
			}
			
			
			// Creacion ficheros predefinidos
			for (String fichero : ficheros_predefinido) {
			    // Obtengo su carpeta
			    String carpeta = fichero_carpeta.get(fichero);
			    // Obtendo su contenido
			    String contenido = fichero_contenido.get(fichero);
				IFile file;
				if (carpeta != null) {
					file = project.getFile("/" + carpeta + "/" + fichero);
				}
				else {
					file = project.getFile(fichero);
				}
				if (contenido != null) {
					file.create(new ByteArrayInputStream(contenido.getBytes("UTF-8")), false, monitor);
				}
				else {
					file.create(new ByteArrayInputStream("".getBytes("UTF-8")), false, monitor);
				}
			}	    
			
			// Creacion ficheros configurables
			for (String fichero : ficheros_configurable) {
				Boolean validacion = fuenteWizard.validacionFichero(fichero);
				if (validacion == false) {
					System.out.println("Error en validacion");
				}
				else {
					// Obtengo su carpeta
				    String carpeta = fichero_carpeta.get(fichero);
				    // Obtendo su contenido
				    String contenido = fichero_contenido.get(fichero);
					if (validacion != true) {
					}
					else {
						IFile file;
						if (carpeta != null) {
							file = project.getFile("/" + carpeta + "/" + fichero);
						}
						else {
							file = project.getFile(fichero);
						}
						if (contenido != null) {
							file.create(new ByteArrayInputStream(contenido.getBytes("UTF-8")), false, monitor);
						}
						else {
							file.create(new ByteArrayInputStream("".getBytes("UTF-8")), false, monitor);
						}
					}
				}	    
			}

		}
		catch (CoreException | UnsupportedEncodingException e) { e.printStackTrace(); }
		return null;
	}
}