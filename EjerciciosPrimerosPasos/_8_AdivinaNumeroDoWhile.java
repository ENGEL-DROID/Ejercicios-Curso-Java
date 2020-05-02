package EjerciciosPrimerosPasos;

import java.util.Random;
import javax.swing.JOptionPane;

public class _8_AdivinaNumeroDoWhile {

	public static void main(String[] args) {

		Random random = new Random();
		
		int aleatorio = random.nextInt(100);
		
		int nroIn = 0;
		
		int intentos = 0;
		
		do {
			nroIn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero del 1 al 100"));
			
			intentos++;
			
			if (nroIn > aleatorio) {
				
				System.out.println("Ingrese un n�mero m�s Bajo que: " + nroIn);
				
			} else if (nroIn < aleatorio) {
				
				System.out.println("Ingrese un n�mero m�s Alto que: " + nroIn);
				
			} else {
				
				System.out.println("Has adivinado el n�mero, felicitaciones! lo has logrado en: " + intentos + " intentos.");
			}
			
		} while (nroIn != aleatorio || nroIn < 1 || nroIn > 100);
		
	}
}
