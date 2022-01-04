import utilities.FileUtil;

public class PruebaLeerArchivo {

    public static void main(String... args) {
        FileUtil file1 = new FileUtil("Prueba.txt");
        FileUtil file2 = new FileUtil("Salida.txt");
        for (String linea : file1.readAllLines()) {
            file2.println(linea);
        }
        file1.closeReader();
        file2.closeWriter();
    }
}
