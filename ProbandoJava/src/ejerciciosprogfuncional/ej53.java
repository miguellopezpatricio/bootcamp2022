package ejerciciosprogfuncional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ej53 {

	public static void main(String[] args) {

		/* Crea un Stream de nombre de personas en minúscula, 
		 * conviértelo en nombres con solo la primera en minúscula , 
		 * muéstralo por pantalla , luego haz a la inversa
		 *  (primera mayúscula y las siguientes minúsculas), 
		 *  muéstralo por pantalla y luego mételo dentro de una lista.
		 */
		
		Stream<String>nombres = Stream
				.of("pepe","josefa","luisa","manuel")
				.map(nombre ->{
					return nombre.charAt(0) + nombre.substring(1,nombre.length()).toUpperCase(); 
				});
		
		nombres.forEach(System.out::println);
		
		List<String> lista = nombres.collect(Collectors.toList());
		
		

		
	}

}
