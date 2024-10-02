/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.abstracto.ComputadorBuilder;

/**
 *
 * @author juand
 */
public class Director {

    private ComputadorBuilder computadorBuilder;

    public Director(ComputadorBuilder computadorBuilder) {
        this.computadorBuilder = computadorBuilder;
    }

    public void construirCasa() {
        computadorBuilder.construirProcesador();
        computadorBuilder.construirRam();
        computadorBuilder.construirDiscoDuro();
        computadorBuilder.construirTarjetaGrafica();
    }
}
