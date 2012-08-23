package mx.com.everis.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import mx.com.everis.runnables.Auto;
import mx.com.everis.runnables.Autolavado;
import mx.com.everis.runnables.GeneraAutos;

public class MainAutolavado {

	public static void main(String[] args) {
		Autolavado autolavado1 = new Autolavado();
		Autolavado autolavado2 = new Autolavado();
		Autolavado autolavado3 = new Autolavado();
		GeneraAutos generaAutos = new GeneraAutos();
		
		List<Auto> autos = new Vector<Auto>();
		autolavado1.setAutos(autos);
		autolavado2.setAutos(autos);
		autolavado3.setAutos(autos);
		generaAutos.setAutos(autos);
		
		new Thread(autolavado1).start();
		new Thread(autolavado2).start();
		new Thread(autolavado3).start();
		new Thread(generaAutos).start();
	}
}
