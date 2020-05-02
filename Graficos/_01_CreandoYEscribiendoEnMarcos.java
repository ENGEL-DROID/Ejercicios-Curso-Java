package Graficos;

import java.awt.*;
import javax.swing.*;

public class _01_CreandoYEscribiendoEnMarcos {

	public static void main(String[] args) {
		Marco ventana = new Marco();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco extends JFrame {
	public Marco() {
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int ancho = (int) pantalla.getWidth();
		int alto = (int) pantalla.getHeight();
		setBounds(ancho/3, alto/3, ancho/3, alto/3);
		setTitle("  Mi Ventana Java");
		ImageIcon icono = new ImageIcon("src/Graficos/images/icon.png");
		setIconImage(icono.getImage());
		Lamina laminaObj = new Lamina();
		add(laminaObj);
		setVisible(true);
	}
}

class Lamina extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("Roboto", Font.BOLD, 20));
		g.setColor(new Color(153, 51, 255));
		g.drawString("Título del Contenido", 100, 100);
	}
}














