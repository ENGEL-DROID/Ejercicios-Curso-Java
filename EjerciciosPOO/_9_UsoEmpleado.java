package EjerciciosPOO;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class _9_UsoEmpleado {

	public static void main(String[] args) {
		
		JefaturaUso jefe1 = new JefaturaUso("Miguel Santos", 3500, 2010, 10, 8);
		jefe1.setDesicion("Vender todas las acciones con urgencia.");
		jefe1.setBono(3500);
		
		JefaturaUso jefe2 = new JefaturaUso("Rossana", 4200, 2006, 7, 12);
		jefe2.setBono(3000);
		
		EmpleadoUso empleado1 = new EmpleadoUso("Abel", 2300, 2005, 11, 25);
		empleado1.setBono(2100);
		
		EmpleadoUso empleadosLista[] = new EmpleadoUso [7];
		
		empleadosLista[0] = new EmpleadoUso("Miguel", 3500, 2010, 10, 8);
		empleadosLista[1] = new EmpleadoUso("William", 2500, 2000, 5, 1);
		empleadosLista[2] = new EmpleadoUso("Nayla", 2800, 1998, 3, 20);
		empleadosLista[3] = new EmpleadoUso("Diego");
		empleadosLista[4] = new EmpleadoUso("Ángela", "Ruiz");
		empleadosLista[5] = jefe2;
		empleadosLista[6] = new JefaturaUso("Andrea", 5500, 2002, 4, 20);
		
		JefaturaUso jefe3 = (JefaturaUso) empleadosLista[6];
		jefe3.setBono(55000);
		
		Arrays.sort(empleadosLista);
		
		System.out.println("El jefe de Mercadeo ha tomado la desición de: " + jefe1.getDesicionJefe());
		System.out.println("El jefe : " + jefe1.getNombre() + " tiene un bono de: " + jefe1.getBonoJefe() + "€");
		System.out.println("El empleado : " + empleado1.getNombre() + " tiene un bono de: " + empleado1.getBonoEmpleado() + "€");
		
		for (EmpleadoUso item: empleadosLista) {
			System.out.println("Id empleado Nº" + item.getId() + " - Nombre: " + item.getNombre() + ", Salario: " + item.getSalario() + "€, Fecha de contrato: " + item.getFechaContrato());                                                            
		}
	}
}

class EmpleadoUso implements Trabajadores, Comparable {
	
	private String nombre;
	private double sueldo;
	private double sueldoTotal;
	private String apellido;
	private double bonoEmpleado;
	private Date fechaContrato;
	private int id = 0;
	private static int idFijo = 1;
	
	public EmpleadoUso(String nombre, double sueldo, int anio, int mes, int dia) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar fechaGregorian = new GregorianCalendar(anio,mes-1,dia);
		fechaContrato = fechaGregorian.getTime();
	}
	
	public EmpleadoUso(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public EmpleadoUso(String nombre) {
		this(nombre,3000,2000,1,15);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getId() {
		id = idFijo;
		idFijo++;
		return id;
	}
	
	public double getSalario() {
		if(sueldo > 0) {
			sueldoTotal = sueldo;
		} else {
			sueldoTotal = salarioBase;
		}
		return sueldoTotal;
	}
	
	public Date getFechaContrato() {
		return fechaContrato;
	}

	@Override
	public void setBono(double bono) {
		this.bonoEmpleado = bono;
	}
	
	public double getBonoEmpleado() {
		return bonoEmpleado;
	}

	@Override
	public int compareTo(Object objeto) {
		EmpleadoUso objetoNew = (EmpleadoUso) objeto;
		if (this.sueldoTotal < objetoNew.sueldoTotal) {
			return -1;
		}
		if (this.sueldoTotal > objetoNew.sueldoTotal) {
			return 1;
		}
		return 0;
	}
	
}


class JefaturaUso extends EmpleadoUso implements Jefe {
	
	private double sueldo;
	private double bonoJefe;
	private String desicion;
	
	public JefaturaUso(String nombre, double sueldo, int anio, int mes, int dia) {
		super(nombre, sueldo, anio, mes, dia);
		this.sueldo = sueldo;
	}
	
	@Override
	public void setBono(double bono) {
		this.bonoJefe = bono;
	}
	
	public double getBonoJefe() {
		return bonoJefe;
	}
	
	public double getSalarioTotalJefe() {
		double salarioTotalJefe = sueldo + bonoJefe;
		return salarioTotalJefe;
	}

	@Override
	public void setDesicion(String desicion) {
		this.desicion = desicion;
	}
	
	public String getDesicionJefe() {
		return desicion;
	}
}





















