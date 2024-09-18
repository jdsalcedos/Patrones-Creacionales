/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.abstracto.Mensajeria;

/**
 *
 * @author juand
 */
public class Correo extends Mensajeria{

    public Correo(String nombreContacto, String datosContacto, String tipo, float sizeArchivo) {
        super(nombreContacto, datosContacto, tipo, sizeArchivo);
    }
    
    @Override
    public String mostrarDatosMensaje(){
        return "El correo destino es " +datosContacto+ ", y el tamano del archivo es "+sizeArchivo+" MB";
    }
    @Override
    public String mostrarDatosContacto(){
        return "El nombre del contacto es "+nombreContacto;
    }
    
    
}
