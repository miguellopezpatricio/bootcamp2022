package racecontrol;

public class Coche {
	
	private static final int VELOCIDAD_MAX = 200; 

	// propiedad id para diferenciar?
	private String marca;
	private String modelo;
	// propiedades distancia???, puntuación???, velocidad???...
	
	
	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		
	}

	public void acelera() {
		
	}
	
	public void frena() {
		
	}

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public static int getVelocidadMax() {
		return VELOCIDAD_MAX;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + "]";
	}
	

	
	
	
	
}
