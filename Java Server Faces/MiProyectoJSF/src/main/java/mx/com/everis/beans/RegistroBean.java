package mx.com.everis.beans;

import mx.com.everis.entity.UsuarioEntity;
import mx.com.everis.service.OperacionesCRUD;

public class RegistroBean {

    private UsuarioEntity nuevoUsuario;
    private OperacionesCRUD<UsuarioEntity> crud;

    public String registrar() {
        crud.create(nuevoUsuario);
        return "registro correcto";
    }

    public void setNuevoUsuario(UsuarioEntity nuevoUsuario) {
        this.nuevoUsuario = nuevoUsuario;
    }

    public void setCrud(OperacionesCRUD<UsuarioEntity> crud) {
        this.crud = crud;
    }


}
