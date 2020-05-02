package EjerciciosPrimerosPasos;

import javax.swing.JOptionPane;

public class _9_PesoIdeal {

	public static void main(String[] args) {

		String dataIn = "";
		
		int altura = 0;
		
		while (!dataIn.equalsIgnoreCase("H") || !dataIn.equalsIgnoreCase("M")) {
			
			dataIn = JOptionPane.showInputDialog("Por favor ingrese su género: H / M");
			
			if (dataIn.equalsIgnoreCase("H")) {
				
				altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Altura en cm (ejem: 170)"));
				
				System.out.println("El peso ideal para un hombre con altura " + altura + "cm es de: " + (altura-110) + "kg");
				
				break;
				
			} else if (dataIn.equalsIgnoreCase("M")) {
				
				altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Altura en cm (ejem: 170)"));
				
				System.out.println("El peso ideal para una mujer con altura " + altura + "cm es de: " + (altura-110) + "kg");
				
				break;
			}
		}
	}
}
