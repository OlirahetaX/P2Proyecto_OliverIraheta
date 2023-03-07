package p2proyecto_oliveriraheta;

import java.io.Serializable;
import java.util.ArrayList;

public class Maestro implements Serializable{

    private int id,sueldo;
    private String nombre,profesion,usuario,password,rol= "maestro";
    private ArrayList<Clase> listaClases = new ArrayList();

    public Maestro() {
    }

    public Maestro(int id, int sueldo, String nombre, String profesion, String usuario, String password) {
        this.id = id;
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.profesion = profesion;
        this.usuario = usuario;
        this.password = password;
    }

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    public void setListaClases(ArrayList<Clase> listaClases) {
        this.listaClases = listaClases;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
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
        return  nombre ;
    }
    
}
