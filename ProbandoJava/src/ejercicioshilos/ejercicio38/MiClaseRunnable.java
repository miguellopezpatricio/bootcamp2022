package ejercicioshilos.ejercicio38;

public class MiClaseRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i <=10;i++) {
		System.out.println("Hola, soy el objeto runnable: " + Thread.currentThread().getName());
		
		
		long rnd = (long) (Math.random()*1000);
		try {
			Thread.currentThread().sleep(rnd);
			System.out.println("Hilo finalizado");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Thread.currentThread().getName();
		}
		}
	}

}
