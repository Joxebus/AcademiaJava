package mx.com.sintelti.domain;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EVENTOS")
public class EventoEntity implements PersistibleInterface {
	
	/**
	 * 
	 */
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String titulo;
	private Date fecha;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return id+" Evento: "+titulo;
	}

}
