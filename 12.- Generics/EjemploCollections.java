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

public class EjemploCollections{
	
	@SuppressWarnings("unchecked")
	public static void main(String... args){
		Lista lista = new Lista();
		lista.add(new Perro());
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
		lista.list();
		System.out.println(lista.find(new Persona("Leonardo Mundo Dominguez".split(" "))));
		System.out.println(lista.find(new Persona("Omar Bautista Valenzuela".split(" "))));
	}

}








