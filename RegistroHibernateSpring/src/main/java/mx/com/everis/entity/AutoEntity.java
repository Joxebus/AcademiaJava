package mx.com.everis.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("auto")
@Scope("prototype")
public class AutoEntity implements PersistibleInterface {
	
	private long id;
	private String marca;
	private String modelo;	
		
	
	@Override
	public String toString() {
		return id+" "+marca+" "+modelo;
	}
	
	public AutoEntity() {	}	
	
	public AutoEntity(String datos[]) {
		this.marca = datos[0];
		this.modelo = datos[1];
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
