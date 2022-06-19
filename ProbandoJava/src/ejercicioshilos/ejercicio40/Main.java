package ejercicioshilos.ejercicio40;

/*
 * Crea una clase distribuidor de coches donde se va a almacenar cuantos coches ha vendido y si
tiene stock o no. Además contendrá la funcionalidad de poner un coche a la venta y otra que
será la de vender un coche.

Crea una clase fabricante de automóvil, que cada cierto tiempo (por ejemplo entre 10 y 15
segundos), intente entregar un coche al distribuidos de coches (esto durante un numero
determinado de veces)

Crea una clase comprador de coches que, durante un número determinado de veces, intente
comprar un coche.

Desde el método main inicialízalos y observa qué va ocurriendo. 
 */

public class Main {

	public static void main(String[] args) {
		

		// incluir control de stock
		
		Fabrica fab = new Fabrica();
		new Thread(new Distribuidor(fab)).start();
		new Thread(new Comprador(fab)).start();
	}

}
