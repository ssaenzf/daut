package dasoft.introeclipse.wizard.handlers;

import java.util.Map;
import java.util.Set;

public interface IWizardSource {
	public String getTipoProyecto(); 						// Tipo de proyecto 
	public Set <String> getFicherosPredefinido();			// Ficheros con nombre predefinido
	public Set <String> getCarpetasPredefinido();			// Carpetas con nombre predefinido
	public Set <String> getFicherosConfigurable();			// Ficheros con nombre configurable
	public Set <String> getCarpetasConfigurable();			// Carpetas con nombre configurable
	public Map<String, String> getContenidoCarpeta();		// Para cada fichero cuál es su carpeta, y contenido donde se creará
}	
