/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.creadorConcreto;

import model.Casa;
import model.abstracto.CasaBuilder;

/**
 *
 * @author juand
 */
public class CasaLadrilloBuilder implements CasaBuilder {

    private Casa casa;

    public CasaLadrilloBuilder() {
        this.casa = new Casa();
    }

    @Override
    public void construirParedes() {
        casa.setParedes("Paredes de ladrillo");
    }

    @Override
    public void construirVentanas() {
        casa.setVentanas("Ventanas de vidrio");
    }

    @Override
    public void construirPuertas() {
        casa.setPuertas("Puertas de madera");
    }

    @Override
    public void construirTecho() {
        casa.setTecho("Techo de teja");
    }

    @Override
    public void construirPiso() {
        casa.setPiso("Piso de concreto");
    }

    @Override
    public Casa obtenerCasa() {
        return this.casa;
    }
}