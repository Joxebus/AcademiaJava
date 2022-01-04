package com.everis.beans;

public class ReproductorMp3 implements ElectronicDevice {

    public void turnOn() {
        System.out.println("Encendiendo Reproductor mp3");
    }

    public void turnOff() {
        System.out.println("Apagando Reproductor Mp3");
    }

    public void play() {
        System.out.println("Reproduciendo música");
    }

    public void stop() {
        System.out.println("Deteniendo música");
    }


}
