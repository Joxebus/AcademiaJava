// Collections
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Lectura de archivos
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EjemploListas{
	
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
		System.out.println("::::: Lista sin ordenar :::::");
		for(Object objeto : lista){
			System.out.println(objeto);
		}
		
	
		Collections.sort(lista);
		System.out.println("::::: Lista ordenada naturalmente :::::");
		for(Object objeto : lista){
			System.out.println(objeto);
		}

		Comparator ordenarNombre = new Comparator(){
			public int compare(Object o1, Object o2){
				Persona persona1 = (Persona)o1;
				Persona persona2 = (Persona)o2;
				return  persona1.getNombre().compareTo(persona2.getNombre());				
			}
		};

		Collections.sort(lista, ordenarNombre);
		System.out.println("::::: Lista ordenada por Nombre :::::");
		for(Object objeto : lista){
			System.out.println(objeto);
		}

		Collections.sort(lista, new OrdenaPorApellidoMaterno());
		System.out.println("::::: Lista ordenada por Apellido Materno :::::");
		for(Object objeto : lista){
			System.out.println(objeto);
		}
	}

}








