import java.util.List;
import java.util.ArrayList;

// Lectura de archivos
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EjemploGenerics{
	
	@SuppressWarnings("unchecked")
	public static void main(String... args){
		List lista = new ArrayList();
		FileReader fr = null;
		try{
			fr = new FileReader(new File("nombres.txt"));
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while((linea = br.readLine()) != null){
				lista.add(new Persona(linea.split(" ")));
			}
			
		}catch(IOException ioe){
			System.out.println("Ocurrio un error"); 
		}finally{
			if(fr != null){
				try{
					fr.close();
				}catch(IOException e){
					System.out.println("Archivo no se pudo cerrar");
				}
				
			}			
		}
		
		System.out.println("::::: Objeto Original :::::");
		Object original = lista.get(2);
		System.out.println(original);
		UtilCopyProperties<Persona> ucp = new UtilCopyProperties<Persona>();
		Persona nuevo = ucp.copyFields(new Persona(), (Persona)original);
		System.out.println("::::: Objeto Nuevo :::::");
		System.out.println(nuevo);
	}
}








