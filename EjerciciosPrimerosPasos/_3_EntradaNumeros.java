package EjerciciosPrimerosPasos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class _3_EntradaNumeros {

	public static void main(String[] args) {

		double numero = 0.0;
		
		while (numero < 1.0 || numero > 100.0) {
			numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número del 1 al 100 por favor"));
			};
		
		DecimalFormat decimal2 = new DecimalFormat("#.##");  // Clase para convertir en decimal
		
		System.out.println("La raíz cuadrada de " + numero + " es: " + decimal2.format(Math.sqrt(numero)));
	}
}
