package racecontrol;

import java.util.List;
import java.util.Scanner;

public class Menu {

	public static void menuPrincipal(List<Coche>listaCoches, Carrera carrera) {

		/*
		 * System.out.println("*************************");
		 * System.out.println("* R A C E C O N T R O L *");
		 * System.out.println("* 1 - Ver coches        *");
		 * System.out.println("* 2 - Añadir coches     *");
		 * System.out.println("* 3 - Ver garages       *");
		 * System.out.println("* 4 - Ver carreras      *");
		 * System.out.println("* 5 - Ver torneos       *");
		 * System.out.println("* 6 - Iniciar carrera   *");
		 * System.out.println("* 0 - SALIR             *");
		 * System.out.println("*************************");
		 */

		Scanner sc = new Scanner(System.in);

		int opcion;
		do {
			

			System.out.println("*************************");
			System.out.println("* R A C E C O N T R O L *");
			System.out.println("* 1 - Ver info coches   *");
			System.out.println("* 2 - Ver info carrera  *");
			System.out.println("* 3 - Iniciar carrera   *");
			System.out.println("*                       *");
			System.out.println("* 0 - SALIR             *");
			System.out.println("*************************");
			
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println(listaCoches.toString());
				break;
			case 2:
				carrera.getInfoCarrera();
				break;
				
			case 3:
				carrera.startCarrera(listaCoches);
				break;
			}
			
		} while (opcion != 0);
		
		System.out.println("BYE, BYE!!!");
		
	}

}
