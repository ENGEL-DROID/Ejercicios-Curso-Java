package Graficos;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _12_PruebaTexto {

	public static void main(String[] args) {

		Marco12 ventana = new Marco12();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco12 extends JFrame {
	
	Color fondo = new Color(51, 204, 204);
	
	public Marco12() {
		
		setSize(600, 500);
		setTitle(" Prueba Texto");
		setLocationRelativeTo(null);
		getContentPane().setBackground(fondo);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets.set(0, 0, 60, 0);
		
		add(new Ventana12(), gbc);
		
		setVisible(true);
	}
	
	class Ventana12 extends JPanel {
		
		JTextField campoTexto;
		JLabel aviso;
		JButton btn;
		
		public Ventana12() {
			
			setBackground(fondo);
			
			setLayout(new GridLayout(7,1));
			
			add(new JLabel("Ingrese su eMail:"));
			add(new JLabel(""));
			add(campoTexto = new JTextField(30));
			add(new JLabel(""));
			add(aviso = new JLabel(""));
			add(new JLabel(""));
			add(btn = new JButton("Enviar"));
			
			btn.addActionListener(new ClaseOyente());
		}
		
		class ClaseOyente implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int arroba = 0;
				boolean punto = false;

				for (int i = 0; i < campoTexto.getText().length(); i++) {
					if(campoTexto.getText().charAt(i) == '@') {
						arroba++;
					}
					if(campoTexto.getText().charAt(i) == '.') {
						punto = true;
					}
				}
				if(arroba == 1 && punto) {
					aviso.setForeground(new Color(102, 153, 0));
					aviso.setText("eMail correcto, Bienvenido!");
					arroba = 0;
				} else {
					aviso.setForeground(new Color(255, 0, 102));
					aviso.setText("eMail incorrecto, corrija e intente nuevamente");
					arroba = 0;
				}
			}
		}
	}
}





























