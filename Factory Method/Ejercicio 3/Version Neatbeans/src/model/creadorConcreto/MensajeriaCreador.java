/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.creadorConcreto;

import model.*;
import model.abstracto.Mensajeria;
import model.abstracto.MensajeriaFactory;

/**
 *
 * @author juand
 */
public class MensajeriaCreador implements MensajeriaFactory {
    
    @Override
    public Mensajeria crearMensajeria(String nombreContacto, String datosContacto, String tipo, float sizeArchivo){
        if(tipo.equals("whatsapp")){
            return new Whatsapp(nombreContacto, datosContacto, tipo, sizeArchivo);
        }else if(tipo.equals("sms")){
            return new SMS(nombreContacto, datosContacto, tipo, sizeArchivo);
        }else if(tipo.equals("correo")){
            return new Correo(nombreContacto, datosContacto, tipo, sizeArchivo);
        }
        return null;
    }
}
