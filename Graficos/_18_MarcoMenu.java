package Graficos;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class _18_MarcoMenu {

	public static void main(String[] args) {

		Marco18 ventana = new Marco18();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco18 extends JFrame {
	
	Color fondo = new Color(230, 204, 255);
	
	public Marco18() {
		
		setSize(600, 500);
		setTitle(" Marco Menú");
		setLocationRelativeTo(null);
		getContentPane().setBackground(fondo);
		
		setLayout(new BorderLayout());
		
		// -----------Espacios en los Bordes-----------------
		add(new JLabel("         "), BorderLayout.NORTH);
		add(new JLabel("         "), BorderLayout.SOUTH);
		add(new JLabel("         "), BorderLayout.EAST);
		add(new JLabel("         "), BorderLayout.WEST);
		// -----------Espacios en los Bordes-----------------

		add(new Ventana18(fondo), BorderLayout.CENTER);
		
		setVisible(true);
	}
}

class Ventana18 extends JPanel {
	
	JMenuBar barra;
	JMenu menu1, menu2, menu3, menu4, menu5;
	JMenuItem item1, item2, item3, item4, item5, item6, item7, item8, item9, item10;
	JSeparator separador;

	public Ventana18(Color fondo) {
		
		setBackground(fondo);
		
		add(barra = new JMenuBar());
		
		barra.add(menu1 = new JMenu("Inicio"));
		barra.add(menu2 = new JMenu("Servicios"));
		barra.add(menu3 = new JMenu("Galería"));
		barra.add(menu4 = new JMenu("Contacto"));
		
			menu1.add(item1 = new JMenuItem("Ofertas"));
			menu1.add(item2 = new JMenuItem("Productos"));
			menu1.addSeparator();
			menu1.add(menu5 = new JMenu("Novedades"));
				menu5.add(item10 = new JMenuItem("Año 2020"));
			
			menu2.add(item4 = new JMenuItem("Básicos"));
			menu2.add(item5 = new JMenuItem("Exclusivos"));
			menu2.add(item6 = new JMenuItem("Outlet"));
			
			menu3.add(item7 = new JMenuItem("Clientes"));
			menu3.add(item8 = new JMenuItem("Eventos"));
			
			menu4.add(item9 = new JMenuItem("Reservas"));
		
		
		
		
	}
}





































