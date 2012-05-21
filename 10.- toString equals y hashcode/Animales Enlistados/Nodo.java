public class Nodo{
        private Object valor;
        public Nodo siguiente;

		public Nodo(){}
        
        public Nodo(Object valor){
            this.valor = valor;
        }

        public void setValor(Object valor){
            this.valor = valor;
        }

        public Object getValor(){
            return valor;
        }
        
        public String toString(){
            return this.valor.toString();
        }

		public boolean equals(Object objeto){
			return this.valor.equals(objeto);
		}
    }
