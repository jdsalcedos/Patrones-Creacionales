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
public class PcOficinaBuilder implements ComputadorBuilder {

    private Computador pc;

    public PcOficinaBuilder() {
        this.pc = new Computador();
    }

    @Override
    public void construirProcesador() {
        pc.setProcesador("i5 10th gen");
    }

    @Override
    public void construirRam() {
        pc.setRam("16 Gb");
    }

    @Override
    public void construirDiscoDuro() {
        pc.setDiscoDuro("512 Gb");
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
