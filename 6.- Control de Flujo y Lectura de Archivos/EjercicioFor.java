class EjercicioFor{
	
	public static void main(String... args){
		calcular();	
	}

	public strictfp static void calcular(){
		double valor = 0.001;
		for(int i=0; i <20; System.out.println("Voy en la iteracion "+i++)){
			valor += 0.001;
			System.out.println(valor);
		}
	}

}
