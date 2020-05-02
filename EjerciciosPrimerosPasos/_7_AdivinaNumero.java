package EjerciciosPrimerosPasos;

import java.util.Random;

import javax.swing.JOptionPane;

public class _7_AdivinaNumero {

	public static void main(String[] args) {
		
//		Random random = new Random();     // Forma más sencilla d eobtener un número random
//		
//		int numero = random.nextInt(100);

		double aleatorioDouble = Math.random() * 100 + 1;
		
		int aleatorioInt = (int) aleatorioDouble;
		
		int numeroIn = 0;
		
		int intentos = 0;
		
		while (numeroIn != aleatorioInt) {
			
			intentos++;
			
			numeroIn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre el 1 y el 100"));
			
			if (numeroIn < aleatorioInt) {
				
				System.out.println("Ingrese un número más Alto que: " + numeroIn);
				
			} else if (numeroIn > aleatorioInt) {
				
				System.out.println("Ingrese un número más Bajo que: " + numeroIn);
			}
		}
		
		System.out.println("Has adivinado el número, felicitaciones! lo has hecho en: " + intentos + " intentos.");
		
	}
}
