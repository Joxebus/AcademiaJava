public class PruebaThreads {

    public static void main(String... args) {
        // Creamos las instancias
        Persona persona1 = new Persona("Alberto Chávez Garcia".split(" "));
        persona1.setEdad(22);
        Persona persona2 = new Persona("Anahy Copca Castellano".split(" "));
        persona2.setEdad(21);
        // este metodo es heredado de Thread, en este caso
        // Persona hereda de Thread
        persona1.start();
        persona2.start();

        // La clase perro implementa la interfaz Runnable
        Perro perro = new Perro();
        perro.setNombre("Firulais");
        perro.setEdad(5);
        Thread worker = new Thread(perro);
        worker.start();
    }

}
