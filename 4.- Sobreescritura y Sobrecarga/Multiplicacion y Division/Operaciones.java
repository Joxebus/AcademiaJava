public Class Operaciones{

	public static int multiplicacion(int multiplicando, int multiplicador){
		int resultado = multiplicacion(multiplicando, multiplicador, 0);
		return resultado;
	}

	private static int multiplicacion(int multiplicando, int multiplicador, int resultado){
		for(int i=multiplicador; i>0; i--){
			resultado = resultado + multiplicando;
		}
		return resultado;
	}

}
