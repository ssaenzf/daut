package red.handler;

import java.util.ArrayList;
import java.util.List;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import red.Linea;
import red.Parada;
import red.RedTransporte;
import red.Transbordos;


public class RedHandler extends AbstractHandler {
	
	public ContainerParadasTiemposTransbordos buscar_ruta(ContainerParadasTiemposTransbordos container, RedTransporte modelo, Linea linea, Parada parada1, Parada parada2) {
		List<Parada> paradas = new ArrayList<Parada>();
		List<Parada> paradas_visitadas = new ArrayList<Parada>();
		List<Parada> paradas_visitadas_aux = new ArrayList<Parada>();
		Transbordos transbordo_no_permitido = Transbordos.NO_PERMITIDO;
		List<Double> lista_tiempos = new ArrayList<Double>();
		lista_tiempos = linea.getSiguienteParadaTiempo();
		ContainerParadasTiemposTransbordos container2=null;
		ContainerParadasTiemposTransbordos seleccion = new ContainerParadasTiemposTransbordos(null, null, 10000, 10000);
		double tiempos = 0;
		paradas = linea.getParadas();
		int ind = paradas.indexOf(parada1);
		paradas = paradas.subList(ind, paradas.size());
		// Se recorre la sublista de paradas que van desde la parada 1 hasta el final
		Boolean encontrada = false;
		Boolean primera_parada = true;
		for (Parada parada : paradas) {
			if (parada == null) {
				break;
			}
				
			System.out.println("Parada iterada: " + parada);
			if (parada.getNombre().equals(parada2.getNombre())) {
				System.out.println("Encontrada parada");
				System.out.println(container.getParadas1());
				encontrada = true;
				break;
			}
			
			if (parada.getTransbordo() != transbordo_no_permitido && primera_parada==false) {
				for (Linea linea_aux: modelo.getLineas()) {
			    	List<Parada> lista_paradas = linea_aux.getParadas();
			    	ContainerParadasTiemposTransbordos container_aux = new ContainerParadasTiemposTransbordos(container.getParadas1(), container.getParadas2(), container.getTiempos(), container.getTransbordos()+1);
			    	if (lista_paradas.contains(parada)) {
			    		container2 = buscar_ruta(container_aux, modelo, linea_aux, parada, parada2);
			    	}
			    	// Comprobaciones de las mejores rutas
			    	if (container2 != null) {
			    		if (container2.getParadas1()!=null) {
				    		if (container2.getTiempos() < seleccion.getTiempos())  {
				    			seleccion.setTiempos(container2.getTiempos());
				    			seleccion.setParadas1(container2.getParadas1());
				    		}
			    		}
				    	if (container2.getParadas2()!=null) {
				    		if (container2.getTransbordos() < seleccion.getTransbordos())  {
				    			seleccion.setTransbordos(container2.getTransbordos());
				    			seleccion.setParadas2(container2.getParadas2());
				    		}
				    	}
			    	}
			    	
			    }
			}
			paradas_visitadas_aux = container.getParadas1();
			if (paradas_visitadas_aux != null) {
				paradas_visitadas_aux.add(parada);
				paradas_visitadas = paradas_visitadas_aux;
			}
			else {
				paradas_visitadas.add(parada);
			}
			if (paradas.size() != ind) {
			container.setParadas1(paradas_visitadas);
			}
			paradas_visitadas_aux = container.getParadas2();
			if (paradas_visitadas_aux != null) {
				paradas_visitadas_aux.add(parada);
				paradas_visitadas = paradas_visitadas_aux;
			}
			else {
				paradas_visitadas.add(parada);
			}
			if (paradas.size() != ind) {
				tiempos = container.getTiempos();
				paradas_visitadas.add(parada);
				container.setParadas2(paradas_visitadas);
				if (lista_tiempos.size() == ind) {
					break;
				}
				container.setTiempos(tiempos + lista_tiempos.get(ind));
			}
			primera_parada = false;
			ind += 1;
		}
		if (encontrada != false) {
			if (seleccion != null) {
	    		if (seleccion.getParadas1()!=null) {
		    		if (container.getTiempos() < seleccion.getTiempos())  {
		    			seleccion.setTiempos(container.getTiempos());
		    			seleccion.setParadas1(container.getParadas1());
		    		}
	    		} else {
	    			seleccion.setTiempos(container.getTiempos());
	    			seleccion.setParadas1(container.getParadas1());
	    		}
		    	if (seleccion.getParadas2()!=null) {
		    		if (seleccion.getTransbordos() > container.getTransbordos())  {
		    			seleccion.setTransbordos(container.getTransbordos());
		    			seleccion.setParadas2(container.getParadas2());
		    		}
		    	}
		    	else {
		    		seleccion.setTransbordos(container.getTransbordos());
	    			seleccion.setParadas2(container.getParadas2());
		    	}
	    	} 
			else {
				seleccion = container;
			}
		}	
		return seleccion;
	}
	public String obtencionParadas(RedTransporte modelo, String nombre_parada1, String nombre_parada2) {
		EList<Parada> paradas_posibles = modelo.getParadas();
		Parada parada1 = null;
		Parada parada2 = null;
		String texto = "";
	    ArrayList<String> nombres_paradas_posibles = new ArrayList<String>();
	    // Se obtienen los posibles nombres de paradas con el fin de comprobar
	    // que el usuario haya introducido nombres de paradas validos
	    for (Parada parada : paradas_posibles) {
	    	nombres_paradas_posibles.add(parada.getNombre());
	    }
	    if(!nombres_paradas_posibles.contains(nombre_parada1)) {
	    	 texto = "La parada introducida " + nombre_parada1 + " no existe";
	         return texto;
	    }
	    if(!nombres_paradas_posibles.contains(nombre_parada2)) {
	    	texto ="La parada introducida " + nombre_parada2 + " no existe";
	    	return texto;
	    }
	    if(nombre_parada1.equals(nombre_parada2)) {
	    	texto = "Los nombres para las dos paradas coinciden " + nombre_parada1;
	    	return texto;
	    }
	    for (Parada parada : paradas_posibles) {
	    	if(parada.getNombre().equals(nombre_parada1)) {
	    		parada1 = parada;
	    		System.out.println("Parada 1: " + parada1);
	    	}
	    	if(parada.getNombre().equals(nombre_parada2)) {
	    		parada2 = parada;
	    		System.out.println("Parada 2: " + parada2);
	    	}
	    }
	    ContainerParadasTiemposTransbordos seleccion = new ContainerParadasTiemposTransbordos(null, null, 10000, 10000);
	    ContainerParadasTiemposTransbordos container = null;
	    for (Linea linea: modelo.getLineas()) {
	    	EList<Parada> lista_paradas = linea.getParadas();
	    	// EL contenedor contendr� las rutas con menor distancia
	    	container = new ContainerParadasTiemposTransbordos(null, null, 0, 0);
	    	if (lista_paradas.contains(parada1)) {
	    		System.out.println("Busca ruta");
	    		container = buscar_ruta(container, modelo, linea, parada1, parada2);
	    	}
	    	// Comprobaciones de las mejores rutas
	    	if (lista_paradas.contains(parada2)) {
	    		System.out.println("Busca ruta");
	    		container = buscar_ruta(container, modelo, linea, parada2, parada1);
	    	}
	    	if (container != null) {
	    		// Comprobaciones de las mejores rutas
		    	if (container.getTiempos() < seleccion.getTiempos()) {
		    		seleccion.setTiempos(container.getTiempos());
		    		seleccion.setParadas1(container.getParadas1());
		    	}
		    	if (container.getTransbordos() < seleccion.getTransbordos()) {
		    		seleccion.setTransbordos(container.getTransbordos());
		    		seleccion.setParadas2(container.getParadas2());
		    	}
	    	}
	    }
	    texto += "Lista paradas con menor tiempo entre ambas rutas: ";
	    texto += container.getParadas1();
	    texto += " Tiempo: ";
	    texto += container.getTiempos();
	    texto += "\n";
	    texto += "Lista paradas con menor numero de transbordos: ";
	    texto += container.getParadas2();
	    texto += " Numero de transbordos: ";
	    texto += container.getTransbordos();
	    texto += "\n";
	    return texto;
	}

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
		// Obtener el objeto ra�z del modelo. Sustituye RedTransporte por la clase ra�z de tu meta-modelo.
		RedTransporte modelo = (RedTransporte)(resource.getContents().get(0));
		// Incluir el c�digo que se pide implementar en el apartado 3
		CustomAreaDialog dialog = new CustomAreaDialog(HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell());
		dialog.create();
		dialog.open();
		System.out.println("Nombre parada 1: " + dialog.getFirstName());
		System.out.println("Nombre parada 2: " + dialog.getLastName());
		String texto = obtencionParadas(modelo, dialog.getFirstName(), dialog.getLastName());
		MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell(), "Info", texto);
		}
		catch (Exception e) { e.printStackTrace(); }
		
		return Status.OK;
	}
}