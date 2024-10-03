/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author juand
 */
public class RobotBuilder {

    private String marca;
    private String nombre;
    private int brazos;
    private String piernas;
    private String material;

    public RobotBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public RobotBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public RobotBuilder setBrazos(int brazos) {
        this.brazos = brazos;
        return this;
    }

    public RobotBuilder setPiernas(String piernas) {
        this.piernas = piernas;
        return this;
    }

    public RobotBuilder setMaterial(String material) {
        this.material = material;
        return this;
    }

    public Robot construir() {
        return new Robot(marca, nombre, brazos, piernas, material);
    }

}
