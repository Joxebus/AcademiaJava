public class Cilindro extends Circulo{
	
	private double altura;
	
	public void setAltura(double altura){
		this.altura = altura;
	}

	public double area(){
		return 2*PI*this.getRadio()*(altura+this.getRadio());
	}

	public double volumen(){
		return base()*altura;
	}

	public double base(){
		return Math.pow((PI*this.getRadio()),2);
	}
	
}
