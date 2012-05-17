public Class Operaciones{

	public static int multiplicacion(int multiplicando, int multiplicador){
		return multiplicacion(multiplicando, multiplicador, 0);		
	}

	private static int multiplicacion(int multiplicando, int multiplicador, int resultado){
		return (multiplicador <= 0) ? 
			resultado : 
			multiplicacion (multiplicando, --multiplicador, resultado+multiplicando);
		
	}

	public static int division(int dividendo, int divisor){
		return (divisor == 0) ? 0 : division(dividendo, divisor, 0);		
	}

	private static int division(int dividendo, int divisor, int resultado){
		return (dividendo < divisor) ? 
			resultado : 
			division (dividendo-divisor, divisor, ++resultado);
		
	}
/*
	private static int multiplicacion(int multiplicando, int multiplicador, int resultado){
		if(multiplicador <= 0){
			return resultado;
		}else{
			return multiplicacion (multiplicando, --multiplicador, resultado+multiplicando);
		}
	}


	private static int multiplicacion(int multiplicando, int multiplicador, int resultado){
		for(int i=multiplicador; i>0; i--){
			resultado = resultado + multiplicando;
		}
		return resultado;
	}
*/
}
