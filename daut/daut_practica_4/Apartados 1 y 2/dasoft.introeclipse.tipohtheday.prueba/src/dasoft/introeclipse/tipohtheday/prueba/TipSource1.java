package dasoft.introeclipse.tipohtheday.prueba;

import java.util.ArrayList;
import java.util.List;
import dasoft.introeclipse.tipoftheday.handlers.ITipSource;

public class TipSource1 implements ITipSource {

	@Override
	public List<String> getTips() {
		List<String> consejos = new ArrayList<String>();
		consejos.add("Fin de semana");
		consejos.add("Vacaciones");
		
		return consejos;
	}

}
