public class Perro extends Terrestres implements Comparable {
    private int edad;
    private String raza;

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
