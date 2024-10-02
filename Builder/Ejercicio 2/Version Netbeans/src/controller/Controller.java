/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Computador;
import model.Director;
import model.creadorConcreto.PcGamingBuilder;
import model.creadorConcreto.PcOficinaBuilder;
import view.VistaConsola;
import model.abstracto.ComputadorBuilder;
import model.creadorConcreto.PcPortatilBuilder;

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
        while (op != 4) {
            if (op == 1) {
                ComputadorBuilder builder = new PcOficinaBuilder();
                Director director = new Director(builder);
                director.construirPc();
                Computador pc = builder.obtenerComputador();
                vista.mostrarDatos(pc.toString());
            } else if (op == 2) {
                ComputadorBuilder builder = new PcGamingBuilder();
                Director director = new Director(builder);
                director.construirPc();
                Computador pc = builder.obtenerComputador();
                vista.mostrarDatos(pc.toString());
            } else if (op == 3) {
                ComputadorBuilder builder = new PcPortatilBuilder();
                Director director = new Director(builder);
                director.construirPc();
                Computador pc = builder.obtenerComputador();
                vista.mostrarDatos(pc.toString());
            }
            op = menu();
        }
    }

    public int menu() {
        return vista.leerDatoInt("\tMENU"
                + "\n1. Crear computador de oficina"
                + "\n2. Crear computador de gaming"
                + "\n3. Crear computador portatil"
                + "\n4. Salir"
                + "\n....Seleccione una opcion....");
    }

}
