// Collections
import java.util.Map;
import java.util.HashMap;

// Lectura de archivos
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JOptionPane;
public class EjemploMaps{
	
	@SuppressWarnings("unchecked")
	public static void main(String... args){
		Map mapaObjetos = new HashMap();
		FileReader fr = null;
		System.out.println("::::: Personas que se van a añadir :::::");
		try{
			fr = new FileReader(new File("nombres.txt"));
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while((linea = br.readLine()) != null){
				System.out.println(linea);
				Persona duenio = new Persona(linea.split(" "));
				Perro mascota = new Perro();
				mascota.setNombre(linea.split(" ")[3]);				
				mapaObjetos.put(duenio, mascota);
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
		Persona duenio = new Persona(JOptionPane.showInputDialog("Ingrese el nombre del dueño").split(" "));	
		Object objeto = mapaObjetos.get(duenio);
		System.out.println(objeto);

		duenio = new Persona(JOptionPane.showInputDialog("Ingrese el nombre del dueño").split(" "));	
		objeto = mapaObjetos.get(duenio);
		System.out.println(objeto);
		
	
	}

}








