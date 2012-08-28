package com.everis.util;

/**
*
*	@author: Jorge Omar Bautista Valenzuela
*	e-mail: joxebus@gmail.com
*	Date: 24/05/2012	
*
*/


//Lectura
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
//Escritura
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
//Collections
import java.util.List;
import java.util.ArrayList;

public final class FileUtil{
	
	private File file;
	private String path;	
	private FileReader fr;
	private BufferedReader br;
	
	private FileWriter fw;
	private PrintWriter pw;

	/**
	*
	*	Este Constructor genera un objeto recibiendo
	*	un String que es el nombre del archivo o directorio
	*	que se desea leer o escribir.
	*
	*/
	public FileUtil(String path){
		this.path = path;		
		this.file = new File(path);
	}

	/**
	*
	*	Es método cierra el archivo de escritura
	*	siempre y cuando ya haya sido asignado
	*/
	public void closeWriter(){
		try{
			if(fr != null){
				fr.close();
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			clear();
		}

	}

	/**
	*
	*	Es método cierra el archivo de lectura
	*	siempre y cuando ya haya sido asignado
	*/
	public void closeReader(){
		try{
			if(fr != null){
				fr.close();
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			clear();
		}
	}
	
	/**
	*
	*	Es método lee una linea del archivo de lectura
	*	a la vez y la regresa
	*/
	public String readLine(){
		String line = null;
		try{
			if(file!=null && (br == null || fr == null)){
				fr = new FileReader(file);
				br = new BufferedReader(fr);
			}
			if( br != null && !file.isDirectory() ){
				return br.readLine();
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		return line;
	}

	/**
	*
	*	El método regresa una lista de todas las lineas
	*	que contiene un archivo
	*/
	public List<String> readAllLines(){
		List<String> allLines = new ArrayList<String>();
		String line = null;
		try{
			if( file!= null && (fr == null || br == null) ){
				fr = new FileReader(file);
				br = new BufferedReader(fr);
			}
			if( br != null && !file.isDirectory() ){				
				while(( line = br.readLine()) != null){
					allLines.add(line);
				}
				return allLines;
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		return allLines;
	}

	/**
	*
	*	Es método escribe una linea en el archivo
	*	con el nombre que se le indicó en el path
	*/

	public void println(String line){
		try{
			if( path!= null && (fw == null || pw == null) ){
				fw = new FileWriter(path.trim());
				pw = new PrintWriter(fw);
			}
			if( pw != null ){	
				System.out.println(line);			
				pw.write(line);
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}		
	}

	public void clear(){
		this.file = null;
		this.fr = null;
		this.br = null;
		this.fw = null;
		this.pw = null;
	}
}
