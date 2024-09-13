/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.CreadorConcreto;

import model.abstracto.MetodoPago;
import model.abstracto.MetodoPagoFactory;
import model.*;

/**
 *
 * @author juand
 */
public class MetodoPagoCreador implements MetodoPagoFactory{
    
    @Override
    public MetodoPago crearMetodoPago(String tipo, float costo){
        if(tipo.equals("paypal")){
            return new Paypal(tipo, costo);
        } else if(tipo.equals("tarjeta de debito")){
            return new TarjetaDebito(tipo, costo);
        } else if(tipo.equals("efectivo")){
            return new Efectivo(tipo, costo);
        }
        return null;
    }
}

