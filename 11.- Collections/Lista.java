public class Lista {

    private Nodo inicio;

    public void add(Object valorAgregar) {
        if (inicio == null) {
            inicio = new Nodo(valorAgregar);
        } else {
            add(valorAgregar, inicio);
        }

    }

    private void add(Object valorAgregar, Nodo actual) {
        if (actual.siguiente == null) {
            actual.siguiente = new Nodo(valorAgregar);
        } else {
            add(valorAgregar, actual.siguiente);
        }

    }

    public boolean find(Object valorBuscado) {
        if (inicio == null) {
            return false;
        } else {
            return find(valorBuscado, inicio);
        }
    }

    private boolean find(Object valorBuscado, Nodo actual) {
        if (actual.equals(valorBuscado)) {
            return true;
        } else if (actual.siguiente == null) {
            return false;
        } else {
            return find(valorBuscado, actual.siguiente);
        }
    }

    public Object get(Object valorBuscado) {
        if (inicio == null) {
            return null;
        } else {
            return get(valorBuscado, inicio);
        }
    }

    private Object get(Object valorBuscado, Nodo actual) {
        if (actual.equals(valorBuscado)) {
            return actual.getValor();
        } else if (actual.siguiente == null) {
            return null;
        } else {
            return get(valorBuscado, actual.siguiente);
        }
    }

    public void delete(Object valorEliminar) {
        if (inicio != null) {
            if (inicio.equals(valorEliminar)) {
                inicio = inicio.siguiente;
            } else {
                delete(valorEliminar, inicio);
            }
        }

    }

    private void delete(Object valorEliminar, Nodo actual) {
        if (actual.siguiente != null) {
            if (actual.siguiente.equals(valorEliminar)) {
                actual.siguiente = actual.siguiente.siguiente;
            } else {
                delete(valorEliminar, actual.siguiente);
            }
        }

    }

    public void list() {
        if (inicio != null) {
            list(inicio);
        }
    }

    private void list(Nodo actual) {
        System.out.println(actual);
        if (actual.siguiente != null) {
            list(actual.siguiente);
        }
    }
}


