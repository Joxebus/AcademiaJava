package mx.com.sintelti.main;

import mx.com.sintelti.entity.DispositivoElectronico;
import mx.com.sintelti.entity.ReproductorBlueRay;
import mx.com.sintelti.entity.ReproductorDVD;
import mx.com.sintelti.entity.ReproductorMP3;
import mx.com.sintelti.testing.TestDevice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
		DispositivoElectronico dvd = context.getBean("dvdPrototype",ReproductorDVD.class);
		DispositivoElectronico mp3 = context.getBean("mp3Prototype",ReproductorMP3.class);
		DispositivoElectronico blueRay = context.getBean("blueRayPrototype",ReproductorBlueRay.class);
		TestDevice tester = context.getBean("tester",TestDevice.class);
		tester.addDevice(dvd);
		tester.addDevice(mp3);
		tester.addDevice(blueRay);
		tester.testDevices();	
		
		System.out.println(tester.getDevices().getClass().getName());
	}
}
