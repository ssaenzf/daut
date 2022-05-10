package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class PanelResultado extends JPanel {
	
	private GuiCuestionario gui = null;
		
		public PanelResultado(GuiCuestionario gui) {
		this.gui = gui;
		this.setLayout(new GridLayout(-1,1));
		this.setBorder(new EmptyBorder(10,10,10,10));
		
		// Solo categorías sin subcategorías
		int categoria2_ok = 0, categoria2_nok = 0;
		int categoria3_ok = 0, categoria3_nok = 0;
		int categoria4_ok = 0, categoria4_nok = 0;
		
		if (gui.isPreguntaRespondida(GuiCuestionario.PANEL_PREG1)) {
			if (gui.isRespuestaCorrecta(GuiCuestionario.PANEL_PREG1)) 
				 categoria2_ok++;
			else categoria2_nok++;
		}
		if (gui.isPreguntaRespondida(GuiCuestionario.PANEL_PREG2)) {
			if (gui.isRespuestaCorrecta(GuiCuestionario.PANEL_PREG2)) 
				 categoria3_ok++;
			else categoria3_nok++;
		}
		if (gui.isPreguntaRespondida(GuiCuestionario.PANEL_PREG3)) {
			if (gui.isRespuestaCorrecta(GuiCuestionario.PANEL_PREG3)) 
				 categoria3_ok++;
			else categoria3_nok++;
		}
		if (gui.isPreguntaRespondida(GuiCuestionario.PANEL_PREG4)) {
			if (gui.isRespuestaCorrecta(GuiCuestionario.PANEL_PREG4)) 
				 categoria4_ok++;
			else categoria4_nok++;
		}
		
		this.add(new JLabel("Categoria4"));
		this.add(new JLabel("   - Correctas:   "+categoria2_ok));
		this.add(new JLabel("   - Incorrectas: "+categoria2_nok));
		this.add(new JLabel("Categoria2"));
		this.add(new JLabel("   - Correctas:   "+categoria3_ok));
		this.add(new JLabel("   - Incorrectas: "+categoria3_nok));
		this.add(new JLabel("Categoria3"));
		this.add(new JLabel("   - Correctas:   "+categoria4_ok));
		this.add(new JLabel("   - Incorrectas: "+categoria4_nok));
		
		this.add(new JLabel("Nota: "+ getResultado()));
		
		JButton button = new JButton("Cerrar");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.setVisible(false);
				gui.dispose();		
			}
		});
		this.add(button);
	}
	
	private double getResultado() {
		double resultado = 0.0;
		if (gui.isRespuestaCorrecta(GuiCuestionario.PANEL_PREG1)) {
			resultado += 1.0;
		} else {
			resultado += -0.5;
		}		
		if (gui.isRespuestaCorrecta(GuiCuestionario.PANEL_PREG2)) {
			resultado += 0.5;
		} else {
			resultado += -0.5;
		}		
		if (gui.isRespuestaCorrecta(GuiCuestionario.PANEL_PREG3)) {
			resultado += 0.5;
		} else {
			resultado += -0.5;
		}		
		if (gui.isRespuestaCorrecta(GuiCuestionario.PANEL_PREG4)) {
			resultado += 0.5;
		} else {
			resultado += -0.5;
		}		
		return resultado;
	}			
}
