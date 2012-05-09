public class Zoologico{

	public static void main(String []args){
		// Creación de instancia
		Canario canario = new Canario();
		Aguila aguila = new Aguila();
		Persona persona = new Persona();
		
		// Asignación de valores a la instancia
		canario.setNombre(args[0]);
		aguila.setNombre(args[1]);
		persona.setNombre(args[2]);
		

		Animales animal = canario;

		animal.comer();
		animal.dormir();

		animal = aguila;
		animal.desplazarse();
		animal.emitirSonido();
		
		animal = persona;

		animal.comer();
		animal.dormir();
		animal.desplazarse();
		animal.emitirSonido();
	}
}
