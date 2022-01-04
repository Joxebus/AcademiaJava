class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
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
        for (char letra : nombre.toCharArray()) {
            hash += letra * 11;
        }
        return hash;
    }

    public String toString() {
        return (edad == 0) ? "Hola mi nombre es " + this.nombre : "Hola mi nombre es " + this.nombre + " y tengo " + this.edad + " años.";
    }

    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        } else if (objeto instanceof Persona) {
            Persona personaComparen = (Persona) objeto;
            return this.nombre.equals(personaComparen.getNombre());
        } else {
            return false;
        }


    }
}
