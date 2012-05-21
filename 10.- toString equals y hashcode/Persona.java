class Persona{

	private String nombre;	
	
	public Persona(){}
		
	public Persona(String nombre){
		this.nombre = nombre;
	}


	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int hashCode(){
		int hash=0;
		for (char letra : nombre.toCharArray()){
			hash += letra*11;
		}
		return hash;
	}

	public String toString(){
		return "Hola mi nombre es "+this.nombre;
	}

	public boolean equals(Object objeto){
		if( this == objeto ){
			return true;
		}else if(objeto instanceof Persona){
			Persona personaComparen = (Persona)objeto;
			// return this.nombre.equals(personaComparen.getNombre());
			char nombreEvaluado[] = personaComparen.getNombre().toCharArray();
			char nombreOriginal[] = this.nombre.toCharArray();
			if(nombreEvaluado.length != nombreOriginal.length){
				return false;
			}else{
				for(int i=0; i<nombreEvaluado.length; i++){
					if(nombreEvaluado[i]!=nombreOriginal[i])
						return false;
				}
				return true;
			}
		}else{ return false; }
		

	}
}
