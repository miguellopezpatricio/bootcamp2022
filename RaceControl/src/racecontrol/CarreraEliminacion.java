package racecontrol;

import java.util.List;



public class CarreraEliminacion extends Carrera{
	// CARACTERÍSTICAS
	/*
	 * que tienen una serie de minutos
	 *	previos para que los pilotos se hagan a la pista, y al terminar esos
	 * minutos de calentamiento, se irá retirando el coche que va en
	 * la última posición, cada minuto, hasta que sólo quede un coche
	 */
	
	
	public CarreraEliminacion(String nombre, List<Garage> garages) {
		super(nombre, garages);
		// TODO Auto-generated constructor stub
	}

}
