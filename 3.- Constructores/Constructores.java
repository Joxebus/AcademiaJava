public class Constructores{

	public static void main(String... args){
		Persona persona = new Persona();
		Persona becario = new Persona("Yunuem");
		Trabajador trabajador = new Trabajador();
		Trabajador contratado = new Trabajador(1345, "Carlos");
		
		System.out.println(persona.getNombre());
		System.out.println(becario.getNombre());
		System.out.println("Trabajadores");
		System.out.println("nombre: "+trabajador.getNombre());
		System.out.println("no empleado: "+trabajador.getNoEmpleado());
		System.out.println("nombre: "+trabajador.getNombre());
		System.out.println();
		System.out.println("nombre: "+contratado.getNombre());
		System.out.println("no empleado: "+contratado.getNoEmpleado());
	}

}