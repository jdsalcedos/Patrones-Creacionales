/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.abstracto.MetodoPago;

/**
 *
 * @author juand
 */
public class TarjetaDebito extends MetodoPago{
    
    public TarjetaDebito(String tipo, float costo){
        super(tipo, costo);
    }

    @Override
    public String realizarPago(){
        return "Realizando pago de "+costo+" dolares con tarjeta debito";
    }

    @Override
    public String consultarInfo(){
        return "Este metodo es tarjeta debito....";
    }
}

