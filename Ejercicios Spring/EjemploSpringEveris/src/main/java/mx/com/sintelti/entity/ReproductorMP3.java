package mx.com.sintelti.entity;

public class ReproductorMP3 extends Reproductor implements DispositivoElectronico {

	@Override
	public void turnOn() {
		System.out.println("Encendiendo dispositivo "+this.getClass().getName());
	}
	
	@Override
	public void turnOff() {
		System.out.println("Apagando dispositivo "+this.getClass().getName());
	}
	
	@Override
	public void play() {
		System.out.println("Reproduciendo musica con dispositivo "+this.getClass().getName());
	}
	
	@Override
	public void stop() {
		System.out.println("Deteniendo musica de dispositivo "+this.getClass().getName());
	}

}
