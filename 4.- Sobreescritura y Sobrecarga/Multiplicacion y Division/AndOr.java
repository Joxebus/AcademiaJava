public class AndOr {

    public static void main(String... args) {

        if (evaluar(3, 5) & evaluar(5, 3)) {
            System.out.println("Si entro al if");
        }
    }

    public static boolean evaluar(int valorX, int valorY) {
        System.out.println("Evaluando numeros " + valorX + " y " + valorY);
        return valorX > valorY;
    }
}
