import utilities.FileUtil;

public class PruebaLeerArchivo{

	public static void main(String... args){
		FileUtil file = new FileUtil("Prueba.txt");
		for(String linea : file.readAllLines()){
			System.out.println(linea);
		}
	}
}
