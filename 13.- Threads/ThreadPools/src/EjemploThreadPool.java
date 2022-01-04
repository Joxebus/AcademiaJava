import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class EjemploThreadPool {

    public static void main(String[] args) {

        List<Persona> personas = new Vector<Persona>();
        personas.add(new Persona("Jorge"));
        personas.add(new Persona("Carlos"));
        personas.add(new Persona("Sergio"));
        personas.add(new Persona("Leonardo"));
        personas.add(new Persona("Mauricio"));
        personas.add(new Persona("Saul"));
        personas.add(new Persona("Anel"));
        personas.add(new Persona("Andres";

        int corePoolSize = 2;
        ScheduledThreadPoolExecutor stpe = new ScheduledThreadPoolExecutor(corePoolSize);

        //stpe.schedule(personas.get(0), 10, TimeUnit.SECONDS);
        stpe.scheduleAtFixedRate(personas.get(5), 10, 5, TimeUnit.SECONDS);
        //ExecutorService exec = Executors.newSingleThreadExecutor();
        //ExecutorService exec = Executors.newFixedThreadPool(3);
        //ExecutorService exec = Executors.newCachedThreadPool();
		/*
		for(Persona persona : personas){						
			System.out.println("Enviando a "+persona.getNombre()+" al executor service");
			exec.execute(persona);
		} */


        System.out.println("Se han enfilado los runnables");

    }

}
