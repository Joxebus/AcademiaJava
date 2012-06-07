package mx.com.everis.beans;

import javax.faces.context.FacesContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

import mx.com.everis.entity.UsuarioEntity;
import mx.com.everis.service.OperacionesCRUD;

public class RegistroBean {
	
	private UsuarioEntity nuevoUsuario;
	private ApplicationContext context;
	private OperacionesCRUD<UsuarioEntity> crud;	
	
	public String registrar(){
		context = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
		nuevoUsuario = (UsuarioEntity) context.getBean("usuarioRegistro");		
		crud.create(nuevoUsuario);	
		return "registro correcto";
	}

	public void setCrud(OperacionesCRUD<UsuarioEntity> crud) {
		this.crud = crud;
	}
	

}
