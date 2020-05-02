package Graficos;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class _05_PruebaEventos_PruebaAcciones_ByPipe {

	public static void main(String[] args) {

		MarcoAccionesPipe ventana = new MarcoAccionesPipe();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoAccionesPipe extends JFrame {
	
	public MarcoAccionesPipe() {
		
		setTitle("  Eventos y Acciones by Pipe");
		setSize(600, 400);
		setLocationRelativeTo(null);
		
		add(new VentanaAccionesPipe());
		
		setVisible(true);
	}
}

class VentanaAccionesPipe extends JPanel {
	
	public VentanaAccionesPipe() {
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets.set(0, 0, 50, 10);
		
		Acciones accionLima = new Acciones("Lima", new ImageIcon("src/Graficos/images/lima.png"), new Color(204, 255, 153));
		Acciones accionOrange = new Acciones("Orange", new ImageIcon("src/Graficos/images/orange.png"), new Color(255, 204, 102));
		Acciones accionGrape = new Acciones("Grape", new ImageIcon("src/Graficos/images/grape.png"), new Color(204, 204, 255));
		
		add(new JButton(accionLima), gbc);
		add(new JButton(accionOrange), gbc);
		add(new JButton(accionGrape), gbc);
		
		KeyStroke tecladoLima = KeyStroke.getKeyStroke("ctrl L");
		KeyStroke tecladoOrange = KeyStroke.getKeyStroke("ctrl O");
		KeyStroke tecladoGrape = KeyStroke.getKeyStroke("ctrl G");
		
		InputMap mapaEntrada = getInputMap(WHEN_IN_FOCUSED_WINDOW);
		
		mapaEntrada.put(tecladoLima, "tecladoLima");
		mapaEntrada.put(tecladoOrange, "tecladoOrange");
		mapaEntrada.put(tecladoGrape, "tecladoGrape");
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("tecladoLima", accionLima);
		mapaAccion.put("tecladoOrange", accionOrange);
		mapaAccion.put("tecladoGrape", accionGrape);
	}
	
	class Acciones extends AbstractAction {
		
		public Acciones(String nombre, ImageIcon icon, Color color) {
			putValue(NAME, nombre);
			putValue(SMALL_ICON, icon);
			putValue("dameColor", color);
			putValue(SHORT_DESCRIPTION, "Ctr+" + nombre.charAt(0) + "  Cambia el fondo a color: " + nombre);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Color color = (Color) getValue("dameColor");
			setBackground(color);
		}
	}
}




























