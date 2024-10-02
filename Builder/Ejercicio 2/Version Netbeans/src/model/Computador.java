/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author juand
 */
public class Computador {

    private String procesador;
    private String ram;
    private String discoDuro;
    private String tarjetaGrafica;

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return "Procesador: " + procesador + "\nMemoria RAM: " + ram
                + "\nAlmacenamiento: " + discoDuro + "\nTarjeta Grafica: " + tarjetaGrafica;
    }
}
