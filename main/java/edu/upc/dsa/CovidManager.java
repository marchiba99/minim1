package edu.upc.dsa;
import edu.upc.dsa.models.Muestra;
import edu.upc.dsa.models.Persona;

public interface CovidManager {

    public void AddPersona(String id, String nombre, String apellido, int edad, String salut);

    public void AddMuestra(String id, String clinico, String persona, String fecha, String lab);

    public Muestra GetMuestra(String id);

    public void SendMuestra(Muestra muestra); //envia al laboratorio la muestra

    public String GetId(Persona persona);

    public String GetSalud(Persona persona);

    public void ColaByFecha(Muestra muestra); // queue orden apor orden de llegada
}
