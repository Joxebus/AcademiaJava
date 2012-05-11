import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LecturaTeclado {

	int numero;

	public static void main(String... args) throws IOException{
		InputStreamReader isr =	new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Escriba una cadena de entrada: ");		
		String entrada = br.readLine();
		System.out.println(entrada);
		LecturaTeclado lt = new LecturaTeclado();
		lt.numero = 15;
		System.out.println(lt.numero);
	}
}
