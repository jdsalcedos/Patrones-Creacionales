/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.abstracto;

/**
 *
 * @author juand
 */
public interface MensajeriaFactory {
    
    Mensajeria crearMensajeria(String nombreContacto, String datosContacto, String tipo, float sizaArchivo);
    
}
