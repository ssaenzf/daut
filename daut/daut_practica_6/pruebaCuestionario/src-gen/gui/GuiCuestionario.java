package gui;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GuiCuestionario extends JFrame {
	
	public final static String PANEL_PREG1 = "1";
	public final static String PANEL_PREG2 = "2";
	public final static String PANEL_PREG3 = "3";
	public final static String PANEL_PREG4 = "4";
	private JPanel     panel  = new JPanel();
	private CardLayout layout = new CardLayout();
	private PanelPreg1 preg1;
	private PanelPreg2 preg2;
	private PanelPreg3 preg3;
	private PanelPreg4 preg4;
	
	public GuiCuestionario () {
		
		preg1 = new PanelPreg1(this);
		preg2 = new PanelPreg2(this);
		preg3 = new PanelPreg3(this);
		preg4 = new PanelPreg4(this);
		panel.setLayout(layout);
		panel.add(preg1, PANEL_PREG1);
		panel.add(preg2, PANEL_PREG2);
		panel.add(preg3, PANEL_PREG3);
		panel.add(preg4, PANEL_PREG4);
		getContentPane().add(panel);
		
		// mostrar primera pregunta
		this.mostrarPregunta(PANEL_PREG1);
	}

	/**
	 * muestra cuestionario
	 */
	
	public void mostrarCuestionario () {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	/**
	 * devuelve si la pregunta se ha respondido 
	 */
	public boolean isPreguntaRespondida (String pregunta) {
		if (pregunta.equals(PANEL_PREG1)) return preg1.isPreguntaRespondida();
		if (pregunta.equals(PANEL_PREG2)) return preg2.isPreguntaRespondida();
		if (pregunta.equals(PANEL_PREG3)) return preg3.isPreguntaRespondida();
		if (pregunta.equals(PANEL_PREG4)) return preg4.isPreguntaRespondida();
		return false;
	}
	
	/**
	 * devuelve si la pregunta se ha respondido correctamente 
	 */
	public boolean isRespuestaCorrecta (String pregunta) {
		if (pregunta.equals(PANEL_PREG1)) return preg1.isRespuestaCorrecta();
		if (pregunta.equals(PANEL_PREG2)) return preg2.isRespuestaCorrecta();
		if (pregunta.equals(PANEL_PREG3)) return preg3.isRespuestaCorrecta();
		if (pregunta.equals(PANEL_PREG4)) return preg4.isRespuestaCorrecta();
		return false;
	}
	
	/**
	 * muestra pregunta del cuestionario
	 */
	public void mostrarPregunta (String pregunta) {
		layout.show(panel, pregunta);
	}
	
	/**
	 * muestra resultado del cuestionario
	 */
	public void mostrarResultado () {
		panel.add(new PanelResultado(this), "resultado");
		layout.show(panel, "resultado");
	}	
}

