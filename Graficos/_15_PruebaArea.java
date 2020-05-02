package Graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class _15_PruebaArea {

	public static void main(String[] args) {

		Marco15 ventana = new Marco15();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco15 extends JFrame {
	
	public Marco15() {
		
		setSize(400, 300);
		setTitle(" Prueba Área");
		setLocationRelativeTo(null);
		
		add(new Ventana15());
		
		setVisible(true);
	}
}

class Ventana15 extends JPanel {
	
	JTextArea areaTxt;
	JScrollPane vistaScroll;
	JPanel lamina;
	JButton btn1, btn2;
	String lorem = "Al contrario del pensamiento popular, el texto de Lorem Ipsum no es simplemente texto aleatorio. | Al contrario del pensamiento popular, el texto de Lorem Ipsum no es simplemente texto aleatorio. | Al contrario del pensamiento popular, el texto de Lorem Ipsum no es simplemente texto aleatorio. | Al contrario del pensamiento popular, el texto de Lorem Ipsum no es simplemente texto aleatorio. | ";

	public Ventana15() {
		
		setLayout(new BorderLayout());
		
		add(areaTxt = new JTextArea(), BorderLayout.CENTER);
		areaTxt.setBackground(new Color(204, 255, 255));
		areaTxt.setForeground(new Color(153, 0, 115));
		add(vistaScroll = new JScrollPane(areaTxt));
		
		add(lamina = new JPanel(), BorderLayout.SOUTH);
		lamina.setBackground(new Color(204, 204, 255));
		
		lamina.add(btn1 = new JButton("Agregar texto"));
		lamina.add(btn2 = new JButton("Insertar salto de línea"));
		
		btn1.setBackground(new Color(204, 204, 255));
		btn2.setBackground(new Color(204, 204, 255));
		
		btn1.addActionListener(new ClaseOyente());
		btn2.addActionListener(new ClaseOyente());
		
	}
	
	class ClaseOyente implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btn1) {
				areaTxt.append(lorem);
			}
			if (e.getSource() == btn2) {
				if (areaTxt.getLineWrap() == false) {
					areaTxt.setLineWrap(true);
					btn2.setText("Quitar salto de línea");
					btn2.setBackground(new Color(255, 153, 204));
				} else {
					areaTxt.setLineWrap(false);
					btn2.setText("Insertar salto de línea");
					btn2.setBackground(new Color(153, 255, 204));
				}
			}
		}
	}
}





































