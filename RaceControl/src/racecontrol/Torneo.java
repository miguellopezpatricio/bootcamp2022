package racecontrol;

import java.util.List;

public class Torneo{
	
	private String nombreTorneo;
	private List<Carrera>carreras;

	public Torneo(String nombreTorneo, List<Carrera>carreras) {

		// Generar lista de carreras por torneo
		this.nombreTorneo = nombreTorneo;
		this.carreras = carreras;
	}
	
	

}
