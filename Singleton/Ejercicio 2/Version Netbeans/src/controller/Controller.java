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
        vista.mostrarInfo(conf.getProperty("idioma"));
        vista.mostrarInfo(conf.getProperty("colorFondo"));
        vista.mostrarInfo(conf.getProperty("preferencias"));
    }
    
    
}
