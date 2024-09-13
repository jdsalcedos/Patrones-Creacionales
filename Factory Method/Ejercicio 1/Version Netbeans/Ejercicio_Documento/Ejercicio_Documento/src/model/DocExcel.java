/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.abstracto.Documento;
/**
 *
 * @author juand
 */
public class DocExcel extends Documento{
    
    public DocExcel(String nombre, String tipo, float size){
        super(nombre, tipo, size);
    }

    @Override
    public String imprimir(){
        return "imprimiendo documento de Excel...";
    }

    @Override
    public String mostrarDatos(){
        String res = "El nombre del documento es "+nombre+" y tiene un tamaño de "+size+" MB";
        return res;
    }
}