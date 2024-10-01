/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author juand
 */
public class Casa {

    private String paredes;
    private String puertas;
    private String ventanas;
    private String techo;
    private String piso;

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public void setVentanas(String ventanas) {
        this.ventanas = ventanas;
    }

    public void setTecho(String techo) {
        this.techo = techo;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "Paredes: " + paredes + "\nPuertas: "
                + puertas + "\nVentanas: " + ventanas
                + "\nTecho: " + techo + "\nPiso: " + piso;
    }
}
