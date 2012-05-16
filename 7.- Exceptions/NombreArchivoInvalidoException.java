public class NombreArchivoInvalidoException extends Exception{
	
	public NombreArchivoInvalidoException(String nombreArchivo, int noCaracteresValidos){
		super("El nombre de archivo "+nombreArchivo+" no es válido, debe tener como máximo "+
		noCaracteresValidos+" caracteres"); 
	}
	
}
