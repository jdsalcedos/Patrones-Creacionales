/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.abstracto.CasaBuilder;

/**
 *
 * @author juand
 */
public class Director {

    private CasaBuilder casaBuilder;

    public Director(CasaBuilder casaBuilder) {
        this.casaBuilder = casaBuilder;
    }

    public void construirCasa() {
        casaBuilder.construirParedes();
        casaBuilder.construirVentanas();
        casaBuilder.construirPuertas();
        casaBuilder.construirTecho();
        casaBuilder.construirPiso();
    }
}
