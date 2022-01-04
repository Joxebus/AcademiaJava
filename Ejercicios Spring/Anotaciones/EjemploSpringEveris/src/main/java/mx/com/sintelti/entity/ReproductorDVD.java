package mx.com.sintelti.entity;

public class ReproductorDVD extends Reproductor implements DispositivoElectronico {

    public ReproductorDVD() {
        System.out.println("Construyendo reproductor DVD");
    }


    @Override
    public void turnOn() {
        System.out.println("Encendiendo dispositivo " + this.getClass().getName());
    }

    @Override
    public void turnOff() {
        System.out.println("Apagando dispositivo " + this.getClass().getName());
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo Pelicula con dispositivo " + this.getClass().getName());
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo Pelicula de dispositivo " + this.getClass().getName());
    }


}
