/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author juand
 */
public class VistaConsola {
    private Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }
    
    public void mostrarDatos(String msj){
        System.out.println(msj);
    }
    
    public String leerDatoStr(String msj){
        String dato = "";
        System.out.println(msj);
        dato = sc.nextLine();
        return dato;
    }
    public int leerDatoInt(String msj){
        int dato;
        System.out.println(msj);
        dato = sc.nextInt();
        return dato;
    }
}
