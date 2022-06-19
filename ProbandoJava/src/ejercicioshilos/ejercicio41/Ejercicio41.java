package ejercicioshilos.ejercicio41;

import java.util.Timer;
import java.util.TimerTask;


// Crea una tarea futura que muestre algún mensaje por pantalla 

public class Ejercicio41 {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		String queHacer = "Tarea a realizar.";
	

		TimerTask tarea = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(queHacer);
				timer.cancel();
				
			}
			
		};
		
		timer.schedule(tarea, 1000);
		
		
	}
	
}
