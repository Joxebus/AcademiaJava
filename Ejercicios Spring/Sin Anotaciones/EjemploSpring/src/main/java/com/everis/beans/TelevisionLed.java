package com.everis.beans;

public class TelevisionLed implements ElectronicDevice {
	
	public void turnOn(){
		System.out.println("Encendiendo Televison");
	}
	
	public void turnOff(){
		System.out.println("Apagando Television");
	}
	
	public void play(){
		System.out.println("Probando señal");
	}
	
	public void stop(){
		System.out.println("Deteniendo deteccion de canales");
	}

}
