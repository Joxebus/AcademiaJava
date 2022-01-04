package utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleReader {

    private BufferedReader br;

    public ConsoleReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * Este método regresa una cadena leida desde la consola, cada vez que es invocada
     * si se genera una excepción regresa una cadena vacía.
     */
    public String readLine() {
        try {
            return br.readLine();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return "";
        }
    }
}
