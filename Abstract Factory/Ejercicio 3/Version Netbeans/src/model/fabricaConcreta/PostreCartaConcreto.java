/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.fabricaConcreta;

import model.PostreCarta;
import model.fabricaAbstracta.InfoPedidos;
import model.fabricaAbstracta.ServicioRestauranteFactory;

/**
 *
 * @author juand
 */
public class PostreCartaConcreto implements ServicioRestauranteFactory{
    
    @Override
    public InfoPedidos crearPedido(){
        return new PostreCarta();
    }
}
