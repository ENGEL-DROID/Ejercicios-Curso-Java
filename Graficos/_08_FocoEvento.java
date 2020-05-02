package Graficos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _08_FocoEvento {

	public static JLabel aviso;

	public static void main(String[] args) {
		
		Color fondo = new Color(230, 204, 255);
		JTextField email;

		JFrame ventana = new JFrame();
		ventana.setTitle(" Foco Evento");
		ventana.setSize(600, 400);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(new GridBagLayout());
		ventana.getContentPane().setBackground(fondo);
		
		JPanel lamina = new JPanel();
		lamina.setBackground(fondo);
		
		CampoFoco oyenteFoco = new CampoFoco();
		
		lamina.setLayout(new GridLayout(10,1));
		
		lamina.add(new JLabel("eMail: ")).setForeground(Color.GRAY.darker());
		lamina.add(email = new JTextField(30));
		email.addFocusListener(oyenteFoco);
		lamina.add(new JLabel("                ")).setForeground(Color.GRAY.darker());
		lamina.add(aviso = new JLabel("                ")).setForeground(Color.RED.darker());
		lamina.add(new JLabel("                ")).setForeground(Color.GRAY.darker());
		lamina.add(new JLabel("Contraseña: ")).setForeground(Color.GRAY.darker());
		lamina.add(new JTextField(30));
		lamina.add(new JLabel("                ")).setForeground(Color.GRAY.darker());  // Éstos labels son sólo para aumentar espacio 
		lamina.add(new JLabel("                ")).setForeground(Color.GRAY.darker());
		lamina.add(new JLabel("                ")).setForeground(Color.GRAY.darker());
		
		ventana.add(lamina);
		
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	static class CampoFoco implements FocusListener {
		
		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
		}
		
		@Override
		public void focusLost(FocusEvent e) {
			JTextField emailObj = (JTextField) e.getSource();
			String emailTxt = emailObj.getText();
			int arroba = 0;
			
			boolean punto = false;
			
			for (int i=0; i<emailTxt.length(); i++) {
				if (emailTxt.charAt(i) == '@') {
					arroba++;
				}
				if (emailTxt.charAt(i) == '.') {
					punto = true;
				}
			}
			
			if (arroba == 1 && punto) {
				aviso.setText(" ");
				System.out.println("Email correcto");
			} else {
				aviso.setText("eMail Incorrecto, corrija e intente nuevamente");
				System.out.println("Email Incorrecto");
				arroba = 0;
			}
			
		}
	}
	
}






















