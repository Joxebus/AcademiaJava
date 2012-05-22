// Collections
import java.util.Set;
import java.util.HashSet;

// Lectura de archivos
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EjemploSets{
	
	@SuppressWarnings("unchecked")
	public static void main(String... args){
		Set setObjetos = new HashSet();
		FileReader fr = null;
		System.out.println("::::: Personas que se van a añadir :::::");
		try{
			fr = new FileReader(new File("nombres.txt"));
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while((linea = br.readLine()) != null){
				System.out.println(linea);
				setObjetos.add(new Persona(linea.split(" ")));
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
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::: Objetos sin ordenar contenidos en Set :::::");
		for(Object objeto : setObjetos){
			System.out.println(objeto);
		}		
	
	}

}








