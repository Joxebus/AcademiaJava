public class Encriptador{

	public String cifrar(String cadenaOriginal){
		char cadenaCifrada[]= new char[cadenaOriginal.length()];
		for(int posicion=cadenaOriginal.length()-1, i=0; posicion >= 0; posicion--){
			//System.out.print(cadenaOriginal.charAt(posicion));
			char letra = (char)(cadenaOriginal.charAt(posicion)+5);
			cadenaCifrada[i] = letra;
			i++;
		}
		return new String(cadenaCifrada);
	}

	public String descifrar(String cadenaCifrada){
		String cadenaOriginal="";
		for(int posicion=cadenaCifrada.length()-1; posicion >= 0; posicion--){
			//System.out.print(cadenaCifrada.charAt(posicion));
			char letra = (char)(cadenaCifrada.charAt(posicion)-5);
			cadenaOriginal += letra;
		}
		return cadenaOriginal;
	}

}
