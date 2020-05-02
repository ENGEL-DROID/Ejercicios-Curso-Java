package EjerciciosPrimerosPasos;

public class _13_UsoArrays {

	public static void main(String[] args) {

		int[] matrix1 = new int[5];
		
		matrix1[0] = 19;
		matrix1[1] = 25;
		matrix1[2] = -30;
		matrix1[3] = 68;
		matrix1[4] = 45;
		
		for (int i = 0; i < matrix1.length; i++) {
			
			System.out.println("El valor del índice " + i + " es: " + matrix1[i]);
		}
		
		System.out.println("-------------------------------");

		int[] matrix2 = {19,25,-30,68,45};
		
		for (int i = 0; i < matrix2.length; i++) {
			
			System.out.println("El valor del índice " + i + " es: " + matrix2[i]);
		}
	}

}
