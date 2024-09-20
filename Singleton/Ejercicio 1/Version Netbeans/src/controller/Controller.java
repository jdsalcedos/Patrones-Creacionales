/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.ConexionSingleton;
import view.VistaConsola;

/**
 *
 * @author juand
 */
public class Controller {
    
    private VistaConsola vista;
    
    public Controller(){
        vista = new VistaConsola();
    }
    
    public void run(){
        ConexionSingleton cnx = ConexionSingleton.getInstancia();      
        cnx.infoDB();
        vista.mostrarInformacion("\nConectando a la base de datos....");

    }
}
