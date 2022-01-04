public class PruebaDeExcepciones {

    public static void main(String... args) {
        for (String nombre : args) {
            try {
                PruebaDeExcepciones prueba = new PruebaDeExcepciones();
                prueba.validarEntrada(args);
                prueba.leerArgumentos(nombre);

            } catch (ArrayIndexOutOfBoundsException aio) {
                System.out.println("Debe de ingresar al menos un nombre de archivo");

            } catch (FormatoLineaException fle) {
                System.out.println(fle.getMessage());
                fle.printStackTrace();
            } catch (NombreArchivoInvalidoException naie) {
                System.out.println(naie.getMessage());
                naie.printStackTrace();
            }
        }
    }

    public void validarEntrada(String... cadenas) {
        if (cadenas.length < 3 || cadenas.length > 3) {
            throw new FormatoLineaException(3, cadenas.length);
        }
    }

    public void leerArgumentos(String nombre) throws NombreArchivoInvalidoException {

        if (nombre.length() > 5) {
            throw new NombreArchivoInvalidoException(nombre, 5);
        }
        System.out.println(nombre);


    }
}
