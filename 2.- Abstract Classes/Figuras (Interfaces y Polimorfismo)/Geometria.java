public class Geometria {

    public void evaluarFigura(Figura figura) {
        System.out.println("Evaluando figura " + figura.getClass().getName());
        System.out.println("Area = " + figura.area());
        System.out.println("Perimetro = " + figura.perimetro());

        if (figura instanceof Cilindro) {
            Cilindro cilindro = (Cilindro) figura;
            System.out.println("Volumen =" + cilindro.volumen());
        }
    }
}





/*
	public evaluarTriangulo(Triangulo triangulo){
		System.out.println("Area = "+triangulo.area());
		System.out.println("Perimetro = "+triangulo.perimetro());
	}

	public evaluarCirculo(Circulo circulo){
		System.out.println("Area = "+circulo.area());
		System.out.println("Perimetro = "+circulo.perimetro());
	}

	public evaluarCuadrado(Cuadrado cuadrado){
		System.out.println("Area = "+cuadrado.area());
		System.out.println("Perimetro = "+cuadrado.perimetro());
	}
*/
