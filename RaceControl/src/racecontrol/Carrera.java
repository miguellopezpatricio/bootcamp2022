package racecontrol;

import java.util.List;

public class Carrera {


	private String nombre;
	private enum tipoCarrera{estándar, eliminación};
	
	
	public Carrera(String nombre, List<Garage> garages) {
		this.nombre = nombre;
		
		
	};
	
	
}
