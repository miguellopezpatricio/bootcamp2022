package ejercicioshilos.ejercicio36;

import ejercicioshilos.ejercicio37.MiClaseHilo;

/*
 * Crea una clase que implemente Runnable en el que, durante X veces, se muestre el nombre del
hilo, se duerma ese hilo durante un tiempo aleatorio y al finalizar se muestre que el hilo ha
terminado

Crea una clase que extienda de Thread en el que, durante X veces, se muestre el nombre del
hilo, se duerma ese hilo durante un tiempo aleatorio y al finalizar se muestre que el hilo ha
terminado

En el hilo principal (main) vete viendo como va cambiando de estado las instancias de las clases
anteriores (puedes dormir e hilo principal durante algún segundo para verlo más claro) 
 */


public class Ejercicio36 {

	public static void main(String[] args) {


		Thread mcr = new Thread(new MiClaseRunnable());
		MiClaseHilo mch = new MiClaseHilo();
		mcr.start();
		mch.start();

		

		
	}

}
