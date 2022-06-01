package racecontrol;

import java.util.ArrayList;
import java.util.List;

public class RaceControlMain {
	
	public static void creaGarage() {
		// Creamos coches
		Coche coche1 = new Coche("Ford","Mustang");
		Coche coche2 = new Coche("Opel","Meriva");
		Coche coche3 = new Coche("Seat","Ibiza");
		Coche coche4 = new Coche("Renault","4L");
		
		List<Coche>listaCoches1 = new ArrayList<>();
		listaCoches1.add(coche1);
		listaCoches1.add(coche2);
		
		List<Coche>listaCoches2 = new ArrayList<>();
		listaCoches1.add(coche3);
		listaCoches1.add(coche4);
		
		
		// Participantes
		Garage garage1 = new Garage(listaCoches1,"Equipo1");
		garage1.muestraGarage();
		
		Garage garage2 = new Garage(listaCoches2, "Equipo2");
		garage2.muestraGarage();
		
		
	}

	public static void main(String[] args) {

		/*
		 * RACE CONTROL
		 
		 * Gestionar Torneos y Carreras
		 */
		
		Menu.menuPrincipal();
		creaGarage();
	
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
