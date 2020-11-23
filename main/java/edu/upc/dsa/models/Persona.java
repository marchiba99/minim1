package edu.upc.dsa.models;
import edu.upc.dsa.util.RandomUtils;
import java.util.List;
public class Persona {

    String id;
    String nombre;
    String apellido;
    int edad;
    String salud;
    List<Muestra> muestras;

    public Persona(String id, String nombre, String apellido, int edad, String salud) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salud = salud;
    }

    public List<Muestra> getMuestras() {
        return muestras;
    }

    public void setMuestras(List<Muestra> muestras) {
        this.muestras = muestras;
    }

    public Persona(String id) {
        this.id = RandomUtils.getId();
    }


    public Persona(List<Muestra> muestras) {
        this.muestras = muestras;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salud='" + salud + '\'' +
                ", muestras=" + muestras +
                '}';
    }
}


