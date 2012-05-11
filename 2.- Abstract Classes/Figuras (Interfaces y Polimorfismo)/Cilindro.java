public class Cilindro extends Circulo{
	
	private double altura;
	
	public void setAltura(double altura){
		this.altura = altura;
	}

	public double volumen(){
		return this.area()*altura;
	}
	
}