/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author juand
 */
public class Director {

    private RobotBuilder builder;

    public Director(RobotBuilder builder) {
        this.builder = builder;
    }

    public Robot construirRobotDomestico(String marca, String nombre, int brazos, String piernas, String material) {
        return builder
                .setMarca(marca)
                .setNombre(nombre)
                .setBrazos(brazos)
                .setPiernas(piernas)
                .setMaterial(material)
                .construir();
    }

    public Robot construirRobotIndustrial(String marca, String nombre, int brazos, String piernas, String material) {
        return builder
                .setMarca(marca)
                .setNombre(nombre)
                .setBrazos(brazos)
                .setPiernas(piernas)
                .setMaterial(material)
                .construir();
    }
}
