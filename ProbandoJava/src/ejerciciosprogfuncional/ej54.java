package ejerciciosprogfuncional;

import java.util.stream.Stream;

public class ej54 {

	public static void main(String[] args) {

		/* Crea un Stream de nombre de personas en mayúsculas, 
		 * conviértelo en nombres con solo la primera en mayúscula
		 *  (el resto en minúsculas), y muestra por pantalla, 
		 *  sólo los nombres que empiecen por J. 
		 */
		
		Stream<String>nombres = Stream
				.of("pepe","josefa","luisa","manuel")
				.map(nombre ->{
					return nombre.charAt(0) + nombre.substring(1,nombre.length()).toUpperCase(); 
				});
		
		nombres.forEach(System.out::println);
		
	}

}
