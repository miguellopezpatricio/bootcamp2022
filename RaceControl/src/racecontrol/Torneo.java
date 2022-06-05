package racecontrol;

import java.util.List;

/*
 * Un Torneo tendrá puntuaciones para cada coche que participe. 
 * Se entregarán puntuaciones a los coches del podio de cada carrera, 
 * de mayor a menor, de manera proporcional. 
 * 
 * Estas puntuaciones son acumulativas para cada coche. 
 * El ganador del torneo será el coche que más puntos tenga al finalizar el torneo. 
 * En caso de empate, se divide el premio.
 */

public class Torneo{
	
	private String nombreTorneo;
	private List<Carrera>carreras;
	private int carrerasTorneo = 10;

	public Torneo(String nombreTorneo, List<Carrera>carreras) {

		// Generar lista de carreras por torneo
		this.nombreTorneo = nombreTorneo;
		this.carreras = carreras;
	}
	
	

}
