package mx.com.everis.entity;

public class ProductoEntity implements PersistibleInterface{

	private long id;
	private String nombre;
	private double precio;
	
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
	
	
	
	
	
	
	

}
