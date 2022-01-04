public class Persona implements Runnable {

    public Persona() {
        this("Noname");
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        System.out.println("Mi nombre es " + nombre);
        try {
            System.out.println(nombre + " está corriendo");
            Thread.sleep(3000);
            System.out.println(nombre + " se detuvo");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    private String nombre;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return nombre;
    }
}
