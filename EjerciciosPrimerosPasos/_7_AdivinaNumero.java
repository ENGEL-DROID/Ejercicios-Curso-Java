package EjerciciosPrimerosPasos;

import java.util.Random;

import javax.swing.JOptionPane;

public class _7_AdivinaNumero {

	public static void main(String[] args) {
		
//		Random random = new Random();     // Forma m�s sencilla d eobtener un n�mero random
//		
//		int numero = random.nextInt(100);

		double aleatorioDouble = Math.random() * 100 + 1;
		
		int aleatorioInt = (int) aleatorioDouble;
		
		int numeroIn = 0;
		
		int intentos = 0;
		
		while (numeroIn != aleatorioInt) {
			
			intentos++;
			
			numeroIn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero entre el 1 y el 100"));
			
			if (numeroIn < aleatorioInt) {
				
				System.out.println("Ingrese un n�mero m�s Alto que: " + numeroIn);
				
			} else if (numeroIn > aleatorioInt) {
				
				System.out.println("Ingrese un n�mero m�s Bajo que: " + numeroIn);
			}
		}
		
		System.out.println("Has adivinado el n�mero, felicitaciones! lo has hecho en: " + intentos + " intentos.");
		
	}
}
