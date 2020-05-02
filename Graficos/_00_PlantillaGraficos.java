package Graficos;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _00_PlantillaGraficos {
	public static void main(String[] args) {

		MarcoX ventana = new MarcoX();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoX extends JFrame {
	
	public MarcoX() {
		
		setSize(600, 500);
		setTitle(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		
		// -----------Espacios en los Bordes-----------------
		add(new JLabel("         "), BorderLayout.NORTH);
		add(new JLabel("         "), BorderLayout.SOUTH);
		add(new JLabel("         "), BorderLayout.EAST);
		add(new JLabel("         "), BorderLayout.WEST);
		// -----------Espacios en los Bordes-----------------

		add(new VentanaX(), BorderLayout.CENTER);
		
		setVisible(true);
	}
}

class VentanaX extends JPanel {

	public VentanaX() {
		
		
	}
}




























