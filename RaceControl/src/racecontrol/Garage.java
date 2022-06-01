package racecontrol;

import java.util.List;

public class Garage{

	private List<Coche>listaCoches;
	private String pegataGarage;

	
	public Garage(List<Coche>listaCoches, String nombreGarage) {
		

		// Crear lista de coches
		// Se le asigna la pegataGarage a cada garage
		this.listaCoches = listaCoches;
		this.pegataGarage = nombreGarage;
		
		 
	}
	
	public void muestraGarage() {
		System.out.println("Equipo: " + this.pegataGarage);
		
		for(Coche coche:listaCoches) {
			System.out.println(coche.toString());
		}
		
	}

}
