package racecontrol;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {
	
	/*
	 * MEJOR CREAR OBJETO MENÚ 
	 * CON PROPIEDADES (listas de coches, garages, etc) 
	 * Y MÉTODOS ESTÁTICOS
	 * 
	 */
	
	private static List<Coche>listaCoches;
	private static List<Garage>listaGarages;
	private static List<Carrera>listaCarreras;
	private static Map<String, Carrera>listaTorneos;

	public static void menuPrincipal() throws IOException {

		// inicializa y rellena lista coches
		listaCoches = PersistenciaDatos.recuperaDatos();

		// inicializa y rellena lista garages RANDOM?
		Garage garage1 = new Garage("TopGarage",listaCoches);
		listaGarages = new ArrayList<>();
		listaGarages.add(garage1);
		// garage1.muestraGarage();
		
		// inicialia carreras y torneos
		
		// creando carrera y añadiendo coches
		
		Carrera carrera1 = new CarreraEstandar("VigoRace");
		
		carrera1.addCochesCarrera(garage1.getListaCoches());
		

		
		
		Scanner sc = new Scanner(System.in);

		int opcion;
		do {
			

			System.out.println("*************************");
			System.out.println("* R A C E C O N T R O L *");
			System.out.println("* 1 - Ver info coches   *");
			
			// Esta opción guardará automáticamente el objeto en el json
			System.out.println("* 2 - Añadir coche      *");
			
			// Visualiza los garages existentes
			System.out.println("*     Ver Garages       *");
			
			// Esta opción crerá nuevo objeto garage y guardará automáticamente el objeto en el json
			System.out.println("* 4 - Añadir garage     *");
			
			System.out.println("* 5 - Ver info carreras *");
			
			// Esta opción guardará automáticamente el objeto en el json
			System.out.println("*     Añadir carrera    *");
			
			System.out.println("* 6 - Iniciar carrera   *");
			
			// Si hay carreras, se crea automáticamente un torneo
			System.out.println("*     Ver torneos       *");
			System.out.println("*                       *");
			System.out.println("* 0 - SALIR             *");
			System.out.println("*************************");
			
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println(listaCoches.toString());
				break;
				
			case 2:
				
				nuevoCoche(listaCoches);
				PersistenciaDatos.guardaDatos(listaCoches);
				break;
				
			/* case 3:
			 *  ver garages
			 * 
			 * break;
			 */
				
				
			case 4: 
			  //añadir garage
				nuevoGarage(listaGarages);
			  
			 break;
			 
				
			case 5:
				listaCarreras.toString();
				break;
				
			case 6:
				// Habría que preguntar qué carrera iniciar 
				// carrera.startCarrera(listaCoches);
				break;
			}
			
		} while (opcion != 0);
		
		System.out.println("BYE, BYE!!!");
		
	}

	private static void nuevoCoche(List<Coche>listaCoches) {
		System.out.println("Creando nuevo coche...");
	
		Scanner scan = new Scanner(System.in);
		String marca, modelo;
		System.out.println("Marca: ");
		marca = scan.nextLine();
		System.out.println("Modelo: ");
		modelo = scan.nextLine();
		
		listaCoches.add(new Coche(marca, modelo));
		
		// Hay que llamar a método de guardar json en PersistenciaDatos
		
		
	}
	
	private static void nuevoGarage(List<Garage>listaGarages) {

		System.out.println("Creando nuevo garage...");
		
		Scanner scan = new Scanner(System.in);
		String nombreGarage;
		System.out.println("Nombre nuevo garage: ");
		nombreGarage = scan.nextLine();
	
		// añadir coches a nuevo garage o añadir luego desde menú
		listaGarages.add(new Garage(nombreGarage));
		
	}

}
