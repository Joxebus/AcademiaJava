import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
		personas.add(new Persona("Andres"));	
		
		
		//ExecutorService exec = Executors.newSingleThreadExecutor();
		//ExecutorService exec = Executors.newFixedThreadPool(3);
		ExecutorService exec = Executors.newCachedThreadPool();
		
		for(Persona persona : personas){						
			System.out.println("Enviando a "+persona.getNombre()+" al executor service");
			exec.execute(persona);
		}
		
	}

}
