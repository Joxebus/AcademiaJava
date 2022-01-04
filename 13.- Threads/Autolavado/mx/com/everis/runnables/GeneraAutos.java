package mx.com.everis.runnables;

import java.util.List;

public class GeneraAutos implements Runnable {

    private List<Auto> autos;

    private void autosEnEspera() {
        String fila = "";
        for (Auto auto : autos) {
            fila += "[" + auto.getMarca() + "]";
        }
        System.out.println(fila);
    }

    public void generarAuto(String marca) {
        autos.add(new Auto(marca));
    }

    @Override
    public void run() {
        try {
            int i = 1;
            while (true) {
                generarAuto("Auto " + i++);
                autosEnEspera();
                Thread.sleep(3000);
            }
        } catch (InterruptedException ie) {
            System.out.println("Se detuvo el hilo");
        }

    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }
}
