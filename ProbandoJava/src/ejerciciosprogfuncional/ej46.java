package ejerciciosprogfuncional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

// Haz un ejemplo usando la expresión lambda Consumer y BiConsumer

public class ej46 {

	public static void main(String[] args) {
		
		Consumer<String> consumidor = texto -> {
			
			System.out.println("Hola "+texto);
		};
		
		consumidor.accept("Pepe");
		
		BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> {
			
			System.out.println(nombre + " tiene " + edad + " años");
		};

		consumidorBi.accept("Pepe", 44);
		
	}

}
