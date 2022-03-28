package dasoft.introeclipse.wizard.handlers;

import java.util.Map;
import java.util.Set;

public interface IWizardSource {
	public String getTipoProyecto(); 						// Tipo de proyecto 
	public Set <String> getFicherosPredefinido();			// Ficheros con nombre predefinido
	public Set <String> getCarpetasPredefinido();			// Carpetas con nombre predefinido
	public Set <String> getFicherosConfigurable();			// Ficheros con nombre configurable
	public Set <String> getCarpetasConfigurable();			// Carpetas con nombre configurable
	public Map<String, String> getCarpetaFichero();			// Para cada fichero cu�l es su carpeta
	public Map<String, String> getContenidoFichero();		// Para cada fichero cu�l sera su contenido
	public Boolean validacionCarpeta(String carpeta);		// Funci�n para validaci�n nombre de la carpeta
	public Boolean validacionFichero(String fichero);		// Funci�n para validaci�n nombre del fichero
}	
