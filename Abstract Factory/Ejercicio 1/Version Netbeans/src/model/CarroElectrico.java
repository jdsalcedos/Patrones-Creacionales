/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.fabricaAbstracta.VehiculosData;

/**
 *
 * @author juand
 */
public class CarroElectrico implements VehiculosData{
    @Override
    public String consultaVehiculo(){
        return "Este vehiculo es un CARRO";
    }
    
    @Override
    public String verTipoCombustible(){
        return "Este carro usa una BATERIA";
    }
}

