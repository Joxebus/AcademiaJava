public class Persona implements Comparable<Persona> {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int compareTo(Persona persona) {
        return this.toString().compareTo(persona.toString());
    }


    public Persona() {
    }

    public Persona(String datos[]) {
        this.nombre = datos[0];
        this.apellidoPaterno = datos[1];
        this.apellidoMaterno = datos[2];
    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int hashCode() {
        int hash = 0;
        for (char letra : this.toString().toCharArray()) {
            hash += letra * 11;
        }
        return hash;
    }

    public String toString() {
        return apellidoPaterno + " " + apellidoMaterno + " " + nombre;
    }

    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        } else if (objeto instanceof Persona) {
            Persona personaComparen = (Persona) objeto;
            return this.toString().equals(personaComparen.toString());
        } else {
            return false;
        }


    }
}
