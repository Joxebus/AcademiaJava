import javax.swing.JOptionPane;

public class SobrescrituraMetodosObject {

    public static void main(String... args) {
        Lista lista = new Lista();
        String nombreBuscado;
        for (String nombre : args) {
            lista.add(new Persona(nombre));
        }
        System.out.println(":::::::: Contenido de la lista ::::::::");
        lista.list();
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        do {
            nombreBuscado = JOptionPane.showInputDialog("Ingrese el nombre de la persona buscada");
            System.out.println(":::::::: Comparaciones por equals ::::::::");
            System.out.println(lista.find(new Persona(nombreBuscado)));
        } while (JOptionPane.showInputDialog("¿Buscar otro? S/N").toUpperCase().charAt(0) == 'S');

        nombreBuscado = JOptionPane.showInputDialog("Ingrese el nombre de la persona buscada");
        Persona persona;
        if (lista.find(new Persona(nombreBuscado))) {
            persona = (Persona) lista.get(new Persona(nombreBuscado));
            String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de " + persona.getNombre());
            String edad = JOptionPane.showInputDialog("Ingrese la nueva edad de " + persona.getNombre());
            ;
            int nuevaEdad = Integer.parseInt(edad);
            persona.setNombre(nuevoNombre);
            persona.setEdad(nuevaEdad);
        }

        System.out.println(":::::::: Contenido de la lista ::::::::");
        lista.list();
        System.out.println(":::::::::::::::::::::::::::::::::::::::");

    }
}
