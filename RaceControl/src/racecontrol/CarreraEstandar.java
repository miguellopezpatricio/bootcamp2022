package racecontrol;

import java.util.List;

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
	

	
	// MÉTODO PARA REALIZAR CARRERA ESTANDAR ENTRE COCHES GANADORES DE LAS CARRERAS ELIMINATORIAS
	// Y SELECCIONAR AL GANADOR
	// método para lanzar una carrera
	@Override
	public void startCarrera(List<Coche>participantes) {
		
	}
	


}
