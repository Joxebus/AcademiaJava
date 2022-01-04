public class Perro extends Terrestres implements Comparable, Runnable {
    private int edad;
    private String raza;

    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println("Me llamo " + this.getNombre());
            Thread.sleep((long) (Math.random() * 5000));
            System.out.println("Y tengo " + edad + " años");
            System.out.println("Soy de tipo " + this.getClass().getName());
        } catch (InterruptedException ie) {
            System.out.println("Se detuvo la ejecución del Hilo");
        }
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void desplazarse() {
        System.out.println("Estoy comiendo y me llamo " + getNombre());
    }

    public void emitirSonido() {
        System.out.println("Estoy durmiendo y me llamo " + getNombre());
    }

    public int compareTo(Object objeto) {
        if (objeto instanceof Perro) {
            Perro perro = (Perro) objeto;
            return this.raza.compareTo(perro.getRaza());
        } else {
            return -1;
        }
    }
}
