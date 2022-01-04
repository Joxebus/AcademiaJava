package mx.com.everis.runnables;

import java.util.List;

public class Autolavado implements Runnable {

    private List<Auto> autos;


    private void atenderAuto() {
        Auto auto = autos.get(0);
        if (autos.contains(auto)) {
            autos.remove(0);
            System.out.println("Lavando el auto " + auto.getMarca());
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep((long) (Math.random() * 10000));
                atenderAuto();
            }
        } catch (InterruptedException ie) {
            System.out.println("Se interrumpio la ejecución del hilo");
        }


    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public List<Auto> getAutos() {
        return autos;
    }
}
