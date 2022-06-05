package racecontrol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RaceControlMain {
	
	

	public static void main(String[] args) {
				

		/*
		 * RACE CONTROL
		 * Gestionar Torneos y Carreras
		 */
		
		
		
		// Participantes

		// Crear colección garage con lista de coches
	
	
				// Recuperamos los coches del fichero json
		List<Coche>listaCoches = PersistenciaDatos.recuperaDatos();
		
		Garage garage1 = new Garage("TopGarage",listaCoches);
		
		// garage1.muestraGarage();
		
		
		// creando carrera y añadiendo coches
		
		Carrera carrera1 = new CarreraEstandar("VigoRace");
		
		carrera1.addCochesCarrera(garage1.getListaCoches());
		
		
		// carrera1.getInfoCarrera();
		// carrera1.startCarrera(listaCoches);

		
		Menu.menuPrincipal(listaCoches, carrera1);
		

		// CREAMOS TORNEO al que se le irán añadiendo carreras
		// Torneo torneo1 = null;

	
		
	}

}
