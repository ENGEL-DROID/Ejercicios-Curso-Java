package Graficos;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class _13_CampoPassword {

	public static void main(String[] args) {

		Marco13 ventana = new Marco13();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco13 extends JFrame {
	
	public Marco13() {
		
		setSize(550, 600);
		setTitle(" Campo Password");
		setLocationRelativeTo(null);
		
		add(new Ventana13());
		
		setVisible(true);
	}
}
	
class Ventana13 extends JPanel {
	
	JLabel emailTxt, passTxt, avisoMail, avisoPass;
	JTextField emailField;
	JPasswordField passField;
	JButton enviarBtn;
	JPanel lamina;
	Color fondo = new Color(204, 255, 153);
	
	public Ventana13() {
		
		setBackground(fondo);

		setLayout(new GridBagLayout());
		
		add(lamina = new JPanel());
		lamina.setBackground(fondo);
		lamina.setLayout(new GridLayout(10,1));
		
		lamina.add(emailTxt = new JLabel("Email:"));
		lamina.add(emailField = new JTextField(40));
		lamina.add(avisoMail = new JLabel(" "));
		lamina.add(new JLabel(" "));
		lamina.add(passTxt = new JLabel("Contraseña:"));
		lamina.add(passField = new JPasswordField(40));
		lamina.add(avisoPass = new JLabel(" "));
		lamina.add(new JLabel(" "));
		lamina.add(enviarBtn = new JButton("Enviar"));
		
		emailField.getDocument().addDocumentListener(new OyenteEmail());
		passField.getDocument().addDocumentListener(new OyentePassword());
	}
	
	// -----------------------OYENTE EMAIL------------------------------------------
	class OyenteEmail implements DocumentListener {
		@Override
		public void insertUpdate(DocumentEvent e) {
			String email = emailField.getText();
			int arroba = 0;
			boolean punto = false;
			
			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					arroba++;
				}
				if (email.charAt(i) == '.') {
					punto = true;
				}
			}
			if (email.length() > 8) {
				if (arroba == 1 && punto) {
					emailField.setBackground(Color.WHITE);
					avisoMail.setText(" ");
					arroba = 0;
				} else {
					emailField.setBackground(new Color(255, 102, 153));
					avisoMail.setForeground(new Color(255, 102, 153));
					avisoMail.setText("eMail incorrecto, corrija!");
				}
			}
		}
		@Override
		public void removeUpdate(DocumentEvent e) {
			String email = emailField.getText();
			int arroba = 0;
			boolean punto = false;
			
			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					arroba++;
				}
				if (email.charAt(i) == '.') {
					punto = true;
				}
			}
			if (email.length() > 8) {
				if (arroba == 1 && punto) {
					emailField.setBackground(Color.WHITE);
					avisoMail.setText(" ");
					arroba = 0;
				} else {
					emailField.setBackground(new Color(255, 102, 153));
					avisoMail.setForeground(new Color(255, 102, 153));
					avisoMail.setText("eMail incorrecto, corrija!");
				}
			}
		}
		@Override
		public void changedUpdate(DocumentEvent e) {
			String email = emailField.getText();
			int arroba = 0;
			boolean punto = false;
			
			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					arroba++;
				}
				if (email.charAt(i) == '.') {
					punto = true;
				}
			}
			if (email.length() > 8) {
				if (arroba == 1 && punto) {
					emailField.setBackground(Color.WHITE);
					avisoMail.setText(" ");
					arroba = 0;
				} else {
					emailField.setBackground(new Color(255, 102, 153));
					avisoMail.setForeground(new Color(255, 102, 153));
					avisoMail.setText("eMail incorrecto, corrija!");
				}
			}
		}
	}
	
	// -----------------------OYENTE PASSWORDFIELD------------------------------------------
	class OyentePassword implements DocumentListener {
		@Override
		public void insertUpdate(DocumentEvent e) {
			char password[] = passField.getPassword();
			for (int i = 0; i < password.length; i++) {
				if(password.length < 6 || password.length > 12) {
					passField.setBackground(new Color(255, 102, 153));
					avisoPass.setForeground(new Color(255, 102, 153));
					avisoPass.setText("La contraseña debe tener mínimo 6 y máximo 12 letras!");
				} else {
					passField.setBackground(Color.WHITE);
					avisoPass.setText(" ");
				}
			}
		}
		@Override
		public void removeUpdate(DocumentEvent e) {
			char password[] = passField.getPassword();
			for (int i = 0; i < password.length; i++) {
				if(password.length < 6 || password.length > 12) {
					passField.setBackground(new Color(255, 102, 153));
					avisoPass.setForeground(new Color(255, 102, 153));
					avisoPass.setText("La contraseña debe tener mínimo 6 y máximo 12 letras!");
				} else {
					passField.setBackground(Color.WHITE);
					avisoPass.setText(" ");
				}
			}
		}
		@Override
		public void changedUpdate(DocumentEvent e) {
			char password[] = passField.getPassword();
			for (int i = 0; i < password.length; i++) {
				if(password.length < 6 || password.length > 12) {
					passField.setBackground(new Color(255, 102, 153));
					avisoPass.setForeground(new Color(255, 102, 153));
					avisoPass.setText("La contraseña debe tener mínimo 6 y máximo 12 letras!");
				} else {
					passField.setBackground(Color.WHITE);
					avisoPass.setText(" ");
				}
			}
		}
	}
	
}



























