package EjerciciosPrimerosPasos;

import java.util.Random;

import javax.swing.JOptionPane;

public class _14_UsoArraysII {

	public static void main(String[] args) {

		String [] paises1 = {"Colombia", "Venezuela", "Chile", "Eucador", "Perú", "Brasil", "Argentina"};
		
		for (int i = 0; i < paises1.length; i++) {
			
			System.out.println(paises1[i]);
			
		}
		
		System.out.println("_____________________");
		
		System.out.println("Total: " + paises1.length + " países.");
		
		System.out.println("---------------------");

		
		String [] paises2 = new String[6];
		
		for (int i = 0; i < paises2.length; i++) {
			
			paises2 [i] = JOptionPane.showInputDialog("Por favor ingrese un país");
			
			System.out.println(paises2[i]);
		}
		
		System.out.println("_____________________");
		
		System.out.println("Total: " + paises2.length + " países.");
		
		System.out.println("---------------------");
		
		int [] aleatorios = new int[150];
		
		Random random = new Random();
		
		for (int i = 0; i < aleatorios.length; i++) {
			
			aleatorios[i] = random.nextInt(98) + 1;
			
			System.out.print(aleatorios[i] + " ");
		}
		
	}

}
