package ejercicioshilos.ejercicio38;

import ejercicioshilos.ejercicio36.MiClaseRunnable;

/*
 * Siguiendo con el ejercicio anterior, 
 * usa el método join e interpreta la salida por pantalla. 
 */

public class Ejercicio38 {

	public static void main(String[] args) {

		Thread mcr1 = new Thread(new MiClaseRunnable());
		Thread mcr2 = new Thread(new MiClaseRunnable());
		Thread mcr3 = new Thread(new MiClaseRunnable());
		
		mcr1.start();
		mcr2.start();
		mcr3.start();
		
		try {
			mcr1.join();
			mcr2.join();
			mcr3.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	}

}
