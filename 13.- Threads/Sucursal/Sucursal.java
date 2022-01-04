import java.util.List;
import java.util.Vector;

public class Sucursal {

    public static void main(String... args) {
        // Lista que se utilizara para ambos objetos Ventanilla y Ticket
        List<Persona> clientes = new Vector<Persona>();
        // Objetos Runnable
        Ventanilla ventanilla1 = new Ventanilla();
        Ventanilla ventanilla2 = new Ventanilla();
        Ventanilla ventanilla3 = new Ventanilla();
        Ventanilla ventanilla4 = new Ventanilla();
        Ticket ticket = new Ticket();
        // Haciendo referencia a la misma List
        ventanilla1.setClientes(clientes);
        ventanilla2.setClientes(clientes);
        ventanilla3.setClientes(clientes);
        ventanilla4.setClientes(clientes);
        ticket.setClientes(clientes);
        // Threads para manejar los objetos Runnable
        Thread t1 = new Thread(ventanilla1);
        Thread t2 = new Thread(ventanilla2);
        Thread t3 = new Thread(ventanilla3);
        Thread t4 = new Thread(ventanilla4);
        Thread t5 = new Thread(ticket);

        // Se inician los hilos
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
