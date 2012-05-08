public class Zoologico{

	public static void main(String []args){
		// Creación de instancia
		Acuaticos ave = new Acuaticos();
		
		// Asignación de valores a la instancia
		ave.setColor(args[0]);
		ave.nombre = args[1];
		
		// Obtención de valores de la instancia
		System.out.println(ave.nombre);
		System.out.println(ave.getColor());
		
	}
}
