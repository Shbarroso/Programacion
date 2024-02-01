package map;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppPersona {

    static HashMap<String, Persona> personaHashMap;
    static List<Persona> personaList;
    public static void main(String[] args) {
        personaHashMap = new HashMap<>();
        personaList = new ArrayList<>();


        Persona persona1 = new Persona("hola", "1234567");
        addPersonaLista(persona1);
        addPersonaHasMap(persona1);
    }

    public static boolean addPersonaLista(Persona persona) {
        if (!existePersonaLista(persona)) {
            personaList.add(persona);
        }
        return true;
    }


    public static boolean existePersonaLista(Persona persona){
        if ( personaList.isEmpty()){
            return false;
        }
        if (!personaList.contains(persona)){
            return false;
        }

        return true;
    }



    public static  boolean addPersonaHasMap(Persona persona){
        if (!existePersonahashMap(persona)) {
            personaHashMap.put(persona.getDni(), persona);
        }
        return true;
    }

    public static boolean existePersonahashMap(Persona persona){
        if ( personaHashMap.isEmpty()) {
            return false;
        }
        if (!personaHashMap.containsKey(persona.getDni())) {
            return false;
        }

        return true;
    }

}
