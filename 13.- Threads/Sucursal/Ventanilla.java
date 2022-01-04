import java.util.List;

public class Ventanilla implements Runnable {

    private List<Persona> clientes;

    public void atender() {
        synchronized (clientes) {
            if (!clientes.isEmpty()) {
                System.out.println("Atendiendo al cliente " + clientes.get(0));
                clientes.remove(0);
            } else {
                System.out.println("No hay clientes en la fila");
            }
        }
    }

    public void run() {
        try {
            for (; ; ) {
                this.atender();
                Thread.sleep(5000);
            }
        } catch (InterruptedException ioe) {
            ioe.printStackTrace();
        }
    }


    public void setClientes(List<Persona> clientes) {
        this.clientes = clientes;
    }

    public List<Persona> getClientes() {
        return clientes;
    }
}
