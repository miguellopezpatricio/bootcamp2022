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
	
	private String nombreCarreraElim;
	private List<Garage>garagesCarreraElimina;
	
	
	
	public CarreraEliminacion(String nombreCarreraElim) {
		super(nombreCarreraElim);
		this.nombreCarreraElim = nombreCarreraElim;
		
		
	}


	
	// MÉTODO PARA REALIZAR CARRERA ELIMINATORIA ENTRE COCHES Y SELECCIONAR AL GANADOR
	@Override
	public void startCarrera(List<Coche>participantes) {
		
	}
}
