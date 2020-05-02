package EjerciciosPOO;

import java.util.Scanner;

public class _7_EnumUsoTallas {
	
	public enum Tallas {
		
		PEQUEÑA("S"),
		MEDIANA("M"),
		GRANDE("L"),
		EXTRAGRANDE("XL");
		
		private String talla;

		private Tallas(String t) {
			talla = t;
		}
		
		public String dameTalla () {
			return talla;
		}
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String tallaIn = " ";
		boolean comp = false;
		
		// Comprobar que la data ingresada sea correcta
		while (comp == false) {
			System.out.println("Ingrese su talla: Pequeña, Mediana, Grande, ExtraGrande");
			tallaIn = entrada.nextLine().toUpperCase().trim();
			for (Tallas iTallas: Tallas.values()) {		// El método values() recorre todos los valores de Enum	
				if (tallaIn.equalsIgnoreCase(iTallas.name())) {		// El método name() retorna el nombre literar de cada variable de Enum
					comp = true;
					break;
				} 
			}
			if (comp == false) {
				System.out.println("Dato incorrecto, corrija nuevamente:");
			}
		}
		
		Tallas tallaInEnum = Tallas.valueOf(tallaIn);   // Se crea una variable del tipo Tallas Enum que tiene por defecto el valor String introducido por el susuario
		
		System.out.println("Talla: " + tallaInEnum);

		System.out.println("Abreviatura: " + tallaInEnum.dameTalla());
	}
}
