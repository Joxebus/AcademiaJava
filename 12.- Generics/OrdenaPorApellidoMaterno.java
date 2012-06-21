import java.util.Comparator;

// Con generics definimos que tipo de argumentos recibira la interfaz Comparator
public class OrdenaPorApellidoMaterno implements Comparator<Persona> {
	
	// De esta manera en vez de comparar Objects se comparan por el tipo de Generic
	public int compare(Persona persona1, Persona persona2){
				return  persona1.getApellidoMaterno().compareTo(persona2.getApellidoMaterno());				
	}
}
