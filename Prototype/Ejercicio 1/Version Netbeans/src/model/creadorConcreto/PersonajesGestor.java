/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.creadorConcreto;

import java.util.HashMap;
import java.util.Map;
import model.abstracto.Prototype;

/**
 *
 * @author juand
 */
public class PersonajesGestor {
    private Map<String, Prototype> prototipos = new HashMap();
    
    public void addPrototype(String llave, Prototype prototipo){
        prototipos.put(llave, prototipo);
    }
    
    public Prototype getPrototype(String llave){
        return  prototipos.get(llave).clone();
    }
}
