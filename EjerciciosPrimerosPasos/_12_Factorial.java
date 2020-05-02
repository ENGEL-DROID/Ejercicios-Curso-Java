package EjerciciosPrimerosPasos;

import javax.swing.JOptionPane;

public class _12_Factorial {

	public static void main(String[] args) {

		int numero = 0;
		
		int factorial = 1;
		
		while (numero < 1 || numero > 10) {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número del 1 al 10"));
			
		}
		
		for (int i = 1; i < numero + 1; i++) {
			
			factorial = factorial * i;
		}
		
		System.out.println("El factorial del número " + numero + " es: " + factorial);

	}
}
