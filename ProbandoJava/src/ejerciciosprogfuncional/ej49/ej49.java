package ejerciciosprogfuncional.ej49;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ej49 {

	public static void main(String[] args) {

		
		// Crea un Predicate que reciba un numero y te diga si es divisible entre 2.
		Predicate<Integer>divisiblePorDos = num ->num % 2 == 0;
		
		System.out.println("Tu número es divisible por 2: " + divisiblePorDos.test(23));

		
		/* Crea un BiPredicate que te diga si dos cadenas introducidas son iguales ignorando
		mayúsculas/minúsculas. */
		BiPredicate<String, String> comparaCadenas = (texto1,texto2)->{
			return texto1.equalsIgnoreCase(texto2);
		};
		
		System.out.println("¿Son textos iguales?: " + comparaCadenas.test("hoLA", "Hola"));
		
	}

}
