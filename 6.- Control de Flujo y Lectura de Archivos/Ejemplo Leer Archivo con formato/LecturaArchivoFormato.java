import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class LecturaArchivoFormato {

    public static void main(String... args) {
        try {
            File archivo = new File("Articulo1.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            int noLinea = 0, noParrafos = 0, noPalabras = 0, noPalabrasResumen = 0;
            String linea = "", titulo = "", especialidad = "", resumen = "", fuente = "", dia = "", fecha = "";

            while ((linea = br.readLine()) != null) {
                if (noLinea < 3) {
                    switch (noLinea) {
                        case 0:
                            dia = linea.split(", ")[0];
                            fecha = linea.split(", ")[1];
                            noPalabras += linea.split(" ").length;
                            break;
                        case 1:
                            especialidad = linea;
                            noPalabras += linea.split(" ").length;
                            break;
                        case 2:
                            titulo = linea;
                            noPalabras += linea.split(" ").length;
                            break;
                    }
                } else if (linea.length() == 0) {
                    noParrafos++;
                } else {
                    noPalabras += linea.split(" ").length;
                    if (linea.contains("Fuente:")) {
                        fuente = linea.substring(linea.indexOf("Fuente:") + 7, linea.indexOf(")"));
                    } else {
                        for (String palabra : linea.split(" ")) {
                            if (noPalabrasResumen < 100) {
                                resumen += palabra + " ";
                                noPalabrasResumen++;
                            } else {
                                break;
                            }
                        }
                    }
                }

                noLinea++;
            }
            fr.close();

            System.out.println("Titulo: " + titulo);
            System.out.println("Especialidad: " + especialidad);
            System.out.println("Resumen: " + resumen);
            System.out.println("Consultado en: " + fuente);
            System.out.println("El día " + dia + " con fecha " + fecha);
            System.out.println("No. de lineas: " + noLinea + "  No. parrafos: " + noParrafos + "  No. palabras: " + noPalabras);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

}
