package EjerciciosPrimerosPasos;

import java.util.Scanner;

public class _1_EntradaEjemplo1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("por favor ingrese su nombre");
		
//		String nombre = entrada.next();  // el m�todo next() s�lo devuelve una palabra y no toda la l�nea
		String nombre = entrada.nextLine();
		
		System.out.println("por favor ingrese su edad");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre + " el pr�ximo a�o tendr�s " + (edad+1) + " a�os");

	}
}
