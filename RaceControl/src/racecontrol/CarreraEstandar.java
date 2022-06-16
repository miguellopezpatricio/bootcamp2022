package racecontrol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

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
		
		Map<Coche, Integer>resultadoCarrera = new HashMap<>();
		
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
			resultadoCarrera.put(coche, distanciaCarrera);
		}
		
		// FALTA ORDENAR RESULTADO CARRERA,  POR VALOR
		Map<Coche, Integer>resultadoOrdenado = resultadoCarrera.entrySet().stream()
				.sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)-> e1,LinkedHashMap::new));
		
		
		
		

		
		
		System.out.println("CARRERA FINALIZADA. RESULTADO: " + resultadoOrdenado) ; 
		
	//	resultadoOrdenado.forEach((k,v)->System.out.println(k,v));
		
		// System.out.println("CARRERA FINALIZADA. RESULTADO: " + resultadoCarrera);
		
		
		// 
	}
	
	private void ordenaResultadoCarrera(Map<String, Integer>resultadoCarrera) {
		
	}

	
	


}
