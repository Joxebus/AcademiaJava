import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class LeerArchivo {

    public static void main(String... args) {
        try {
            File archivo = new File("BreakContinue.java");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            int noLinea = 0;
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains("continue")) {
                    System.out.println(noLinea + ": " + linea);
                    System.out.println("La linea " + noLinea + " tiene " + linea.split(" ").length + " palabras.");
                }
                noLinea++;
            }
            fr.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

}
