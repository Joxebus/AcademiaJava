
public class Lista<T> {

    private Nodo<T> inicio;

    public void add(T valorAgregar) {
        if (inicio == null) {
            inicio = new Nodo<T>(valorAgregar);
        } else {
            add(valorAgregar, inicio);
        }

    }

    private void add(T valorAgregar, Nodo<T> actual) {
        if (actual.siguiente == null) {
            actual.siguiente = new Nodo<T>(valorAgregar);
        } else {
            add(valorAgregar, actual.siguiente);
        }

    }
/*
	public boolean find(T valorBuscado){
		if(inicio == null){
			return false;
		}else{
			return find(valorBuscado, inicio);
		}
	}

	private boolean find(T valorBuscado, Nodo<T> actual){
		if(actual.equals(valorBuscado)){
			return true;		
		}else if(actual.siguiente == null){
			return false;
		}else{
			return find(valorBuscado, actual.siguiente);
		}
	}

	
	public T get(T valorBuscado){
		if(inicio == null){
			return null;
		}else{
			return get(valorBuscado, inicio);
		}
	}

	
	private T get(T valorBuscado, Nodo<T> actual){
		if(actual.equals(valorBuscado)){
			return actual.getValor();		
		}else if(actual.siguiente == null){
			return null;
		}else{
			return get(valorBuscado, actual.siguiente);
		}
	} 	

	public void delete(T valorEliminar){
		if(inicio != null){
			if(inicio.equals(valorEliminar)){
				inicio = inicio.siguiente;
			}
			else{
				delete(valorEliminar, inicio);
			}
		}

	}

	private void delete(T valorEliminar, Nodo<T> actual){
		if(actual.siguiente != null){
			if(actual.siguiente.equals(valorEliminar)){
				actual.siguiente = actual.siguiente.siguiente;
			}else{
				delete(valorEliminar, actual.siguiente);
			}
		}
		
	}
	
	public void list(){
		if(inicio != null){	
			list(inicio);
		}
	}

	private void list(Nodo<T> actual){
		System.out.println(actual);
		if(actual.siguiente != null){			
			list(actual.siguiente);
		}
	}
*/
}


