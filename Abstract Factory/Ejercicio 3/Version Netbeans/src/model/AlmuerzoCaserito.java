/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.fabricaAbstracta.InfoPedidos;

/**
 *
 * @author juand
 */
public class AlmuerzoCaserito implements InfoPedidos {
    
    @Override
    public String consultaPedido(){
        return "Entrega: ALMUERZO";
    }
    
    @Override
    public String consultaTipoPlato(){
        return "Tipo: CASERITO";
    }
}
