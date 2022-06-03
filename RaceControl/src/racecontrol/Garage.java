package racecontrol;

import java.util.List;

public class Garage{

	private List<Coche>listaCoches;
	private String nombreGarage;
	

	// CONSTRUCTOR
	public Garage(String nombreGarage, List<Coche>listaCoches) {
		
		this.nombreGarage = nombreGarage;
		this.listaCoches = listaCoches;
		
		// Recorrer listaCoches y asignar nombreGarage a cada coche
		asignaPegata(nombreGarage, listaCoches);
		
		
	}
	

	public void extraeCoche() {
		
	}
	

	public List<Coche> getListaCoches() {
		return listaCoches;
	}

	




	public void setListaCoches(List<Coche> listaCoches) {
		this.listaCoches = listaCoches;
	}





	public String getNombreGarage() {
		return nombreGarage;
	}





	public void setNombreGarage(String nombreGarage) {
		this.nombreGarage = nombreGarage;
	}





	// ASIGNA PEGATA A CADA COCHE DEL GARAGE
	private void asignaPegata(String nombreGarage, List<Coche> listaCoches) {

		for(Coche coche:listaCoches) {
			coche.setPegataGarage(nombreGarage);
		}
	}

	// MUESTRA COCHES DEL GARAGE
	public void muestraGarage() {
		System.out.println("Equipo: " + this.nombreGarage);
		
		for(Coche coche:listaCoches) {
			System.out.println(coche.toString());
		}
		
	}

}
