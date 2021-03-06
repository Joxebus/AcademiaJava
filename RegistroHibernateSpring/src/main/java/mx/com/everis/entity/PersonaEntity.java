package mx.com.everis.entity;


import java.util.List;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("persona")
@Scope("prototype")
public class PersonaEntity implements PersistibleInterface, Comparable<PersonaEntity> {
	
	private long id;
	private String nombre;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private int edad;
	
	@Autowired
	private List<AutoEntity> autos;
	
	@PostConstruct
	public void init(){
		if(autos.size() > 0){
			autos.remove(0);
		}
	}
	
	@Override
	public String toString() {
		return id+"\t"+nombre+" "+apellidoPaterno+" "+apellidoMaterno;
	}
	
	public void addAuto(AutoEntity auto){ autos.add(auto); }
	
	public PersonaEntity() {
		
	}
	
	public PersonaEntity(String entrada[]) {
		this.nombre = entrada[0];
		this.apellidoPaterno = entrada[1];
		this.apellidoMaterno = entrada[2];		
		//this.edad = Integer.parseInt(entrada[3]);
	}
	
	public PersonaEntity(String nombre, String apellidoPaterno,
			String apellidoMaterno) {
		super();
		this.nombre = nombre;
		this.apellidoMaterno = apellidoMaterno;
		this.apellidoPaterno = apellidoPaterno;
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
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<AutoEntity> getAutos() {
		return autos;
	}

	public void setAutos(List<AutoEntity> autos) {
		this.autos = autos;
	}

	public int compareTo(PersonaEntity otraPersona) {
		return this.nombre.compareTo(otraPersona.getNombre());
	}

	

}
