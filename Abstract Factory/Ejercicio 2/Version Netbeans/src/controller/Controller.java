/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.fabricaConcreta.*;
import view.VistaConsola;
import model.fabricaAbstracta.DispositivosFactory;
import model.fabricaAbstracta.DispositivosInfo;

/**
 *
 * @author juand
 */
public class Controller {

	private VistaConsola vista;
	
    public Controller() {
    	vista = new VistaConsola();
	}
    
    public void run() {
    	int op = 0;
        do{
            op=menu();
            switch(op){
                case 1:
                    dispositivo(new TelefonoIOSConcreto());
                    break;
                case 2:
                    dispositivo(new TelefonoAndroidConcreto());
                    break;
                case 3:
                    dispositivo(new TabletAndroidConcreto());
                    break;
                case 4:
                    dispositivo(new TabletIOSConcreto());
                    break;
                case 5:
                    System.exit(0);
                 default :
                	 vista.mostrarInformacion(".....Digite una opcion valida....");
            }
            vista.mostrarInformacion("");
        }while(op!=5);
    }
    
    public void dispositivo(DispositivosFactory dispositivos){
        DispositivosInfo data = dispositivos.crearData();
        vista.mostrarInformacion(data.consultaDispositivo());  
        vista.mostrarInformacion(data.consultaSO());
        
    }
    
    public int  menu(){
        String menu = 
                "MENU DE OPCIONES\n"
                + "1.   Crear un telefono Apple. \n"
                + "2.   Crear un telefono Samsung. \n"
                + "3.   Crear una tablet Samsung. \n"
                + "4.   Crear una tablet Apple. \n"
                + "5.   Cerrar el programa. \n"
                + "Seleccion opcion...";
        return vista.leerDatoEntero(menu);
    }
    
}