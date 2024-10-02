/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.abstracto;

import model.Computador;

/**
 *
 * @author juand
 */
public interface ComputadorBuilder {

    void construirProcesador();

    void construirRam();

    void construirDiscoDuro();

    void construirTarjetaGrafica();

    Computador obtenerComputador();
}
