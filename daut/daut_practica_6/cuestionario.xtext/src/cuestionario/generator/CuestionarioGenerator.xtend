/*
 * generated by Xtext 2.26.0
 */
package cuestionario.generator

import cuestionario.Pregunta
import cuestionario.PreguntaUnica
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import cuestionario.PreguntaMultiple
import cuestionario.Categoria

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CuestionarioGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("main/Main.java", generarMain());
		fsa.generateFile("gui/GuiCuestionario.java", generarGUICuestionario(resource.allContents.filter(Pregunta).toList))
		fsa.generateFile("gui/PanelResultado.java", generarPanelResultado(resource.allContents.filter(Pregunta).toList, resource.allContents.filter(Categoria).toList))
		for (preg : resource.allContents.filter(Pregunta).toList) {
			fsa.generateFile("gui/Panel" + preg.getName() + ".java", generarPanelPregunta(preg, resource.allContents.filter(Pregunta).toList));
		}
	}
	
	def generarMain() {
		'''
			package main;
			
			import gui.GuiCuestionario;
			
			public class Main {
				public static void main(String[] args) {
					GuiCuestionario questionnaire = new GuiCuestionario();
					questionnaire.mostrarCuestionario();
				}
			}
		'''
	}
	
	def generarGUICuestionario(List<Pregunta> preguntas) {
		var i = 0
		'''
			package gui;
			
			import java.awt.CardLayout;
			
			import javax.swing.JFrame;
			import javax.swing.JPanel;
			
			@SuppressWarnings("serial")
			public class GuiCuestionario extends JFrame {
				
				�FOR pregunta : preguntas�
						public final static String PANEL_�pregunta.getName().toUpperCase().replace(" ","")� = "�i = i + 1�";
				�ENDFOR�
				private JPanel     panel  = new JPanel();
				private CardLayout layout = new CardLayout();
				�FOR pregunta : preguntas�
						private Panel�pregunta.getName().replace(" ","")� �pregunta.getName().toLowerCase().replace(" ","")�;
				�ENDFOR�
				
				public GuiCuestionario () {
					
					�FOR pregunta : preguntas�
						�pregunta.getName().toLowerCase().replace(" ","")� = new Panel�pregunta.getName()�(this);
					�ENDFOR�
					panel.setLayout(layout);
					�FOR pregunta : preguntas�
						panel.add(�pregunta.getName().toLowerCase().replace(" ","")�, PANEL_�pregunta.getName().toUpperCase().replace(" ","")�);
					�ENDFOR�
					getContentPane().add(panel);
					
					// mostrar primera pregunta
					�FOR pregunta : preguntas�
						�IF (pregunta.isInicial)�
							this.mostrarPregunta(PANEL_�pregunta.getName().toUpperCase().replace(" ","")�);
						�ENDIF�
					�ENDFOR�
				}
			
				/**
				 * muestra cuestionario
				 */
				
				public void mostrarCuestionario () {
					this.setTitle("Cuestionario");
					this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					this.pack();
					this.setVisible(true);
				}
				
				/**
				 * devuelve si la pregunta se ha respondido 
				 */
				public boolean isPreguntaRespondida (String pregunta) {
					�FOR pregunta : preguntas�
						if (pregunta.equals(PANEL_�pregunta.getName().toUpperCase().replace(" ","")�)) return �pregunta.getName().toLowerCase().replace(" ","")�.isPreguntaRespondida();
					�ENDFOR�
					return false;
				}
				
				/**
				 * devuelve si la pregunta se ha respondido correctamente 
				 */
				public boolean isRespuestaCorrecta (String pregunta) {
					�FOR pregunta : preguntas�
						if (pregunta.equals(PANEL_�pregunta.getName().toUpperCase().replace(" ","")�)) return �pregunta.getName().toLowerCase().replace(" ","")�.isRespuestaCorrecta();
					�ENDFOR�
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
			
		'''
	}
	
	def generarPanelPregunta(Pregunta pregunta, List<Pregunta> preguntas) {
		'''
		package gui;
		
		import java.awt.BorderLayout;
		import java.awt.GridBagConstraints;
		import java.awt.GridBagLayout;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		
		import javax.swing.JButton;
		�IF pregunta instanceof PreguntaUnica�
			import javax.swing.ButtonGroup;
			import javax.swing.JRadioButton;
		�ELSE�
			import javax.swing.JCheckBox;
		�ENDIF�
		import javax.swing.JLabel;
		import javax.swing.JPanel;
		import javax.swing.border.EmptyBorder;
		
		@SuppressWarnings("serial")
		public class Panel�pregunta.getName().replace(" ","")� extends JPanel {
			
			�IF pregunta instanceof PreguntaUnica�
				�FOR resp: pregunta.getRespuestas()�
					private JRadioButton �resp.getName().toLowerCase().replace(" ","")�;
				�ENDFOR�
			�ELSEIF pregunta instanceof PreguntaMultiple�
				�FOR resp: pregunta.getRespuestas()�
					private JCheckBox �resp.getName().toLowerCase().replace(" ","")�;
				�ENDFOR�
			�ENDIF�
			
			private boolean respondida = false;
			
			public Panel�pregunta.getName().replace(" ","")� (GuiCuestionario gui) {
			
				this.setLayout(new BorderLayout());
				this.setBorder(new EmptyBorder(10,10,10,10));
				
				// categoria
				this.add(new JLabel("�pregunta.getCategoria().getName()�"), BorderLayout.NORTH);
				
				// pregunta
				JPanel panelPregunta = new JPanel(new GridBagLayout());
				panelPregunta.setBorder(new EmptyBorder(20,0,20,0));
				GridBagConstraints c = new GridBagConstraints();
				c.anchor = GridBagConstraints.WEST;
				c.fill   = GridBagConstraints.HORIZONTAL; 
				c.gridy  = 0;
				panelPregunta.add(new JLabel("�pregunta.getEnunciado()�"), c);
				
				// opciones
				�IF pregunta instanceof PreguntaUnica�
					ButtonGroup group = new ButtonGroup();
					�FOR resp: pregunta.getRespuestas()�
						�resp.getName().toLowerCase().replace(" ","")� = new JRadioButton("�resp.getOpcion()�");
						c.gridy++;  panelPregunta.add(�resp.getName().toLowerCase().replace(" ","")�, c);
						group.add(�resp.getName().toLowerCase().replace(" ","")�);
					�ENDFOR�
				�ELSEIF pregunta instanceof PreguntaMultiple�
					�FOR resp: pregunta.getRespuestas()�
						�resp.getName().toLowerCase().replace(" ","")� = new JCheckBox("�resp.getOpcion()�");
						c.gridy++;  panelPregunta.add(�resp.getName().toLowerCase().replace(" ","")�, c);
					�ENDFOR�
				�ENDIF�
				
				this.add(panelPregunta, BorderLayout.WEST);
				
				// boton siguiente
				JButton button = new JButton("Siguiente");
				button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						respondida = true;
						�IF pregunta.isInicial�
						if (isRespuestaCorrecta()) 
						 	gui.mostrarPregunta(GuiCuestionario.PANEL_�pregunta.getSiguientePreguntaAcierto().getName().toUpperCase().replace(" ","")�); // respuesta correcta
						else 
						 	gui.mostrarPregunta(GuiCuestionario.PANEL_�pregunta.getSiguientePreguntaError.getName().toUpperCase().replace(" ","")�); // respuesta incorrecta
						�ELSE�
							�FOR p: preguntas�
								�IF pregunta.getName() != p.getName()�
									if (!gui.isPreguntaRespondida(GuiCuestionario.PANEL_�p.getName().toUpperCase().replace(" ","")�)){
										gui.mostrarPregunta(GuiCuestionario.PANEL_�p.getName().toUpperCase().replace(" ","")�);
										return;
									}
								�ENDIF�
							�ENDFOR�
							gui.mostrarResultado();
						�ENDIF�
					}			
				});
				this.add(button, BorderLayout.SOUTH); 
			}
			
			public boolean isPreguntaRespondida() {
				return respondida;
			}
			
			public boolean isRespuestaCorrecta() {
				return
				�IF pregunta instanceof PreguntaUnica�
					�var r = pregunta.getCorrecta()�
					�var last = pregunta.getRespuestas().get(pregunta.getRespuestas().size() - 1)�
					�FOR resp: pregunta.getRespuestas()�
						�IF resp == r�
							�resp.getName().toLowerCase().replace(" ","")�.isSelected() 
						�ELSE�
							!�resp.getName().toLowerCase().replace(" ","")�.isSelected() 
						�ENDIF�
						�IF resp != last�
							&&
						�ENDIF�
					�ENDFOR�
				�ELSEIF pregunta instanceof PreguntaMultiple�
					�var r = pregunta.getCorrectas()�
					�var last = pregunta.getRespuestas().get(pregunta.getRespuestas().size() - 1)�
					�FOR resp: pregunta.getRespuestas()�
						�IF r.contains(resp)�
							�resp.getName().toLowerCase().replace(" ","")�.isSelected() 
						�ELSE�
							!�resp.getName().toLowerCase().replace(" ","")�.isSelected() 
						�ENDIF�
						�IF resp != last�
							&&
						�ENDIF�
					�ENDFOR�
				�ENDIF�
				;	
			}
		}
		'''
	}
	
	def generarPanelResultado(List<Pregunta> preguntas, List<Categoria> categorias) {
		'''
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
				
				// Solo categor�as sin subcategor�as
				�FOR c: categorias�
					�IF c.getSubcategorias().size == 0�
						�var pos = categorias.indexOf(c)�
						int categoria�pos + 1�_ok = 0, categoria�pos + 1�_nok = 0;
					�ENDIF�
				�ENDFOR�
				
				�FOR p: preguntas�
					�var c = p.getCategoria()�
					�var pos = categorias.indexOf(c)�
					if (gui.isPreguntaRespondida(GuiCuestionario.PANEL_�p.getName().toUpperCase().replace(" ","")�)) {
						if (gui.isRespuestaCorrecta(GuiCuestionario.PANEL_�p.getName().toUpperCase().replace(" ","")�)) 
							 categoria�pos + 1�_ok++;
						else categoria�pos + 1�_nok++;
					}
				�ENDFOR�
				
				�FOR c: categorias�
					�var pos = categorias.indexOf(c)�
					�IF c.getSubcategorias().size == 0�
					this.add(new JLabel("�c.getName()�"));
					this.add(new JLabel("   - Correctas:   "+categoria�pos + 1�_ok));
					this.add(new JLabel("   - Incorrectas: "+categoria�pos + 1�_nok));
					�ENDIF�
				�ENDFOR�
				
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
				�FOR p: preguntas�
					if (gui.isRespuestaCorrecta(GuiCuestionario.PANEL_�p.getName().toUpperCase().replace(" ","")�)) {
						resultado += �p.puntuacion�;
					} else {
						resultado += �p.penalizacion�;
					}		
				�ENDFOR�
				return resultado;
			}			
		}
		'''
	}
}
