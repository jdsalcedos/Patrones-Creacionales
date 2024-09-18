/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.fabricaConcreta;

import model.TelefonoIOS;
import model.fabricaAbstracta.DispositivosFactory;
import model.fabricaAbstracta.DispositivosInfo;

/**
 *
 * @author juand
 */
public class TelefonoIOSConcreto implements DispositivosFactory{
    
    @Override
    public DispositivosInfo crearData(){
        return new TelefonoIOS();
    }
}
