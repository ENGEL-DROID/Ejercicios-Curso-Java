package Graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _05_PruebaEventos_PruebaAcciones {

	public static void main(String[] args) {
		
		Marco5 ventana = new Marco5();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco5 extends JFrame {
	
	public Marco5() {
		
		setSize(600, 500);
		setTitle(" Eventos y Acciones");
		setLocationRelativeTo(null);
		
		add(new Ventana5());
		
		setVisible(true);
	}
}

class Ventana5 extends JPanel {
	
	public Ventana5() {
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 10, 0, 10);
		
		AccionColor accionLima = new AccionColor("Lima", new ImageIcon("src/Graficos/images/lima.png"), new Color(204, 255, 153));
		AccionColor accionOrange = new AccionColor("Orange", new ImageIcon("src/Graficos/images/orange.png"), new Color(255, 204, 102));
		AccionColor accionGrape = new AccionColor("Grape", new ImageIcon("src/Graficos/images/grape.png"), new Color(204, 204, 255));
		
		add(new JButton(accionLima), gbc);
		add(new JButton(accionOrange), gbc);
		add(new JButton(accionGrape), gbc);
		
		KeyStroke tecladoLima = KeyStroke.getKeyStroke("ctrl L");
		KeyStroke tecladoOrange = KeyStroke.getKeyStroke("ctrl O");
		KeyStroke tecladoGrape = KeyStroke.getKeyStroke("ctrl G");
		
		InputMap mapaEntrada = getInputMap(WHEN_IN_FOCUSED_WINDOW);
		
		mapaEntrada.put(tecladoLima, "eventoLima");
		mapaEntrada.put(tecladoOrange, "eventoOrange");
		mapaEntrada.put(tecladoGrape, "eventoGrape");
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("eventoLima", accionLima);
		mapaAccion.put("eventoOrange", accionOrange);
		mapaAccion.put("eventoGrape", accionGrape);
	}
	
	private class AccionColor extends AbstractAction {
		
		public AccionColor(String nombre, Icon icono, Color color_boton) {

			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "(Ctrl+" + nombre.charAt(0) + ") " + "Cambia el fondo a color " + nombre);
			putValue("color_de_fondo", color_boton);
		}

		public void actionPerformed(ActionEvent e) {
			Color c = (Color) getValue("color_de_fondo");
			setBackground(c);			
		}		
	}
}




























