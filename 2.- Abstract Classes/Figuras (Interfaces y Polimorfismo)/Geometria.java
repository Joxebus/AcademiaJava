public class Geometria{

	public void evaluarFigura(Figura figura){
		System.out.println("Evaluando figura "+figura.getClass().getName());
		System.out.println("Área = "+figura.area());
		System.out.println("Perimetro = "+figura.perimetro());
	}
/*
	public evaluarTriangulo(Triangulo triangulo){
		System.out.println("Área = "+triangulo.area());
		System.out.println("Perimetro = "+triangulo.perimetro());
	}

	public evaluarCirculo(Circulo circulo){
		System.out.println("Área = "+circulo.area());
		System.out.println("Perimetro = "+circulo.perimetro());
	}

	public evaluarCuadrado(Cuadrado cuadrado){
		System.out.println("Área = "+cuadrado.area());
		System.out.println("Perimetro = "+cuadrado.perimetro());
	}
*/
}
