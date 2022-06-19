package ejercicioshilos.ejercicio40;

public class Fabrica {
	
	private String coche;
	private boolean disponible;
	
	public synchronized void fabricar(String pieza) {
		while(disponible) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		this.coche = pieza;
		System.out.println("Distribuidor reparte: " + this.coche);
		this.disponible = true;
		notify();
	}
	
	public synchronized String comprar() {
		while(!disponible) {
			try {
				System.out.println("Espere... no hay coches");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		System.out.println("Cliente compra: " + this.coche);
		this.disponible = false;
		notify();
		return coche;
	}


	
}



