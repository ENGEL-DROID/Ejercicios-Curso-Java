package EjerciciosPrimerosPasos;

import javax.swing.JOptionPane;

public class _2_EntradaEjemplo2 {

	public static void main(String[] args) {

		String nombre = JOptionPane.showInputDialog("Ingrese su nombre por favor");

		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
		
		System.out.println("Hola " + nombre + " el próximo año tendrás " + edad + " años.");
	}

}
