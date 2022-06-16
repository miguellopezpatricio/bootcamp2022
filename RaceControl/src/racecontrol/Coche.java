package racecontrol;


/*
 * Los Coches tienen una Marca y un Modelo que los identifica
 *  y se registran en los Garajes. 
 *  El Garaje al que pertenece un coche, 
 *  le pone una pegatina con el nombre del garaje para identificarlo. 
 *  
 *  Todos los coches tienen la misma velocidad máxima, 
 *  de tal manera que la velocidad que adquiera durante una vuelta
 *   está marcada por la pericia del piloto, 
 *   que parece que acelera y frena el coche aleatoriamente una vez por minuto. 
 *   
 *   Se aplicará un valor de aceleración o deceleración instantáneo, 
 *   por ejemplo, en intervalos de 10 Km/h.
 */

public class Coche {
	
	private static final int VELOCIDAD_MAX = 200; 

	// propiedad id para diferenciar?
	
	private String marca;
	private String modelo;
	private String pegataGarage;
	private int velocidad;
	// private int distanciaCarrera;
	
	
	public Coche(String marca, String modelo) {
		super();
		this.pegataGarage = "";
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = 0;
	
	}

	public void acelera() {
		// + 10
		int controlVel = this.velocidad;
		
		if((controlVel += 10) >= VELOCIDAD_MAX) {
			
		//	System.out.println("¡ALCANZADA VELOCIDAD MÁXIMA!");

		} else this.velocidad += 10;

		
	}
	
	public void frena() {
		// -10
		
	int controlVel = this.velocidad;
		
		if((controlVel -= 10) == 0) {
			
		//	System.out.println("¡EL VEHÍCULO SE HA PARADO!");

		} else this.velocidad -= 10;
		
	}
	
	
	public String getPegataGarage() {
		return pegataGarage;
	}

	public void setPegataGarage(String pegataGarage) {
		this.pegataGarage = pegataGarage;
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
		
		if(pegataGarage == "") {
			pegataGarage = "SIN GARAGE";
		}
		
		return "\nMARCA:" + marca + " MODELO: " + modelo + " GARAGE: "+ pegataGarage + "\n";
	}
	
	
}
