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
	 * muestra pregunta del cuestionario
	 */
	public void mostrarPregunta (String pregunta) {
		layout.show(panel, pregunta);
	}
}

