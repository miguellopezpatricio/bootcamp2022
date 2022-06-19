package ejerciciosprogfuncional;

import java.util.stream.Stream;

public class ej52 {

	public static void main(String[] args) {

		/* Crea un Stream de nombre de personas en mayúsculas, 
		 * conviértelo en nombres con solo la primera en mayúscula 
		 * (el resto en minúsculas), muéstralo por pantalla
		 *  y luego mételo dentro de una lista. */
		
		
		Stream<String>nombres2 = Stream
				.of("PEPE","JOSEFA","LUISA","MANUEL")
				.map(nombre ->{
					return nombre.charAt(0) + nombre.substring(1,nombre.length()).toLowerCase(); 
				});
		
		nombres2.forEach(System.out::println);
		

	}

}
