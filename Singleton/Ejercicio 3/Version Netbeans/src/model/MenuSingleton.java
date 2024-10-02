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
public class MenuSingleton {

    private static MenuSingleton instancia;
    private Properties properties;

    private MenuSingleton() {
        properties = new Properties();
    }

    public static MenuSingleton getInstancia() {
        if (instancia == null) {
            instancia = new MenuSingleton();
        }
        return instancia;
    }

    public void leerProperties(String propPath) throws IOException {
        properties.load(new FileInputStream(propPath));
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
