/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.CreadorConcreto;

import model.abstracto.Documento;
import model.abstracto.DocumentoFactory;
import model.*;

/**
 *
 * @author juand
 */
public class DocumentoCreador implements DocumentoFactory{

    @Override
    public Documento crearDocumento(String nombre, String tipo, float size){
        if(tipo.equals("word")){
            return new DocWord(nombre, tipo, size);
        } else if(tipo.equals("pdf")){
            return new DocPDF(nombre, tipo, size);
        } else if(tipo.equals("excel")){
            return new DocExcel(nombre, tipo, size);
        }
        return null;
    }
}
