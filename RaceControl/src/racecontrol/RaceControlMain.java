package racecontrol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class RaceControlMain {
	

	public static void main(String[] args) {

		/*
		 * RACE CONTROL
		 
		 * Gestionar Torneos y Carreras
		 */
		
	//	Menu.menuPrincipal();
		
		
		
		// Participantes

		// Crear colección garage con lista de coches
	
		// Creamos coches
		Coche coche1 = new Coche("Ford","Mustang");
		Coche coche2 = new Coche("Opel","Meriva");
		Coche coche3 = new Coche("Seat","Ibiza");
		Coche coche4 = new Coche("Renault","4L");

		// Creamos lista de coches para garages
		List<Coche>lista1 = new ArrayList<>();
		lista1.add(coche1);
		lista1.add(coche2);
		Garage garage1 = new Garage("TopGarage",lista1);
		
		
		/*
		 * CREAR CARRERA SIN LISTA DE COCHES NI GARAGES
		 * MÉTODO EN CARRERA PARA IR AÑADIENDO COCHES
		 */
		
		Carrera carrera1 = new CarreraEstandar("VigoRace");
		
		carrera1.addCochesCarrera(garage1.getListaCoches());
		
		
		carrera1.getInfoCarrera();
	
		

		// CREAMOS TORNEO al que se le irán añadiendo carreras
		Torneo torneo1 = null;
		
		
		
		
		// CREAMOS CARRERA DE ELIMINACIÓN
		
		/*
		 * Para crear una carrera extraemos aleatoriamente 
		 * coches de los garages y los metemos en un array
		 * de objeto Carrera 
		 * 
		 */
	
		CarreraEliminacion carreraEl1 = null;
		
		// en el constructor de la Carrera se llama al...
		// Método para añadir aleatoriamente 1 ó más Garages a 1 Carrera
		// si solo es 1 Garage, compiten todos sus coches, si hay más de 1 Garage
		// se selecciona 1 coche de cada garage
		// 
		
		// Crear HashMaps para clasificaciones
		
		
		
		
		
		
	
		// al selecionar SALIR DEL MENU se guarda el archivo con los datos
		// formato???
		
	/*
	 * 1 . Se crea un Torneo > se preguntan las carreras que va a tener
	 * 2.  Se crean carreras
	 * 3. Se indican los Garages/Coches para cada Torneo/Carrera
	 * 
	 * 
	 */
		
		// 1 Creamos una carrera > se unen X garages
		
		
		// A cada garage se le unen  X coches
		
	
		
	}

}
