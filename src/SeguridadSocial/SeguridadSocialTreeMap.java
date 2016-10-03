package SeguridadSocial;

import java.util.Collection;
import java.util.stream.Collectors;

import java.util.TreeMap;

/**
 * Created by 48092788H on 30/09/2016.
 */
public class SeguridadSocialTreeMap {

    TreeMap<String, Persona> personaTreeMapDni = new TreeMap<String, Persona>();
    TreeMap<String, Persona> personaTreeMapSs = new TreeMap<String, Persona>();


    public void altaPersona(Persona persona) {

        if (!personaTreeMapDni.containsKey(persona.getDni()) &&
                !personaTreeMapSs.containsKey(persona.getNumeroSeguridadSocial())) {
            personaTreeMapDni.put(persona.getDni(), persona);
            personaTreeMapSs.put(persona.getNumeroSeguridadSocial(), persona);
        }
    }

    public Persona obtenerPersonaPorDNI(String dni){
        return personaTreeMapDni.get(dni);
    }

    public Persona obtenerPersonaPorSs(String numSS){
        return personaTreeMapSs.get(numSS);
    }

    public void bajaPersona(String dni){
        personaTreeMapDni.remove(dni);
    }

    public Collection<Persona> obtenerTodas(){
        for(String dni:personaTreeMapDni.keySet()){
            System.out.println(dni);
        }
        return personaTreeMapDni.values();
    }

    public Collection<Persona> obtenerPersonasMayoresQue(int edad){
        return personaTreeMapDni.values().stream().filter(persona -> persona.getEdad()>edad).collect(Collectors.toList());
    }

    public Collection<Persona> obtenerPersonasRangoSalarial(double min, double max){
        return personaTreeMapDni.values().stream().filter(persona -> persona.getSalario()>=min && persona.getSalario()<=max).collect(Collectors.toList());
    }

}