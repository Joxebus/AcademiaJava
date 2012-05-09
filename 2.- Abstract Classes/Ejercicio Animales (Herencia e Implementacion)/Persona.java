class Persona implements Animales{

	private String nombre;
	int edad;
	
	
	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void desplazarse(){
		System.out.println("Estoy comiendo y me llamo "+getNombre());
	}

	public void emitirSonido(){
		System.out.println("Estoy durmiendo y me llamo "+getNombre());
	}

	public void comer(){
		System.out.println("Estoy comiendo y me llamo "+nombre);
	}

	public void dormir(){
		System.out.println("Estoy durmiendo y me llamo "+nombre);
	}
}
