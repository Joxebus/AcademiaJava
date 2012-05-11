import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LecturaTeclado {

	public static void main(String... args) throws IOException{
		InputStreamReader isr =	new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Escriba una cadena de entrada: ");		
		String entrada = br.readLine();
		System.out.println(entrada);
	}
}
