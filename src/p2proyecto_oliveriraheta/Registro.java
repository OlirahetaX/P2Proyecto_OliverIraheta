
package p2proyecto_oliveriraheta;

import java.io.Serializable;


public class Registro implements Serializable{
    private String usuario,password,rol="Registro";

    public Registro(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Registro() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return  usuario ;
    }
    
}
