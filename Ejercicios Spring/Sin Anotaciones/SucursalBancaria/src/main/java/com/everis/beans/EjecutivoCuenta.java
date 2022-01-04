package com.everis.beans;

import java.util.List;

import org.springframework.context.ApplicationContext;

import com.everis.util.SpringUtil;

public class EjecutivoCuenta implements Runnable {

    private List<String> nombreClientes;
    private List<Cliente> clientesDadosDeAlta;
    private ApplicationContext context = SpringUtil.getContext();

    public void setClientesDadosDeAlta(List<Cliente> clientesDadosDeAlta) {
        this.clientesDadosDeAlta = clientesDadosDeAlta;
    }

    public void setNombreClientes(List<String> nombreClientes) {
        this.nombreClientes = nombreClientes;
    }

    public List<String> getNombreClientes() {
        return nombreClientes;
    }

    public void run() {
        // Se pide a Spring una instancia de tipo Cliente
        Cliente nuevoCliente = context.getBean("nuevoCliente", Cliente.class);
        // Se toma el primer nombre de la lista
        String nombreCliente = nombreClientes.get(0);
        System.out.println("Atendiendo a nuevo cliente: " + nombreCliente);
        // Removemos el primero nombre
        nombreClientes.remove(0);

        // Se agregan valores a las propiedades del nuevo cliente

        do {
            nuevoCliente.setNoCliente((int) (Math.random() * 999999));
        } while (clientesDadosDeAlta.contains(nuevoCliente));

        nuevoCliente.setNombre(nombreCliente);
        // Se añade el nuevo cliente a la lista de Clientes
        clientesDadosDeAlta.add(nuevoCliente);
    }


}
