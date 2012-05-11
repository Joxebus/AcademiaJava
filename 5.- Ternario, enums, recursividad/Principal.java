public class Principal {

	public static void main(String... args){
		Persona k = new Persona();
		k.setSexo(args[0]);
		System.out.println(k.getSexo());
		System.out.println(args[1]+" "+k.validarSexo(args[1]));
	}
}
