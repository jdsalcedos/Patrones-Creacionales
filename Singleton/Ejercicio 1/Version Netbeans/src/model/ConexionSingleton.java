/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author juand
 */
public class ConexionSingleton {

    private static ConexionSingleton instancia = null;

    private ConexionSingleton() {}

    public static ConexionSingleton getInstancia() {

        if (instancia == null) {
            instancia = new ConexionSingleton();
        }
        return instancia;
    }
    
    private String url = "direccion.base.datos";
    private String username = "localhost";
    private String password = "1234";
    
    public void infoDB(){
        System.out.println("DATOS B.D: \nURL: "+ url +"\nUSUARIO: "+ username +"\nPASSWORD: "+password);
    }
    
}
