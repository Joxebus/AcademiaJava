package com.everis.beans;

public class ReproductorDVD implements ElectronicDevice {
	
	public void init(){
		System.out.println("Se ha creado el reproductor DVD");
	}
	
	public void turnOn(){
		System.out.println("Encendiendo dvd");
	}	
	
	public void turnOff(){
		System.out.println("Apagando dvd");
	}	
	
	public void play(){
		System.out.println("Reproduciendo pelicula");
	}	
	
	public void stop(){
		System.out.println("Deteniendo pelicula");
	}

}
