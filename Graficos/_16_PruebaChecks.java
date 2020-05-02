package Graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class _16_PruebaChecks {

	public static void main(String[] args) {

		Marco16 ventana = new Marco16();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco16 extends JFrame {
	
	JLabel east;
	Color fondo = new Color(179, 255, 179);
	
	public Marco16() {
		
		setSize(900, 400);
		setTitle(" Prueba Checks");
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		
		// -----------Espacios en los Bordes-----------------
		add(new JLabel("         "), BorderLayout.NORTH);
		add(new JLabel("         "), BorderLayout.SOUTH);
		add(east = new JLabel("   ........................      "), BorderLayout.EAST);
		east.setForeground(new Color(0, 0, 0, 0));
		add(new JLabel("         "), BorderLayout.WEST);
		// -----------Espacios en los Bordes-----------------

		add(new Ventana16(fondo), BorderLayout.CENTER);
		
		getContentPane().setBackground(fondo);
		
		setVisible(true);
	}
}

class Ventana16 extends JPanel {
	
	JLabel texto1, texto2;
	JCheckBox check1, check2;
	JPanel lamina1, lamina2;

	public Ventana16(Color fondo) {
		
		setLayout(new BorderLayout());
		
		add(lamina1 = new JPanel(), BorderLayout.CENTER);
		lamina1.setLayout(new GridLayout(7,1));
		lamina1.setBackground(fondo);

		lamina1.add(new JLabel("    "));
		lamina1.add(new JLabel("    "));
		lamina1.add(new JLabel("    "));
		lamina1.add(texto1 = new JLabel("\"Es capaz el que piensa que es capaz.\""));
		texto1.setFont(new Font("Verdana", Font.PLAIN, 34));
		texto1.setHorizontalAlignment(SwingConstants.RIGHT);
		lamina1.add(new JLabel("    "));
		lamina1.add(texto2 = new JLabel("Buda"));
		texto2.setFont(new Font("Verdana", Font.PLAIN, 24));
		texto2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		add(lamina2 = new JPanel(), BorderLayout.SOUTH);
		lamina2.setBackground(fondo);
		
		lamina2.add(check1 = new JCheckBox("Negrita", false));
		check1.setFont(new Font("Verdana", Font.PLAIN, 18));
		check1.setBackground(fondo);
		lamina2.add(check2 = new JCheckBox("Cursiva", false));
		check2.setFont(new Font("Verdana", Font.PLAIN, 18));
		check2.setBackground(fondo);
		
		check1.addActionListener(new ClaseOyente());
		check2.addActionListener(new ClaseOyente());
	}
	
	class ClaseOyente implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			int constante = 0;
			
			if (check1.isSelected() && !check2.isSelected()) {
				constante = 1;
			} else if (!check1.isSelected() && check2.isSelected()) {
				constante = 2;
			} else if (check1.isSelected() && check2.isSelected()) {
				constante = 3;
			} else {
				constante = 0;
			}
			
			texto1.setFont(new Font("Verdana", constante, 34));
			
		}
	}
}



























