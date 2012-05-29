package mx.com.sintelti.testing;

import mx.com.sintelti.entity.DispositivoElectronico;

public class TestDevice {
	
	public static void testDevice(DispositivoElectronico device){
		device.turnOn();
		device.play();
		device.stop();
		device.turnOff();
	}

}
