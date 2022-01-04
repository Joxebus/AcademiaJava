package com.everis.beans;

import java.util.Date;
import java.util.List;

public class Supervisor implements Runnable {

    private List<Cliente> clientes;

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void run() {
        System.out.println("::: Clientes dados de alta a las " + new Date() + " :::");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        System.out.println("Total de clientes: " + clientes.size());
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }

}
