package edu.upc.dsa;

import edu.upc.dsa.models.Muestra;
import edu.upc.dsa.models.Persona;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CovidManagerImpl implements CovidManager {
    private static CovidManager instance;
    static final Logger logger = Logger.getLogger(CovidManagerImpl.class.getName());
    private Queue<Muestra> ColaByFecha;
    private HashMap<String, Persona> map;
    private ArrayList<Muestra> ColaLab;
    private LinkedList<Muestra> MuestraUsuarios;

    public CovidManagerImpl() {

        this.map = new HashMap<>();
        this.ColaLab = new ArrayList<Muestra>();
        this.MuestraUsuarios = new LinkedList<>();
        Persona persona;
        Muestra muestra;
    }
    public static CovidManager getInstance(){
        if(instance==null) instance = new CovidManagerImpl();
        return instance;
    }


    @Override
    public void AddPersona(String id, String nombre, String apellido, int edad, String salut) {
        map.put(nombre, new Persona(id,nombre,apellido,edad,salut));
    }
    public void AddMuestra(String id, String clinico, String persona, String fecha, String lab) {
        MuestraUsuarios.add(new Muestra(id,clinico,persona,fecha,lab));
    }

    @Override
    public Muestra GetMuestra(String id) {
        Muestra muestra = this.GetMuestra(id);
        logger.info("getmuestra(" + id + ")");
        return muestra;
    }

    @Override
    public void SendMuestra(Muestra muestra) {
        ColaLab.add(muestra);
    }

    @Override
    public String GetId(Persona persona) {
        return persona.getId();
    }


    public String GetSalud(Persona persona) {
        String sal;
        sal = persona.getSalud();
        return sal;
    }

    @Override
    public void ColaByFecha(Muestra muestra) {
        ColaByFecha.add(muestra);
    }
}