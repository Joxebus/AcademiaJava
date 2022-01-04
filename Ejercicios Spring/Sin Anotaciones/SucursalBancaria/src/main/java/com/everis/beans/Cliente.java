package com.everis.beans;

public class Cliente {

    private int noCliente;
    private String nombre;

    @Override
    public String toString() {
        return "No Cliente: " + noCliente + "\tNombre: " + nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + noCliente;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (noCliente != other.noCliente)
            return false;
        return true;
    }

    public Cliente() {

    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }


    public int getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(int noCliente) {
        this.noCliente = noCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
