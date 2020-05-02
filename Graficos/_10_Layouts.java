package Graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _10_Layouts {

	public static void main(String[] args) {

		Ventana10 ventana = new Ventana10();
	}
}

class Ventana10 extends JFrame {
	
	public Ventana10() {
		
		setSize(600, 500);
		setTitle("  Layouts");
		setLocationRelativeTo(null);
		
		add(new Lamina10());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Lamina10 extends JPanel {
	
	public Lamina10() {
		setLayout(new BorderLayout());
		setBackground(new Color(204, 255, 102));
		
		JPanel lamina1 = new JPanel();
		add(lamina1, BorderLayout.NORTH);
		lamina1.setLayout(new BorderLayout());
		
		lamina1.add(new JButton("Botón 1"), BorderLayout.NORTH);
		lamina1.add(new JButton("Botón 2"), BorderLayout.SOUTH);
		lamina1.add(new JButton("Botón 3"), BorderLayout.EAST);
		lamina1.add(new JButton("Botón 4"), BorderLayout.WEST);
		lamina1.add(new JButton("Botón 5"), BorderLayout.CENTER);
		
		JPanel lamina2 = new JPanel();
		add(lamina2, BorderLayout.SOUTH);
		lamina2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		lamina2.add(new JButton("Botón 1"));
		lamina2.add(new JButton("Botón 2"));
		lamina2.add(new JButton("Botón 3"));
	}
}






























