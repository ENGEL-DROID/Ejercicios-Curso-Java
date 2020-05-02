package EjerciciosPrimerosPasos;

import java.text.DecimalFormat;

public class _16_Array2D {

	public static void main(String[] args) {

		double [][] matrix = new double[6][5];
		
		double base = 10000.0;
		
		double interes = 1.1;
		
		DecimalFormat decimal = new DecimalFormat("#.##");
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix.length - 1; j++) {
				
				matrix[i][j] = base;
				
				base *= interes;
				
				System.out.print(decimal.format(matrix[i][j]) + " ");
			}
			
			base = 10000.0;
			
			interes += 0.01;
			
			System.out.println(" ");
		}
	}
}
