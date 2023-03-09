package p2proyecto_oliveriraheta;

import java.io.Serializable;
import java.util.ArrayList;

public class Alumno implements Serializable {

    private String cuenta;
    private String nombre, carrera, usuario, password;
    private final String rol  = "Alumno";
    private ArrayList<Clase> ClasesCursadas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String cuenta, String nombre, String carrera, String usuario, String password) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.carrera = carrera;
        this.usuario = usuario;
        this.password = password;
    }
    

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
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

    public ArrayList<Clase> getClasesCursadas() {
        return ClasesCursadas;
    }

    public void setClasesCursadas(ArrayList<Clase> ClasesCursadas) {
        this.ClasesCursadas = ClasesCursadas;
    }

    @Override
    public String toString() {
        return  nombre ;
    }

}
