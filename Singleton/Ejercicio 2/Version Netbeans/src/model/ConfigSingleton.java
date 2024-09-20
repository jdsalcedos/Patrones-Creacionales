/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juand
 */
public class ConfigSingleton {
    
    private static ConfigSingleton instancia;
    private Properties properties;

    private ConfigSingleton() {
        properties = new Properties();
    }
    
    public static ConfigSingleton getInstancia(){
        if(instancia == null){
            instancia = new ConfigSingleton();
        }
        return instancia;
    }
    
    public void leerProperties(String propPath) throws IOException{
        try {
            properties.load(new FileInputStream(propPath));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getProperty(String key){
        return properties.getProperty(key);
    }
}
