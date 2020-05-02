package EjerciciosPOO;

import java.util.Date;
import java.util.GregorianCalendar;

public class _6_UsoPersona {

	public static void main(String[] args) {

		Empleado2 empleado = new Empleado2("Juan Sánchez", 2500, 2000, 11, 15, "Encargado de planta");
		Alumno alumno = new Alumno("Mauro Rujano", "Está cursando: ", "Biología Molecular");
		
		System.out.println("Empleado: " + empleado.getPersona() + ", " + empleado.getEmpleado2());
		System.out.println("Alumno: " + alumno.getPersona() + alumno.getCarrera());

	}
}

abstract class Persona {
	
	private String nombre;
	private String descripcion;
	
	public Persona (String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public String getDescripcion () {
		return descripcion;
	}
	
	public String getPersona () {
		return "Nombre: " + nombre + ", Descripción: " + descripcion;
	}
}

class Empleado2 extends Persona {
	private double sueldo;
	private int id = 0;
	private static int idFijo = 1;
//	private Date fechaContrato;
	private int anio;
	private int mes;
	private int dia;
	
	public Empleado2 (String nombre, double sueldo, int anio, int mes, int dia, String descripcion) {
		super(nombre, descripcion);
		this.sueldo = sueldo;
		id = idFijo;
		idFijo++;
//		GregorianCalendar fechaCalendario = new GregorianCalendar(anio, mes, dia);
//		fechaContrato = fechaCalendario.getTime();
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}
	
	public String getEmpleado2 () {
		return "Id: " + id + ", Sueldo; " + sueldo + ", Fecha Contrato: " + dia + "/" + mes + "/" + anio;
	}
}

class Alumno extends Persona {
	private String carrera;
	
	public Alumno (String nombre, String descripcion, String carrera) {
		super(nombre, descripcion);
		this.carrera = carrera;
	}
	
	public String getCarrera () {
		return carrera;
	}
}





























