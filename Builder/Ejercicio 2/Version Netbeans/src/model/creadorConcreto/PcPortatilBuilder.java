/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.creadorConcreto;

import model.Computador;
import model.abstracto.ComputadorBuilder;

/**
 *
 * @author juand
 */
public class PcPortatilBuilder implements ComputadorBuilder {

    private Computador pc;

    public PcPortatilBuilder() {
        this.pc = new Computador();
    }

    @Override
    public void construirProcesador() {
        pc.setProcesador("i5 13th gen");
    }

    @Override
    public void construirRam() {
        pc.setRam("8 Gb");
    }

    @Override
    public void construirDiscoDuro() {
        pc.setDiscoDuro("1 Tb");
    }

    @Override
    public void construirTarjetaGrafica() {
        pc.setTarjetaGrafica("Integrada");
    }

    @Override
    public Computador obtenerComputador() {
        return this.pc;
    }
}
