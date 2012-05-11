public class Persona{

	public Persona(){
		this("Noname");
	}
	
	public Persona(String nombre){
		this.nombre = nombre;
	}

	private String nombre;	
	
	
	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
}
