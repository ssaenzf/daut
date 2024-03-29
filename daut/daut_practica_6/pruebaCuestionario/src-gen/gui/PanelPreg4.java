package gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class PanelPreg4 extends JPanel {
	
	private JRadioButton respuesta1;
	private JRadioButton respuesta2;
	private JRadioButton respuesta3;
	private JRadioButton respuesta4;
	
	private boolean respondida = false;
	
	public PanelPreg4 (GuiCuestionario gui) {
	
		this.setLayout(new BorderLayout());
		this.setBorder(new EmptyBorder(10,10,10,10));
		
		// categoria
		this.add(new JLabel("Categoria3"), BorderLayout.NORTH);
		
		// pregunta
		JPanel panelPregunta = new JPanel(new GridBagLayout());
		panelPregunta.setBorder(new EmptyBorder(20,0,20,0));
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill   = GridBagConstraints.HORIZONTAL; 
		c.gridy  = 0;
		panelPregunta.add(new JLabel("Enunciado 4"), c);
		
		// opciones
		ButtonGroup group = new ButtonGroup();
		respuesta1 = new JRadioButton("Res1");
		c.gridy++;  panelPregunta.add(respuesta1, c);
		group.add(respuesta1);
		respuesta2 = new JRadioButton("Res2");
		c.gridy++;  panelPregunta.add(respuesta2, c);
		group.add(respuesta2);
		respuesta3 = new JRadioButton("Res3");
		c.gridy++;  panelPregunta.add(respuesta3, c);
		group.add(respuesta3);
		respuesta4 = new JRadioButton("Res4");
		c.gridy++;  panelPregunta.add(respuesta4, c);
		group.add(respuesta4);
		
		this.add(panelPregunta, BorderLayout.WEST);
		
		// boton siguiente
		JButton button = new JButton("Siguiente");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				respondida = true;
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
		&&
		!respuesta3.isSelected() 
		&&
		!respuesta4.isSelected() 
		;	
	}
}
