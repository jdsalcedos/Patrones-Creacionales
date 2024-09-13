/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.abstracto;

/**
 *
 * @author juand
 */
public abstract class MetodoPago{

    protected String tipo;
    protected float costo;
    
    public MetodoPago(String tipo, float costo){
        this.tipo = tipo;
        this.costo = costo;
    }

    public abstract String realizarPago(float costo);
    public abstract String consultarInfo();

}