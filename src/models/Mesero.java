package models;

public class Mesero extends Persona {

    private int numoficio;
    private String rol;

    public Mesero() {
    }

    public Mesero(int numoficio, String rol, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.numoficio = numoficio;
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getNumoficio() {
        return numoficio;
    }

    public void setNumoficio(int numoficio) {
        this.numoficio = numoficio;
    }

}
