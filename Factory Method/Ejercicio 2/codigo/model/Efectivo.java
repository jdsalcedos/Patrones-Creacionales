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
public class Efectivo extends MetodoPago{
    
    public Efectivo(String tipo, float costo){
        super(tipo, costo);
    }

    @Override
    public String realizarPago(float costo){
        return "Realizando pago de "+this.costo+" dolares con efectivo";
    }

    @Override
    public String consultarInfo(){
        return "Este metodo es efectivo....";
    }
}
