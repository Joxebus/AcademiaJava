package mx.com.everis.main;

import java.util.ArrayList;
import java.util.List;

import mx.com.everis.runnables.Auto;
import mx.com.everis.util.ConsoleReader;

public class PruebasHilos {

    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        String marca = "", placas = "", modelo = "";
        List<Thread> hilos = new ArrayList<Thread>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Modelo: ");
            modelo = reader.readLine();
            System.out.println();
            System.out.print("Placas: ");
            placas = reader.readLine();
            System.out.println();
            System.out.print("Marca: ");
            marca = reader.readLine();
            hilos.add(new Thread(new Auto(placas, modelo, marca), placas));
        }
        System.out.println("::::::: Comienza la ejecución de los hilos :::::::");
        for (Thread hilo : hilos) {
            hilo.start();
            System.out.println("Se inicio el hilo " + hilo.getName());
        }
    }
}
