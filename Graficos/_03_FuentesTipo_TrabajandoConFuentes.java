package Graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class _03_FuentesTipo_TrabajandoConFuentes {

	public static void main(String[] args) {

		Marco3 ventana = new Marco3();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco3 extends JFrame {
	public Marco3() {
		setSize(900, 300);
		setTitle(" Trabajando con Fuentes");
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		add(new JLabel("             "), BorderLayout.NORTH);
		add(new JLabel("             "), BorderLayout.SOUTH);
		add(new JLabel("             "), BorderLayout.WEST);
		add(new JLabel("             "), BorderLayout.EAST);
		
		add(new Ventana3(), BorderLayout.CENTER);
		
		setVisible(true);
	}
}

class Ventana3 extends JPanel {
	
	String fuenteIn;
	boolean verificador = false;
	JLabel encabezadoText, fuenteText;
	
	public Ventana3() {

		setLayout(new BorderLayout());
		
		fuenteIn = JOptionPane.showInputDialog("Ingrese el nombre de la fuente a consultar").toUpperCase();
		
		GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String Fuentes[] = e.getAvailableFontFamilyNames();
		
		for(String fuente: Fuentes) {
			if(fuenteIn.equalsIgnoreCase(fuente)) {
				verificador = true;
				break;
			}
		}
		
		if(verificador) {
			add(encabezadoText = new JLabel("El tipo de Fuente:  " + fuenteIn + "  Sí se encuentra instalada en el sistema."), JLabel.CENTER);
			encabezadoText.setFont(new Font(fuenteIn, Font.BOLD, 22));
			encabezadoText.setForeground(new Color(0, 153, 51));
			encabezadoText.setHorizontalAlignment(SwingConstants.CENTER);
			setBackground(new Color(204, 255, 221));
			
			System.out.println("El tipo de Fuente: " + fuenteIn + " Sí se encuentra instalada en el sistema.");
		
		} else {
			add(encabezadoText = new JLabel("El tipo de Fuente:  " + fuenteIn + "  No está instalada en el sistema."), JLabel.CENTER);
			encabezadoText.setFont(new Font("Arial", Font.BOLD, 22));
			encabezadoText.setForeground(new Color(153, 0, 61));
			encabezadoText.setHorizontalAlignment(SwingConstants.CENTER);
			setBackground(new Color(255, 204, 224));
			
			System.out.println("El tipo de Fuente:  " + fuenteIn + "  No está instalada en el sistema.");
			
		}
	}
}




























