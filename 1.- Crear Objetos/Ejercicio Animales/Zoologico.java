public class Zoologico {

    public static void main(String[] args) {
        // Creación de instancia
        Perro perro = new Perro();

        // Asignación de valores a la instancia
        perro.setNombre("Fido");

        // Obtención de valores de la instancia
        System.out.println("El nombre de mi " + perro.getClass().getName() + " es " + perro.getNombre());
        perro.correr();

    }
}
