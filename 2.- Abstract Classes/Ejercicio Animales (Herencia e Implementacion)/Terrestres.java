public abstract class Terrestres implements Animales{
	private String nombre;

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

		public void comer(){
		System.out.println("Estoy comiendo y me llamo "+nombre);
	}

	public void dormir(){
		System.out.println("Estoy durmiendo y me llamo "+nombre);
	}

}
