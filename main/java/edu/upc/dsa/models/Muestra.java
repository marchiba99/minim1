package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Muestra {

    String id;
    String clinico;
    String persona;
    String fecha;
    String lab;

    public Muestra(String id, String clinico, String persona, String fecha, String lab) {
        this.id = id;
        this.clinico = clinico;
        this.persona = persona;
        this.fecha = fecha;
        this.lab = lab;
    }

    public Muestra(String id) {
        this.id = RandomUtils.getId();
    }

    public String getId() {
        return RandomUtils.getId();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClinico() {
        return clinico;
    }

    public void setClinico(String clinico) {
        this.clinico = clinico;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    @Override
    public String toString() {
        return "Muestra{" +
                "id='" + id + '\'' +
                ", clinico='" + clinico + '\'' +
                ", persona='" + persona + '\'' +
                ", fecha='" + fecha + '\'' +
                ", lab='" + lab + '\'' +
                '}';
    }
}
