package racecontrol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CarreraEstandar extends Carrera{

	// CARACTERÍSTICAS DE CARRERA ESTÁNDAR
	private String nombreCarrera;
	private int duracion = 3;
	
	
	
	public CarreraEstandar(String nombreCarrera) {
		super(nombreCarrera);
		this.nombreCarrera = nombreCarrera;

	
	}



	@Override
	public void getInfoCarrera() {
		// TODO Auto-generated method stub
		super.getInfoCarrera();
		System.out.println("Tipo de carrera: ESTANDAR");
	}
	

	
	// MÉTODO PARA REALIZAR CARRERA ESTANDAR 
	// Y SELECCIONAR AL GANADOR
	// método para lanzar una carrera
	
	@Override
	public void startCarrera(List<Coche>participantes) {
		/*
		 *  AQUÍ SE REALIZA CARRERA ESTANDAR:
		 * duración y distancia... en un bucle for (duración) 
		 * se va aumentando distancia recorrida
		 * y los coches aceleran y frenan aleatoriamente. 
		 * Queda 1 ganador y 2 más en el podio.
		 *  
		 */
		
		/*
		 * bucle for de 180 vueltas (3 horas) 
		 */
		
		/*
		 * EN UN HASHMAP SE COLOCARÁ
		 */
		
		int distanciaCarrera = 0;
		double valorRandom;
		
		Map<String, Integer>resultadoCarrera = new HashMap<>();
		
		for(Coche coche: participantes) {
			coche.acelera();
			distanciaCarrera += 10;
			
			for(int i = 0; i<=180; i++) {
			 // RANDOM 0 ó 1 PARA FRENAR O ACELERAR
				 // SI acelera llama a metodo acelera y suma 10 a distanciaCarrera
				// si frena llama a frena y resta 10 a distanciaCarrera
				
				// Necesitamos un tipo de lista clave : valor 
				// para almacenar COCHE : DISTANCIA
				// luego se ordenará la lista
				
				
				
				valorRandom = Math.floor(Math.random()*2);
				if(valorRandom  == 0) {
					coche.frena();
					
				
				} else {
					coche.acelera();
					distanciaCarrera += 10;
				}
			}
			
			// finaliza la carrera y se añade resultado a HashMap
			resultadoCarrera.put(coche.getMarca(), distanciaCarrera);
		}
		
		// FALTA ORDENAR RESULTADO CARRERA POR VALOR
		System.out.println("CARRERA FINALIZADA. RESULTADO: " + resultadoCarrera);
		// sortHashMapByValues((HashMap<String, Integer>) resultadoCarrera);
	}

	public void sortHashMapByValues(
	        HashMap<String, Integer> passedMap) {
	    List<String> mapKeys = new ArrayList<>(passedMap.keySet());
	    List<Integer> mapValues = new ArrayList<>(passedMap.values());
	    Collections.sort(mapValues);
	    Collections.sort(mapKeys);

	    LinkedHashMap<String, Integer> sortedMap =  new LinkedHashMap<>();

	    Iterator<String> keyIt = mapKeys.iterator();
	    while (keyIt.hasNext()) {
	        String key = keyIt.next();
	        Iterator<Integer> valueIt = mapValues.iterator();

	        while (valueIt.hasNext()) {
	            Integer val =valueIt.next();
	            Integer comp1 = passedMap.get(val);
	            Integer comp2 = val;

	            if (comp1.equals(comp2)) {
	                keyIt.remove();
	                sortedMap.put(key, val);
	                break;
	            }
	        }
	    }
	   
	    for(String clave:sortedMap.keySet()) {
	    	System.out.println(clave + ": " + sortedMap.get(clave));
	    }
	    
	}
	
	


}
