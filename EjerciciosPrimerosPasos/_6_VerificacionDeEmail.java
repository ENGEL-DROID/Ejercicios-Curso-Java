package EjerciciosPrimerosPasos;

import javax.swing.JOptionPane;

public class _6_VerificacionDeEmail {

	public static void main(String[] args) {
		
		String contrasenia = "bilbao";
		
		boolean comprobar = false;
		
		while (comprobar == false) {
			
			String dataIn = JOptionPane.showInputDialog("Ingrese la contraseņa por favor");
			
			if (dataIn.contentEquals(contrasenia) == false) {
				
				System.out.println("Contraseņa incorrecta, corrija e ingrese nuevamente");
				
			} else {
				
				System.out.println("Contraseņa correcta, bienvenido!");
				comprobar = true;
			}
		}

	}

}
