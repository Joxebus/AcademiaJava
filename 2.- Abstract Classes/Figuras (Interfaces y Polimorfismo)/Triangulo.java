public class Triangulo implements Figura{
	private double base;
	private double altura;
	
	public double area(){
		return base*altura/2;		
	}

	public double perimetro(){
		return base*3;		
	}

	public void setBase(double base){
		this.base = base;
	}

	public void setAltura(double altura){
		this.altura = altura;
	}

	public double getBase(){
		return base;
	}
	
	public double getAltura(){
		return altura;
	}
}
