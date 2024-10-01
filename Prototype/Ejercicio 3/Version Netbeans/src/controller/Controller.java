/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Producto;
import model.creadorConcreto.ProductosGestor;
import view.VistaConsola;

/**
 *
 * @author juand
 */
public class Controller {

    private VistaConsola vista;
    private List<Producto> productos;
    
    public Controller() {
        productos = new ArrayList();
        vista = new VistaConsola();
    }

    public void Run() {

        Producto productoBase = new Producto("arroz", 15000, "harinas");

        ProductosGestor gestor = new ProductosGestor();
        gestor.addPrototype(productoBase);

        vista.mostrarDatos(gestor.getPrototypes().toString() + "\n");
        
        int opcion = menu();
        
        while (opcion != 3) {
            if (opcion == 1) {
                Producto productoClon = (Producto) gestor.getPrototype(0);

                String nombreNuevo = vista.leerDatoStr("Ingrese el nombre del producto nuevo:");
                float precioNuevo = vista.leerDatoFloat("Ingrese el precio del producto nuevo:");
                String categoriaNuevo = vista.leerDatoStr("Ingrese el categoria del producto nuevo:");

                productoClon.setNombre(nombreNuevo);
                productoClon.setPrecio(precioNuevo);
                productoClon.setCategoria(categoriaNuevo);
                
                productos.add(productoClon);
            } else if (opcion == 2) {
                vista.mostrarDatos(productos.toString());

            }
            opcion = menu();
        }

    }
    
    public int menu(){
       return  vista.leerDatoInt("1.   Crear un producto nuevo. \n"
                    + "2.   Mostrar todos los productos. \n"
                    + "3.   Cerrar el programa. \n"
                    + "Seleccion opcion...");
    }

}
