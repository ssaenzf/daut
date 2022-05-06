package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class PanelResultado extends JPanel {
	
	public PanelResultado(GuiCuestionario gui) {
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
				 categoria2_ok++;
			else categoria2_nok++;
		}
		if (gui.isPreguntaRespondida(GuiCuestionario.PANEL_PREG4)) {
			if (gui.isRespuestaCorrecta(GuiCuestionario.PANEL_PREG4)) 
				 categoria4_ok++;
			else categoria4_nok++;
		}
		LinkedHashMap<String, List<Integer>> map = new LinkedHashMap<String, List<Integer>>();
		this.add(new JLabel("Categoria4"));
		this.add(new JLabel("   - Correctas:   "+categoria1_ok));
		this.add(new JLabel("   - Incorrectas: "+categoria1_nok));
		List<Integer> lista = Arrays.asList(categoria1_ok, categoria1_nok);
		map.put(cuestionario.impl.CategoriaImpl@557e1a36 (name: Categoria4, dificultad: 1.5), lista)
		this.add(new JLabel("Categoria2"));
		this.add(new JLabel("   - Correctas:   "+categoria2_ok));
		this.add(new JLabel("   - Incorrectas: "+categoria2_nok));
		List<Integer> lista = Arrays.asList(categoria2_ok, categoria2_nok);
		map.put(cuestionario.impl.CategoriaImpl@238aa5e5 (name: Categoria2, dificultad: 2.0), lista)
		this.add(new JLabel("Categoria3"));
		this.add(new JLabel("   - Correctas:   "+categoria3_ok));
		this.add(new JLabel("   - Incorrectas: "+categoria3_nok));
		List<Integer> lista = Arrays.asList(categoria3_ok, categoria3_nok);
		map.put(cuestionario.impl.CategoriaImpl@3a2bc673 (name: Categoria3, dificultad: 2.0), lista)
		
		this.add(new JLabel("Nota: "+  getResultado(map));
		
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
}
