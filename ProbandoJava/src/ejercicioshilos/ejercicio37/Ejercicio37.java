package ejercicioshilos.ejercicio37;

import ejercicioshilos.ejercicio36.MiClaseRunnable;

/*
 * Crea 3 hilos de la clase que implementa Runnable (ejercicio 36)
 *  y arráncalos. Interpreta lo que salga por pantalla 
 */

public class Ejercicio37 {

	public static void main(String[] args) {

		Thread mcr1 = new Thread(new MiClaseRunnable());
	   	Thread mcr2 = new Thread(new MiClaseRunnable());
		Thread mcr3 = new Thread(new MiClaseRunnable());
		
		mcr1.start();
		mcr2.start();
		mcr3.start();
		
		
		
	}

}
