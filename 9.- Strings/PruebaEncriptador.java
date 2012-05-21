public class PruebaEncriptador{

	public static void main(String... args){
		Encriptador encriptador = new Encriptador();
		String cadena = "Texto para encriptar";
		System.out.println(encriptador.cifrar(cadena));
		System.out.println(encriptador.descifrar(encriptador.cifrar(cadena)));
	}
} 
