/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.abstracto.*;
import model.CreadorConcreto.*;
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

        String tipo = "";
        float costo = 0;

        vista.mostrarInfo("DATOS DEL METODO DE PAGO");

        tipo = vista.leerDatoStr("\t" + "Digite el tipo de metodo de pago");
        costo = vista.leerDatoFloat("\t" + "Digite el costo total de lo que va a comprar");

        MetodoPagoFactory fabrica = new MetodoPagoCreador();
        MetodoPago mtp = fabrica.crearMetodoPago(tipo.toLowerCase(), costo);

        vista.mostrarInfo("Pago: " + mtp.realizarPago());
        vista.mostrarInfo("Datos del metodo de pago: " + mtp.consultarInfo());
    }
}