package dasoft.introeclipse.tipoftheday.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Bundle;
import org.eclipse.jface.dialogs.MessageDialog;

public class TipCommandHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		List<String> consejos = new ArrayList<String>();
		Bundle bundle = Platform.getBundle("dasoft.introeclipse.tipoftheday");
		URL fileURL = bundle.getEntry("data/consejos.txt");

		try {
		 InputStream is = fileURL.openStream();
		 BufferedReader in = new BufferedReader(new InputStreamReader(is));
		 String consejo;
		 while ((consejo = in.readLine()) != null) consejos.add(consejo);
		 in.close();
		 is.close();
		}
		catch (IOException e) { e.printStackTrace(); }
		
		// Nuevo
		IExtensionRegistry registro = Platform.getExtensionRegistry();
		IConfigurationElement[] extensiones =
		registro.getConfigurationElementsFor("dasoft.introeclipse.tipoftheday.tipsource");
		for (IConfigurationElement e : extensiones) {
			if (e.getName().equals("TipSource")) {
				try {
					ITipSource fuenteConsejos = (ITipSource) e.createExecutableExtension("class");
					String nombreFuente = (String) e.getAttribute("name");
					for (String consejo1 : fuenteConsejos.getTips()) consejos.add(consejo1);
				}
				catch (CoreException exception) {
					exception.printStackTrace();
				}
			}
		}
		
		int longitud = consejos.size();
		int pos = (int) Math.floor(Math.random()*longitud);
		String consejo = consejos.get(pos);
		
		MessageDialog.openInformation(
				window.getShell(),
				"Tipoftheday",
				consejo);
		return null;
	}
}
