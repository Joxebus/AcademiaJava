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

	public String toString(){
		return "Soy un animal de tipo "+this.getClass().getName();
	}

	public boolean equals(Object objeto){
		if( this == objeto ){
			return true;
		}else if(objeto instanceof Terrestres){
			Terrestres animal = (Terrestres)objeto;
			return this.nombre.equals(animal.getNombre());			
		}else{ return false; }		

	}

}
