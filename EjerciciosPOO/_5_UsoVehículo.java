package EjerciciosPOO;

import javax.swing.JOptionPane;

public class _5_UsoVehículo {

	public static void main(String[] args) {
		
		String colorCoche = JOptionPane.showInputDialog("Ingrese color del coche");
		String asientosCueroCoche = JOptionPane.showInputDialog("Coche con asientos de cuero? Si / No");
		String climatizadorCoche = JOptionPane.showInputDialog("Coche climatizado? Si / No");
		
		Coche coche = new Coche(colorCoche, asientosCueroCoche, climatizadorCoche);
		
		String colorFurgo = JOptionPane.showInputDialog("Ingrese color de la furgoneta");
		String asientosCueroFurgo = JOptionPane.showInputDialog("Furgo con asientos de cuero? Si / No");
		String climatizadorFurgo = JOptionPane.showInputDialog("Furgo climatizada? Si / No");
		double capacidadCargaFurgo = Double.parseDouble(JOptionPane.showInputDialog("Capacidad de carga? (ejem: 1500"));
		int plazasExtraFurgo = Integer.parseInt(JOptionPane.showInputDialog("Plazas extra? (ejem: 3)"));

		Furgoneta furgoneta = new Furgoneta(colorFurgo, asientosCueroFurgo, climatizadorFurgo, capacidadCargaFurgo, plazasExtraFurgo);
		
		System.out.println("El Coche tiene: " + coche.getCoche() + ", Asientos de Cuero: " + coche.getAsientosCuero() + ", Climatizador: " + coche.getClimatizador() + ", Peso Total: " + coche.getPesoTotal() + "kg, Precio Total: " + coche.getPrecioTotal() + "€.");
		System.out.println("La Furgoneta tiene: " + furgoneta.getCoche() + ", Asientos de Cuero: " + furgoneta.getAsientosCuero() + ", Climatizador: " + furgoneta.getClimatizador() + ", Peso Total de la Furgoneta: " + furgoneta.getPesoTotalFurgo() + ", " + furgoneta.getFurgoneta() + ", Precio Total: " + furgoneta.getPrecioTotalFurgo());                                           

	}

}
