package ejerciciosprogfuncional;

import java.util.stream.Stream;

public class ej51 {

	public static void main(String[] args) {

		/* Crea un Stream de nombres de personas
		 *  y muestra sus datos por consola (en 2 líneas de código)
		 */
		Stream<String>nombres = Stream.of("Pepe","Josefa","Luisa","Manuel");
		nombres.forEach(e -> System.out.println(e));
		
	}

}
