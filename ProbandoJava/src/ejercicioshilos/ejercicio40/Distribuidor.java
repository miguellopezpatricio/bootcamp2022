package ejercicioshilos.ejercicio40;

import java.util.concurrent.ThreadLocalRandom;

public class Distribuidor implements Runnable{
	
	private Fabrica fab;
	
	

	public Distribuidor(Fabrica fab) {
		
		this.fab = fab;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i = 0; i<10;i++) {
		fab.fabricar("Coche nº: " + i);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}

}
