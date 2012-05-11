public class Persona{

	private String nombre;	
	private Sexo sexo;

	public Persona(){
		this("Noname");
	}
	
	public Persona(String nombre){
		this.nombre = nombre;
	}


	public void setSexo(Sexo sexo){
		this.sexo = sexo;
	}

	public void setSexo(String sexo){
		this.sexo = (validarSexo(sexo)) ? Sexo.FEMENINO : Sexo.MASCULINO;
	}

	public boolean validarSexo(String sexo){
		return sexo.toUpperCase().charAt(0)=='F';
	}

	public Sexo getSexo(){
		return sexo;
	}
	
	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
}
