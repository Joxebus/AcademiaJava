enum Color {rojo, verde, azul}

class ControlDeFlujo {

    public static void main(String... args) {
        Color color = Color.verde;
        switch (color) {
            case rojo:
                System.out.println("Es rojo");
                break;
            case verde:
                System.out.println("Es verde");


            case azul:
                System.out.println("Es azul");
                break;

            default:
                System.out.println("No se sabe el color...");
                break;
        }
    }
}
