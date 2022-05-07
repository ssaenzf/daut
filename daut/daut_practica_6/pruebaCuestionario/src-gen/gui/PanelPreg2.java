package gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class PanelPreg2 extends JPanel {
	
	private JRadioButton respuesta1;
	private JRadioButton respuesta2;
	
	private boolean respondida = false;
	
	public PanelPreg2 (GuiCuestionario gui) {
	
		this.setLayout(new BorderLayout());
		this.setBorder(new EmptyBorder(10,10,10,10));
		
		// categoria
		this.add(new JLabel("Categoria2"), BorderLayout.NORTH);
		
		// pregunta
		JPanel panelPregunta = new JPanel(new GridBagLayout());
		panelPregunta.setBorder(new EmptyBorder(20,0,20,0));
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill   = GridBagConstraints.HORIZONTAL; 
		c.gridy  = 0;
		panelPregunta.add(new JLabel("Enunciado 2"), c);
		
		// opciones
		respuesta1 = new JRadioButton("Res1");
		c.gridy++;  panelPregunta.add(respuesta1, c);
		respuesta2 = new JRadioButton("Res2");
		c.gridy++;  panelPregunta.add(respuesta2, c);
		
		this.add(panelPregunta, BorderLayout.WEST);
		
		// boton siguiente
		JButton button = new JButton("Siguiente");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				respondida = true;
				if (!gui.isPreguntaRespondida(GuiCuestionario.PANEL_PREG1)){
					gui.mostrarPregunta(GuiCuestionario.PANEL_PREG1);
					return;
				}
				if (!gui.isPreguntaRespondida(GuiCuestionario.PANEL_PREG3)){
					gui.mostrarPregunta(GuiCuestionario.PANEL_PREG3);
					return;
				}
				if (!gui.isPreguntaRespondida(GuiCuestionario.PANEL_PREG4)){
					gui.mostrarPregunta(GuiCuestionario.PANEL_PREG4);
					return;
				}
				gui.mostrarResultado();
			}			
		});
		this.add(button, BorderLayout.SOUTH); 
	}
	
	public boolean isPreguntaRespondida() {
		return respondida;
	}
	
	public boolean isRespuestaCorrecta() {
		return
		respuesta1.isSelected() 
		&&
		!respuesta2.isSelected() 
		;	
	}
}
