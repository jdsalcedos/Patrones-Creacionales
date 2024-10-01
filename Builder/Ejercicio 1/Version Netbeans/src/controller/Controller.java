/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Casa;
import model.Director;
import model.abstracto.CasaBuilder;
import model.creadorConcreto.CasaLadrilloBuilder;
import model.creadorConcreto.CasaModernaBuilder;
import view.VistaConsola;

/**
 *
 * @author juand
 */
public class Controller {

    VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
        int op = menu();
        while (op != 3) {
            if (op == 1) {
                CasaBuilder builder = new CasaModernaBuilder();
                Director director = new Director(builder);
                director.construirCasa();
                Casa casa = builder.obtenerCasa();
                vista.mostrarDatos(casa.toString());
            } else if (op == 2) {
                CasaBuilder builder = new CasaLadrilloBuilder();
                Director director = new Director(builder);
                director.construirCasa();
                Casa casa = builder.obtenerCasa();
                vista.mostrarDatos(casa.toString());
            }
            op = menu();
        }
    }

    public int menu() {
        return vista.leerDatoInt("\tMENU"
                + "\n1. Crear una casa moderna"
                + "\n2. Crear una casa de ladrillo"
                + "\n3. Salir"
                + "\n....Seleccione una opcion....");
    }

}
