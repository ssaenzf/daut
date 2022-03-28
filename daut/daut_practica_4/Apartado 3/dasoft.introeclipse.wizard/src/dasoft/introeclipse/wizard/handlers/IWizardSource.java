package dasoft.introeclipse.wizard.handlers;

import java.util.Map;
import java.util.Set;

public interface IWizardSource {
	public String getTipoProyecto(); 						// Tipo de proyecto 
	public Set <String> getFicherosPredefinido();			// Ficheros con nombre predefinido
	public Set <String> getCarpetasPredefinido();			// Carpetas con nombre predefinido
	public Set <String> getFicherosConfigurable();			// Ficheros con nombre configurable
	public Set <String> getCarpetasConfigurable();			// Carpetas con nombre configurable
	public Map<String, String> getCarpetaFichero();			// Para cada fichero cuál es su carpeta
	public Map<String, String> getContenidoFichero();		// Para cada fichero cuál sera su contenido
	public Boolean validacionCarpeta(String carpeta);		// Función para validación nombre de la carpeta
	public Boolean validacionFichero(String fichero);		// Función para validación nombre del fichero
}	
