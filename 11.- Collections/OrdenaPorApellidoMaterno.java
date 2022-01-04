import java.util.Comparator;

public class OrdenaPorApellidoMaterno implements Comparator {

    public int compare(Object o1, Object o2) {
        Persona persona1 = (Persona) o1;
        Persona persona2 = (Persona) o2;
        return persona1.getApellidoMaterno().compareTo(persona2.getApellidoMaterno());
    }
}
