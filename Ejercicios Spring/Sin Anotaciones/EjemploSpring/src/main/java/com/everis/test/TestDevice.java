package com.everis.test;

import com.everis.beans.ElectronicDevice;

public class TestDevice {
	
	public static void testDevice(ElectronicDevice device){
		System.out.println("Inicia la prueba de funcionamiento de "+device.getClass().getName());
		device.turnOn();
		device.play();
		device.stop();
		device.turnOff();
		System.out.println("Termina la prueba de funcionamiento de "+device.getClass().getName());
	}

}
