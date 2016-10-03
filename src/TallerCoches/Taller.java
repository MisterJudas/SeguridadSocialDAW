package TallerCoches;

import SeguridadSocial.Persona;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Taller {
    private Map<Persona, Coche> reparaciones =
            new TreeMap<>(Comparator.comparing(Persona::getNumSeguridadSocial));

    public Coche registrarReparacion(Persona persona, Coche coche){
    }

    public Coche obtenerCoche(Persona persona){
    }

    public Set<Persona> obtenerClientes(){
    }
}
