public class Principal{

	public static void main(String... args){
		Geometria geo = new Geometria();
		Triangulo tri = new Triangulo();
		tri.setBase(12.5);
		tri.setAltura(4);

		geo.evaluarFigura(tri);

		Circulo cir = new Circulo();
		cir.setRadio(13.5);
		geo.evaluarFigura(cir);
	}
}
