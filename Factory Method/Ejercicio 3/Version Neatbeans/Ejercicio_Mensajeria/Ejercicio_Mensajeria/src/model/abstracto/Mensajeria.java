/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.abstracto;

/**
 *
 * @author juand
 */
public abstract class Mensajeria {
    
    protected String nombreContacto;
    protected String datosContacto;
    protected String tipo;
    protected float sizeArchivo;

    public Mensajeria(String nombreContacto, String datosContacto, String tipo, float sizeArchivo) {
        this.nombreContacto = nombreContacto;
        this.datosContacto = datosContacto;
        this.tipo = tipo;
        this.sizeArchivo = sizeArchivo;
    }

    
    
    public abstract String mostrarDatosMensaje();
    public abstract String mostrarDatosContacto();
    
}
