package mx.com.everis.runnables;

public class Auto implements Runnable {

    private String placas;
    private String modelo;
    private String marca;

    @Override
    public void run() {
        try {
            System.out.println("El auto " + toString() + " está en movimiento");
            Thread.sleep(3000);
            System.out.println("El auto " + toString() + " está en espera");
            Thread.sleep((long) Math.random() * 10000);
            System.out.println("El auto " + toString() + " terminó su ejecución");
        } catch (InterruptedException ie) {
            System.out.println("Se interrumpio la ejecución del hilo");
        }

    }

    public Auto(String placas, String modelo, String marca) {
        super();
        this.placas = placas;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return marca + " " + placas + " " + modelo;
    }


}
