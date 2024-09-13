/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import model.CreadorConcreto.DocumentoCreador;
import model.abstracto.Documento;
import model.abstracto.DocumentoFactory;
import view.VistaConsola;

/**
 *
 * @author juand
 */
public class Controlador{
    private VistaConsola vista;
    
    public Controlador(){
        vista = new VistaConsola(); 
    }

    public void run(){

        String nombre = "";
        String tipo = "";
        float size = 0;

        vista.mostrarInfo("Digite los datos del documento");

        nombre = vista.leerDatoStr("\t" + "Digite el nombre del archivo");
        tipo = vista.leerDatoStr("\t" + "Digite el tipo del archivo");
        size = vista.leerDatoFloat("\t" + "Digite el tamaño del archivo");

        DocumentoFactory fabrica = new DocumentoCreador();
        Documento doc = fabrica.crearDocumento(nombre, tipo, size);

        vista.mostrarInfo("Impresion: " + doc.imprimir());
        vista.mostrarInfo("Datos del documento: " + doc.mostrarDatos());
    }
}

