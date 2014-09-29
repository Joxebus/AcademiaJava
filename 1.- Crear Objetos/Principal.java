public class Principal {
	
	public static void main(String []args){
/*
		Persona persona = new Persona();
		System.out.println("Paso 1 asignar");
		persona.setNombre(args[0]);
		persona.edad = 20;
		System.out.println("Paso 2 recuperar");
		String nombre = persona.getNombre();
		System.out.println(nombre);
		System.out.println(persona.edad); // error

*/


		// Propiedades estaticas
		Perro perro = new Perro();
		//perro.ESPECIE = "mamifero";
		
		Perro perroDos = new Perro();
		System.out.println(perroDos.ESPECIE);
	}
}


