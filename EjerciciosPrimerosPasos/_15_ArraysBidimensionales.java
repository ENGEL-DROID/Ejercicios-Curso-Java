package EjerciciosPrimerosPasos;

public class _15_ArraysBidimensionales {

	public static void main(String[] args) {

		int [][] matrix1 = new int[4][5];
		
		matrix1[0][0] = 10;
		matrix1[0][1] = 22;
		matrix1[0][2] = 75;
		matrix1[0][3] = 33;
		matrix1[0][4] = 84;
		
		matrix1[1][0] = 82;
		matrix1[1][1] = 15;
		matrix1[1][2] = 67;
		matrix1[1][3] = 35;
		matrix1[1][4] = 78;
		
		matrix1[2][0] = 58;
		matrix1[2][1] = 42;
		matrix1[2][2] = 19;
		matrix1[2][3] = 37;
		matrix1[2][4] = 73;
		
		matrix1[3][0] = 13;
		matrix1[3][1] = 46;
		matrix1[3][2] = 82;
		matrix1[3][3] = 75;
		matrix1[3][4] = 36;
		
		for (int i = 0; i < matrix1.length; i++) {
			
			for (int j = 0; j < matrix1.length + 1; j++) {
				
				System.out.print(matrix1[i][j] + " ");				
			}
			
			System.out.println("");
		}
		
		System.out.println("--------------");
		
		
		int [][] matrix2 = {{10,22,75,33,84}, {82,15,67,35,78}, {58,42,19,37,73}, {13,46,82,75,36}};
		
		for (int i = 0; i < matrix2.length; i++) {
			
			for (int j = 0; j < matrix2.length + 1; j++) {
				
				System.out.print(matrix2[i][j] + " ");
			}
			
			System.out.println(" ");
		}
		

	}

}
