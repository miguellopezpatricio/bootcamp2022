package ejercicioshilos.ejercicio39;

/*
Crea la clase coche que implemente runnable con marca y modelo como atributos. En el método
run muestra los valores de los atributos separados en un espacio de tiempo (duerme el hilo por
ejemplo 300 milisegundos o 1 segundo).
Arranca en el método main 3 hilos de esta clase y observa su comportamiento con la salida por
pantalla. 
 */

public class Ejercicio39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread c1 = new Thread(new Coche("Ford","Fiesta"));
		Thread c2 = new Thread(new Coche("Seat","Panda"));
		Thread c3 = new Thread(new Coche("Renault","4L"));
		c1.start();
		c2.start();
		c3.start();
		
	}

}
