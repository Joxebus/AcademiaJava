import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class EjercicioLecturaDirectorio {

    public static void main(String... args) { //throws FormatoDeArticuloException
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String fecha = "", titulo = "", area = "", resumen = "", fuente = "", linea = "";
        int noPalabras = 0, noLineas = 0, noParrafos = 0, noPalabrasResumen = 0;
        File directorio = new File(args[0]);
        if (directorio.exists() && directorio.isDirectory()) {
            for (String direccionArchivo : directorio.list()) {
                if (direccionArchivo.endsWith(".txt")) {
                    try {
                        archivo = new File(direccionArchivo);
                        fr = new FileReader(archivo);
                        br = new BufferedReader(fr);
                        fecha = br.readLine();
                        area = br.readLine();
                        titulo = br.readLine();
                        noLineas = 3;
                        while ((linea = br.readLine()) != null) {
                            noLineas++;
                            if (linea.length() != 0) {
                                noPalabras += linea.split(" ").length;
                                if (!linea.contains("(Fuente:") && (noPalabrasResumen <= 100)) {
                                    for (String palabra : linea.split(" ")) {
                                        if (noPalabrasResumen <= 100) {
                                            resumen += palabra + " ";
                                            noPalabrasResumen++;
                                        }
                                    }
                                } else {
                                    fuente = linea.replace("(Fuente: ", "").replace(")", "");
                                }
                            } else {
                                noParrafos++;
                            }

                        }
                        System.out.println("Título: " + titulo + "\n");
                        System.out.println("Área ó Especialidad: " + area + "\n");
                        System.out.println("Resumen: " + resumen + "\n");
                        System.out.println("Consultado en: " + fuente + "\n");
                        System.out.println("El día " + fecha.split(",")[0] + " con fecha " + fecha.split(",")[1] + "\n");
                        System.out.println("No. de líneas: " + noLineas + "\nNo. de párrafos: " + noParrafos + "\nNo. de palabras: " + noPalabras);

                        fecha = "";
                        titulo = "";
                        area = "";
                        resumen = "";
                        fuente = "";
                        linea = "";
                        noPalabras = 0;
                        noLineas = 0;
                        noParrafos = 0;
                        noPalabrasResumen = 0;
                        System.out.println("***************************************");
                    } catch (ArrayIndexOutOfBoundsException aio) {
                        //throw new FormatoDeArticuloException(archivo.getPath());
                    } catch (FileNotFoundException ex) {
                        System.out.println("Se ha concluido con la lectura de archivos");
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    } finally {
                        try {
                            fr.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    }

                }
            }

        }
    }

}
        
    


