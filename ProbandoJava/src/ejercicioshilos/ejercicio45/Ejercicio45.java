package ejercicioshilos.ejercicio45;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * Haz lo mismo que en el ejercicio anterior, 
 * pero añade las tareas a un FixedThreadPool. 
 * Observa las diferencias si las hay. 
 */
public class Ejercicio45 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {


        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del Thread: " + Thread.currentThread().getName());// hilos en paralelo
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea");

            return "Algún resultado importante de la tarea";
        };

        Callable<Integer> tarea2 = ()->{
            System.out.println("Iniciando tarea 2...");

            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String> resultado = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuando con la ejecución del main");
        // System.out.println(resultado.isDone());
        while(!(resultado.isDone() && resultado2.isDone())){
            System.out.println(String.format("resultado1: %s- resultado2: %s",
                    resultado.isDone() ? "finalizó":"en proceso",
                    resultado2.isDone() ? "finalizó":"en proceso"
                    ));
            TimeUnit.MILLISECONDS.sleep(1000);
        }

        System.out.println("Obtenemos resultado1 de la tarea1: " + resultado.get());
        System.out.println("Finaliza la tarea1: " + resultado.isDone());

        System.out.println("Obtenemos resultado2 de la tarea2: " + resultado2.get());
        System.out.println("Finaliza la tarea2: " + resultado.isDone());

	}
}
