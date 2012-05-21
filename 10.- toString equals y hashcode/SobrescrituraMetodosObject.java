public class SobrescrituraMetodosObject{

	public static void main(String... args){
		Persona persona1 = new Persona(args[0]);
		Persona persona2 = new Persona(args[1]);
		Persona persona3 = persona1;
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(":::::::: Comparaciones por equals ::::::::");
		System.out.println(persona1.equals(persona2));
		
		System.out.println(":::::::: Comparaciones por hashCode ::::::::");
		System.out.println(persona1.hashCode() == persona2.hashCode());
		
	}
}
