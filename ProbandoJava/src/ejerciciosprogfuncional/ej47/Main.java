package ejerciciosprogfuncional.ej47;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {


	public static void main(String[] args) {

		/* Crea una clase PersonaJava8 donde tenga un nombre y apellidos. 
		Desde el main crea un método que le cambie el nombre a una persona. */
		BiConsumer<PersonaJava8,String> cambiaNombre = (persona, nombre) -> 
											System.out.println("Hola "+ nombre);
	
		
		PersonaJava8 persona = new PersonaJava8();
		cambiaNombre.accept(persona, "Pepe");
		
		/* Crea un método que te pinte por pantalla un String introducido por parámetro. 
		 * Llama a este método para mostrar el contenido de un arrayList */
		Consumer<String> pintaString = texto ->	System.out.println(texto);
		
		List<String>listaTexto = new ArrayList<>();
		listaTexto.add("azul");
		listaTexto.add("blanco");
		listaTexto.add("rojo");
	
		
		for(String text:listaTexto) {
		pintaString.accept(text);
		}
		
		// Haz un método que devuelva un numero al azar.

		
		//Crea una PersonaJava8 con la expresión Supplier y cambiale el nombre.

		
	}

}
