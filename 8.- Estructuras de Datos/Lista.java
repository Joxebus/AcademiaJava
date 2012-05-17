public class Lista{
	private class Nodo(){
		Nodo siguiente;
		Object valor;
		
		Nodo(Object valor){
			this.valor = valor;
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

}


