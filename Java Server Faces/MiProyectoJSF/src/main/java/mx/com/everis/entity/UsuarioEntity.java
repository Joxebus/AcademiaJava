package mx.com.everis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIOS")
public class UsuarioEntity implements PersistibleInterface {

	private long id;
	private String usuario;
	private String contrasenia;
	private String nombre;
	private String email;
	
	public UsuarioEntity() {
		
	}
	
	public UsuarioEntity(String usuario, String contrasenia, String nombre,
			String email) {
		super();
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.email = email;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
