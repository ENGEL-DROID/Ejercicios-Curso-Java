package EjerciciosPOO;

class Coche {	
	private int ruedas;
	private double largo;
	private double ancho;
	private int motor;
	private double pesoPlataforma;
	private String color;
	private String asientosCuero;
	private String climatizador;
	
	public Coche(String color, String asientosCuero, String climatizador) {
		ruedas = 4;
		largo = 250.0;
		ancho = 150.0;
		motor = 3600;
		pesoPlataforma = 500.0;
		this.color = color;
		this.asientosCuero = asientosCuero;
		this.climatizador = climatizador;
	}
	
	public double getPesoPlataforma () {
		return pesoPlataforma;
	}
	
	public String getAsientosCuero () {
		boolean confirmarAsientos = false;
		if (asientosCuero.equalsIgnoreCase("Si")) {
			confirmarAsientos = true;
		} else if (asientosCuero.equalsIgnoreCase("No")) {
			confirmarAsientos = false;
		}
		if (confirmarAsientos) {
			return "Si tiene";
		} else {
			return "No tiene";			
		}
	}	
	
	public String getClimatizador () {		
		if (climatizador.equalsIgnoreCase("Si")) {			
			return "Si tiene";			
		} else {			
			return "No tiene";
		}
	}
	
	public double getPesoTotal () {		
		double pesoCarroceria = 1000;		
		double pesoTotal = pesoPlataforma + pesoCarroceria;		
		if (climatizador.equalsIgnoreCase("Si")) {
			pesoTotal += 60;
		}		
		return pesoTotal;
	}
	
	public double getPrecioTotal () {		
		double precioFinal = 10000;		
		if (asientosCuero.equalsIgnoreCase("Si")) {
			precioFinal += 600;
		}
		if (climatizador.equalsIgnoreCase("Si")) {
			precioFinal += 900;
		}
		return precioFinal;
	}
	
	public String getCoche () {		
		return "Ruedas: " + ruedas + "ud, Largo: " + largo/100 + "m, Ancho: " + ancho/100 + "m, Motor: " + motor + "rpm, Peso Plataforma: " + pesoPlataforma + "kg, Color: " + color;                                              
	}	
}