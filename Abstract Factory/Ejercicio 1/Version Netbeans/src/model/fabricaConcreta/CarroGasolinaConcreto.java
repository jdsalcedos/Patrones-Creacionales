/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.fabricaConcreta;

import model.CarroGasolina;
import model.fabricaAbstracta.VehiculosData;
import model.fabricaAbstracta.VehiculosFactory;

/**
 *
 * @author juand
 */
public class CarroGasolinaConcreto implements VehiculosFactory{
    
    @Override
    public VehiculosData crearData(){
        return new CarroGasolina();
    }
}
