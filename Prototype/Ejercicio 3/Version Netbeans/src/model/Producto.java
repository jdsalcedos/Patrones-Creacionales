/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.abstracto.Prototype;
/**
 *
 * @author juand
 */
public class Producto implements Prototype {
    private String nombre;
    private float precio;
    private String categoria;

    public Producto(String nombre, float precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    @Override
    public Prototype clone(){
        return new Producto(this.nombre, this.precio, this.categoria);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString(){
        return "\tPRODUCTO\n"+
                "Nombre: " + nombre +
                "\nCategoria: " + categoria +
                "\nPrecio: " + precio;
    }
    
}
