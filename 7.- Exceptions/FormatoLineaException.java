public class FormatoLineaException extends RuntimeException {

    public FormatoLineaException(int noElementos, int noElementosRecibidos) {
        super("El formato de la linea esperaba " + noElementos + " y recibió " + noElementosRecibidos);
    }
}
