package EjerciciosPrimerosPasos;

import java.util.Scanner;

public class _4_EvaluaEdad {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int edad = 0;
		
		while (edad < 1 || edad > 120) {
			System.out.println("Ingrese su edad por favor");
			edad = entrada.nextInt();
		}
		
		if (edad >= 18) {
			if (edad <= 40) {
				System.out.println("Usted es Joven");
			} else if (edad <= 64) {
				System.out.println("Usted es Maduro");
			} else if (edad >= 65) {
				System.out.println("Usted es Mayor");
			}
		} else {
			System.out.println("Usted es Adolescente");
		}
	}
}
