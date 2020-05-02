package EjerciciosPOO;

public class _1_PruebaFinal {

	public static void main(String[] args) {

		Empleado empleados[] = new Empleado[3];
		
		empleados[0] = new Empleado("Jos� de los Campos");
		empleados[1] = new Empleado("Mar�a Arreaza");
		empleados[2] = new Empleado("Diego de la Torre");
		
		empleados[1].setDepartamento("Marketing");
		empleados[2].setDepartamento("Ventas");
		
		for (int i=0; i<empleados.length; i++) {
			
			System.out.println(empleados[i].getEmpleado());
		}
	}
}

class Empleado {
	
	private String nombre;
	private String departamento;
	private int id = 0;
	private static int idFijo = 1;
	
	public Empleado(String nombre) {

		this.nombre = nombre;
		departamento = "Administraci�n";
		id = idFijo;
		idFijo++;
	}
	
	public String getEmpleado () {
		
		return "Id: " + id + " - Empleado: " + nombre + ", Departamento: " + departamento;
	}
	
	public void setDepartamento (String departamento) {
		
		this.departamento = departamento;
		
	}
}



















