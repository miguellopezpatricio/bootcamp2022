package ejercicioshilos.ejercicio40;

public class Comprador implements Runnable {

	private Fabrica fabrica;

	public Comprador(Fabrica fabrica) {

		this.fabrica = fabrica;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {

			fabrica.comprar();
		}
	}

}
