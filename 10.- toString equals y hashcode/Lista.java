public class Lista{
	private class Nodo(){
		Nodo siguiente;
		Object valor;
		
		Nodo(Object valor){
			this.valor = valor;
		}

		public boolean equals(Object objeto){
			return valor.equals(objeto);
		}
	}
	
	private Nodo inicio;

	public void add(Object valorAgregar){
		if(inicio == null){
			inicio = new Nodo(valorAgregar);
		}else{
			add(valorAgregar, inicio);
		}

	}

	private void add(Object valorAgregar, Nodo actual){
		if(actual.siguiente == null){
			actual.siguiente = new Nodo(valorAgregar);
		}else{
			add(valorAgregar, actual.siguiente);
		}
		
	} 

	public boolean find(Object valorBuscado){
		if(inicio == null){
			return false;
		}else{
			return find(valorBuscado, inicio);
		}
	}

	private boolean find(Object valorBuscado, Nodo actual){
		if(actual.equals(valorBuscado)){
			return true;		
		}else if(actual.siguiente == null){
			return false;
		}else{
			find(valorBuscado, actual.siguiente);
		}
	}

	public Object get(Object valorBuscado){
		if(inicio == null){
			return null;
		}else{
			return get(valorBuscado, inicio);
		}
	}

	private Object get(Object valorBuscado, Nodo actual){
		if(verificar(valorBuscado, actual)){
			return actual.getValor();		
		}else if(actual.siguiente == null){
			return null;
		}else{
			get(valorBuscado, actual.siguiente);
		}
	} 	

	public void delete(Object valorEliminar){
		if(inicio != null){
			if(verificar(valorEliminar, inicio){
				inicio = inicio.siguiente;
			}
			else{
				delete(valorEliminar, inicio);
			}
		}

	}

	private void delete(Object valorEliminar, Nodo actual){
		if(actual.siguiente != null){
			if(verificar(valorEliminar, actual.siguiente){
				actual.siguiente = actual.siguiente.siguiente;
			}else{
				delete(valorEliminar, actual.siguiente);
			}
		}
		
	}
	
	private boolean verificar(Object evaluar, Nodo actual){
		if(actual.getValor() instanceof Perro){
			return ((Perro)actual.getValor()).getNombre().equals((String)evaluar);
		}else if(actual.getValor() instanceof Persona){
			return ((Persona)actual.getValor()).getNombre().equals((String)evaluar);
		}else if(actual.getValor() instanceof Canario){
			return ((Canario)actual.getValor()).getNombre().equals((String)evaluar);
		}
		
		return false;
	}

}


