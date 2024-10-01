/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import model.creadorConcreto.UsuarioGestor;
import view.VistaConsola;

/**
 *
 * @author juand
 */
public class Controller {

    private VistaConsola vista;
    private List<Usuario> usuarios;

    public Controller() {
        vista = new VistaConsola();
        usuarios = new ArrayList();
    }

    public void Run() {

        Usuario user = new Usuario("pedroSaenz", "pedros@correo.com", "pedro1234");

        UsuarioGestor gestor = new UsuarioGestor();
        gestor.addPrototype(user);
        vista.mostrarDatos(gestor.getPrototypes().toString());
        
         int op = menu();

        while (op != 3) {

            if (op == 1) {
                Usuario userClon = (Usuario) gestor.getPrototype(0);
                
                String newUsername = vista.leerDatoStr("Digite el nombre de usuario del nuevo usuario: ");
                String newEmail = vista.leerDatoStr("Digite el correo del nuevo usuario: ");
                String newPassword = vista.leerDatoStr("Digite la contrasena del nuevo usuario: ");
                
                userClon.setUsername(newUsername);
                userClon.setEmail(newEmail);
                userClon.setPassword(newPassword);

                usuarios.add(userClon);
            } else if (op == 2) {
                vista.mostrarDatos(usuarios.toString());
            }
            op = menu();
        }
    }

    private int menu() {
        return vista.leerDatoInt("1. Crear nuevo usuario"
                + "\n2. Ver todos los usuarios"
                + "\n3. Salir");
    }

}
