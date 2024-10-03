/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author juand
 */
public class Robot {

    private String marca;
    private String nombre;
    private int brazos;
    private String piernas;
    private String material;

    public Robot(String marca, String nombre, int brazos, String piernas, String material) {
        this.marca = marca;
        this.nombre = nombre;
        this.brazos = brazos;
        this.piernas = piernas;
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public int getBrazos() {
        return brazos;
    }

    public String getPiernas() {
        return piernas;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "\tDATOS ROBOT"
                + "\n Marca: " + marca
                + "\n Nombre: " + nombre
                + "\n # Brazos: " + brazos
                + "\n Piernas: " + piernas
                + "\n Material: " + material;
    }
}
