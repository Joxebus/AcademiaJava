package mx.com.everis.beans;

import mx.com.everis.entity.UsuarioEntity;
import mx.com.everis.service.OperacionesCRUD;

public class RegistroUsuarioBean {

    private String usuario;
    private String contrasenia;
    private String nombre;
    private String email;
    private OperacionesCRUD<UsuarioEntity> crud;

    public String registrar() {
        crud = new OperacionesCRUD<UsuarioEntity>();
        crud.create(new UsuarioEntity(usuario, contrasenia, nombre, email));
        return "exito";
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
