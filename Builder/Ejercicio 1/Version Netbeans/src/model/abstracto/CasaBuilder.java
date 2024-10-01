/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.abstracto;

import model.Casa;

/**
 *
 * @author juand
 */
public interface CasaBuilder {

    void construirParedes();

    void construirPuertas();

    void construirTecho();

    void construirVentanas();

    void construirPiso();

    Casa obtenerCasa();
}
