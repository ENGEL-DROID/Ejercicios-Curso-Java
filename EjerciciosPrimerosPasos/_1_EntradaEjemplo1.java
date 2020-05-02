package EjerciciosPrimerosPasos;

import java.util.Scanner;

public class _1_EntradaEjemplo1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("por favor ingrese su nombre");
		
//		String nombre = entrada.next();  // el método next() sólo devuelve una palabra y no toda la línea
		String nombre = entrada.nextLine();
		
		System.out.println("por favor ingrese su edad");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre + " el próximo año tendrás " + (edad+1) + " años");

	}
}
