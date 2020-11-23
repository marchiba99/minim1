package edu.upc.dsa;

import edu.upc.dsa.models.Muestra;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CovidManagerTest {
private CovidManager t = null;
    @Before
    public void setUp() throws Exception {
        this.t= CovidManagerImpl.getInstance();
        t.AddPersona("1", "pepe", "muñoz", 36 , "A");
        t.AddPersona("2", "jose", "garcia", 20 , "D");
        t.AddMuestra("3", "medicos", "1", "24 septiembre", "lab1");
        t.AddMuestra("4", "medicos2", "2", "13 septiembre", "lab2");
    }

    @After
    public void tearDown() throws Exception {
      t = null;

    }

    @Test
    public void Idpers() {
        t.AddPersona("1", "pepe", "muñoz", 36 , "A");
        assertEquals("1",CovidManagerImpl.getInstance().GetId());
    }

    @Test
    public Muestra GetMuestra(String id) {
        Muestra muestra = this.GetMuestra(id);
        return muestra;

    }
}