/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.abstracto.*;
import model.creadorConcreto.MensajeriaCreador;
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
        String nombreContacto = "";
        String datosContacto = "";
        String tipo = "";
        float sizeArchivo = 0;

        vista.mostrarInfo("DATOS DE MENSAJERIA");

        nombreContacto = vista.leerDatoStr("\t" + "Digite el nombre del contacto");
        tipo = vista.leerDatoStr("\t" + "Digite el tipo de mensajeria (sms, whatsapp o correo)");
        datosContacto = vista.leerDatoStr("\t" + "Digite los datos correspondientes al tipo de mensajeria");
        sizeArchivo = vista.leerDatoFloat("\t" + "Tamano del archivo a enviar");

        MensajeriaFactory fabrica = new MensajeriaCreador();
        Mensajeria msjria = fabrica.crearMensajeria(nombreContacto, datosContacto, tipo.toLowerCase(), sizeArchivo);

        vista.mostrarInfo(msjria.mostrarDatosContacto());
        vista.mostrarInfo(msjria.mostrarDatosMensaje());
    }
}
