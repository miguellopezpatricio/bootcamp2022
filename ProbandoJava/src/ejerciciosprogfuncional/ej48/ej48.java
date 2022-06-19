package ejerciciosprogfuncional.ej48;

import java.util.function.BiFunction;
import java.util.function.Function;






public class ej48 {
	
	public static void main(String[] args) {
		
		/* Crea una expresión Function que devuelva un valor aleatorio 
		   entre 1 y un valor introducido por parámetro. */
		Function<Integer, Integer> funcionRandom = param -> {
			
			int devol = (int) (Math.random()*param);
			
			return devol;
			
		};
		
		System.out.println("Su número aleatorio: " + funcionRandom.apply(33));
		
		
		/* Crea una expresión Function que reciba una cadena
		 *  y la devuelva convertida en mayúsculas.
		 */
		Function<String, String> funcionMays = param -> param.toUpperCase();
	
		System.out.println("Su texto en mayúsculas: " + funcionMays.apply("¿hola que tal?"));

		/* Crea una expresión BiFunction que reciba 2 números, 
		 * que compare cual es mayor y devuelva un número al azar entre ambos */
		BiFunction<Integer, Integer, Integer> numMayor = (num1, num2) -> {
			
			int diferencia;
			
			if(num1 > num2) {
				diferencia = num1 - num2;
				System.out.println("El mayor es: " + num1);
			} else {
				diferencia = num2 - num1;
				System.out.println("El mayor es: " + num2);
			}

			int devol = (int)Math.random()*diferencia;
			return devol;
		};
		
		System.out.println("Su número random: " + numMayor.apply(3,55));
		
	}

}
