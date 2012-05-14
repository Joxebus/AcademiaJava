class BreakContinue {

	public static void main(String... args){
		
		for(String palabra : args){
			if(palabra.length() < 3) continue;
			for (char letra : palabra.toCharArray()){
				int letraEntero = letra+10;
				System.out.println(letra +"="+ (char)letraEntero);
			}
			System.out.println();	
		}
	}
}
