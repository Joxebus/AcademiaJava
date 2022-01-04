package mx.com.everis.main;

import javax.swing.JOptionPane;

import mx.com.everis.entity.ProductoEntity;
import mx.com.everis.service.OperacionesCRUD;

public class Tienda {

    public static void main(String[] args) {
        OperacionesCRUD<ProductoEntity> crud = new OperacionesCRUD<ProductoEntity>();
        ProductoEntity producto = new ProductoEntity();
        //producto.setId(3);
        //producto = crud.read(producto);
        String nombre = JOptionPane.showInputDialog("Igrese el nombre del producto");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Igrese el precio del producto " + nombre));
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        crud.create(producto);

        System.out.println(":::::::: Listando productos ::::::::");
        for (ProductoEntity p : crud.list(producto)) {
            System.out.println(p);
        }
    }
	
	/*
	 * for(int i=3; i>0; i--){
			String nombre = JOptionPane.showInputDialog("Igrese el nombre del producto");
			double precio = Double.parseDouble(JOptionPane.showInputDialog("Igrese el precio del producto "+nombre));
			producto = new ProductoEntity(nombre, precio);
			crud.create(producto);
		}
	 */


}
