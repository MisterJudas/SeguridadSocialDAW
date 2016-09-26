/**
 * Created by usu26 on 23/09/2016.
 */
//personaMapDni.keySet(); Coger todas las keys
//personaMapDni.values(); Coger todos los values
//personaMapDni.remove(dni); Borrar atributo

import java.util.HashMap;
import java.util.Map;

public class SeguridadSocialHashMap {
    private Map<String, Persona> personaMapDni = new HashMap<>();
    private Map<String, Persona> personaMapSs = new HashMap<>();

    public void altaPersona(Persona persona) {
        if (!personaMapDni.containsKey(persona.getDni()) &&
                !personaMapSs.containsKey(persona.getNumeroSeguridadSocial())) {
            personaMapDni.put(persona.getDni(), persona);
            personaMapSs.put(persona.getNumeroSeguridadSocial(), persona);
        }
    }

    public Persona obtenerPersonaPorDNI(String dni){
        return personaMapDni.get(dni);
    }

    public Persona obtenerPersonaPorSs(String numSS){
        return personaMapSs.get(numSS);
    }





}
