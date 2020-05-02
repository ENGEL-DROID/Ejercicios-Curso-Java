package EjerciciosPrimerosPasos;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class _5_CalculoDeAreas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		DecimalFormat decimal = new DecimalFormat("#.##");
		
		int numero = 0;
		
		while (numero < 1 || numero > 4) {
			
			System.out.println("Seleccione un número por favor: \n 1 - Cuadrado \n 2 - Rectángulo \n 3 - Triángulo \n 4 - Círculo");
			
			numero = entrada.nextInt();
		}
		
		if (numero == 1) {
			
			double ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado en cm"));
			System.out.println("El área del cuadrado es: " + ladoCuadrado*ladoCuadrado + "cm2");
			
		} else if (numero == 2) {
			
			double baseRect = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base en cm"));
			double alturaRect = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en cm"));
			System.out.println("El área del rectángulo es: " + baseRect*alturaRect + "cm2");
			
		} else if (numero == 3) {
			
			double baseTri = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base en cm"));
			double alturaTri = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en cm"));
			System.out.println("El área del triángulo es: " + (baseTri*alturaTri)/2 + "cm2");
			
		} else if (numero == 4) {
			
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio en cm"));
			System.out.println("El área del círculo es: " + decimal.format(Math.PI*(radio*radio)) + "cm2");
		}
		
	}
}
