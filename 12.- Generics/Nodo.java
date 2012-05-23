public class Nodo<T>{
        private T valor;
        public Nodo siguiente;

		public Nodo(){}
        
        public Nodo(T valor){
            this.valor = valor;
        }

        public void setValor(T valor){
            this.valor = valor;
        }

        public T getValor(){
            return valor;
        }
        
        public String toString(){
            return this.valor.toString();
        }

		public boolean equals(Object objeto){
			return this.valor.equals(objeto);
		}
    }
