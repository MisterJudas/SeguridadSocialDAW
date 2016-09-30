import java.util.ArrayList;
import java.util.List;

/**
 * Created by 48092788H on 30/09/2016.
 */
public class SeguridadSocialHashSet {

    private List<Persona> personasList;
    public SeguridadSocialHashSet() {
        personasList = new ArrayList<>();
    }


    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {
            personasList.add(persona);
    }


    public void bajaPersona(String dni) {
        Persona aux = null;
        for (Persona personaActual : personasList) {
            if (personaActual.getDni().equals(dni)) {
                aux = personaActual;
                break;
            }
        }
        if (aux != null) {
            personasList.remove(aux);
        }
    }


    public Persona obtenerPersonaPorDNI(String dni) {
        for (Persona persona: personasList){
            if(persona.getDni().equals(dni)){
                return persona;
            }
        }
        return null;
    }


    public Persona obtenerPersonaPorNumSS(String numSS) {
        for (Persona persona : personasList) {
            if (persona.getNumeroSeguridadSocial().equals(numSS)) {
                return persona;
            }
        }
        return null;
    }


    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual: personasList){
            if(personaActual.getSalario()>=min && personaActual.getSalario()<=max){
                aux.add(personaActual);
            }
        }
        return aux;
    }


    public List<Persona> obtenerPersonasMayoresQue(int edad){
        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual: personasList){
            if(personaActual.getEdad()>=edad){
                aux.add(personaActual);
            }
        }
        return aux;
    }


    public List<Persona> obtenerTodas(){
        for (Persona persona: personasList){
            System.out.println("Nombre de las personas: " + persona.getNombre());
        }
        return null;
    }


    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}
