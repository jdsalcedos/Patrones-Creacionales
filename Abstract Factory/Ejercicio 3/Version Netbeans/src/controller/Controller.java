/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.fabricaConcreta.*;
import view.VistaConsola;
import model.fabricaAbstracta.InfoPedidos;
import model.fabricaAbstracta.ServicioRestauranteFactory;

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
                    plato(new AlmuerzoCartaConcreto());
                    plato(new PostreCartaConcreto());
                    break;
                case 2:
                    plato(new AlmuerzoEjecutivoConcreto());
                    plato(new PostreEjecutivoConcreto());
                    break;
                case 3:
                    plato(new AlmuerzoCaseritoConcreto());
                    plato(new PostreCaseritoConcreto());
                    break;
                case 4:
                    System.exit(0);
                 default :
                	 vista.mostrarInformacion(".....Digite una opcion valida....");
            }
            vista.mostrarInformacion("");
        }while(op!=5);
    }
    
    public void plato(ServicioRestauranteFactory platos){
        InfoPedidos info = platos.crearPedido();
        vista.mostrarInformacion(info.consultaPedido());  
        vista.mostrarInformacion(info.consultaTipoPlato());
        
    }
    
    public int  menu(){
        String menu = 
                "MENU DE OPCIONES\n"
                + "1.   Ordenar un combo Carta. \n"
                + "2.   Ordenar un combo Ejecutivo. \n"
                + "3.   Ordenar un combo Caserito. \n"
                + "4.   Cerrar el programa. \n"
                + "Seleccion opcion...";
        return vista.leerDatoEntero(menu);
    }
    
}
