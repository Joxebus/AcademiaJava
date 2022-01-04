package mx.com.everis.beans;

import java.util.List;

import mx.com.everis.entity.ProductoEntity;
import mx.com.everis.service.OperacionesCRUD;

public class MantenimientoProductosBean {

    private ProductoEntity producto;
    private OperacionesCRUD<ProductoEntity> crud;

    private void limpiar() {
        producto.setCantidad(0);
        producto.setNombre("");
        producto.setPrecio(0);
    }

    public String registrarProducto() {
        crud.create(producto);
        limpiar();
        return "producto registrado";
    }

    public List<ProductoEntity> getListaProductos() {
        return crud.list(producto);
    }

    public void setProducto(ProductoEntity producto) {
        this.producto = producto;
    }

    public void setCrud(OperacionesCRUD<ProductoEntity> crud) {
        this.crud = crud;
    }


}
