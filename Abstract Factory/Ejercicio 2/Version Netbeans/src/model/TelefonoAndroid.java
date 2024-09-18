/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.fabricaAbstracta.DispositivosInfo;

/**
 *
 * @author juand
 */
public class TelefonoAndroid implements DispositivosInfo {
    
    @Override
    public String consultaDispositivo(){
        return "Este dispositivo en un TELEFONO";
    }
    
    @Override
    public String consultaSO(){
        return "Usa el sistema operativo ANDROID";
    }
}
