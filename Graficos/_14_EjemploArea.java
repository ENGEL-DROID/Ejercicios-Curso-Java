package Graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class _14_EjemploArea {

	public static void main(String[] args) {

		Marco14 ventana = new Marco14();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco14 extends JFrame {
	
	public Marco14() {
		
		setSize(350, 500);
		setTitle(" Ejemplo Área");
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(153, 204, 255));
		
		setLayout(new BorderLayout());
		
		// -----------Espacios en los Bordes-----------------
		add(new JLabel("         "), BorderLayout.NORTH);
		add(new JLabel("         "), BorderLayout.SOUTH);
		add(new JLabel("         "), BorderLayout.EAST);
		add(new JLabel("         "), BorderLayout.WEST);
		// -----------Espacios en los Bordes-----------------

		add(new Ventana14(), BorderLayout.CENTER);
		
		setVisible(true);
	}
}

class Ventana14 extends JPanel {
	
	JPanel lamina;
	JTextArea areaIn, areaOut;
	JLabel textoOut;
	JButton btnEnviar;
	JScrollPane vistaScroll;

	public Ventana14() {
		
		setBackground(new Color(153, 204, 255));
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 20,20));
		
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(areaIn = new JTextArea(8,20));
		areaIn.setText(lorem);
		areaIn.setLineWrap(true);
		add(vistaScroll = new JScrollPane(areaIn));
		add(btnEnviar = new JButton("Enviar"));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(areaOut = new JTextArea(8,20));
		areaOut.setLineWrap(true);
		areaOut.setEnabled(false);
		areaOut.setDisabledTextColor(Color.DARK_GRAY);
		areaOut.setBackground(new Color(179, 204, 230));
		add(vistaScroll = new JScrollPane(areaOut));
		add(textoOut = new JLabel(" "));
		
		btnEnviar.addActionListener(new ClaseOyente());
	}
	
	class ClaseOyente implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String entrada = areaIn.getText();
			areaOut.setText(entrada);
			
			textoOut.setText("Data enviada!");
		}
		
	}
	
	String lorem = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.";
}


























