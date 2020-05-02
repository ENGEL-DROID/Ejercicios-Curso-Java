package EjerciciosPrimerosPasos;

import javax.swing.JOptionPane;

public class _11_ComprobarDireccionEmail {

	public static void main(String[] args) {
		
		int arroba = 0;
		
		boolean punto = false;
		
		boolean emailTest = false;
		
		while (emailTest == false) {
			
			String email = JOptionPane.showInputDialog("Ingrese su email por favor");
			
			for (int i = 0; i < email.length(); i++) {
				
				if (email.charAt(i) == '@') {
					
					arroba++;
					
				} else if (email.charAt(i) == '.') {
					
					punto = true;
				}
			}
			
			if (arroba == 1 && punto) {
				
				System.out.println("Email correcto, bienvenido!");
				
				emailTest = true;
				
				break;
				
			} else {
				
				System.out.println("Email incorrecto, corrija e ingrese nuevamente");
				
				arroba = 0;
			}
			
		}

	}

}
