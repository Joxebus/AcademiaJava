package mx.com.everis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTOS")
public class ProductoEntity implements PersistibleInterface{

	
	private long id;
	
	private String nombre;
	private double precio;
	private int cantidad;
	
	@Override
	public String toString() {
		return id+" "+nombre+" "+precio;
	}
	
	// Toda clase persistente debe tener el Constructor vacío
	public ProductoEntity() { }

	public ProductoEntity(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}	
	

}
