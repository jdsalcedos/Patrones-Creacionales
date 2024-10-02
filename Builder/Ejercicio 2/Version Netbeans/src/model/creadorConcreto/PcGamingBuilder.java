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
public class PcGamingBuilder implements ComputadorBuilder {

    private Computador pc;

    public PcGamingBuilder() {
        this.pc = new Computador();
    }

    @Override
    public void construirProcesador() {
        pc.setProcesador("i7 13th gen");
    }

    @Override
    public void construirRam() {
        pc.setRam("16 Gb");
    }

    @Override
    public void construirDiscoDuro() {
        pc.setDiscoDuro("1 Tb");
    }

    @Override
    public void construirTarjetaGrafica() {
        pc.setTarjetaGrafica("RTX 3060");
    }

    @Override
    public Computador obtenerComputador() {
        return this.pc;
    }
}
