/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.creadorConcreto;

import java.util.ArrayList;
import java.util.List;
import model.abstracto.Prototype;

/**
 *
 * @author juand
 */
public class ProductosGestor {
   private List<Prototype> prototipos = new ArrayList();
   
   public void addPrototype(Prototype prototipo){
       prototipos.add(prototipo);
   }
   
   public Prototype getPrototype(int index){
       return prototipos.get(index).clone();
   }
   
   public List<Prototype> getPrototypes(){
       return prototipos;
   }
}
