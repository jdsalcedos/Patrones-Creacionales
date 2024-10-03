/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Director;
import model.Robot;
import model.RobotBuilder;
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
        RobotBuilder builder = new RobotBuilder();
        Director director = new Director(builder);

        Robot robot_domestico = director.construirRobotDomestico("Tesla", "Domestiquin", 2, "Cortas", "Acolchado");
        Robot robot_industrial = director.construirRobotIndustrial("StarkIndustries", "Levanta costales 3000", 4, "no tiene", "Aluminio reforzado");

        vista.mostrarDatos(robot_domestico.toString());
        vista.mostrarDatos(robot_industrial.toString());
    }

}
