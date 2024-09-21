/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import model.ConfigSingleton;
import view.VistaConsola;

/**
 *
 * @author juand
 */
public class Controller {
    
    private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }
    
    public void run() throws IOException{
        ConfigSingleton conf = ConfigSingleton.getInstancia();
        conf.leerProperties("src\\model\\config.properties");
        vista.mostrarInfo(conf.getProperty("Entrada1"));
        vista.mostrarInfo(conf.getProperty("Entrada2"));
        vista.mostrarInfo(conf.getProperty("Fuerte1"));
        vista.mostrarInfo(conf.getProperty("Fuerte2"));
        vista.mostrarInfo(conf.getProperty("Postre1"));
        vista.mostrarInfo(conf.getProperty("Postre2"));
        vista.mostrarInfo(conf.getProperty("Bebida1"));
        vista.mostrarInfo(conf.getProperty("Bebida2"));
    }
    
    
}
