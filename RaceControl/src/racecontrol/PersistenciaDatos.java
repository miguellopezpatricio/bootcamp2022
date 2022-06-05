package racecontrol;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonParser;

import org.json.*;
/*
 * Clase para manejar los datos: 
 * guardar y recuperar la info del fichero json/xml
 */

/*
 * En la aplicación, se pretende guardar el estado del programa, 
 * de manera que no sea necesario insertar de nuevo la información
 *  de los Coches, Garajes, Carreras y Torneos en un fichero.
 *  
 *  Este fichero debe cargarse cada vez que se inicia
 *  el programa y debe actualizarse antes de finalizar el programa.
 */

// TUTORIAL SOBRE JSON + JAVA: https://youtu.be/yLf2-r8w9lQ

public class PersistenciaDatos {

	private static String file = "coches.json";
	
	public static List<Coche> recuperaDatos() {
	
		String jsonText = "";
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine())!=null) {
				jsonText += line + "\n";
			}
			// System.out.println(jsonText);
			br.close();
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
		
		
		/*
		 * Creamos un array de objetos coche para ir creando objetos
		 * cogiendo los datos leídos del fichero json
		 */
		
		List<Coche>listaCoches = new ArrayList<>();
		

		try {
			JSONParser parser = new JSONParser();
			Object object = parser.parse(jsonText);
			JSONObject mainJsonObject = (JSONObject)object;
			
			JSONArray jsonArrayCoches = (JSONArray)mainJsonObject.get("coches");
			// System.out.println("coches: ");
			
			for(int i = 0; i < jsonArrayCoches.size();i ++) {
				JSONObject jsonCoches = (JSONObject) jsonArrayCoches.get(i);
				
				String marca = (String) jsonCoches.get("marca");
				// System.out.println("Marca: " + marca);
				
				String modelo = (String) jsonCoches.get("modelo");
				// System.out.println("Modelo: " + modelo);

				// Creando objeto coche
				listaCoches.add(new Coche(marca, modelo));
			}
		
			/*
			System.out.println("LISTADO DE COCHES:");
			for(Coche coche:listaCoches) {
				System.out.println(coche.toString());
			} */
			
		}catch(Exception ex) {
			
		}

		 return listaCoches;
	}
	
	public static void guardaDatos() {
		
	}
	
	
}
