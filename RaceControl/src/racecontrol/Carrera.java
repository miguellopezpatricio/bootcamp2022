package racecontrol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * En los Torneos y las Carreras, pueden participar uno o varios Garajes. 
 * Si participa uno, todos sus coches entrarán en la competición. 
 * En el caso de ser más de uno, solo competirá un coche de cada Garaje, 
 * elegido de forma aleatoria.
 * 
 * El resultado de cualquier carrera dependerá de la distancia recorrida
 *  en el mismo tiempo por cada coche que participa en la carrera.
 */


public abstract class Carrera {


	private String nombreCarrera;
	private List<Coche>listaCoches;
	
	/*
	 * CREAR ARRAYLISTS DE PODIOS O UN HASHMAP
	 */
	
	
	public Carrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	
	
	public Carrera(String nombreCarrera, List<Coche> listaCoches) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.listaCoches = listaCoches;
	}






	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}




	public List<Coche> getListaCoches() {
		return listaCoches;
	}




	public void setListaCoches(List<Coche> listaCoches) {
		this.listaCoches = listaCoches;
	}


	public void addCochesCarrera(List<Coche> listaCoches) {
	/*	for(Coche coche:listaCoches) {
			this.listaCoches.add(coche);
		} */
		
	this.listaCoches = listaCoches;

	}

	public void getInfoCarrera() {
		System.out.println("NOMBRE CARRERA: " + this.nombreCarrera);
		System.out.println("PARTICIPANTES: ");

		for(Coche coche:listaCoches) {
			System.out.println(coche);
			
		}
	}
	
	// método para lanzar una carrera
	public void startCarrera(List<Coche>participantes) {
		
	}
	
	
		
	// uso de un tipo de collection que permita guardar por orden los participantes de una carrera
	// o mejor usar clases ?
	
}
