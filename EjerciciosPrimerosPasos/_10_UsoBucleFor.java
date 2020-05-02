package EjerciciosPrimerosPasos;

public class _10_UsoBucleFor {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
			System.out.println("La suma progresiva de i++ es: " + i);
		}
		
		System.out.println("----------------------------------------------");
		
		for (int i = 0; i < 20; i+=2) {
			
			System.out.println("La suma progresiva con salto de i+=2 es: " + i);
		}
		
		System.out.println("----------------------------------------------");
		
		for (int i = 30; i > 20; i--) {
			
			System.out.println("La resta progresiva de i-- es: " + i);
		}
	}
}
