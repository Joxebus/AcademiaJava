package com.everis.config;

import java.util.List;

import com.everis.util.FileUtil;


public class CargarDatos {
	
	private FileUtil leerArchivo;
	private List<String> nombreClientes;
	
	public void setLeerArchivo(FileUtil leerArchivo) {
		this.leerArchivo = leerArchivo;
	}
	
	public void setNombreClientes(List<String> nombreClientes) {
		this.nombreClientes = nombreClientes;
	}
	
	public void cargarDatos(){
		System.out.println("::: Cargando nombres de clientes :::");
		for(String nombre :leerArchivo.readAllLines()){			
			nombreClientes.add(nombre.toUpperCase());
		}
		
	}
}
