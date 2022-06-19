package ejercicioshilos.ejercicio37;

public class MiClaseHilo extends Thread{
	
	
	

	
	@Override
	public void run() {
		
		for(int i=0; i <=10;i++) {
		System.out.println("Hola, soy el objeto hilo: " + Thread.currentThread().getName());
		
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
