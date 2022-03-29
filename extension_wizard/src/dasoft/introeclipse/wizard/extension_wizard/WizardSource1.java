package dasoft.introeclipse.wizard.extension_wizard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import dasoft.introeclipse.wizard.handlers.IWizardSource;

public class WizardSource1 implements IWizardSource {
	
	public String getTipoProyecto() {
		return "Java";
	}
	
	// Ficheros con nombre predefinido
	@Override
	public Set <String> getFicherosPredefinido() {
		String [] array_ficheros = new String[] {".classpath"};
		Set <String> conjunto = new HashSet<String>();
		for (String fichero : array_ficheros) {
			conjunto.add(fichero);
		}
		return conjunto;
	}
	
	// Carpetas con nombre predefinido	
	@Override
	public Set <String> getCarpetasPredefinido() {
		String [] array_carpetas = new String[] {"src", "bin"};
		Set <String> conjunto = new HashSet<String>();
		for (String carpeta : array_carpetas) {
			conjunto.add(carpeta);
		}
		return conjunto;
	}
	
	// Ficheros de nombre configurable
	@Override
	public Set <String> getFicherosConfigurable(){
		String [] array_ficheros = new String[] {"Clase principal del proyecto"};
		Set <String> conjunto = new HashSet<String>();
		for (String fichero : array_ficheros) {
			conjunto.add(fichero);
		}
		return conjunto;
	}
	
	// Carpetas con nombre configurable
	@Override
	public Set <String> getCarpetasConfigurable() {
		return new HashSet<String>();
	}
	
	// Para cada fichero cuál es su carpeta
	@Override
	public Map<String, String> getCarpetaFichero(){
		Map<String, String> mapa = new HashMap<String, String>();
		return mapa;
	}
	
	// Para cada fichero cuál sera su contenido
	@Override
	public Map<String, String> getContenidoFichero() {
		Map<String, String> mapa = new HashMap<String, String>();
		String fichero = ".classpath";
		String contenido = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
						 + "<classpath>\r\n"
						 + "<classpathentry kind=\"src\" path=\"src\"/>\r\n"
						 + "<classpathentry kind=\"output\" path=\"bin\"/>\r\n"
						 + "</classpath>";
		mapa.put(fichero, contenido);
		return mapa;
	}
	
	// Función para validación nombre de la carpeta
	@Override
	public Boolean validacionCarpeta(String carpeta) {
		return true;
	}
	
	// Función para validación nombre del fichero
	@Override
	public Boolean validacionFichero(String fichero) {
		if (Character.isUpperCase(fichero.charAt(0)) == false) {
			return false;
		}
		else {
			if (fichero.substring(fichero.length() - 5) != ".java") {
				return false;
			}
		}
		
		return true;
	}

}
