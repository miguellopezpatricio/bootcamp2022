package racecontrol;

import java.util.List;

// debería de ser una abstracta?
public class Carrera {


	private String nombre;
	private enum tipoCarrera{estándar, eliminación};
	
	
	public Carrera(String nombre, List<Garage> garages) {
		this.nombre = nombre;
		
	}
	
	// metodo para crear carrera
	
	// uso de un tipo de collection que permita guardar por orden los participantes de una carrera
	// o mejor usar clases ?
	
	
	
	
	
}
