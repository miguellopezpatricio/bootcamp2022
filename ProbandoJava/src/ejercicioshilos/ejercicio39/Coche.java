package ejercicioshilos.ejercicio39;

public class Coche implements Runnable{

	private String marca;
	private String modelo;
	
	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public void run() {

		

		try {
			System.out.println("MARCA: " + this.marca);
			Thread.currentThread().sleep(10000);
			System.out.println("MODELO: " + this.modelo);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
