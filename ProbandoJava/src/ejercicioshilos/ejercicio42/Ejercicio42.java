package ejercicioshilos.ejercicio42;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Crea una tarea futura recurrente 5 veces por ejemplo
 *	(usa el AtomicInteger) 
 */

public class Ejercicio42 {

	public static void main(String[] args) {
	
		  Toolkit toolkit = Toolkit.getDefaultToolkit();

	        AtomicInteger contador = new AtomicInteger(5);

	        Timer timer = new Timer();
	        timer.schedule(new TimerTask() {
	          // private int contador = 3;
	            @Override
	            public void run() {
	                int i = contador.getAndDecrement();
	                if(i > 0) {
	                    toolkit.beep();
	                    System.out.println("Tarea "+ i +" periódica en: " + new Date() +
	                            " nombre del Thread: " + Thread.currentThread().getName());
	                //    i--;
	                }else {
	                    System.out.println("Finaliza el tiempo");
	                    timer.cancel();
	                }
	            }
	        },5000, 5000);

	        System.out.println("Agendamos una tarea para 5 segundos más...");
	}

}
