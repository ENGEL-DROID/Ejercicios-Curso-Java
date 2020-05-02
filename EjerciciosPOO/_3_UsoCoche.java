package EjerciciosPOO;

import javax.swing.JOptionPane;

public class _3_UsoCoche {

	public static void main(String[] args) {
		
		String color = JOptionPane.showInputDialog("Ingrese color del coche");
		String asientosCuero = JOptionPane.showInputDialog("Tiene asientos de cuero? Si/No");
		String climatizador = JOptionPane.showInputDialog("Tiene climatizador? Si/No");

		Coche coche = new Coche(color, asientosCuero, climatizador);
		
		System.out.println(coche.getCoche() + ", Asientos de Cuero: " + coche.getAsientosCuero() + ", Climatizador: " + coche.getClimatizador() + ", Peso Total: " + coche.getPesoTotal() + "kg, Precio Total: " + coche.getPrecioTotal() + "€.");                             

	}

}
