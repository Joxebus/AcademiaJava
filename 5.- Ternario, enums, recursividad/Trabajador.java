public class Trabajador extends Persona{
	
	private int noEmpleado;
	
	public Trabajador(){
		this(0, "Noname");
	}
	
	public Trabajador(int noEmpleado, String nombre){
		super(nombre);
		this.noEmpleado = noEmpleado;		
	}
	
	public void setNoEmpleado(int noEmpleado){
		this.noEmpleado = noEmpleado;
	}
	
	public int getNoEmpleado(){
		return noEmpleado;
	}
}
