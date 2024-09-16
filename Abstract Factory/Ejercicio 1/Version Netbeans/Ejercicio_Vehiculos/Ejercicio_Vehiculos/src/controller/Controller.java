/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.fabricaAbstracta.VehiculosData;
import model.fabricaAbstracta.VehiculosFactory;
import model.fabricaConcreta.*;
import view.VistaConsola;

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
                    vehiculo(new CarroElectricoConcreto());
                    break;
                case 2:
                    vehiculo(new CarroGasolinaConcreto());
                    break;
                case 3:
                    vehiculo(new CamionetaElectricoConcreto());
                    break;
                case 4:
                    vehiculo(new CamionetaGasolinaConcreto());
                    break;
                case 5:
                    System.exit(0);
                 default :
                	 vista.mostrarInformacion(".....Digite una opcion valida....");
            }
            vista.mostrarInformacion("");
        }while(op!=5);
    }
    
    public void vehiculo(VehiculosFactory vehiculos){
        VehiculosData data = vehiculos.crearData();
        vista.mostrarInformacion(data.consultaVehiculo());  
        vista.mostrarInformacion(data.verTipoCombustible());
        
    }
    
    public int  menu(){
        String menu2 = 
                "MENU DE OPCIONES\n"
                + "1.   Crear un carro electrico. \n"
                + "2.   Crear un carro a gasolina. \n"
                + "3.   Crear una camioneta electrica. \n"
                + "4.   Crear una camioneta a gasolina. \n"
                + "5.   Cerrar el programa. \n"
                + "Seleccion opcion...";
        return vista.leerDatoEntero(menu2);
    }
    
}
