package mx.com.everis.beans;

public class LoginBean {

    private String usuario;
    private String contrasenia;

    public String validar() {
        if (usuario.equals("everis") && contrasenia.equals("academia")) {
            System.out.println("Exito");
            return "exito";
        } else {
            System.out.println("Error");
            return "error";
        }
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


}
