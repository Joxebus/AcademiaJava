public class Zoologico {

    public static void main(String... args) {
        Lista lista = new Lista();
        lista.add(new Persona("Juanito Escarcha"));
        Canario canario = new Canario();
        canario.setNombre("Tweety");
        lista.add(canario);
        Aguila aguila = new Aguila();
        aguila.setNombre("Calva");
        lista.add(aguila);
        Perro perro = new Perro();
        perro.setNombre("Snoppy");
        lista.add(perro);

        lista.list();
    }
}
