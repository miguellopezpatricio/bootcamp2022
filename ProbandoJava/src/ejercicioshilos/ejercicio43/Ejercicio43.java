package ejercicioshilos.ejercicio43;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * Crea una tarea que muestre el inicio y fin de la misma (con una diferencia de X
segundos/milisegundos) y lánzala dentro de un SingleThreadExecutor
 */


public class Ejercicio43 {

	public static void main(String[] args) {

		
	    ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea 1...");
            try {
                System.out.println("Nombre del Thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea 1");

        };
        
        Runnable tarea2 = () -> {
            System.out.println("Inicio de la tarea 2...");
            try {
                System.out.println("Nombre del Thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea 2");

        };

        

        executor.submit(tarea);
        executor.submit(tarea2);
        executor.shutdown();
        System.out.println("Continuando con la ejecución del main 1");
        try {
            executor.awaitTermination(2,TimeUnit.SECONDS);
            System.out.println("Continuando con la ejecución del main 2");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

	}

}
