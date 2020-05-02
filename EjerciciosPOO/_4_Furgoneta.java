package EjerciciosPOO;

class Furgoneta extends Coche {
	
	private double capacidadCarga;
	private int plazasExtra;
	private String climatizadorFurgo;
	private String asientosCueroFurgo;
	
	public Furgoneta(String color, String asientosCuero, String climatizador, double capacidadCarga, int plazasExtra) {
		super(color, asientosCuero, climatizador);
		this.capacidadCarga = capacidadCarga;
		this.plazasExtra = plazasExtra;
		climatizadorFurgo = climatizador;
		asientosCueroFurgo = asientosCuero;
	}
	
	public double getPesoTotalFurgo () {
		double pesoTotalFurgo = 0;
		double pesoCarroceríaFurgo = 2000;
		double plazasExtraFurgo = plazasExtra * 20;
		pesoTotalFurgo = pesoCarroceríaFurgo + plazasExtraFurgo + getPesoPlataforma();
		if (climatizadorFurgo.equalsIgnoreCase("Si")) {
			pesoTotalFurgo += 60.0;
		}
		return pesoTotalFurgo;
	}
	
	public double getPrecioTotalFurgo () {
		double precioTotalFurgo = 14000;
		double asientosExtraFurgo = plazasExtra * 200;
		if (climatizadorFurgo.equalsIgnoreCase("Si")) {
			precioTotalFurgo += 300;
		}
		if (asientosCueroFurgo.equalsIgnoreCase("Si")) {
			precioTotalFurgo += 600;
		}
		return precioTotalFurgo + asientosExtraFurgo;
	}
	
	public String getFurgoneta() {
		return "Capacidad de carga: " + capacidadCarga + "kg y " + plazasExtra + " plazas extra";
	}
}
